package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0I2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460180I2u {
    public static final View LIZ(int i, ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index: ");
        sbLIZ.append(i);
        sbLIZ.append(", Size: ");
        sbLIZ.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
