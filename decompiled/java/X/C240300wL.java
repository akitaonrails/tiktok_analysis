package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: X.00wL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C240300wL {
    public final String LIZ;
    public final Lifecycle.Event LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('/');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C240300wL)) {
            return false;
        }
        C240300wL c240300wL = (C240300wL) obj;
        if (!TextUtils.equals(this.LIZ, c240300wL.LIZ) || this.LIZIZ != c240300wL.LIZIZ) {
            return false;
        }
        return true;
    }

    public C240300wL(Activity activity, Lifecycle.Event event) {
        this.LIZ = activity.toString();
        this.LIZIZ = event;
        this.LIZJ = activity.getClass().getName();
        activity.hashCode();
    }
}
