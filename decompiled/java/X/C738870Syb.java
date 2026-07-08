package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Syb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738870Syb implements Iterable, C03W4 {
    public final int $t;
    public Object l0;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.$t) {
            case 0:
                return iterator$0(this);
            case 1:
                return iterator$1(this);
            case 2:
                return iterator$2(this);
            case 3:
                return iterator$3(this);
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(C738870Syb c738870Syb) {
        return new C738850SyZ((ViewGroup) c738870Syb.l0, 0);
    }

    public static final Iterator iterator$1(C738870Syb c738870Syb) {
        return new C738850SyZ((ViewGroup) c738870Syb.l0, 1);
    }

    public static final Iterator iterator$2(C738870Syb c738870Syb) {
        return new C738850SyZ((ViewGroup) c738870Syb.l0, 2);
    }

    public static final Iterator iterator$3(C738870Syb c738870Syb) {
        return new C738850SyZ((ViewGroup) c738870Syb.l0, 3);
    }

    public C738870Syb(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
