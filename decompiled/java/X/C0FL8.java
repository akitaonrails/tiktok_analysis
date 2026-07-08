package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0FL8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FL8 implements Iterable<View>, C03W4 {
    public final /* synthetic */ ViewGroup LL;

    @Override // java.lang.Iterable
    public final Iterator<View> iterator() {
        return new C0FX4(this.LL, 1);
    }

    public C0FL8(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }
}
