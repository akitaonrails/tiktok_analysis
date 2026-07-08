package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0pWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514840pWU extends WeakReference<View> {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1514840pWU(View view) {
        super(view, C1514850pWV.LIZIZ);
        this.LIZ = C1955407lI.LIZLLL(view);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1514840pWU)) {
            return false;
        }
        return C1514850pWV.LIZIZ.equals(((C1514840pWU) obj).LIZ);
    }
}
