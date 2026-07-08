package X;

/* JADX INFO: renamed from: X.15sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20656115sF implements Comparable<C20656115sF> {
    public final AbstractC20656215sG LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC20658015sY LLILZ;
    public final AbstractC20661115t3 LLILZIL;
    public AbstractC20656215sG LLILZLL = C20659515sn.LL;
    public String LLIZ = "";
    public final C20656515sJ LLIZLLLIL = new C20656515sJ();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            id = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(",\n            priority = ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(",\n            scene = ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(",\n            dependency = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(",\n            mTask = ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append("\n        ");
        return C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C20656115sF(AbstractC20656215sG abstractC20656215sG) {
        this.LL = abstractC20656215sG;
        this.LLILLJJLI = abstractC20656215sG.getId();
        this.LLILLL = abstractC20656215sG.getPriority();
        this.LLILZ = abstractC20656215sG.scene;
        this.LLILZIL = abstractC20656215sG.getDependency();
    }

    @Override // java.lang.Comparable
    public final int compareTo(C20656115sF c20656115sF) {
        if (this.LLILLL > c20656115sF.LLILLL) {
            return 1;
        }
        return -1;
    }
}
