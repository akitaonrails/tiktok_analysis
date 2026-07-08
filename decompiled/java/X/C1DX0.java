package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1DX0, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DX0 extends C1DXM implements C1DXL {
    public List<C1DXF> LJII = new ArrayList();

    @Override // X.C1DXL
    public final List<C1DXF> LIZ() {
        return this.LJII;
    }

    @Override // X.C1DXL
    public final void LIZJ(C1DX1 c1dx1) {
        this.LJII.add(c1dx1);
    }
}
