package X;

/* JADX INFO: renamed from: X.0eAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078440eAc implements InterfaceC1078490eAh {
    public boolean LIZ;
    public final /* synthetic */ C1077990e9t LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ Class<Object> LIZLLL;
    public final /* synthetic */ boolean LJ = false;

    @Override // X.InterfaceC1078490eAh
    public final void LIZ(Object... objArr) {
        Object[] objArr2;
        if (!this.LIZ) {
            this.LIZ = true;
            int i = 0;
            if (objArr.length == 0) {
                objArr2 = null;
            } else {
                objArr2 = new Object[objArr.length];
                int length = objArr.length;
                int i2 = 0;
                while (i < length) {
                    objArr2[i2] = new C1078480eAg(objArr[i]);
                    i++;
                    i2++;
                }
            }
            this.LIZIZ.LIZ.load(this.LIZJ, this.LIZLLL, this.LJ, objArr2);
        }
    }

    @Override // X.InterfaceC1078490eAh
    public final void invoke(Object obj) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZIZ.LIZ.load(this.LIZJ, this.LIZLLL, this.LJ, new C1078480eAg[]{new C1078480eAg(obj)});
        }
    }

    public C1078440eAc(C1077990e9t c1077990e9t, int i, Class cls) {
        this.LIZIZ = c1077990e9t;
        this.LIZJ = i;
        this.LIZLLL = cls;
    }
}
