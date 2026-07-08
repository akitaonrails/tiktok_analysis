package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StoryStreakTextStickerStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleBackground;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleShadow;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleStroke;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385340F8y extends C21410318qb implements InterfaceC19592111l1<TextStickerModel> {
    public static final int LLJLLL = Color.argb(43, 0, 0, 0);
    public static final C01GW<Integer> LLJZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1272));
    public static final C01GW<Integer> LLJZIJLIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1271));
    public C1664680tQA<TextStickerModel> LLIZ;
    public LifecycleOwner LLIZLLLIL;
    public Function1<? super String, ? extends Typeface> LLJ;
    public Function1<? super TextFontModel, ? extends Typeface> LLJI;
    public boolean LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public Paint LLJJ;
    public Path LLJJI;
    public final TextPaint LLJJIII;
    public C0F50 LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public Pair<Float, Float> LLJJJIL;
    public C0FK0 LLJJJJ;
    public final RectF LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final C389050FNf LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public C0F9G LLJL;
    public StoryStreakTextStickerStyleModel LLJLIL;
    public C0F9G LLJLILLLLZIIL;
    public final Rect LLJLL;
    public final C01GW LLJLLIL;

    public final void LJIIJ() {
        setIncludeFontPadding(false);
        getPaint().setAntiAlias(true);
        int i = this.LLJILJILJ;
        int i2 = this.LLJILLL;
        setPadding(i, i2, i, i2);
        setMaxLines(20);
        Paint paint = new Paint();
        this.LLJJ = paint;
        paint.setColor(-1);
        this.LLJJ.setStyle(Paint.Style.FILL);
        this.LLJJ.setAntiAlias(true);
        this.LLJJ.setPathEffect(getRoundCornerPathEffect());
        this.LLJJI = new Path();
    }

    @Override // X.InterfaceC19592111l1
    public final void LJIIZILJ() {
    }

    @Override // X.InterfaceC19592111l1
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC19592111l1
    public final void destroy() {
    }

    @Override // X.InterfaceC19592111l1
    public View getView() {
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    private final Pair<Float, Float> getBgHorizontalDelta() {
        TextStyleBackground textStyleBackground;
        Rect rect = this.LLJLL;
        int iLIZIZ = (rect.bottom - rect.top) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        float f = this.LLJILJILJ / 2.0f;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        TextStyleModel textStyle = c1664680tQA.LIZ.getTextStyle();
        if (textStyle != null && (textStyleBackground = textStyle.background) != null) {
            float f2 = textStyleBackground.paddingHorizontal;
            if (f2 > 0.0f && iLIZIZ > 0) {
                f = f2 * iLIZIZ;
            }
        }
        int i = this.LLJILJILJ;
        return new Pair<>(Float.valueOf(i - f), Float.valueOf(i + f));
    }

    private final CornerPathEffect getRoundCornerPathEffect() {
        return (CornerPathEffect) this.LLJLLIL.getValue();
    }

    public final void LJIIIIZZ() {
        Object c098200Yq;
        Object c098200Yq2;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (c1664680tQA.LIZ.getTextStyle() == null) {
            C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            int mode = c1664680tQA2.LIZ.getMode();
            C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLIZ;
            int color = (c1664680tQA3 != null ? c1664680tQA3 : null).LIZ.getColor();
            Pair pairLIZLLL = C0F9I.LIZLLL(color, mode);
            int iIntValue = ((Number) pairLIZLLL.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLIZLLL.getSecond()).intValue();
            if (mode == 1) {
                if (((Boolean) C0AZO.LIZ.getValue()).booleanValue() && iIntValue == -1) {
                    setShadowLayer(12.0f, 0.0f, 0.0f, LLJLLL);
                } else {
                    setShadowLayer(0.0f, 0.0f, 0.0f, iIntValue);
                }
                setTextColor(iIntValue);
            } else if (mode == 2) {
                setShadowLayer(0.0f, 0.0f, 0.0f, iIntValue);
                this.LLJJ.setColor(iIntValue2);
                setTextColor(iIntValue);
            } else if (mode == 3) {
                setShadowLayer(0.0f, 0.0f, 0.0f, iIntValue);
                this.LLJJ.setColor(C0F9I.LIZJ(iIntValue2, color));
                setTextColor(iIntValue);
            } else if (mode == 4) {
                setShadowLayer(0.0f, 0.0f, 0.0f, iIntValue);
                setTextColor(iIntValue);
            } else if (mode == 5) {
                setTextColor(-1);
                setShadowLayer(12.0f, 0.0f, 0.0f, iIntValue);
            }
            LJIILL();
            return;
        }
        C1664680tQA<TextStickerModel> c1664680tQA4 = this.LLIZ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        TextStyleModel textStyle = c1664680tQA4.LIZ.getTextStyle();
        if (textStyle != null) {
            C1664680tQA<TextStickerModel> c1664680tQA5 = this.LLIZ;
            if (c1664680tQA5 == null) {
                c1664680tQA5 = null;
            }
            int color2 = c1664680tQA5.LIZ.getColor();
            TextStyleBackground textStyleBackground = textStyle.background;
            if (textStyleBackground != null) {
                try {
                    c098200Yq = Integer.valueOf(Color.parseColor(textStyleBackground.color));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Integer num = (Integer) c098200Yq;
                if (num != null) {
                    this.LLJJ.setColor(num.intValue());
                }
                this.LLJJ.setPathEffect(getRoundCornerPathEffect());
            }
            setShadowLayer(0.0f, 0.0f, 0.0f, color2);
            setTextColor(color2);
            TextStyleShadow textStyleShadow = textStyle.shadow;
            if (textStyleShadow != null) {
                float f = textStyleShadow.smooth;
                C1664680tQA<TextStickerModel> c1664680tQA6 = this.LLIZ;
                if (c1664680tQA6 == null) {
                    c1664680tQA6 = null;
                }
                float f2 = f * c1664680tQA6.LIZ.getFontModel().fontSize;
                float textSize = textStyleShadow.offsetX * getTextSize();
                float textSize2 = textStyleShadow.offsetY * getTextSize();
                try {
                    c098200Yq2 = Integer.valueOf(Color.parseColor(textStyleShadow.color));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                Integer num2 = (Integer) c098200Yq2;
                setShadowLayer(Math.max(f2, 0.001f), textSize, textSize2, num2 != null ? num2.intValue() : 0);
            } else if (((Boolean) C0AZO.LIZ.getValue()).booleanValue() && color2 == -1) {
                setShadowLayer(12.0f, 0.0f, 0.0f, LLJLLL);
            }
            if (textStyle.stroke != null) {
                LJIILJJIL();
            }
            LJIILL();
            C1664680tQA<TextStickerModel> c1664680tQA7 = this.LLIZ;
            Integer mixStudioTextWidth = (c1664680tQA7 != null ? c1664680tQA7 : null).LIZ.getCompatModel().getMixStudioTextWidth();
            if (mixStudioTextWidth != null) {
                setMaxWidth(mixStudioTextWidth.intValue());
            }
            invalidate();
        }
    }

    public final boolean LJIIJJI() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        return c1664680tQA.LIZ.getTextTemplateModel().enableTextTemplate;
    }

    public final boolean LJIIL() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        TextStyleModel textStyle = c1664680tQA.LIZ.getTextStyle();
        if (textStyle != null) {
            return textStyle.background != null;
        }
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
        return C0F8K.LIZ((c1664680tQA2 != null ? c1664680tQA2 : null).LIZ.getMode(), true);
    }

    public final void LJIILJJIL() {
        TextStyleStroke textStyleStroke;
        Object c098200Yq;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        TextStyleModel textStyle = c1664680tQA.LIZ.getTextStyle();
        if (textStyle == null || (textStyleStroke = textStyle.stroke) == null) {
            this.LLJJIII.setStrokeWidth(C0F9I.LJFF(getTextSize(), getContext()));
            C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
            Pair pairLIZLLL = C0F9I.LIZLLL((c1664680tQA2 != null ? c1664680tQA2 : null).LIZ.getColor(), 4);
            getPaint().setColor(((Number) pairLIZLLL.getFirst()).intValue());
            this.LLJJIII.setColor(((Number) pairLIZLLL.getSecond()).intValue());
            return;
        }
        this.LLJJIII.setStrokeWidth(getTextSize() * textStyleStroke.width * 2);
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(textStyleStroke.color));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            this.LLJJIII.setColor(num.intValue());
        }
        TextPaint paint = getPaint();
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLIZ;
        paint.setColor((c1664680tQA3 != null ? c1664680tQA3 : null).LIZ.getColor());
    }

    public final int getBgColor$tools_sticker_core_release() {
        return this.LLJJ.getColor();
    }

    public final RectF getBgRectF() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        int mode = c1664680tQA.LIZ.getMode();
        if (mode == 2 || mode == 3 || LJIIL()) {
            return this.LLJJJJJIL;
        }
        this.LLJJJJJIL.set(0.0f, 0.0f, 0.0f, 0.0f);
        return this.LLJJJJJIL;
    }

    public final int getDefaultTextSize() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (c1664680tQA.LIZ.getWasGuide()) {
            return 20;
        }
        return this.LLJJJ;
    }

    public final Pair<Float, Float> getOriginSize$tools_sticker_core_release() {
        Pair<Float, Float> pair = this.LLJJJIL;
        return pair == null ? new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f)) : pair;
    }

    public final void LJIILL() {
        Typeface typeface = getTypeface();
        int i = 0;
        if (typeface == null || !typeface.isItalic()) {
            return;
        }
        if (((Boolean) C0AZO.LIZ.getValue()).booleanValue() && getCurrentTextColor() == -1) {
            i = LLJLLL;
        }
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        setShadowLayer(c1664680tQA.LIZ.getFontModel().fontSize, 0.0f, 0.0f, i);
    }

    public final float getCenterX() {
        View view;
        float right = (getRight() + getLeft()) / 2.0f;
        if (String.valueOf(C2204961BRm.G(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLiYTMUFmm/1xoeWy", null))).length() == 0 || getLayout() == null) {
            return right;
        }
        int lineCount = getLayout().getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(getLayout().getLineRight(i) - getLayout().getLineLeft(i), fMax);
        }
        float paddingLeft = fMax + getPaddingLeft() + getPaddingRight();
        Object parent = getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return right;
        }
        int measuredWidth = view.getMeasuredWidth();
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        int align = (c1664680tQA != null ? c1664680tQA : null).LIZ.getAlign();
        return align != 1 ? align != 3 ? (getRight() + getLeft()) / 2.0f : measuredWidth - (paddingLeft / 2) : paddingLeft / 2;
    }

    public final int getTextSizeSp() {
        return (int) (getTextSize() / getResources().getDisplayMetrics().scaledDensity);
    }

    public C385340F8y(Context context) {
        super(context, null, 0);
        this.LLJILJIL = C1919207fS.LJII();
        this.LLJILJILJ = C1919207fS.LIZIZ() * 2;
        this.LLJILLL = C1919207fS.LJIIJJI();
        this.LLJJ = new Paint();
        this.LLJJI = new Path();
        this.LLJJIII = new TextPaint();
        this.LLJJIJIIJIL = true;
        this.LLJJJ = 28;
        this.LLJJJJJIL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLJJJJLIIL = C1919207fS.LIZLLL();
        this.LLJJL = new C389050FNf(this);
        this.LLJLL = new Rect();
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1272));
    }

    public final boolean LJIILIIL(int i) {
        String strSubstring = String.valueOf(C2204961BRm.G(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLiYTMUFmm/1xoeWy", null))).substring(getLayout().getLineStart(i), getLayout().getLineEnd(i));
        if (strSubstring.length() > 0 && !Intrinsics.LJFF(strSubstring, "\n")) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        super.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.LLJL == null && this.LLJLILLLLZIIL == null) {
            return super.onCreateInputConnection(editorInfo);
        }
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        C0F9G c0f9g = this.LLJLILLLLZIIL;
        if (c0f9g != null) {
            return c0f9g.LIZIZ(inputConnectionOnCreateInputConnection);
        }
        C0F9G c0f9g2 = this.LLJL;
        if (c0f9g2 == null) {
            return null;
        }
        return c0f9g2.LIZIZ(inputConnectionOnCreateInputConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385340F8y.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onProvideStructure(ViewStructure viewStructure) {
        try {
            super.onProvideStructure(viewStructure);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "TextStickerView.onProvideStructure -> IndexOutOfBoundsException");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (!c1664680tQA.LIZ.getClickable() || !isEnabled()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public final void setDefaultTextSize(int i) {
        this.LLJJJ = i;
    }

    public final void setFontType(Typeface typeface) {
        int length;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        setTypeface(null);
        setTypeface(typeface);
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (!c1664680tQA.LIZ.getTextTemplateModel().enableTextTemplate && !((Boolean) C0AZS.LIZ.getValue()).booleanValue()) {
            setText(C2204961BRm.G(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLiYTMUFmm/1xoeWy", null)));
        }
        if (((Boolean) C0AZS.LIZ.getValue()).booleanValue()) {
            Editable editableG = C2204961BRm.G(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLiYTMUFmm/1xoeWy", null));
            if (editableG != null) {
                length = editableG.length();
            } else {
                length = 0;
            }
            int iLJ = C13LZ.LJ(selectionStart, 0, length);
            setSelection(iLJ, C13LZ.LJ(selectionEnd, iLJ, length));
        } else {
            setSelection(selectionStart, selectionEnd);
        }
        invalidate();
    }

    public final void setFontTypeChangedListener(C0F50 c0f50) {
        this.LLJJIJI = c0f50;
    }

    public final void setForAnimation(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setMinTextSize(int i) {
        this.LLJJIJIL = i;
    }

    public final void setTextListener(C0F9G c0f9g) {
        this.LLJLILLLLZIIL = c0f9g;
    }

    public final void setTextMentionListener(C0F9G c0f9g) {
        this.LLJL = c0f9g;
    }

    public final void setUseAutoTextSize(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        invalidate();
    }

    @Override // X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        Typeface typefaceInvoke;
        int i;
        if (!(stickerModel instanceof TextStickerModel)) {
            return;
        }
        LJIIJ();
        this.LLIZ = new C1664680tQA<>(stickerModel);
        TextStickerModel textStickerModel = (TextStickerModel) stickerModel;
        String textStr = textStickerModel.getTextStr();
        if (!a0.LJJJIL(textStr)) {
            C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            TextStickerModel textStickerModel2 = c1664680tQA.LIZ;
            if (Intrinsics.LJFF(textStickerModel2.getCompatModel().getShowPunctuation(), Boolean.FALSE)) {
                textStr = C385050F7v.LJI().LIZ(textStr);
            }
            int i2 = C384310F4z.LIZ[textStickerModel2.getCompatModel().getCapitalizationState().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        textStr = C385050F7v.LIZJ(textStr);
                    }
                } else {
                    textStr = textStr.toLowerCase(Locale.ROOT);
                }
            } else {
                textStr = textStr.toUpperCase(Locale.ROOT);
            }
        }
        setText(textStr);
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        List<TextMentionModel> mentionList = c1664680tQA2.LIZ.getMentionList();
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLIZ;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        C0FMV.LIZJ(mentionList, c1664680tQA3.LIZ.getHashtagList(), this);
        LJIIIIZZ();
        int align = textStickerModel.getAlign();
        if (align != 1) {
            if (align != 2) {
                if (align == 3) {
                    setGravity(5);
                }
            } else {
                setGravity(17);
            }
        } else {
            setGravity(3);
        }
        setTextSize(textStickerModel.getFontModel().fontSizeUnit, textStickerModel.getFontModel().fontSize);
        setLineSpacing(textStickerModel.getLineSpacingExtra(), getLineSpacingMultiplier());
        StoryStreakTextStickerStyleModel streakTextStyleModel = textStickerModel.getStreakTextStyleModel();
        if (streakTextStyleModel != null && (i = streakTextStyleModel.maxStickerWidth) > 0 && streakTextStyleModel.fontWeight >= 300) {
            this.LLJLIL = streakTextStyleModel;
            setMaxWidth(i);
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, streakTextStyleModel.fontWeight, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
            if (typefaceLIZIZ != null) {
                setFontType(typefaceLIZIZ);
            }
            LJIIIIZZ();
            C0F50 c0f50 = this.LLJJIJI;
            if (c0f50 != null) {
                c0f50.LIZIZ();
            }
        } else {
            Function1<? super TextFontModel, ? extends Typeface> function1 = this.LLJI;
            if (function1 != null) {
                Typeface typefaceInvoke2 = function1.invoke(textStickerModel.getFontModel());
                if (typefaceInvoke2 != null) {
                    setFontType(typefaceInvoke2);
                }
            } else {
                Function1<? super String, ? extends Typeface> function12 = this.LLJ;
                if (function12 != null && (typefaceInvoke = function12.invoke(textStickerModel.getFontModel().fileName)) != null) {
                    setFontType(typefaceInvoke);
                }
            }
        }
        C786410Ut5.T5(this, textStickerModel.getBaseStickerModel().getAlpha());
        if (((Boolean) C0AZM.LIZ.getValue()).booleanValue()) {
            setMaxLines(Integer.MAX_VALUE);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (!c1664680tQA.LIZ.getEditable()) {
            C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            if (!c1664680tQA2.LIZ.getAutoLineBreak()) {
                i = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        } else {
            iMakeMeasureSpec = i2;
        }
        try {
            super.onMeasure(i, iMakeMeasureSpec);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            setText(String.valueOf(C2204961BRm.G(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLiYTMUFmm/1xoeWy", null))));
            C1AF0.LJFF(e, "TextStickerView.onMeasure -> NullPointerException");
        }
        StoryStreakTextStickerStyleModel storyStreakTextStickerStyleModel = this.LLJLIL;
        if (storyStreakTextStickerStyleModel != null) {
            setMeasuredDimension(storyStreakTextStickerStyleModel.maxStickerWidth, getMeasuredHeight());
        } else {
            setMeasuredDimension(getMeasuredWidth() + C1919207fS.LJIIIZ(), getMeasuredHeight());
        }
        this.LLJJLIIIJLLLLLLLZ = i2;
    }

    @Override // android.view.View
    public final void onProvideAutofillStructure(ViewStructure viewStructure, int i) {
        try {
            super.onProvideAutofillStructure(viewStructure, i);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "TextStickerView.onProvideStructure -> IndexOutOfBoundsException");
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C0F9G c0f9g = this.LLJLILLLLZIIL;
        if (c0f9g != null) {
            c0f9g.LIZ(i, i2);
            return;
        }
        C0F9G c0f9g2 = this.LLJL;
        if (c0f9g2 == null) {
            return;
        }
        c0f9g2.LIZ(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void LJIIIZ(C1664680tQA c1664680tQA, LifecycleOwner lifecycleOwner, C0FK0 c0fk0, Function1 function1, Function1 function12) {
        this.LLJ = function1;
        this.LLJI = function12;
        this.LLJJJJ = c0fk0;
        setInputType(getInputType() | 524288);
        this.LLIZ = c1664680tQA;
        this.LLIZLLLIL = lifecycleOwner;
        LJIIJ();
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLIZ;
        LifecycleOwner lifecycleOwner2 = null;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA2.LIZ(new C2217371BqR() { // from class: X.0F8w
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextStickerModel) obj).getVisible());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setVisible(((Boolean) obj2).booleanValue());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLIZLLLIL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1005));
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLIZ;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA3.LIZ(new C2217381BqS() { // from class: X.0F9D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextStr();
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLIZLLLIL;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 987));
        C1664680tQA<TextStickerModel> c1664680tQA4 = this.LLIZ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA4.LIZ(new C2217371BqR() { // from class: X.0F99
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getCompatModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setCompatModel((TextStickerCompatModel) obj2);
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLIZLLLIL;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 989));
        C1664680tQA<TextStickerModel> c1664680tQA5 = this.LLIZ;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA5.LIZ(new C2217381BqS() { // from class: X.0F97
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getMode());
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLIZLLLIL;
        if (lifecycleOwner6 == null) {
            lifecycleOwner6 = null;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner6, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 991));
        C1664680tQA<TextStickerModel> c1664680tQA6 = this.LLIZ;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LiveState<V> liveStateLIZ5 = c1664680tQA6.LIZ(new C2217381BqS() { // from class: X.0F92
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getColor());
            }
        });
        LifecycleOwner lifecycleOwner7 = this.LLIZLLLIL;
        if (lifecycleOwner7 == null) {
            lifecycleOwner7 = null;
        }
        liveStateLIZ5.LJIIIZ(lifecycleOwner7, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 988));
        C1664680tQA<TextStickerModel> c1664680tQA7 = this.LLIZ;
        if (c1664680tQA7 == null) {
            c1664680tQA7 = null;
        }
        LiveState<V> liveStateLIZ6 = c1664680tQA7.LIZ(new C2217381BqS() { // from class: X.0F91
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextStickerModel) obj).getAlign());
            }
        });
        LifecycleOwner lifecycleOwner8 = this.LLIZLLLIL;
        if (lifecycleOwner8 == null) {
            lifecycleOwner8 = null;
        }
        liveStateLIZ6.LJIIIZ(lifecycleOwner8, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 990));
        C1664680tQA<TextStickerModel> c1664680tQA8 = this.LLIZ;
        if (c1664680tQA8 == null) {
            c1664680tQA8 = null;
        }
        LiveState liveStateLJIIIIZZ = c1664680tQA8.LIZ(new C2217371BqR() { // from class: X.0F93
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0F9A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextFontModel) obj).fontSize);
            }
        });
        LifecycleOwner lifecycleOwner9 = this.LLIZLLLIL;
        if (lifecycleOwner9 == null) {
            lifecycleOwner9 = null;
        }
        liveStateLJIIIIZZ.LJIIIZ(lifecycleOwner9, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 992));
        C1664680tQA<TextStickerModel> c1664680tQA9 = this.LLIZ;
        if (c1664680tQA9 == null) {
            c1664680tQA9 = null;
        }
        LiveState liveStateLJIIIIZZ2 = c1664680tQA9.LIZ(new C2217371BqR() { // from class: X.0F94
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0F9B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((TextFontModel) obj).fontSizeUnit);
            }
        });
        LifecycleOwner lifecycleOwner10 = this.LLIZLLLIL;
        if (lifecycleOwner10 == null) {
            lifecycleOwner10 = null;
        }
        liveStateLJIIIIZZ2.LJIIIZ(lifecycleOwner10, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 994));
        C1664680tQA<TextStickerModel> c1664680tQA10 = this.LLIZ;
        if (c1664680tQA10 == null) {
            c1664680tQA10 = null;
        }
        LiveState<V> liveStateLIZ7 = c1664680tQA10.LIZ(new C2217371BqR() { // from class: X.0F7d
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((TextStickerModel) obj).getLineSpacingExtra());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setLineSpacingExtra(((Number) obj2).floatValue());
            }
        });
        LifecycleOwner lifecycleOwner11 = this.LLIZLLLIL;
        if (lifecycleOwner11 == null) {
            lifecycleOwner11 = null;
        }
        liveStateLIZ7.LJIIIZ(lifecycleOwner11, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 996));
        C1664680tQA<TextStickerModel> c1664680tQA11 = this.LLIZ;
        if (c1664680tQA11 == null) {
            c1664680tQA11 = null;
        }
        LiveState liveStateLJIIIIZZ3 = c1664680tQA11.LIZ(new C2217371BqR() { // from class: X.0F95
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getFontModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setFontModel((TextFontModel) obj2);
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.0F9F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextFontModel) obj).fileName;
            }
        });
        LifecycleOwner lifecycleOwner12 = this.LLIZLLLIL;
        if (lifecycleOwner12 == null) {
            lifecycleOwner12 = null;
        }
        liveStateLJIIIIZZ3.LJIIIZ(lifecycleOwner12, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 998));
        C1664680tQA<TextStickerModel> c1664680tQA12 = this.LLIZ;
        if (c1664680tQA12 == null) {
            c1664680tQA12 = null;
        }
        LiveState<V> liveStateLIZ8 = c1664680tQA12.LIZ(new C2217381BqS() { // from class: X.0F9E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getStreakTextStyleModel();
            }
        });
        LifecycleOwner lifecycleOwner13 = this.LLIZLLLIL;
        if (lifecycleOwner13 == null) {
            lifecycleOwner13 = null;
        }
        liveStateLIZ8.LJIIIZ(lifecycleOwner13, Lifecycle.State.STARTED, new AwS584S0100000_5(this, LSPassThroughRecordSizeConfig.DEFAULT));
        C1664680tQA<TextStickerModel> c1664680tQA13 = this.LLIZ;
        if (c1664680tQA13 == null) {
            c1664680tQA13 = null;
        }
        LiveState<V> liveStateLIZ9 = c1664680tQA13.LIZ(new C2217381BqS() { // from class: X.0F98
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextStickerModel) obj).getEditable());
            }
        });
        LifecycleOwner lifecycleOwner14 = this.LLIZLLLIL;
        if (lifecycleOwner14 == null) {
            lifecycleOwner14 = null;
        }
        liveStateLIZ9.LJIIIZ(lifecycleOwner14, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1002));
        C1664680tQA<TextStickerModel> c1664680tQA14 = this.LLIZ;
        if (c1664680tQA14 == null) {
            c1664680tQA14 = null;
        }
        LiveState<V> liveStateLIZ10 = c1664680tQA14.LIZ(new C2217371BqR() { // from class: X.0ERh
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((TextStickerModel) obj).getTextStyle();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setTextStyle((TextStyleModel) obj2);
            }
        });
        LifecycleOwner lifecycleOwner15 = this.LLIZLLLIL;
        if (lifecycleOwner15 == null) {
            lifecycleOwner15 = null;
        }
        liveStateLIZ10.LJIIIZ(lifecycleOwner15, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1003));
        C1664680tQA<TextStickerModel> c1664680tQA15 = this.LLIZ;
        if (c1664680tQA15 == null) {
            c1664680tQA15 = null;
        }
        LiveState<V> liveStateLIZ11 = c1664680tQA15.LIZ(new C2217371BqR() { // from class: X.0F7e
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((TextStickerModel) obj).getAutoLineBreak());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((TextStickerModel) obj).setAutoLineBreak(((Boolean) obj2).booleanValue());
            }
        });
        LifecycleOwner lifecycleOwner16 = this.LLIZLLLIL;
        if (lifecycleOwner16 != null) {
            lifecycleOwner2 = lifecycleOwner16;
        }
        liveStateLIZ11.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1007));
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(2);
        }
        LJIILL();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) throws java.lang.Throwable {
        /*
            r12 = this;
            r10 = r17
            r9 = r16
            r8 = r15
            r7 = r14
            r6 = r13
            r5 = r12
            super.onLayout(r6, r7, r8, r9, r10)
            boolean r0 = r5.LLJJIJIIJIL
            r1 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L54
            X.0tQA<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r0 = r5.LLIZ
            if (r0 != 0) goto L17
            r0 = r4
        L17:
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            boolean r0 = r0.getEditable()
            if (r0 != 0) goto L3c
            X.0tQA<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r0 = r5.LLIZ
            if (r0 != 0) goto L26
            r0 = r4
        L26:
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel r0 = r0.getTextStyle()
            if (r0 == 0) goto L8c
            boolean r0 = r0.isEffectStyle
            if (r0 != r1) goto L8c
            X.0FK0 r0 = r5.LLJJJJ
            if (r0 == 0) goto L8c
            boolean r0 = r0.LJJIIZ
            if (r0 != r1) goto L8c
        L3c:
            X.0FNf r6 = r5.LLJJL
            int r7 = r5.LLJJLIIIJLLLLLLLZ
            int r8 = r5.getTextSizeSp()
            int r9 = r5.getDefaultTextSize()
            int r10 = r5.LLJJIJIL
            kotlin.jvm.internal.AwS584S0100000_5 r11 = new kotlin.jvm.internal.AwS584S0100000_5
            r0 = 986(0x3da, float:1.382E-42)
            r11.<init>(r5, r0)
            r6.LIZ(r7, r8, r9, r10, r11)
        L54:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHdcN/GI7yuRLiYTMUFmm/1xoeWy"
            r1.<init>(r0, r4)
            android.text.Editable r0 = X.C2204961BRm.G(r5, r1)
            if (r0 == 0) goto L6a
            java.lang.String r4 = r0.toString()
        L6a:
            r2.append(r4)
            java.lang.String r0 = "ljg"
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            if (r4 == 0) goto L9c
            int r0 = r4.length()
            if (r0 == 0) goto L9c
            android.text.TextPaint r2 = r5.getPaint()
            int r1 = r4.length()
            android.graphics.Rect r0 = r5.LLJLL
            r2.getTextBounds(r4, r3, r1, r0)
            return
        L8c:
            X.0tQA<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r0 = r5.LLIZ
            if (r0 != 0) goto L91
            r0 = r4
        L91:
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r0
            boolean r0 = r0.getForceEffectRender()
            if (r0 == 0) goto L54
            goto L3c
        L9c:
            android.graphics.Rect r0 = r5.LLJLL
            r0.set(r3, r3, r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385340F8y.onLayout(boolean, int, int, int, int):void");
    }
}
