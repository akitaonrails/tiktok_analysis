package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Gn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426010Gn9 extends ViewGroup {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final List<Integer> LLILZ;
    public final List<Integer> LLILZIL;
    public final List<Float> LLILZLL;
    public final List<Integer> LLIZ;

    public final void setCovers(List<? extends UrlModel> list) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        int iMin = Math.min(list.size(), this.LLILLL);
        Iterator<Integer> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (iIntValue < iMin) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i8_, null, false);
                SmartImageView smartImageView = (SmartImageView) viewTd.findViewById(R.id.ld7);
                addView(viewTd);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
                Drawable drawableLIZ = c384050F3z.LIZ(getContext());
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZJ = C418440Gaw.LIZIZ(6);
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(24);
                c19659111vp.LJ = Integer.valueOf(R.attr.oz);
                c19659111vp.LIZ = C418440Gaw.LIZIZ(12);
                viewTd.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(getContext())));
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((UrlModel) ListProtector.get(list, iIntValue)));
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.RGB_565;
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                c1331670kl3LJIIIIZZ.LJIIJ(new C0ID0(2));
            }
        }
        requestLayout();
    }

    public C426010Gn9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(192));
        this.LLILLJJLI = iLIZIZ;
        this.LLILLL = 4;
        this.LLILZ = C1697810uHb.LJIIJJI(2, 0, 1, 3);
        this.LLILZIL = C1697810uHb.LJIIJJI(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
        this.LLILZLL = C1697810uHb.LJIIJJI(Float.valueOf(-8.0f), Float.valueOf(5.0f), Float.valueOf(4.0f), Float.valueOf(-2.8f));
        double d = iLIZIZ;
        this.LLIZ = C1697810uHb.LJIIJJI(Integer.valueOf((int) (1.4d * d)), Integer.valueOf((int) ((d * 1.2d) + ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50))))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)) + iLIZIZ), Integer.valueOf(iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50))));
    }

    public final void LIZ(int i, int i2) {
        int i3 = this.LL;
        int i4 = this.LLILLJJLI;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-20));
        int i5 = i2 - (((i3 * i) + ((i - 1) * iLIZIZ)) / 2);
        int iMax = 0;
        for (int i6 = 0; i6 < i; i6++) {
            iMax = Math.max(iMax, ((Number) ListProtector.get(this.LLILZIL, i6)).intValue() + i4);
        }
        for (int i7 = 0; i7 < i; i7++) {
            View childAt = getChildAt(i7);
            int i8 = ((i3 + iLIZIZ) * i7) + i5;
            int iIntValue = ((Number) ListProtector.get(this.LLILZIL, i7)).intValue();
            childAt.layout(i8, iIntValue, i8 + i3, iIntValue + i4);
            C786410Ut5.Ab(childAt, ((Number) ListProtector.get(this.LLILZLL, i7)).floatValue());
            C786410Ut5.Ob(childAt, 1.0f);
            C786410Ut5.pc(childAt, 1.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        Pair pair;
        int childCount = getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i);
        Integer num = (Integer) C13LP.LJJJLZIJ(childCount - 1, this.LLIZ);
        if (num != null) {
            size = num.intValue();
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childCount != 1) {
                if (childCount != 2) {
                    pair = new Pair(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI));
                } else {
                    pair = new Pair(Integer.valueOf((int) (this.LL * 1.2f)), Integer.valueOf((int) (this.LLILLJJLI * 1.2f)));
                }
            } else {
                pair = new Pair(Integer.valueOf((int) (this.LL * 1.4f)), Integer.valueOf((int) (this.LLILLJJLI * 1.4f)));
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(((Number) pair.getFirst()).intValue(), 1073741824), View.MeasureSpec.makeMeasureSpec(((Number) pair.getSecond()).intValue(), 1073741824));
        }
        setMeasuredDimension(size2, size);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int i5 = (i3 - i) / 2;
        if (childCount != 1) {
            if (childCount != 2) {
                if (childCount != 3) {
                    LIZ(4, i5);
                    bringChildToFront(getChildAt(2));
                    bringChildToFront(getChildAt(1));
                    invalidate();
                    return;
                }
                LIZ(3, i5);
                bringChildToFront(getChildAt(1));
                invalidate();
                return;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-48));
            int i6 = (int) (this.LL * 1.2f);
            int i7 = (int) (this.LLILLJJLI * 1.2f);
            View childAt = getChildAt(0);
            int i8 = i5 - (((i6 * 2) + iLIZIZ) / 2);
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            C786410Ut5.Ab(childAt, -5.8f);
            C786410Ut5.Ob(childAt, 1.0f);
            C786410Ut5.pc(childAt, 1.0f);
            View childAt2 = getChildAt(1);
            int i9 = i8 + i6;
            int i10 = iLIZIZ + i9;
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            C786410Ut5.Ab(childAt2, 10.0f);
            C786410Ut5.Ob(childAt2, 1.0f);
            C786410Ut5.pc(childAt2, 1.0f);
            childAt.layout(i8, iLIZIZ2, i9, iLIZIZ2 + i7);
            childAt2.layout(i10, iLIZIZ3, i6 + i10, i7 + iLIZIZ3);
            bringChildToFront(getChildAt(1));
            bringChildToFront(getChildAt(0));
            invalidate();
            return;
        }
        View childAt3 = getChildAt(0);
        int measuredWidth = childAt3.getMeasuredWidth();
        int i11 = i5 - (measuredWidth / 2);
        childAt3.layout(i11, 0, measuredWidth + i11, childAt3.getMeasuredHeight());
        C786410Ut5.Ab(childAt3, 2.0f);
        C786410Ut5.Ob(childAt3, 1.0f);
        C786410Ut5.pc(childAt3, 1.0f);
    }
}
