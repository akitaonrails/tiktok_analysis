package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.122x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C196925122x extends FrameLayout implements C121I<TextStickerData> {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public final C123K LLILZ;
    public boolean LLILZIL;
    public List<TextStickerTextWrap> LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public final SafeHandler LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public C196926122y LLJJIII;
    public AnonymousClass1238 LLJJIJI;
    public AnonymousClass1234 LLJJIJIIJIL;
    public TextStickerData LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;
    public final ArrayList<PointF[]> LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public final C122I LLJJL;
    public final PointF LLJJLIIIJLLLLLLLZ;
    public C121S LLJL;
    public InterfaceC196928123a LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final int LLJLL;
    public InterfaceC196933123f LLJLLIL;
    public final Boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;

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
        C123K c123k = this.LLILZ;
        if (c123k.LJ < 0) {
            c123k.LJ = (int) C0JAI.LJI(this.LLJJIJIL == null ? 28.0f : r0.getFontSize(), getContext());
        }
        return this.LLILZ.LJ;
    }

    public C196926122y LJII() {
        return new C196926122y();
    }

    public TextStickerData LJIIJ() {
        if (this.LLJJIJIL == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LLIZ, this.LLIZLLLIL, this.LLILZ.LIZLLL, this.LLJ);
            this.LLJJIJIL = textStickerData;
            textStickerData.setTextWrapList(getTextWrapList());
            if (C123O.LIZIZ() != null) {
                C123O.LIZIZ().LIZIZ(new IllegalStateException("Why are you running here?"));
            }
        }
        this.LLJJIJIL.setTextStr(C123P.LJFF(getTextWrapList()));
        this.LLJJIJIL.setX(this.LL);
        this.LLJJIJIL.setY(this.LLILLJJLI);
        this.LLJJIJIL.setRotation(this.LLILZ.LIZIZ);
        this.LLJJIJIL.setScale(this.LLILZ.LIZ);
        this.LLJJIJIL.setTextWrapList(getTextWrapList());
        this.LLJJIJIL.setBgMode(this.LLIZ);
        this.LLJJIJIL.setColor(this.LLIZLLLIL);
        this.LLJJIJIL.setAlign(this.LLILZ.LIZLLL);
        this.LLJJIJIL.setFontType(this.LLJ);
        TextStickerData textStickerData2 = this.LLJJIJIL;
        textStickerData2.setFontSize(textStickerData2.getFontSize());
        this.LLJJIJIL.setLayoutWidth(getMeasuredWidth());
        this.LLJJIJIL.setLayoutHeight(getMeasuredHeight());
        return this.LLJJIJIL;
    }

    public void LJIIJJI() {
        AnonymousClass1238 anonymousClass1238 = this.LLJJIJI;
        float f = this.LL;
        float f2 = this.LLILLJJLI;
        C123K c123k = this.LLILZ;
        float f3 = c123k.LIZ;
        float f4 = c123k.LIZIZ;
        anonymousClass1238.LJI = true;
        anonymousClass1238.LJII = false;
        anonymousClass1238.LJIIIIZZ = f;
        anonymousClass1238.LJIIIZ = f2;
        anonymousClass1238.LJIIJ = f4;
        anonymousClass1238.LJIIJJI = f3;
        float f5 = 15;
        anonymousClass1238.LIZ = f3 / f5;
        anonymousClass1238.LIZIZ = f4 / f5;
        anonymousClass1238.LIZJ = (f - anonymousClass1238.LJ) / f5;
        anonymousClass1238.LIZLLL = (f2 - anonymousClass1238.LJFF) / f5;
        anonymousClass1238.LJIIL.invalidate();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public void LJIIL() {
        AnonymousClass1238 anonymousClass1238 = this.LLJJIJI;
        anonymousClass1238.LJII = true;
        anonymousClass1238.LJI = false;
        float f = 15;
        anonymousClass1238.LIZ = (-anonymousClass1238.LJIIJJI) / f;
        anonymousClass1238.LIZIZ = (-anonymousClass1238.LJIIJ) / f;
        anonymousClass1238.LIZJ = (-(anonymousClass1238.LJIIIIZZ - anonymousClass1238.LJ)) / f;
        anonymousClass1238.LIZLLL = (-(anonymousClass1238.LJIIIZ - anonymousClass1238.LJFF)) / f;
        super.invalidate();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        TextStickerData textStickerData = this.LLJJIJIL;
        if (textStickerData == null || textStickerData.isVisibleWhen(this.LLJJJ)) {
            return;
        }
        AnonymousClass1238 anonymousClass12382 = this.LLJJIJI;
        anonymousClass12382.LJII = false;
        anonymousClass12382.LJI = false;
        C196925122x c196925122x = anonymousClass12382.LJIIL;
        c196925122x.LLILZ.LIZ = anonymousClass12382.LJIIJJI;
        c196925122x.LJJIIZ(anonymousClass12382.LJIIJ);
        anonymousClass12382.LJIIL.setCenterX(anonymousClass12382.LJIIIIZZ);
        anonymousClass12382.LJIIL.setCenterY(anonymousClass12382.LJIIIZ);
        super.invalidate();
    }

    public final void LJJII() {
        if (this.LLJJIJIL != null) {
            C123K c123k = this.LLILZ;
            boolean z = this.LLJJIJIIJIL.LJIIIIZZ;
            c123k.LJI = z;
            if (z || this.LLLFF) {
                return;
            }
            int i = 0;
            if (SystemClock.elapsedRealtime() >= this.LLJJJIL) {
                boolean zIsVisibleWhen = this.LLJJIJIL.isVisibleWhen(this.LLJJJ);
                if (!this.LLJJIJIL.getShowOnScreen()) {
                    this.LLJJIJIL.setShowOnScreen(true);
                    TextStickerData textStickerData = this.LLJJIJIL;
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

    public void LJJIJ() {
        TextStickerData textStickerData = this.LLJJIJIL;
        if (textStickerData == null || !textStickerData.hasPositionData()) {
            return;
        }
        if (!this.LLJJIJIL.isGuidanceSticker() || this.LLJLLL.booleanValue()) {
            this.LL = this.LLJJIJIL.getX();
        }
        this.LLILLJJLI = this.LLJJIJIL.getY();
        this.LLILZ.LIZIZ = this.LLJJIJIL.getRotation();
        this.LLILZ.LIZ = this.LLJJIJIL.getScale();
    }

    public final boolean LJJIJIIJIL() {
        if (this.LLJI && getVisibility() == 0) {
            return !this.LLJJIJIIJIL.LIZIZ() || this.LLILZ.LJII;
        }
        return false;
    }

    public PointF[] getAnglePointList() {
        C196926122y c196926122y = this.LLJJIII;
        int size = ((ArrayList) c196926122y.LJJJI).size();
        PointF[] pointFArr = new PointF[size];
        float radians = (float) Math.toRadians(c196926122y.LJJJ);
        for (int i = 0; i < size; i++) {
            pointFArr[i] = C121Q.LIZIZ(c196926122y.LIZJ.centerX(), c196926122y.LIZJ.centerY(), radians, (PointF) ListProtector.get(c196926122y.LJJJI, i));
        }
        return pointFArr;
    }

    public PointF[] getAnglePointListForBlock() {
        C196926122y c196926122y = this.LLJJIII;
        c196926122y.getClass();
        PointF[] pointFArr = new PointF[4];
        RectF rectF = c196926122y.LIZIZ;
        int i = 0;
        pointFArr[0] = new PointF(rectF.left, rectF.top);
        RectF rectF2 = c196926122y.LIZIZ;
        pointFArr[1] = new PointF(rectF2.right, rectF2.top);
        RectF rectF3 = c196926122y.LIZIZ;
        pointFArr[2] = new PointF(rectF3.right, rectF3.bottom);
        RectF rectF4 = c196926122y.LIZIZ;
        pointFArr[3] = new PointF(rectF4.left, rectF4.bottom);
        float radians = (float) Math.toRadians(c196926122y.LJJJ);
        do {
            pointFArr[i] = C121Q.LIZIZ(c196926122y.LIZIZ.centerX(), c196926122y.LIZIZ.centerY(), radians, pointFArr[i]);
            i++;
        } while (i < 4);
        return pointFArr;
    }

    public int getCurAlignTxt() {
        return this.LLILZ.LIZLLL;
    }

    public RectF getCurrentHelpBoxRect() {
        return this.LLJJIII.LJII();
    }

    public RectF getDeleteIconRect() {
        C196926122y c196926122y = this.LLJJIII;
        if (c196926122y.LJIIZILJ) {
            return c196926122y.LJIIJ;
        }
        return null;
    }

    public float getGuidanceRectBottom() {
        return this.LLJJIII.LIZIZ.bottom + r2.LJIIL;
    }

    public RectF getHelpRect() {
        return this.LLJJIII.LIZJ;
    }

    public RectF getMinTextRect() {
        C196926122y c196926122y = this.LLJJIII;
        c196926122y.getClass();
        RectF rectF = c196926122y.LIZIZ;
        float f = rectF.left;
        float f2 = c196926122y.LJJI;
        float f3 = rectF.top;
        float f4 = c196926122y.LJJIFFI;
        return new RectF(f + f2, f3 + f4, rectF.right - f2, rectF.bottom - f4);
    }

    public float getOriginHeight() {
        if (this.LLJJJJ.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].y;
        for (PointF[] pointFArr : this.LLJJJJ) {
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
        return (f4 - f3) / this.LLJJIJIL.getScale();
    }

    public float getOriginWidth() {
        if (this.LLJJJJ.isEmpty()) {
            return 0.0f;
        }
        float f = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].x;
        float f2 = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].x;
        float f3 = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].y;
        float f4 = ((PointF[]) ListProtector.get(this.LLJJJJ, 0))[0].y;
        for (PointF[] pointFArr : this.LLJJJJ) {
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
        return (f2 - f) / this.LLJJIJIL.getScale();
    }

    public float getStickerRotate() {
        return this.LLILZ.LIZIZ;
    }

    public float getStickerScale() {
        return this.LLILZ.LIZ;
    }

    public String getText() {
        return C123P.LJIIIIZZ(this.LLILZLL);
    }

    public float getTextMiddleLineCenterX() {
        C196926122y c196926122y = this.LLJJIII;
        if (c196926122y == null) {
            return 0.0f;
        }
        return c196926122y.LJJJJJL;
    }

    public float getTextMiddleLineCenterY() {
        C196926122y c196926122y = this.LLJJIII;
        if (c196926122y == null) {
            return 0.0f;
        }
        return c196926122y.LJJJJJ;
    }

    public RectF getTextRect() {
        return this.LLJJIII.LIZIZ;
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        List<TextStickerTextWrap> list = this.LLILZLL;
        return list == null ? new ArrayList() : list;
    }

    @Override // X.C121I
    public final InterfaceC384940F7k LIZJ() {
        return LJIIJ().m187clone();
    }

    @Override // X.C121I
    public final int LJFF() {
        if (getData() == null || !getData().hasTimeData()) {
            return 0;
        }
        return getData().getUiStartTime();
    }

    public float LJIIIIZZ() {
        return getMeasuredWidth() / 2.0f;
    }

    public final boolean LJJI() {
        if (!LJJIJIIJIL()) {
            return false;
        }
        this.LLLF = false;
        super.invalidate();
        return true;
    }

    public int getContentViewHeight() {
        return (int) Math.abs(getMinTextRect().bottom - getMinTextRect().top);
    }

    public int getContentViewWidth() {
        return (int) Math.abs(getMinTextRect().right - getMinTextRect().left);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C122I c122i = this.LLJJL;
        if (c122i != null) {
            ((ArrayList) C122I.LJIIJJI).add(c122i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C122I c122i = this.LLJJL;
        if (c122i != null) {
            ((ArrayList) C122I.LJIIJJI).remove(c122i);
        }
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
        return this.LLJJIJIL;
    }

    public boolean getGuideFirstEdit() {
        return this.LLJJ;
    }

    public Boolean getRecordPageTTS() {
        return this.LLJLLL;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
    }

    @Override // X.C121I
    public final int LIZ(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getUiEndTime();
        }
        return i;
    }

    @Override // X.C121I
    public final int LIZIZ(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getEndTime();
        }
        return i;
    }

    @Override // X.C121I
    public final int LIZLLL(int i) {
        if (getData() != null && getData().hasTimeData()) {
            return getData().getStartTime();
        }
        return i;
    }

    public final void LJI(int i) {
        C196926122y c196926122y = this.LLJJIII;
        c196926122y.LJIJI.setColor(i);
        c196926122y.LJIJJ = i;
        if (c196926122y.LJJIZ) {
            c196926122y.LJJIJ.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            c196926122y.LJJIJ.setShadowLayer(0.0f, 0.0f, 0.0f, i);
        }
        this.LLJJJJJIL = i;
    }

    public final void LJIIIZ(Canvas canvas) {
        boolean z;
        C123K c123k = this.LLILZ;
        PointF pointF = c123k.LIZJ;
        pointF.x = this.LL;
        pointF.y = this.LLILLJJLI;
        c123k.LJI = this.LLJJIJIIJIL.LJIIIIZZ;
        getFontSize();
        C196926122y c196926122y = this.LLJJIII;
        if (this.LLJILJIL && !this.LLLFF && !this.LLLF) {
            z = true;
        } else {
            z = false;
        }
        c196926122y.LJIIZILJ = z;
        c196926122y.LJIILLIIL = this.LLJLLL.booleanValue();
        this.LLJJIII.LJ(canvas, this.LLILZ, this.LLJJJJ);
    }

    public final void LJIIZILJ(TextStickerData textStickerData) {
        this.LLJJIJIL = textStickerData;
        if (textStickerData == null) {
            return;
        }
        setFontSize(textStickerData.getFontSize());
        LJJIIJ(this.LLJJIJIL.getBgMode(), this.LLJJIJIL.getColor(), this.LLJJIJIL.getAlign(), this.LLJJIJIL.getFontType());
        LJJIIZI(textStickerData.getEffectTextLayoutConfig(), this.LLJJIJIL.getTextWrapList());
        setAnimXY(this.LLJJIJIL.getEditCenterPoint());
        LJJIJ();
        super.invalidate();
    }

    public final boolean LJIJ(MotionEvent motionEvent) {
        if (!LJJIJIIJIL()) {
            return false;
        }
        float centerX = getCenterX();
        float centerY = getCenterY();
        getStickerRotate();
        getStickerScale();
        this.LLJL = new C121S(centerX, centerY);
        motionEvent.getY();
        motionEvent.getRawY();
        boolean zLIZJ = this.LLJJIJIIJIL.LIZJ(motionEvent.getX(), motionEvent.getY());
        if (zLIZJ) {
            setTouching(true);
        }
        return zLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJI(zoo.b r16) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196925122x.LJIJI(zoo.b):boolean");
    }

    public final boolean LJIJJ(float f) {
        if (!LJJIJIIJIL()) {
            return false;
        }
        float degrees = (float) Math.toDegrees(f);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        if (!this.LLJZIJLIL && !this.LLJZ && this.LLJJIJIIJIL.LJIIIZ != 3) {
            return false;
        }
        C123K c123k = this.LLILZ;
        AnonymousClass1234 anonymousClass1234 = this.LLJJIJIIJIL;
        float f2 = c123k.LIZIZ;
        if (-1 != anonymousClass1234.LIZ.LIZLLL(anonymousClass1234.LJIILLIIL, false, true)) {
            degrees = anonymousClass1234.LIZ.LIZ(degrees);
        }
        float f3 = f2 - degrees;
        if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        if (f3 < -180.0f) {
            f3 += 360.0f;
        }
        anonymousClass1234.LIZLLL(false);
        InterfaceC196951123x interfaceC196951123x = anonymousClass1234.LJIJJ;
        if (interfaceC196951123x != null) {
            interfaceC196951123x.LIZ();
        }
        c123k.LIZIZ = f3;
        super.invalidate();
        return true;
    }

    public final boolean LJIJJLI(C21645419nQ c21645419nQ) {
        if (!LJJIJIIJIL()) {
            return false;
        }
        this.LLJZIJLIL = LJIILJJIL(c21645419nQ.LJIILJJIL, c21645419nQ.LJIILL);
        this.LLJJIJIIJIL.LIZJ(c21645419nQ.LJIILJJIL, c21645419nQ.LJIILL);
        if (!this.LLJZIJLIL && !this.LLJZ && this.LLJJIJIIJIL.LJIIIZ != 3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r4.LLILZ.LIZ < 0.4f) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIL(android.view.ScaleGestureDetector r5) {
        /*
            r4 = this;
            boolean r0 = r4.LJJIJIIJIL()
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            boolean r0 = r4.LLL
            r3 = 1
            if (r0 != 0) goto L18
            boolean r0 = r4.LLJZ
            if (r0 != 0) goto L18
            X.1234 r0 = r4.LLJJIJIIJIL
            int r1 = r0.LJIIIZ
            r0 = 3
            if (r1 != r0) goto L2d
        L18:
            float r1 = r5.getScaleFactor()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L2e
            X.123K r0 = r4.LLILZ
            float r1 = r0.LIZ
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L39
        L2d:
            return r2
        L2e:
            X.123K r0 = r4.LLILZ
            float r1 = r0.LIZ
            r0 = 1093664768(0x41300000, float:11.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L39
            return r2
        L39:
            float r2 = r5.getScaleFactor()
            X.123K r1 = r4.LLILZ
            float r0 = r1.LIZ
            float r0 = r0 * r2
            r1.LIZ = r0
            super.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196925122x.LJIL(android.view.ScaleGestureDetector):boolean");
    }

    public final boolean LJJ(ScaleGestureDetector scaleGestureDetector) {
        if (!LJJIJIIJIL()) {
            return false;
        }
        this.LLL = LJIILJJIL(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.LLJJIJIIJIL.LIZJ(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        this.LLLF = true;
        if (!this.LLL && !this.LLJZ && this.LLJJIJIIJIL.LJIIIZ != 3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIFFI(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196925122x.LJJIFFI(android.view.MotionEvent):boolean");
    }

    public final void LJJIIZ(float f) {
        C123K c123k = this.LLILZ;
        c123k.LIZIZ = f;
        if (f > 180.0f) {
            c123k.LIZIZ = f - 360.0f;
        }
        float f2 = c123k.LIZIZ;
        if (f2 < -180.0f) {
            c123k.LIZIZ = f2 + 360.0f;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LJIIIZ(canvas);
        AnonymousClass1238 anonymousClass1238 = this.LLJJIJI;
        C123K c123k = this.LLILZ;
        anonymousClass1238.LIZIZ(c123k.LIZ, c123k.LIZIZ, this.LL, this.LLILLJJLI);
        AnonymousClass1238 anonymousClass12382 = this.LLJJIJI;
        C123K c123k2 = this.LLILZ;
        anonymousClass12382.LIZ(c123k2.LIZ, c123k2.LIZIZ, this.LL, this.LLILLJJLI);
    }

    @Override // X.C121T
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJJIII(f, false);
    }

    public void setAnimXY(Point point) {
        AnonymousClass1238 anonymousClass1238 = this.LLJJIJI;
        C786410Ut5.x3(anonymousClass1238.LJIIL.getViewTreeObserver(), new C123C(anonymousClass1238, point.x, point.y));
    }

    public void setCenterX(float f) {
        this.LL = f;
    }

    public void setCenterY(float f) {
        this.LLILLJJLI = f;
    }

    public void setEnableEdit(boolean z) {
        this.LLJI = z;
    }

    public void setFontSize(int i) {
        TextStickerData textStickerData = this.LLJJIJIL;
        if (textStickerData != null) {
            textStickerData.setFontSize(i);
        }
        this.LLILZ.LJ = (int) C0JAI.LJI(i, getContext());
        C196926122y c196926122y = this.LLJJIII;
        float f = this.LLILZ.LJ;
        c196926122y.LJJ = f;
        float fLJI = f / C0JAI.LJI(c196926122y.LIZLLL(), c196926122y.LJJIJL.getContext());
        c196926122y.LJJI = C0JAI.LIZ(12.0f, c196926122y.LJJIJL.getContext()) * fLJI;
        float fLIZ = C0JAI.LIZ(8.0f, c196926122y.LJJIJL.getContext()) * fLJI;
        c196926122y.LJJIFFI = fLIZ;
        c196926122y.LJJII = c196926122y.LJJI;
        c196926122y.LJJIII = fLIZ;
        c196926122y.LJJIIZ = (int) (C0JAI.LIZ(5.0f, c196926122y.LJJIJL.getContext()) * fLJI);
        c196926122y.LJIJI.setPathEffect(new CornerPathEffect(c196926122y.LJJIIZ));
        super.invalidate();
    }

    public void setGuideFirstEdit(boolean z) {
        this.LLJJ = z;
    }

    @Override // X.C121T
    public void setHighlightState(EnumC390580FTc enumC390580FTc) {
        if (getData() != null) {
            C786410Ut5.L5(this, getData().alphaFromHighlightState(enumC390580FTc));
        }
    }

    public void setInitOffsetY(float f) {
        this.LLILLL = f;
    }

    public void setIsGuidanceSticker(boolean z) {
        this.LLJILJIL = z;
    }

    public void setMotionInterceptor(AnonymousClass1223 anonymousClass1223) {
        this.LLJJIJIIJIL.LJJ = anonymousClass1223;
    }

    public void setOnEditClickListener(InterfaceC196910122i interfaceC196910122i) {
        this.LLJJIJIIJIL.LIZ = interfaceC196910122i;
    }

    public void setOnEffectTextGestureListener(InterfaceC196951123x interfaceC196951123x) {
        this.LLJJIJIIJIL.LJIJJ = interfaceC196951123x;
    }

    public void setPlayPosition(long j) {
        this.LLJJJ = j;
    }

    public void setShowHelpBox(boolean z) {
        this.LLJJIJIIJIL.LIZLLL(z);
        if (!z) {
            this.LLJJJIL = SystemClock.elapsedRealtime();
            this.LLJIJIL.postDelayed(new ARunnableS129S0100000_29(this, 32), 1000L);
        }
    }

    public void setTextColor(int i) {
        C196926122y c196926122y = this.LLJJIII;
        c196926122y.getClass();
        C0FI2.LJIJJ();
        boolean zLIZ = false;
        if (C0FI2.LJIILIIL(0) != null) {
            zLIZ = C0FI2.LJIILIIL(0).LIZ();
        }
        c196926122y.LJJIZ = zLIZ;
        if (c196926122y.LJJIJ.getTypeface() != C0FI2.LJIJJ().LJIIIIZZ()) {
            c196926122y.LJJIJ.setTypeface(C0FI2.LJIJJ().LJIIIIZZ());
        }
        if (c196926122y.LJJIZ) {
            c196926122y.LJJIJ.setColor(-1);
            c196926122y.LJJIJ.setShadowLayer(12.0f, 0.0f, 0.0f, i);
        } else {
            c196926122y.LJJIJ.setShadowLayer(0.0f, 0.0f, 0.0f, i);
            c196926122y.LJJIJ.setColor(i);
        }
        this.LLJJJJLIIL = i;
    }

    public void setTextGestureEventTrackListener(InterfaceC196933123f interfaceC196933123f) {
        this.LLJLLIL = interfaceC196933123f;
    }

    public void setTouching(boolean z) {
        if (z == this.LLLFF) {
            return;
        }
        this.LLLFF = z;
        super.invalidate();
        if (!z) {
            this.LLJJJIL = SystemClock.elapsedRealtime();
            this.LLJIJIL.postDelayed(new ARunnableS129S0100000_29(this, 32), 1000L);
        }
    }

    public void setWasGuidanceSticker(boolean z) {
        this.LLJILLL = z;
    }

    public PointF LJIILIIL(float f, float f2) {
        getLocationOnScreen(new int[2]);
        return new PointF(f - r1[0], f2 - r1[1]);
    }

    public boolean LJIILJJIL(float f, float f2) {
        return C121Q.LIZ(f, f2 - this.LLJJI, this.LLILZ.LIZIZ, getHelpRect(), 0.0f);
    }

    public boolean LJIILL(float f, float f2) {
        return C121Q.LIZ(f, f2, this.LLILZ.LIZIZ, getHelpRect(), 0.0f);
    }

    public final boolean LJIILLIIL(float f, float f2) {
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

    public final void LJJIII(float f, boolean z) {
        if (z) {
            C786410Ut5.L5(this, 1.0f);
        } else {
            C786410Ut5.L5(this, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[PHI: r5
      0x0066: PHI (r5v3 int) = (r5v1 int), (r5v0 int) binds: [B:21:0x0085, B:14:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(int r12, int r13) {
        /*
            r11 = this;
            r5 = 1
            r9 = 4
            if (r12 != r9) goto L88
            r6 = 1
        L5:
            X.122y r0 = r11.LLJJIII
            r0.LJJJIL = r6
            r0.LJJJJ = r13
            boolean r0 = X.C297910Bm1.LIZ()
            if (r0 != 0) goto L83
            if (r6 == 0) goto L84
            android.content.Context r2 = r11.getContext()
            int r8 = r11.getWidth()
            int r7 = r11.getHeight()
            long r3 = (long) r8
            long r0 = (long) r7
            long r3 = r3 * r0
            long r0 = (long) r9
            long r3 = r3 * r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r2)
            int r0 = r0.getScaledMaximumDrawingCacheSize()
            long r1 = (long) r0
            X.122D r10 = X.C123O.LIZIZ()
            if (r10 == 0) goto L5e
            java.lang.StringBuilder r9 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "TextSticker isDrawCacheValid -> width: "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = ", height: "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r0 = ", pbSize: "
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = ", dcSize: "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r9)
            r10.i(r0)
        L5e:
            if (r8 <= 0) goto L84
            if (r7 <= 0) goto L84
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L84
        L66:
            X.122D r2 = X.C123O.LIZIZ()
            if (r2 == 0) goto L7f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "TextSticker setLayerType -> viewType: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.i(r0)
        L7f:
            r0 = 0
            r11.setLayerType(r5, r0)
        L83:
            return
        L84:
            r5 = 2
            if (r6 == 0) goto L7f
            goto L66
        L88:
            r6 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196925122x.LJJIIJZLJL(int, int):void");
    }

    public final void LJJIIZI(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List list) {
        TextStickerData textStickerData = this.LLJJIJIL;
        if (textStickerData != null) {
            textStickerData.setTextWrapList(list);
        }
        LJJIJIIJI(innerEffectTextLayoutConfig, list);
        super.invalidate();
    }

    public void LJJIJIIJI(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List list) {
        this.LLILZLL = list;
        this.LLJJIII.LJIIL(list);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // X.C121I
    public final /* bridge */ /* synthetic */ void LJ(InterfaceC384940F7k interfaceC384940F7k, int i, int i2) {
        LJIIZILJ((TextStickerData) interfaceC384940F7k);
    }

    public void LJJIIJ(int i, int i2, int i3, String str) {
        TextStickerData textStickerData = this.LLJJIJIL;
        if (textStickerData != null) {
            textStickerData.setBgMode(i);
            this.LLJJIJIL.setColor(i2);
            this.LLJJIJIL.setFontType(str);
            this.LLJJIJIL.setAlign(i3);
        }
        this.LLIZ = i;
        Pair<Integer, Integer> pairLJI = C0F9I.LJI(i, i2);
        int iIntValue = pairLJI.getFirst().intValue();
        int iIntValue2 = pairLJI.getSecond().intValue();
        LJJIIJZLJL(i, iIntValue2);
        this.LLIZLLLIL = i2;
        this.LLJ = str;
        C0FI2.LJIJJ().LJI = this.LLJ;
        if (i != 1 && i != 4 && i != 5) {
            if (i != 2 && i != 6 && i != 7) {
                if (i == 3) {
                    setTextColor(iIntValue);
                    LJI(iIntValue2);
                    this.LLILZ.LJFF = true;
                }
            } else {
                setTextColor(iIntValue);
                if (this.LLJILJIL && !this.LLJILJILJ && !this.LLJLLL.booleanValue()) {
                    setTextColor(1461065763);
                }
                LJI(iIntValue2);
                this.LLILZ.LJFF = true;
            }
        } else {
            setTextColor(iIntValue);
            this.LLILZ.LJFF = false;
        }
        this.LLILZ.LIZLLL = i3;
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLILZIL) {
            this.LLILZIL = false;
            this.LL = LJIIIIZZ();
            this.LLILLJJLI = ((getMeasuredHeight() / 2.0f) - (getFontSize() / 2.0f)) + this.LLILLL;
            C123K c123k = this.LLILZ;
            c123k.LIZIZ = 0.0f;
            c123k.LIZ = 1.0f;
            LJIIZILJ(this.LLJJIJIL);
        }
    }

    public C196925122x(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, C124G c124g, Boolean bool) {
        this(context, safeHandler, textStickerData, z, c124g, bool, null);
    }

    public C196925122x(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, C124G c124g, Boolean bool, C1DRG c1drg) {
        this(context, safeHandler, textStickerData, z, c124g, bool, c1drg, Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.122g] */
    /* JADX WARN: Type inference failed for: r0v43, types: [X.122g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C196925122x(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z, C124G c124g, Boolean bool, C1DRG c1drg, Boolean bool2) {
        super(context);
        C123K c123k = new C123K();
        this.LLILZ = c123k;
        this.LLILZIL = true;
        this.LLIZ = 1;
        this.LLIZLLLIL = -1;
        this.LLJ = "default";
        this.LLJI = true;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = true;
        this.LLJJJJ = new ArrayList<>();
        this.LLJJLIIIJLLLLLLLZ = new PointF();
        this.LLJLILLLLZIIL = false;
        int i = C123P.LIZ;
        C123P.LIZ = i + 1;
        this.LLJLL = i;
        this.LLJLLIL = null;
        this.LLJLLL = Boolean.FALSE;
        this.LLLF = false;
        setWillNotDraw(false);
        this.LLJIJIL = safeHandler;
        c123k.LJII = z;
        this.LLJLLL = bool2;
        if (!bool2.booleanValue() && C196909122h.LIZIZ().LIZJ != null && bool.booleanValue()) {
            C122I c122iLIZ = C196909122h.LIZIZ().LIZJ.LIZ(this, new C122J() { // from class: X.122g
                @Override // X.C122M
                public final void LJ() {
                }

                @Override // X.C122M
                public final void LIZ() {
                    C196925122x c196925122x = this.LIZ;
                    InterfaceC196910122i interfaceC196910122i = c196925122x.LLJJIJIIJIL.LIZ;
                    if (interfaceC196910122i != null) {
                        interfaceC196910122i.LJFF(c196925122x);
                    }
                }

                @Override // X.C122M
                public final void LIZIZ() {
                    C196925122x c196925122x = this.LIZ;
                    InterfaceC196910122i interfaceC196910122i = c196925122x.LLJJIJIIJIL.LIZ;
                    if (interfaceC196910122i != null) {
                        interfaceC196910122i.LJIIIIZZ(c196925122x);
                    }
                }

                @Override // X.C122M
                public final void LIZJ() {
                    C196925122x c196925122x = this.LIZ;
                    if (c196925122x.LLJJIJIIJIL.LIZ != null) {
                        boolean z2 = !C0FVW.LIZ(c196925122x);
                        C196925122x c196925122x2 = this.LIZ;
                        c196925122x2.LLJJIJIIJIL.LIZ.LJ(c196925122x2, z2, null);
                    }
                }

                @Override // X.C122M
                public final void LIZLLL() {
                    C196925122x c196925122x = this.LIZ;
                    InterfaceC196910122i interfaceC196910122i = c196925122x.LLJJIJIIJIL.LIZ;
                    if (interfaceC196910122i != null) {
                        interfaceC196910122i.LIZJ(c196925122x);
                    }
                }
            });
            this.LLJJL = c122iLIZ;
            c122iLIZ.LIZLLL = c123k.LJII;
            c122iLIZ.LIZJ = c1drg;
        }
        if (textStickerData.getType().equals("type_inline_caption")) {
            final boolean captionOnlyShowDeleteBubble = textStickerData.getCaptionOnlyShowDeleteBubble();
            final ?? r0 = new C122J() { // from class: X.122g
                @Override // X.C122M
                public final void LJ() {
                }

                @Override // X.C122M
                public final void LIZ() {
                    C196925122x c196925122x = this.LIZ;
                    InterfaceC196910122i interfaceC196910122i = c196925122x.LLJJIJIIJIL.LIZ;
                    if (interfaceC196910122i != null) {
                        interfaceC196910122i.LJFF(c196925122x);
                    }
                }

                @Override // X.C122M
                public final void LIZIZ() {
                    C196925122x c196925122x = this.LIZ;
                    InterfaceC196910122i interfaceC196910122i = c196925122x.LLJJIJIIJIL.LIZ;
                    if (interfaceC196910122i != null) {
                        interfaceC196910122i.LJIIIIZZ(c196925122x);
                    }
                }

                @Override // X.C122M
                public final void LIZJ() {
                    C196925122x c196925122x = this.LIZ;
                    if (c196925122x.LLJJIJIIJIL.LIZ != null) {
                        boolean z2 = !C0FVW.LIZ(c196925122x);
                        C196925122x c196925122x2 = this.LIZ;
                        c196925122x2.LLJJIJIIJIL.LIZ.LJ(c196925122x2, z2, null);
                    }
                }

                @Override // X.C122M
                public final void LIZLLL() {
                    C196925122x c196925122x = this.LIZ;
                    InterfaceC196910122i interfaceC196910122i = c196925122x.LLJJIJIIJIL.LIZ;
                    if (interfaceC196910122i != null) {
                        interfaceC196910122i.LIZJ(c196925122x);
                    }
                }
            };
            C122I c122i = new C122I(this, r0, captionOnlyShowDeleteBubble) { // from class: X.122O
                public final boolean LJIIL;

                @Override // X.C122I
                public final View LJFF() {
                    LinearLayout linearLayoutLIZLLL = LIZLLL();
                    if (!this.LJIIL) {
                        LinearLayout linearLayoutLIZIZ = LIZIZ(R.drawable.a_r, 2131833386);
                        C786410Ut5.R7(linearLayoutLIZIZ, new ACListenerS163S0100000_29(this, 236));
                        View viewLIZJ = LIZJ();
                        linearLayoutLIZLLL.addView(linearLayoutLIZIZ);
                        linearLayoutLIZLLL.addView(viewLIZJ);
                    }
                    LinearLayout linearLayoutLIZIZ2 = LIZIZ(R.drawable.bxh, 2131826910);
                    C786410Ut5.R7(linearLayoutLIZIZ2, new ACListenerS163S0100000_29(this, 237));
                    linearLayoutLIZLLL.addView(linearLayoutLIZIZ2);
                    return linearLayoutLIZLLL;
                }

                @Override // X.C122I
                public final boolean LIZ(C451220Hmi c451220Hmi) {
                    if (!this.LJIIL) {
                        C450840Hm6 c450840Hm6 = new C450840Hm6();
                        c450840Hm6.LIZ = R.drawable.a_r;
                        c450840Hm6.LIZJ = 2131826896;
                        c450840Hm6.LJFF = new ACListenerS163S0100000_29(this, 234);
                        c451220Hmi.LIZIZ(c450840Hm6);
                        this.LJIIIZ = 2;
                    }
                    C450840Hm6 c450840Hm62 = new C450840Hm6();
                    c450840Hm62.LIZ = R.drawable.bxh;
                    c450840Hm62.LIZJ = 2131826910;
                    c450840Hm62.LJFF = new ACListenerS163S0100000_29(this, 235);
                    c451220Hmi.LIZIZ(c450840Hm62);
                    return true;
                }

                {
                    this.LJIIL = captionOnlyShowDeleteBubble;
                }
            };
            this.LLJJL = c122i;
            c122i.LIZLLL = false;
        }
        this.LLJJIII = LJII();
        this.LLJJIJIIJIL = new AnonymousClass1234(c124g, c1drg);
        this.LLJJIJI = new AnonymousClass1238();
        this.LLJJIII.LJIIJJI(this, context);
        AnonymousClass1234 anonymousClass1234 = this.LLJJIJIIJIL;
        anonymousClass1234.LJIILLIIL = this;
        anonymousClass1234.LJIILJJIL = safeHandler;
        this.LLJJIJI.LJIIL = this;
        anonymousClass1234.LJIJI = new C196923122v(this);
        ScreenUtils.getScreenWidth(context);
        ScreenUtils.getScreenHeight(context);
        C786410Ut5.H2(context, "vibrator");
        this.LLJJIJIL = textStickerData;
        this.LLIZ = textStickerData.getBgMode();
        this.LLIZLLLIL = this.LLJJIJIL.getColor();
        c123k.LIZLLL = this.LLJJIJIL.getAlign();
        this.LLJ = this.LLJJIJIL.getFontType();
        this.LL = this.LLJJIJIL.getX();
        this.LLILLJJLI = this.LLJJIJIL.getY();
        c123k.LIZIZ = this.LLJJIJIL.getRotation();
        c123k.LIZ = this.LLJJIJIL.getScale();
        this.LLILZLL = this.LLJJIJIL.getTextWrapList();
        this.LLJILJIL = this.LLJJIJIL.isGuidanceSticker();
        this.LLJILJILJ = this.LLJJIJIL.getGuidanceWithDefaultText();
    }
}
