package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GUT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUT extends FrameLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public int LL;
    public int LLILLJJLI;

    public C0GUT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = Integer.MAX_VALUE;
        this.LLILLJJLI = Integer.MAX_VALUE;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = null;
            try {
                try {
                    typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.UpvoteMaxSizeFrameLayout);
                    this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UpvoteMaxSizeFrameLayout_maxFrameWidth, this.LL);
                    this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UpvoteMaxSizeFrameLayout_maxFrameHeight, this.LLILLJJLI);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (typedArrayObtainStyledAttributes == null) {
                        return;
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size, this.LL), mode), View.MeasureSpec.makeMeasureSpec(Math.min(size2, this.LLILLJJLI), mode2));
    }
}
