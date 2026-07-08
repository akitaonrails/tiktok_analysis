package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0811, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0811 {
    public AnonymousClass0813 LIZ;
    public AnonymousClass0812 LIZIZ;
    public int LIZJ = -1;
    public int LIZLLL;
    public boolean LJ;
    public Context LJFF;

    public final void LIZ(int i, int[] iArr) {
        try {
            if (!this.LJ) {
                int i2 = this.LIZJ;
                if (i2 == 1) {
                    this.LIZIZ = new C20491080z();
                } else if (i2 == 2) {
                    this.LIZIZ = new C20490080y();
                } else if (i2 == 3) {
                    this.LIZIZ = new AnonymousClass0816();
                }
                AnonymousClass0812 anonymousClass0812 = this.LIZIZ;
                if (anonymousClass0812 != null) {
                    anonymousClass0812.LIZLLL();
                    this.LJ = true;
                }
            }
            AnonymousClass0812 anonymousClass08122 = this.LIZIZ;
            if (anonymousClass08122 != null) {
                anonymousClass08122.LIZIZ(i, iArr);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
