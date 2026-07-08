package X;

/* JADX INFO: renamed from: X.0NVW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NVW implements C0NVR {
    public T LIZ;
    public T LIZIZ;
    public float LIZJ = Float.NaN;
    public final /* synthetic */ C594920NVa<T> LIZLLL;

    public C0NVW(C594920NVa<T> c594920NVa) {
        this.LIZLLL = c594920NVa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C0NVR
    public final void LIZ(float f, float f2) {
        boolean z;
        Object objLIZJ;
        float f3;
        float fLIZLLL = this.LIZLLL.LIZLLL();
        ((C13FI) this.LIZLLL.LJIIIZ).LJIILJJIL(f);
        ((C13FI) this.LIZLLL.LJIIJ).LJIILJJIL(f2);
        if (Float.isNaN(fLIZLLL)) {
            return;
        }
        if (f >= fLIZLLL) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZLLL.LIZLLL() == this.LIZLLL.LIZIZ().LIZLLL(this.LIZLLL.LIZJ())) {
            float fLIZLLL2 = this.LIZLLL.LIZLLL();
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = -1.0f;
            }
            Object objLJFF = this.LIZLLL.LIZIZ().LJFF(fLIZLLL2 + f3, z);
            T tLIZJ = objLJFF;
            if (objLJFF == null) {
                tLIZJ = this.LIZLLL.LIZJ();
            }
            if (z) {
                this.LIZ = this.LIZLLL.LIZJ();
                this.LIZIZ = tLIZJ;
            } else {
                this.LIZ = tLIZJ;
                this.LIZIZ = this.LIZLLL.LIZJ();
            }
        } else {
            Object objLJFF2 = this.LIZLLL.LIZIZ().LJFF(this.LIZLLL.LIZLLL(), false);
            T tLIZJ2 = objLJFF2;
            if (objLJFF2 == null) {
                tLIZJ2 = this.LIZLLL.LIZJ();
            }
            Object objLJFF3 = this.LIZLLL.LIZIZ().LJFF(this.LIZLLL.LIZLLL(), true);
            T tLIZJ3 = objLJFF3;
            if (objLJFF3 == null) {
                tLIZJ3 = this.LIZLLL.LIZJ();
            }
            this.LIZ = tLIZJ2;
            this.LIZIZ = tLIZJ3;
        }
        this.LIZJ = Math.abs(this.LIZLLL.LIZIZ().LIZLLL(this.LIZ) - this.LIZLLL.LIZIZ().LIZLLL(this.LIZIZ));
        if (Math.abs(this.LIZLLL.LIZLLL() - this.LIZLLL.LIZIZ().LIZLLL(this.LIZLLL.LIZJ())) >= this.LIZJ / 2.0f) {
            if (z) {
                objLIZJ = this.LIZIZ;
            } else {
                objLIZJ = this.LIZ;
            }
            if (objLIZJ == null) {
                objLIZJ = this.LIZLLL.LIZJ();
            }
            if (this.LIZLLL.LIZ.invoke((Object) objLIZJ).booleanValue()) {
                this.LIZLLL.LJIIIIZZ((T) objLIZJ);
            }
        }
    }
}
