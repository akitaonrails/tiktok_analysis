package X;

import X.C06OO;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.06c9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1643906c9<T extends C06OO, V extends View> extends C06OD<T> {
    public final ViewGroup LLILLL;
    public final int LLILZ;
    public V LLILZIL;

    @Override // X.C06OD
    public final void LJIIIIZZ() {
        ViewGroup viewGroup = this.LLILLL;
        int i = this.LLILZ;
        C786410Ut5.LJJJJI(viewGroup);
        V v = (V) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
        viewGroup.addView(v);
        this.LLILZIL = v;
    }

    @Override // X.C06OD
    public void LJ(T t) {
        C786410Ut5.LJJJJI(this.LLILLL);
        this.LLILZIL = null;
    }

    public AbstractC1643906c9(EnumC1596306Mv enumC1596306Mv, ViewGroup viewGroup, int i) {
        super(enumC1596306Mv);
        this.LLILLL = viewGroup;
        this.LLILZ = i;
    }
}
