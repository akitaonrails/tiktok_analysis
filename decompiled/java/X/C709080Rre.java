package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.crash.Npth;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709080Rre extends FrameLayout {
    public static final List<Integer> LL = Collections.singletonList(Integer.valueOf(R.id.video_adapted_wrapper_container));

    public C709080Rre(Context context) {
        this(context, null, 6);
    }

    public C709080Rre(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (f > C418440Gaw.LIZIZ(Integer.valueOf(((Number) C709100Rrg.LIZ.getValue()).intValue())) || f < 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TranslationY changed to: ");
            sbLIZ.append(f);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i = C709090Rrf.LJ;
            new C709090Rrf("VideoContainerFrameLayout").LJIIIZ(strLIZIZ);
            Npth.reportBizException("VideoContainerFrameLayout", new Throwable(strLIZIZ), strLIZIZ, (Map<String, String>) new HashMap(), true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public C709080Rre(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0DR8.LJLLILLLL.getClass();
        if (C0DR7.LIZ(view) && super.drawChild(canvas, view, j)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!C20562515d9.LJ) {
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (LL.contains(Integer.valueOf(childAt.getId()))) {
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
        }
    }
}
