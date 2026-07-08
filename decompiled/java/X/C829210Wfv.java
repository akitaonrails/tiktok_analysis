package X;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Wfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829210Wfv {
    public static final C830530Wi3<String, String> LIZ = new C830530Wi3<>();
    public static Locale LIZIZ;

    public static String LIZ(Context context) {
        String packageName = context.getPackageName();
        try {
            C812460Vu0 c812460Vu0LIZ = C812450Vtz.LIZ(context);
            return c812460Vu0LIZ.LIZ.getPackageManager().getApplicationLabel(C786410Ut5.V3(c812460Vu0LIZ.LIZ.getPackageManager(), packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String LIZIZ(int i, Context context) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(com.zhiliaoapp.musically.R.string.fpu);
            }
            return resources.getString(com.zhiliaoapp.musically.R.string.fq4);
        }
        return resources.getString(com.zhiliaoapp.musically.R.string.fpx);
    }

    public static String LIZJ(int i, Context context) {
        Resources resources = context.getResources();
        String strLIZ = LIZ(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            return LJ(context, "common_google_play_services_api_unavailable_text", strLIZ);
                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                            return LJ(context, "common_google_play_services_sign_in_failed_text", strLIZ);
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                            return resources.getString(com.zhiliaoapp.musically.R.string.fq7, strLIZ);
                                        default:
                                            return resources.getString(com.zhiliaoapp.musically.R.string.fq2, strLIZ);
                                    }
                                }
                                return LJ(context, "common_google_play_services_restricted_profile_text", strLIZ);
                            }
                            return resources.getString(com.zhiliaoapp.musically.R.string.fq3, strLIZ);
                        }
                        return LJ(context, "common_google_play_services_network_error_text", strLIZ);
                    }
                    return LJ(context, "common_google_play_services_invalid_account_text", strLIZ);
                }
                return resources.getString(com.zhiliaoapp.musically.R.string.fpv, strLIZ);
            }
            if (C829120Wfm.LIZ(context)) {
                return resources.getString(com.zhiliaoapp.musically.R.string.fq8);
            }
            return resources.getString(com.zhiliaoapp.musically.R.string.fq5, strLIZ);
        }
        return resources.getString(com.zhiliaoapp.musically.R.string.fpy, strLIZ);
    }

    public static String LIZLLL(int i, Context context) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.zhiliaoapp.musically.R.string.fpz);
            case 2:
                return resources.getString(com.zhiliaoapp.musically.R.string.fq6);
            case 3:
                return resources.getString(com.zhiliaoapp.musically.R.string.fpw);
            case 4:
            case 6:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return null;
            case 5:
                return LJFF(context, "common_google_play_services_invalid_account_title");
            case 7:
                return LJFF(context, "common_google_play_services_network_error_title");
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case 16:
                return null;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 19:
            default:
                return null;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LJFF(context, "common_google_play_services_sign_in_failed_title");
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LJFF(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String LJFF(Context context, String str) {
        C830530Wi3<String, String> c830530Wi3 = LIZ;
        synchronized (c830530Wi3) {
            try {
                Locale localeLIZJ = C838420Wum.LIZ(context.getResources().getConfiguration()).LIZJ(0);
                if (!localeLIZJ.equals(LIZIZ)) {
                    c830530Wi3.clear();
                    LIZIZ = localeLIZJ;
                }
                String str2 = c830530Wi3.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int iN3 = C786410Ut5.n3(remoteResource, str, "string", "com.google.android.gms");
                if (iN3 == 0) {
                    if (str.length() != 0) {
                        "Missing resource: ".concat(str);
                    }
                    return null;
                }
                String string = remoteResource.getString(iN3);
                if (TextUtils.isEmpty(string)) {
                    if (str.length() != 0) {
                        "Got empty resource: ".concat(str);
                    }
                    return null;
                }
                c830530Wi3.put(str, string);
                return string;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LJ(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strLJFF = LJFF(context, str);
        if (strLJFF == null) {
            strLJFF = resources.getString(com.zhiliaoapp.musically.R.string.fq2);
        }
        return C786410Ut5.k4(resources.getConfiguration().locale, strLJFF, new Object[]{str2});
    }
}
