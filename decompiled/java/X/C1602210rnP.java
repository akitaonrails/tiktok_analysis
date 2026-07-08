package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602210rnP extends AbstractC2201091BCp<C1602200rnO> {
    public static volatile C1602210rnP LJI;
    public C1602200rnO LJFF = new C1602200rnO();

    @Override // X.AbstractC2201091BCp
    public final long LJIJJLI() {
        return 0L;
    }

    public static C1602210rnP LJJIFFI() {
        if (LJI == null) {
            synchronized (C1602210rnP.class) {
                try {
                    if (LJI == null) {
                        LJI = new C1602210rnP();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIIIIZZ() {
        return !((Boolean) C18053075f.LIZ.getValue()).booleanValue();
    }

    @Override // X.AbstractC2201091BCp
    public final C1602200rnO LJIILIIL() {
        return new C1602200rnO();
    }

    @Override // X.AbstractC2201091BCp
    public final InterfaceC1702080uOU LJIIJJI() {
        return EnumC312610CNf.SATRTUP;
    }

    @Override // X.AbstractC2201091BCp
    public final /* bridge */ /* synthetic */ C1602200rnO LJIILJJIL() {
        return this.LJFF;
    }

    @Override // X.AbstractC2201091BCp
    public final boolean LJIILLIIL(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
        return !c1602200rnO.LIZ.equals(c1602200rnO2.LIZ);
    }
}
