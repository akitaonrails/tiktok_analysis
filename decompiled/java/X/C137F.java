package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.137F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C137F {
    public static final C137D LL;
    public static final C137E LLILLJJLI;
    public static final /* synthetic */ C137F[] LLILLL;

    public C137F() {
        throw null;
    }

    public abstract C137H<Object> LIZJ();

    public abstract C135A LJFF(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.137E] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.137D] */
    static {
        ?? r4 = new C137F() { // from class: X.137D
            @Override // X.C137F
            public final C137H<Object> LIZJ() {
                return C137I.LL;
            }

            @Override // X.C137F
            public final C135A LJFF(final int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, final Object obj) {
                if (i == 1) {
                    return new AnonymousClass1358(obj);
                }
                return new AnonymousClass1358<K, V>(i, obj) { // from class: X.1359
                    public final int LLILLJJLI;

                    @Override // X.AnonymousClass1358, X.C135A
                    public final int LIZ() {
                        return this.LLILLJJLI;
                    }

                    {
                        super(obj);
                        this.LLILLJJLI = i;
                    }
                };
            }
        };
        LL = r4;
        C137F c137f = new C137F() { // from class: X.137G
            @Override // X.C137F
            public final C137H<Object> LIZJ() {
                return C137J.LL;
            }

            @Override // X.C137F
            public final C135A LJFF(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                if (i == 1) {
                    return new C135X(c199595137p.LLJ, obj, interfaceC199564136k);
                }
                return new C135W(i, interfaceC199564136k, obj, c199595137p.LLJ);
            }
        };
        ?? r2 = new C137F() { // from class: X.137E
            @Override // X.C137F
            public final C137H<Object> LIZJ() {
                return C137J.LL;
            }

            @Override // X.C137F
            public final C135A LJFF(int i, C199595137p c199595137p, InterfaceC199564136k interfaceC199564136k, Object obj) {
                if (i == 1) {
                    return new C135C(c199595137p.LLJ, obj, interfaceC199564136k);
                }
                return new C135D(i, interfaceC199564136k, obj, c199595137p.LLJ);
            }
        };
        LLILLJJLI = r2;
        LLILLL = new C137F[]{r4, c137f, r2};
    }

    public static C137F[] values() {
        return (C137F[]) LLILLL.clone();
    }

    public static C137F valueOf(String str) {
        return (C137F) C08FF.LIZ(C137F.class, str);
    }

    public C137F(String str, int i) {
    }
}
