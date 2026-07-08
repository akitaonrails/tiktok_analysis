package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Wl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832370Wl1 {
    public static final Lock LIZJ = new ReentrantLock();
    public static C832370Wl1 LIZLLL;
    public final Lock LIZ = new ReentrantLock();
    public final SharedPreferences LIZIZ;

    public final void LIZ() {
        ((ReentrantLock) this.LIZ).lock();
        try {
            this.LIZIZ.edit().clear().apply();
            ((ReentrantLock) this.LIZ).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZ).unlock();
            throw th;
        }
    }

    public final GoogleSignInAccount LIZJ() {
        String strLJFF;
        String strLJFF2 = LJFF("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strLJFF2) || (strLJFF = LJFF(LJII("googleSignInAccount", strLJFF2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.LLFFF(strLJFF);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final GoogleSignInOptions LIZLLL() {
        String strLJFF;
        String strLJFF2 = LJFF("defaultGoogleSignInAccount");
        GoogleSignInOptions googleSignInOptionsLLFFF = null;
        if (!TextUtils.isEmpty(strLJFF2) && (strLJFF = LJFF(LJII("googleSignInOptions", strLJFF2))) != null) {
            try {
                googleSignInOptionsLLFFF = GoogleSignInOptions.LLFFF(strLJFF);
                return googleSignInOptionsLLFFF;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return googleSignInOptionsLLFFF;
    }

    public C832370Wl1(Context context) {
        this.LIZIZ = C810670Vr7.LIZJ(context, 0, "com.google.android.gms.signin");
    }

    public static C832370Wl1 LIZIZ(Context context) {
        C0W3J.LJIIIIZZ(context);
        ReentrantLock reentrantLock = (ReentrantLock) LIZJ;
        reentrantLock.lock();
        try {
            if (LIZLLL == null) {
                LIZLLL = new C832370Wl1(C786410Ut5.N3(context));
            }
            C832370Wl1 c832370Wl1 = LIZLLL;
            reentrantLock.unlock();
            return c832370Wl1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) LIZJ).unlock();
            throw th;
        }
    }

    public final String LJFF(String str) {
        ((ReentrantLock) this.LIZ).lock();
        try {
            String string = this.LIZIZ.getString(str, null);
            ((ReentrantLock) this.LIZ).unlock();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZ).unlock();
            throw th;
        }
    }

    public static final String LJII(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final void LJ(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C0W3J.LJIIIIZZ(googleSignInOptions);
        LJI("defaultGoogleSignInAccount", googleSignInAccount.zak);
        String str = googleSignInAccount.zak;
        LJI(LJII("googleSignInAccount", str), googleSignInAccount.LLI());
        LJI(LJII("googleSignInOptions", str), googleSignInOptions.LLIFFJFJJ());
    }

    public final void LJI(String str, String str2) {
        ((ReentrantLock) this.LIZ).lock();
        try {
            this.LIZIZ.edit().putString(str, str2).apply();
            ((ReentrantLock) this.LIZ).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZ).unlock();
            throw th;
        }
    }
}
