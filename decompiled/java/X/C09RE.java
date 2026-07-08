package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09RE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RE implements Iterator<View>, C03W4 {
    public int LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        ViewGroup viewGroup = this.LLILLJJLI;
        int i = this.LL;
        this.LL = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.LLILLJJLI;
        int i = this.LL - 1;
        this.LL = i;
        C786410Ut5.LJJLIL(i, viewGroup);
    }

    public C09RE(ViewGroup viewGroup) {
        this.LLILLJJLI = viewGroup;
    }
}
