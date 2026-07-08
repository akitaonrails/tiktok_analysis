package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Hyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458780Hyu implements InterfaceC458740Hyq {
    public static final C458780Hyu LIZ = new C458780Hyu();
    public static final int LIZIZ;

    static {
        int dimensionPixelSize;
        C0I0B.LJFF.LIZJ();
        try {
            dimensionPixelSize = C894660Z7w.LIZ().getResources().getDimensionPixelSize(R.dimen.a2h);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            dimensionPixelSize = 0;
        }
        LIZIZ = dimensionPixelSize;
    }

    @Override // X.InterfaceC458740Hyq
    public final int LIZ(int i, C458770Hyt c458770Hyt) {
        int iMax;
        if (i < 0) {
            iMax = Math.max(LIZIZ, c458770Hyt.LIZIZ);
        } else {
            iMax = Math.max(LIZIZ, i);
        }
        return Math.min(iMax, c458770Hyt.LIZJ);
    }
}
