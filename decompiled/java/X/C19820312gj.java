package X;

/* JADX INFO: renamed from: X.12gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19820312gj implements InterfaceC1456340o08<InterfaceC19824712hR> {
    public static final C19820312gj LLILLJJLI = new C19820312gj();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19824712hR() { // from class: X.12gV
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;
        public static final C19820012gg LIZJ;

        @Override // X.InterfaceC19824712hR
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            c19819912gfLIZJ.LIZIZ("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.audience.refresh_event_count_filters_timestamp", false);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
            LIZJ = c19819912gfLIZJ.LIZIZ("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
        }

        @Override // X.InterfaceC19824712hR
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19824712hR
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19824712hR
        public final boolean LIZLLL() {
            return LIZJ.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19824712hR) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hR] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19824712hR get() {
        return this.LL.LL;
    }
}
