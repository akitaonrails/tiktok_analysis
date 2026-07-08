package X;

import androidx.lifecycle.Observer;

/* JADX INFO: renamed from: X.0nwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453940nwG<T> implements Observer<T> {
    public static final boolean LL = C2219091BtD.LIZIZ();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        String string;
        if (LL) {
            if (t != null) {
                t.toString();
            }
        } else {
            if (t == null) {
                string = "null";
            } else {
                string = t.toString();
            }
            C2219091BtD.LIZLLL().d(string);
        }
    }
}
