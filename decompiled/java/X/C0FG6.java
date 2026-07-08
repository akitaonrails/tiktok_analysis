package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0FG6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FG6 extends FrameLayout {
    public List<? extends ImageUrlModel> LL;

    public final void setAvatars(List<? extends ImageUrlModel> list) {
        this.LL = C13LP.LL(list, 4);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        if (this.LL.size() == 3) {
            LIZ((ImageUrlModel) ListProtector.get(this.LL, 0), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 83);
            LIZ((ImageUrlModel) ListProtector.get(this.LL, 1), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, 53);
            LIZ((ImageUrlModel) ListProtector.get(this.LL, 2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, 51);
        } else {
            if (this.LL.size() < 4) {
                return;
            }
            LIZ((ImageUrlModel) ListProtector.get(this.LL, 0), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 83);
            LIZ((ImageUrlModel) ListProtector.get(this.LL, 1), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 85);
            LIZ((ImageUrlModel) ListProtector.get(this.LL, 2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 53);
            LIZ((ImageUrlModel) ListProtector.get(this.LL, 3), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), null, null, 51);
        }
    }

    public C0FG6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C13BV.INSTANCE;
    }

    public final void LIZ(ImageUrlModel imageUrlModel, int i, Integer num, Integer num2, Integer num3, Integer num4, int i2) {
        C427660Gpo c427660Gpo = new C427660Gpo(getContext(), null, 6, 0);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c427660Gpo.setPlaceholderImage(c419910GdJ.LIZ(c427660Gpo.getContext()));
        C427660Gpo.LJIIJJI(c427660Gpo, imageUrlModel, false, null, null, false, false, null, null, false, null, 1022);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = i2;
        if (num != null) {
            layoutParams.leftMargin = num.intValue();
        }
        if (num2 != null) {
            layoutParams.topMargin = num2.intValue();
        }
        if (num3 != null) {
            layoutParams.rightMargin = num3.intValue();
        }
        if (num4 != null) {
            layoutParams.bottomMargin = num4.intValue();
        }
        addView(c427660Gpo, layoutParams);
    }
}
