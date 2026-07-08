package X;

/* JADX INFO: renamed from: X.12gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19820512gl implements InterfaceC1456340o08<InterfaceC19823312hD> {
    public static final C19820512gl LLILLJJLI = new C19820512gl();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19823312hD() { // from class: X.12gG
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;
        public static final C19820012gg LIZJ;
        public static final C19820012gg LIZLLL;
        public static final C19820012gg LJ;
        public static final C19820012gg LJFF;
        public static final C19820012gg LJI;

        @Override // X.InterfaceC19823312hD
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.client2", true);
            c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.dma_fix", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.followup1.service", false);
            c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.index_out_of_bounds_fix", true);
            LIZJ = c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.registration_regardless_consent", false);
            LIZLLL = c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.service", true);
            LJ = c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.enable_trigger_redaction", true);
            LJFF = c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.uuid_generation", true);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.rb.attribution.improved_retry");
            LJI = c19819912gfLIZJ.LIZIZ("measurement.rb.attribution.improved_retry", true);
        }

        @Override // X.InterfaceC19823312hD
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19823312hD
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19823312hD
        public final boolean LIZJ() {
            return LJFF.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19823312hD
        public final boolean LIZLLL() {
            return LIZJ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19823312hD
        public final boolean LJ() {
            return LIZLLL.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19823312hD
        public final boolean LJFF() {
            return LJ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19823312hD
        public final boolean LJI() {
            return LJI.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19823312hD) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hD] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19823312hD get() {
        return this.LL.LL;
    }
}
