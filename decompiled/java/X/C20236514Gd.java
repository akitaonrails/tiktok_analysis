package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20236514Gd extends ConstraintLayout {
    public final int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Rect LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public Bitmap LLIZ;
    public final C01GW LLIZLLLIL;

    private final Paint getHighlightPaint() {
        return (Paint) this.LLIZLLLIL.getValue();
    }

    private final Paint getMaskPaint() {
        return (Paint) this.LLILZLL.getValue();
    }

    public final Rect getHighlightRect() {
        int i;
        if (this.LLILZ == null && (i = this.LLILLL) > 0) {
            View viewFindViewById = findViewById(i);
            if (viewFindViewById == null) {
                return this.LLILZ;
            }
            this.LLILZ = new Rect(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getLeft() + viewFindViewById.getWidth(), viewFindViewById.getTop() + viewFindViewById.getHeight());
        }
        return new Rect(this.LLILZ);
    }

    public final Rect getRootRect() {
        return (Rect) this.LLILZIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.LLIZ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLIZ = null;
    }

    public final int getMASK_COLOR_DEFAULT() {
        return this.LL;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect highlightRect;
        if (canvas != null && (highlightRect = getHighlightRect()) != null) {
            if (this.LLIZ == null) {
                this.LLIZ = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap = this.LLIZ;
            if (bitmap != null) {
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), getMaskPaint());
                canvas2.drawRect(highlightRect, getHighlightPaint());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        }
        super.onDraw(canvas);
    }

    public C20236514Gd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int iLIZJ = C20642515q3.LIZJ(R.color.df);
        this.LL = iLIZJ;
        this.LLILLJJLI = iLIZJ;
        this.LLILLL = -1;
        this.LLILZIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 65));
        this.LLILZLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 64));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(79));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HighlightChildLayout);
            this.LLILLL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.HighlightChildLayout_highlightView, -1);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(R$styleable.HighlightChildLayout_maskColor, iLIZJ);
            typedArrayObtainStyledAttributes.recycle();
            if (this.LLILLL > 0) {
                setBackgroundColor(0);
            }
        }
    }

    public boolean e0(int i, Rect rect) {
        boolean z;
        boolean z2 = true;
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            getMaskPaint().setColor(this.LLILLJJLI);
            Bitmap bitmap = this.LLIZ;
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            this.LLIZ = null;
            z = true;
        } else {
            z = false;
        }
        if (!Intrinsics.LJFF(getHighlightRect(), rect)) {
            this.LLILZ = new Rect(rect);
        } else {
            z2 = z;
            if (z) {
            }
            return z2;
        }
        invalidate();
        return z2;
    }
}
