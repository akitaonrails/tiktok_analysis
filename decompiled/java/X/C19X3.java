package X;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: renamed from: X.19X3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19X3 {
    public static void LIZ(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
