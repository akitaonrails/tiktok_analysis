package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Mh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC575120Mh4<INPUT, OUTPUT> extends C1D8B {
    public abstract INPUT LJI(C1404610meh c1404610meh);

    public abstract void LJII(C1404610meh c1404610meh, INPUT input, C575130Mh5<OUTPUT> c575130Mh5);

    @Override // X.C1D8B
    public final void LJFF(C1404610meh c1404610meh, C1D85 c1d85) {
        try {
            LJII(c1404610meh, LJI(c1404610meh), new C575130Mh5<>(c1d85));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1d85.LJ(-92001, th);
        }
    }
}
