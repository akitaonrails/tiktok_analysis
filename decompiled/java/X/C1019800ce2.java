package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ce2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019800ce2 extends AbstractC1019770cdz {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        JSONObject jSONObject;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Context context;
        String containerID;
        AwemeRawAd awemeRawAd;
        String string;
        Context context2;
        String containerID2;
        InterfaceC1019810ce3 interfaceC1019810ce3 = (InterfaceC1019810ce3) xBaseParamModel;
        String func = interfaceC1019810ce3.getFunc();
        if (func == null) {
            func = "";
        }
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        try {
            String tag = interfaceC1019810ce3.getTag();
            if (tag == null) {
                tag = "";
            }
            String label = interfaceC1019810ce3.getLabel();
            if (label == null) {
                label = "";
            }
            Map<String, Object> extParam = interfaceC1019810ce3.getExtParam();
            if (extParam != null) {
                jSONObject = new JSONObject(extParam);
            } else {
                jSONObject = new JSONObject();
            }
            Boolean hasAdInfo = interfaceC1019810ce3.getHasAdInfo();
            if (hasAdInfo != null) {
                zBooleanValue = hasAdInfo.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Boolean boolIsLive = interfaceC1019810ce3.isLive();
            if (boolIsLive != null) {
                zBooleanValue2 = boolIsLive.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            if (zBooleanValue) {
                Object creativeId = interfaceC1019810ce3.getCreativeId();
                if (creativeId == null || (string = creativeId.toString()) == null) {
                    string = "";
                }
                String logExtra = interfaceC1019810ce3.getLogExtra();
                if (logExtra == null) {
                    logExtra = "";
                }
                String groupId = interfaceC1019810ce3.getGroupId();
                if (groupId == null) {
                    groupId = "";
                }
                if (TextUtils.isEmpty(string)) {
                    C2382909Vj.LIZ(completionBlock, -1, "empty creativeId", null, 4);
                } else {
                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                    c1020020ceOLIZ.LIZ = tag;
                    c1020020ceOLIZ.LIZIZ = label;
                    c1020020ceOLIZ.LIZJ = string;
                    c1020020ceOLIZ.LJIIIIZZ(logExtra);
                    c1020020ceOLIZ.LIZLLL = groupId;
                    c1020020ceOLIZ.LJI(jSONObject);
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        context2 = interfaceC634840OvC.getContext();
                    } else {
                        context2 = null;
                    }
                    c1020020ceOLIZ.LJIIJ(context2);
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(tag, label, string, logExtra, groupId);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        c1022820ciuLJ.LIZJ(jSONObject.opt(next), next);
                    }
                    c1022820ciuLJ.LJIIIIZZ();
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID2 = interfaceC634840OvC2.getContainerID();
                    } else {
                        containerID2 = null;
                    }
                    completionBlock.onSuccess((InterfaceC1019780ce0) C1909107dp.LIZJ(InterfaceC1019780ce0.class, containerID2), "");
                }
            } else if (tag.length() > 0 && label.length() > 0 && zBooleanValue2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys2 = jSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    Object objOpt = jSONObject.opt(next2);
                    if (objOpt != null) {
                        linkedHashMap.put(next2, objOpt);
                    }
                }
                C1019110ccv.LIZIZ.LJIJ(tag, label, linkedHashMap);
            } else if (tag.length() > 0 && label.length() > 0 && c1019830ce5LIZ != null) {
                C1020020ceO c1020020ceOLIZ2 = C1020030ceP.LIZ();
                c1020020ceOLIZ2.LIZ = tag;
                c1020020ceOLIZ2.LIZIZ = label;
                c1020020ceOLIZ2.LIZLLL(Long.valueOf(c1019830ce5LIZ.LIZ));
                c1020020ceOLIZ2.LJIIIIZZ(c1019830ce5LIZ.LIZIZ);
                c1020020ceOLIZ2.LJII(Long.valueOf(c1019830ce5LIZ.LIZJ));
                c1020020ceOLIZ2.LJI(jSONObject);
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    context = interfaceC634840OvC3.getContext();
                } else {
                    context = null;
                }
                c1020020ceOLIZ2.LJIIJ(context);
                C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ(tag, label, String.valueOf(c1019830ce5LIZ.LIZ), c1019830ce5LIZ.LIZIZ, String.valueOf(c1019830ce5LIZ.LIZJ));
                Iterator<String> itKeys3 = jSONObject.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    c1022820ciuLJ2.LIZJ(jSONObject.opt(next3), next3);
                }
                c1022820ciuLJ2.LJIIIIZZ();
                if (Intrinsics.LJFF(tag, "draw_ad") && Intrinsics.LJFF(label, "click")) {
                    Aweme aweme = c1019830ce5LIZ.LJIIL;
                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                        C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                        UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                        Long creativeId2 = awemeRawAd.getCreativeId();
                        String logExtra2 = awemeRawAd.getLogExtra();
                        new AwS630S0100000_16(c1019830ce5LIZ, 66);
                        c2201701BEy.getClass();
                        C2201701BEy.LIZ("click", clickTrackUrlList, creativeId2, logExtra2);
                    }
                    JSONObjectProtectorUtils.getString(jSONObject, "refer");
                }
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((InterfaceC1019780ce0) C1909107dp.LIZJ(InterfaceC1019780ce0.class, containerID), "");
            } else {
                C2382909Vj.LIZ(completionBlock, -1, "empty tag or label", null, 4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
            C2382909Vj.LIZ(completionBlock, -1, "unknown error", null, 4);
        }
        C1440005kM.LIZ(new C0T4N(func, interfaceC1019810ce3.toJSON()));
    }
}
