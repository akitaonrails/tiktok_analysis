package X;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0JdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496260JdA extends C21578619ce {
    public final List<InterfaceC496390JdN> LL;

    public C496260JdA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C496260JdA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList();
    }

    @Override // X.C21578619ce, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC496390JdN) it2.next()).LIZ(this, i2);
        }
    }
}
