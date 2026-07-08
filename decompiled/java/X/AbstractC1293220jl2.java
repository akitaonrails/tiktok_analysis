package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0jl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1293220jl2<V, O> implements InterfaceC1293620jlg<V, O> {
    public final List<C1293200jl0<V>> LIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.LIZ.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.LIZ.toArray()));
        }
        return sb.toString();
    }

    public AbstractC1293220jl2(V v) {
        this(Collections.singletonList(new C1293200jl0(v)));
    }

    public AbstractC1293220jl2(List<C1293200jl0<V>> list) {
        this.LIZ = list;
    }
}
