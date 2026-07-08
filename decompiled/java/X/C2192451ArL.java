package X;

/* JADX INFO: renamed from: X.1ArL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192451ArL {
    public C0XJF LIZ;
    public C1607906Rh LIZIZ;
    public C2192461ArM LIZJ;
    public String LIZLLL;

    public final void LIZ(String str) {
        C2192461ArM c2192461ArM = this.LIZJ;
        if (c2192461ArM == null) {
            this.LIZJ = new C2192461ArM(str);
            return;
        }
        C2192461ArM c2192461ArM2 = new C2192461ArM(str);
        while (c2192461ArM != null) {
            if (c2192461ArM.LIZIZ != null) {
                C2192461ArM c2192461ArM3 = this.LIZJ;
                if (c2192461ArM3 == null) {
                    return;
                } else {
                    c2192461ArM = c2192461ArM3.LIZIZ;
                }
            } else {
                if (c2192461ArM == null) {
                    return;
                }
                c2192461ArM.LIZIZ = c2192461ArM2;
                return;
            }
        }
    }
}
