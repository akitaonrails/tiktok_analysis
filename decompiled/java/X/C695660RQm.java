package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0RQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695660RQm {
    public static final C695660RQm LIZ = new C695660RQm();

    public static Rect LIZIZ(View view) {
        int[] iArr = {0, 0};
        if (view == null) {
            return null;
        }
        View view2 = view;
        while (!(view2 instanceof VideoViewCellRootView)) {
            iArr[0] = iArr[0] + view2.getLeft();
            iArr[1] = iArr[1] + view2.getTop();
            Object parent = view2.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                throw new RuntimeException("View has no ancestor View of the provided ancestor View");
            }
        }
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    public static Rect LIZ(C695660RQm c695660RQm, View view) {
        ViewGroup viewGroup;
        c695660RQm.getClass();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && childAt.getWidth() != 0 && childAt.getHeight() != 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (1 > arrayList.size()) {
            return null;
        }
        return LIZIZ(viewGroup.getChildAt(((Number) ListProtector.get(arrayList, 0)).intValue()));
    }
}
