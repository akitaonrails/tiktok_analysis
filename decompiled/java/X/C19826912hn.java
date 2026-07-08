package X;

/* JADX INFO: renamed from: X.12hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19826912hn implements InterfaceC1456340o08<InterfaceC19828212i0> {
    public static final C19826912hn LLILLJJLI = new C19826912hn();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19828212i0() { // from class: X.12gU
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;
        public static final C19820012gg LIZJ;

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            c19819912gfLIZJ.LIZIZ("measurement.client.ad_id_consent_fix", true);
            c19819912gfLIZJ.LIZIZ("measurement.service.consent.aiid_reset_fix", false);
            c19819912gfLIZJ.LIZIZ("measurement.service.consent.aiid_reset_fix2", true);
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.service.consent.app_start_fix", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.service.consent.params_on_fx", true);
            LIZJ = c19819912gfLIZJ.LIZIZ("measurement.service.consent.pfo_on_fx", true);
        }

        @Override // X.InterfaceC19828212i0
        public final boolean LIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19828212i0
        public final boolean LIZIZ() {
            return LIZJ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19828212i0
        public final boolean zza() {
            return LIZ.LIZ().booleanValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12i0] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19828212i0 get() {
        return this.LL.LL;
    }
}
