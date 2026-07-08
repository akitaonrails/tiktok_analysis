package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ddp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058110ddp implements InterfaceC1066840dru {
    public Aweme LIZ;
    public AnchorCommonStruct LIZIZ;
    public String LIZJ;

    @Override // X.InterfaceC1066840dru
    public final int LIZLLL() {
        return R.raw.icon_calendar_star_fill;
    }

    @Override // X.InterfaceC1066840dru
    public final String LJII() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final UrlModel getIconUrl() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZ() {
        String keyword;
        List listLJJLIIIJILLIZJL;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keyword, new String[]{"|"}, 0, 6)) == null) {
            return null;
        }
        return (String) C360560EBq.LIZ(listLJJLIIIJILLIZJL);
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZIZ() {
        String keyword;
        List listLJJLIIIJILLIZJL;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(keyword, new String[]{"|"}, 0, 6)) == null) {
            return null;
        }
        return (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL);
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1066840dru clone() {
        C1058110ddp c1058110ddp = new C1058110ddp();
        c1058110ddp.LIZJ = this.LIZJ;
        c1058110ddp.LIZ = this.LIZ;
        c1058110ddp.LIZIZ = this.LIZIZ;
        return c1058110ddp;
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1392590mLJ LJIIIIZZ() {
        return C1065370dpX.LIZ(this);
    }

    @Override // X.InterfaceC1066840dru
    public final AnchorCommonStruct LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final Aweme getAweme() {
        return this.LIZ;
    }

    public static String LJIIIZ(String str) throws IOException {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
        String str3 = (String) pairLIZJ.first;
        if (str3 != null && str3.equals("aweme://webDialog") && (str2 = (String) pairLIZJ.second) != null && str2.equals("/eventDetail")) {
            return (String) linkedHashMap.get("event_id");
        }
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final void LIZJ(C2344009Gk c2344009Gk) throws JSONException, IOException {
        AwemeRawAd awemeRawAd;
        String schema;
        String aid;
        Activity activityLIZIZ;
        Aweme aweme;
        Long creativeId;
        String logExtra;
        Long groupId;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        String strLJJLIIIJ;
        String strLJIJ;
        String str;
        List<AnchorCommonStruct> anchors;
        Integer numValueOf;
        Activity activityLIZIZ2;
        Activity activityLIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ2)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(R.string.m25);
                c1389890mGx.LJIIJJI();
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        Activity activityLIZ2 = null;
        String str2 = "";
        if (anchorCommonStruct != null) {
            Aweme aweme2 = this.LIZ;
            if (aweme2 != null && (anchors = aweme2.getAnchors()) != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (AnchorCommonStruct anchorCommonStruct2 : anchors) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (anchorCommonStruct2.getType() == EnumC1430380nKG.LIVE_EVENT.getTYPE() && (numValueOf = Integer.valueOf(i2)) != null) {
                            arrayList.add(numValueOf);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            jSONObject.put("live_event_pos", strLJJLIIIJ);
            Aweme aweme3 = this.LIZ;
            if (aweme3 != null) {
                strLJIJ = C1017070cZd.LJIJ(aweme3);
            } else {
                strLJIJ = null;
            }
            jSONObject.put("is_author", Intrinsics.LJFF(strLJIJ, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()) ? 1 : 0);
            jSONObject.put("live_event_id", LJIIIZ(anchorCommonStruct.getSchema()));
            if (!TextUtils.isEmpty(anchorCommonStruct.getExtra())) {
                try {
                    JSONObject jSONObject2 = new JSONObject(anchorCommonStruct.getExtra());
                    if (jSONObject2.optBoolean("is_paid_event", false)) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str = "1";
                    }
                    jSONObject.put("is_free_event", str);
                    jSONObject.put("live_event_type", jSONObject2.optString("live_event_type", ""));
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next, "");
            if (C703302op.LIZ(strOptString)) {
                c2344009Gk.LJFF(next, strOptString);
            }
        }
        Aweme aweme4 = this.LIZ;
        if (aweme4 != null) {
            awemeRawAd = aweme4.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("live_anchor", "refer");
        c1022820ciuLIZLLL.LJII();
        C1065370dpX.LIZIZ(this, this.LIZJ, this.LIZ, c2344009Gk);
        AnchorCommonStruct anchorCommonStruct3 = this.LIZIZ;
        if (anchorCommonStruct3 != null && (schema = anchorCommonStruct3.getSchema()) != null) {
            String strLJIIIZ = LJIIIZ(schema);
            Bundle bundle = new Bundle();
            bundle.putFloat("bundle_dialog_screen_size", 0.95f);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("&live_event_enter_from=anchor&group_id=");
            Aweme aweme5 = this.LIZ;
            if (aweme5 == null || (aid = aweme5.getAid()) == null) {
                aid = "";
            }
            sbLIZ.append(aid);
            C786410Ut5.LJJJI("bundle_url_extra_param", C2188811AlT.LIZIZ(sbLIZ), bundle);
            C786410Ut5.LJJJI("bundle_Hybrid_Dialog_Fragment_from_label", "live_event_from_anchor_maker", bundle);
            Aweme aweme6 = this.LIZ;
            if (aweme6 != null && aweme6.isAd() && (aweme = this.LIZ) != null && aweme.getAwemeRawAd() != null) {
                C596450NaN c596450NaN = C596440NaM.LIZ;
                JSONObject jSONObject3 = new JSONObject();
                Aweme aweme7 = this.LIZ;
                if (aweme7 != null && (awemeRawAd4 = aweme7.getAwemeRawAd()) != null) {
                    creativeId = awemeRawAd4.getCreativeId();
                } else {
                    creativeId = null;
                }
                jSONObject3.put("creative_id", creativeId);
                Aweme aweme8 = this.LIZ;
                if (aweme8 != null && (awemeRawAd3 = aweme8.getAwemeRawAd()) != null) {
                    logExtra = awemeRawAd3.getLogExtra();
                } else {
                    logExtra = null;
                }
                jSONObject3.put("log_extra", logExtra);
                Aweme aweme9 = this.LIZ;
                if (aweme9 != null && (awemeRawAd2 = aweme9.getAwemeRawAd()) != null) {
                    groupId = awemeRawAd2.getGroupId();
                } else {
                    groupId = null;
                }
                jSONObject3.put("group_id", groupId);
                c596450NaN.LIZJ(C786410Ut5.J3(jSONObject3), "live_event_ad_info");
                String string = bundle.getString("bundle_url_extra_param");
                if (string == null) {
                    string = "";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("&is_ads=true");
                sbLIZ2.append(string);
                C786410Ut5.LJJJI("bundle_url_extra_param", C2188811AlT.LIZIZ(sbLIZ2), bundle);
            }
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null) {
                activityLIZ2 = C1388190mED.LIZ(activityLIZIZ);
            }
            if (strLJIIIZ != null) {
                str2 = strLJIIIZ;
            }
            currentUserID.toString();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC20673515v3K4.LJZI(activityLIZ2, str2, currentUserID, bundle, new DialogInterface.OnDismissListener() { // from class: X.0Nng
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1440005kM.LIZ(new C585740MyC(System.currentTimeMillis() - jCurrentTimeMillis));
                }
            });
        }
    }

    @Override // X.InterfaceC1066840dru
    public final void LJ(C2344009Gk c2344009Gk) {
        C1065370dpX.LIZJ(this, this.LIZJ, this.LIZ, c2344009Gk);
    }

    @Override // X.InterfaceC1066840dru
    public final boolean LJFF(int i, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        this.LIZJ = str;
        this.LIZIZ = anchorCommonStruct;
        if (anchorCommonStruct.getType() == EnumC1430380nKG.LIVE_EVENT.getTYPE()) {
            return true;
        }
        return false;
    }
}
