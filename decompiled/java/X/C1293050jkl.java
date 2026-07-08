package X;

import java.util.List;

/* JADX INFO: renamed from: X.0jkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293050jkl extends AbstractC1293220jl2<Integer, Integer> {
    @Override // X.InterfaceC1293620jlg
    public final AbstractC1293310jlB<Integer, Integer> LIZ() {
        final List<C1293200jl0<V>> list = this.LIZ;
        return new AbstractC1293590jld<Integer>(list) { // from class: X.0jkm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1293310jlB
            public final Object LJFF(C1293200jl0 c1293200jl0, float f) {
                T t = c1293200jl0.LIZIZ;
                if (t != 0 && c1293200jl0.LIZJ != 0) {
                    int iIntValue = ((Integer) t).intValue();
                    int iIntValue2 = ((Integer) c1293200jl0.LIZJ).intValue();
                    C1292420jjk<A> c1292420jjk = this.LJ;
                    if (c1292420jjk != 0) {
                        c1293200jl0.LJFF.floatValue();
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        Integer numValueOf2 = Integer.valueOf(iIntValue2);
                        LIZLLL();
                        return c1292420jjk.LIZ(numValueOf, numValueOf2);
                    }
                    return Integer.valueOf(C1293090jkp.LIZJ(f, iIntValue, iIntValue2));
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        };
    }

    public C1293050jkl(List<C1293200jl0<Integer>> list) {
        super((List) list);
    }
}
