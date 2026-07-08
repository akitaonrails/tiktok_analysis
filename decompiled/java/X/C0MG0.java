package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MG0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0MG0<T, S> extends C0I7D {
    public final List<C565450MFr<T>> LLIZ;
    public final List<Character> LLIZLLLIL;
    public String LLJ;
    public final int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final List<Function1<Integer, Unit>> LLJILJILJ;
    public final List<InputFilter> LLJILLL;
    public int LLJJ;

    private final Class<S> getSpanClass() {
        if (LJIIIZ(null) != null) {
            return C0M37.class;
        }
        throw new IllegalStateException("createMentionSpan returned null");
    }

    public abstract C0M37 LJIIIZ(MentionDataItem mentionDataItem);

    public abstract String LJIIL(S s);

    private final String getMentionString() throws Throwable {
        Editable editableLLLZLL = C2204961BRm.LLLZLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRKEVFKeG0CzByF4hNUcrG8Yb1/hyPHpE+Icw==", null));
        if (editableLLLZLL == null) {
            return null;
        }
        int iLJ = C13LZ.LJ(getSelectionStart(), 0, editableLLLZLL.length());
        String string = editableLLLZLL.toString();
        int i = this.LLJI;
        int iMax = i > 0 ? Math.max(0, iLJ - i) : 0;
        int i2 = iLJ - 1;
        if (iMax <= i2) {
            int i3 = i2;
            while (editableLLLZLL.getSpans(i3, i3 + 1, C0MG4.class).length == 0) {
                char cCharAt = string.charAt(i3);
                if (cCharAt == '@') {
                    if (i3 != -1) {
                        return i3 == i2 ? "" : a0.LJJLIIIJLLLLLLLZ(string, C13LZ.LJIILJJIL(i3 + 1, iLJ));
                    }
                } else if (!this.LLIZLLLIL.contains(Character.valueOf(cCharAt)) && i3 != iMax) {
                    i3--;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ() {
        Editable editableLLLZLL = C2204961BRm.LLLZLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRKEVFKeG0CzByF4hNUcrG8Yb1/hyPHpE+Icw==", null));
        if (editableLLLZLL == null) {
            return;
        }
        try {
            for (Object obj : editableLLLZLL.getSpans(0, editableLLLZLL.length(), getSpanClass())) {
                String string = editableLLLZLL.subSequence(editableLLLZLL.getSpanStart(obj), editableLLLZLL.getSpanEnd(obj)).toString();
                String strLJIIL = LJIIL(obj);
                if (strLJIIL != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(strLJIIL);
                    if (!Intrinsics.LJFF(string, C2188811AlT.LIZIZ(sbLIZ))) {
                        editableLLLZLL.removeSpan(obj);
                    }
                }
            }
            for (C0MG4 c0mg4 : (C0MG4[]) editableLLLZLL.getSpans(0, editableLLLZLL.length(), C0MG4.class)) {
                int spanStart = editableLLLZLL.getSpanStart(c0mg4);
                int spanEnd = editableLLLZLL.getSpanEnd(c0mg4);
                if (spanStart < 0 || spanEnd > editableLLLZLL.length() || spanStart >= spanEnd) {
                    editableLLLZLL.removeSpan(c0mg4);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIILIIL() {
        Iterator<Function1<Integer, Unit>> it2 = this.LLJILJILJ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Integer.valueOf(this.LLJJ));
        }
    }

    public final void LJIILL() {
        String strValueOf = this.LLJILJIL ? String.valueOf(C2204961BRm.LLLZLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRKEVFKeG0CzByF4hNUcrG8Yb1/hyPHpE+Icw==", null))) : getMentionString();
        this.LLJ = strValueOf == null ? "" : strValueOf;
        List<C565450MFr<T>> list = this.LLIZ;
        if (list != null) {
            Iterator<C565450MFr<T>> it2 = list.iterator();
            while (it2.hasNext()) {
                Function1<String, Unit> function1 = it2.next().LIZIZ;
                if (function1 != null) {
                    function1.invoke(strValueOf);
                }
            }
        }
    }

    public final boolean getEnableWholeSpanDeletion() {
        return this.LLJIJIL;
    }

    public final boolean getFullSearchMode() {
        return this.LLJILJIL;
    }

    public final int getMaxLength() {
        return this.LLJJ;
    }

    public final List<Character> getMentionBlockList() {
        return this.LLIZLLLIL;
    }

    public final int getSearchLimitLength() {
        return this.LLJI;
    }

    public final Pair<Integer, Integer> LJIIJ(int i) throws Throwable {
        Editable editableLLLZLL = C2204961BRm.LLLZLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRKEVFKeG0CzByF4hNUcrG8Yb1/hyPHpE+Icw==", null));
        if (editableLLLZLL == null) {
            return null;
        }
        for (C0MG4 c0mg4 : (C0MG4[]) editableLLLZLL.getSpans(0, editableLLLZLL.length(), C0MG4.class)) {
            int spanStart = editableLLLZLL.getSpanStart(c0mg4);
            int spanEnd = editableLLLZLL.getSpanEnd(c0mg4);
            if (spanEnd == i && spanStart >= 0 && spanEnd <= editableLLLZLL.length() && spanStart < spanEnd) {
                return new Pair<>(Integer.valueOf(spanStart), Integer.valueOf(spanEnd));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Integer, Integer> LJIIJJI(int i) throws Throwable {
        C089E c089e;
        Editable editableLLLZLL = C2204961BRm.LLLZLL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRKEVFKeG0CzByF4hNUcrG8Yb1/hyPHpE+Icw==", null));
        if (editableLLLZLL == null) {
            return null;
        }
        try {
            c089e = new C089E(editableLLLZLL.getSpans(0, editableLLLZLL.length(), getSpanClass()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        while (c089e.hasNext()) {
            Object next = c089e.next();
            int spanStart = editableLLLZLL.getSpanStart(next);
            int spanEnd = editableLLLZLL.getSpanEnd(next);
            if (spanEnd == i) {
                String string = editableLLLZLL.subSequence(spanStart, spanEnd).toString();
                String strLJIIL = LJIIL(next);
                if (strLJIIL != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(strLJIIL);
                    if (Intrinsics.LJFF(string, C2188811AlT.LIZIZ(sbLIZ))) {
                        return new Pair<>(Integer.valueOf(spanStart), Integer.valueOf(spanEnd));
                    }
                    return null;
                }
                continue;
            }
        }
        return null;
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null) {
            return new InputConnectionWrapper(inputConnectionOnCreateInputConnection) { // from class: X.0MG2
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean sendKeyEvent(KeyEvent keyEvent) throws Throwable {
                    if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && this.LIZ.getSelectionStart() == this.LIZ.getSelectionEnd()) {
                        int selectionStart = this.LIZ.getSelectionStart();
                        Pair<Integer, Integer> pairLJIIJJI = this.LIZ.LJIIJJI(selectionStart);
                        if (pairLJIIJJI != null) {
                            int iIntValue = pairLJIIJJI.getFirst().intValue();
                            pairLJIIJJI.getSecond().intValue();
                            return super.deleteSurroundingText(selectionStart - iIntValue, 0);
                        }
                        Pair<Integer, Integer> pairLJIIJ = this.LIZ.LJIIJ(selectionStart);
                        if (pairLJIIJ != null) {
                            return super.deleteSurroundingText(selectionStart - pairLJIIJ.getFirst().intValue(), 0);
                        }
                    }
                    return super.sendKeyEvent(keyEvent);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean commitText(java.lang.CharSequence r4, int r5) {
                    /*
                        r3 = this;
                        if (r4 == 0) goto L2f
                        r0 = 64
                        boolean r1 = kotlin.text.a0.LJJIJ(r4, r0)
                        r0 = 1
                        if (r1 != r0) goto L2f
                    Lb:
                        boolean r2 = super.commitText(r4, r5)
                        if (r0 == 0) goto L31
                        X.0MG0<T, S> r0 = r3.LIZ
                        java.util.List<X.0MFr<T>> r0 = r0.LLIZ
                        java.util.ArrayList r0 = (java.util.ArrayList) r0
                        java.util.Iterator r1 = r0.iterator()
                    L1b:
                        boolean r0 = r1.hasNext()
                        if (r0 == 0) goto L31
                        java.lang.Object r0 = r1.next()
                        X.0MFr r0 = (X.C565450MFr) r0
                        kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.LIZJ
                        if (r0 == 0) goto L1b
                        r0.invoke()
                        goto L1b
                    L2f:
                        r0 = 0
                        goto Lb
                    L31:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MG2.commitText(java.lang.CharSequence, int):boolean");
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean deleteSurroundingText(int i, int i2) throws Throwable {
                    if (this.LIZ.getEnableWholeSpanDeletion() && i > 0) {
                        int selectionStart = this.LIZ.getSelectionStart();
                        Pair<Integer, Integer> pairLJIIJJI = this.LIZ.LJIIJJI(selectionStart);
                        if (pairLJIIJJI != null) {
                            int iIntValue = pairLJIIJJI.getFirst().intValue();
                            pairLJIIJJI.getSecond().intValue();
                            return super.deleteSurroundingText(selectionStart - iIntValue, i2);
                        }
                        Pair<Integer, Integer> pairLJIIJ = this.LIZ.LJIIJ(selectionStart);
                        if (pairLJIIJ != null) {
                            return super.deleteSurroundingText(selectionStart - pairLJIIJ.getFirst().intValue(), i2);
                        }
                    }
                    return super.deleteSurroundingText(i, i2);
                }
            };
        }
        return null;
    }

    public final void setEnableWholeSpanDeletion(boolean z) {
        this.LLJIJIL = z;
    }

    @Override // android.widget.TextView
    @InterfaceC1294060jmO
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(inputFilterArr);
    }

    public final void setFullSearchMode(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setMaxLength(int i) {
        this.LLJJ = i;
    }

    public C0MG0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xv);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MG0.LJIILJJIL(com.ss.android.ugc.aweme.creative.model.common.MentionDataItem, boolean):void");
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        LJIILL();
        List<C565450MFr<T>> list = this.LLIZ;
        if (list != null) {
            Iterator<C565450MFr<T>> it2 = list.iterator();
            while (it2.hasNext()) {
                Function2<Integer, Integer, Unit> function2 = it2.next().LIZLLL;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        }
    }

    public C0MG0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = C1697810uHb.LJIIJJI(' ', '\n');
        this.LLJ = "";
        this.LLJI = -1;
        this.LLJILJILJ = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.LLJILLL = arrayList;
        this.LLJJ = 500;
        addTextChangedListener(new C581030Mqb(this, 4));
        if (C426750GoL.LIZLLL(context)) {
            setTextAlignment(5);
        }
        arrayList.add(new InputFilter(this) { // from class: X.0MG1
            public final /* synthetic */ C0MG0<T, S> LL;

            {
                this.LL = this;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                boolean z;
                int maxLength = this.LL.getMaxLength() - (spanned.length() - (i5 - i4));
                if (charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return null;
                }
                if (maxLength <= 0) {
                    this.LL.LJIILIIL();
                    return "";
                }
                if (maxLength >= i3 - i2) {
                    return null;
                }
                this.LL.LJIILIIL();
                return charSequence.subSequence(i2, maxLength + i2);
            }
        });
        setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }
}
