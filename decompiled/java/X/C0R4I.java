package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0R4I, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4I implements Iterable, C03W4 {
    public final int $t;
    public Object l0;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.$t) {
            case 0:
                return iterator$0(this);
            case 1:
                return iterator$1(this);
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(C0R4I c0r4i) {
        return new C0R4G((ViewGroup) c0r4i.l0, 0);
    }

    public static final Iterator iterator$1(C0R4I c0r4i) {
        return new C0R4G((ViewGroup) c0r4i.l0, 1);
    }

    public C0R4I(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
