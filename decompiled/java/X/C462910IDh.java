package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0IDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462910IDh implements Iterable, C03W4 {
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
            case 4:
                return iterator$4(this);
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(C462910IDh c462910IDh) {
        return new C462890IDf((ViewGroup) c462910IDh.l0, 0);
    }

    public static final Iterator iterator$1(C462910IDh c462910IDh) {
        return new C462890IDf((ViewGroup) c462910IDh.l0, 1);
    }

    public static final Iterator iterator$2(C462910IDh c462910IDh) {
        return new C462890IDf((ViewGroup) c462910IDh.l0, 2);
    }

    public static final Iterator iterator$3(C462910IDh c462910IDh) {
        return new C462890IDf((ViewGroup) c462910IDh.l0, 3);
    }

    public static final Iterator iterator$4(C462910IDh c462910IDh) {
        return new C462890IDf((ViewGroup) c462910IDh.l0, 4);
    }

    public C462910IDh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
