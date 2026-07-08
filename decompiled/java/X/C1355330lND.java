package X;

import Y.AComparatorS518S0100000_21;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355330lND extends C0I7D {
    public C0FLJ LLIZ;
    public boolean LLIZLLLIL;
    public final List<C0FLJ> LLJ;
    public InterfaceC1355370lNH LLJI;

    public final ArrayList<TextExtraStruct> getMentionExtraStructList() {
        Editable editableJ = C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null));
        if (editableJ == null || editableJ.length() == 0) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        MentionSpan[] mentionSpanArr = (MentionSpan[]) C1353540lKK.LIZJ(C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)), MentionSpan.class);
        if (mentionSpanArr == null) {
            return arrayList;
        }
        for (MentionSpan mentionSpan : mentionSpanArr) {
            if (mentionSpan.getType() == 0) {
                TextExtraStruct textExtraStructLIZ = mentionSpan.LIZ();
                if (textExtraStructLIZ != null) {
                    textExtraStructLIZ.setStart(C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).getSpanStart(mentionSpan));
                }
                TextExtraStruct textExtraStructLIZ2 = mentionSpan.LIZ();
                if (textExtraStructLIZ2 != null) {
                    textExtraStructLIZ2.setEnd(C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).getSpanEnd(mentionSpan));
                }
                TextExtraStruct textExtraStructLIZ3 = mentionSpan.LIZ();
                if (textExtraStructLIZ3 != null) {
                    arrayList.add(textExtraStructLIZ3.m271clone());
                }
            }
        }
        return arrayList;
    }

    public final MentionSpan[] getMentionSpan() throws Throwable {
        Editable editableJ = C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null));
        if (editableJ == null || editableJ.length() == 0) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).getSpans(0, C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new AComparatorS518S0100000_21(this, 6));
        return mentionSpanArr;
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public Editable getText() {
        Editable text;
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()Landroid/text/Editable;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", this, objArr, "android.text.Editable", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", null, objArr, this, c0wzw, false);
            text = (Editable) c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C21410318qb c21410318qb = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C21410318qb) obj;
            text = super.getText();
            c0wst.LIZ(998, "com/bytedance/tux/input/TuxEditText", "getText", text, objArr, c21410318qb, c0wzw, true);
        }
        return text == null ? new SpannableStringBuilder("") : text;
    }

    public final int getPrevMentionSpanEndPosition() {
        int end;
        int selectionEnd = getSelectionEnd();
        ArrayList<TextExtraStruct> mentionExtraStructList = getMentionExtraStructList();
        int i = -1;
        if (mentionExtraStructList == null) {
            return -1;
        }
        Iterator<TextExtraStruct> it2 = mentionExtraStructList.iterator();
        while (it2.hasNext() && selectionEnd - 1 >= (end = it2.next().getEnd())) {
            i = end;
        }
        return i;
    }

    public final InterfaceC1355370lNH getMentionListener() {
        return this.LLJI;
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null));
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0lNE
            public final C1355330lND LIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) throws Throwable {
                int i;
                MentionSpan[] mentionSpanArr;
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    int selectionStart = this.LIZ.getSelectionStart();
                    int selectionEnd = this.LIZ.getSelectionEnd();
                    C0FLJ c0fljLJIIIIZZ = this.LIZIZ.LJIIIIZZ(selectionStart, selectionEnd);
                    if (c0fljLJIIIIZZ == null || (selectionStart == (i = c0fljLJIIIIZZ.LIZ) && selectionStart == selectionEnd)) {
                        this.LIZIZ.LLIZLLLIL = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    C1355330lND c1355330lND = this.LIZIZ;
                    if (!c1355330lND.LLIZLLLIL && selectionStart == selectionEnd) {
                        c1355330lND.LLIZLLLIL = true;
                        c1355330lND.LLIZ = c0fljLJIIIIZZ;
                        if (Build.VERSION.SDK_INT >= 25) {
                            setSelection(i, c0fljLJIIIIZZ.LIZIZ);
                            return true;
                        }
                        setSelection(c0fljLJIIIIZZ.LIZIZ, i);
                        return true;
                    }
                    c1355330lND.LLIZLLLIL = false;
                    Editable editableJ = C2204961BRm.J(c1355330lND, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null));
                    if (editableJ != null && (mentionSpanArr = (MentionSpan[]) editableJ.getSpans(c0fljLJIIIIZZ.LIZ, c0fljLJIIIIZZ.LIZIZ, MentionSpan.class)) != null && mentionSpanArr.length != 0) {
                        this.LIZIZ.getMentionSpan();
                        C1355330lND c1355330lND2 = this.LIZIZ;
                        for (MentionSpan mentionSpan : mentionSpanArr) {
                            InterfaceC1355370lNH mentionListener = c1355330lND2.getMentionListener();
                            if (mentionListener != null) {
                                String strLIZJ = mentionSpan.LIZJ();
                                if (strLIZJ == null) {
                                    strLIZJ = "";
                                }
                                mentionListener.LIZ(strLIZJ);
                            }
                        }
                    }
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
                MentionSpan[] mentionSpanArr;
                if (i == 1) {
                    if (i2 == 0) {
                        Editable editableJ = C2204961BRm.J(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null));
                        if (editableJ != null && editableJ.length() != 0) {
                            C1355330lND c1355330lND = this.LIZIZ;
                            c1355330lND.getClass();
                            int length = editableJ.length();
                            int iMax = Math.max(c1355330lND.getSelectionStart() - i, 0);
                            int iMin = Math.min(c1355330lND.getSelectionEnd(), length);
                            C089E c089e = new C089E(editableJ.getSpans(0, length, CharacterStyle.class));
                            int i3 = iMax;
                            int i4 = iMin;
                            boolean z = false;
                            boolean z2 = false;
                            while (c089e.hasNext()) {
                                CharacterStyle characterStyle = (CharacterStyle) c089e.next();
                                if (!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).getType() != 1) {
                                    int spanStart = editableJ.getSpanStart(characterStyle);
                                    int spanEnd = editableJ.getSpanEnd(characterStyle);
                                    if (!z && spanStart <= iMax && spanEnd > iMax) {
                                        z = true;
                                        i3 = spanStart;
                                    }
                                    if (!z2 && spanStart < iMin && spanEnd >= iMin) {
                                        z2 = true;
                                        i4 = spanEnd;
                                    }
                                    if (z && z2) {
                                        break;
                                    }
                                }
                            }
                            if (i3 > i4) {
                                int i5 = i4;
                                i4 = i3;
                                i3 = i5;
                            }
                            C0FLJ c0fljLJIIIIZZ = this.LIZIZ.LJIIIIZZ(i3, i4);
                            if (c0fljLJIIIIZZ != null && (mentionSpanArr = (MentionSpan[]) editableJ.getSpans(c0fljLJIIIIZZ.LIZ, c0fljLJIIIIZZ.LIZIZ, MentionSpan.class)) != null && mentionSpanArr.length != 0) {
                                this.LIZIZ.getMentionSpan();
                                C1355330lND c1355330lND2 = this.LIZIZ;
                                for (MentionSpan mentionSpan : mentionSpanArr) {
                                    InterfaceC1355370lNH mentionListener = c1355330lND2.getMentionListener();
                                    if (mentionListener != null) {
                                        String strLIZJ = mentionSpan.LIZJ();
                                        if (strLIZJ == null) {
                                            strLIZJ = "";
                                        }
                                        mentionListener.LIZ(strLIZJ);
                                    }
                                }
                                if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                                    return true;
                                }
                                return false;
                            }
                            editableJ.delete(i3, i4);
                        }
                        return false;
                    }
                } else if (i < 0) {
                    int i6 = -i2;
                    i2 = -i;
                    i = i6;
                }
                return super.deleteSurroundingText(i, i2);
            }

            {
                this.LIZ = this;
            }
        };
    }

    public final void setMentionListener(InterfaceC1355370lNH interfaceC1355370lNH) {
        this.LLJI = interfaceC1355370lNH;
    }

    public C1355330lND(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
        this.LLJ = new ArrayList(5);
    }

    public final C0FLJ LJIIIIZZ(int i, int i2) {
        List<C0FLJ> list = this.LLJ;
        if (list != null) {
            for (C0FLJ c0flj : (ArrayList) list) {
                if (c0flj.LIZ(i, i2)) {
                    return c0flj;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C0FLJ c0flj = this.LLIZ;
        if (c0flj != null && c0flj.LIZJ(i, i2)) {
            return;
        }
        C0FLJ c0fljLJIIIIZZ = LJIIIIZZ(i, i2);
        if (c0fljLJIIIIZZ != null && c0fljLJIIIIZZ.LIZIZ == i2) {
            this.LLIZLLLIL = false;
        }
        List<C0FLJ> list = this.LLJ;
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

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        MentionSpan[] mentionSpan;
        List<C0FLJ> list;
        super.onTextChanged(charSequence, i, i2, i3);
        this.LLIZLLLIL = false;
        List<C0FLJ> list2 = this.LLJ;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        Editable editableJ = C2204961BRm.J(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null));
        if (editableJ == null || editableJ.length() == 0 || (mentionSpan = getMentionSpan()) == null) {
            return;
        }
        for (MentionSpan mentionSpan2 : mentionSpan) {
            int spanStart = editableJ.getSpanStart(mentionSpan2);
            int spanEnd = editableJ.getSpanEnd(mentionSpan2);
            C0FLJ c0flj = new C0FLJ(spanStart, spanEnd);
            if (!TextUtils.equals(editableJ.subSequence(spanStart, spanEnd).toString(), mentionSpan2.LIZIZ())) {
                editableJ.removeSpan(mentionSpan2);
            } else if (mentionSpan2.getType() == 0 && (list = this.LLJ) != null) {
                ((ArrayList) list).add(c0flj);
            }
        }
    }
}
