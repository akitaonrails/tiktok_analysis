package X;

/* JADX INFO: renamed from: X.12gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19820712gn implements InterfaceC1456340o08<InterfaceC19825112hV> {
    public static final C19820712gn LLILLJJLI = new C19820712gn();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19825112hV() { // from class: X.12gY
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;

        @Override // X.InterfaceC19825112hV
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            c19819912gfLIZJ.LIZIZ("measurement.collection.enable_session_stitching_token.client.dev", true);
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.collection.enable_session_stitching_token.first_open_fix", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.session_stitching_token_enabled", false);
            c19819912gfLIZJ.LIZIZ("measurement.link_sst_to_sid", true);
        }

        @Override // X.InterfaceC19825112hV
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19825112hV
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19825112hV) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hV] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19825112hV get() {
        return this.LL.LL;
    }
}
