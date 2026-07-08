package X;

/* JADX INFO: renamed from: X.0POF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POF extends C644230POr {
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public boolean LJFF;
    public Long LJI;
    public Long LJII;

    public final void LIZIZ() {
        if (this.LIZLLL == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LIZLLL = jCurrentTimeMillis;
            long j = jCurrentTimeMillis - this.LIZJ;
            this.LJII = Long.valueOf(j);
            LIZ(Long.valueOf(j), "net_cost");
        }
    }

    public final void LIZJ() {
        if (this.LIZLLL == -1) {
            C644210POp.LIZ.getClass();
            Integer num = C644210POp.LJ.LIZJ;
            if (num == null || num.intValue() != 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LIZLLL = jCurrentTimeMillis;
            long j = jCurrentTimeMillis - this.LIZJ;
            this.LJII = Long.valueOf(j);
            LIZ(Long.valueOf(j), "net_cost");
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchChainWholeProgressCost(cost=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", triggerNetCost=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", triggerRealRequstCost=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", netCost=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dataParseCost=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", viewDrawCost=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
