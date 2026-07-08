package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0OOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618720OOo {
    public static final String LIZ(long j) {
        if (j <= 0) {
            j = 0;
        }
        if (j < 10000) {
            return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, null, null, 15), null, 0, 28));
        }
        return String.valueOf(C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
    }

    public static final void LIZIZ(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
    }
}
