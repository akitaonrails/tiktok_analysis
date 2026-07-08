package X;

/* JADX INFO: renamed from: X.12fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19815012fs implements InterfaceC1456340o08<InterfaceC19786312bF> {
    public static final C19815012fs LLILLJJLI = new C19815012fs();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19786312bF() { // from class: X.12gI
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;

        @Override // X.InterfaceC19786312bF
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            c19819912gfLIZJ.LIZIZ("measurement.collection.event_safelist", true);
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.service.store_null_safelist", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.service.store_safelist", true);
        }

        @Override // X.InterfaceC19786312bF
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19786312bF
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12bF] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19786312bF get() {
        return this.LL.LL;
    }
}
