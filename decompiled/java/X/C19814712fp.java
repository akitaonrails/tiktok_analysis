package X;

/* JADX INFO: renamed from: X.12fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19814712fp implements InterfaceC1456340o08<InterfaceC19814412fm> {
    public static final C19814712fp LLILLJJLI = new C19814712fp();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19814412fm() { // from class: X.12gE
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;
        public static final C19820012gg LIZJ;
        public static final C19820012gg LIZLLL;

        @Override // X.InterfaceC19814412fm
        public final void zza() {
        }

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.gbraid_campaign.deep_link_gbraid.client.dev", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.gbraid_campaign.gbraid.client.dev", false);
            LIZJ = c19819912gfLIZJ.LIZIZ("measurement.gbraid_campaign.gbraid.service", false);
            LIZLLL = c19819912gfLIZJ.LIZIZ("measurement.gbraid_campaign.market_referrer_gbraid.service", true);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.gbraid_campaign.service");
        }

        @Override // X.InterfaceC19814412fm
        public final boolean LIZ() {
            return LIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19814412fm
        public final boolean LIZIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19814412fm
        public final boolean LIZLLL() {
            return LIZJ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19814412fm
        public final boolean LJ() {
            return LIZLLL.LIZ().booleanValue();
        }
    });

    public static boolean LIZ() {
        ((InterfaceC19814412fm) LLILLJJLI.get()).zza();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12fm] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19814412fm get() {
        return this.LL.LL;
    }
}
