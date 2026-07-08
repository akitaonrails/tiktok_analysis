package X;

/* JADX INFO: renamed from: X.0PO3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PO3 {
    public final C0POK LIZ;

    public C0PO3() {
        C0POK c0pok = new C0POK();
        this.LIZ = c0pok;
        c0pok.LLJJ = C0PO4.LIZ;
    }

    public final void LIZ(C0PSG c0psg) {
        int i;
        if (c0psg != null) {
            C0POK c0pok = this.LIZ;
            c0pok.LLJ = c0psg;
            c0pok.LLJILJILJ = Integer.valueOf(c0psg.getSortType());
            this.LIZ.LLJILLL = Integer.valueOf(c0psg.getFilterBy());
            C0POK c0pok2 = this.LIZ;
            if (c0psg.isDefaultOption() && c0psg.isDefaultResearchOption()) {
                i = 0;
            } else {
                i = 1;
            }
            c0pok2.LLJILJIL = Integer.valueOf(i);
        }
    }
}
