package X;

/* JADX INFO: renamed from: X.19VT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19VT implements C19WE {
    public boolean LIZ;
    public int LIZIZ;
    public final /* synthetic */ C19VF LIZJ;

    @Override // X.C19WE
    public final void LIZJ() {
        this.LIZ = true;
    }

    @Override // X.C19WE
    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        C19VF c19vf = this.LIZJ;
        c19vf.LLILZLL = null;
        super/*android.view.ViewGroup*/.setVisibility(this.LIZIZ);
    }

    @Override // X.C19WE
    public final void LIZIZ() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.LIZ = false;
    }

    public C19VT(C19VF c19vf) {
        this.LIZJ = c19vf;
    }
}
