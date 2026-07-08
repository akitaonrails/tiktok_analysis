package X;

import android.view.View;

/* JADX INFO: renamed from: X.0S3C, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0S3C implements InterfaceC714910S2n {
    public InterfaceC715010S2x LIZ;
    public C0S3D LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;

    public abstract void LJI(InterfaceC690390R6f interfaceC690390R6f);

    public abstract void LJII();

    @Override // X.InterfaceC714910S2n
    public final void LIZ() {
        if (this.LIZLLL) {
            LJII();
            this.LIZLLL = false;
        }
    }

    public final View LJFF() {
        View view = this.LIZJ;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // X.InterfaceC714910S2n
    public final boolean LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC714910S2n
    public final void LJ(InterfaceC690390R6f interfaceC690390R6f, View view, InterfaceC715010S2x interfaceC715010S2x) {
        this.LIZJ = view;
        this.LIZ = interfaceC715010S2x;
        this.LIZIZ = new C0S3D(view);
        LJI(interfaceC690390R6f);
        this.LIZLLL = true;
    }
}
