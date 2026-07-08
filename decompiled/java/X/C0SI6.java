package X;

import android.text.Layout;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SI6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SI6 {
    public static final boolean LIZ(Layout layout) {
        if (layout == null) {
            return false;
        }
        return a0.LJJIIZI(layout.getText(), "…", false);
    }

    public static final boolean LIZIZ(Layout layout) {
        if (layout == null || layout.getLineCount() <= 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Layout layout, String str) {
        if (layout == null) {
            return false;
        }
        CharSequence text = layout.getText();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 8230);
        sbLIZ.append(str);
        return a0.LJJIJIL(text, C2188811AlT.LIZIZ(sbLIZ));
    }
}
