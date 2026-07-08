package X;

import Y.AComparatorS518S0100000_21;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSavedState;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0lKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1353510lKH extends C0I7D {
    public static final /* synthetic */ int LLJILLL = 0;
    public RunnableC460040I2g LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public C0FLJ LLJI;
    public List<C0FLJ> LLJIJIL;
    public final List<TextWatcher> LLJILJIL;
    public View.OnKeyListener LLJILJILJ;

    public String getAdTag() {
        return "";
    }

    public void setMentionTextTypeface(int i) {
    }

    public MentionEditText$MentionSpan[] getMentionText() throws Throwable {
        Editable editableN = C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null));
        if (editableN == null || TextUtils.isEmpty(editableN.toString())) {
            return null;
        }
        MentionEditText$MentionSpan[] mentionEditText$MentionSpanArr = (MentionEditText$MentionSpan[]) editableN.getSpans(0, getNoAdTagText().length(), MentionEditText$MentionSpan.class);
        Arrays.sort(mentionEditText$MentionSpanArr, new AComparatorS518S0100000_21(editableN, 8));
        return mentionEditText$MentionSpanArr;
    }

    public String getNoAdTagText() {
        return C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null)).toString();
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        Editable editableN = C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null));
        if (editableN == null || TextUtils.isEmpty(editableN.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        for (MentionEditText$MentionSpan mentionEditText$MentionSpan : getMentionText()) {
            if (mentionEditText$MentionSpan.mType == 0) {
                mentionEditText$MentionSpan.mStruct.setStart(editableN.getSpanStart(mentionEditText$MentionSpan));
                mentionEditText$MentionSpan.mStruct.setEnd(editableN.getSpanEnd(mentionEditText$MentionSpan));
                arrayList.add(mentionEditText$MentionSpan.mStruct);
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

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLJILJIL;
        if (list != null && textWatcher != null) {
            ((ArrayList) list).add(textWatcher);
        }
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0lKJ
            public final C1353510lKH LIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                int i;
                C1353510lKH c1353510lKH = this.LIZIZ;
                View.OnKeyListener onKeyListener = c1353510lKH.LLJILJILJ;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(c1353510lKH, keyEvent.getKeyCode(), keyEvent);
                }
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    int selectionStart = this.LIZ.getSelectionStart();
                    C0FLJ c0fljLJIIIIZZ = this.LIZIZ.LJIIIIZZ(selectionStart, this.LIZ.getSelectionEnd());
                    if (c0fljLJIIIIZZ == null) {
                        this.LIZIZ.LLJ = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    C1353510lKH c1353510lKH2 = this.LIZIZ;
                    if (!c1353510lKH2.LLJ && selectionStart != (i = c0fljLJIIIIZZ.LIZ)) {
                        c1353510lKH2.LLJ = true;
                        c1353510lKH2.LLJI = c0fljLJIIIIZZ;
                        if (Build.VERSION.SDK_INT >= 25) {
                            setSelection(i, c0fljLJIIIIZZ.LIZIZ);
                            return true;
                        }
                        setSelection(c0fljLJIIIIZZ.LIZIZ, i);
                        return true;
                    }
                    c1353510lKH2.LLJ = false;
                    return super.sendKeyEvent(keyEvent);
                }
                return super.sendKeyEvent(keyEvent);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                try {
                    return super.commitText(charSequence, i);
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) throws Throwable {
                MentionEditText$MentionSpan[] mentionEditText$MentionSpanArr;
                int i3 = i;
                int i4 = i2;
                if (i3 == 1) {
                    if (i4 == 0) {
                        Editable editableN = C2204961BRm.N(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null));
                        if (editableN != null && editableN.length() > 0) {
                            C1353510lKH c1353510lKH = this.LIZIZ;
                            c1353510lKH.getClass();
                            int length = editableN.length();
                            int iMax = Math.max(c1353510lKH.getSelectionStart() - i3, 0);
                            int iMin = Math.min(c1353510lKH.getSelectionEnd(), length);
                            int i5 = iMax;
                            int i6 = iMin;
                            boolean z = false;
                            boolean z2 = false;
                            for (CharacterStyle characterStyle : (CharacterStyle[]) editableN.getSpans(0, length, CharacterStyle.class)) {
                                if (!(characterStyle instanceof MentionEditText$MentionSpan) || ((MentionEditText$MentionSpan) characterStyle).mType != 1) {
                                    int spanStart = editableN.getSpanStart(characterStyle);
                                    int spanEnd = editableN.getSpanEnd(characterStyle);
                                    if (!z && spanStart <= iMax && spanEnd > iMax) {
                                        z = true;
                                        i5 = spanStart;
                                    }
                                    if (!z2 && spanStart < iMin && spanEnd >= iMin) {
                                        z2 = true;
                                        i6 = spanEnd;
                                    }
                                    if (z && z2) {
                                        break;
                                    }
                                }
                            }
                            if (i5 > i6) {
                                int i7 = i6;
                                i6 = i5;
                                i5 = i7;
                            }
                            C0FLJ c0fljLJIIIIZZ = this.LIZIZ.LJIIIIZZ(i5, i6);
                            if (c0fljLJIIIIZZ != null && (mentionEditText$MentionSpanArr = (MentionEditText$MentionSpan[]) editableN.getSpans(c0fljLJIIIIZZ.LIZ, c0fljLJIIIIZZ.LIZIZ, MentionEditText$MentionSpan.class)) != null && mentionEditText$MentionSpanArr.length > 0) {
                                if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                                    return true;
                                }
                                return false;
                            }
                            editableN.delete(i5, i6);
                        }
                        return false;
                    }
                } else if (i3 < 0) {
                    int i8 = -i4;
                    i4 = -i3;
                    i3 = i8;
                }
                return super.deleteSurroundingText(i3, i4);
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
        if (C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null)) != null) {
            int iMin = Math.min(mentionEditText$MentionSavedState.LLILLJJLI, C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null)).length());
            if (iMin >= 0) {
                setSelection(iMin);
            }
            setTextExtraList(mentionEditText$MentionSavedState.LLILLL);
        }
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLJILJIL;
        if (list != null && textWatcher != null) {
            ((ArrayList) list).remove(textWatcher);
        }
    }

    public void setMentionTextColor(int i) {
        this.LLIZLLLIL = i;
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LLJILJILJ = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable editableN;
        this.LLJ = false;
        List<C0FLJ> list2 = this.LLJIJIL;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        if (list != null && !list.isEmpty() && (editableN = C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null))) != null && !TextUtils.isEmpty(editableN.toString())) {
            int length = editableN.length();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.getType() == 0 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                    MentionEditText$MentionSpan mentionEditText$MentionSpan = new MentionEditText$MentionSpan(this.LLIZLLLIL, textExtraStruct.getType(), editableN.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        mentionEditText$MentionSpan.setAwemeId(textExtraStruct.getAwemeId());
                    }
                    mentionEditText$MentionSpan.LIZ(textExtraStruct.getSubtype());
                    editableN.setSpan(mentionEditText$MentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                    ((ArrayList) this.LLJIJIL).add(new C0FLJ(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                }
            }
        }
    }

    public C1353510lKH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJILJIL = new ArrayList();
        new HashSet();
        setImeOptions(268435456);
        this.LLJIJIL = new ArrayList(5);
        this.LLIZLLLIL = -65536;
        Context context2 = getContext();
        if (context2 != null && context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
    }

    public final C0FLJ LJIIIIZZ(int i, int i2) {
        List<C0FLJ> list = this.LLJIJIL;
        if (list == null) {
            return null;
        }
        for (C0FLJ c0flj : (ArrayList) list) {
            if (c0flj.LIZ(i, i2)) {
                return c0flj;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        String adTag = getAdTag();
        if (!TextUtils.isEmpty(adTag)) {
            int length = C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null)).length() - adTag.length();
            if (i > length) {
                setSelection(length);
            } else if (i2 > length) {
                setSelection(i, length);
            }
        }
        C0FLJ c0flj = this.LLJI;
        if (c0flj != null && c0flj.LIZJ(i, i2)) {
            return;
        }
        C0FLJ c0fljLJIIIIZZ = LJIIIIZZ(i, i2);
        if (c0fljLJIIIIZZ != null && c0fljLJIIIIZZ.LIZIZ == i2) {
            this.LLJ = false;
        }
        List<C0FLJ> list = this.LLJIJIL;
        if (list != null) {
            for (C0FLJ c0flj2 : (ArrayList) list) {
                if (c0flj2.LIZLLL(i, i2)) {
                    try {
                        if (i == i2) {
                            setSelection(c0flj2.LIZIZ(i));
                            return;
                        }
                        int i3 = c0flj2.LIZIZ;
                        if (i2 < i3) {
                            setSelection(i, i3);
                        }
                        int i4 = c0flj2.LIZ;
                        if (i > i4) {
                            setSelection(i4, i2);
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

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0I2g] */
    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLIZ == null) {
            this.LLIZ = new Runnable(this) { // from class: X.0I2g
                public final WeakReference<C1353510lKH> LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MentionEditText$SetSelectionRunnable@13c.run");
                    try {
                        C1353510lKH c1353510lKH = this.LL.get();
                        if (c1353510lKH != null) {
                            c1353510lKH.setSelection(C2204961BRm.N(c1353510lKH, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null)).length());
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MentionEditText$SetSelectionRunnable@13c.run");
                }

                {
                    this.LL = new WeakReference<>(this);
                }
            };
        }
        if (C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null)).length() > 0) {
            HandlerHook.viewPost(this, this.LLIZ);
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        this.LLJ = false;
        List<C0FLJ> list = this.LLJIJIL;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        Editable editableN = C2204961BRm.N(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkj9ZLOrzgxUVH8wOImVh1by9UDuwtQS0", null));
        if (editableN != null && !TextUtils.isEmpty(editableN.toString())) {
            for (MentionEditText$MentionSpan mentionEditText$MentionSpan : getMentionText()) {
                int spanStart = editableN.getSpanStart(mentionEditText$MentionSpan);
                int spanEnd = editableN.getSpanEnd(mentionEditText$MentionSpan);
                C0FLJ c0flj = new C0FLJ(spanStart, spanEnd);
                if (!TextUtils.equals(editableN.subSequence(spanStart, spanEnd).toString(), mentionEditText$MentionSpan.mText)) {
                    editableN.removeSpan(mentionEditText$MentionSpan);
                } else if (mentionEditText$MentionSpan.mType == 0) {
                    ((ArrayList) this.LLJIJIL).add(c0flj);
                }
            }
        }
    }
}
