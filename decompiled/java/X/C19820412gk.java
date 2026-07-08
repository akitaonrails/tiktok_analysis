package X;

/* JADX INFO: renamed from: X.12gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19820412gk implements InterfaceC1456340o08<InterfaceC19825012hU> {
    public static final C19820412gk LLILLJJLI = new C19820412gk();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19825012hU() { // from class: X.12gX
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;

        @Override // X.InterfaceC19825012hU
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.consent_regional_defaults.client", false);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.consent_regional_defaults.service", false);
        }

        @Override // X.InterfaceC19825012hU
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19825012hU
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19825012hU) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hU] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19825012hU get() {
        return this.LL.LL;
    }
}
