package X;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1312670kGP implements InterfaceC1301080jxi {
    public final WeakReference<C1316700kMu> LIZ;

    public C1312670kGP(C1316700kMu c1316700kMu) {
        this.LIZ = new WeakReference<>(c1316700kMu);
    }

    @Override // X.InterfaceC1301080jxi
    public final void LIZIZ(Typeface typeface, int i) {
        this.LIZ.get();
    }
}
