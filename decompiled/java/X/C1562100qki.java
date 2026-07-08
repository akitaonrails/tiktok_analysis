package X;

import java.util.List;

/* JADX INFO: renamed from: X.0qki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562100qki {
    public static final C1562100qki LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C2276881EAc LIZLLL;
    public volatile List LIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1EAc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1562100qki.class, "configs", "getConfigs()Ljava/util/List;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C1562100qki();
        LIZLLL = new AbstractC1562110qkj() { // from class: X.1EAc
            public final String LIZ = "global-config";
            public final C01GW LIZIZ = C452501pT.LIZIZ(new C2276951EAj());
            public final C01GW LIZJ = C452501pT.LIZIZ(new C2276921EAg());
            public final C01GW LIZLLL = C452501pT.LIZIZ(new C2276911EAf());
            public final C01GW LJ = C452501pT.LIZIZ(new C2276901EAe());
            public final C01GW LJFF = C452501pT.LIZIZ(new C2276891EAd());
            public final C01GW LJI = C452501pT.LIZIZ(new C2276941EAi());
            public final C01GW LJII = C452501pT.LIZIZ(new C2276931EAh());

            @Override // X.AbstractC1562110qkj
            public final float LIZ() {
                return ((Number) this.LJFF.getValue()).floatValue();
            }

            @Override // X.AbstractC1562110qkj
            public final float LIZIZ() {
                return ((Number) this.LJ.getValue()).floatValue();
            }

            @Override // X.AbstractC1562110qkj
            public final float LIZJ() {
                return ((Number) this.LIZLLL.getValue()).floatValue();
            }

            @Override // X.AbstractC1562110qkj
            public final float LIZLLL() {
                return ((Number) this.LIZJ.getValue()).floatValue();
            }

            @Override // X.AbstractC1562110qkj
            public final float LJFF() {
                return ((Number) this.LJII.getValue()).floatValue();
            }

            @Override // X.AbstractC1562110qkj
            public final float LJI() {
                return ((Number) this.LJI.getValue()).floatValue();
            }

            @Override // X.AbstractC1562110qkj
            public final float LJII() {
                return ((Number) this.LIZIZ.getValue()).floatValue();
            }

            @Override // X.AbstractC1562110qkj
            public final String LJ() {
                return this.LIZ;
            }
        };
    }

    public static void LIZIZ() {
        C725430Scv.LJ(C1562230qkv.LIZ, 1.0f, new C1562120qkk());
        C725430Scv.LJ(C1562220qku.LIZ, 1.0f, new C1562130qkl());
        C725430Scv.LJ(C1562070qkf.LIZ, 1.0f, new C1562040qkc());
        C725430Scv.LJ(C1562010qkZ.LIZ, 1.0f, new C1562030qkb());
        C725430Scv.LJ(C1562000qkY.LIZ, 1.0f, new C1562020qka());
        C725430Scv.LJ(C1562090qkh.LIZ, 1.0f, new C1562060qke());
        C725430Scv.LJ(C1562080qkg.LIZ, 1.0f, new C1562050qkd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r2 = X.C1562100qki.LIZLLL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r5, kotlin.jvm.functions.Function1<? super X.AbstractC1562110qkj, java.lang.Float> r6) {
        /*
            r4 = this;
            java.util.List r0 = r4.LIZ
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L28
            monitor-enter(r4)
            java.util.List r0 = r4.LIZ     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L27
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L24
            X.1EAb r0 = new X.1EAb     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            r1[r3] = r0     // Catch: java.lang.Throwable -> L24
            X.0qko r0 = new X.0qko     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            r1[r2] = r0     // Catch: java.lang.Throwable -> L24
            java.util.List r0 = X.C13LQ.LJJLL(r1)     // Catch: java.lang.Throwable -> L24
            r4.LIZ = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L27:
            monitor-exit(r4)
        L28:
            java.util.Iterator r3 = r0.iterator()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.0qkj r1 = (X.AbstractC1562110qkj) r1
            java.lang.String r0 = r1.LJ()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L2c
            java.lang.String r0 = r1.LJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L2c
            if (r2 != 0) goto L53
        L51:
            X.1EAc r2 = X.C1562100qki.LIZLLL
        L53:
            java.lang.Object r0 = r6.invoke(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            boolean r0 = X.C732340So4.LIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1562100qki.LIZ(java.lang.String, kotlin.jvm.functions.Function1):boolean");
    }
}
