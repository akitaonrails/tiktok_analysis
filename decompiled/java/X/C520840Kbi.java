package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: renamed from: X.0Kbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520840Kbi {
    public static TuxSheetBehavior LIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C16G1) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (c16bc instanceof TuxSheetBehavior) {
                return (TuxSheetBehavior) c16bc;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The view is not associated with TuxSheetBehavior. behavior: ");
            sbLIZ.append(c16bc);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("The view is not a child of CoordinatorLayout. view: ");
        sbLIZ2.append(view);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
