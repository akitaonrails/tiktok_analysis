package X;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0wJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776010wJj implements Iterable, C03W4 {
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

    public static final Iterator iterator$0(C1776010wJj c1776010wJj) {
        return new C2500509r1((ViewGroup) c1776010wJj.l0, 20);
    }

    public static final Iterator iterator$1(C1776010wJj c1776010wJj) {
        return new C2500509r1((ViewGroup) c1776010wJj.l0, 21);
    }

    public C1776010wJj(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
