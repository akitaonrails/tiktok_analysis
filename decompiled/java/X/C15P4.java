package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.EnableTextHeaderOfficialStarlingEditorSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.MultiGuestTextHeaderMaxCountLimitSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15P4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15P4 extends LiveEditText {
    public static final int LLJJJJ;
    public static final int LLJJJJJIL;
    public boolean LLJIJIL;
    public float LLJILJIL;
    public final TextPaint LLJILJILJ;
    public float LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public C01F5 LLJJJ;
    public final C15P3 LLJJJIL;

    public final void LJIILIIL() {
        this.LLJJIJIIJIL = false;
        this.LLJIJIL = true;
        setFocusable(false);
        setFocusableInTouchMode(false);
        setCursorVisible(false);
        setKeyListener(null);
        int currentMaxTextSize = (int) getCurrentMaxTextSize();
        if (currentMaxTextSize < 15) {
            currentMaxTextSize = 15;
        }
        C21382118m3.LIZIZ(this, 14, currentMaxTextSize, 1, 2);
        setHintTextColor(0);
        setMaxLines(LLJJJJJIL);
        setTextIsSelectable(false);
        setFilters(new InputFilter[0]);
        removeTextChangedListener(this.LLJJJIL);
    }

    static {
        MultiGuestTextHeaderMaxCountLimitSetting multiGuestTextHeaderMaxCountLimitSetting = MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE;
        LLJJJJ = multiGuestTextHeaderMaxCountLimitSetting.getValue().maxCharCountLimit;
        LLJJJJJIL = multiGuestTextHeaderMaxCountLimitSetting.getValue().maxLinesCountLimit;
    }

    private final float getCurrentMaxTextSize() {
        C01F5 c01f5 = this.LLJJJ;
        if (c01f5.LJII) {
            return c01f5.LJI;
        }
        return 16.0f;
    }

    private final float getStrokeWidth() {
        float f = this.LLJILLL;
        if (f <= 0.0f) {
            return 0.0f;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(f)) * MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().strokeMultipleSize;
        float textSize = getTextSize() * 0.2f;
        if (fLIZIZ < textSize) {
            fLIZIZ = textSize;
        }
        return C814420VxA.LIZIZ(fLIZIZ);
    }

    public final int getMaxCharCount() {
        if (!this.LLJJIJI || EnableTextHeaderOfficialStarlingEditorSetting.INSTANCE.getValue()) {
            return Integer.MAX_VALUE;
        }
        return LLJJJJ;
    }

    public final void LJIIIIZZ(C01F5 c01f5) {
        boolean z;
        TextView textView;
        Object editableText;
        Object obj;
        String str;
        Object obj2;
        Object next;
        float fFloatValue;
        setBackground(null);
        float f = 0.0f;
        LJIIL(0.0f, 0.0f, 0.0f, 0);
        float f2 = c01f5.LJI;
        C01F5 c01f52 = this.LLJJJ;
        if (f2 == c01f52.LJI) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        boolean z3 = !Intrinsics.LJFF(c01f5.LIZIZ, c01f52.LIZIZ);
        this.LLJJJ = c01f5;
        setFontByIdentifier(c01f5.LIZIZ);
        setTextColor(c01f5.LIZJ);
        float f3 = c01f5.LJ;
        if (f3 > 0.0f) {
            setLineHeight(f3);
        }
        setHorizontalAlignment(2);
        if (c01f5.LIZLLL) {
            List<C15P5> list = C1EAR.LIZ;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    obj2 = ListProtector.get(list, i);
                    Integer num = ((C15P5) obj2).LIZIZ;
                    int i2 = c01f5.LIZJ;
                    if (num != null && num.intValue() == i2) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C15P5 c15p5 = (C15P5) obj2;
            if (c15p5 != null) {
                List listLJIL = C2097808Js.LJIL(c15p5.LIZ.LIZIZ);
                Iterator it2 = listLJIL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((Number) ((Pair) next).getFirst()).floatValue() == getTextSize()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Pair pair = (Pair) next;
                if (pair == null) {
                    pair = (Pair) C13LP.LJJJLL(listLJIL);
                }
                int color = ColorProtector.parseColor(c15p5.LIZ.LIZ);
                if (pair != null) {
                    fFloatValue = ((Number) pair.getSecond()).floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                LJIIL(fFloatValue, 0.0f, 0.0f, color);
            }
        }
        boolean z4 = c01f5.LIZLLL;
        if (MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().addDefaultShadowWhenNoStroke && !z4) {
            float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(2.0f));
            float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(0.0f));
            float fLIZIZ3 = C418440Gaw.LIZIZ(Float.valueOf(1.0f));
            setShadowLayer(fLIZIZ, fLIZIZ2, fLIZIZ3, C20736316Cj.LIZIZ(R.attr.exr, getContext()));
            int paddingLeft = getPaddingLeft();
            float f4 = fLIZIZ - fLIZIZ2;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            int iMax = Math.max(paddingLeft, C814420VxA.LIZIZ(f4));
            int paddingTop = getPaddingTop();
            float f5 = fLIZIZ - fLIZIZ3;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            int iMax2 = Math.max(paddingTop, C814420VxA.LIZIZ(f5));
            int paddingRight = getPaddingRight();
            float f6 = fLIZIZ2 + fLIZIZ;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            int iMax3 = Math.max(paddingRight, C814420VxA.LIZIZ(f6));
            int paddingBottom = getPaddingBottom();
            float f7 = fLIZIZ + fLIZIZ3;
            if (f7 >= 0.0f) {
                f = f7;
            }
            setPadding(iMax, iMax2, iMax3, Math.max(paddingBottom, C814420VxA.LIZIZ(f)));
        } else {
            setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        if (this.LLJJIJIIJIL && ((str = c01f5.LIZ) == null || a0.LJJJIL(str))) {
            setFontType(Typeface.defaultFromStyle(0));
        }
        String str2 = c01f5.LIZ;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix7bsXd17byH/fj150fCVhkq4BePVW96vf819RiKNAGDa4XZln2VxPtcKKeroSygriAgHhnM=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(999, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/textheader/common/fontstyle/TextFontDslBoardEditText", "getEditableText", this, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(999, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/textheader/common/fontstyle/TextFontDslBoardEditText", "getEditableText", null, objArr, this, c0wzw, false);
            editableText = c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                textView = (TextView) obj;
            } else {
                textView = this;
            }
            editableText = textView.getEditableText();
            c0wst.LIZ(999, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/textheader/common/fontstyle/TextFontDslBoardEditText", "getEditableText", editableText, objArr, textView, c0wzw, true);
        }
        if (!Intrinsics.LJFF(str2, editableText.toString())) {
            setText(c01f5.LIZ);
        } else if (this.LLJJIJIIJIL && this.LLJJJ.LJII && (z2 || z3)) {
            LJIILJJIL(c01f5.LIZ);
        }
        if (!this.LLJJIJIIJIL && z2) {
            int currentMaxTextSize = (int) getCurrentMaxTextSize();
            if (currentMaxTextSize < 15) {
                currentMaxTextSize = 15;
            }
            C21382118m3.LIZIZ(this, 14, currentMaxTextSize, 1, 2);
        }
    }

    public final void LJIILJJIL(String str) {
        String str2;
        int measuredWidth;
        int length;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (this.LLJJIJIIJIL) {
            measuredWidth = this.LLJJIJIL;
        } else {
            measuredWidth = getMeasuredWidth();
        }
        getMeasuredHeight();
        float currentMaxTextSize = getCurrentMaxTextSize();
        boolean z = this.LLJJJ.LJII;
        int i = LLJJJJJIL;
        float fFloatValue = 14.0f;
        if (z) {
            Float fLJIIJJI = LJIIJJI(this, str2, currentMaxTextSize, 14.0f, 1.0f, 1);
            if (fLJIIJJI != null) {
                fFloatValue = fLJIIJJI.floatValue();
                setMaxLines(1);
                setEllipsize(null);
            } else {
                Float fLJIIJJI2 = LJIIJJI(this, str2, currentMaxTextSize, 14.0f, 1.0f, i);
                if (fLJIIJJI2 != null) {
                    fFloatValue = fLJIIJJI2.floatValue();
                    setMaxLines(i);
                    setEllipsize(null);
                } else {
                    setMaxLines(i);
                    setEllipsize(TextUtils.TruncateAt.END);
                }
            }
        } else {
            setMaxLines(i);
            setEllipsize(null);
            Typeface typeface = getTypeface();
            while (true) {
                if (currentMaxTextSize < 14.0f) {
                    break;
                }
                int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                StaticLayout staticLayoutLJIIJ = LJIIJ(this, this, str2, LJIIIZ(this, C418440Gaw.LIZIZ(Float.valueOf(currentMaxTextSize)), typeface));
                if (staticLayoutLJIIJ.getLineCount() <= i) {
                    staticLayoutLJIIJ.getHeight();
                    float strokeWidth = getStrokeWidth();
                    float textSize = getTextSize() * (this.LLJJIII / 100.0f);
                    Math.max(strokeWidth, (-textSize) + strokeWidth);
                    Math.max(strokeWidth, textSize + strokeWidth);
                    getPaddingTop();
                    getPaddingBottom();
                    break;
                }
                currentMaxTextSize -= 1.0f;
            }
            fFloatValue = currentMaxTextSize;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTextSize textSizeDp:");
        sbLIZ.append(fFloatValue);
        sbLIZ.append(" textLength:");
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextFontDslBoardEditText", 2);
        setTextSize(1, fFloatValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[Catch: all -> 0x00f9, TryCatch #0 {all -> 0x00f9, blocks: (B:25:0x00be, B:27:0x00d4, B:29:0x00de, B:31:0x00e4, B:32:0x00f6), top: B:40:0x00be }] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15P4.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJIJIL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFontByIdentifier(String str) {
        String resourceId;
        if (!TextUtils.isEmpty(str)) {
            Map<String, TextHeaderBoardTextFontStyleData> map = C20424314vx.LIZ;
            if (map.size() != 0) {
                Iterator<TextHeaderBoardTextFontStyleData> it2 = map.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TextHeaderBoardTextFontStyleData next = it2.next();
                    Effect effect = next.LIZJ;
                    if (effect != null) {
                        resourceId = effect.getResourceId();
                    } else {
                        resourceId = null;
                    }
                    if (Intrinsics.LJFF(str, resourceId)) {
                        Typeface typefaceLJ = C20424314vx.LJ(next.fileName);
                        if (typefaceLJ != null) {
                            setFontType(typefaceLJ);
                            return;
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Font: ");
        sbLIZ.append(str);
        sbLIZ.append(" not found (invalid key/not yet downloaded)");
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextFontDslBoardEditText", 2);
    }

    public final void setFontType(Typeface typeface) {
        if (typeface != null && !Intrinsics.LJFF(getTypeface(), typeface)) {
            setTypeface(typeface);
        }
    }

    public final void setHorizontalAlignment(int i) throws Throwable {
        int length;
        if (MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().fixSelectionDirection || !hasFocus()) {
            return;
        }
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            C972080bP4.LIZLLL("setHorizontalAlignment return as caret is smaller than zero", "TextFontDslBoardEditText", 2);
            return;
        }
        setText(C2204961BRm.LLLI(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix7bsXd17byH/fj150fCVhkq4BePVW96vf819RiKNAGDa4XZln2VxPtcKKeroSygriAgHhnM=", null)));
        Editable editableLLLI = C2204961BRm.LLLI(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix7bsXd17byH/fj150fCVhkq4BePVW96vf819RiKNAGDa4XZln2VxPtcKKeroSygriAgHhnM=", null));
        if (editableLLLI != null) {
            length = editableLLLI.length();
        } else {
            length = 0;
        }
        setSelection(C13LZ.LJ(selectionEnd, 0, length));
    }

    public final void setLineHeight(float f) {
        if (this.LLJILJIL != f) {
            this.LLJILJIL = f;
            if (f <= 0.0f) {
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
            float f2 = fontMetricsInt.descent - fontMetricsInt.ascent;
            setLineSpacing(((f / 100.0f) * f2) - f2, 1.0f);
        }
    }

    public final void setMaxContentWidth(int i) {
        this.LLJJIJIL = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.15P3] */
    public C15P4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJIJIL = true;
        this.LLJILJIL = 120.0f;
        TextPaint textPaint = new TextPaint();
        textPaint.setStyle(Paint.Style.STROKE);
        this.LLJILJILJ = textPaint;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = C439101nJ.LIZ(200);
        this.LLJJJ = new C01F5(null, null, 0, false, 0.0f, false, 255);
        this.LLJJJIL = new TextWatcher() { // from class: X.15P3
            public int LL;
            public int LLILLJJLI;
            public int LLILLL;
            public int LLILZ = -1;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                boolean z;
                if (MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().fixSelectionDirection && editable != null) {
                    C15P4 c15p4 = this.LLILZIL;
                    int i = this.LLILZ;
                    if (i >= 0 && i < this.LLILLL) {
                        c15p4.removeTextChangedListener(c15p4.LLJJJIL);
                        int i2 = this.LLILLJJLI;
                        int i3 = this.LLILZ + i2;
                        int i4 = i2 + this.LLILLL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("deleteStart:");
                        sbLIZ.append(i3);
                        sbLIZ.append(" deleteEnd:");
                        sbLIZ.append(i4);
                        sbLIZ.append(" inputStart:");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(" keepLength:");
                        sbLIZ.append(this.LLILZ);
                        sbLIZ.append(" inputCount:");
                        sbLIZ.append(this.LLILLL);
                        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextFontDslBoardEditText", 2);
                        if (i4 <= editable.length()) {
                            editable.delete(i3, i4);
                        }
                        this.LLILZ = -1;
                        c15p4.setSelection(C13LZ.LJ(i3, 0, editable.length()));
                        c15p4.addTextChangedListener(this.LLILZIL.LLJJJIL);
                    }
                }
                this.LLILZIL.LJIILJJIL(String.valueOf(editable));
                C15P4 c15p42 = this.LLILZIL;
                if (editable != null && editable.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                c15p42.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateGravityAsTextChange contentIsNullOrEmpty:");
                sbLIZ2.append(z);
                sbLIZ2.append(" layoutDirection:");
                sbLIZ2.append(c15p42.getLayoutDirection());
                sbLIZ2.append(" textAlignment:");
                sbLIZ2.append(c15p42.getTextAlignment());
                C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "TextFontDslBoardEditText", 2);
                if (z) {
                    if (C426750GoL.LIZLLL(c15p42.getContext())) {
                        c15p42.setLayoutDirection(1);
                    } else {
                        c15p42.setLayoutDirection(0);
                    }
                    c15p42.setTextAlignment(5);
                    c15p42.setGravity(8388627);
                    return;
                }
                if (C426750GoL.LIZLLL(c15p42.getContext())) {
                    c15p42.setLayoutDirection(1);
                } else {
                    c15p42.setLayoutDirection(0);
                }
                c15p42.setTextAlignment(4);
                c15p42.setGravity(17);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.LL = this.LLILZIL.getSelectionStart();
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().fixSelectionDirection || this.LL != i) {
                    return;
                }
                this.LLILLJJLI = i;
                this.LLILLL = i3;
                this.LLILZ = -1;
                if (charSequence == null) {
                    return;
                }
                int i4 = i + i3;
                int i5 = 0;
                for (int i6 = 0; i6 < charSequence.length(); i6++) {
                    if (charSequence.charAt(i6) == '\n') {
                        i5++;
                    }
                }
                int i7 = C15P4.LLJJJJ;
                if (i5 >= C15P4.LLJJJJJIL) {
                    int length = charSequence.length();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i8 < length) {
                            if (charSequence.charAt(i8) == '\n') {
                                int i10 = C15P4.LLJJJJ;
                                if (i9 == C15P4.LLJJJJJIL - 1) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            i8++;
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, Integer.valueOf(this.LLILZIL.getMaxCharCount())));
                    if (i8 != -1 && i4 > i8) {
                        this.LLILZ = i8 - this.LLILLJJLI;
                    }
                }
                int maxCharCount = this.LLILZIL.getMaxCharCount();
                if (charSequence.length() > maxCharCount) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131851989, Integer.valueOf(this.LLILZIL.getMaxCharCount())));
                    this.LLILZ = maxCharCount - (charSequence.length() - i3);
                }
            }
        };
        setSingleLine(false);
        setLayerType(1, null);
        setVerticalScrollBarEnabled(true);
        setIncludeFontPadding(false);
        setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        super.onMeasure(i, i2);
        if (MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().notMeasureBySelf || View.MeasureSpec.getMode(i) == 1073741824 || (layout = getLayout()) == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        float fMax = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            fMax = Math.max(fMax, layout.getLineWidth(i3));
        }
        setMeasuredDimension(EditText.resolveSize(Math.max(((int) Math.ceil(fMax)) + getCompoundPaddingLeft() + getCompoundPaddingRight(), getSuggestedMinimumWidth()), i), getMeasuredHeight());
    }

    public static TextPaint LJIIIZ(C15P4 c15p4, float f, Typeface typeface) {
        TextPaint textPaint = new TextPaint(c15p4.getPaint());
        textPaint.setTextSize(f);
        textPaint.setTypeface(typeface);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(0.0f);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        return textPaint;
    }

    public static StaticLayout LJIIJ(C15P4 c15p4, C15P4 c15p42, String str, TextPaint textPaint) {
        int measuredWidth;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (c15p4.LLJJIJIIJIL) {
            measuredWidth = c15p4.LLJJIJIL;
        } else {
            measuredWidth = c15p4.getMeasuredWidth();
        }
        int paddingLeft = (measuredWidth - c15p42.getPaddingLeft()) - c15p42.getPaddingRight();
        if (paddingLeft < 1) {
            paddingLeft = 1;
        }
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, paddingLeft).setAlignment(alignment).setLineSpacing(c15p42.getLineSpacingExtra(), c15p42.getLineSpacingMultiplier()).setIncludePad(c15p42.getIncludeFontPadding());
        includePad.setBreakStrategy(c15p42.getBreakStrategy());
        includePad.setHyphenationFrequency(c15p42.getHyphenationFrequency());
        return includePad.build();
    }

    public final void LJIIL(float f, float f2, float f3, int i) {
        boolean z;
        this.LLJJ = i;
        this.LLJILLL = f;
        this.LLJJI = 0.0f;
        this.LLJJIII = 0.0f;
        if (Build.VERSION.SDK_INT >= 28) {
            if (MultiGuestTextHeaderMaxCountLimitSetting.INSTANCE.getValue().fixTextHeaderDisplayBug && f <= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            setFallbackLineSpacing(z);
        }
        float strokeWidth = getStrokeWidth();
        if (strokeWidth <= 0.0f) {
            setPadding(0, 0, 0, 0);
        } else {
            int i2 = (int) strokeWidth;
            int i3 = i2 * 2;
            setPadding(Math.max(getPaddingLeft(), i3), Math.max(getPaddingTop(), i2), Math.max(getPaddingRight(), i3), Math.max(getPaddingBottom(), i2));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJJIJIIJIL && this.LLJJJ.LJII) {
            if (i != i3 || i2 != i4) {
                LJIILJJIL(String.valueOf(C2204961BRm.LLLI(this, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix7bsXd17byH/fj150fCVhkq4BePVW96vf819RiKNAGDa4XZln2VxPtcKKeroSygriAgHhnM=", null))));
            }
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }

    public final Float LJIIJJI(C15P4 c15p4, String str, float f, float f2, float f3, int i) {
        boolean z;
        float fFloatValue;
        if (f2 > f) {
            f2 = f;
        }
        Float fValueOf = Float.valueOf(f3);
        if (fValueOf.floatValue() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        while (f >= f2) {
            if (!a0.LJJJIL(str) && LJIIJ(this, c15p4, str, LJIIIZ(c15p4, C418440Gaw.LIZIZ(Float.valueOf(f)), c15p4.getTypeface())).getLineCount() > i) {
                f -= fFloatValue;
            } else {
                return Float.valueOf(f);
            }
        }
        return null;
    }
}
