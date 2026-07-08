package X;

/* JADX INFO: renamed from: X.12gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19820612gm implements InterfaceC1456340o08<InterfaceC19824812hS> {
    public static final C19820612gm LLILLJJLI = new C19820612gm();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19824812hS() { // from class: X.12gL
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;
        public static final C19820012gg LIZJ;

        @Override // X.InterfaceC19824812hS
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.consent.stop_reset_on_storage_denied.client", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.consent.stop_reset_on_storage_denied.service", true);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.consent.stop_reset_on_storage_denied.service");
            LIZJ = c19819912gfLIZJ.LIZIZ("measurement.consent.scrub_audience_data_analytics_consent", true);
        }

        @Override // X.InterfaceC19824812hS
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19824812hS
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19824812hS
        public final boolean LIZLLL() {
            return LIZJ.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19824812hS) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hS] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19824812hS get() {
        return this.LL.LL;
    }
}
