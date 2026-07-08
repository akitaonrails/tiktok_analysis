package X;

/* JADX INFO: renamed from: X.12fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19814912fr implements InterfaceC1456340o08<InterfaceC19800112dT> {
    public static final C19814912fr LLILLJJLI = new C19814912fr();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19800112dT() { // from class: X.12gH
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;

        @Override // X.InterfaceC19800112dT
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.tcf.client", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.tcf.service", true);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.tcf.service");
        }

        @Override // X.InterfaceC19800112dT
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19800112dT
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12dT] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19800112dT get() {
        return this.LL.LL;
    }
}
