package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0jn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1294520jn8<V, O> implements InterfaceC1294490jn5<V, O> {
    public final List<C1294810jnb<V>> LIZ;

    @Override // X.InterfaceC1294490jn5
    public final boolean LIZJ() {
        return this.LIZ.isEmpty() || (this.LIZ.size() == 1 && ((C1294810jnb) ListProtector.get(this.LIZ, 0)).LIZJ());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.LIZ.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.LIZ.toArray()));
        }
        return sb.toString();
    }

    @Override // X.InterfaceC1294490jn5
    public final List<C1294810jnb<V>> LIZIZ() {
        return this.LIZ;
    }

    public AbstractC1294520jn8(List<C1294810jnb<V>> list) {
        this.LIZ = list;
    }
}
