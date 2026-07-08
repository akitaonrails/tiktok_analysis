package X;

/* JADX INFO: renamed from: X.12gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19820212gi implements InterfaceC1456340o08<InterfaceC19824912hT> {
    public static final C19820212gi LLILLJJLI = new C19820212gi();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19824912hT() { // from class: X.12gW
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;

        @Override // X.InterfaceC19824912hT
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.item_scoped_custom_parameters.client", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.item_scoped_custom_parameters.service", true);
        }

        @Override // X.InterfaceC19824912hT
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19824912hT
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19824912hT) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hT] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19824912hT get() {
        return this.LL.LL;
    }
}
