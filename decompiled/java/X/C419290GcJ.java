package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419290GcJ extends LinearLayout {
    public final SmartImageView LL;
    public Bitmap LLILLJJLI;
    public boolean LLILLL;

    public C419290GcJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dap, this, true);
        setOrientation(1);
        setGravity(17);
        findViewById(R.id.kc1);
        this.LL = (SmartImageView) findViewById(R.id.xdw);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.LLILLL) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        if (this.LLILLJJLI != null) {
            int i5 = (i3 - i) - (iLIZIZ2 * 2);
            int i6 = (i4 - i2) - (iLIZIZ * 2);
            float f = i6;
            float f2 = i5;
            if (r3.getHeight() / r3.getWidth() > f / f2) {
                ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
                layoutParams.height = i6;
                layoutParams.width = (int) ((r3.getWidth() / r3.getHeight()) * f);
                C786410Ut5.G6(this.LL, layoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.LL.getLayoutParams();
                layoutParams2.width = i5;
                layoutParams2.height = (int) ((r3.getHeight() / r3.getWidth()) * f2);
                C786410Ut5.G6(this.LL, layoutParams2);
            }
            if (this.LLILLL) {
                this.LLILLL = false;
                requestLayout();
            }
        }
    }
}
