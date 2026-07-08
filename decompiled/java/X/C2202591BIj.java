package X;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import java.util.Collection;

/* JADX INFO: renamed from: X.1BIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202591BIj extends AnonymousClass1433<Collection<? extends String>, C1BK4> {
    public CallbackManager LIZ;
    public final String LIZIZ;
    public final /* synthetic */ LoginManager LIZJ;

    @Override // X.AnonymousClass1433
    public final Intent LIZ(ComponentActivity componentActivity, Object obj) {
        LoginClient.Request requestLIZ = this.LIZJ.LIZ(new C13LR((Collection) obj));
        String str = this.LIZIZ;
        if (str != null) {
            requestLIZ.authId = str;
        }
        this.LIZJ.getClass();
        LoginManager.LJ(componentActivity, requestLIZ);
        this.LIZJ.getClass();
        Intent intentLIZIZ = LoginManager.LIZIZ(requestLIZ);
        this.LIZJ.getClass();
        if (FacebookSdk.LIZJ().getPackageManager().resolveActivity(intentLIZIZ, 0) != null) {
            return intentLIZIZ;
        }
        C1BJO c1bjo = new C1BJO("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        LoginManager loginManager = this.LIZJ;
        EnumC2202671BIr enumC2202671BIr = EnumC2202671BIr.ERROR;
        loginManager.getClass();
        LoginManager.LIZJ(componentActivity, enumC2202671BIr, null, c1bjo, false, requestLIZ);
        throw c1bjo;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1BK4] */
    @Override // X.AnonymousClass1433
    public final C1BK4 LIZJ(int i, Intent intent) {
        this.LIZJ.LJFF(i, intent, null);
        int requestCode = EnumC2202541BIe.Login.toRequestCode();
        CallbackManager callbackManager = this.LIZ;
        if (callbackManager != null) {
            callbackManager.onActivityResult(requestCode, i, intent);
        }
        return new Object() { // from class: X.1BK4
        };
    }

    public C2202591BIj(LoginManager loginManager, CallbackManager callbackManager, String str) {
        this.LIZJ = loginManager;
        this.LIZ = callbackManager;
        this.LIZIZ = str;
    }
}
