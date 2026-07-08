package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.15xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20691215xu {
    public static final Field LIZ;

    static {
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            LIZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static View LIZ(ViewPager viewPager) {
        int i = 0;
        if (viewPager != null && (viewPager instanceof C21594419fC)) {
            C21594419fC c21594419fC = (C21594419fC) viewPager;
            int currentItem = viewPager.getCurrentItem();
            while (i < viewPager.getChildCount()) {
                View childAt = viewPager.getChildAt(i);
                ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                try {
                    int iIntValue = ((Integer) LIZ.get(layoutParams)).intValue();
                    if (c21594419fC.LIZJ()) {
                        iIntValue = (c21594419fC.getItemCount() - iIntValue) - 1;
                    }
                    if (!layoutParams.LIZ && currentItem == iIntValue) {
                        return childAt;
                    }
                    i++;
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
            return null;
        }
        if (viewPager != null) {
            int currentItem2 = viewPager.getCurrentItem();
            while (i < viewPager.getChildCount()) {
                View childAt2 = viewPager.getChildAt(i);
                ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) childAt2.getLayoutParams();
                try {
                    int iIntValue2 = ((Integer) LIZ.get(layoutParams2)).intValue();
                    if (!layoutParams2.LIZ && currentItem2 == iIntValue2) {
                        return childAt2;
                    }
                    i++;
                } catch (IllegalAccessException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new RuntimeException(e2);
                }
            }
        }
        return null;
    }
}
