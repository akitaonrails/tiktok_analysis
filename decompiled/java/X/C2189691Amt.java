package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1Amt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189691Amt implements Iterable, C03W4 {
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
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(C2189691Amt c2189691Amt) {
        return new C2500509r1((ViewGroup) c2189691Amt.l0, 1);
    }

    public static final Iterator iterator$1(C2189691Amt c2189691Amt) {
        return new C2500509r1((ViewGroup) c2189691Amt.l0, 28);
    }

    public static final Iterator iterator$2(C2189691Amt c2189691Amt) {
        return new C2500509r1((ViewGroup) c2189691Amt.l0, 32);
    }

    public C2189691Amt(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
