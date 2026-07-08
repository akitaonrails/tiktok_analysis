package X;

import Y.ARunnableS5S1000000_9;
import android.app.Application;

/* JADX INFO: renamed from: X.0NNY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NNY {
    public static final C0NNY LIZ = new C0NNY();

    public static final void LIZ(int i) {
        String string;
        Application applicationLIZ = C1BWL.LIZ();
        C0NNY c0nny = LIZ;
        if (applicationLIZ != null) {
            string = applicationLIZ.getString(i);
        } else {
            string = null;
        }
        c0nny.onEvent(string);
    }

    public final void onEvent(String str) {
        if (str != null) {
            C09UZ.LIZ(new ARunnableS5S1000000_9(str, 5));
        }
    }
}
