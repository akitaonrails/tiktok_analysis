package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0H0H, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H0H extends C0H0G<C0H0I> {
    @Override // X.C0H0G, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C0H0H(Context context) {
        super(context);
    }

    public final void LIZJ(Canvas canvas) {
        super.onDraw(canvas);
        int iLJFF = getMultiDraweeHolder().LJFF();
        List<C0H0I> imageInfoList = getImageInfoList();
        boolean zLJJ = C497740JfY.LJJ();
        if (imageInfoList != null && iLJFF == imageInfoList.size()) {
            for (int i = iLJFF - 1; -1 < i; i--) {
                Drawable drawableLIZLLL = getMultiDraweeHolder().LIZJ(i).LIZLLL();
                if (drawableLIZLLL != null) {
                    int i2 = ((C0H0J) ListProtector.get(imageInfoList, i)).LIZIZ;
                    int height = ((C0H0J) ListProtector.get(imageInfoList, i)).LIZJ;
                    int width = ((C0H0I) ListProtector.get(imageInfoList, i)).LJ;
                    if (height > getHeight()) {
                        height = getHeight();
                    }
                    if (zLJJ) {
                        width = (getWidth() - width) - i2;
                    }
                    int height2 = (getHeight() - height) / 2;
                    drawableLIZLLL.setBounds(width, height2, i2 + width, height + height2);
                    drawableLIZLLL.setAlpha(((C0H0I) ListProtector.get(imageInfoList, i)).LJFF);
                    drawableLIZLLL.draw(canvas);
                }
            }
        }
    }

    @Override // X.C0H0G, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int iMin2;
        List<C0H0I> imageInfoList = getImageInfoList();
        if (imageInfoList != null && !imageInfoList.isEmpty()) {
            int iMax = 0;
            int iMax2 = 0;
            for (C0H0I c0h0i : imageInfoList) {
                iMax = Math.max(iMax, c0h0i.LJ + c0h0i.LIZIZ);
                iMax2 = Math.max(iMax2, c0h0i.LIZJ);
            }
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 0 || mode != 1073741824) {
                iMin = Math.min(iMax, View.MeasureSpec.getSize(i));
            } else {
                iMin = View.MeasureSpec.getSize(i);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0 || mode2 != 1073741824) {
                iMin2 = Math.min(iMax2, View.MeasureSpec.getSize(i2));
            } else {
                iMin2 = View.MeasureSpec.getSize(i);
            }
            setMeasuredDimension(iMin, iMin2);
            return;
        }
        super.onMeasure(i, i2);
    }
}
