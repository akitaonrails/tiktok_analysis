package X;

import Y.ARunnableS129S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.125R, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C125R extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public final C125Y LLILZ;
    public boolean LLILZIL;
    public List<TextStickerTextWrap> LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public final SafeHandler LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public C125Q LLJILLL;
    public C125S LLJJ;
    public C125U LLJJI;
    public TextStickerData LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public final ArrayList<PointF[]> LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public final PointF LLJJJJ;
    public C196981125b LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;

    public RectF getBubbleShowLimitRect() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        RectF currentHelpBoxRect = getCurrentHelpBoxRect();
        int i = iArr[0];
        float f = i + currentHelpBoxRect.left;
        int i2 = iArr[1];
        return new RectF(f, i2 + currentHelpBoxRect.top, i + currentHelpBoxRect.right, i2 + currentHelpBoxRect.bottom);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    private int getFontSize() {
        C125Y c125y = this.LLILZ;
        if (c125y.LJ < 0) {
            c125y.LJ = (int) C0JAI.LJI(this.LLJJIII == null ? 64.0f : r0.getFontSize(), getContext());
        }
        return this.LLILZ.LJ;
    }

    public final TextStickerData LIZIZ() {
        if (this.LLJJIII == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LLIZ, this.LLIZLLLIL, this.LLILZ.LIZLLL, this.LLJ);
            this.LLJJIII = textStickerData;
            textStickerData.setTextWrapList(getTextWrapList());
        }
        this.LLJJIII.setTextStr(AnonymousClass1258.LIZ(getTextWrapList()));
        this.LLJJIII.setX(this.LL);
        this.LLJJIII.setY(this.LLILLJJLI);
        this.LLJJIII.setRotation(this.LLILZ.LIZIZ);
        this.LLJJIII.setScale(this.LLILZ.LIZ);
        this.LLJJIII.setTextWrapList(getTextWrapList());
        this.LLJJIII.setBgMode(this.LLIZ);
        this.LLJJIII.setColor(this.LLIZLLLIL);
        this.LLJJIII.setAlign(this.LLILZ.LIZLLL);
        this.LLJJIII.setFontType(this.LLJ);
        this.LLJJIII.setLayoutWidth(getMeasuredWidth());
        this.LLJJIII.setLayoutHeight(getMeasuredHeight());
        return this.LLJJIII;
    }

    public final void LIZJ() {
        C125S c125s = this.LLJJ;
        float f = this.LL;
        float f2 = this.LLILLJJLI;
        C125Y c125y = this.LLILZ;
        float f3 = c125y.LIZ;
        float f4 = c125y.LIZIZ;
        c125s.LJI = true;
        c125s.LJII = false;
        c125s.LJIIIIZZ = f;
        c125s.LJIIIZ = f2;
        c125s.LJIIJ = f4;
        c125s.LJIIJJI = f3;
        float f5 = 15;
        c125s.LIZ = f3 / f5;
        c125s.LIZIZ = f4 / f5;
        c125s.LIZJ = (f - c125s.LJ) / f5;
        c125s.LIZLLL = (f2 - c125s.LJFF) / f5;
        c125s.LJIIL.invalidate();
        InterfaceC196980125a interfaceC196980125a = c125s.LJIILIIL;
        if (interfaceC196980125a != null) {
            interfaceC196980125a.LIZIZ();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LIZLLL() {
        C125S c125s = this.LLJJ;
        c125s.LJII = true;
        c125s.LJI = false;
        float f = 15;
        c125s.LIZ = (-c125s.LJIIJJI) / f;
        c125s.LIZIZ = (-c125s.LJIIJ) / f;
        c125s.LIZJ = (-(c125s.LJIIIIZZ - c125s.LJ)) / f;
        c125s.LIZLLL = (-(c125s.LJIIIZ - c125s.LJFF)) / f;
        super.invalidate();
        InterfaceC196980125a interfaceC196980125a = c125s.LJIILIIL;
        if (interfaceC196980125a != null) {
            interfaceC196980125a.LIZLLL();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        TextStickerData textStickerData = this.LLJJIII;
        if (textStickerData == null || textStickerData.isVisibleWhen(this.LLJJIJI)) {
            return;
        }
        C125S c125s2 = this.LLJJ;
        c125s2.LJII = false;
        c125s2.LJI = false;
        C125R c125r = c125s2.LJIIL;
        c125r.LLILZ.LIZ = c125s2.LJIIJJI;
        c125r.LJIIL(c125s2.LJIIJ);
        c125s2.LJIIL.setCenterX(c125s2.LJIIIIZZ);
        c125s2.LJIIL.setCenterY(c125s2.LJIIIZ);
        super.invalidate();
        InterfaceC196980125a interfaceC196980125a2 = c125s2.LJIILIIL;
        if (interfaceC196980125a2 != null) {
            interfaceC196980125a2.LIZJ();
            c125s2.LJIILIIL.LIZ();
        }
    }

    public final void LJIIIZ() {
        if (this.LLJJIII != null) {
            C125Y c125y = this.LLILZ;
            boolean z = this.LLJJI.LJIIIIZZ;
            c125y.LJI = z;
            if (z || this.LLJLILLLLZIIL) {
                return;
            }
            int i = 0;
            if (SystemClock.elapsedRealtime() >= this.LLJJIJIIJIL) {
                boolean zIsVisibleWhen = this.LLJJIII.isVisibleWhen(this.LLJJIJI);
                if (!this.LLJJIII.getShowOnScreen()) {
                    this.LLJJIII.setShowOnScreen(true);
                    TextStickerData textStickerData = this.LLJJIII;
                    textStickerData.setX(textStickerData.getX() + ScreenUtils.getScreenWidth(getContext()));
                    setCenterX(getCenterX() + ScreenUtils.getScreenWidth(getContext()));
                    if (!zIsVisibleWhen) {
                        i = 8;
                    }
                } else if (!zIsVisibleWhen) {
                    if (getVisibility() != 0) {
                        return;
                    }
                    i = 8;
                } else if (getVisibility() == 0) {
                    return;
                }
                if (getVisibility() != i) {
                    C786410Ut5.LJLLLLLL(i, this);
                }
                super.invalidate();
                this.LLJI = zIsVisibleWhen;
            }
        }
    }

    public final boolean LJIILJJIL() {
        if (this.LLJI && getVisibility() == 0) {
            return !this.LLJJI.LIZ() || this.LLILZ.LJII;
        }
        return false;
    }

    public PointF[] getAnglePointList() {
        C125Q c125q = this.LLJILLL;
        int size = ((ArrayList) c125q.LJJIIJZLJL).size();
        PointF[] pointFArr = new PointF[size];
        float radians = (float) Math.toRadians(c125q.LJJIIJ);
        for (int i = 0; i < size; i++) {
            pointFArr[i] = C121Q.LIZIZ(c125q.LIZJ.centerX(), c125q.LIZJ.centerY(), radians, (PointF) ListProtector.get(c125q.LJJIIJZLJL, i));
        }
        return pointFArr;
    }

    public PointF[] getAnglePointListForBlock() {
        C125Q c125q = this.LLJILLL;
        c125q.getClass();
        PointF[] pointFArr = new PointF[4];
        RectF rectF = c125q.LIZIZ;
        int i = 0;
        pointFArr[0] = new PointF(rectF.left, rectF.top);
        RectF rectF2 = c125q.LIZIZ;
        pointFArr[1] = new PointF(rectF2.right, rectF2.top);
        RectF rectF3 = c125q.LIZIZ;
        pointFArr[2] = new PointF(rectF3.right, rectF3.bottom);
        RectF rectF4 = c125q.LIZIZ;
        pointFArr[3] = new PointF(rectF4.left, rectF4.bottom);
        float radians = (float) Math.toRadians(c125q.LJJIIJ);
        do {
            pointFArr[i] = C121Q.LIZIZ(c125q.LIZIZ.centerX(), c125q.LIZIZ.centerY(), radians, pointFArr[i]);
            i++;
        } while (i < 4);
        return pointFArr;
    }

    public int getCurAlignTxt() {
        return this.LLILZ.LIZLLL;
    }

    public RectF getCurrentHelpBoxRect() {
        C125Q c125q = this.LLJILLL;
        c125q.getClass();
        RectF rectF = new RectF();
        rectF.set(c125q.LIZIZ);
        float f = rectF.left;
        float f2 = c125q.LJIILLIIL;
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
        return rectF;
    }

    public RectF getDeleteIconRect() {
        this.LLJILLL.getClass();
        return null;
    }

    public RectF getHelpRect() {
        return this.LLJILLL.LIZJ;
    }

    public RectF getMinTextRect() {
        C125Q c125q = this.LLJILLL;
        c125q.getClass();
        RectF rectF = c125q.LIZIZ;
        float f = rectF.left;
        float f2 = c125q.LJIIL;
        float f3 = rectF.top;
        float f4 = c125q.LJIILIIL;
        return new RectF(f + f2, f3 + f4, rectF.right - f2, rectF.bottom - f4);
    }

    public float getOriginHeight() {
        if (this.LLJJIJIL.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].y;
        for (PointF[] pointFArr : this.LLJJIJIL) {
            for (PointF pointF : pointFArr) {
                float f5 = pointF.x;
                if (f5 < f) {
                    f = f5;
                }
                if (f5 > f2) {
                    f2 = f5;
                }
                float f6 = pointF.y;
                if (f6 < f3) {
                    f3 = f6;
                }
                if (f6 > f4) {
                    f4 = f6;
                }
            }
        }
        return (f4 - f3) / this.LLJJIII.getScale();
    }

    public float getOriginWidth() {
        if (this.LLJJIJIL.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LLJJIJIL, 0))[0].y;
        for (PointF[] pointFArr : this.LLJJIJIL) {
            for (PointF pointF : pointFArr) {
                float f5 = pointF.x;
                if (f5 < f) {
                    f = f5;
                }
                if (f5 > f2) {
                    f2 = f5;
                }
                float f6 = pointF.y;
                if (f6 < f3) {
                    f3 = f6;
                }
                if (f6 > f4) {
                    f4 = f6;
                }
            }
        }
        return (f2 - f) / this.LLJJIII.getScale();
    }

    public float getStickerRotate() {
        return this.LLILZ.LIZIZ;
    }

    public float getStickerScale() {
        return this.LLILZ.LIZ;
    }

    public String getText() {
        return AnonymousClass1258.LIZIZ(this.LLILZLL);
    }

    public float getTextMiddleLineCenterX() {
        C125Q c125q = this.LLJILLL;
        if (c125q == null) {
            return 0.0f;
        }
        return c125q.LJJIJIIJIL;
    }

    public float getTextMiddleLineCenterY() {
        C125Q c125q = this.LLJILLL;
        if (c125q == null) {
            return 0.0f;
        }
        return c125q.LJJIJIIJI;
    }

    public RectF getTextRect() {
        return this.LLJILLL.LIZIZ;
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        List<TextStickerTextWrap> list = this.LLILZLL;
        return list == null ? new ArrayList() : list;
    }

    public final boolean LJIIIIZZ() {
        if (!LJIILJJIL()) {
            return false;
        }
        super.invalidate();
        return true;
    }

    public int getContentViewHeight() {
        return (int) Math.abs(getMinTextRect().bottom - getMinTextRect().top);
    }

    public int getContentViewWidth() {
        return (int) Math.abs(getMinTextRect().right - getMinTextRect().left);
    }

    public float getCenterX() {
        return this.LL;
    }

    public float getCenterY() {
        return this.LLILLJJLI;
    }

    public int getCurColor() {
        return this.LLIZLLLIL;
    }

    public String getCurFontType() {
        return this.LLJ;
    }

    public int getCurMode() {
        return this.LLIZ;
    }

    public TextStickerData getData() {
        return this.LLJJIII;
    }

    public int getDeltaX() {
        return this.LLJILJIL;
    }

    public int getDeltaY() {
        return this.LLJILJILJ;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void LIZ(int i) {
        C125Q c125q = this.LLJILLL;
        c125q.LJII.setColor(i);
        c125q.LJIIIIZZ = i;
        if (c125q.LJJIII) {
            c125q.LJIJJ.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            c125q.LJIJJ.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        }
        this.LLJJJ = i;
    }

    public final void LJFF(TextStickerData textStickerData) {
        this.LLJJIII = textStickerData;
        if (textStickerData == null) {
            return;
        }
        setFontSize(textStickerData.getFontSize());
        LJIIJJI(this.LLJJIII.getBgMode(), this.LLJJIII.getColor(), this.LLJJIII.getAlign(), this.LLJJIII.getFontType());
        setText(this.LLJJIII.getTextWrapList());
        setAnimXY(this.LLJJIII.getEditCenterPoint());
        TextStickerData textStickerData2 = this.LLJJIII;
        if (textStickerData2 != null && textStickerData2.hasPositionData()) {
            this.LL = this.LLJJIII.getX();
            this.LLILLJJLI = this.LLJJIII.getY();
            this.LLILZ.LIZIZ = this.LLJJIII.getRotation();
            this.LLILZ.LIZ = this.LLJJIII.getScale();
        }
        super.invalidate();
    }

    public final boolean LJI(float f) {
        if (!LJIILJJIL()) {
            return false;
        }
        float degrees = (float) Math.toDegrees(f);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        if ((!this.LLJL && !this.LLJJLIIIJLLLLLLLZ && this.LLJJI.LJIIIZ != 3) || !this.LLJJJJLIIL) {
            return false;
        }
        C125Y c125y = this.LLILZ;
        C125U c125u = this.LLJJI;
        float f2 = c125y.LIZIZ;
        c125u.LIZ.LIZIZ();
        c125u.LIZ.LIZ(degrees);
        float f3 = f2 - degrees;
        if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        if (f3 < -180.0f) {
            f3 += 360.0f;
        }
        c125u.LIZJ(false);
        c125y.LIZIZ = f3;
        super.invalidate();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r4.LLILZ.LIZ < 0.81f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.ScaleGestureDetector r5) {
        /*
            r4 = this;
            boolean r0 = r4.LJIILJJIL()
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            boolean r0 = r4.LLJLIL
            r3 = 1
            if (r0 != 0) goto L18
            boolean r0 = r4.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L18
            X.125U r0 = r4.LLJJI
            int r1 = r0.LJIIIZ
            r0 = 3
            if (r1 != r0) goto L2d
        L18:
            float r1 = r5.getScaleFactor()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L2e
            X.125Y r0 = r4.LLILZ
            float r1 = r0.LIZ
            r0 = 1062165545(0x3f4f5c29, float:0.81)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L39
        L2d:
            return r2
        L2e:
            X.125Y r0 = r4.LLILZ
            float r1 = r0.LIZ
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L39
            return r2
        L39:
            float r2 = r5.getScaleFactor()
            X.125Y r1 = r4.LLILZ
            float r0 = r1.LIZ
            float r0 = r0 * r2
            r1.LIZ = r0
            super.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125R.LJII(android.view.ScaleGestureDetector):boolean");
    }

    public final void LJIIL(float f) {
        C125Y c125y = this.LLILZ;
        c125y.LIZIZ = f;
        if (f > 180.0f) {
            c125y.LIZIZ = f - 360.0f;
        }
        float f2 = c125y.LIZIZ;
        if (f2 < -180.0f) {
            c125y.LIZIZ = f2 + 360.0f;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        Object next;
        List<InteractTextStructWrap> arrayList;
        char c;
        char c2;
        super.onDraw(canvas);
        C125Y c125y = this.LLILZ;
        PointF pointF = c125y.LIZJ;
        pointF.x = this.LL;
        pointF.y = this.LLILLJJLI;
        c125y.LJI = this.LLJJI.LJIIIIZZ;
        getFontSize();
        C125Q c125q = this.LLJILLL;
        C125Y c125y2 = this.LLILZ;
        ArrayList<PointF[]> arrayList2 = this.LLJJIJIL;
        c125q.getClass();
        PointF pointF2 = c125y2.LIZJ;
        c125q.LJJIFFI = pointF2.x;
        c125q.LJJII = pointF2.y;
        c125q.LJIJJ.setTextSize(c125y2.LJ * c125y2.LIZ);
        Context context = c125q.LIZ;
        c125q.LJJIIZI = (C11VU.LIZIZ(4.0f, context) / TypedValue.applyDimension(2, 64.0f, context.getResources().getDisplayMetrics())) * c125q.LJIJJ.getTextSize();
        c125q.LJIJJ.getFontMetrics(c125q.LJJIJ);
        c125q.LJJII += c125q.LJJIJ.bottom * 2.0f;
        c125q.LJJIIJ = c125y2.LIZIZ;
        if (c125q.LJIIJ != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                TextStickerString[] textStickerStringArr = c125q.LJIIJ;
                if (i >= textStickerStringArr.length) {
                    break;
                }
                int iLIZJ = AnonymousClass1258.LIZJ(c125q.LJIJJ, textStickerStringArr[i].getStr(), 0, c125q.LJIIJ[i].getStr().length());
                if (iLIZJ > i2) {
                    i2 = iLIZJ;
                }
                i++;
            }
            int i3 = c125y2.LIZLLL;
            if (i3 == 1) {
                c125q.LJJIFFI -= i2 / 2;
            } else if (i3 == 3) {
                c125q.LJJIFFI += i2 / 2;
            }
        }
        float f = c125q.LJJIFFI;
        float f2 = c125q.LJJII;
        float f3 = c125y2.LIZ;
        int i4 = c125y2.LIZLLL;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        TextStickerString[] textStickerStringArr2 = c125q.LJIIJ;
        if (textStickerStringArr2 != null && textStickerStringArr2.length != 0) {
            Paint.FontMetrics fontMetrics = c125q.LJIJJ.getFontMetrics();
            float f4 = fontMetrics.ascent;
            float f5 = fontMetrics.descent;
            int length = c125q.LJIIJ.length;
            int i5 = length - 1;
            float f6 = f5 - f4;
            float f7 = i5 * f6;
            PointF[][] pointFArr = new PointF[length][];
            int i6 = (int) f6;
            float f8 = c125q.LJIILJJIL;
            float f9 = f8 * f3;
            c125q.LJIIL = f9;
            float f10 = c125q.LJIILL;
            float f11 = f10 * f3;
            c125q.LJIILIIL = f11;
            if (f11 >= f10) {
                c125q.LJIILIIL = f10;
            }
            if (f9 >= f8) {
                c125q.LJIIL = f8;
            }
            int i7 = (int) (f2 - (f7 / 2.0f));
            float f12 = (c125q.LJIIJJI * f3) / 4.0f;
            float f13 = Float.MAX_VALUE;
            float f14 = Float.MIN_VALUE;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            float f15 = 0.0f;
            float f16 = 0.0f;
            int iMeasureText = -1;
            int iMeasureText2 = -1;
            while (i8 < length) {
                int iMeasureText3 = (int) c125q.LJIJJ.measureText(c125q.LJIIJ[i8].getStr());
                float f18 = iMeasureText3 / 2;
                float f19 = c125q.LJIIL;
                float f20 = (f - f18) - f19;
                float f21 = f18 + f + f19;
                if (f20 < f13) {
                    f13 = f20;
                }
                if (f21 > f14) {
                    f14 = f21;
                }
                if (i4 == 1) {
                    f20 = f - f19;
                    f21 = iMeasureText3 + f + f19;
                } else if (i4 == 3) {
                    f20 = (f - iMeasureText3) - f19;
                    f21 = f + f19;
                }
                if (c125q.LJIIJ[i8].getStr().trim().length() == 0) {
                    if (i4 == 1) {
                        f21 = c125q.LJIIL + f;
                    } else {
                        f21 = f;
                        if (i4 == 3) {
                            f21 = f - c125q.LJIIL;
                        }
                    }
                    f20 = f21;
                }
                if (Math.abs(iMeasureText3 - i10) < f12 && (i4 != 1 ? !(i4 != 3 ? i4 != 2 || f16 <= 0.0f : f16 <= 0.0f) : f15 > 0.0f)) {
                    f21 = f15;
                } else {
                    f16 = f20;
                }
                if (i8 == 0) {
                    i11 = i7 - i6;
                }
                int i12 = i11 + i6;
                if (length > 1) {
                    if (i8 > 0) {
                        iMeasureText = (int) c125q.LJIJJ.measureText(c125q.LJIIJ[i8 - 1].getStr());
                    }
                    if (i8 < i5) {
                        iMeasureText2 = (int) c125q.LJIJJ.measureText(c125q.LJIIJ[i8 + 1].getStr());
                    }
                }
                if (iMeasureText > 0 && iMeasureText3 >= iMeasureText) {
                    i12 = (int) (i12 + c125q.LJIILIIL);
                }
                if (iMeasureText2 > 0 && iMeasureText3 > iMeasureText2) {
                    i12 = (int) (i12 + c125q.LJIILIIL);
                }
                if (i8 == 0) {
                    i11 = (int) (i11 - c125q.LJIILIIL);
                }
                if (i8 == i5) {
                    i12 = (int) (i12 + c125q.LJIILIIL);
                }
                float f22 = i11;
                float f23 = i12;
                PointF[] pointFArr2 = {new PointF(f16, f22), new PointF(f21, f22), new PointF(f21, f23), new PointF(f16, f23)};
                pointFArr[i8] = pointFArr2;
                if (arrayList2 != null) {
                    arrayList2.add(pointFArr2);
                }
                if (iMeasureText3 > i9) {
                    i9 = iMeasureText3;
                }
                i8++;
                i10 = iMeasureText3;
                f15 = f21;
                i11 = i12;
            }
            PointF pointF3 = pointFArr[0][0];
            float f24 = pointF3.x;
            float f25 = pointF3.y;
            float f26 = f25;
            float f27 = f24;
            for (int i13 = 0; i13 < length; i13++) {
                for (PointF pointF4 : pointFArr[i13]) {
                    float f28 = pointF4.x;
                    if (f28 < f27) {
                        f27 = f28;
                    }
                    if (f28 > f24) {
                        f24 = f28;
                    }
                    float f29 = pointF4.y;
                    if (f29 < f26) {
                        f26 = f29;
                    }
                    if (f29 > f25) {
                        f25 = f29;
                    }
                }
            }
            c125q.LJJ.reset();
            ((ArrayList) c125q.LJJIIJZLJL).clear();
            for (int i14 = 0; i14 < length; i14++) {
                if (i14 == 0) {
                    Path path = c125q.LJJ;
                    PointF pointF5 = pointFArr[i14][0];
                    path.moveTo(pointF5.x, pointF5.y);
                }
                Path path2 = c125q.LJJ;
                PointF pointF6 = pointFArr[i14][1];
                path2.lineTo(pointF6.x, pointF6.y);
                PointF[] pointFArr3 = pointFArr[i14];
                float f30 = pointFArr3[0].x;
                PointF pointF7 = pointFArr3[1];
                float f31 = pointF7.x;
                if (f30 == f31) {
                    c125q.LJJ.lineTo(f31, pointF7.y);
                    Path path3 = c125q.LJJ;
                    c2 = 2;
                    PointF pointF8 = pointFArr[i14][2];
                    path3.lineTo(pointF8.x, pointF8.y);
                } else {
                    c2 = 2;
                }
                Path path4 = c125q.LJJ;
                PointF pointF9 = pointFArr[i14][c2];
                path4.lineTo(pointF9.x, pointF9.y);
                ((ArrayList) c125q.LJJIIJZLJL).add(pointFArr[i14][0]);
                ((ArrayList) c125q.LJJIIJZLJL).add(pointFArr[i14][1]);
                ((ArrayList) c125q.LJJIIJZLJL).add(pointFArr[i14][2]);
                ((ArrayList) c125q.LJJIIJZLJL).add(pointFArr[i14][3]);
            }
            for (int i15 = i5; i15 >= 0; i15--) {
                PointF[] pointFArr4 = pointFArr[i15];
                if (pointFArr4[0].x == pointFArr4[1].x) {
                    Path path5 = c125q.LJJ;
                    c = 3;
                    PointF pointF10 = pointFArr4[3];
                    path5.lineTo(pointF10.x, pointF10.y);
                } else {
                    c = 3;
                }
                Path path6 = c125q.LJJ;
                PointF pointF11 = pointFArr[i15][c];
                path6.lineTo(pointF11.x, pointF11.y);
                PointF[] pointFArr5 = pointFArr[i15];
                PointF pointF12 = pointFArr5[0];
                float f32 = pointF12.x;
                if (f32 == pointFArr5[1].x) {
                    c125q.LJJ.lineTo(f32, pointF12.y);
                }
                Path path7 = c125q.LJJ;
                PointF pointF13 = pointFArr[i15][0];
                path7.lineTo(pointF13.x, pointF13.y);
            }
            Path path8 = c125q.LJJ;
            PointF pointF14 = pointFArr[0][1];
            path8.lineTo(pointF14.x, pointF14.y);
            c125q.LJIJJ.getTextBounds(c125q.LJIIJ[0].getStr(), 0, c125q.LJIIJ[0].getStr().length(), new Rect());
            int i16 = i9 >> 1;
            if (i4 == 1) {
                float f33 = c125q.LJIIL;
                c125q.LIZIZ = new RectF(f - f33, pointFArr[0][0].y, i9 + f + f33, pointFArr[i5][2].y);
            } else if (i4 == 3) {
                float f34 = c125q.LJIIL;
                c125q.LIZIZ = new RectF((f - i9) - f34, pointFArr[0][0].y, f34 + f, pointFArr[i5][2].y);
            } else if (i4 == 2) {
                float f35 = i16;
                float f36 = c125q.LJIIL;
                c125q.LIZIZ = new RectF((f - f35) - f36, pointFArr[0][0].y, f + f35 + f36, pointFArr[i5][2].y);
            }
            c125q.LIZJ.set(c125q.LIZIZ);
            RectF rectF = c125q.LIZJ;
            float f37 = rectF.left;
            float f38 = c125q.LJIILLIIL;
            rectF.set(f37 - f38, rectF.top - f38, rectF.right + f38, rectF.bottom + f38);
        }
        float f39 = c125y2.LIZIZ;
        if (c125y2.LJI) {
            canvas.save();
            canvas.rotate(f39, c125q.LIZJ.centerX(), c125q.LIZJ.centerY());
            c125q.LJIJJLI.setColor(-1);
            RectF rectF2 = c125q.LIZJ;
            float f40 = c125q.LJIIZILJ;
            canvas.drawRoundRect(rectF2, f40, f40, c125q.LJIJJLI);
            canvas.restore();
        }
        float f41 = c125q.LJJIFFI;
        float f42 = c125q.LJJII;
        float f43 = c125y2.LIZIZ;
        float f44 = c125y2.LIZ;
        int i17 = c125y2.LIZLLL;
        TextStickerString[] textStickerStringArr3 = c125q.LJIIJ;
        if (textStickerStringArr3 != null && textStickerStringArr3.length != 0) {
            Paint.FontMetrics fontMetrics2 = c125q.LJIJJ.getFontMetrics();
            float f45 = fontMetrics2.ascent;
            float f46 = fontMetrics2.descent;
            int length2 = c125q.LJIIJ.length;
            float f47 = f46 - f45;
            float f48 = (((length2 - 1) * f47) / 2.0f) - f46;
            canvas.save();
            canvas.rotate(f43, c125q.LIZJ.centerX(), c125q.LIZJ.centerY());
            float f49 = c125q.LJIIJJI * 0.7f;
            c125q.LJ.set(0.0f, 0.0f, f49, f49);
            c125q.LJFF.set(c125q.LJ);
            C121Q.LJ(c125q.LJFF, f44);
            C121Q.LIZLLL(f41, f42, c125q.LJFF, f43);
            float f50 = 0.0f;
            float f51 = 0.0f;
            for (int i18 = 0; i18 < length2; i18++) {
                float f52 = ((-((length2 - i18) - 1)) * f47) + f48;
                String str = c125q.LJIIJ[i18].getStr();
                List<TextStickerTextWrap> list = c125q.LJIIIZ;
                TextStickerString textStickerString = c125q.LJIIJ[i18];
                if (list == null) {
                    arrayList = new ArrayList<>();
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<TextStickerTextWrap> it2 = list.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getStrMap().entrySet(), arrayList3);
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(((Map.Entry) next).getKey(), textStickerString)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        arrayList = (List) entry.getValue();
                    } else {
                        arrayList = new ArrayList<>();
                    }
                }
                int iLIZJ2 = 0;
                int iLIZJ3 = AnonymousClass1258.LIZJ(c125q.LJIJJ, str, 0, str.length());
                if (AnonymousClass1258.LIZLLL(str.length(), arrayList)) {
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) ListProtector.get(arrayList, i19);
                        if (interactTextStructWrap.getRange().isValid(str.length())) {
                            int start = interactTextStructWrap.getRange().getStart();
                            if (start < str.length() && str.charAt(start) == ' ') {
                                start++;
                            }
                            if (start < str.length() && str.charAt(start) == '_') {
                                iLIZJ2 = (int) ((iLIZJ2 - AnonymousClass1258.LIZJ(c125q.LJIJJ, str, start, start + 1)) + c125q.LJFF.width() + c125q.LJIJI);
                            }
                        }
                    }
                }
                int i20 = iLIZJ3 + iLIZJ2;
                if (i17 == 2) {
                    c125q.LIZIZ(canvas, arrayList, str, f41 - (i20 / 2), f42 + f52 + (c125q.LJIILIIL * i18));
                } else if (i17 == 1) {
                    c125q.LIZIZ(canvas, arrayList, str, f41, f42 + f52 + (c125q.LJIILIIL * i18));
                } else if (i17 == 3) {
                    c125q.LIZIZ(canvas, arrayList, str, f41 - i20, f42 + f52 + (c125q.LJIILIIL * i18));
                }
                if (length2 % 2 == 0) {
                    int i21 = i18 + 1;
                    int i22 = length2 / 2;
                    if (i21 == i22) {
                        f50 = f42 + f52 + (c125q.LJIILIIL * i18);
                    }
                    if (i21 == i22 + 1) {
                        f51 = f42 + f52 + (c125q.LJIILIIL * i18);
                    }
                } else if (i18 + 1 == (length2 / 2) + 1) {
                    f50 = f42 + f52 + (c125q.LJIILIIL * i18);
                    f51 = f50;
                }
            }
            c125q.LJJIJIIJI = ((f50 + f51) / 2.0f) + ((((c125q.LJIJJ.descent() + c125q.LJIJJ.ascent()) / 2.0f) - c125q.LJIJJ.descent()) / 2.0f);
            c125q.LJJIJIIJIL = f41;
            canvas.restore();
        }
        float f53 = c125y2.LIZIZ;
        boolean z3 = c125y2.LJFF;
        if (!c125q.LJJIII && z3) {
            canvas.save();
            canvas.rotate(f53, c125q.LIZJ.centerX(), c125q.LIZJ.centerY());
            c125q.LJII.setColor(c125q.LJIIIIZZ);
            canvas.drawPath(c125q.LJJ, c125q.LJII);
            canvas.restore();
        }
        C125S c125s = this.LLJJ;
        C125Y c125y3 = this.LLILZ;
        float f54 = c125y3.LIZ;
        float f55 = c125y3.LIZIZ;
        float f56 = this.LL;
        float f57 = this.LLILLJJLI;
        float f58 = 1.0f;
        if (c125s.LJII) {
            float f59 = c125s.LJIIJ;
            if (f59 < 0.0f ? f55 <= f59 : f55 >= f59) {
                z = true;
            } else {
                z = false;
            }
            float f60 = c125s.LJIIJJI;
            if (f60 < 1.0f ? f54 <= f60 : f54 >= f60) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2 && f56 == c125s.LJIIIIZZ && f57 == c125s.LJIIIZ) {
                c125s.LJII = false;
                c125s.LJI = false;
                C125R c125r = c125s.LJIIL;
                c125r.LLILZ.LIZ = f60;
                c125r.LJIIL(f59);
                c125s.LJIIL.setCenterX(c125s.LJIIIIZZ);
                c125s.LJIIL.setCenterY(c125s.LJIIIZ);
                super.invalidate();
                InterfaceC196980125a interfaceC196980125a = c125s.LJIILIIL;
                if (interfaceC196980125a != null) {
                    interfaceC196980125a.LIZ();
                }
            } else {
                if (f54 <= f60) {
                    float f61 = f54 - c125s.LIZ;
                    if (f61 <= f60) {
                        f60 = f61;
                    }
                    c125s.LJIIL.LLILZ.LIZ = f60;
                } else {
                    float f62 = f54 + c125s.LIZ;
                    if (f62 >= f60) {
                        f60 = f62;
                    }
                    c125s.LJIIL.LLILZ.LIZ = f60;
                }
                if (f59 > 0.0f) {
                    if (f55 <= f59) {
                        float f63 = f55 - c125s.LIZIZ;
                        if (f63 <= f59) {
                            f59 = f63;
                        }
                        c125s.LJIIL.LJIIL(f59);
                    }
                } else if (f55 >= f59) {
                    float f64 = f55 - c125s.LIZIZ;
                    if (f64 >= f59) {
                        f59 = f64;
                    }
                    c125s.LJIIL.LJIIL(f59);
                }
                float f65 = c125s.LJIIIIZZ;
                if (f65 > c125s.LJ) {
                    if (f56 < f65) {
                        float f66 = f56 - c125s.LIZJ;
                        if (f66 <= f65) {
                            f65 = f66;
                        }
                        c125s.LJIIL.setCenterX(f65);
                    }
                } else if (f56 > f65) {
                    float f67 = f56 - c125s.LIZJ;
                    if (f67 >= f65) {
                        f65 = f67;
                    }
                    c125s.LJIIL.setCenterX(f65);
                }
                float f68 = c125s.LJIIIZ;
                if (f68 > c125s.LJFF) {
                    if (f57 < f68) {
                        float f69 = f57 - c125s.LIZLLL;
                        if (f69 <= f68) {
                            f68 = f69;
                        }
                        c125s.LJIIL.setCenterY(f68);
                    }
                } else if (f57 > f68) {
                    float f70 = f57 - c125s.LIZLLL;
                    if (f70 >= f68) {
                        f68 = f70;
                    }
                    c125s.LJIIL.setCenterY(f68);
                }
                super.invalidate();
            }
        }
        C125S c125s2 = this.LLJJ;
        C125Y c125y4 = this.LLILZ;
        float f71 = c125y4.LIZ;
        float f72 = c125y4.LIZIZ;
        float f73 = this.LL;
        float f74 = this.LLILLJJLI;
        if (c125s2.LJI) {
            float f75 = c125s2.LJIIJ;
            if (f75 < 0.0f ? !(f71 > 1.0f || f72 < 0.0f || f73 != c125s2.LJ || f74 != c125s2.LJFF) : !(f71 > 1.0f || f72 > 0.0f || f73 != c125s2.LJ || f74 != c125s2.LJFF)) {
                c125s2.LJI = false;
                c125s2.LJII = false;
                C125R c125r2 = c125s2.LJIIL;
                c125r2.LLILZ.LIZ = 1.0f;
                c125r2.LJIIL(0.0f);
                c125s2.LJIIL.setCenterX(c125s2.LJ);
                c125s2.LJIIL.setCenterY(c125s2.LJFF);
                super.invalidate();
                InterfaceC196980125a interfaceC196980125a2 = c125s2.LJIILIIL;
                if (interfaceC196980125a2 != null) {
                    interfaceC196980125a2.LIZJ();
                    return;
                }
                return;
            }
            if (f71 > 1.0f) {
                float f76 = f71 - c125s2.LIZ;
                if (f76 >= 1.0f) {
                    f58 = f76;
                }
                c125s2.LJIIL.LLILZ.LIZ = f58;
            } else {
                float f77 = f71 + c125s2.LIZ;
                if (f77 <= 1.0f) {
                    f58 = f77;
                }
                c125s2.LJIIL.LLILZ.LIZ = f58;
            }
            if (f75 > 0.0f) {
                if (f72 >= 0.0f) {
                    float f78 = f72 - c125s2.LIZIZ;
                    if (f78 < 0.0f) {
                        f78 = 0.0f;
                    }
                    c125s2.LJIIL.LJIIL(f78);
                }
            } else if (f72 <= 0.0f) {
                float f79 = f72 - c125s2.LIZIZ;
                if (f79 > 0.0f) {
                    f79 = 0.0f;
                }
                c125s2.LJIIL.LJIIL(f79);
            }
            float f80 = c125s2.LJIIIIZZ;
            float f81 = c125s2.LJ;
            if (f80 > f81) {
                if (f73 > f81) {
                    float f82 = f73 - c125s2.LIZJ;
                    if (f82 >= f81) {
                        f81 = f82;
                    }
                    c125s2.LJIIL.setCenterX(f81);
                }
            } else if (f73 < f81) {
                float f83 = f73 - c125s2.LIZJ;
                if (f83 <= f81) {
                    f81 = f83;
                }
                c125s2.LJIIL.setCenterX(f81);
            }
            float f84 = c125s2.LJIIIZ;
            float f85 = c125s2.LJFF;
            if (f84 > f85) {
                if (f74 > f85) {
                    float f86 = f74 - c125s2.LIZLLL;
                    if (f86 >= f85) {
                        f85 = f86;
                    }
                    c125s2.LJIIL.setCenterY(f85);
                }
            } else if (f74 < f85) {
                float f87 = f74 - c125s2.LIZLLL;
                if (f87 <= f85) {
                    f85 = f87;
                }
                c125s2.LJIIL.setCenterY(f85);
            }
            super.invalidate();
        }
    }

    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJIIJ(f, false);
    }

    public void setAnimXY(Point point) {
        C125S c125s = this.LLJJ;
        float f = point.x;
        float f2 = point.y;
        c125s.LJIIL.getLocationOnScreen(new int[2]);
        PointF pointF = new PointF(f - r1[0], f2 - r1[1]);
        c125s.LJ = pointF.x;
        c125s.LJFF = pointF.y;
    }

    public void setCenterX(float f) {
        this.LL = f;
    }

    public void setCenterY(float f) {
        this.LLILLJJLI = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDrawStrokeState(int r10) {
        /*
            r9 = this;
            r6 = 1
            r8 = 4
            if (r10 != r8) goto L34
            r1 = 1
        L5:
            X.125Q r0 = r9.LLJILLL
            r0.LJJIIZ = r1
            if (r1 == 0) goto L32
            android.content.Context r2 = r9.getContext()
            int r7 = r9.getWidth()
            int r5 = r9.getHeight()
            long r3 = (long) r7
            long r0 = (long) r5
            long r3 = r3 * r0
            long r0 = (long) r8
            long r3 = r3 * r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r2)
            int r0 = r0.getScaledMaximumDrawingCacheSize()
            long r1 = (long) r0
            if (r7 <= 0) goto L32
            if (r5 <= 0) goto L32
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L32
        L2d:
            r0 = 0
            r9.setLayerType(r6, r0)
            return
        L32:
            r6 = 2
            goto L2d
        L34:
            r1 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125R.setDrawStrokeState(int):void");
    }

    public void setEditModeListener(InterfaceC196980125a interfaceC196980125a) {
        this.LLJJ.LJIILIIL = interfaceC196980125a;
    }

    public void setEnableEdit(boolean z) {
        this.LLJI = z;
    }

    public void setEnableRotate(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public void setFontSize(int i) {
        TextStickerData textStickerData = this.LLJJIII;
        if (textStickerData != null) {
            textStickerData.setFontSize(i);
        }
        this.LLILZ.LJ = (int) C0JAI.LJI(i, getContext());
        C125Q c125q = this.LLJILLL;
        float f = this.LLILZ.LJ;
        c125q.LJIIJJI = f;
        float fLJI = f / C0JAI.LJI(28.0f, c125q.LJJI.getContext());
        c125q.LJIIL = C0JAI.LIZ(12.0f, c125q.LJJI.getContext()) * fLJI;
        float fLIZ = C0JAI.LIZ(8.0f, c125q.LJJI.getContext()) * fLJI;
        c125q.LJIILIIL = fLIZ;
        c125q.LJIILJJIL = c125q.LJIIL;
        c125q.LJIILL = fLIZ;
        c125q.LJIJ = (int) (C0JAI.LIZ(5.0f, c125q.LJJI.getContext()) * fLJI);
        c125q.LJII.setPathEffect(new CornerPathEffect(c125q.LJIJ));
        super.invalidate();
    }

    public void setInitOffsetY(float f) {
        this.LLILLL = f;
    }

    public void setMotionInterceptor(InterfaceC196983125d interfaceC196983125d) {
        this.LLJJI.LJIJI = interfaceC196983125d;
    }

    public void setOnEditClickListener(C125X c125x) {
        this.LLJJI.LIZ = c125x;
    }

    public void setPlayPosition(long j) {
        this.LLJJIJI = j;
    }

    public void setShowHelpBox(boolean z) {
        this.LLJJI.LIZJ(z);
        if (!z) {
            this.LLJJIJIIJIL = SystemClock.elapsedRealtime();
            this.LLJIJIL.postDelayed(new ARunnableS129S0100000_29(this, 10), 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setText(java.util.List<com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap> r9) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125R.setText(java.util.List):void");
    }

    public void setTextColor(int i) {
        C125Q c125q = this.LLJILLL;
        c125q.getClass();
        C196986125g c196986125gLJFF = C196986125g.LJFF();
        boolean z = false;
        if (c196986125gLJFF.LIZ.get(c196986125gLJFF.LIZJ) != null && c196986125gLJFF.LIZ.get(c196986125gLJFF.LIZJ).enableMaskBlurLightColor == 1) {
            z = true;
        }
        c125q.LJJIII = z;
        if (c125q.LJIJJ.getTypeface() != C196986125g.LJFF().LIZ()) {
            c125q.LJIJJ.setTypeface(C196986125g.LJFF().LIZ());
        }
        if (c125q.LJJIII) {
            c125q.LJIJJ.setColor(-1);
            c125q.LJIJJ.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            c125q.LJIJJ.setShadowLayer(0.0f, 0.0f, 0.0f, i);
            c125q.LJIJJ.setColor(i);
        }
        this.LLJJJIL = i;
    }

    public void setTouching(boolean z) {
        if (z == this.LLJLILLLLZIIL) {
            return;
        }
        this.LLJLILLLLZIIL = z;
        super.invalidate();
        if (!z) {
            this.LLJJIJIIJIL = SystemClock.elapsedRealtime();
            this.LLJIJIL.postDelayed(new ARunnableS129S0100000_29(this, 10), 1000L);
        }
    }

    public final boolean LJ(float f, float f2) {
        RectF deleteIconRect = getDeleteIconRect();
        if (deleteIconRect == null) {
            return false;
        }
        C121Q.LIZJ(new Point((int) deleteIconRect.centerX(), (int) deleteIconRect.centerY()), getHelpRect().centerX(), getHelpRect().centerY(), this.LLILZ.LIZIZ);
        if (Math.pow(Math.pow(r7.x - f, 2.0d) + Math.pow(r7.y - f2, 2.0d), 0.5d) > deleteIconRect.width() / 2.0f) {
            return false;
        }
        return true;
    }

    public final void LJIIJ(float f, boolean z) {
        if (z) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(f);
        }
    }

    public final void LJIILIIL(int i, int i2) {
        this.LLJILJIL = i;
        this.LLJILJILJ = i2;
        C125U c125u = this.LLJJI;
        c125u.LJIIJ = i;
        c125u.LJIIJJI = i2;
        TextStickerData textStickerData = this.LLJJIII;
        if (textStickerData != null && textStickerData.getEditCenterPoint() != null) {
            setAnimXY(this.LLJJIII.getEditCenterPoint());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void LJIIJJI(int i, int i2, int i3, String str) {
        TextStickerData textStickerData = this.LLJJIII;
        if (textStickerData != null) {
            textStickerData.setBgMode(i);
            this.LLJJIII.setColor(i2);
            this.LLJJIII.setFontType(str);
            this.LLJJIII.setAlign(i3);
        }
        this.LLIZ = i;
        setDrawStrokeState(i);
        this.LLIZLLLIL = i2;
        this.LLJ = str;
        C196986125g.LJFF().LIZJ = this.LLJ;
        if (i != 1 && i != 4) {
            if (i == 2) {
                if (i2 == -1) {
                    setTextColor(-16777216);
                } else {
                    setTextColor(-1);
                }
                LIZ(i2);
                this.LLILZ.LJFF = true;
            } else if (i == 3) {
                setTextColor(-1);
                LIZ(Color.argb(153, (16711680 & i2) >> 16, (65280 & i2) >> 8, i2 & 255));
                this.LLILZ.LJFF = true;
            }
        } else {
            setTextColor(i2);
            this.LLILZ.LJFF = false;
        }
        this.LLILZ.LIZLLL = i3;
        super.invalidate();
    }

    public C125R(C19EG c19eg, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, InterfaceC196984125e interfaceC196984125e) {
        super(c19eg);
        C125Y c125y = new C125Y();
        this.LLILZ = c125y;
        this.LLILZIL = true;
        this.LLIZ = 1;
        this.LLIZLLLIL = -1;
        this.LLJ = "default";
        this.LLJI = true;
        this.LLJJIJIL = new ArrayList<>();
        this.LLJJJJ = new PointF();
        this.LLJJJJLIIL = true;
        int i = AnonymousClass1258.LIZ;
        AnonymousClass1258.LIZ = i + 1;
        this.LLJJL = i;
        setWillNotDraw(false);
        this.LLJIJIL = safeHandler;
        c125y.LJII = z;
        this.LLJILLL = new C125Q();
        this.LLJJI = new C125U(interfaceC196984125e);
        this.LLJJ = new C125S();
        C125Q c125q = this.LLJILLL;
        c125q.LIZ = c19eg;
        c125q.LJJI = this;
        setLayerType(2, null);
        c125q.LJIIJJI = C0JAI.LJI(28.0f, c19eg);
        c125q.LJIIL = C0JAI.LIZ(12.0f, c19eg);
        float fLIZ = C0JAI.LIZ(8.0f, c19eg);
        c125q.LJIILIIL = fLIZ;
        c125q.LJIILJJIL = c125q.LJIIL;
        c125q.LJIILL = fLIZ;
        c125q.LJIILLIIL = (int) C0JAI.LIZ(2.0f, c19eg);
        C0JAI.LIZ(14.0f, c19eg);
        c125q.LJIIZILJ = (int) C0JAI.LIZ(2.0f, c19eg);
        c125q.LJIJ = (int) C0JAI.LIZ(5.0f, c19eg);
        c125q.LJIJI = C11VU.LIZIZ(4.0f, c19eg);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(c19eg.getResources(), R.drawable.ckq);
        c125q.LJI = bitmapDecodeResource;
        c125q.LIZLLL.set(0, 0, bitmapDecodeResource.getWidth(), c125q.LJI.getHeight());
        c125q.LJIJJ.setColor(-1);
        c125q.LJIJJ.setTypeface(Typeface.DEFAULT_BOLD);
        c125q.LJIJJ.setTextSize(c125q.LJIIJJI);
        c125q.LJIJJ.setAntiAlias(true);
        new Paint(c125q.LJIJJ).setColor(-16737912);
        c125q.LJIJJLI.setColor(-2130706433);
        c125q.LJIJJLI.setStyle(Paint.Style.STROKE);
        c125q.LJIJJLI.setAntiAlias(true);
        c125q.LJIJJLI.setStrokeWidth(2.0f);
        Paint paint = new Paint();
        c125q.LJII = paint;
        paint.setStyle(Paint.Style.FILL);
        c125q.LJII.setAntiAlias(true);
        c125q.LJII.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        c125q.LJII.setPathEffect(new CornerPathEffect(c125q.LJIJ));
        c125q.LJJ = new Path();
        C125U c125u = this.LLJJI;
        c125u.LJIILL = this;
        c125u.LJIILIIL = safeHandler;
        this.LLJJ.LJIIL = this;
        ScreenUtils.getScreenWidth(c19eg);
        ScreenUtils.getScreenHeight(c19eg);
        C786410Ut5.H2(c19eg, "vibrator");
        this.LLJJIII = textStickerData;
        this.LLIZ = textStickerData.getBgMode();
        this.LLIZLLLIL = this.LLJJIII.getColor();
        c125y.LIZLLL = this.LLJJIII.getAlign();
        this.LLJ = this.LLJJIII.getFontType();
        this.LL = this.LLJJIII.getX();
        this.LLILLJJLI = this.LLJJIII.getY();
        c125y.LIZIZ = this.LLJJIII.getRotation();
        c125y.LIZ = this.LLJJIII.getScale();
        this.LLILZLL = this.LLJJIII.getTextWrapList();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLILZIL) {
            this.LLILZIL = false;
            this.LL = getMeasuredWidth() / 2.0f;
            this.LLILLJJLI = ((getMeasuredHeight() / 2.0f) - (getFontSize() / 2.0f)) + this.LLILLL;
            C125Y c125y = this.LLILZ;
            c125y.LIZIZ = 0.0f;
            c125y.LIZ = 1.0f;
            LJFF(this.LLJJIII);
        }
    }
}
