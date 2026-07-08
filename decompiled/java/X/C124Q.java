package X;

import Y.AObjectS372S0100000_29;
import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.124Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C124Q extends C124Y {
    public static final /* synthetic */ int LLJLLIL = 0;
    public int LLIZ;
    public Paint LLIZLLLIL;
    public TextPaint LLJ;
    public Path LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public List<InteractTextStructWrap> LLJJIJIL;
    public boolean LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public int LLJJJJJIL;
    public C0F50 LLJJJJLIIL;
    public C124S LLJJL;
    public final C389050FNf LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;

    public C124Q() {
        throw null;
    }

    public void LJIIJJI(String str) {
    }

    public float LJIIL() {
        return 6.0f;
    }

    public int getScene() {
        return 0;
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)))) {
            return null;
        }
        Layout layout = getLayout();
        String string = C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)).toString();
        String[] strArr = new String[getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = string.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public int getAlign() {
        return this.LLJILJILJ;
    }

    public int getBgColor() {
        return this.LLJJIJIIJIL;
    }

    public int getBgColorMode() {
        return this.LLJJIJI;
    }

    @Override // X.C124Y
    public int getDefaultTextSize() {
        return this.LLJLL;
    }

    @Override // X.C124Y
    public int getEditFontSize() {
        return this.LLJJJJJIL;
    }

    public int getMinTextSize() {
        return this.LLJLILLLLZIIL;
    }

    public List<InteractTextStructWrap> getTextStructWrapList() {
        return this.LLJJIJIL;
    }

    @Override // X.C124Y
    public final void LJIIIIZZ(int i) {
        float f = i;
        this.LLIZ = (int) (C11VU.LIZIZ(LJIIL(), getContext()) * (f / getDefaultTextSize()));
        this.LLJJI = (int) (C11VU.LIZIZ(5.0f, getContext()) * (i / getDefaultTextSize()));
        this.LLIZLLLIL.setPathEffect(new CornerPathEffect(this.LLJJI));
        setLineSpacing(this.LLIZ, getLineSpacingMultiplier());
        setTextSize(f);
        setEditFontSize(i);
    }

    public int LJIIIZ(int i) {
        if (C0CHJ.LIZ()) {
            return i + this.LLIZ;
        }
        return i;
    }

    public int LJIIJ(int i) {
        if (C0CHJ.LIZ()) {
            return Math.max(i, getPaddingTop());
        }
        return i;
    }

    public int LJIILIIL(String str) {
        return (int) getPaint().measureText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01a2  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124Q.onDraw(android.graphics.Canvas):void");
    }

    public void setAligin(int i) {
        this.LLJILJILJ = i;
        if (i == 1) {
            setGravity(3);
        } else if (i == 2) {
            setGravity(17);
        } else {
            if (i != 3) {
                return;
            }
            setGravity(5);
        }
    }

    public void setAutoSizeChangedListener(C124S c124s) {
        this.LLJJL = c124s;
    }

    @Override // X.C124Y
    public void setDefaultTextSize(int i) {
        this.LLJLL = i;
    }

    @Override // X.C124Y
    public void setEditFontSize(int i) {
        this.LLJJJJJIL = i;
    }

    public void setFontType(Typeface typeface) {
        boolean zLIZ;
        if (getTypeface() != typeface) {
            setTypeface(typeface);
            if (this.LLJ.getTypeface() != typeface) {
                this.LLJ.setTypeface(typeface);
            }
        }
        C0FI2.LJIJJ();
        int scene = getScene();
        if (C0FI2.LJIILIIL(scene) != null) {
            zLIZ = C0FI2.LJIILIIL(scene).LIZ();
        } else {
            zLIZ = false;
        }
        this.LLJJIII = zLIZ;
        if (zLIZ) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    @Override // X.C124Y
    public void setFontTypeChangedListener(C0F50 c0f50) {
        this.LLJJJJLIIL = c0f50;
    }

    public void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    public void setMinTextSize(int i) {
        this.LLJLILLLLZIIL = i;
    }

    public void setMode(int i) {
        this.LLJILJIL = i;
    }

    public void setTextStructWrapList(List<InteractTextStructWrap> list) {
        this.LLJJIJIL = list;
    }

    public void setUseAutoTextSize(boolean z) {
        this.LLJL = z;
    }

    public C124Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJIJIL = -1;
        this.LLJILJIL = 1;
        this.LLJILJILJ = 2;
        this.LLJJJJJIL = getDefaultTextSize();
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = new C389050FNf(this);
        this.LLJL = false;
        this.LLJLIL = 0;
        this.LLJLL = 28;
        this.LLIZ = (int) C11VU.LIZIZ(LJIIL(), context);
        this.LLJJI = (int) C11VU.LIZIZ(5.0f, context);
        this.LLJJJJ = C11VU.LIZIZ(4.0f, context);
        Paint paint = new Paint();
        this.LLIZLLLIL = paint;
        paint.setColor(this.LLJIJIL);
        this.LLIZLLLIL.setStyle(Paint.Style.FILL);
        this.LLIZLLLIL.setAntiAlias(true);
        this.LLIZLLLIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.LLIZLLLIL.setPathEffect(new CornerPathEffect(this.LLJJI));
        this.LLJI = new Path();
        setLayerType(1, null);
        setLineSpacing(this.LLIZ, getLineSpacingMultiplier());
        addTextChangedListener(new C19773412Ya(this, 6));
        TextPaint textPaint = new TextPaint();
        this.LLJ = textPaint;
        textPaint.set(getPaint());
        this.LLJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.LLJ.setStyle(Paint.Style.FILL);
    }

    public void LJIILJJIL(int i, int i2) {
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = i2;
        if (this.LLJJIII) {
            setMaskBlurColor(i2);
            this.LLJILJIL = 5;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        Pair<Integer, Integer> pairLJI = C0F9I.LJI(i, i2);
        int iIntValue = pairLJI.getFirst().intValue();
        int iIntValue2 = pairLJI.getSecond().intValue();
        if (i == 1) {
            this.LLJILJIL = 1;
            this.LLJIJIL = iIntValue2;
            setBackground(null);
            setTextColor(iIntValue);
            return;
        }
        if (i == 4) {
            this.LLJILJIL = 4;
            this.LLJIJIL = iIntValue2;
            this.LLJ.setColor(iIntValue2);
            setBackground(null);
            setTextColor(iIntValue);
            setShadowLayer(12.0f, 0.0f, 0.0f, 0);
            if (Build.VERSION.SDK_INT < 28) {
                return;
            }
            setFallbackLineSpacing(false);
            return;
        }
        if (i != 2 && i != 6 && i != 7) {
            if (i != 3) {
                return;
            }
            this.LLJILJIL = 3;
            this.LLJIJIL = iIntValue2;
            setTextColor(iIntValue);
            return;
        }
        this.LLJILJIL = i;
        this.LLJIJIL = iIntValue2;
        setTextColor(iIntValue);
    }

    public final void LJIILL(int i, String str) {
        if (str == null) {
            return;
        }
        this.LLJJJ = true;
        if (!C123P.LJIIL(str.length(), this.LLJJIJIL)) {
            setText(str);
            setSelection(Math.min(i, C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)).toString().length()));
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        final Drawable drawable = getContext().getResources().getDrawable(R.drawable.c3h);
        this.LLJJJIL = getTextSize() * 0.7f;
        float f = this.LLJJJIL;
        drawable.setBounds(new Rect(0, 0, (int) f, (int) f));
        for (InteractTextStructWrap interactTextStructWrap : this.LLJJIJIL) {
            if (interactTextStructWrap.isValid(str.length())) {
                final float f2 = this.LLJJJJ;
                C786410Ut5.p2(spannableString, new C0GVX(drawable, f2) { // from class: X.0GVY
                    public final float LLILLL;

                    {
                        this.LLILLL = f2;
                    }

                    @Override // X.C0GVX, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                        return (int) (super.getSize(paint, charSequence, i2, i3, fontMetricsInt) + this.LLILLL);
                    }
                }, interactTextStructWrap.getRange().getStart() + 1, interactTextStructWrap.getRange().getStart() + 2, 33);
                C786410Ut5.p2(spannableString, new UnderlineSpan(), interactTextStructWrap.getRange().getStart() + 2, interactTextStructWrap.getRange().getEnd() - 1, 33);
            }
        }
        setText(spannableString);
        setSelection(Math.min(i, C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)).toString().length()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJILLL = getMeasuredWidth() / 2;
        this.LLJJ = (getLineHeight() - this.LLIZ) / 2;
        this.LLJLIL = i2;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)) != null && i == i2) {
            if (C123P.LJIIL(C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)).length(), this.LLJJIJIL)) {
                for (InteractTextStructWrap interactTextStructWrap : this.LLJJIJIL) {
                    if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                        setSelection(Math.min(interactTextStructWrap.getRange().getEnd(), C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)).toString().length()));
                        return;
                    }
                }
            }
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            LJIILL(C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)).length(), C2204961BRm.LLZILL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnnqFYWAj22a", null)).toString().substring(0, r2.length() - 1));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLJL) {
            this.LLJJLIIIJLLLLLLLZ.LIZ(this.LLJLIL, this.LLJJJJJIL, getDefaultTextSize(), this.LLJLILLLLZIIL, new AObjectS372S0100000_29(this, 2));
        }
    }
}
