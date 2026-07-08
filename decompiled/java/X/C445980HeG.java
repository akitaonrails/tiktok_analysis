package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0HeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445980HeG extends FrameLayout {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final List<ImageModel> LLILZ;

    public final void setAvatarImages(List<? extends ImageModel> list) {
        ((ArrayList) this.LLILZ).clear();
        if (list != null) {
            for (ImageModel imageModel : list) {
                if (imageModel != null) {
                    ((ArrayList) this.LLILZ).add(imageModel);
                }
            }
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        if (((ArrayList) this.LLILZ).isEmpty()) {
            requestLayout();
            invalidate();
            return;
        }
        int i = 0;
        for (ImageModel imageModel2 : (ArrayList) this.LLILZ) {
            int i2 = i + 1;
            C1324720kZq c1324720kZq = new C1324720kZq(getContext());
            c1324720kZq.setScaleType(ImageView.ScaleType.FIT_XY);
            float f = this.LLILLJJLI / 2;
            float fLIZIZ = (int) C497740JfY.LIZIZ(5.0f);
            if (i > 0 && i <= ((ArrayList) this.LLILZ).size() - 1) {
                c1324720kZq.setStacked(true);
                c1324720kZq.setCutoutRadius(f);
                c1324720kZq.setCutoutStartOffset(fLIZIZ);
            }
            ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
            constraintLayout.setElevation(((ArrayList) this.LLILZ).size() - i);
            int i3 = this.LL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
            layoutParams.gravity = 17;
            addView(constraintLayout, layoutParams);
            int i4 = this.LLILLJJLI;
            C19ME c19me = new C19ME(i4, i4);
            c19me.topToTop = 0;
            c19me.bottomToBottom = 0;
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            constraintLayout.addView(c1324720kZq, c19me);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel2);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIIZ.LJJI(c1324720kZq);
            i = i2;
        }
        requestLayout();
        invalidate();
    }

    public final void setAvatarUrls(List<String> list) {
        if (list == null) {
            setAvatarImages(C13BV.INSTANCE);
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            arrayList.add(new ImageModel(str, Collections.singletonList(str)));
        }
        setAvatarImages(arrayList);
    }

    public C445980HeG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int iLIZIZ = (int) C497740JfY.LIZIZ(25.0f);
        this.LL = iLIZIZ;
        this.LLILLJJLI = (int) C497740JfY.LIZIZ(20.0f);
        this.LLILLL = iLIZIZ - ((int) C497740JfY.LIZIZ(7.5f));
        this.LLILZ = new ArrayList();
        setClipToPadding(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = this.LL;
        int i4 = paddingTop + i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.LL, 1073741824);
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            getChildAt(i6).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (childCount > 0) {
            i5 = this.LL + ((childCount - 1) * this.LLILLL);
        }
        setMeasuredDimension(FrameLayout.resolveSize(getPaddingLeft() + getPaddingRight() + i5, i), FrameLayout.resolveSize(i4, i2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        int i6 = childCount - 1;
        int i7 = this.LL + (this.LLILLL * i6);
        int paddingTop = getPaddingTop();
        if (z2) {
            paddingLeft = (getWidth() - getPaddingRight()) - i7;
        } else {
            paddingLeft = getPaddingLeft();
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (z2) {
                i5 = i6 - i8;
            } else {
                i5 = i8;
            }
            int i9 = (i5 * this.LLILLL) + paddingLeft;
            int i10 = this.LL;
            childAt.layout(i9, paddingTop, i9 + i10, i10 + paddingTop);
        }
    }
}
