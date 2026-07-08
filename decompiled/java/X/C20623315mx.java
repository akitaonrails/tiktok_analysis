package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.15mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20623315mx implements Iterable<View>, C03W4 {
    public final /* synthetic */ ViewGroup LL;

    @Override // java.lang.Iterable
    public final Iterator<View> iterator() {
        return new C2500509r1(this.LL, 34);
    }

    public C20623315mx(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }
}
