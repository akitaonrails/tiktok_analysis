package X;

import Y.AComparatorS513S0100000_14;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.VideoRelatedInfo;
import com.ss.android.ugc.aweme.lexical.platform.span.AiCopyWritingSpan;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;
import com.ss.android.ugc.aweme.mention.service.MentionLimitServiceImpl;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText$MentionSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0ZIH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0ZIH extends C0ZIJ implements IAVMentionEditText {
    public RunnableC859070Xmz LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public C0ZI7 LLJIJIL;
    public List<C0ZI7> LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public VideoPublishEditModel LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public InterfaceC857050Xjj LLJL;
    public final List<TextWatcher> LLJLIL;
    public final Set<String> LLJLILLLLZIIL;
    public View.OnKeyListener LLJLL;

    public final void LJIILL() {
        this.LLJI = false;
        List<C0ZI7> list = this.LLJILJIL;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        Editable editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
        if (editableQ == null || TextUtils.isEmpty(editableQ.toString())) {
            return;
        }
        for (MentionSpan mentionSpan : LJIJ(editableQ)) {
            int spanStart = editableQ.getSpanStart(mentionSpan);
            int spanEnd = editableQ.getSpanEnd(mentionSpan);
            C0ZI7 c0zi7 = new C0ZI7(spanStart, spanEnd);
            if (TextUtils.equals(editableQ.subSequence(spanStart, spanEnd).toString(), mentionSpan.mText)) {
                int i = mentionSpan.mType;
                if (i == 0 || i == 5) {
                    ((ArrayList) this.LLJILJIL).add(c0zi7);
                }
                LJJI(mentionSpan, c0zi7);
            } else {
                editableQ.removeSpan(mentionSpan);
            }
        }
        for (AiCopyWritingSpan aiCopyWritingSpan : LJIILLIIL(editableQ)) {
            int spanStart2 = editableQ.getSpanStart(aiCopyWritingSpan);
            int spanEnd2 = editableQ.getSpanEnd(aiCopyWritingSpan);
            C0ZI7 c0zi72 = new C0ZI7(spanStart2, spanEnd2);
            c0zi72.LIZ = false;
            if (TextUtils.equals(editableQ.subSequence(spanStart2, spanEnd2).toString(), aiCopyWritingSpan.mText)) {
                ((ArrayList) this.LLJILJIL).add(c0zi72);
                LJJ(aiCopyWritingSpan, c0zi72);
            } else {
                editableQ.removeSpan(aiCopyWritingSpan);
            }
        }
    }

    public void LJJ(AiCopyWritingSpan aiCopyWritingSpan, C0ZI7 c0zi7) {
    }

    public void LJJI(MentionSpan mentionSpan, C0ZI7 c0zi7) {
    }

    public void addHashTag(String str) {
    }

    public void addNormalHashTag(String str) {
    }

    public String getAdTag() {
        return "";
    }

    public List<String> getMentionVideoIdList() {
        MentionSpan[] mentionSpanArrLJIJ = LJIJ(null);
        ArrayList arrayList = new ArrayList();
        if (mentionSpanArrLJIJ != null) {
            for (MentionSpan mentionSpan : mentionSpanArrLJIJ) {
                if (mentionSpan.mType == 5) {
                    arrayList.add(mentionSpan.awemeId);
                }
            }
        }
        return arrayList;
    }

    public void removeHashTag() {
    }

    public void removeNormalHashTag(String str) {
    }

    public final void LJIIJJI() {
        Iterator it2 = ((ArrayList) this.LLJLIL).iterator();
        while (it2.hasNext()) {
            super.addTextChangedListener((TextWatcher) it2.next());
        }
    }

    public final void LJIL() {
        this.LLJILJIL = new ArrayList(5);
        this.LLIZLLLIL = -65536;
        addTextChangedListener(new C856950XjZ() { // from class: X.0Xji
            {
                super("MentionEditText");
            }

            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
            }

            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                super.beforeTextChanged(charSequence, i, i2, i3);
            }

            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                super.onTextChanged(charSequence, i, i2, i3);
                if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i) && this.LLILLJJLI.LLJL != null) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_method", "input");
                    C0ZIH c0zih = this.LLILLJJLI;
                    C580270MpN.LIZJ(c0zih.LLJJIJIL, c0lab, c0zih.LLJJJIL);
                    C20684815ws.LJIILLIIL("click_video_at", c0lab.LIZ);
                    this.LLILLJJLI.LLJL.LIZ();
                }
            }
        });
        Context context = getContext();
        if (context == null || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return;
        }
        setTextAlignment(5);
        setGravity(getGravity() | 8388611);
    }

    public final void LJJIFFI() {
        Iterator<TextWatcher> it2 = this.LLJLIL.iterator();
        while (it2.hasNext()) {
            super.removeTextChangedListener(it2.next());
        }
    }

    public String getNoAdTagText() {
        return C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null)) != null ? C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null)).toString() : "";
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public Editable getText() {
        Editable text;
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/PostPageCaptionEditor", "getText", this, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/PostPageCaptionEditor", "getText", null, objArr, this, c0wzw, false);
            text = (Editable) c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C21410318qb c21410318qb = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C21410318qb) obj;
            text = super.getText();
            c0wst.LIZ(998, "com/ss/android/ugc/aweme/shortvideo/view/PostPageCaptionEditor", "getText", text, objArr, c21410318qb, c0wzw, true);
        }
        if (((Boolean) C263230ATh.LIZ.getValue()).booleanValue()) {
            C0CHQ.LIZ().LJIIJJI();
        }
        return text;
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() throws Throwable {
        Editable editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
        if (editableQ == null || TextUtils.isEmpty(editableQ.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionSpan mentionSpan : LJIJ(null)) {
            if (mentionSpan.mType == 0) {
                mentionSpan.mStruct.setStart(editableQ.getSpanStart(mentionSpan));
                mentionSpan.mStruct.setEnd(editableQ.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.mStruct);
            }
        }
        return arrayList;
    }

    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MentionEditText$MentionSavedState mentionEditText$MentionSavedState = new MentionEditText$MentionSavedState(super.onSaveInstanceState());
        mentionEditText$MentionSavedState.LL = getNoAdTagText();
        mentionEditText$MentionSavedState.LLILLJJLI = Math.max(getSelectionEnd(), 0);
        mentionEditText$MentionSavedState.LLILLL = getCompatTextExtraStructList();
        return mentionEditText$MentionSavedState;
    }

    public int getPasteEnd() {
        return this.LLJJIII;
    }

    public int getPasteStart() {
        return this.LLJJI;
    }

    public String getPasteUrl() {
        return this.LLJJIJIIJIL;
    }

    public int getUrlEnd() {
        return this.LLJJ;
    }

    public int getUrlStart() {
        return this.LLJILLL;
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
    }

    public C0ZIH(Context context) {
        super(context);
        this.LLJJI = -1;
        this.LLJJIII = -1;
        this.LLJJJIL = "";
        this.LLJLIL = new ArrayList();
        this.LLJLILLLLZIIL = new HashSet();
        LJIL();
    }

    public final boolean LJIIL(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        setHasUrlTransforming(true);
        int selectionStart = getSelectionStart();
        Editable editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
        if (editableQ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" ");
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.p2(spannableString, new C0GXP(getContext(), this), spannableString.length() - 1, spannableString.length(), 33);
        if (TextUtils.isEmpty(editableQ)) {
            editableQ.insert(0, spannableString);
            setUrlStart(0);
            setUrlEnd(spannableString.length() + 1);
            editableQ.append((CharSequence) " ");
            return true;
        }
        int length = editableQ.length();
        if (selectionStart <= length && selectionStart >= 0) {
            int iMin = Math.min(length, Math.max(0, selectionStart));
            editableQ.insert(iMin, spannableString);
            setUrlStart(iMin);
            setUrlEnd(spannableString.length() + iMin + 1);
            editableQ.insert(Math.min(iMin + spannableString.length(), editableQ.length()), " ");
        }
        return true;
    }

    public final AiCopyWritingSpan[] LJIILLIIL(Editable editable) {
        if (editable != null && !TextUtils.isEmpty(editable.toString())) {
            AiCopyWritingSpan[] aiCopyWritingSpanArr = (AiCopyWritingSpan[]) editable.getSpans(0, LJIJI(editable).length(), AiCopyWritingSpan.class);
            Arrays.sort(aiCopyWritingSpanArr, new AComparatorS513S0100000_14(editable, 11));
            return aiCopyWritingSpanArr;
        }
        return null;
    }

    public final MentionSpan[] LJIJ(Editable editable) {
        if ((editable == null && (editable = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null))) == null) || TextUtils.isEmpty(editable.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) editable.getSpans(0, LJIJI(editable).length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new AComparatorS513S0100000_14(editable, 12));
        return mentionSpanArr;
    }

    public String LJIJI(Editable editable) {
        if (editable != null) {
            return editable.toString();
        }
        return "";
    }

    public final CharSequence LJJII(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class)) {
            spannableStringBuilder.removeSpan(obj);
        }
        return spannableStringBuilder;
    }

    @Override // X.C0ZIJ, android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLJLIL;
        if (list != null && textWatcher != null) {
            list.add(textWatcher);
        }
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0ZII
            public final C0ZIH LIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean finishComposingText() {
                return super.finishComposingText();
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                int i;
                C0ZIH c0zih = this.LIZIZ;
                View.OnKeyListener onKeyListener = c0zih.LLJLL;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(c0zih, keyEvent.getKeyCode(), keyEvent);
                }
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    int selectionStart = this.LIZ.getSelectionStart();
                    C0ZI7 c0zi7LJIJJ = this.LIZIZ.LJIJJ(selectionStart, this.LIZ.getSelectionEnd());
                    if (c0zi7LJIJJ == null) {
                        this.LIZIZ.LLJI = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    C0ZIH c0zih2 = this.LIZIZ;
                    if (!c0zih2.LLJI && selectionStart != (i = c0zi7LJIJJ.LIZIZ)) {
                        c0zih2.LLJI = true;
                        c0zih2.LLJIJIL = c0zi7LJIJJ;
                        if (Build.VERSION.SDK_INT >= 25) {
                            setSelection(i, c0zi7LJIJJ.LIZJ);
                            return true;
                        }
                        setSelection(c0zi7LJIJJ.LIZJ, i);
                        return true;
                    }
                    c0zih2.LLJI = false;
                    return super.sendKeyEvent(keyEvent);
                }
                return super.sendKeyEvent(keyEvent);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                try {
                    CharSequence charSequenceLJJII = this.LIZIZ.LJJII(charSequence);
                    if (this.LIZIZ.LLJILJILJ) {
                        return false;
                    }
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceLJJII;
                    if (C0ZIO.LJ(spannableStringBuilder.toString())) {
                        if (this.LIZIZ.LJIIL(spannableStringBuilder.toString())) {
                            C0ZIO c0zio = C0ZIO.LIZ;
                            String string = spannableStringBuilder.toString();
                            C0ZIH c0zih = this.LIZIZ;
                            int i2 = c0zih.LLJILLL;
                            int i3 = c0zih.LLJJ;
                            c0zio.getClass();
                            C0ZIO.LIZLLL(i2, i3, c0zih, string);
                        }
                        return true;
                    }
                    return super.commitText(charSequenceLJJII, i);
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) throws Throwable {
                Pair pair;
                boolean z;
                int i3 = i;
                int i4 = i2;
                if (i3 >= 0) {
                    if (i3 <= 2 && i4 == 0) {
                        Editable editableQ = C2204961BRm.q(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
                        if (editableQ != null && editableQ.length() > 0) {
                            C0ZIH c0zih = this.LIZIZ;
                            c0zih.getClass();
                            int length = editableQ.length();
                            int iMax = Math.max(c0zih.getSelectionStart() - i3, 0);
                            int iMin = Math.min(c0zih.getSelectionEnd(), length);
                            CharacterStyle[] characterStyleArr = (CharacterStyle[]) editableQ.getSpans(0, length, CharacterStyle.class);
                            int i5 = iMin;
                            int i6 = iMax;
                            boolean z2 = false;
                            boolean z3 = false;
                            for (CharacterStyle characterStyle : characterStyleArr) {
                                if ((!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).mType != 1) && !(characterStyle instanceof StyleSpan)) {
                                    int spanStart = editableQ.getSpanStart(characterStyle);
                                    int spanEnd = editableQ.getSpanEnd(characterStyle);
                                    if (!z2 && spanStart <= iMax && spanEnd > iMax) {
                                        i6 = spanStart;
                                        z2 = true;
                                    }
                                    if (!z3 && spanStart < iMin && spanEnd >= iMin) {
                                        i5 = spanEnd;
                                        z3 = true;
                                    }
                                    if (z2 && z3) {
                                        break;
                                    }
                                }
                            }
                            if (i6 > i5) {
                                int i7 = i5;
                                i5 = i6;
                                i6 = i7;
                            }
                            C0ZI7 c0zi7LJIJJ = this.LIZIZ.LJIJJ(i6, i5);
                            if (c0zi7LJIJJ != null) {
                                Iterator it2 = new ArrayList(Arrays.asList(MentionSpan.class, AiCopyWritingSpan.class)).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) editableQ.getSpans(c0zi7LJIJJ.LIZIZ, c0zi7LJIJJ.LIZJ, (Class) it2.next());
                                        if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                                            Boolean bool = Boolean.TRUE;
                                            if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            pair = new Pair(bool, Boolean.valueOf(z));
                                        }
                                    } else {
                                        Boolean bool2 = Boolean.FALSE;
                                        pair = new Pair(bool2, bool2);
                                        break;
                                    }
                                }
                                if (((Boolean) pair.first).booleanValue()) {
                                    return ((Boolean) pair.second).booleanValue();
                                }
                            }
                        }
                        return super.deleteSurroundingText(i3, i4);
                    }
                } else {
                    int i8 = -i4;
                    i4 = -i3;
                    i3 = i8;
                }
                return super.deleteSurroundingText(i3, i4);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean setComposingText(CharSequence charSequence, int i) {
                C0ZIH c0zih = this.LIZ;
                if (c0zih != null && c0zih.LLJILJILJ) {
                    return false;
                }
                return super.setComposingText(this.LIZIZ.LJJII(charSequence), i);
            }

            {
                this.LIZ = this;
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionEditText$MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionEditText$MentionSavedState mentionEditText$MentionSavedState = (MentionEditText$MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionEditText$MentionSavedState.getSuperState());
        setText(mentionEditText$MentionSavedState.LL);
        int iMin = Math.min(mentionEditText$MentionSavedState.LLILLJJLI, C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null)).length());
        if (iMin >= 0) {
            setSelection(iMin);
        }
        setTextExtraList(mentionEditText$MentionSavedState.LLILLL);
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) throws Throwable {
        InputFilter[] inputFilterArr;
        if (i == 16908322) {
            C856190XiL c856190XiL = C856190XiL.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
            c856190XiL.getClass();
            if (videoPublishEditModel != null) {
                C20684815ws.LJIILLIIL("post_page_paste_text", C856190XiL.LIZ(videoPublishEditModel).LIZ);
            }
            if (this.LLJILJILJ) {
                return false;
            }
            setAddByPaste(true);
            Editable editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
            if (editableQ == null) {
                return false;
            }
            InputFilter[] filters = getFilters();
            if (filters == null) {
                inputFilterArr = new InputFilter[]{new InputFilter() { // from class: X.0ZIL
                    @Override // android.text.InputFilter
                    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                        return this.LL.LJJII(charSequence.subSequence(i2, i3));
                    }
                }};
            } else {
                inputFilterArr = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[filters.length] = new InputFilter() { // from class: X.0ZIL
                    @Override // android.text.InputFilter
                    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                        return this.LL.LJJII(charSequence.subSequence(i2, i3));
                    }
                };
            }
            setFilters(inputFilterArr);
            boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i);
            setFilters(filters);
            if (getPasteUrl() != null && getPasteStart() >= 0) {
                setHasUrlTransforming(true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(getPasteUrl());
                sbLIZ.append(" ");
                SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.p2(spannableString, new C0GXP(getContext(), this), spannableString.length() - 1, spannableString.length(), 33);
                editableQ.replace(getPasteStart(), getPasteEnd(), spannableString);
                setUrlStart(getPasteStart());
                setUrlEnd(getUrlStart() + spannableString.length() + 1);
                editableQ.insert(Math.min(getPasteStart() + spannableString.length(), editableQ.length()), " ");
                C0ZIO c0zio = C0ZIO.LIZ;
                String pasteUrl = getPasteUrl();
                int i2 = this.LLJILLL;
                int i3 = this.LLJJ;
                c0zio.getClass();
                C0ZIO.LIZLLL(i2, i3, this, pasteUrl);
            }
            setPasteUrl(null);
            setPasteStart(-1);
            setPasteEnd(-1);
            return zOnTextContextMenuItem;
        }
        if (i == 16908321) {
            C856190XiL c856190XiL2 = C856190XiL.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LLJJIJIL;
            c856190XiL2.getClass();
            if (videoPublishEditModel2 != null) {
                C20684815ws.LJIILLIIL("post_page_copy_text", C856190XiL.LIZ(videoPublishEditModel2).LIZ);
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void removeMentionUser(String str) {
        Editable editableQ;
        MentionSpan[] mentionSpanArrLJIJ;
        if (TextUtils.isEmpty(str) || (editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null))) == null || (mentionSpanArrLJIJ = LJIJ(editableQ)) == null) {
            return;
        }
        for (MentionSpan mentionSpan : mentionSpanArrLJIJ) {
            if (mentionSpan != null && mentionSpan.mType == 0 && str.equals(mentionSpan.mId)) {
                int spanStart = editableQ.getSpanStart(mentionSpan);
                int spanEnd = editableQ.getSpanEnd(mentionSpan);
                editableQ.removeSpan(mentionSpan);
                editableQ.delete(spanStart, spanEnd);
                return;
            }
        }
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLJLIL;
        if (list != null && textWatcher != null) {
            list.remove(textWatcher);
        }
    }

    public void setAddByPaste(boolean z) {
        this.LLJJIJI = z;
    }

    public void setAddChainSuccess(boolean z) {
        this.LLJJJJ = z;
    }

    public void setAddVideoChain(boolean z) {
        this.LLJJJ = z;
    }

    public void setEnterFrom(String str) {
        this.LLJJJIL = str;
    }

    public void setHasUrlTransforming(boolean z) {
        this.LLJILJILJ = z;
    }

    public void setMentionTextColor(int i) {
        this.LLIZLLLIL = i;
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LLJLL = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void setOnMentionInputListener(InterfaceC857050Xjj interfaceC857050Xjj) {
        this.LLJL = interfaceC857050Xjj;
    }

    public void setPasteEnd(int i) {
        this.LLJJIII = i;
    }

    public void setPasteStart(int i) {
        this.LLJJI = i;
    }

    public void setPasteUrl(String str) {
        this.LLJJIJIIJIL = str;
    }

    public void setPlaceHolderColor(int i) {
        this.LLJ = i;
    }

    public void setRepasteUrl(boolean z) {
        this.LLJJJJJIL = z;
    }

    public void setRepasteUrlSuccess(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public void setShouldDisableTrim(boolean z) {
        this.LLJJL = z;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable editableQ;
        this.LLJI = false;
        List<C0ZI7> list2 = this.LLJILJIL;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        if (list != null && !list.isEmpty() && (editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null))) != null && !TextUtils.isEmpty(editableQ.toString())) {
            int length = editableQ.length();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 5) {
                    if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() >= 0) {
                        int i = this.LLIZLLLIL;
                        MentionSpan mentionSpan = new MentionSpan(editableQ.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), i, textExtraStruct.getCommentId(), textExtraStruct.getUserId(), textExtraStruct.getAtUserType(), textExtraStruct.getType(), textExtraStruct.getSecUid());
                        if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                            String awemeId = textExtraStruct.getAwemeId();
                            mentionSpan.awemeId = awemeId;
                            mentionSpan.mStruct.setAwemeId(awemeId);
                        }
                        mentionSpan.LIZ(textExtraStruct.getSubtype());
                        editableQ.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        ((ArrayList) this.LLJILJIL).add(new C0ZI7(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                    }
                }
            }
        }
    }

    public void setTransformingUrlRemoved(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public void setUrlEnd(int i) {
        this.LLJJ = i;
    }

    public void setUrlStart(int i) {
        this.LLJILLL = i;
    }

    public void setVideoPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LLJJIJIL = videoPublishEditModel;
    }

    public C0ZIH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJI = -1;
        this.LLJJIII = -1;
        this.LLJJJIL = "";
        this.LLJLIL = new ArrayList();
        this.LLJLILLLLZIIL = new HashSet();
        LJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(X.C0ZIK r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZIH.LJIILIIL(X.0ZIK, java.lang.String):boolean");
    }

    public final C0ZI7 LJIJJ(int i, int i2) {
        List<C0ZI7> list = this.LLJILJIL;
        if (list == null) {
            return null;
        }
        for (C0ZI7 c0zi7 : (ArrayList) list) {
            if (c0zi7.LIZ(i, i2)) {
                return c0zi7;
            }
        }
        return null;
    }

    @Override // X.C0ZIJ, android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        String adTag = getAdTag();
        if (!TextUtils.isEmpty(adTag)) {
            int length = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null)).length() - adTag.length();
            if (i > length) {
                setSelection(length);
            } else if (i2 > length) {
                setSelection(i, length);
            }
        }
        C0ZI7 c0zi7 = this.LLJIJIL;
        if (c0zi7 != null) {
            int i3 = c0zi7.LIZIZ;
            if (i3 != i || c0zi7.LIZJ != i2) {
                if (i3 == i2 && c0zi7.LIZJ == i) {
                    return;
                }
            } else {
                return;
            }
        }
        C0ZI7 c0zi7LJIJJ = LJIJJ(i, i2);
        if (c0zi7LJIJJ != null && c0zi7LJIJJ.LIZJ == i2) {
            this.LLJI = false;
        }
        List<C0ZI7> list = this.LLJILJIL;
        if (list != null) {
            for (C0ZI7 c0zi72 : (ArrayList) list) {
                int i4 = c0zi72.LIZIZ;
                if ((i > i4 && i < c0zi72.LIZJ) || (i2 > i4 && i2 < c0zi72.LIZJ)) {
                    try {
                        if (i == i2) {
                            int i5 = c0zi72.LIZIZ;
                            int i6 = c0zi72.LIZJ;
                            if ((i - i5) - (i6 - i) >= 0) {
                                i5 = i6;
                            }
                            setSelection(i5);
                            return;
                        }
                        int i7 = c0zi72.LIZJ;
                        if (i2 < i7) {
                            setSelection(i, i7);
                        }
                        int i8 = c0zi72.LIZIZ;
                        if (i > i8) {
                            setSelection(i8, i2);
                            return;
                        }
                        return;
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Xmz] */
    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLIZ == null) {
            this.LLIZ = new Runnable(this) { // from class: X.0Xmz
                public final WeakReference<C0ZIH> LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MentionEditText$SetSelectionRunnable@9b5a.run");
                    try {
                        C0ZIH c0zih = this.LL.get();
                        if (c0zih != null) {
                            c0zih.setSelection(C2204961BRm.q(c0zih, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null)).length());
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MentionEditText$SetSelectionRunnable@9b5a.run");
                }

                {
                    this.LL = new WeakReference<>(this);
                }
            };
        }
        if (C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null)).length() > 0) {
            HandlerHook.viewPost(this, this.LLIZ);
        }
    }

    public final boolean LJIIIZ(String str, String str2, String str3, boolean z) {
        boolean zLJIIIIZZ = LJIIIIZZ(0, str, str2, str3, false, z);
        if (zLJIIIIZZ) {
            C857150Xjt c857150Xjt = C857150Xjt.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
            String str4 = this.LLJJJIL;
            c857150Xjt.getClass();
            C857150Xjt.LIZJ(videoPublishEditModel, str2, str4);
        }
        return zLJIIIIZZ;
    }

    public final boolean LJIIJ(int i, String str, String str2, String str3) {
        boolean zLJIIIIZZ = LJIIIIZZ(i, str, str2, str3, true, false);
        if (zLJIIIIZZ) {
            C857150Xjt c857150Xjt = C857150Xjt.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
            String str4 = this.LLJJJIL;
            c857150Xjt.getClass();
            C857150Xjt.LIZJ(videoPublishEditModel, str2, str4);
        }
        return zLJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public final void addMentionUser(int i, String str, String str2, String str3) {
        LJIIJ(i, str, str2, str3);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        LJIILL();
    }

    public final void LJIILJJIL(String str, boolean z, int i, VideoRelatedInfo videoRelatedInfo, String str2) throws Throwable {
        int i2;
        if (this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJLIIIJLLLLLLLZ = false;
            return;
        }
        if (videoRelatedInfo == null) {
            setRepasteUrl(true);
            C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null)).insert(i, str2);
            if (this.LLJJJJLIIL && !TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                if ("timeout".equals(str)) {
                    creativeToastBuilder.messageRes(2131849613);
                } else {
                    creativeToastBuilder.message(str);
                }
                C1390380mHk.LIZLLL(this, 2014, creativeToastBuilder);
                this.LLJJJJLIIL = false;
                return;
            }
            return;
        }
        Editable editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
        if (editableQ == null) {
            return;
        }
        setAddVideoChain(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.g);
        C0ZIO.LIZ.getClass();
        sbLIZ.append(videoRelatedInfo.authorNickName);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        MentionSpan mentionSpan = new MentionSpan(spannableStringBuilder.toString(), this.LLIZLLLIL, 0L, Long.toString(videoRelatedInfo.authorId), " ", 5, videoRelatedInfo.authorSecUid);
        String string = Long.toString(videoRelatedInfo.awemeId);
        mentionSpan.awemeId = string;
        mentionSpan.mStruct.setAwemeId(string);
        if (z) {
            i2 = 13;
        } else {
            i2 = 12;
        }
        mentionSpan.LIZ(i2);
        C786410Ut5.q2(spannableStringBuilder, mentionSpan, 0, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, new C0GZ6(getContext(), new C0GZ7() { // from class: X.0ZIM
            @Override // X.C0GZ7
            public final void LIZ() {
            }

            @Override // X.C0GZ7
            public final int getMaxWidth() {
                return this.LIZ.getMeasuredWidth();
            }
        }), 0, spannableStringBuilder.length(), 33);
        String str3 = "paste_long";
        if (i == 0) {
            editableQ.insert(0, spannableStringBuilder);
            editableQ.append((CharSequence) " ");
            if (this.LLJJJJ && !TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.isCenterToast(C859340XnQ.LIZIZ());
                creativeToastBuilder2.message(str);
                C1390380mHk.LIZLLL(this, 2014, creativeToastBuilder2);
                this.LLJJJJ = false;
            }
            VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
            if (!z) {
                str3 = "paste_short";
            }
            C0ZIO.LJI(videoRelatedInfo.videoStatus, videoRelatedInfo.isPrivateAccount(), videoPublishEditModel, str3);
            return;
        }
        int length = editableQ.length();
        if (i <= length && i >= 0) {
            int i3 = i - 1;
            if (TextUtils.equals(editableQ.subSequence(i3, i), e3.g)) {
                editableQ.delete(i3, i);
                length--;
            } else {
                i3 = i;
            }
            int iMin = Math.min(length, Math.max(0, i3));
            editableQ.insert(iMin, spannableStringBuilder);
            editableQ.insert(Math.min(iMin + spannableStringBuilder.length(), editableQ.length()), " ");
            if (this.LLJJJJ && !TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.isCenterToast(C859340XnQ.LIZIZ());
                creativeToastBuilder3.message(str);
                C1390380mHk.LIZLLL(this, 2014, creativeToastBuilder3);
                this.LLJJJJ = false;
            }
            VideoPublishEditModel videoPublishEditModel2 = this.LLJJIJIL;
            if (!z) {
                str3 = "paste_short";
            }
            C0ZIO.LJI(videoRelatedInfo.videoStatus, videoRelatedInfo.isPrivateAccount(), videoPublishEditModel2, str3);
        }
    }

    public final boolean LJIIIIZZ(int i, String str, String str2, String str3, boolean z, boolean z2) throws Throwable {
        String str4;
        String str5;
        String str6;
        if (this.LLJILJILJ) {
            return false;
        }
        int selectionStart = getSelectionStart();
        Editable editableQ = C2204961BRm.q(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
        if (editableQ == null) {
            return false;
        }
        if (i == 0) {
            str4 = e3.g;
        } else if (i == 1) {
            str4 = "#";
        } else {
            str4 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str4);
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        MentionSpan mentionSpan = new MentionSpan(spannableString.toString(), this.LLIZLLLIL, 0L, str2, "", i, str3);
        C786410Ut5.p2(spannableString, mentionSpan, 0, spannableString.length(), 33);
        MentionSpan[] mentionSpanArrLJIJ = LJIJ(editableQ);
        if (mentionSpanArrLJIJ != null && mentionSpanArrLJIJ.length > 0 && !z2) {
            for (MentionSpan mentionSpan2 : mentionSpanArrLJIJ) {
                if (mentionSpan2 != null && (str5 = mentionSpan2.mId) != null && (str6 = mentionSpan.mId) != null && str5.equals(str6) && Objects.equals(mentionSpan2.mText, mentionSpan.mText) && mentionSpan2.subType == mentionSpan.subType && mentionSpan2.mType == mentionSpan.mType) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
                    creativeToastBuilder.messageRes(2131826445);
                    C1390380mHk.LIZLLL(this, 2011, creativeToastBuilder);
                    return false;
                }
            }
            int i2 = 0;
            for (MentionSpan mentionSpan3 : mentionSpanArrLJIJ) {
                if (mentionSpan3.mType == 0) {
                    i2++;
                }
            }
            if (MentionLimitServiceImpl.LIZIZ().LIZ(i2, C0FNT.LIZ(getContext()), EnumC1413205g2.POST_PUBLISH_DESCRIPTION)) {
                return false;
            }
        }
        if (TextUtils.isEmpty(editableQ)) {
            editableQ.insert(0, spannableString);
            editableQ.append(" ");
            return true;
        }
        int length = editableQ.length();
        if (z) {
            selectionStart = length;
        }
        if (selectionStart <= length && selectionStart >= 0) {
            if (selectionStart > 0) {
                int i3 = selectionStart - 1;
                if (TextUtils.equals(editableQ.subSequence(i3, selectionStart), str4)) {
                    editableQ.delete(i3, selectionStart);
                    selectionStart = i3;
                }
            }
            int iMin = Math.min(editableQ.length(), Math.max(0, selectionStart));
            editableQ.insert(iMin, spannableString);
            editableQ.insert(Math.min(iMin + spannableString.length(), editableQ.length()), " ");
            return true;
        }
        return true;
    }
}
