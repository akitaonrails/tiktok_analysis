package X;

/* JADX INFO: renamed from: X.18zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21465418zU implements InterfaceC21680419t4 {
    public long LIZ;

    @Override // X.InterfaceC21680419t4
    public final InterfaceC21465518zV LIZ() {
        return new InterfaceC21465518zV() { // from class: X.18zT
            public final C20066713fN<Long> LIZ = new C20066713fN<>();

            @Override // X.InterfaceC21465518zV
            public final long LIZ(long j) {
                Long lLJ = this.LIZ.LJ(j);
                if (lLJ == null) {
                    C21465418zU c21465418zU = this.LIZIZ;
                    long j2 = c21465418zU.LIZ;
                    c21465418zU.LIZ = 1 + j2;
                    lLJ = Long.valueOf(j2);
                    this.LIZ.LJIIIZ(j, lLJ);
                }
                return lLJ.longValue();
            }
        };
    }
}
