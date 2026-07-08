package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0teK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673460teK {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tpG] */
    public static final C1680240tpG LIZJ(InterfaceC1680500tpg interfaceC1680500tpg) {
        final float f;
        interfaceC1680500tpg.LJJIIJZLJL(-765097566);
        if (C1670400tZO.LIZIZ(interfaceC1680500tpg).X3()) {
            f = 0.2f;
        } else {
            f = 0.4f;
        }
        ?? r0 = new InterfaceC1693230uAD(f) { // from class: X.0tpG
            public final float LIZ;

            @Override // X.InterfaceC1680320tpO
            public final /* synthetic */ InterfaceC1680330tpP LIZ(C0NV4 c0nv4, InterfaceC1680500tpg interfaceC1680500tpg2) {
                C1680260tpI.LIZ(interfaceC1680500tpg2);
                return C1680290tpL.LL;
            }

            @Override // X.InterfaceC1693230uAD
            public final int hashCode() {
                return Float.floatToIntBits(this.LIZ);
            }

            {
                this.LIZ = f;
            }

            @Override // X.InterfaceC1693230uAD
            public final InterfaceC1691470u7N LIZIZ(C0NV4 c0nv4) {
                return new AbstractC594970NVf(this.LIZ, c0nv4) { // from class: X.0tip
                    public final float LLJJIII;
                    public final C1695150uDJ LLJJIJI;

                    @Override // X.InterfaceC1695680uEA
                    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
                        if (this.LLJJI) {
                            this.LLJJIJI.setAlpha(this.LLJJIII);
                            C1683130ttv c1683130ttv = new C1683130ttv(0.0f, 0.0f, Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)), Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L)));
                            InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1669010tX9.LJLJI().LIZ();
                            try {
                                interfaceC1686290tz1LIZ.LIZLLL(c1683130ttv, this.LLJJIJI);
                                interfaceC1669010tX9.LLIIJLIL();
                                interfaceC1686290tz1LIZ.LJIIJ();
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                interfaceC1686290tz1LIZ.LJIIJ();
                                throw th;
                            }
                        }
                        interfaceC1669010tX9.LLIIJLIL();
                    }

                    {
                        super(c0nv4);
                        this.LLJJIII = f;
                        this.LLJJIJI = C1695550uDx.LIZ();
                    }
                };
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C1680240tpG) && this.LIZ == ((C1680240tpG) obj).LIZ) {
                    return true;
                }
                return false;
            }
        };
        interfaceC1680500tpg.LJ();
        return r0;
    }

    public static final long LIZ(long j, InterfaceC1680500tpg interfaceC1680500tpg) {
        long jLJ;
        interfaceC1680500tpg.LJJIIJZLJL(1501025241);
        long jU2 = C1670400tZO.LIZIZ(interfaceC1680500tpg).U2();
        float fLJFF = C1685910tyP.LJFF(jU2);
        float fLJFF2 = C1685910tyP.LJFF(j);
        float f = 1 - fLJFF;
        float f2 = (fLJFF2 * f) + fLJFF;
        if (f2 == 0.0f) {
            jLJ = C1685910tyP.LJIIIZ;
        } else {
            jLJ = C1685850tyJ.LJ(((C1685910tyP.LJIIIZ(jU2) * fLJFF) + ((C1685910tyP.LJIIIZ(j) * fLJFF2) * f)) / f2, ((C1685910tyP.LJIIIIZZ(jU2) * fLJFF) + ((C1685910tyP.LJIIIIZZ(j) * fLJFF2) * f)) / f2, ((C1685910tyP.LJI(jU2) * fLJFF) + ((C1685910tyP.LJI(j) * fLJFF2) * f)) / f2, f2);
        }
        interfaceC1680500tpg.LJ();
        return jLJ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0tpF] */
    public static final C1680230tpF LIZIZ(final float f, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        interfaceC1680500tpg.LJJIIJZLJL(1243703285);
        if ((i & 1) != 0) {
            f = 0;
        }
        final long jU2 = C1670400tZO.LIZIZ(interfaceC1680500tpg).U2();
        ?? r2 = new InterfaceC1693230uAD(jU2, f) { // from class: X.0tpF
            public final long LIZ;
            public final float LIZIZ;
            public final InterfaceC1680960tqQ LIZJ = null;

            @Override // X.InterfaceC1680320tpO
            public final /* synthetic */ InterfaceC1680330tpP LIZ(C0NV4 c0nv4, InterfaceC1680500tpg interfaceC1680500tpg2) {
                C1680260tpI.LIZ(interfaceC1680500tpg2);
                return C1680290tpL.LL;
            }

            @Override // X.InterfaceC1693230uAD
            public final int hashCode() {
                return (C1685910tyP.LJIIJ(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
            }

            @Override // X.InterfaceC1693230uAD
            public final InterfaceC1691470u7N LIZIZ(C0NV4 c0nv4) {
                return new AbstractC594970NVf(this.LIZ, this.LIZIZ, this.LIZJ, c0nv4) { // from class: X.0tio
                    public final long LLJJIII;
                    public final float LLJJIJI;
                    public final InterfaceC1680960tqQ LLJJIJIIJIL;

                    @Override // X.InterfaceC1695680uEA
                    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
                        interfaceC1669010tX9.LLIIJLIL();
                        if (this.LLJJI) {
                            InterfaceC1680960tqQ interfaceC1680960tqQ = this.LLJJIJIIJIL;
                            if (interfaceC1680960tqQ != null) {
                                C1675860tiC.LJIIIIZZ(interfaceC1669010tX9, interfaceC1680960tqQ, this.LLJJIII, 0.0f, null, 60);
                                return;
                            }
                            if (C1668650tWZ.LIZJ(this.LLJJIJI, Float.POSITIVE_INFINITY)) {
                                C1675860tiC.LIZLLL(interfaceC1669010tX9, this.LLJJIII, Math.max(Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)), Float.intBitsToFloat((int) (4294967295L & interfaceC1669010tX9.LIZIZ()))) / 2.0f, 0L, 0.0f, null, 124);
                                return;
                            }
                            long j = this.LLJJIII;
                            float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(this.LLJJIJI);
                            float fLJJJJLL2 = interfaceC1669010tX9.LJJJJLL(this.LLJJIJI);
                            C1675860tiC.LJIIL(interfaceC1669010tX9, j, 0L, 0L, (((long) Float.floatToRawIntBits(fLJJJJLL)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL2)) & 4294967295L), null, 0, 246);
                        }
                    }

                    {
                        super(c0nv4);
                        this.LLJJIII = j;
                        this.LLJJIJI = f;
                        this.LLJJIJIIJIL = interfaceC1680960tqQ;
                    }
                };
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1680230tpF)) {
                    return false;
                }
                C1680230tpF c1680230tpF = (C1680230tpF) obj;
                if (!C1668650tWZ.LIZJ(this.LIZIZ, c1680230tpF.LIZIZ)) {
                    return false;
                }
                return C1685910tyP.LJ(this.LIZ, c1680230tpF.LIZ);
            }

            {
                this.LIZ = jU2;
                this.LIZIZ = f;
            }
        };
        interfaceC1680500tpg.LJ();
        return r2;
    }
}
