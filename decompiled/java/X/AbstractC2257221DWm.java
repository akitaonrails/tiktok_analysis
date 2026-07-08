package X;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1DWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2257221DWm extends C1DX1 implements C1DXL {
    public List<C1DXF> LJI = new ArrayList();
    public Boolean LJII;
    public Matrix LJIIIIZZ;
    public EnumC2213311Bjt LJIIIZ;
    public String LJIIJ;

    @Override // X.C1DXL
    public final List<C1DXF> LIZ() {
        return this.LJI;
    }

    @Override // X.C1DXL
    public final void LIZJ(C1DX1 c1dx1) throws C1324260kZ6 {
        if (c1dx1 instanceof C2257341DWy) {
            this.LJI.add(c1dx1);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gradient elements cannot contain ");
        sbLIZ.append(c1dx1);
        sbLIZ.append(" elements.");
        throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ));
    }
}
