package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0O6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613980O6i {
    public final List<InterfaceC613990O6j> LIZ;
    public int LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C613980O6i(List<? extends InterfaceC613990O6j> list) {
        this.LIZ = list;
    }

    public final <D extends InterfaceC613710O5h> InterfaceC346201Wa<C0O7A<D>> LIZ(C613970O6h<D> c613970O6h) {
        List<InterfaceC613990O6j> list = this.LIZ;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        return ((InterfaceC613990O6j) ListProtector.get(list, i)).LIZ(c613970O6h, this);
    }
}
