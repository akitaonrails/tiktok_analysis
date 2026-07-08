package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21397818oa extends C1842270y2b {
    public int LLJ;
    public InterfaceC21397618oY LLJI;
    public final boolean LLJIJIL;

    public final InterfaceC21397618oY getCallbacks() {
        return this.LLJI;
    }

    public final int getMaxLength() {
        return this.LLJ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.18oc] */
    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        final int i = this.LLJ;
        final ?? r1 = new InterfaceC21397618oY() { // from class: X.18oc
            @Override // X.InterfaceC21397618oY
            public final void LIZ(int i2, CharSequence charSequence) throws Throwable {
                Editable editableW = C2204961BRm.w(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4ZT1fjB4rOx9sn6hy9I+4AjI3r1RTvXJV1B0jKwyZf9A5Qme7I3bgYVBmSp7nuhyYhn00DG+6xuUqD8Xf+pM0=", null));
                if (editableW == null) {
                    editableW = Editable.Factory.getInstance().newEditable("");
                }
                int length = editableW.length();
                this.LIZ.getMaxLength();
                InterfaceC21397618oY callbacks = this.LIZ.getCallbacks();
                if (callbacks != null) {
                    callbacks.LIZ(length, editableW);
                }
            }

            @Override // X.InterfaceC21397618oY
            public final void LIZIZ(int i2, CharSequence charSequence) {
                InterfaceC21397618oY callbacks = this.LIZ.getCallbacks();
                if (callbacks != null) {
                    callbacks.LIZIZ(i2, charSequence);
                }
            }
        };
        final boolean z = this.LLJIJIL;
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, i, r1, z) { // from class: X.18oX
            public final int LIZ;
            public final InterfaceC21397618oY LIZIZ;
            public final boolean LIZJ;
            public final boolean LIZLLL = false;
            public int LJ;

            public final CharSequence LIZIZ() {
                CharSequence textBeforeCursor = getTextBeforeCursor(SpeechEngineDefines.TTS_WORK_MODE_BOTH, 0);
                if (textBeforeCursor == null) {
                    textBeforeCursor = "";
                }
                CharSequence textAfterCursor = getTextAfterCursor(SpeechEngineDefines.TTS_WORK_MODE_BOTH, 0);
                CharSequence charSequence = textAfterCursor != null ? textAfterCursor : "";
                StringBuilder sb = new StringBuilder(textBeforeCursor.length() + charSequence.length());
                sb.append(textBeforeCursor);
                sb.append(charSequence);
                return sb.toString();
            }

            public final void LIZJ() {
                String str = (String) LIZIZ();
                this.LIZIZ.LIZ(str.length(), str);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean finishComposingText() {
                boolean zFinishComposingText = super.finishComposingText();
                this.LJ = 0;
                int length = ((String) LIZIZ()).length();
                int i2 = this.LIZ;
                if (length > i2) {
                    deleteSurroundingText(length - i2, 0);
                }
                LIZJ();
                return zFinishComposingText;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i2) {
                if (charSequence == null) {
                    charSequence = "";
                }
                int length = ((String) LIZIZ()).length();
                if (this.LIZJ) {
                    int i3 = this.LIZ - length;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (charSequence.length() > i3) {
                        charSequence = charSequence.subSequence(0, i3);
                    }
                }
                boolean zCommitText = super.commitText(charSequence, i2);
                this.LJ = 0;
                LIZJ();
                return zCommitText;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i2, int i3) {
                boolean zDeleteSurroundingText = super.deleteSurroundingText(i2, i3);
                LIZJ();
                return zDeleteSurroundingText;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
                boolean zDeleteSurroundingTextInCodePoints = super.deleteSurroundingTextInCodePoints(i2, i3);
                LIZJ();
                return zDeleteSurroundingTextInCodePoints;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean setComposingText(CharSequence charSequence, int i2) {
                int i3;
                CharSequence charSequenceLJZI = "";
                if (charSequence == null) {
                    charSequence = "";
                }
                int length = ((String) LIZIZ()).length() - this.LJ;
                if (length < 0) {
                    length = 0;
                }
                int length2 = charSequence.length() + length;
                if (this.LIZLLL && length2 > (i3 = this.LIZ)) {
                    int i4 = i3 - length;
                    if (i4 >= 0 && i4 > 0) {
                        charSequenceLJZI = C13LN.LJZI(i4, charSequence);
                    }
                } else {
                    charSequenceLJZI = charSequence;
                }
                boolean composingText = super.setComposingText(charSequenceLJZI, i2);
                this.LIZIZ.LIZIZ(length + charSequenceLJZI.length(), charSequenceLJZI);
                this.LJ = charSequenceLJZI.length();
                return composingText;
            }

            {
                this.LIZ = i;
                this.LIZIZ = r1;
                this.LIZJ = z;
            }
        };
    }

    public final void setCallbacks(InterfaceC21397618oY interfaceC21397618oY) {
        this.LLJI = interfaceC21397618oY;
        addTextChangedListener(new C0DL6() { // from class: X.18ob
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) throws Throwable {
                int length = 0;
                for (Object obj : editable.getSpans(0, editable.length(), Object.class)) {
                    if ((editable.getSpanFlags(obj) & 256) != 0) {
                        return;
                    }
                }
                if (editable.length() > this.LL.getMaxLength()) {
                    CharSequence charSequenceSubSequence = editable.subSequence(0, this.LL.getMaxLength());
                    this.LL.removeTextChangedListener(this);
                    Editable editableW = C2204961BRm.w(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4ZT1fjB4rOx9sn6hy9I+4AjI3r1RTvXJV1B0jKwyZf9A5Qme7I3bgYVBmSp7nuhyYhn00DG+6xuUqD8Xf+pM0=", null));
                    if (editableW != null) {
                        editableW.replace(0, editable.length(), charSequenceSubSequence);
                    }
                    this.LL.addTextChangedListener(this);
                    C21397818oa c21397818oa = this.LL;
                    c21397818oa.setSelection(c21397818oa.getMaxLength());
                }
                Editable editableW2 = C2204961BRm.w(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4ZT1fjB4rOx9sn6hy9I+4AjI3r1RTvXJV1B0jKwyZf9A5Qme7I3bgYVBmSp7nuhyYhn00DG+6xuUqD8Xf+pM0=", null));
                if (editableW2 != null) {
                    length = editableW2.length();
                }
                this.LL.getMaxLength();
                InterfaceC21397618oY callbacks = this.LL.getCallbacks();
                if (callbacks != null) {
                    CharSequence charSequenceW = C2204961BRm.w(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4ZT1fjB4rOx9sn6hy9I+4AjI3r1RTvXJV1B0jKwyZf9A5Qme7I3bgYVBmSp7nuhyYhn00DG+6xuUqD8Xf+pM0=", null));
                    if (charSequenceW == null) {
                        charSequenceW = "";
                    }
                    callbacks.LIZ(length, charSequenceW);
                }
            }
        });
    }

    public final void setMaxLength(int i) {
        this.LLJ = i;
    }

    public C21397818oa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
        this.LLJ = 200;
        this.LLJIJIL = true;
    }
}
