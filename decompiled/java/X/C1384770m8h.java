package X;

/* JADX INFO: renamed from: X.0m8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384770m8h implements InterfaceC1396960mSM {
    public float LIZ;
    public int LIZIZ;
    public final C0VVS LIZJ = new C0VVS();
    public final C1384750m8f LIZLLL;

    public C1384770m8h(C1384750m8f c1384750m8f) {
        this.LIZLLL = c1384750m8f;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sYq, X.1BqW] */
    @Override // X.InterfaceC1396960mSM
    public final void LIZ(long... jArr) {
        if (jArr.length != 2) {
            return;
        }
        float f = (jArr[1] - jArr[0]) / 1000000;
        float fLIZ = this.LIZJ.LIZ();
        ?? r3 = this.LIZLLL.LJIIIZ.LIZ;
        if (r3 != 0) {
            r3.invoke(Integer.valueOf(this.LIZIZ), Float.valueOf(f), Float.valueOf(fLIZ));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.1BqW, kotlin.jvm.functions.Function1] */
    @Override // X.InterfaceC1396960mSM
    public final void LIZIZ(long... jArr) {
        if (jArr.length == 2) {
            if (jArr[0] > 0) {
                float f = (jArr[1] - r3) / 1000000;
                ?? r1 = this.LIZLLL.LJIIIZ.LIZJ;
                if (r1 != 0) {
                    r1.invoke(Float.valueOf(f));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.1BqW, kotlin.jvm.functions.Function2] */
    @Override // X.InterfaceC1396960mSM
    public final void LIZJ(int i, long... jArr) {
        if (jArr.length != 4) {
            return;
        }
        this.LIZ = (jArr[3] - jArr[0]) / 1000000;
        this.LIZIZ = i;
        ?? r2 = this.LIZLLL.LJIIIZ.LIZIZ;
        if (r2 != 0) {
            r2.invoke(Integer.valueOf(i), Float.valueOf(this.LIZ));
        }
    }
}
