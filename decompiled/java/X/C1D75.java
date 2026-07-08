package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.1D75, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D75 {
    public static final C1448440nnO LIZ;
    public static final C1D74 LIZIZ;

    static {
        C1448440nnO c1448440nnO = new C1448440nnO();
        LIZ = c1448440nnO;
        LIZIZ = new C1D74(c1448440nnO);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static Object LIZ(Class cls) throws IllegalAccessException, InstantiationException {
        C1D7B c1d7b;
        C1D7C c1d7cLIZ;
        C1D74 c1d74 = LIZIZ;
        Object objNewInstance = (C1D77) c1d74.LIZJ.get(cls);
        if (objNewInstance == null) {
            objNewInstance = cls.newInstance();
            c1d74.LIZJ.put((Class<?>) cls, (C1D77<?>) objNewInstance);
        }
        C1D77 c1d77 = (C1D77) objNewInstance;
        C1D72 c1d72LIZLLL = c1d77.LIZLLL();
        C1D7B c1d7b2 = c1d74.LIZIZ.get(c1d72LIZLLL);
        c1d77.LIZ();
        if (c1d7b2 == null || (c1d7cLIZ = c1d7b2.LIZ(c1d77)) == null) {
            int i = C1D73.LIZ[c1d72LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1d7b = new C1D7B(c1d74.LIZ) { // from class: X.1D78
                            public final C1448440nnO LIZ;
                            public final ArrayList<C1D77<?>> LIZIZ = new ArrayList<>();

                            {
                                this.LIZ = c1448440nnO;
                            }

                            @Override // X.C1D7B
                            public final <RESULT> C1D7C<RESULT> LIZ(C1D77<? extends RESULT> c1d772) {
                                this.LIZIZ.add(c1d772);
                                return c1d772.LIZIZ(this.LIZ);
                            }
                        };
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    final C1448440nnO c1448440nnO = c1d74.LIZ;
                    c1d7b = new C1D7B(c1448440nnO) { // from class: X.1D7A
                        public final C1448440nnO LIZ;

                        {
                            this.LIZ = c1448440nnO;
                        }

                        @Override // X.C1D7B
                        public final <RESULT> C1D7C<RESULT> LIZ(C1D77<? extends RESULT> c1d772) {
                            return c1d772.LIZIZ(this.LIZ);
                        }
                    };
                }
            } else {
                final C1448440nnO c1448440nnO2 = c1d74.LIZ;
                c1d7b = new C1D7B(c1448440nnO2) { // from class: X.1D79
                    public final C1448440nnO LIZ;

                    {
                        this.LIZ = c1448440nnO2;
                    }

                    @Override // X.C1D7B
                    public final <RESULT> C1D7C<RESULT> LIZ(C1D77<? extends RESULT> c1d772) {
                        return c1d772.LIZIZ(this.LIZ);
                    }
                };
            }
            c1d74.LIZIZ.get(c1d72LIZLLL);
            c1d7cLIZ = c1d7b.LIZ(c1d77);
        }
        c1d77.LIZ();
        C1D7D.LIZ(c1d77, c1d7cLIZ);
        return c1d7cLIZ.LIZ;
    }
}
