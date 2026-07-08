package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10YJ {
    public static final HashMap<C10YL, C10Y2> LIZ;

    static {
        HashMap<C10YL, C10Y2> map = new HashMap<>();
        LIZ = map;
        map.put(C10YL.Share, new C10Y2() { // from class: X.10Y4
            @Override // X.C10Y2
            public final void LIZ(Uri uri) {
                String lastPathSegment;
                String str;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String string = uri.toString();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url")) != null) {
                    Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    if (uri2 != null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "utm_source");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                        }
                    }
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "unknown";
                } else if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "unknown";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("share.");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                C10YX.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
                if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "refer"), "web")) {
                    C10YX.LJ = "fe_component";
                } else {
                    C10YX.LJ = "link_direct";
                }
                String strLIZIZ = "";
                if (!a0.LJJIIZI(string, "/activity/referral", false) && !a0.LJJIIZI(string, "/ug_activity_referral", false) && !a0.LJJIIZI(string, "/activity/armor", false)) {
                    if (!TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"), "ttfarm_link")) {
                        str = "";
                        lastPathSegment = "";
                    } else {
                        str = "gamification";
                        lastPathSegment = "";
                    }
                } else {
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        lastPathSegment = "";
                    }
                    str = "incentive";
                }
                if (C123100dR.LIZ(str)) {
                    if (C123100dR.LIZ(lastPathSegment)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('.');
                        sbLIZ2.append(lastPathSegment);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(strLIZIZ);
                    C10YX.LJFF = C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        });
        map.put(C10YL.Paid, new C10Y2() { // from class: X.10YY
            @Override // X.C10Y2
            public final void LIZ(Uri uri) {
                C10YX.LIZLLL = "paid";
                C10YX.LJ = "link_direct";
            }
        });
        map.put(C10YL.OpenPlatform, new C10Y2() { // from class: X.10YU
            @Override // X.C10Y2
            public final void LIZ(Uri uri) {
                C10YX.LIZLLL = "op.embed";
                if (C123100dR.LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "referer_video_id"))) {
                    C10YX.LJ = "video";
                }
            }
        });
        map.put(C10YL.Post, new C10Y2() { // from class: X.10YO
            @Override // X.C10Y2
            public final void LIZ(Uri uri) {
                if (C10YX.LIZJ) {
                    C10YX.LIZLLL = "post.push";
                    return;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && u.LJJIIJZLJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "edm_", false)) {
                    C10YX.LIZLLL = "post.email";
                    return;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && u.LJIIZILJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "_msg", false)) {
                    C10YX.LIZLLL = "post.sms";
                } else {
                    C10YX.LIZLLL = "post.unknown";
                }
            }
        });
        map.put(C10YL.Seo, new C10Y2() { // from class: X.10YI
            @Override // X.C10Y2
            public final void LIZ(Uri uri) {
                Intent intent;
                String stringExtra;
                Object obj;
                C1950707kX c1950707kX = this.LIZ;
                if (c1950707kX != null && (intent = c1950707kX.LIZJ) != null) {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                obj = extras.get("android.intent.extra.REFERRER");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            } catch (OutOfMemoryError e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            if (obj == null || (stringExtra = obj.toString()) == null) {
                                try {
                                    stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                                    if (stringExtra == null) {
                                        return;
                                    }
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    return;
                                }
                            }
                            String host = UriProtector.parse(stringExtra).getHost();
                            if (host != null) {
                                if (a0.LJJIIZI(host, "google", false)) {
                                    C10YX.LIZLLL = "seo.google";
                                    return;
                                }
                                if (a0.LJJIIZI(host, "yahoo", false)) {
                                    C10YX.LIZLLL = "seo.yahoo";
                                    return;
                                }
                                if (a0.LJJIIZI(host, "yandex", false)) {
                                    C10YX.LIZLLL = "seo.yandex";
                                    return;
                                }
                                if (a0.LJJIIZI(host, "bing", false)) {
                                    C10YX.LIZLLL = "seo.bing";
                                } else if (a0.LJJIIZI(host, "duckduckgo", false)) {
                                    C10YX.LIZLLL = "seo.duckduckgo";
                                } else {
                                    C10YX.LIZLLL = "seo.unknown";
                                }
                            }
                        }
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
            }
        });
        map.put(C10YL.Web, new C10Y2() { // from class: X.10YZ
            @Override // X.C10Y2
            public final void LIZ(Uri uri) {
                C10YX.LIZLLL = "web";
            }
        });
        map.put(C10YL.Others, new C10Y2() { // from class: X.10Y3
            @Override // X.C10Y2
            public final void LIZ(Uri uri) {
                Object obj;
                Object obj2;
                HashMap<String, Object> map2;
                HashMap<String, Object> map3;
                C1950707kX c1950707kX = this.LIZ;
                if (c1950707kX == null || (map3 = c1950707kX.LJ) == null || (obj = map3.get("is_from_self")) == null) {
                    obj = Boolean.FALSE;
                }
                C1950707kX c1950707kX2 = this.LIZ;
                if (c1950707kX2 == null || (map2 = c1950707kX2.LJ) == null || (obj2 = map2.get("in_app_enter_from")) == null) {
                    obj2 = "";
                }
                if (((Boolean) obj).booleanValue()) {
                    C10YX.LIZLLL = "others.inapp";
                    C1953307kx.LIZ.getClass();
                    C10YX.LJII = C1953307kx.LIZJ(uri);
                    C10YX.LJ = (String) obj2;
                    return;
                }
                if (Intrinsics.LJFF(uri.getHost(), "livewallpaper")) {
                    C10YX.LIZLLL = "others.wallpaper";
                } else {
                    C10YX.LIZLLL = "others.unknown";
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r5
      0x0015: PHI (r5v2 android.net.Uri) = (r5v0 android.net.Uri), (r5v4 android.net.Uri), (r5v5 android.net.Uri) binds: [B:80:0x00f8, B:7:0x0013, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C10Y2 LIZ(X.C1950707kX r8) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10YJ.LIZ(X.07kX):X.10Y2");
    }

    public static boolean LIZIZ(Intent intent, String str) {
        Object obj;
        String string;
        String host;
        String stringExtra = null;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    try {
                        obj = extras.get("android.intent.extra.REFERRER");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (obj != null && (string = obj.toString()) != null) {
                        stringExtra = string;
                    } else {
                        try {
                            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        if (stringExtra == null || (host = UriProtector.parse(stringExtra).getHost()) == null || !a0.LJJIIZI(host, str, false)) {
            return false;
        }
        return true;
    }
}
