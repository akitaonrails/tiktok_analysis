package Y;

import X.AbstractC497160Jec;
import X.C1090000eTG;
import X.C1161920gLG;
import X.C1515210pX5;
import X.C157V;
import X.C1C7U;
import X.C2188811AlT;
import X.C293501Bt;
import X.C497120JeY;
import X.EnumC1094630eaj;
import X.InterfaceC497190Jef;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.network.combine.LiveCombineResponseItem;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRecInfoPtySetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m14.e;
import m14.l;
import m14.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class ACallableS60S1100000_7 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS60S1100000_7 aCallableS60S1100000_7) throws JSONException {
        Map map;
        Object obj;
        C157V hostClientAiService;
        C1090000eTG c1090000eTGO3;
        C1C7U.LIZ("LiveFeedRecInfoManager@aada.uploadRecInfo2Pty$1");
        String str = LiveFeedRecInfoPtySetting.INSTANCE.value().recoInfoKey;
        String str2 = aCallableS60S1100000_7.s0;
        Long l = (Long) aCallableS60S1100000_7.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('-');
        sbLIZ.append(l);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
        Object obj2 = null;
        if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(EnumC1094630eaj.DEFAULT, "feed_service_sort", strLIZIZ)) != null) {
            obj2 = c1090000eTGO3.LIZJ;
        }
        if ((obj2 instanceof Map) && (map = (Map) obj2) != null && (obj = map.get(str)) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", ((Long) aCallableS60S1100000_7.l1).longValue());
            jSONObject.put("rec_info", obj);
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null && (hostClientAiService = iHostAction.getHostClientAiService()) != null) {
                hostClientAiService.LJIJI("livesdk_cus_rec_info", jSONObject);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveFeedRecInfoManager@aada.uploadRecInfo2Pty$1");
        return unit;
    }

    public static final Object call$1(ACallableS60S1100000_7 aCallableS60S1100000_7) throws JSONException {
        C157V hostClientAiService;
        C1C7U.LIZ("LiveRecoInfoManager@8a3b.uploadRecInfo2Pty$1");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", ((Long) aCallableS60S1100000_7.l1).longValue());
        jSONObject.put("rec_info", aCallableS60S1100000_7.s0);
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null && (hostClientAiService = iHostAction.getHostClientAiService()) != null) {
            hostClientAiService.LJIJI("livesdk_cus_rec_info", jSONObject);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploadRecInfo2Pty: eventParams = ");
        sbLIZ.append(jSONObject);
        Integer numValueOf = Integer.valueOf(Log.d("LiveRecoInfoManager", C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("LiveRecoInfoManager@8a3b.uploadRecInfo2Pty$1");
        return numValueOf;
    }

    public static final Object call$2(ACallableS60S1100000_7 aCallableS60S1100000_7) {
        AbstractC497160Jec abstractC497160Jec;
        LiveCombineResponseItem liveCombineResponseItem;
        Object objFromJson;
        C1C7U.LIZ("LiveCombineReqeust@92d7.tryResolveResponse$1");
        ConcurrentHashMap<String, AbstractC497160Jec<?, INPUT_DATA>> concurrentHashMap = ((C497120JeY) aCallableS60S1100000_7.l1).LJ;
        if (concurrentHashMap != 0 && (abstractC497160Jec = (AbstractC497160Jec) concurrentHashMap.get(aCallableS60S1100000_7.s0)) != null && ((C497120JeY) aCallableS60S1100000_7.l1).LJIILIIL.containsKey(aCallableS60S1100000_7.s0) && (liveCombineResponseItem = ((C497120JeY) aCallableS60S1100000_7.l1).LJIILIIL.get(aCallableS60S1100000_7.s0)) != null) {
            if (liveCombineResponseItem.getRespCode() == 200 && (objFromJson = GsonProtectorUtils.fromJson(C293501Bt.LIZ(), liveCombineResponseItem.getResp(), abstractC497160Jec.LJII())) != null && Intrinsics.LJFF(objFromJson.getClass(), abstractC497160Jec.LJIIIIZZ()) && abstractC497160Jec.LJIIIZ(objFromJson)) {
                InterfaceC497190Jef interfaceC497190Jef = ((C497120JeY) aCallableS60S1100000_7.l1).LJIIL.get(aCallableS60S1100000_7.s0);
                if (interfaceC497190Jef != null) {
                    interfaceC497190Jef.onSuccess(objFromJson);
                }
            } else {
                ((C497120JeY) aCallableS60S1100000_7.l1).LIZ(2, aCallableS60S1100000_7.s0);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCombineReqeust@92d7.tryResolveResponse$1");
        return unit;
    }

    public static final Object call$3(ACallableS60S1100000_7 aCallableS60S1100000_7) {
        String str;
        Pair pair;
        String str2;
        String str3;
        Uri uri;
        C1C7U.LIZ("LiveCombineReqeust@92d7.checkCombine$tasks$1$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        C1515210pX5.LIZLLL().getClass();
        sbLIZ.append(C1515210pX5.LIZJ());
        sbLIZ.append(aCallableS60S1100000_7.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String host = null;
        e eVarLIZ = l.LJ().LIZ(new m(strLIZIZ, null));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkCombine: get domain for ");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", finalUrl is ");
        if (eVarLIZ != null) {
            str = eVarLIZ.LIZ;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (eVarLIZ != null && (str2 = eVarLIZ.LIZ) != null && str2.length() != 0) {
            String str4 = aCallableS60S1100000_7.s0;
            C497120JeY c497120JeY = (C497120JeY) aCallableS60S1100000_7.l1;
            if (eVarLIZ != null) {
                str3 = eVarLIZ.LIZ;
            } else {
                str3 = null;
            }
            c497120JeY.getClass();
            if (!TextUtils.isEmpty(str3) && str3 != null && (uri = UriProtector.parse(str3)) != null) {
                host = uri.getHost();
            }
            pair = new Pair(str4, host);
        } else {
            pair = new Pair(aCallableS60S1100000_7.s0, null);
        }
        C1C7U.LIZIZ("LiveCombineReqeust@92d7.checkCombine$tasks$1$1");
        return pair;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACallableS60S1100000_7(X.C497120JeY r2, X.C497120JeY<INPUT_DATA> r3, java.lang.String r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 2 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS60S1100000_7.<init>(X.0JeY, java.lang.String, int):void");
    }

    public ACallableS60S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
