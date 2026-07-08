package X;

/* JADX INFO: renamed from: X.0u7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691780u7s implements InterfaceC1690500u5o {
    public C1692150u8T LL;
    public final /* synthetic */ C1691770u7r LLILLJJLI;

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLILLJJLI.LJIIJ.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LLILLJJLI.LJIIJ.getDensity();
    }

    public C1691780u7s(C1691770u7r c1691770u7r) {
        this.LLILLJJLI = c1691770u7r;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJLLL(long j) {
        if (C1682440tso.LJ(j)) {
            if (!C1682440tso.LJ(this.LLILLJJLI.LJIIJJI.LIZ.LIZIZ)) {
                long j2 = this.LLILLJJLI.LJIIJJI.LIZ.LIZIZ;
                C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
                if (!C1682440tso.LIZ(j2, C1682440tso.LIZJ)) {
                    return LJLLL(this.LLILLJJLI.LJIIJJI.LIZ.LIZIZ) * C1682440tso.LIZLLL(j);
                }
                "InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.".toString();
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
            "InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.".toString();
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
        }
        return C1685230txJ.LIZ(this, j) * getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }

    public final C1692150u8T LIZLLL(long j, long j2) {
        long jLJI = j;
        long jLIZ = j2;
        C1693430uAX c1693430uAX = this.LLILLJJLI.LJIIJJI;
        if (C1682440tso.LJ(jLIZ)) {
            jLIZ = C1678150tlt.LIZ(this.LLILLJJLI.LJIIJJI.LIZ.LIZIZ, jLIZ);
        }
        if (!C1682440tso.LIZ(jLIZ, this.LLILLJJLI.LJIIJJI.LIZ.LIZIZ)) {
            C1691770u7r c1691770u7r = this.LLILLJJLI;
            c1691770u7r.LJ(C1693430uAX.LIZ(0, 0, 16777213, 0L, jLIZ, 0L, 0L, null, c1691770u7r.LJIIJJI, null, null));
        }
        C1691770u7r c1691770u7r2 = this.LLILLJJLI;
        if (c1691770u7r2.LJFF > 1) {
            jLJI = c1691770u7r2.LJI(jLJI, c1691770u7r2.LJIILIIL);
        }
        C1691770u7r c1691770u7r3 = this.LLILLJJLI;
        C1692200u8Y c1692200u8YLIZIZ = c1691770u7r3.LIZIZ(jLJI, c1691770u7r3.LJIILIIL);
        C1691770u7r c1691770u7r4 = this.LLILLJJLI;
        C1692150u8T c1692150u8TLJFF = c1691770u7r4.LJFF(c1691770u7r4.LJIILIIL, jLJI, c1692200u8YLIZIZ);
        this.LL = c1692150u8TLJFF;
        this.LLILLJJLI.LJ(c1693430uAX);
        return c1692150u8TLJFF;
    }
}
