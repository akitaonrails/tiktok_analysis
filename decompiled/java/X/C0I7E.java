package X;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.SuggestionSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0I7E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0I7E extends C0I7D {
    public View.OnKeyListener LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public Function1<? super String, Unit> LLJ;
    public final C0I7H LLJI;

    private final List<C0I1K> getMentionSpans() throws Throwable {
        Object[] spans;
        List<C0I1K> listLJJLL = null;
        Editable editableLLZZ = C2204961BRm.LLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null));
        if (editableLLZZ != null && (spans = editableLLZZ.getSpans(0, editableLLZZ.length(), C0I1K.class)) != null && (listLJJLL = C13LQ.LJJLL(spans)) != null) {
            for (C0I1K c0i1k : listLJJLL) {
                c0i1k.LIZLLL = new C0I1L(editableLLZZ.getSpanStart(c0i1k), editableLLZZ.getSpanEnd(c0i1k));
            }
        }
        return listLJJLL;
    }

    @Override // X.C21410318qb, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (C2157308cl.LIZ()) {
            C786410Ut5.C3(getViewTreeObserver(), this.LLJI);
        }
    }

    public final Function0<Unit> getHeightChangeListener() {
        return this.LLIZLLLIL;
    }

    public final View.OnKeyListener getMOnKeyListener() {
        return this.LLIZ;
    }

    public final Function1<String, Unit> getOnMentionDeleted() {
        return this.LLJ;
    }

    public static boolean LJIIJ(C0I7E c0i7e) throws Throwable {
        Function1<? super String, Unit> function1;
        List<C0I1K> listLJJLL;
        int i;
        Function1<? super String, Unit> function12;
        Editable editableLLZZ;
        int selectionStart = c0i7e.getSelectionStart();
        int selectionEnd = c0i7e.getSelectionEnd();
        if (selectionStart == selectionEnd) {
            c0i7e.getClass();
            Editable editableLLZZ2 = C2204961BRm.LLZZ(c0i7e, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null));
            if (editableLLZZ2 == null) {
                return false;
            }
            if (editableLLZZ2.length() < selectionEnd) {
                Object[] spans = editableLLZZ2.getSpans(0, editableLLZZ2.length(), C0I1K.class);
                if (spans == null) {
                    return false;
                }
                listLJJLL = C13LQ.LJJLL(spans);
            } else {
                Object[] spans2 = editableLLZZ2.getSpans(0, selectionEnd, C0I1K.class);
                if (spans2 == null) {
                    return false;
                }
                listLJJLL = C13LQ.LJJLL(spans2);
            }
            if (listLJJLL == null) {
                return false;
            }
            for (C0I1K c0i1k : listLJJLL) {
                c0i1k.LIZLLL = new C0I1L(editableLLZZ2.getSpanStart(c0i1k), editableLLZZ2.getSpanEnd(c0i1k));
            }
            for (C0I1K c0i1k2 : listLJJLL) {
                C0I1L c0i1l = c0i1k2.LIZLLL;
                if (c0i1l != null && (i = c0i1l.LIZ) <= selectionStart && c0i1l.LIZIZ >= selectionEnd && selectionEnd != i) {
                    C0I1L c0i1l2 = c0i1k2.LIZLLL;
                    if (c0i1l2 != null && (editableLLZZ = C2204961BRm.LLZZ(c0i7e, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null))) != null) {
                        editableLLZZ.delete(c0i1l2.LIZ, c0i1l2.LIZIZ);
                    }
                    String str = c0i1k2.LIZIZ;
                    if (str != null && (function12 = c0i7e.LLJ) != null) {
                        function12.invoke(str);
                    }
                    return true;
                }
            }
            return false;
        }
        Iterator<C0I1K> it2 = c0i7e.LJIIIZ(selectionStart, selectionEnd).iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().LIZIZ;
            if (str2 != null && (function1 = c0i7e.LLJ) != null) {
                function1.invoke(str2);
            }
        }
        return false;
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0I7F
            public final C0I7E LIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && C0I7E.LJIIJ(this.LIZ)) {
                    View.OnKeyListener mOnKeyListener = this.LIZIZ.getMOnKeyListener();
                    if (mOnKeyListener != null) {
                        mOnKeyListener.onKey(this.LIZ, keyEvent.getKeyCode(), keyEvent);
                    }
                } else if (!super.sendKeyEvent(keyEvent)) {
                    return false;
                }
                return true;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                Function1<? super String, Unit> function1;
                if (i == 1 && i2 == 0) {
                    if (!C0I7E.LJIIJ(this.LIZ)) {
                    }
                    return true;
                }
                C0I7E c0i7e = this.LIZIZ;
                if (c0i7e.getSelectionEnd() == c0i7e.getSelectionStart()) {
                    int selectionEnd = c0i7e.getSelectionEnd();
                    Iterator<C0I1K> it2 = c0i7e.LJIIIZ(Math.max(0, selectionEnd - i), i2 + selectionEnd).iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().LIZIZ;
                        if (str != null && (function1 = c0i7e.LLJ) != null) {
                            function1.invoke(str);
                        }
                    }
                }
                if (!super.deleteSurroundingText(i, i2)) {
                    return false;
                }
                return true;
            }

            {
                this.LIZ = this;
            }
        };
    }

    public final void setHeightChangeListener(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setMOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LLIZ = onKeyListener;
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LLIZ = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public final void setOnMentionDeleted(Function1<? super String, Unit> function1) {
        this.LLJ = function1;
    }

    public C0I7E(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xv);
    }

    public final List<C0I1K> LJIIIZ(int i, int i2) throws Throwable {
        Object[] spans;
        List<C0I1K> listLJJLL;
        Editable editableLLZZ = C2204961BRm.LLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null));
        if (editableLLZZ == null || (spans = editableLLZZ.getSpans(Math.min(i, i2), Math.max(i, i2), C0I1K.class)) == null || (listLJJLL = C13LQ.LJJLL(spans)) == null) {
            return C13BV.INSTANCE;
        }
        return listLJJLL;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) throws Throwable {
        super.onSelectionChanged(i, i2);
        List<C0I1K> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            for (C0I1K c0i1k : mentionSpans) {
                C0I1L c0i1l = c0i1k.LIZLLL;
                if (c0i1l != null) {
                    int i3 = c0i1l.LIZ + 1;
                    int i4 = c0i1l.LIZIZ;
                    if ((i < i4 && i3 <= i) || (i2 < i4 && i3 <= i2)) {
                        C0I1L c0i1l2 = c0i1k.LIZLLL;
                        if (c0i1l2 != null) {
                            try {
                                if (i == i2) {
                                    int i5 = c0i1l2.LIZ;
                                    int i6 = c0i1l2.LIZIZ;
                                    if ((i - i5) - (i6 - i) >= 0) {
                                        i5 = i6;
                                    }
                                    setSelection(i5);
                                    return;
                                }
                                int i7 = c0i1l2.LIZIZ;
                                if (i2 < i7) {
                                    setSelection(i, i7);
                                }
                                int i8 = c0i1l2.LIZ;
                                if (i > i8) {
                                    setSelection(i8, i2);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (i == i2) {
            setSelection(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0I7H] */
    public C0I7E(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0I7H
            public int LL;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (this.LLILLJJLI.getHeight() != this.LL) {
                    this.LL = this.LLILLJJLI.getHeight();
                    Function0<Unit> function0 = this.LLILLJJLI.LLIZLLLIL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        };
        Context context2 = getContext();
        if (context2 != null && context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
        C786410Ut5.x3(getViewTreeObserver(), this.LLJI);
        setEditableFactory(new Editable.Factory() { // from class: X.0I7G
            @Override // android.text.Editable.Factory
            public final Editable newEditable(CharSequence charSequence) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence) { // from class: X.0I1N
                    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
                    public final /* bridge */ int length() {
                        return super.length();
                    }

                    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
                    public final /* bridge */ char charAt(int i2) {
                        return super.charAt(i2);
                    }

                    @Override // android.text.SpannableStringBuilder, android.text.Spannable
                    public final void setSpan(Object obj, int i2, int i3, int i4) {
                        if ((!(obj instanceof SuggestionSpan) || ((C0I1K[]) getSpans(i2, i3, C0I1K.class)).length == 0) && i2 >= 0 && i2 <= i3 && i3 <= super.length()) {
                            super.setSpan(obj, i2, i3, i4);
                        }
                    }
                };
                Selection.setSelection(spannableStringBuilder, 0);
                return spannableStringBuilder;
            }
        });
    }

    public final void LJIIIIZZ(String str, Integer num, String str2, String str3) throws Throwable {
        Editable editableLLZZ;
        if (C2204961BRm.LLZLLLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null)) != null) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.g);
            sbLIZ.append(str);
            sbLIZ.append(' ');
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.p2(spannableString, new C0I1K(spannableString.toString(), str2, 0), 0, spannableString.length(), 33);
            if (num != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(num.intValue(), getContext());
                if (numLIZJ != null) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), 0, spannableString.length(), 33);
                }
            }
            C786410Ut5.p2(spannableString, new C444920HcY(32, true), 0, spannableString.length(), 33);
            if (C2204961BRm.LLZLLLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null)).length() > 0) {
                if (str3.length() == 0) {
                    if (selectionStart >= 1) {
                        int i = selectionStart - 1;
                        if (Intrinsics.LJFF(C2204961BRm.LLZLLLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null)).subSequence(i, selectionStart).toString(), e3.g)) {
                            Editable editableLLZZ2 = C2204961BRm.LLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null));
                            if (editableLLZZ2 != null) {
                                editableLLZZ2.replace(i, selectionStart, spannableString);
                                return;
                            }
                            return;
                        }
                    }
                    Editable editableLLZZ3 = C2204961BRm.LLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null));
                    if (editableLLZZ3 == null) {
                        return;
                    }
                    editableLLZZ3.insert(Math.max(selectionStart, selectionEnd), spannableString);
                    return;
                }
                if (selectionStart < str3.length() + 1) {
                    return;
                }
                int i2 = selectionStart - 1;
                String string = C2204961BRm.LLZLLLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null)).subSequence(i2 - str3.length(), selectionStart).toString();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(e3.g);
                sbLIZ2.append(str3);
                if (!Intrinsics.LJFF(string, C2188811AlT.LIZIZ(sbLIZ2)) || (editableLLZZ = C2204961BRm.LLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMebi9KwVJ9hnTfeY9hZr7VmF5TkTv", null))) == null) {
                    return;
                }
                editableLLZZ.replace(i2 - str3.length(), selectionStart, spannableString);
            }
        }
    }
}
