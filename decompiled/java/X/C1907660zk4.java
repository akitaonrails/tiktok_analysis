package X;

import Y.AfS197S0100000_28;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907660zk4 implements InterfaceC1906920zis {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC1906920zis
    public final void LIZ(C1907600zjy c1907600zjy) {
    }

    @Override // X.InterfaceC1906920zis
    public final boolean LIZIZ(C1907070zj7 c1907070zj7) {
        Object c098200Yq;
        String strOptString;
        Object c098200Yq2;
        String str;
        long j;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Object c098200Yq3;
        String str2 = c1907070zj7.LIZ.messageExtra;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        try {
            c098200Yq = new JSONObject(str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null || (strOptString = jSONObject.optString("ad_extra_data")) == null || strOptString.length() == 0) {
            return false;
        }
        try {
            c098200Yq2 = new JSONObject(strOptString);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        JSONObject jSONObject2 = (JSONObject) c098200Yq2;
        if (jSONObject2 == null) {
            return false;
        }
        String str3 = c1907070zj7.LIZ.schemaUrl;
        String strOptString2 = jSONObject2.optString("creative_id");
        if (strOptString2 == null) {
            strOptString2 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.get(next));
        }
        map.put("show_message_order", Integer.valueOf(c1907070zj7.LJ));
        String strOptString3 = jSONObject2.optString("log_extra");
        int iOptInt = jSONObject2.optInt("cost_type");
        String strOptString4 = jSONObject2.optString("sticker_type");
        String str4 = "ad_message_click";
        String str5 = "otherclick";
        if (!c1907070zj7.LJI) {
            if (iOptInt != 3) {
                str4 = "otherclick";
            }
            C1020230cej c1020230cejLIZIZ = C1020240cek.LIZIZ("message_ad", str4, strOptString2, strOptString3, null);
            c1020230cejLIZIZ.LIZJ("preview_message");
            c1020230cejLIZIZ.LIZ(map);
            c1020230cejLIZIZ.LJ();
            return false;
        }
        int i = C1907380zjc.LIZ[c1907070zj7.LIZLLL.ordinal()];
        if (i == 1) {
            str = "secondpage_message_avatar";
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    str = "secondpage_message_root";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "secondpage_message_right";
            }
        } else {
            View view = c1907070zj7.LIZIZ;
            if (view != null && view.getId() == R.id.pel) {
                str = "secondpage_message_title";
            } else {
                str = "secondpage_message_middle";
            }
        }
        if (iOptInt == 1) {
            if (!Intrinsics.LJFF(str, "secondpage_message_avatar")) {
                str5 = "click";
            }
        } else if (iOptInt == 3) {
            str5 = "ad_message_click";
        }
        if (c1907070zj7.LIZIZ != null && Intrinsics.LJFF(strOptString4, "countdown_reminder_game")) {
            try {
                c098200Yq3 = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str3), "url"));
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
                obj = c098200Yq3;
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                ICrossPlatformLegacyService iCrossPlatformLegacyService = (ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class);
                if (iCrossPlatformLegacyService.LIZJ(uri) && iCrossPlatformLegacyService.LJ(c1907070zj7.LIZIZ.getContext(), uri)) {
                    C1020250cel.LIZ(str5, strOptString2, strOptString3, str, map);
                    return true;
                }
            }
        }
        if (str3 != null && str3.length() != 0) {
            Uri uri2 = UriProtector.parse(str3);
            if (Intrinsics.LJFF("live", C1907940zkW.LIZIZ(uri2, "notice_type"))) {
                String strLIZIZ = C1907940zkW.LIZIZ(uri2, "uid");
                String strLIZIZ2 = C1907940zkW.LIZIZ(uri2, "sec_uid");
                if (strLIZIZ != null) {
                    C1907670zk5 c1907670zk5 = new C1907670zk5(strLIZIZ, strLIZIZ2, str5, strOptString2, strOptString3, str, map);
                    AfS197S0100000_28 afS197S0100000_28 = new AfS197S0100000_28(c1907670zk5, 73);
                    AfS197S0100000_28 afS197S0100000_282 = new AfS197S0100000_28(c1907670zk5, 74);
                    try {
                        j = CastLongProtector.parseLong(strLIZIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        j = 0;
                    }
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                    if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                        interfaceC20673515v3K4.LJFF(j, strLIZIZ2).LJJLL(afS197S0100000_28, afS197S0100000_282);
                    }
                    return false;
                }
            }
        }
        C1020250cel.LIZ(str5, strOptString2, strOptString3, str, map);
        return false;
    }

    @Override // X.InterfaceC1906920zis
    public final void LIZJ(C1907600zjy c1907600zjy) {
        String str;
        Object c098200Yq;
        String strOptString;
        Object c098200Yq2;
        String str2;
        String str3;
        GeneralTemplateNotice generalTemplateNotice = c1907600zjy.LIZ.templateNotice;
        if (generalTemplateNotice != null && (str = generalTemplateNotice.messageExtra) != null && str.length() != 0) {
            try {
                c098200Yq = new JSONObject(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject = (JSONObject) c098200Yq;
            if (jSONObject != null && (strOptString = jSONObject.optString("ad_extra_data")) != null && strOptString.length() != 0) {
                try {
                    c098200Yq2 = new JSONObject(strOptString);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                JSONObject jSONObject2 = (JSONObject) c098200Yq2;
                if (jSONObject2 == null) {
                    return;
                }
                String strOptString2 = jSONObject2.optString("creative_id");
                if (strOptString2 == null) {
                    strOptString2 = CardStruct.IStatusCode.DEFAULT;
                }
                int iOptInt = jSONObject2.optInt("cost_type");
                if (iOptInt == 1 && c1907600zjy.LIZJ) {
                    str2 = "show";
                } else {
                    str2 = "othershow";
                    if (iOptInt == 3) {
                        str2 = "ad_message_show";
                    }
                }
                String strOptString3 = jSONObject2.optString("log_extra");
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.get(next));
                }
                map.put("show_message_order", Integer.valueOf(c1907600zjy.LIZIZ));
                if (c1907600zjy.LIZJ) {
                    str3 = "secondpage_message";
                } else {
                    str3 = "preview_message";
                }
                C1020230cej c1020230cejLIZIZ = C1020240cek.LIZIZ("message_ad", str2, strOptString2, strOptString3, null);
                c1020230cejLIZIZ.LIZJ(str3);
                c1020230cejLIZIZ.LIZ(map);
                c1020230cejLIZIZ.LJ();
            }
        }
    }
}
