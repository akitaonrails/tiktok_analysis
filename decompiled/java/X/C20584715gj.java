package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtBubbleHintCenteringFallbackExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20584715gj extends C0I7D {
    public final C20585015gm LLIZ;
    public Function2<? super Integer, ? super Integer, Unit> LLIZLLLIL;
    public InterfaceC1631620sYq<? super View, ? super Integer, ? super KeyEvent, Boolean> LLJ;
    public final List<Function0<Unit>> LLJI;
    public boolean LLJIJIL;
    public EnumC1257160ios LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public List<RichTextInfo> LLJJ;
    public List<StoryNoteTextExtra> LLJJI;
    public C20580415g2 LLJJIII;
    public long LLJJIJI;
    public int LLJJIJIIJIL;
    public Function0<Unit> LLJJIJIL;

    public final void LJIILIIL() {
        Editable editableS = C2204961BRm.s(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8bI3XkiSern8jebEl/cjzpOUpHQYe39yz58LcDhZIbKj85QKJea/rjk+x", null));
        setHint((editableS == null || editableS.length() == 0) ? this.LLJJIII.LIZ : "");
    }

    public final void LJIILL() {
        Editable editableS = C2204961BRm.s(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8bI3XkiSern8jebEl/cjzpOUpHQYe39yz58LcDhZIbKj85QKJea/rjk+x", null));
        if (editableS == null || editableS.length() == 0) {
            setTextAlignment(5);
            setGravity((StoryThoughtBubbleHintCenteringFallbackExp.INSTANCE.fallback() ? 16 : 48) | 8388611);
        } else {
            setTextAlignment(4);
            setGravity(8388627);
        }
        LJIIIIZZ(getWidth(), getHeight());
    }

    public final List<StoryNoteTextExtra> getMentionText() {
        List<StoryNoteTextExtra> list = this.LLJJI;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StoryNoteTextExtra storyNoteTextExtra : list) {
            Integer num = storyNoteTextExtra.type;
            if (num != null && num.intValue() == 1) {
                arrayList.add(storyNoteTextExtra);
            }
        }
        return arrayList;
    }

    public final void LJIIJ() {
        set_prompt(C20580615g4.LIZ(getContext(), false, true));
    }

    public final int getSelection() {
        return getSelectionStart();
    }

    public final EnumC1257160ios getBubbleStyle() {
        return this.LLJILJIL;
    }

    public final boolean getEnableDarkMode() {
        return this.LLJILLL;
    }

    public final boolean getEnableSmallScreen() {
        return this.LLJILJILJ;
    }

    public final Function0<Unit> getOnExceedMaxLength() {
        return this.LLJJIJIL;
    }

    public final C20580415g2 getPrompt() {
        return this.LLJJIII;
    }

    private final void set_prompt(C20580415g2 c20580415g2) {
        this.LLJJIII = c20580415g2;
        LJIILIIL();
    }

    public final void LJIIIZ(EnumC1257160ios enumC1257160ios) {
        setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getMinWidthDp()))));
        setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getMinHeightDp()))));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingHorizontalDp()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingVerticalDp()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingHorizontalDp()))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getContentPaddingVerticalDp()))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC1257160ios.getBubblePaddingBottomDp()))));
        this.LLIZ.LIZLLL(enumC1257160ios);
        LJIILJJIL(this, enumC1257160ios, false, null, null, 14);
    }

    public final void LJIIJJI(int i) {
        setSelection(C13LZ.LJ(i, 0, length()));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.LLIZ.LIZJ(canvas);
        super.onDraw(canvas);
    }

    public final void setBubbleStyle(EnumC1257160ios enumC1257160ios) {
        this.LLJILJIL = enumC1257160ios;
        LJIIIZ(enumC1257160ios);
    }

    public final void setEnableDarkMode(boolean z) {
        this.LLJILLL = z;
        int iIntValue = 2046820352;
        int iIntValue2 = -16777216;
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            setTextColor(iIntValue2);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            setHintTextColor(iIntValue);
        } else {
            setTextColor(-16777216);
            setHintTextColor(2046820352);
        }
        this.LLIZ.LJ(this.LLJILLL);
        invalidate();
    }

    public final void setEnableSmallScreen(boolean z) {
        this.LLJILJILJ = z;
        LJIILJJIL(this, null, z, null, null, 13);
    }

    public final void setEnterPressedListener(Function0<Unit> function0) {
        ((ArrayList) this.LLJI).add(function0);
    }

    public final void setMaxLength(final int i) {
        InputFilter[] inputFilterArr;
        if (i == -1) {
            inputFilterArr = new C1357330lQR[]{new C1357330lQR(this)};
        } else {
            inputFilterArr = new InputFilter[]{new C1357330lQR(this), new InputFilter.LengthFilter(i) { // from class: X.15gn
                @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                    Function0<Unit> onExceedMaxLength;
                    CharSequence charSequenceFilter = super.filter(charSequence, i2, i3, spanned, i4, i5);
                    if (charSequenceFilter != null && (onExceedMaxLength = this.LL.getOnExceedMaxLength()) != null) {
                        onExceedMaxLength.invoke();
                    }
                    return charSequenceFilter;
                }
            }};
        }
        setFilters(inputFilterArr);
    }

    public final void setMentionText(List<StoryNoteTextExtra> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (StoryNoteTextExtra storyNoteTextExtra : list) {
                Integer num = storyNoteTextExtra.type;
                if (num != null && num.intValue() == 1) {
                    arrayList.add(storyNoteTextExtra);
                }
            }
        } else {
            arrayList = null;
        }
        this.LLJJI = arrayList;
        LJIILJJIL(this, null, false, null, arrayList, 7);
    }

    public final void setNewLineReplaceHappened(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setOnExceedMaxLength(Function0<Unit> function0) {
        this.LLJJIJIL = function0;
    }

    public C20584715gj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
        this.LLIZ = new C20585015gm(context);
        this.LLJI = new ArrayList();
        setBackground(null);
        setGravity(8388627);
        setImeOptions(6);
        setFilters(new C1357330lQR[]{new C1357330lQR(this)});
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.15Qz
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 0) {
                    C20097413kK.LIZ(textView);
                    return true;
                }
                return false;
            }
        });
        LJIILL();
        addTextChangedListener(new C16HQ(this, 0));
        setOnKeyListener(new View.OnKeyListener() { // from class: X.14cO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                InterfaceC1631620sYq<? super View, ? super Integer, ? super KeyEvent, Boolean> interfaceC1631620sYq = this.LL.LLJ;
                if (interfaceC1631620sYq != null) {
                    return Intrinsics.LJFF(interfaceC1631620sYq.invoke(view, Integer.valueOf(i), keyEvent), Boolean.TRUE);
                }
                return false;
            }
        });
        EnumC1257160ios enumC1257160ios = EnumC1257160ios.NORMAL;
        this.LLJILJIL = enumC1257160ios;
        LJIIIZ(enumC1257160ios);
        this.LLJILJILJ = true;
        this.LLJILLL = true;
        setEnableDarkMode(true);
        this.LLJJIII = new C20580415g2(context.getString(2131849044), EnumC19387610t8.DEFAULT);
        this.LLJJIJI = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[PHI: r1
      0x009d: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:33:0x00f0, B:22:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(int r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20584715gj.LJIIIIZZ(int, int):void");
    }

    public final void LJIIL(String str, List<RichTextInfo> list) throws Throwable {
        String str2;
        String string;
        this.LLJJ = list;
        String str3 = "";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Editable editableS = C2204961BRm.s(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8bI3XkiSern8jebEl/cjzpOUpHQYe39yz58LcDhZIbKj85QKJea/rjk+x", null));
        if (editableS != null && (string = editableS.toString()) != null) {
            str3 = string;
        }
        if (!Intrinsics.LJFF(str3, str2)) {
            setText(str);
        } else {
            LJIILJJIL(this, null, false, list, null, 11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws Throwable {
        super.onMeasure(i, i2);
        LJIIIIZZ(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Function2<? super Integer, ? super Integer, Unit> function2 = this.LLIZLLLIL;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) throws Throwable {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        C20585015gm c20585015gm = this.LLIZ;
        c20585015gm.LJFF = i;
        c20585015gm.LJI = i2;
        EnumC1257160ios enumC1257160ios = c20585015gm.LJ;
        if (c20585015gm.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        c20585015gm.LIZ(enumC1257160ios, i, i2, z);
        c20585015gm.LIZIZ(c20585015gm.LJ, c20585015gm.LJII, i, i2);
        LJIIIIZZ(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(X.C20584715gj r12, X.EnumC1257160ios r13, boolean r14, java.util.List r15, java.util.List r16, int r17) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20584715gj.LJIILJJIL(X.15gj, X.0ios, boolean, java.util.List, java.util.List, int):void");
    }
}
