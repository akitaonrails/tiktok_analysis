package X;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Kws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533960Kws extends View {
    public final List<WeakReference<InterfaceC533950Kwr>> LL;

    public C533960Kws(Context context) {
        super(context);
        this.LL = new ArrayList();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Iterator<WeakReference<InterfaceC533950Kwr>> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            InterfaceC533950Kwr interfaceC533950Kwr = it2.next().get();
            if (interfaceC533950Kwr != null) {
                interfaceC533950Kwr.LLLLZ();
            }
        }
    }
}
