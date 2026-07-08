package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14SY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14SY extends ViewPager {
    public final Field LL;

    private final View getCurrentView() throws IllegalAccessException {
        ViewPager.LayoutParams layoutParams;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = super.getChildAt(i);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if ((layoutParams2 instanceof ViewPager.LayoutParams) && (layoutParams = (ViewPager.LayoutParams) layoutParams2) != null) {
                int i2 = this.LL.getInt(layoutParams);
                if (!layoutParams.LIZ && getCurrentItem() == i2) {
                    return childAt;
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) throws IllegalAccessException {
        Boolean boolValueOf;
        boolean z = true;
        StackTraceElement stackTraceElement = (StackTraceElement) C13LQ.LJJIIZ(1, new Throwable().getStackTrace());
        if (stackTraceElement != null) {
            if (!Intrinsics.LJFF(stackTraceElement.getClassName(), "com.google.android.material.bottomsheet.BottomSheetBehavior") || !Intrinsics.LJFF(stackTraceElement.getMethodName(), "findScrollingChild")) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return super.getChildAt(i);
        }
        View currentView = getCurrentView();
        if (currentView == null) {
            return super.getChildAt(i);
        }
        if (i == 0) {
            return currentView;
        }
        View childAt = super.getChildAt(i);
        if (Intrinsics.LJFF(childAt, currentView)) {
            return super.getChildAt(0);
        }
        return childAt;
    }

    public C14SY(Context context, AttributeSet attributeSet) throws NoSuchFieldException {
        super(context, attributeSet);
        Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
        declaredField.setAccessible(true);
        this.LL = declaredField;
        addOnPageChangeListener(new C360660ECa() { // from class: X.14SZ
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                this.LL.requestLayout();
            }
        });
    }
}
