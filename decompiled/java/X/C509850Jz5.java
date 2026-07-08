package X;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Jz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509850Jz5 extends C21578619ce {
    public final List<InterfaceC509940JzE> LL;

    public C509850Jz5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C509850Jz5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList();
    }

    @Override // X.C21578619ce, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator<InterfaceC509940JzE> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onScrollChanged(i, i2, i3, i4);
        }
    }
}
