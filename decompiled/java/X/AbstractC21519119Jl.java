package X;

/* JADX INFO: renamed from: X.19Jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21519119Jl extends AbstractC21519319Jn {
    public C21518919Jj[] LIZ;
    public String LIZIZ;
    public int LIZJ;
    public final int LIZLLL;

    public AbstractC21519119Jl() {
    }

    public C21518919Jj[] getPathData() {
        return this.LIZ;
    }

    public String getPathName() {
        return this.LIZIZ;
    }

    public AbstractC21519119Jl(AbstractC21519119Jl abstractC21519119Jl) {
        this.LIZIZ = abstractC21519119Jl.LIZIZ;
        this.LIZLLL = abstractC21519119Jl.LIZLLL;
        this.LIZ = C21518819Ji.LJ(abstractC21519119Jl.LIZ);
    }

    public void setPathData(C21518919Jj[] c21518919JjArr) {
        if (!C21518819Ji.LIZ(this.LIZ, c21518919JjArr)) {
            this.LIZ = C21518819Ji.LJ(c21518919JjArr);
            return;
        }
        C21518919Jj[] c21518919JjArr2 = this.LIZ;
        for (int i = 0; i < c21518919JjArr.length; i++) {
            c21518919JjArr2[i].LIZ = c21518919JjArr[i].LIZ;
            int i2 = 0;
            while (true) {
                float[] fArr = c21518919JjArr[i].LIZIZ;
                if (i2 < fArr.length) {
                    c21518919JjArr2[i].LIZIZ[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
