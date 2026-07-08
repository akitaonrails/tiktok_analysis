package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085630eMD<T> extends C1085650eMF<T> {
    public C1085630eMD() {
        super(5);
    }

    @Override // X.C1085650eMF, X.InterfaceC20015613Te
    public final T LIZIZ() {
        if (super.LIZIZ() != null) {
            C20441214yg.LIZIZ("LiveFlyMicGiftHelper", "FlyMicSimplePool hit， return noNull instance");
        }
        return (T) super.LIZIZ();
    }

    @Override // X.C1085650eMF, X.InterfaceC20015613Te
    public final boolean LIZ(T t) {
        C20441214yg.LIZIZ("LiveFlyMicGiftHelper", "FlyMicSimplePool release instance");
        try {
            return super.LIZ(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("LiveFlyMicGiftHelper", "FlyMicSimplePool release failed,", th);
            return false;
        }
    }
}
