package X;

/* JADX INFO: renamed from: X.12hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19826412hi implements InterfaceC1456340o08<InterfaceC19828012hy> {
    public static final C19826412hi LLILLJJLI = new C19826412hi();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19828012hy() { // from class: X.12gJ
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;
        public static final C19820012gg LIZJ;
        public static final C19820012gg LIZLLL;

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            c19819912gfLIZJ.LIZIZ("measurement.dma_consent.client", true);
            c19819912gfLIZJ.LIZIZ("measurement.dma_consent.client_bow_check2", true);
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.dma_consent.separate_service_calls_fix", false);
            c19819912gfLIZJ.LIZIZ("measurement.dma_consent.service", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.dma_consent.service_database_update_fix", true);
            c19819912gfLIZJ.LIZIZ("measurement.dma_consent.service_dcu_event", true);
            LIZJ = c19819912gfLIZJ.LIZIZ("measurement.dma_consent.service_dcu_event2", true);
            c19819912gfLIZJ.LIZIZ("measurement.dma_consent.service_npa_remote_default", true);
            c19819912gfLIZJ.LIZIZ("measurement.dma_consent.service_split_batch_on_consent", true);
            LIZLLL = c19819912gfLIZJ.LIZIZ("measurement.dma_consent.set_consent_inline_on_worker", false);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.dma_consent.separate_service_calls_fix");
        }

        @Override // X.InterfaceC19828012hy
        public final boolean LIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19828012hy
        public final boolean LIZIZ() {
            return LIZJ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19828012hy
        public final boolean LIZLLL() {
            return LIZLLL.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19828012hy
        public final boolean zza() {
            return LIZ.LIZ().booleanValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hy] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19828012hy get() {
        return this.LL.LL;
    }
}
