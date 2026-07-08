package X;

/* JADX INFO: renamed from: X.12gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19820112gh implements InterfaceC1456340o08<InterfaceC19825212hW> {
    public static final C19820112gh LLILLJJLI = new C19820112gh();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19825212hW() { // from class: X.12gQ
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;

        @Override // X.InterfaceC19825212hW
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.sgtm.preview_mode_enabled", false);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.sgtm.service", false);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.sgtm");
        }

        @Override // X.InterfaceC19825212hW
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19825212hW
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19825212hW) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hW] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19825212hW get() {
        return this.LL.LL;
    }
}
