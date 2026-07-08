package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.memory.NativeMemoryChunk;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0kgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328770kgN {
    public final C1328790kgP LIZ;
    public InterfaceC1330420kj2 LIZIZ;
    public C1329240kh8 LIZJ;
    public C1329250kh9 LIZLLL;
    public C1328750kgL LJ;
    public C1327960kf4 LJFF;
    public C1329140kgy LJI;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1330420kj2 LIZ() {
        /*
            r4 = this;
            X.0kj2 r0 = r4.LIZIZ
            if (r0 != 0) goto L1e
            X.0kgP r0 = r4.LIZ
            java.lang.String r1 = r0.LJIIIIZZ
            int r0 = r1.hashCode()
            switch(r0) {
                case -1868884870: goto L21;
                case -1106578487: goto L3d;
                case -404562712: goto L46;
                case 95945896: goto L60;
                default: goto Lf;
            }
        Lf:
            X.0kgO r3 = new X.0kgO
            X.0kgP r0 = r4.LIZ
            X.0kfX r2 = r0.LIZLLL
            X.0khE r1 = r0.LIZ
            X.0kjA r0 = r0.LIZIZ
            r3.<init>(r2, r1, r0)
            r4.LIZIZ = r3
        L1e:
            X.0kj2 r0 = r4.LIZIZ
            return r0
        L21:
            java.lang.String r0 = "legacy_default_params"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            X.0kgO r3 = new X.0kgO
            X.0kgP r0 = r4.LIZ
            X.0kfX r2 = r0.LIZLLL
            X.0khE r1 = X.C1329220kh6.LIZ()
            X.0kgP r0 = r4.LIZ
            X.0kjA r0 = r0.LIZIZ
            r3.<init>(r2, r1, r0)
            r4.LIZIZ = r3
            goto L1e
        L3d:
            java.lang.String r0 = "legacy"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            goto Lf
        L46:
            java.lang.String r0 = "experimental"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            X.0kiV r3 = new X.0kiV
            X.0kgP r0 = r4.LIZ
            int r2 = r0.LJIIIZ
            int r1 = r0.LJIIJ
            X.0kjA r0 = X.C1330500kjA.LJII()
            r3.<init>(r2, r1, r0)
            r4.LIZIZ = r3
            goto L1e
        L60:
            java.lang.String r0 = "dummy"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            X.0kgc r0 = new X.0kgc
            r0.<init>()
            r4.LIZIZ = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328770kgN.LIZ():X.0kj2");
    }

    public final C1327960kf4 LIZJ() {
        if (this.LJFF == null) {
            if (this.LJI == null) {
                C1328790kgP c1328790kgP = this.LIZ;
                this.LJI = new C1329140kgy(c1328790kgP.LIZLLL, c1328790kgP.LJI, c1328790kgP.LJII);
            }
            this.LJFF = new C1327960kf4(this.LJI);
        }
        return this.LJFF;
    }

    public C1328770kgN(C1328790kgP c1328790kgP) {
        this.LIZ = c1328790kgP;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0kh9] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0kh8] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0kgL] */
    public final InterfaceC1327440keE LIZIZ(int i) {
        final AbstractC1329130kgx abstractC1329130kgx;
        if (this.LJ == null) {
            if (i != 0) {
                if (i == 1) {
                    if (this.LIZJ == null) {
                        C1328790kgP c1328790kgP = this.LIZ;
                        final InterfaceC1328250kfX interfaceC1328250kfX = c1328790kgP.LIZLLL;
                        final C1329300khE c1329300khE = c1328790kgP.LJ;
                        final C1330500kjA c1330500kjA = c1328790kgP.LJFF;
                        this.LIZJ = new AbstractC1329130kgx(interfaceC1328250kfX, c1329300khE, c1330500kjA) { // from class: X.0kh8
                            @Override // X.AbstractC1330070kiT
                            public final InterfaceC1329110kgv LIZIZ(int i2) {
                                return new C1329120kgw(i2);
                            }
                        };
                    }
                    abstractC1329130kgx = this.LIZJ;
                } else {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
            } else {
                if (this.LIZLLL == null) {
                    C1328790kgP c1328790kgP2 = this.LIZ;
                    final InterfaceC1328250kfX interfaceC1328250kfX2 = c1328790kgP2.LIZLLL;
                    final C1329300khE c1329300khE2 = c1328790kgP2.LJ;
                    final C1330500kjA c1330500kjA2 = c1328790kgP2.LJFF;
                    this.LIZLLL = new AbstractC1329130kgx(interfaceC1328250kfX2, c1329300khE2, c1330500kjA2) { // from class: X.0kh9
                        @Override // X.AbstractC1330070kiT
                        public final InterfaceC1329110kgv LIZIZ(int i2) {
                            return new NativeMemoryChunk(i2);
                        }
                    };
                }
                abstractC1329130kgx = this.LIZLLL;
            }
            final C1327960kf4 c1327960kf4LIZJ = LIZJ();
            this.LJ = new InterfaceC1327440keE(abstractC1329130kgx, c1327960kf4LIZJ) { // from class: X.0kgL
                public final C1327960kf4 LIZ;
                public final AbstractC1329130kgx LIZIZ;

                @Override // X.InterfaceC1327440keE
                public final C1328760kgM LIZLLL() {
                    return new C1328760kgM(this.LIZIZ);
                }

                @Override // X.InterfaceC1327440keE
                public final C1328830kgT LIZ(InputStream inputStream) {
                    C1328760kgM c1328760kgM = new C1328760kgM(this.LIZIZ);
                    try {
                        this.LIZ.LIZ(inputStream, c1328760kgM);
                        C1328830kgT c1328830kgTLIZ = c1328760kgM.LIZ();
                        c1328760kgM.close();
                        return c1328830kgTLIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c1328760kgM.close();
                        throw th;
                    }
                }

                @Override // X.InterfaceC1327440keE
                public final C1328830kgT LIZIZ(byte[] bArr) {
                    C1328760kgM c1328760kgM = new C1328760kgM(this.LIZIZ, bArr.length);
                    try {
                        try {
                            c1328760kgM.write(bArr, 0, bArr.length);
                            C1328830kgT c1328830kgTLIZ = c1328760kgM.LIZ();
                            c1328760kgM.close();
                            return c1328830kgTLIZ;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1331420kke.LIZIZ(e);
                            throw null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c1328760kgM.close();
                        throw th;
                    }
                }

                @Override // X.InterfaceC1327440keE
                public final C1328760kgM LJ(int i2) {
                    return new C1328760kgM(this.LIZIZ, i2);
                }

                {
                    this.LIZIZ = abstractC1329130kgx;
                    this.LIZ = c1327960kf4LIZJ;
                }

                @Override // X.InterfaceC1327440keE
                public final C1328830kgT LIZJ(InputStream inputStream, int i2) {
                    C1328760kgM c1328760kgM = new C1328760kgM(this.LIZIZ, i2);
                    try {
                        this.LIZ.LIZ(inputStream, c1328760kgM);
                        C1328830kgT c1328830kgTLIZ = c1328760kgM.LIZ();
                        c1328760kgM.close();
                        return c1328830kgTLIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c1328760kgM.close();
                        throw th;
                    }
                }
            };
        }
        return this.LJ;
    }
}
