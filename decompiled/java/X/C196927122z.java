package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.122z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196927122z extends C196925122x {
    public final C123V LLLFFI;
    public final AnonymousClass1249 LLLFZ;
    public final C123X LLLI;
    public final View LLLII;
    public final View LLLIIII;
    public final View LLLIIIIL;
    public final View LLLIIIL;
    public InnerEffectTextLayoutConfig LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;

    private final RectF getEffectTextRect() {
        C123X c123x = this.LLLI;
        Matrix matrix = c123x.getMatrix();
        if (C11VU.LJFF(c123x.getContext())) {
            matrix.setTranslate(c123x.getX(), c123x.getY());
            matrix.preTranslate(c123x.getScaleX(), c123x.getScaleY());
        }
        Rect rect = new Rect();
        c123x.getDrawingRect(rect);
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return rectF;
    }

    @Override // X.C196925122x
    public final TextStickerData LJIIJ() {
        if (this.LLJJIJIL == null) {
            TextStickerData textStickerData = new TextStickerData("", this.LLIZ, this.LLIZLLLIL, this.LLILZ.LIZLLL, this.LLJ, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
            this.LLJJIJIL = textStickerData;
            textStickerData.setTextWrapList(this.LLILZLL);
        }
        this.LLJJIJIL.setX(this.LL);
        this.LLJJIJIL.setY(this.LLILLJJLI);
        this.LLJJIJIL.setRotation(this.LLILZ.LIZIZ);
        this.LLJJIJIL.setScale(this.LLILZ.LIZ);
        this.LLJJIJIL.setTextWrapList(this.LLILZLL);
        this.LLJJIJIL.setBgMode(this.LLIZ);
        this.LLJJIJIL.setColor(this.LLIZLLLIL);
        this.LLJJIJIL.setAlign(this.LLILZ.LIZLLL);
        this.LLJJIJIL.setFontType(this.LLJ);
        return this.LLJJIJIL;
    }

    @Override // X.C196925122x
    public final void LJJIJ() {
        TextStickerData textStickerData = this.LLJJIJIL;
        if (textStickerData == null || !textStickerData.hasPositionData()) {
            return;
        }
        if (this.LLJJIJIL.getCoverExtraData().isPortrait() == this.LLLFFI.LIZ || this.LLLIL) {
            this.LL = this.LLJJIJIL.getX();
            this.LLILLJJLI = this.LLJJIJIL.getY();
        }
        this.LLILZ.LIZIZ = this.LLJJIJIL.getRotation();
        this.LLILZ.LIZ = this.LLJJIJIL.getScale();
    }

    @Override // X.C196925122x
    public PointF[] getAnglePointList() {
        if (!this.LLLIILIL) {
            return super.getAnglePointList();
        }
        RectF effectTextRect = getEffectTextRect();
        return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
    }

    @Override // X.C196925122x
    public PointF[] getAnglePointListForBlock() {
        if (!this.LLLIILIL) {
            return super.getAnglePointListForBlock();
        }
        RectF effectTextRect = getEffectTextRect();
        return new PointF[]{new PointF(effectTextRect.left, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.top), new PointF(effectTextRect.right, effectTextRect.bottom), new PointF(effectTextRect.left, effectTextRect.bottom)};
    }

    @Override // X.C196925122x
    public RectF getCurrentHelpBoxRect() {
        return this.LLLIILIL ? getEffectTextRect() : this.LLJJIII.LJII();
    }

    public final InnerEffectTextLayoutConfig getEffectTextLayoutConfig() {
        return this.LLLIIL;
    }

    public final boolean getEffectTextMode() {
        return this.LLLIILIL;
    }

    public final boolean getNotNeedVerifyDirection() {
        return this.LLLIL;
    }

    public final void LJJIJIL(boolean z) {
        if (!this.LLLFZ.LIZ) {
            return;
        }
        if (z) {
            if (this.LLLFFI.LIZ) {
                C786410Ut5.LJLLLLLL(0, this.LLLII);
                C786410Ut5.LJLLLLLL(0, this.LLLIIII);
                C786410Ut5.LJLLLLLL(4, this.LLLIIIIL);
                C786410Ut5.LJLLLLLL(4, this.LLLIIIL);
                return;
            }
            C786410Ut5.LJLLLLLL(4, this.LLLII);
            C786410Ut5.LJLLLLLL(4, this.LLLIIII);
            C786410Ut5.LJLLLLLL(0, this.LLLIIIIL);
            C786410Ut5.LJLLLLLL(0, this.LLLIIIL);
            return;
        }
        C786410Ut5.LJLLLLLL(4, this.LLLII);
        C786410Ut5.LJLLLLLL(4, this.LLLIIII);
        C786410Ut5.LJLLLLLL(4, this.LLLIIIIL);
        C786410Ut5.LJLLLLLL(4, this.LLLIIIL);
    }

    @Override // X.C196925122x, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.LLLIILIL) {
            C123X c123x = this.LLLI;
            float width = this.LL - (c123x.getWidth() / 2.0f);
            float height = this.LLILLJJLI - (c123x.getHeight() / 2.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c123x);
            c123x.setX(width);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c123x);
            c123x.setY(height);
            float f = this.LLILZ.LIZIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c123x);
            c123x.setRotation(f);
            float f2 = this.LLILZ.LIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c123x);
            c123x.setScaleX(f2);
            float f3 = this.LLILZ.LIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c123x);
            c123x.setScaleY(f3);
            C123X c123x2 = this.LLLI;
            if (this.LLJJIJIIJIL.LJIIIIZZ) {
                drawable = c123x2.LLJI;
            } else {
                drawable = null;
            }
            c123x2.setBackground(drawable);
        } else {
            LJIIIZ(canvas);
        }
        AnonymousClass1238 anonymousClass1238 = this.LLJJIJI;
        C123K c123k = this.LLILZ;
        anonymousClass1238.LIZIZ(c123k.LIZ, c123k.LIZIZ, this.LL, this.LLILLJJLI);
        AnonymousClass1238 anonymousClass12382 = this.LLJJIJI;
        C123K c123k2 = this.LLILZ;
        anonymousClass12382.LIZ(c123k2.LIZ, c123k2.LIZIZ, this.LL, this.LLILLJJLI);
    }

    public final void setEffectTextLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.LLLIIL = innerEffectTextLayoutConfig;
    }

    public final void setEffectTextMode(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setNotNeedVerifyDirection(boolean z) {
        this.LLLIL = z;
    }

    @Override // X.C196925122x
    public final PointF LJIILIIL(float f, float f2) {
        float f3;
        float f4;
        PointF pointFLJIILIIL = super.LJIILIIL(f, f2);
        C123V c123v = this.LLLFFI;
        float f5 = c123v.LIZIZ;
        if (f5 == 0.0f) {
            f5 = 1.0f;
        }
        if (c123v.LIZ) {
            f4 = pointFLJIILIIL.x / f5;
            f3 = (((-getHeight()) * (1 - f5)) / 2) + (pointFLJIILIIL.y / f5);
        } else {
            float f6 = pointFLJIILIIL.x / f5;
            f3 = pointFLJIILIIL.y / f5;
            f4 = f6 + (((-getWidth()) * (1 - f5)) / 2);
        }
        return new PointF(f4, f3);
    }

    @Override // X.C196925122x
    public final boolean LJIILJJIL(float f, float f2) {
        if (this.LLLIILIL) {
            return C121Q.LIZ(f, f2, this.LLILZ.LIZIZ, getEffectTextRect(), 0.0f);
        }
        return C121Q.LIZ(f, f2 - this.LLJJI, this.LLILZ.LIZIZ, getHelpRect(), 0.0f);
    }

    @Override // X.C196925122x
    public final boolean LJIILL(float f, float f2) {
        if (this.LLLIILIL) {
            return C121Q.LIZ(f, f2, this.LLILZ.LIZIZ, getEffectTextRect(), 0.0f);
        }
        return C121Q.LIZ(f, f2, this.LLILZ.LIZIZ, getHelpRect(), 0.0f);
    }

    @Override // X.C196925122x
    public final void LJJIJIIJI(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List list) {
        this.LLILZLL = list;
        Context context = getContext();
        this.LLLFZ.getClass();
        String string = context.getString(2131844982);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TextStickerTextWrap textStickerTextWrap = (TextStickerTextWrap) it2.next();
                String text = textStickerTextWrap.getText();
                if (text != null && text.length() != 0) {
                    arrayList.add(textStickerTextWrap);
                } else {
                    arrayList.add(C123P.LIZIZ(string, true));
                }
            }
        }
        LJJIJL(innerEffectTextLayoutConfig, arrayList);
    }

    public final void LJJIJL(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, List list) {
        this.LLLIIL = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.LLLIILIL = true;
            this.LLLI.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            C786410Ut5.P1(this.LLLI, 0);
            C123X c123x = this.LLLI;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    TextStickerTextWrap textStickerTextWrap = (TextStickerTextWrap) it2.next();
                    arrayList.add(new C123Z(textStickerTextWrap.getText(), textStickerTextWrap.getSelectionStart(), textStickerTextWrap.isReplaceString(), 8));
                }
            }
            c123x.setText(arrayList);
            return;
        }
        this.LLLIILIL = false;
        C786410Ut5.P1(this.LLLI, 4);
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            C124H c124h = C196916122o.LIZ;
            if (c124h == null) {
                c124h = null;
            }
            c124h.getClass();
            Iterator it3 = list.iterator();
            int length = 0;
            while (it3.hasNext()) {
                TextStickerTextWrap textStickerTextWrap2 = (TextStickerTextWrap) it3.next();
                if (length >= 100) {
                    break;
                }
                if (textStickerTextWrap2.getText().length() + length <= 100) {
                    arrayList2.add(textStickerTextWrap2);
                    length += textStickerTextWrap2.getText().length();
                } else {
                    arrayList2.add(C123P.LIZIZ(textStickerTextWrap2.getText().substring(0, 100 - length), false));
                    length = 100;
                }
            }
            list = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((TextStickerTextWrap) obj).safeStrPair().first.length() > 0) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            this.LLJJIII.LJIIL(arrayList3);
        } else {
            this.LLJJIII.LJIIL(C1697810uHb.LJ(C123P.LIZIZ("", false)));
        }
    }

    public C196927122z(C19EG c19eg, SafeHandler safeHandler, TextStickerData textStickerData, C123V c123v, AnonymousClass1249 anonymousClass1249) {
        super(c19eg, safeHandler, textStickerData, false, null, Boolean.FALSE);
        this.LLLFFI = c123v;
        this.LLLFZ = anonymousClass1249;
        C123X c123x = new C123X(getContext());
        c123x.setEditable(false);
        c123x.setMaxTextWidth(c123v.LIZJ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c123x);
        c123x.setLayoutParams(layoutParams);
        C786410Ut5.P1(c123x, 4);
        this.LLLI = c123x;
        View view = new View(getContext());
        view.setBackgroundColor(C960203pA.LIZ(R.attr.a1a, view.getContext()));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 48;
        C786410Ut5.W5(view, layoutParams2);
        C786410Ut5.LJLLLLLL(4, view);
        this.LLLII = view;
        View view2 = new View(getContext());
        view2.setBackgroundColor(C960203pA.LIZ(R.attr.a1a, view2.getContext()));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        C786410Ut5.W5(view2, layoutParams3);
        C786410Ut5.LJLLLLLL(4, view2);
        this.LLLIIII = view2;
        View view3 = new View(getContext());
        view3.setBackgroundColor(C960203pA.LIZ(R.attr.a1a, view3.getContext()));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 3;
        C786410Ut5.W5(view3, layoutParams4);
        C786410Ut5.LJLLLLLL(4, view3);
        this.LLLIIIIL = view3;
        View view4 = new View(getContext());
        view4.setBackgroundColor(C960203pA.LIZ(R.attr.a1a, view4.getContext()));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 5;
        C786410Ut5.W5(view4, layoutParams5);
        C786410Ut5.LJLLLLLL(4, view4);
        this.LLLIIIL = view4;
        addView(c123x);
        if (anonymousClass1249.LIZ) {
            addView(view);
            addView(view2);
            addView(view3);
            addView(view4);
        }
        HandlerHook.viewPost(this, new ARunnableS129S0100000_29((Object) this, 127));
        AnonymousClass1234 anonymousClass1234 = this.LLJJIJIIJIL;
        anonymousClass1234.LJIJI = null;
        anonymousClass1234.LJIIJ = LSPassThroughRecordSizeConfig.DEFAULT;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (Intrinsics.LJFF(view, this.LLLI)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i3) - ((((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4)), 0));
            return;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }
}
