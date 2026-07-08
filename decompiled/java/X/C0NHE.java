package X;

/* JADX INFO: renamed from: X.0NHE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0NHE {
    public abstract void LIZ();

    public abstract C0NHJ LIZIZ();

    public abstract void LIZJ();

    public final void LIZLLL() {
        C0S4J c0s4j = C0NH6.LJIILLIIL;
        C0NH6 c0nh6LIZ = C591300NHc.LIZ();
        C0NHJ c0nhjLIZIZ = LIZIZ();
        if (c0nh6LIZ.LJIIJ() == C0NHK.INIT_DONE) {
            EnumC308730C8h.Companion.getClass();
            int maximumCountEnableAdded = C308750C8j.LIZ().getMaximumCountEnableAdded();
            if (1 <= maximumCountEnableAdded && maximumCountEnableAdded <= c0nh6LIZ.LJIIJJI()) {
                C0NH6.LJIILLIIL.LJIIJJI(new C2225708nn(maximumCountEnableAdded, c0nhjLIZIZ));
                return;
            }
            AnonymousClass0956 anonymousClass0956 = c0nh6LIZ.LJIIJJI;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                c0nh6LIZ.LJIIJJI = C23250099c.LIZLLL(c0nh6LIZ.LJII, null, null, new C0NHC(c0nh6LIZ, c0nhjLIZIZ, null), 3);
            }
        }
    }
}
