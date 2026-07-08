package X;

import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: X.0iCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233310iCP {
    public final Fragment LIZ;
    public final C21578619ce LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public final int LJ;
    public final ViewOnTouchListenerC1233300iCO LJFF = new ViewOnTouchListenerC1233300iCO();
    public EnumC1228990i5R LJI = EnumC1228990i5R.PRIVATE_GROUP;

    public final void LIZ(boolean z) {
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        String str = TuxSheet._pnsPageId;
        C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(this.LIZ);
        if (c16bcLJIIIZ == null) {
            return;
        }
        if (C299110Bnx.LIZ()) {
            if ((c16bcLJIIIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJIIIZ) != null && tuxSheetBehavior.LJIJI != z) {
                tuxSheetBehavior.LJIJI = z;
                return;
            }
            return;
        }
        if (!(c16bcLJIIIZ instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) == null || bottomSheetBehavior.isDraggable() == z) {
            return;
        }
        bottomSheetBehavior.setDraggable(z);
    }

    public C1233310iCP(Fragment fragment, C21578619ce c21578619ce) {
        this.LIZ = fragment;
        this.LIZIZ = c21578619ce;
        this.LJ = ViewConfiguration.get(fragment.requireContext()).getScaledTouchSlop();
    }
}
