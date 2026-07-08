package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0m2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381030m2f implements Iterable<View>, C03W4 {
    public final /* synthetic */ ViewGroup LL;

    @Override // java.lang.Iterable
    public final Iterator<View> iterator() {
        return new C1077410e8x(this.LL, 35);
    }

    public C1381030m2f(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }
}
