package X;

/* JADX INFO: renamed from: X.12hL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19824112hL implements InterfaceC1456340o08<InterfaceC19825912hd> {
    public static final C19824112hL LLILLJJLI = new C19824112hL();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19825912hd() { // from class: X.12gT
        public static final C19819812ge LIZ;

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            c19819912gfLIZJ.LIZIZ("measurement.client.consent_state_v1", true);
            c19819912gfLIZJ.LIZIZ("measurement.client.3p_consent_state_v1", true);
            c19819912gfLIZJ.LIZIZ("measurement.service.consent_state_v1_W36", true);
            LIZ = c19819912gfLIZJ.LIZ(203600L, "measurement.service.storage_consent_support_version");
        }

        @Override // X.InterfaceC19825912hd
        public final long zza() {
            return LIZ.LIZ().longValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hd] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19825912hd get() {
        return this.LL.LL;
    }
}
