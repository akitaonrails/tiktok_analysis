package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0H0C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H0C extends C0H0F<C0H0E> {
    public final List<C0H0E> LLILLL;

    @Override // X.C0H0F, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZJ(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = (ArrayList) this.LLILLL;
        int size = arrayList.size();
        if (size > 0 && size <= getMultiDraweeHolder().LJFF()) {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            int i2 = 0;
            do {
                int i3 = ((C0H0D) ListProtector.get(arrayList, i)).LIZIZ;
                int i4 = i2 + ((C0H0E) ListProtector.get(arrayList, i)).LJ;
                arrayList2.add(Integer.valueOf(i4));
                i2 = i4 + i3;
                i++;
            } while (i < size);
            int iLJFF = getMultiDraweeHolder().LJFF();
            for (int i5 = size - 1; -1 < i5; i5--) {
                Drawable drawableLIZLLL = getMultiDraweeHolder().LIZJ((iLJFF - i5) - 1).LIZLLL();
                if (drawableLIZLLL != null) {
                    int i6 = ((C0H0D) ListProtector.get(arrayList, i5)).LIZIZ;
                    int height = ((C0H0D) ListProtector.get(arrayList, i5)).LIZJ;
                    if (height > getHeight()) {
                        height = getHeight();
                    }
                    int iIntValue = ((Number) ListProtector.get(arrayList2, i5)).intValue();
                    int height2 = (getHeight() - height) / 2;
                    drawableLIZLLL.setBounds(iIntValue, height2, i6 + iIntValue, height + height2);
                    drawableLIZLLL.draw(canvas);
                }
            }
        }
    }

    @Override // X.C0H0F, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0H0F
    public void setDrawables(List<C0H0E> list) {
        super.setDrawables(list);
        int iLJFF = getMultiDraweeHolder().LJFF();
        if (iLJFF > 0) {
            int i = 0;
            for (C0H0E c0h0e : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    DH dh = getMultiDraweeHolder().LIZJ((iLJFF - i) - 1).LLILZ;
                    dh.getClass();
                    ((C1331070kk5) dh).LJFF(new BitmapDrawable(getContext().getResources(), (Bitmap) c0h0e.LIZ), 1.0f, true);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public C0H0C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingStart;
        int paddingBottom;
        List<C0H0E> imageInfoList = getImageInfoList();
        int iMax = 0;
        if (imageInfoList != null && !imageInfoList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            ((ArrayList) this.LLILLL).clear();
            if (imageInfoList.size() == 1) {
                int i3 = ((C0H0D) ListProtector.get(imageInfoList, 0)).LIZJ;
                ((ArrayList) this.LLILLL).add(ListProtector.get(imageInfoList, 0));
                iMax = i3;
                paddingStart = size;
            } else {
                paddingStart = getPaddingStart() + getPaddingEnd();
                Iterator<C0H0E> it2 = imageInfoList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0H0E next = it2.next();
                    int i4 = next.LJ;
                    int i5 = next.LIZIZ;
                    paddingStart += i4 + i5;
                    if (paddingStart > size) {
                        paddingStart -= i4 + i5;
                        break;
                    } else {
                        iMax = Math.max(iMax, next.LIZJ);
                        ((ArrayList) this.LLILLL).add(next);
                    }
                }
            }
            if (mode != 1073741824) {
                size = paddingStart;
            }
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                paddingBottom = View.MeasureSpec.getSize(i2);
            } else {
                paddingBottom = getPaddingBottom() + iMax + getPaddingTop();
            }
            setMeasuredDimension(size, paddingBottom);
            return;
        }
        super.onMeasure(i, i2);
    }

    public C0H0C(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILLL = new ArrayList();
    }
}
