package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0HJA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HJA extends View {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C0HJH LL;
    public final C0HJH LLILLJJLI;
    public final C0HJH LLILLL;
    public final C0HJH LLILZ;
    public final C0HJH LLILZIL;
    public final C0HJH LLILZLL;
    public final C0HJH LLIZ;
    public Bitmap LLIZLLLIL;
    public final Paint LLJ;
    public final Paint LLJI;
    public boolean LLJIJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C0HJA.class, "anchorView", "getAnchorView()Landroid/view/View;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C0HJA.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(C0HJA.class, "overlayColor", "getOverlayColor()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR4 = new C2217371BqR(C0HJA.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR5 = new C2217371BqR(C0HJA.class, "overlayPadding", "getOverlayPadding()F", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR6 = new C2217371BqR(C0HJA.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR7 = new C2217371BqR(C0HJA.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6, c2217371BqR7};
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View getAnchorView() {
        C0HJH c0hjh = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (View) c0hjh.LLILLJJLI;
    }

    public final List<View> getAnchorViewList() {
        C0HJH c0hjh = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (List) c0hjh.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0HJE getBalloonOverlayShape() {
        C0HJH c0hjh = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (C0HJE) c0hjh.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getOverlayColor() {
        C0HJH c0hjh = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return ((Number) c0hjh.LLILLJJLI).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getOverlayPadding() {
        C0HJH c0hjh = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return ((Number) c0hjh.LLILLJJLI).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getOverlayPaddingColor() {
        C0HJH c0hjh = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return ((Number) c0hjh.LLILLJJLI).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Point getOverlayPosition() {
        C0HJH c0hjh = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (Point) c0hjh.LLILLJJLI;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View anchorView;
        View anchorView2;
        Bitmap bitmap;
        if ((this.LLJIJIL || (bitmap = this.LLIZLLLIL) == null || bitmap.isRecycled()) && getWidth() != 0 && getHeight() != 0 && (((anchorView = getAnchorView()) == null || anchorView.getWidth() != 0) && ((anchorView2 = getAnchorView()) == null || anchorView2.getHeight() != 0))) {
            Bitmap bitmap2 = this.LLIZLLLIL;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.LLIZLLLIL = bitmapCreateBitmap;
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Paint paint = this.LLJ;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            paint.setColor(getOverlayColor());
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLJ);
            Paint paint2 = this.LLJ;
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint2.setColor(0);
            Paint paint3 = this.LLJI;
            paint3.setColor(getOverlayPaddingColor());
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(getOverlayPadding());
            List<View> anchorViewList = getAnchorViewList();
            if (anchorViewList != null && !anchorViewList.isEmpty()) {
                List<View> anchorViewList2 = getAnchorViewList();
                if (anchorViewList2 != null) {
                    Iterator<View> it2 = anchorViewList2.iterator();
                    while (it2.hasNext()) {
                        LIZ(canvas2, it2.next());
                    }
                }
            } else {
                LIZ(canvas2, getAnchorView());
            }
            this.LLJIJIL = false;
        }
        Bitmap bitmap3 = this.LLIZLLLIL;
        if (bitmap3 != null && !bitmap3.isRecycled() && canvas != null) {
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void setAnchorView(View view) {
        this.LL.setValue(this, LLJILJIL[0], view);
    }

    public final void setAnchorViewList(List<? extends View> list) {
        this.LLILLJJLI.setValue(this, LLJILJIL[1], list);
    }

    public final void setBalloonOverlayShape(C0HJE c0hje) {
        this.LLIZ.setValue(this, LLJILJIL[6], c0hje);
    }

    public final void setOverlayColor(int i) {
        this.LLILLL.setValue(this, LLJILJIL[2], Integer.valueOf(i));
    }

    public final void setOverlayPadding(float f) {
        this.LLILZIL.setValue(this, LLJILJIL[4], Float.valueOf(f));
    }

    public final void setOverlayPaddingColor(int i) {
        this.LLILZ.setValue(this, LLJILJIL[3], Integer.valueOf(i));
    }

    public final void setOverlayPosition(Point point) {
        this.LLILZLL.setValue(this, LLJILJIL[5], point);
    }

    public C0HJA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C0HJI.LIZ(this, null);
        this.LLILLJJLI = C0HJI.LIZ(this, null);
        this.LLILLL = C0HJI.LIZ(this, 0);
        this.LLILZ = C0HJI.LIZ(this, 0);
        this.LLILZIL = C0HJI.LIZ(this, Float.valueOf(0.0f));
        this.LLILZLL = C0HJI.LIZ(this, null);
        this.LLIZ = C0HJI.LIZ(this, C0HJC.LIZ);
        Paint paint = new Paint(1);
        this.LLJ = paint;
        Paint paint2 = new Paint(1);
        this.LLJI = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }

    public final void LIZ(Canvas canvas, View view) {
        RectF rectF;
        if (view != null) {
            view.getGlobalVisibleRect(new Rect());
            if (getOverlayPosition() != null) {
                rectF = new RectF(r6.x - getOverlayPadding(), (r6.y - getOverlayPadding()) + getStatusBarHeight(), r6.x + view.getWidth() + getOverlayPadding(), r6.y + view.getHeight() + getOverlayPadding() + getStatusBarHeight());
            } else {
                rectF = new RectF(r1.left - getOverlayPadding(), r1.top - getOverlayPadding(), r1.right + getOverlayPadding(), r1.bottom + getOverlayPadding());
            }
            float overlayPadding = getOverlayPadding() / 2;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(overlayPadding, overlayPadding);
            C0HJE balloonOverlayShape = getBalloonOverlayShape();
            if (!(balloonOverlayShape instanceof C0HJD)) {
                if (balloonOverlayShape instanceof C0HJC) {
                    canvas.drawOval(rectF, this.LLJ);
                    canvas.drawOval(rectF2, this.LLJI);
                    return;
                }
                if (balloonOverlayShape instanceof C0HJF) {
                    balloonOverlayShape.getClass();
                    return;
                }
                if (balloonOverlayShape instanceof C0HJB) {
                    C0HJB c0hjb = (C0HJB) balloonOverlayShape;
                    Pair<Float, Float> pair = c0hjb.LIZ;
                    if (pair != null) {
                        canvas.drawRoundRect(rectF, pair.getFirst().floatValue(), pair.getSecond().floatValue(), this.LLJ);
                        canvas.drawRoundRect(rectF2, pair.getFirst().floatValue() - overlayPadding, pair.getSecond().floatValue() - overlayPadding, this.LLJI);
                    }
                    Pair<Integer, Integer> pair2 = c0hjb.LIZIZ;
                    if (pair2 == null) {
                        return;
                    }
                    canvas.drawRoundRect(rectF, getContext().getResources().getDimension(pair2.getFirst().intValue()), getContext().getResources().getDimension(pair2.getSecond().intValue()), this.LLJ);
                    canvas.drawRoundRect(rectF2, getContext().getResources().getDimension(pair2.getFirst().intValue()) - overlayPadding, getContext().getResources().getDimension(pair2.getSecond().intValue()) - overlayPadding, this.LLJI);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LLJIJIL = true;
    }
}
