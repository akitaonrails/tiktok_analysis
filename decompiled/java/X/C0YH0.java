package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YH0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0YH0 {
    public final C0YH7 LIZ;

    public C870860YEi LIZIZ() {
        C870860YEi c870860YEiLIZ = null;
        if (this.LIZ.isLogin()) {
            try {
                c870860YEiLIZ = this.LIZ.LJFF().LJIIZILJ().LIZ().LIZ();
                return c870860YEiLIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c870860YEiLIZ;
    }

    public C0YH0(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }

    public Object LIZ(C0YCX c0ycx, AbstractC23140094w abstractC23140094w) {
        return this.LIZ.LIZJ().LJIILLIIL().LLLIILIL(c0ycx, false, abstractC23140094w);
    }
}
