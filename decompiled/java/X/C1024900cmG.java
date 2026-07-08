package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS97S1000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024900cmG {
    public static final C1024900cmG LIZ = new C1024900cmG();

    public static final boolean LIZ(Context context) {
        if (context != null && C786410Ut5.b4(GoogleApiAvailability.getInstance(), context) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Uri uri) {
        if (!AbstractC1025070cmX.LJIIL(uri)) {
            return false;
        }
        if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (TextUtils.equals(uri.getHost(), "google.com") && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") != null && TextUtils.equals(UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")).getHost(), "play.app.goo.gl")) {
            return true;
        }
        if (!TextUtils.equals(uri.getHost(), "play.google.com") || !TextUtils.equals(uri.getPath(), "/store/apps/details") || TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID))) {
            return false;
        }
        return true;
    }

    public static final void LJ(Context context, Uri uri) {
        String scheme;
        if (context == null) {
            return;
        }
        if (uri != null) {
            scheme = uri.getScheme();
        } else {
            scheme = null;
        }
        if (!Intrinsics.LJFF(scheme, "market") || !LIZ(context)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
        AbstractC1025070cmX.LJJIIZ(context, intent);
    }

    public static final boolean LJI(Context context, Uri uri) {
        if (context != null && uri != null) {
            if (TextUtils.equals(uri.getHost(), "play.app.goo.gl")) {
                return LIZJ(uri, "com.google.android.gms", context);
            }
            if (TextUtils.equals(uri.getHost(), "google.com") && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url") != null && TextUtils.equals(UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")).getHost(), "play.app.goo.gl")) {
                return LIZJ(UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")), "com.google.android.gms", context);
            }
            if (TextUtils.equals(uri.getHost(), "play.google.com") && TextUtils.equals(uri.getPath(), "/store/apps/details") && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID))) {
                return LIZJ(uri, "com.android.vending", context);
            }
        }
        return false;
    }

    public static final boolean LIZJ(Uri uri, String str, Context context) {
        if (!LIZ(context)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.setData(uri);
        intent.addFlags(268435456);
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
        return AbstractC1025070cmX.LJJIIZ(context, intent);
    }

    public static final boolean LJFF(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (!LIZ(context)) {
                return C1024950cmL.LIZ(context, str);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("market://details?id=");
            sbLIZ.append(str);
            Uri.Builder builderBuildUpon = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon();
            if (!TextUtils.isEmpty(str2)) {
                builderBuildUpon.appendQueryParameter("referrer", str2);
            }
            Intent intent = new Intent("android.intent.action.VIEW", builderBuildUpon.build());
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
            return AbstractC1025070cmX.LJJIIZ(context, intent);
        }
        return false;
    }

    public static final boolean LIZLLL(Context context, AwemeRawAd awemeRawAd, String str, boolean z, String str2, Function0<Unit> function0) {
        Intent intentLIZLLL;
        Object c098200Yq;
        int i;
        Activity activityLIZ;
        if (context == null || (intentLIZLLL = C1022030chd.LIZLLL(context, str)) == null) {
            return false;
        }
        int i2 = 1;
        try {
            if (C1388190mED.LIZ(context) == null) {
                activityLIZ = ActivityStack.getTopActivity();
            } else {
                activityLIZ = C1388190mED.LIZ(context);
            }
            C1022030chd.LIZ.getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C1022030chd.LJIILJJIL(activityLIZ, intentLIZLLL) && activityLIZ != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intentLIZLLL, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intentLIZLLL, activityLIZ);
            C2204961BRm.LJIIZILJ(0, activityLIZ, intentLIZLLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOA8orfBpL+LM3HwC7QQ==", null));
            if (function0 != null) {
                function0.invoke();
            }
            C1024890cmF.LIZ(true, awemeRawAd, str, C1017180cZo.LJIILLIIL(awemeRawAd), z, str2);
            return true;
        }
        if (LIZ(context)) {
            LIZ.getClass();
            if (!Intrinsics.LJFF(str2, "initial") && !Intrinsics.LJFF(str2, "is_auto_showed") && !Intrinsics.LJFF(str2, "is_showed_after_video_completed")) {
                C1024890cmF.LIZ(false, awemeRawAd, str, C1017180cZo.LJIILLIIL(awemeRawAd), z, str2);
                return false;
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        boolean zLJIILLIIL = C1017180cZo.LJIILLIIL(awemeRawAd);
        if (awemeRawAd != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "deeplink_failed", awemeRawAd);
            c1022820ciuLIZLLL.LIZJ("minicard", "refer");
            c1022820ciuLIZLLL.LIZIZ(str, "app_url");
            if (zLJIILLIIL) {
                i = 1;
            } else {
                i = 2;
            }
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "download_type");
            if (!z) {
                i2 = 2;
            }
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "minicard_type");
            c1022820ciuLIZLLL.LIZIZ("gp_card", "appstore_type");
            c1022820ciuLIZLLL.LIZIZ(awemeRawAd.getPackageName(), "package_name");
            c1022820ciuLIZLLL.LJII();
            if (Intrinsics.LJFF(str2, "is_auto_showed") || Intrinsics.LJFF(str2, "is_showed_after_video_completed")) {
                C1024890cmF.LIZIZ(awemeRawAd, zLJIILLIIL, z, str, false);
            }
        }
        return false;
    }

    public static final boolean LJII(Context context, int i, String str, Aweme aweme, boolean z, boolean z2) {
        AwemeRawAd awemeRawAd;
        String strLJII;
        AwemeRawAd awemeRawAd2 = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd != null) {
            if (!C1017180cZo.LIZ(awemeRawAd)) {
                return false;
            }
            strLJII = C1017180cZo.LJII(awemeRawAd, z, z2);
        } else {
            strLJII = null;
        }
        if (aweme != null) {
            awemeRawAd2 = aweme.getAwemeRawAd();
        }
        boolean zLIZLLL = LIZLLL(context, awemeRawAd2, strLJII, z2, str, new AwS97S1000000_12(str, 10));
        if (zLIZLLL) {
            C1024820cm8.LJJIIZI(new C1024820cm8(awemeRawAd), i);
        }
        return zLIZLLL;
    }
}
