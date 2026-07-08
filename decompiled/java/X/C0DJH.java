package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0DJH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJH implements Iterable<View>, C03W4 {
    public final /* synthetic */ ViewGroup LL;

    @Override // java.lang.Iterable
    public final Iterator<View> iterator() {
        return new C2500509r1(this.LL, 8);
    }

    public C0DJH(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }
}
