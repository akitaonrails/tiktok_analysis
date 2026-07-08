package X;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: X.07tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2007307tf {
    public final String LIZ;
    public Lifecycle.Event LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('/');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2007307tf(Activity activity, Lifecycle.Event event) {
        String string = activity.toString();
        activity.hashCode();
        this.LIZ = string;
        this.LIZIZ = event;
    }
}
