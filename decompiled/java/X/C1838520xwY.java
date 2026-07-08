package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838520xwY extends LiveEditText implements InterfaceC1092330eX1, InterfaceC1838570xwd {
    public boolean LLJIJIL;
    public int LLJILJIL;
    public C1838530xwZ LLJILJILJ;
    public float LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public float LLJJIII;

    public final void LJIIJ() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LLJILJIL * (this.LLJILLL / 100.0f))));
        int i = iLIZIZ * 2;
        setPadding(Math.max(getPaddingLeft(), i), Math.max(getPaddingTop(), iLIZIZ), Math.max(getPaddingRight(), i), Math.max(getPaddingBottom(), iLIZIZ));
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ == null) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return getLayoutDirection() == 1 ? compoundPaddingLeft + c1838530xwZ.LIZIZ() : compoundPaddingLeft + c1838530xwZ.LIZLLL();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ == null) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight();
        return getLayoutDirection() == 1 ? compoundPaddingRight + c1838530xwZ.LIZLLL() : compoundPaddingRight + c1838530xwZ.LIZIZ();
    }

    @Override // android.widget.TextView
    public int getTotalPaddingLeft() {
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ == null) {
            return super.getTotalPaddingLeft();
        }
        int totalPaddingLeft = super.getTotalPaddingLeft();
        return getLayoutDirection() == 1 ? totalPaddingLeft + c1838530xwZ.LIZIZ() : totalPaddingLeft + c1838530xwZ.LIZLLL();
    }

    @Override // android.widget.TextView
    public int getTotalPaddingRight() {
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ == null) {
            return super.getTotalPaddingRight();
        }
        int totalPaddingRight = super.getTotalPaddingRight();
        return getLayoutDirection() == 1 ? totalPaddingRight + c1838530xwZ.LIZLLL() : totalPaddingRight + c1838530xwZ.LIZIZ();
    }

    @Override // X.InterfaceC1838570xwd
    public final int LIZLLL() {
        return getCompoundPaddingTop();
    }

    @Override // X.InterfaceC1838570xwd
    public final int LJ() {
        return super.getCompoundPaddingRight();
    }

    @Override // X.InterfaceC1838570xwd
    public final int LJI() {
        return super.getCompoundPaddingLeft();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0291 A[PHI: r7
      0x0291: PHI (r7v1 com.bytedance.android.livesdk.model.MeasureSpec) = (r7v0 com.bytedance.android.livesdk.model.MeasureSpec), (r7v3 com.bytedance.android.livesdk.model.MeasureSpec) binds: [B:113:0x028d, B:8:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.bytedance.android.livesdk.model.RichTextStyle r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1838520xwY.LJIIIIZZ(com.bytedance.android.livesdk.model.RichTextStyle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        Layout layout;
        String string;
        boolean z;
        int compoundPaddingLeft;
        int compoundPaddingRight;
        int compoundPaddingTop;
        float f;
        float f2;
        float f3;
        float f4;
        InterfaceC1838570xwd interfaceC1838570xwd;
        InterfaceC1838570xwd interfaceC1838570xwd2;
        InterfaceC1838570xwd interfaceC1838570xwd3;
        if (this.LLJILLL > 0.0f || this.LLJJI > 0.0f || this.LLJJIII > 0.0f) {
            Layout layout2 = getLayout();
            if (layout2 == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drawStroke: ABORT layout=null, strokeColor=");
                sbLIZ.append(this.LLJJ);
                sbLIZ.append(", w=");
                sbLIZ.append(this.LLJILLL);
                C20441214yg.LIZIZ("DslBoardEditText", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C20441214yg.LIZIZ("DslBoardEditText", "drawStroke: ENTER strokeColor=" + this.LLJJ + ", widthPct=" + this.LLJILLL + ", xOffPct=" + this.LLJJI + ", yOffPct=" + this.LLJJIII + ", currentFontSize=" + this.LLJILJIL + ", currentTextColor=" + getCurrentTextColor() + ", compoundPadL=" + getCompoundPaddingLeft() + ", extPadTop=" + getExtendedPaddingTop() + ", scrollX=" + getScrollX() + ", scrollY=" + getScrollY() + ", viewWxH=" + getWidth() + 'x' + getHeight() + ", layoutWxH=" + layout2.getWidth() + 'x' + layout2.getHeight() + ", lineCount=" + layout2.getLineCount());
                TextPaint textPaint = new TextPaint(getPaint());
                getPaint().setStrokeCap(Paint.Cap.ROUND);
                getPaint().setStrokeJoin(Paint.Join.ROUND);
                getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                getPaint().setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(((float) this.LLJILJIL) * (this.LLJILLL / 100.0f))) * ((float) 2));
                getPaint().setColor(this.LLJJ);
                if (this.LLJILLL > 0.0f) {
                    LJIIIZ(this, layout2, canvas);
                }
                if (this.LLJJI > 0.0f || this.LLJJIII > 0.0f) {
                    int iSave = canvas.save();
                    try {
                        canvas.translate(C418440Gaw.LIZIZ(Float.valueOf(this.LLJILJIL * (this.LLJJI / 100.0f))), C418440Gaw.LIZIZ(Float.valueOf(this.LLJILJIL * (this.LLJJIII / 100.0f))));
                        LJIIIZ(this, layout2, canvas);
                        canvas.restoreToCount(iSave);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        canvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                getPaint().set(textPaint);
            }
        }
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ != null && (layout = c1838530xwZ.LIZ.getLayout()) != null) {
            Editable editableLLJILLL = C2204961BRm.LLJILLL(c1838530xwZ.LIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HZz8IVm6AtN3vWxiGjZj1sH4hNhh4LUGrTxdEXcO5skEsq1vsCJXzjO9M4NOuMrgja+JEHCPA==", null));
            if (editableLLJILLL == null || (string = editableLLJILLL.toString()) == null) {
                string = "";
            }
            Paint.FontMetricsInt fontMetricsInt = c1838530xwZ.LIZ.getPaint().getFontMetricsInt();
            float fLIZJ = c1838530xwZ.LIZJ();
            if (fLIZJ > 0.0f) {
                C1838550xwb c1838550xwb = c1838530xwZ.LIZIZ;
                float f5 = c1838550xwb.LIZ * fLIZJ;
                float f6 = c1838550xwb.LIZIZ * fLIZJ;
                float f7 = c1838550xwb.LIZJ * fLIZJ;
                float fLIZLLL = c1838530xwZ.LIZLLL();
                float fLIZIZ = c1838530xwZ.LIZIZ();
                if (c1838530xwZ.LIZ.getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                EditText editText = c1838530xwZ.LIZ;
                if ((editText instanceof InterfaceC1838570xwd) && (interfaceC1838570xwd3 = (InterfaceC1838570xwd) editText) != null) {
                    compoundPaddingLeft = interfaceC1838570xwd3.LJI();
                } else {
                    compoundPaddingLeft = editText.getCompoundPaddingLeft();
                }
                float f8 = compoundPaddingLeft;
                EditText editText2 = c1838530xwZ.LIZ;
                if ((editText2 instanceof InterfaceC1838570xwd) && (interfaceC1838570xwd2 = (InterfaceC1838570xwd) editText2) != null) {
                    compoundPaddingRight = interfaceC1838570xwd2.LJ();
                } else {
                    compoundPaddingRight = editText2.getCompoundPaddingRight();
                }
                float width = c1838530xwZ.LIZ.getWidth() - compoundPaddingRight;
                EditText editText3 = c1838530xwZ.LIZ;
                if ((editText3 instanceof InterfaceC1838570xwd) && (interfaceC1838570xwd = (InterfaceC1838570xwd) editText3) != null) {
                    compoundPaddingTop = interfaceC1838570xwd.LIZLLL();
                } else {
                    compoundPaddingTop = editText3.getCompoundPaddingTop();
                }
                float scrollY = compoundPaddingTop - c1838530xwZ.LIZ.getScrollY();
                int lineCount = layout.getLineCount();
                int i = 0;
                while (i < lineCount) {
                    if (layout.getLineStart(i) < layout.getLineEnd(i) && (!a0.LJJJIL(string.substring(r1, r0)))) {
                        float lineBaseline = layout.getLineBaseline(i);
                        float f9 = (fontMetricsInt.ascent + lineBaseline) - f5;
                        float f10 = fontMetricsInt.descent + lineBaseline + f6;
                        if (!z) {
                            f2 = fLIZLLL;
                        } else {
                            f2 = fLIZIZ;
                        }
                        float f11 = f2 + f8;
                        float lineLeft = f11 + layout.getLineLeft(i);
                        float lineRight = f11 + layout.getLineRight(i);
                        if (!z) {
                            f3 = lineLeft - fLIZLLL;
                            f4 = lineRight + fLIZIZ;
                        } else {
                            f3 = lineLeft - fLIZIZ;
                            f4 = lineRight + fLIZLLL;
                        }
                        RectF rectF = c1838530xwZ.LJ;
                        if (f3 < f8) {
                            f = f8;
                        } else {
                            f = f8;
                            f8 = f3;
                        }
                        rectF.left = f8;
                        if (f4 > width) {
                            f4 = width;
                        }
                        rectF.right = f4;
                        rectF.top = f9 + scrollY;
                        rectF.bottom = f10 + scrollY;
                        canvas.drawRoundRect(rectF, f7, f7, c1838530xwZ.LIZJ);
                        if (c1838530xwZ.LIZIZ.LJII) {
                            float f12 = lineBaseline + ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + scrollY;
                            RectF rectF2 = c1838530xwZ.LJ;
                            canvas.drawLine(rectF2.left, f12, rectF2.right, f12, c1838530xwZ.LIZLLL);
                        }
                    } else {
                        f = f8;
                    }
                    i++;
                    f8 = f;
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJIJIL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFontByIdentifier(String str) throws Throwable {
        Typeface typefaceLJ = C1839560xyE.LJ(str);
        if (typefaceLJ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Font: ");
            sbLIZ.append(str);
            sbLIZ.append(" not found (invalid key/not yet downloaded)");
            C20441214yg.LIZIZ("boards DEBUG", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        setFontType(typefaceLJ);
    }

    public final void setFontSize(int i) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFontSize: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("DslBoardEditText", C2188811AlT.LIZIZ(sbLIZ));
        setTextSize(1, i);
        this.LLJILJIL = i;
    }

    public final void setFontType(Typeface typeface) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFontType: ");
        sbLIZ.append(typeface);
        C20441214yg.LIZIZ("DslBoardEditText", C2188811AlT.LIZIZ(sbLIZ));
        if (typeface != null && !Intrinsics.LJFF(getTypeface(), typeface)) {
            setTypeface(typeface);
        }
    }

    public final void setHorizontalAlignment(int i) throws Throwable {
        int length;
        C20441214yg.LIZIZ("DslBoardEditText", "setHorizontalAlignment: " + i);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    setTextAlignment(6);
                }
            } else {
                setTextAlignment(4);
            }
        } else {
            setTextAlignment(5);
        }
        int selectionEnd = getSelectionEnd();
        setText(C2204961BRm.LLLIIIIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HZz8IVm6AtN3vWxiGjZj1sH4hNhh4LUGrTxVGXXOpY/GOqTtnZjHMK1", null)));
        Editable editableLLLIIIIL = C2204961BRm.LLLIIIIL(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HZz8IVm6AtN3vWxiGjZj1sH4hNhh4LUGrTxVGXXOpY/GOqTtnZjHMK1", null));
        if (editableLLLIIIIL != null) {
            length = editableLLLIIIIL.length();
        } else {
            length = 0;
        }
        setSelection(C13LZ.LJ(selectionEnd, 0, length));
    }

    public final void setMaxHeightPercent(float f) {
        float f2 = C488301vF.LJ;
        setMaxHeight((int) (C488301vF.LJ * (f / 100)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[EditText-setMaxHeightPercent] pct=");
        sbLIZ.append(f);
        sbLIZ.append(" -> maxHeight=");
        sbLIZ.append(getMaxHeight());
        sbLIZ.append(" px");
        C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setMaxWidthPercent(float f) {
        float f2 = C488301vF.LJ;
        float f3 = C488301vF.LJ;
        setMaxWidth((int) ((f / 100) * f3));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[EditText-setMaxWidthPercent] pct=");
        sbLIZ.append(f);
        sbLIZ.append(" -> maxWidth=");
        sbLIZ.append(getMaxWidth());
        sbLIZ.append(" px (LOGICAL_CANVAS_SIZE=");
        sbLIZ.append(f3);
        sbLIZ.append(')');
        C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) throws Throwable {
        super.setTypeface(typeface);
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ != null) {
            c1838530xwZ.LIZ();
        }
    }

    public C1838520xwY(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet, 0);
        this.LLJIJIL = true;
        this.LLJILJIL = 24;
        setInputType(524288);
        setSingleLine(false);
        setCursorVisible(true);
        setLayerType(1, null);
        setFontSize(24);
        setTextColor(C202500qF.LIZJ(-1, "#FFFFFFFF"));
        setMaxWidthPercent(80.0f);
        setMaxHeightPercent(200.0f);
        setVerticalScrollBarEnabled(true);
        setMovementMethod(ScrollingMovementMethod.getInstance());
        if (this.LLJILJILJ == null) {
            C1838530xwZ c1838530xwZ = new C1838530xwZ(this);
            this.LLJILJILJ = c1838530xwZ;
            c1838530xwZ.LIZ();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int iLIZLLL;
        int iLIZIZ;
        Integer numValueOf;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == 1073741824) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[EditText-onMeasure:EXACTLY] widthSize=");
            sbLIZ.append(size);
            sbLIZ.append(", maxWidth=");
            sbLIZ.append(getMaxWidth());
            sbLIZ.append(", cpL=");
            sbLIZ.append(getCompoundPaddingLeft());
            sbLIZ.append(", cpR=");
            sbLIZ.append(getCompoundPaddingRight());
            sbLIZ.append(", startInset=");
            C1838530xwZ c1838530xwZ = this.LLJILJILJ;
            Integer numValueOf2 = null;
            if (c1838530xwZ != null) {
                numValueOf = Integer.valueOf(c1838530xwZ.LIZLLL());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", endInset=");
            C1838530xwZ c1838530xwZ2 = this.LLJILJILJ;
            if (c1838530xwZ2 != null) {
                numValueOf2 = Integer.valueOf(c1838530xwZ2.LIZIZ());
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append(", superMeasuredWidth=");
            sbLIZ.append(measuredWidth);
            sbLIZ.append(", measuredHeight=");
            sbLIZ.append(getMeasuredHeight());
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Layout layout = getLayout();
        if (layout == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[EditText-onMeasure:no-layout] mode=");
            sbLIZ2.append(mode);
            sbLIZ2.append(", widthSize=");
            sbLIZ2.append(size);
            sbLIZ2.append(", maxWidth=");
            sbLIZ2.append(getMaxWidth());
            sbLIZ2.append(", superMeasuredWidth=");
            sbLIZ2.append(measuredWidth);
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int lineCount = layout.getLineCount();
        float fMax = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            fMax = Math.max(fMax, layout.getLineWidth(i3));
        }
        int iCeil = ((int) Math.ceil(fMax)) + getCompoundPaddingLeft() + getCompoundPaddingRight();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int iMax = Math.max(iCeil, suggestedMinimumWidth);
        int maxWidth = getMaxWidth();
        if (1 <= maxWidth && maxWidth <= Integer.MAX_VALUE) {
            iMin = Math.min(iMax, getMaxWidth());
        } else {
            iMin = iMax;
        }
        int iResolveSize = EditText.resolveSize(iMin, i);
        C1838530xwZ c1838530xwZ3 = this.LLJILJILJ;
        if (c1838530xwZ3 != null) {
            iLIZLLL = c1838530xwZ3.LIZLLL();
        } else {
            iLIZLLL = 0;
        }
        C1838530xwZ c1838530xwZ4 = this.LLJILJILJ;
        if (c1838530xwZ4 != null) {
            iLIZIZ = c1838530xwZ4.LIZIZ();
        } else {
            iLIZIZ = 0;
        }
        C1092200eWo.LIZ("[EditText-onMeasure] widthMode=" + mode + ", widthSize=" + size + ", maxWidth=" + getMaxWidth() + ", cpL=" + getCompoundPaddingLeft() + ", cpR=" + getCompoundPaddingRight() + ", startInset=" + iLIZLLL + ", endInset=" + iLIZIZ + ", lineCount=" + layout.getLineCount() + ", maxLineWidth=" + fMax + ", contentWidth=" + iCeil + ", minByViewAndBg=" + suggestedMinimumWidth + ", desiredRaw=" + iMax + ", desiredCapped=" + iMin + ", superMeasuredWidth=" + measuredWidth + ", resolvedWidth=" + iResolveSize + ", measuredHeight=" + getMeasuredHeight());
        setMeasuredDimension(iResolveSize, getMeasuredHeight());
    }

    @Override // com.bytedance.android.live.design.widget.LiveEditText, android.widget.TextView
    public final void setTextSize(int i, float f) throws Throwable {
        super.setTextSize(i, f);
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ != null) {
            c1838530xwZ.LIZ();
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) throws Throwable {
        super.setTypeface(typeface, i);
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ != null) {
            c1838530xwZ.LIZ();
        }
    }

    public static final void LJIIIZ(C1838520xwY c1838520xwY, Layout layout, Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(c1838520xwY.getCompoundPaddingLeft() - c1838520xwY.getScrollX(), c1838520xwY.getExtendedPaddingTop() - c1838520xwY.getScrollY());
            layout.draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    public final void LJIIJJI(float f, float f2, float f3, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStroke: color=");
        sbLIZ.append(i);
        sbLIZ.append(", radius=");
        sbLIZ.append(f);
        sbLIZ.append(", xOffset=");
        sbLIZ.append(f2);
        sbLIZ.append(", yOffset=");
        sbLIZ.append(f3);
        C20441214yg.LIZIZ("DslBoardEditText", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = i;
        this.LLJILLL = f;
        this.LLJJI = f2;
        this.LLJJIII = f3;
        if (Build.VERSION.SDK_INT >= 28) {
            setFallbackLineSpacing(false);
        }
        LJIIJ();
        invalidate();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        C1838530xwZ c1838530xwZ = this.LLJILJILJ;
        if (c1838530xwZ != null) {
            c1838530xwZ.LIZ();
        }
    }
}
