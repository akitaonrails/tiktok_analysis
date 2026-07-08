package X;

import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0Glg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425100Glg {
    public static final FrameLayout.LayoutParams LIZ(List<Integer> list) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 0))));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 1)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 2))));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list, 3)));
        return layoutParams;
    }
}
