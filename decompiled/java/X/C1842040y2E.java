package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: X.0y2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842040y2E {
    public static final DataBinderMapperImpl LIZ = new DataBinderMapperImpl();

    public static <T extends ViewDataBinding> T LIZ(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, C03GW c03gw) {
        boolean z2;
        int childCount;
        if (viewGroup != null && z) {
            z2 = true;
            childCount = viewGroup.getChildCount();
        } else {
            z2 = false;
            childCount = 0;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, z);
        if (z2) {
            int childCount2 = viewGroup.getChildCount();
            int i2 = childCount2 - childCount;
            if (i2 == 1) {
                return (T) LIZ.LIZIZ(c03gw, viewGroup.getChildAt(childCount2 - 1), i);
            }
            View[] viewArr = new View[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                viewArr[i3] = viewGroup.getChildAt(i3 + childCount);
            }
            return (T) LIZ.LIZJ(c03gw, viewArr, i);
        }
        return (T) LIZ.LIZIZ(c03gw, viewTd, i);
    }
}
