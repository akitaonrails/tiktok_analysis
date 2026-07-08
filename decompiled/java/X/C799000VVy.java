package X;

/* JADX INFO: renamed from: X.0VVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799000VVy implements InterfaceC798880VVm {
    public final String LIZ;
    public int LIZIZ = 1;
    public boolean LIZJ;

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_drop_count_index_");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C799000VVy(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC798880VVm
    public final void LIZ(long j, long j2) {
        C0VWE c0vwe = C798980VVw.LIZLLL;
        C0VWB c0vwb = null;
        if (c0vwe == null) {
            c0vwe = null;
        }
        if (c0vwe.LIZ(j, j2)) {
            C0VWB c0vwb2 = C798980VVw.LJ;
            if (c0vwb2 == null) {
                c0vwb2 = null;
            }
            c0vwb2.LIZ(LIZIZ());
            this.LIZIZ++;
            C0VWB c0vwb3 = C798980VVw.LJ;
            if (c0vwb3 != null) {
                c0vwb = c0vwb3;
            }
            c0vwb.LIZIZ(LIZIZ());
        }
    }
}
