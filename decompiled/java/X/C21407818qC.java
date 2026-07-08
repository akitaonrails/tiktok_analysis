package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18qC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21407818qC extends C0I7D implements TextWatcher {
    public boolean LLIZ;
    public Boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final int LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public int LLJJJIL;
    public View.OnClickListener LLJJJJ;
    public InterfaceC1237610iJL LLJJJJJIL;

    public final void LJIIJ() {
        setTextIsSelectable(false);
        super.setOnClickListener(new ACListenerS166S0100000_32(this, 3));
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final Rect getCharBounds() {
        return (Rect) this.LLJJJ.getValue();
    }

    private final Paint getCursorPaint() {
        return (Paint) this.LLJJIJIL.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.LLJJIJIIJIL.getValue();
    }

    private final void getNumberHeight() throws Throwable {
        boolean z;
        Editable editableLLLZIIL = C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null));
        if (editableLLLZIIL == null || editableLLLZIIL.length() != 0) {
            z = false;
        } else {
            z = true;
            this.LLJI = false;
            setText(CardStruct.IStatusCode.DEFAULT);
            this.LLJI = true;
        }
        getCharBounds().setEmpty();
        getPaint().getTextBounds(String.valueOf(C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null))), 0, 1, getCharBounds());
        this.LLJILJIL = getCharBounds().bottom - getCharBounds().top;
        if (z) {
            setText("");
        }
    }

    public final void LJIIIIZZ() {
        super.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: X.18qD
            @Override // android.view.ActionMode.Callback
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
    }

    public final void LJIIIZ() {
        getLinePaint().setColor(this.LLJILJILJ);
        invalidate();
    }

    public final void LJIIJJI() {
        getLinePaint().setColor(this.LLJILLL);
        invalidate();
    }

    public final InterfaceC1237610iJL getCallback() {
        return this.LLJJJJJIL;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        InterfaceC1237610iJL interfaceC1237610iJL;
        InterfaceC1237610iJL interfaceC1237610iJL2;
        Integer numValueOf;
        if (this.LLJJJJJIL == null) {
            return;
        }
        if (editable != null) {
            length = editable.length();
        } else {
            length = 0;
        }
        if (this.LLJI && length > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("length is: ");
            if (editable != null) {
                numValueOf = Integer.valueOf(editable.length());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", s is ");
            sbLIZ.append((Object) editable);
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C1720306oT.LIZ;
            InterfaceC1237610iJL interfaceC1237610iJL3 = this.LLJJJJJIL;
            if (interfaceC1237610iJL3 != null) {
                interfaceC1237610iJL3.LJJLL();
            }
            this.LLJI = false;
        }
        int i2 = this.LLJ;
        if (i2 > 0 && length >= 0 && i2 > length && (interfaceC1237610iJL2 = this.LLJJJJJIL) != null) {
            String.valueOf(editable);
            interfaceC1237610iJL2.LJJJLIIL();
        }
        if ((!Intrinsics.LJFF(this.LLIZLLLIL, Boolean.TRUE) || this.LLIZ) && length > 0 && length == this.LLJJI && (interfaceC1237610iJL = this.LLJJJJJIL) != null) {
            interfaceC1237610iJL.Tk(a0.LJLIIIL(String.valueOf(editable)).toString().toLowerCase(Locale.ROOT), null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        boolean z;
        int i;
        boolean z2;
        int length;
        boolean z3;
        int i2;
        float f;
        CharSequence charSequenceLLLZIIL;
        Editable editableLLLZIIL;
        int i3;
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        if (getLayoutDirection() == 1) {
            z = true;
            i = -1;
        } else {
            z = false;
            i = 1;
        }
        if (this.LLJJIII == 0) {
            int width = (getWidth() - paddingStart) - paddingEnd;
            int i4 = this.LLJJ;
            if (i4 < 0) {
                i3 = width / ((this.LLJJI * 2) - 1);
            } else {
                int i5 = this.LLJJI;
                i3 = (width - (i4 * (i5 - 1))) / i5;
            }
            this.LLJJIII = i3;
        }
        if (this.LLJIJIL == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (editableLLLZIIL = C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null))) != null && editableLLLZIIL.length() > 0) {
            int length2 = C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null)).length();
            float[] fArr = new float[length2];
            getPaint().getTextWidths(C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null)), 0, length2, fArr);
            this.LLJIJIL = fArr[0];
        }
        if (this.LLJILJIL == 0.0f) {
            getNumberHeight();
        }
        if (z) {
            paddingStart = (getWidth() - paddingStart) - this.LLJJIII;
        }
        float f2 = paddingStart;
        float height = getHeight() - getPaddingBottom();
        int i6 = this.LLJJI;
        for (int i7 = 0; i7 < i6; i7++) {
            Canvas canvas2 = canvas;
            if (canvas2 != null) {
                canvas2 = canvas2;
                canvas2.drawLine(f2, height, f2 + this.LLJJIII, height, getLinePaint());
            }
            float f3 = f2 + (this.LLJJIII / 2);
            Editable editableLLLZIIL2 = C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null));
            if (editableLLLZIIL2 != null) {
                length = editableLLLZIIL2.length();
            } else {
                length = 0;
            }
            if (length > i7) {
                if (length > 1 && z) {
                    charSequenceLLLZIIL = C13LN.LJLZ(C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null)));
                } else {
                    charSequenceLLLZIIL = C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null));
                }
                if (canvas2 != null) {
                    canvas2.drawText(charSequenceLLLZIIL, i7, i7 + 1, f3 - (this.LLJIJIL / 2), height - this.LLJJIJI, getPaint());
                }
            }
            if (i7 == this.LLJJI - 1 && C2204961BRm.LLLZIIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8iQpux4pplooiJ663ug==", null)).length() == this.LLJJI) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (isFocused() && getSelectionStart() == getSelectionEnd() && (i7 == getSelectionStart() || z3)) {
                float f4 = height - this.LLJJIJI;
                float f5 = this.LLJILJIL;
                float f6 = 0.2f * f5;
                if (z3) {
                    float f7 = this.LLJIJIL;
                    f = (f7 / 2.0f) + (f7 * 0.25f);
                } else {
                    f = 0.0f;
                }
                float f8 = f * i;
                float f9 = (f4 - f5) - f6;
                float f10 = f4 + f6;
                if (canvas2 != null) {
                    float f11 = f3 + f8;
                    canvas2.drawLine(f11, f9, f11, f10, getCursorPaint());
                }
            }
            int i8 = this.LLJJ;
            if (i8 < 0) {
                i2 = this.LLJJIII * i * 2;
            } else {
                i2 = (this.LLJJIII + i8) * i;
            }
            f2 += i2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        this.LLIZLLLIL = Boolean.TRUE;
        super.onRestoreInstanceState(parcelable);
        this.LLIZLLLIL = Boolean.FALSE;
    }

    public final void setCallback(InterfaceC1237610iJL interfaceC1237610iJL) {
        this.LLJJJJJIL = interfaceC1237610iJL;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i);
        this.LLJJJIL = i;
    }

    public final void setInputLength(int i) {
        if (i <= 0) {
            return;
        }
        this.LLJJIII = 0;
        this.LLJJI = i;
        C1722190uuv.LIZ(this, i);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        int i2;
        super.setInputType(i);
        if (getLayoutDirection() == 1) {
            if (i == 2) {
                i2 = 8388613;
            } else {
                i2 = this.LLJJJIL;
            }
            setGravity(i2);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LLJJJJ = onClickListener;
    }

    public final void setTextAndAutoCheck(CharSequence charSequence) {
        this.LLIZ = true;
        setText(charSequence);
        this.LLIZ = false;
    }

    public C21407818qC(Context context, AttributeSet attributeSet) {
        Integer numValueOf;
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, R.attr.xv);
        this.LLJI = true;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(228));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(227));
        this.LLJJJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(226));
        setBackgroundResource(0);
        this.LLJJI = attributeSet != null ? attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4) : 4;
        if (attributeSet != null) {
            numValueOf = Integer.valueOf(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", R.attr.a1h));
        } else {
            numValueOf = null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CodeInputView);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.CodeInputView_lineColor, -16777216);
        this.LLJILJILJ = color;
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.CodeInputView_cursorColor, -65536);
        this.LLJILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.CodeInputView_errorLineColor, -65536);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CodeInputView_cursorWidth, C341940Daq.LIZ(2.0d));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CodeInputView_lineHeight, C341940Daq.LIZ(1.0d));
        this.LLJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CodeInputView_gapWidth, C341940Daq.LIZ(10.0d));
        this.LLJJIJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CodeInputView_lineNumberDist, C341940Daq.LIZ(5.0d));
        typedArrayObtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(iIntValue, context);
        if (numLIZJ != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        paint.setColor(iIntValue2);
        getLinePaint().setColor(color);
        getLinePaint().setStrokeWidth(dimensionPixelSize2);
        getLinePaint().setAntiAlias(true);
        getCursorPaint().setColor(color2);
        getCursorPaint().setStrokeWidth(dimensionPixelSize);
        getCursorPaint().setAntiAlias(true);
        getCursorPaint().setStrokeCap(Paint.Cap.ROUND);
        getCursorPaint().getStrokeWidth();
        setCursorVisible(false);
        this.LLJJJIL = getGravity();
        addTextChangedListener(this);
        setContentDescription(context.getString(2131823338));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length;
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        this.LLJ = length;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != i) {
            this.LLJJIII = 0;
        }
    }
}
