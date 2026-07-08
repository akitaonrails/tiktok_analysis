package X;

/* JADX INFO: renamed from: X.12hN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19824312hN implements InterfaceC1456340o08<InterfaceC19825412hY> {
    public static final C19824312hN LLILLJJLI = new C19824312hN();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19825412hY() { // from class: X.12gR
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            c19819912gfLIZJ.LIZIZ("measurement.client.sessions.background_sessions_enabled", true);
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.client.sessions.enable_fix_background_engagement", false);
            c19819912gfLIZJ.LIZIZ("measurement.client.sessions.immediate_start_enabled_foreground", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.client.sessions.enable_pause_engagement_in_background", true);
            c19819912gfLIZJ.LIZIZ("measurement.client.sessions.remove_expired_session_properties_enabled", true);
            c19819912gfLIZJ.LIZIZ("measurement.client.sessions.session_id_enabled", true);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
        }

        @Override // X.InterfaceC19825412hY
        public final boolean LIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19825412hY
        public final boolean zza() {
            return LIZ.LIZ().booleanValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hY] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19825412hY get() {
        return this.LL.LL;
    }
}
