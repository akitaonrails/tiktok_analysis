package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2167608eQ extends AbstractC2167908eT {
    public Context LIZ;
    public int LIZIZ;
    public C2167508eP LIZJ;

    public final boolean LIZJ() {
        File file = this.LIZJ.LIZ;
        Context contextLIZLLL = LIZLLL();
        C0VSJ c0vsj = new C0VSJ(contextLIZLLL.getApplicationInfo().nativeLibraryDir);
        if (file.equals(c0vsj)) {
            return false;
        }
        int i = this.LIZIZ | 1;
        this.LIZIZ = i;
        this.LIZJ = new C2167508eP(c0vsj, i);
        this.LIZ = contextLIZLLL;
        return true;
    }

    public final Context LIZLLL() {
        try {
            Context context = this.LIZ;
            return C786410Ut5.m4(context, 0, context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // X.AbstractC2167908eT
    public final String toString() {
        return this.LIZJ.toString();
    }

    @Override // X.AbstractC2167908eT
    public final void LIZIZ(int i) {
        this.LIZJ.getClass();
    }

    public C2167608eQ(Context context, int i) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = contextN3;
        if (contextN3 == null) {
            this.LIZ = context;
        }
        this.LIZIZ = i;
        this.LIZJ = new C2167508eP(new C0VSJ(this.LIZ.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // X.AbstractC2167908eT
    public final int LIZ(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.LIZJ.LIZLLL(str, i, threadPolicy);
    }
}
