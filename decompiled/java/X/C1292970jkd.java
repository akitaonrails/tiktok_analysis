package X;

import java.util.List;

/* JADX INFO: renamed from: X.0jkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292970jkd extends AbstractC1293220jl2<C1292760jkI, C1292760jkI> {
    public C1292970jkd() {
        super(new C1292760jkI(1.0f, 1.0f));
    }

    @Override // X.InterfaceC1293620jlg
    public final AbstractC1293310jlB<C1292760jkI, C1292760jkI> LIZ() {
        final List<C1293200jl0<V>> list = this.LIZ;
        return new AbstractC1293590jld<C1292760jkI>(list) { // from class: X.0jki
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1293310jlB
            public final Object LJFF(C1293200jl0 c1293200jl0, float f) {
                T t;
                T t2 = c1293200jl0.LIZIZ;
                if (t2 != 0 && (t = c1293200jl0.LIZJ) != 0) {
                    C1292760jkI c1292760jkI = (C1292760jkI) t2;
                    C1292760jkI c1292760jkI2 = (C1292760jkI) t;
                    C1292420jjk<A> c1292420jjk = this.LJ;
                    if (c1292420jjk != 0) {
                        c1293200jl0.LJFF.floatValue();
                        LIZLLL();
                        return c1292420jjk.LIZ(c1292760jkI, c1292760jkI2);
                    }
                    float f2 = c1292760jkI.LIZ;
                    float f3 = f2 + ((c1292760jkI2.LIZ - f2) * f);
                    float f4 = c1292760jkI.LIZIZ;
                    return new C1292760jkI(f3, f4 + (f * (c1292760jkI2.LIZIZ - f4)));
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        };
    }

    public C1292970jkd(C1292760jkI c1292760jkI) {
        super(c1292760jkI);
    }

    public C1292970jkd(List<C1293200jl0<C1292760jkI>> list) {
        super((List) list);
    }
}
