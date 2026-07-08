package X;

/* JADX INFO: renamed from: X.12he, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19826012he implements InterfaceC1456340o08<InterfaceC19828112hz> {
    public static final C19826012he LLILLJJLI = new C19826012he();
    public final C19834712j3 LL = new C19834712j3(new InterfaceC19828112hz() { // from class: X.12gK
        public static final C19820012gg LIZ;
        public static final C19820012gg LIZIZ;
        public static final C19820012gg LIZJ;

        static {
            C19819912gf c19819912gfLIZJ = new C19819912gf(C2211508lV.LIZ("com.google.android.gms.measurement")).LJ().LIZJ();
            LIZ = c19819912gfLIZJ.LIZIZ("measurement.sdk.collection.deep_link_gclid.client.dev", false);
            c19819912gfLIZJ.LIZIZ("measurement.sdk.collection.enable_extend_user_property_size", true);
            c19819912gfLIZJ.LIZIZ("measurement.sdk.collection.last_deep_link_referrer2", true);
            LIZIZ = c19819912gfLIZJ.LIZIZ("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
            LIZJ = c19819912gfLIZJ.LIZIZ("measurement.sdk.collection.market_referrer_gclid.service", false);
            c19819912gfLIZJ.LIZ(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
        }

        @Override // X.InterfaceC19828112hz
        public final boolean LIZ() {
            return LIZIZ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19828112hz
        public final boolean LIZIZ() {
            return LIZJ.LIZ().booleanValue();
        }

        @Override // X.InterfaceC19828112hz
        public final boolean zza() {
            return LIZ.LIZ().booleanValue();
        }
    });

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.12hz] */
    @Override // X.InterfaceC1456340o08
    public final InterfaceC19828112hz get() {
        return this.LL.LL;
    }
}
