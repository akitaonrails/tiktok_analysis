package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0jlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293550jlZ extends AbstractC1293220jl2<C1293680jlm, C1293680jlm> {
    @Override // X.InterfaceC1293620jlg
    public final AbstractC1293310jlB<C1293680jlm, C1293680jlm> LIZ() {
        final List<C1293200jl0<V>> list = this.LIZ;
        return new AbstractC1293590jld<C1293680jlm>(list) { // from class: X.0jlC
            public final C1293680jlm LJI;

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(list);
                C1293680jlm c1293680jlm = (C1293680jlm) ((C1293200jl0) ListProtector.get(list, 0)).LIZIZ;
                int length = c1293680jlm != null ? c1293680jlm.LIZIZ.length : 0;
                this.LJI = new C1293680jlm(new float[length], new int[length]);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1293310jlB
            public final Object LJFF(C1293200jl0 c1293200jl0, float f) {
                C1293680jlm c1293680jlm = this.LJI;
                C1293680jlm c1293680jlm2 = (C1293680jlm) c1293200jl0.LIZIZ;
                C1293680jlm c1293680jlm3 = (C1293680jlm) c1293200jl0.LIZJ;
                c1293680jlm.getClass();
                if (c1293680jlm2.LIZIZ.length == c1293680jlm3.LIZIZ.length) {
                    int i = 0;
                    while (true) {
                        int[] iArr = c1293680jlm2.LIZIZ;
                        if (i < iArr.length) {
                            float[] fArr = c1293680jlm.LIZ;
                            float f2 = c1293680jlm2.LIZ[i];
                            fArr[i] = f2 + ((c1293680jlm3.LIZ[i] - f2) * f);
                            c1293680jlm.LIZIZ[i] = C1293090jkp.LIZJ(f, iArr[i], c1293680jlm3.LIZIZ[i]);
                            i++;
                        } else {
                            return this.LJI;
                        }
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot interpolate between gradients. Lengths vary (");
                    sbLIZ.append(c1293680jlm2.LIZIZ.length);
                    sbLIZ.append(" vs ");
                    sbLIZ.append(c1293680jlm3.LIZIZ.length);
                    sbLIZ.append(")");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
    }

    public C1293550jlZ(List<C1293200jl0<C1293680jlm>> list) {
        super((List) list);
    }
}
