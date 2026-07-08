package X;

/* JADX INFO: renamed from: X.08ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2232608ou {
    public static final InterfaceC2239108px LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC2239108px interfaceC2239108px;
        String property;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
        }
        if (property == null || !Boolean.parseBoolean(property)) {
            interfaceC2239108px = RunnableC2252521DEk.LL;
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            abstractC2238408pq.LLIILII();
            interfaceC2239108px = !(abstractC2238408pq instanceof InterfaceC2239108px) ? RunnableC2252521DEk.LL : (InterfaceC2239108px) abstractC2238408pq;
        }
        LIZ = interfaceC2239108px;
    }
}
