package X;

/* JADX INFO: renamed from: X.0eAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078470eAf implements InterfaceC1078490eAh {
    public boolean LIZ;
    public final /* synthetic */ C1077990e9t LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ Class<Object> LIZLLL;
    public final /* synthetic */ Object[] LJ;

    @Override // X.InterfaceC1078490eAh
    public final /* synthetic */ void LIZ(Object... objArr) {
    }

    @Override // X.InterfaceC1078490eAh
    public final void invoke(Object obj) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZIZ.LIZ.load(this.LIZJ, this.LIZLLL, false, new Object[]{this.LJ, new C1078480eAg(obj)});
        }
    }

    public C1078470eAf(C1077990e9t c1077990e9t, int i, Class<Object> cls, Object[] objArr) {
        this.LIZIZ = c1077990e9t;
        this.LIZJ = i;
        this.LIZLLL = cls;
        this.LJ = objArr;
    }
}
