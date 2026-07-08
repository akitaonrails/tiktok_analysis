package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AWP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AWP {
    public static final boolean LIZ = LIZ("com.google.android.gms.auth.api.signin.GoogleSignInClient");
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        LIZ("com.google.android.gms.auth.api.identity.SignInCredential");
        LIZIZ = LIZ("com.facebook.login.LoginManager");
        LIZJ = LIZ("com.linecorp.linesdk.auth.LineLoginApi");
        LIZLLL = LIZ("com.kakao.sdk.user.UserApiClient");
        LIZ("com.vk.api.sdk.VK");
    }

    public static boolean LIZ(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
