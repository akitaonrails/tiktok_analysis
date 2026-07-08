package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10hX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19315710hX {
    public static final /* synthetic */ int LIZ = 0;

    public static final Bundle LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (Intrinsics.LJFF(str, "facebook")) {
            C786410Ut5.LJJJI("fb_read_permissions", "public_profile, user_age_range, email, user_friends", bundle);
            return bundle;
        }
        if (!Intrinsics.LJFF(str, "google")) {
            return null;
        }
        bundle.putBoolean("google_force_sign_out", true);
        return bundle;
    }

    public static final String LIZIZ(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        if (Intrinsics.LJFF(authResult.mProviderId, "google")) {
            return "311";
        }
        if (Intrinsics.LJFF(authResult.mProviderId, "facebook")) {
            return "310";
        }
        if (Intrinsics.LJFF(authResult.mProviderId, "google_web")) {
            return "934";
        }
        if (!Intrinsics.LJFF(authResult.mProviderId, "google_onetap")) {
            return "";
        }
        return "311";
    }

    public static final String LIZJ(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        return LIZLLL(authResult.mProviderId);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZLLL(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -1534815154:
                if (str.equals("google_web")) {
                }
                break;
            case -1240244679:
                if (!str.equals("google")) {
                }
                break;
            case 3321844:
                str2 = "line";
                if (!str.equals("line")) {
                }
                break;
            case 323062851:
                if (!str.equals("google_onetap")) {
                }
                break;
            case 486515695:
                str2 = "kakaotalk";
                if (!str.equals("kakaotalk")) {
                }
                break;
            case 497130182:
                str2 = "facebook";
                if (!str.equals("facebook")) {
                }
                break;
        }
        return "";
    }

    public static final String LJ(AuthResult authResult) {
        if (authResult != null) {
            return authResult.mBundle.getString("profile_key");
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LJFF(String str) {
        InterfaceC1887090zCt accountDebugService;
        if (str != null) {
            switch (str.hashCode()) {
                case -1240244679:
                    if (str.equals("google")) {
                        LocalTestApi localTestApiLIZ = C19273110af.LIZ();
                        if (localTestApiLIZ != null && (accountDebugService = localTestApiLIZ.getAccountDebugService()) != null) {
                            accountDebugService.LIZ();
                        }
                        C1AWO c1awoLIZ = C1ATR.LIZIZ().LIZ("google");
                        if (c1awoLIZ != null && c1awoLIZ.isAvailable()) {
                            return "google";
                        }
                        return "google_web";
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        return "line";
                    }
                    break;
                case 486515695:
                    if (str.equals("kakaotalk")) {
                        return "kakaotalk";
                    }
                    break;
                case 497130182:
                    if (str.equals("facebook")) {
                        return "facebook";
                    }
                    break;
            }
        }
        return "";
    }
}
