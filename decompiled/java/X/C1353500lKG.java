package X;

import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSavedState;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentGroupChatSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentLinkProductSpan;
import com.ss.android.ugc.aweme.comment.widgets.EmojiStruct;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0lKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1353500lKG extends C0I7D {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public RunnableC446330Hep LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public C0FLJ LLJIJIL;
    public final List<C0FLJ> LLJILJIL;
    public InterfaceC1340320kz0 LLJILJILJ;
    public InterfaceC1353580lKO LLJILLL;
    public List<TextWatcher> LLJJ;
    public List<InterfaceC1349190lDJ> LLJJI;
    public boolean LLJJIII;
    public View.OnKeyListener LLJJIJI;

    public C1353500lKG(Context context) {
        this(context, null, 6);
    }

    public C1353500lKG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final InterfaceC1353630lKT getOnCommitTextListener() {
        return null;
    }

    public final void setOnCommitTextListener(InterfaceC1353630lKT interfaceC1353630lKT) {
    }

    public final void setOnMentionInputListener(InterfaceC1353600lKQ interfaceC1353600lKQ) {
    }

    public final void LJIIL() throws Throwable {
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
        if (editableLLLZZIL == null || TextUtils.isEmpty(editableLLLZZIL.toString())) {
            return;
        }
        int length = editableLLLZZIL.length();
        MentionSpan[] mentionSpan = getMentionSpan();
        if (mentionSpan == null) {
            return;
        }
        for (MentionSpan mentionSpan2 : mentionSpan) {
            TextExtraStruct textExtraStructLIZ = mentionSpan2.LIZ();
            if (textExtraStructLIZ == null) {
                return;
            }
            int spanStart = editableLLLZZIL.getSpanStart(mentionSpan2);
            int spanEnd = editableLLLZZIL.getSpanEnd(mentionSpan2);
            if (spanStart <= length && spanEnd <= length && spanStart <= spanEnd && textExtraStructLIZ.getType() == 0) {
                editableLLLZZIL.removeSpan(mentionSpan2);
                MentionSpan mentionSpan3 = new MentionSpan(this.LLIZLLLIL, editableLLLZZIL.subSequence(spanStart, spanEnd).toString(), textExtraStructLIZ.getUserId(), textExtraStructLIZ.getType(), textExtraStructLIZ.getSecUid());
                if (!TextUtils.isEmpty(textExtraStructLIZ.getAwemeId())) {
                    mentionSpan3.setAwemeId(textExtraStructLIZ.getAwemeId());
                }
                editableLLLZZIL.setSpan(mentionSpan3, spanStart, spanEnd, 33);
            }
        }
    }

    public final List<CommentEmojiSpan> getEmojiSpanList() {
        return C1353540lKK.LIZ(C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)));
    }

    public final ArrayList<EmojiStruct> getEmojiStructList() throws Throwable {
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
        if (editableLLLZZIL == null || editableLLLZZIL.length() == 0) {
            return null;
        }
        ArrayList<EmojiStruct> arrayList = new ArrayList<>();
        List<CommentEmojiSpan> emojiSpanList = getEmojiSpanList();
        if (emojiSpanList == null) {
            return arrayList;
        }
        for (CommentEmojiSpan commentEmojiSpan : emojiSpanList) {
            arrayList.add(new EmojiStruct(commentEmojiSpan, editableLLLZZIL.getSpanStart(commentEmojiSpan), editableLLLZZIL.getSpanStart(commentEmojiSpan)));
        }
        return arrayList;
    }

    public final ArrayList<TextExtraStruct> getMentionExtraStructList() {
        return C1353540lKK.LIZIZ(C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)));
    }

    public final MentionSpan[] getMentionSpan() {
        return (MentionSpan[]) C1353540lKK.LIZJ(C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)), MentionSpan.class);
    }

    public final ArrayList<TextExtraStruct> getTextExtraStructList() throws Throwable {
        ArrayList<TextExtraStruct> arrayList = null;
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
        if (editableLLLZZIL != null && !TextUtils.isEmpty(editableLLLZZIL.toString())) {
            arrayList = new ArrayList<>();
            MentionSpan[] mentionSpan = getMentionSpan();
            if (mentionSpan != null) {
                C089E c089e = new C089E(mentionSpan);
                while (c089e.hasNext()) {
                    MentionSpan mentionSpan2 = (MentionSpan) c089e.next();
                    if (mentionSpan2.getType() == 0) {
                        TextExtraStruct textExtraStructLIZ = mentionSpan2.LIZ();
                        if (textExtraStructLIZ != null) {
                            textExtraStructLIZ.setStart(editableLLLZZIL.getSpanStart(mentionSpan2));
                        }
                        TextExtraStruct textExtraStructLIZ2 = mentionSpan2.LIZ();
                        if (textExtraStructLIZ2 != null) {
                            textExtraStructLIZ2.setEnd(editableLLLZZIL.getSpanEnd(mentionSpan2));
                        }
                        TextExtraStruct textExtraStructLIZ3 = mentionSpan2.LIZ();
                        if (textExtraStructLIZ3 != null) {
                            arrayList.add(textExtraStructLIZ3);
                        }
                    }
                }
            }
        }
        return arrayList;
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

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        CommentEditText$MentionSavedState commentEditText$MentionSavedState = new CommentEditText$MentionSavedState(super.onSaveInstanceState());
        commentEditText$MentionSavedState.text = String.valueOf(C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)));
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        commentEditText$MentionSavedState.selectionEnd = selectionEnd;
        commentEditText$MentionSavedState.structs = getMentionExtraStructList();
        commentEditText$MentionSavedState.emojis = getEmojiStructList();
        return commentEditText$MentionSavedState;
    }

    private final InputFilter getNoConsecutiveNewlineFilter() {
        return new InputFilter() { // from class: X.0lKN
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    if (charSequence.charAt(i) == '\n') {
                        if (i3 > 0 && spanned.charAt(i3 - 1) == '\n') {
                            return "";
                        }
                        if (i3 < spanned.length() && spanned.charAt(i3) == '\n') {
                            return "";
                        }
                    }
                    i++;
                }
                return null;
            }
        };
    }

    public final int getMentionTextColor() {
        return this.LLIZLLLIL;
    }

    public final int getMentionTextTypeface() {
        return this.LLJ;
    }

    public final List<InterfaceC1349190lDJ> getOnPasteListeners() {
        return this.LLJJI;
    }

    public final boolean getSkipGroupChatSpanDeleteEvent() {
        return this.LLJJIII;
    }

    public final List<TextWatcher> getTextWatcherList() {
        return this.LLJJ;
    }

    private final void setEmojiSpanList(List<EmojiStruct> list) {
        Editable editableLLLZZIL;
        int i;
        if (list != null && !list.isEmpty() && (editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null))) != null && editableLLLZZIL.length() != 0) {
            int length = editableLLLZZIL.length();
            for (EmojiStruct emojiStruct : list) {
                int i2 = emojiStruct.start;
                if (i2 <= length || (i = emojiStruct.end) <= length || i2 <= i) {
                    editableLLLZZIL.setSpan(emojiStruct.emojiSpan, i2, emojiStruct.end, 33);
                }
            }
        }
    }

    private final void setTextExtraList(List<? extends TextExtraStruct> list) {
        Editable editableLLLZZIL;
        this.LLJI = false;
        List<C0FLJ> list2 = this.LLJILJIL;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        if (list != null && !list.isEmpty() && (editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null))) != null && editableLLLZZIL.length() != 0) {
            int length = editableLLLZZIL.length();
            for (TextExtraStruct textExtraStruct : list) {
                int i = this.LLIZLLLIL;
                if (textExtraStruct.getType() == 0) {
                    if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        MentionSpan mentionSpan = new MentionSpan(i, editableLLLZZIL.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getSecUid());
                        if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                            mentionSpan.setAwemeId(textExtraStruct.getAwemeId());
                        }
                        editableLLLZZIL.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        C0FLJ c0flj = new C0FLJ(textExtraStruct.getStart(), textExtraStruct.getEnd());
                        List<C0FLJ> list3 = this.LLJILJIL;
                        if (list3 != null) {
                            ((ArrayList) list3).add(c0flj);
                        }
                    }
                } else if (textExtraStruct.getType() == 8) {
                    C0FLJ c0flj2 = new C0FLJ(textExtraStruct.getStart(), textExtraStruct.getEnd());
                    List<C0FLJ> list4 = this.LLJILJIL;
                    if (list4 != null) {
                        ((ArrayList) list4).add(c0flj2);
                    }
                } else if (textExtraStruct.getType() == 9) {
                    C0FLJ c0flj3 = new C0FLJ(textExtraStruct.getStart(), textExtraStruct.getEnd());
                    List<C0FLJ> list5 = this.LLJILJIL;
                    if (list5 != null) {
                        ((ArrayList) list5).add(c0flj3);
                    }
                }
            }
        }
    }

    public final void LJIIJJI(String str) {
        ArrayList<TextExtraStruct> mentionExtraStructList = getMentionExtraStructList();
        if (mentionExtraStructList != null && str != null && str.length() != 0) {
            InterfaceC1353580lKO interfaceC1353580lKO = this.LLJILLL;
            if (interfaceC1353580lKO != null) {
                interfaceC1353580lKO.LIZJ(false);
            }
            for (TextExtraStruct textExtraStruct : mentionExtraStructList) {
                if (TextUtils.equals(str, textExtraStruct.getUserId())) {
                    int end = textExtraStruct.getEnd();
                    int i = end + 1;
                    if (i <= C2204961BRm.LLLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)).length() && ' ' == C2204961BRm.LLLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)).charAt(end)) {
                        end = i;
                    }
                    C2204961BRm.LLLZZ(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)).delete(textExtraStruct.getStart(), end);
                    InterfaceC1353580lKO interfaceC1353580lKO2 = this.LLJILLL;
                    if (interfaceC1353580lKO2 != null) {
                        interfaceC1353580lKO2.LIZJ(true);
                        return;
                    }
                    return;
                }
            }
            InterfaceC1353580lKO interfaceC1353580lKO3 = this.LLJILLL;
            if (interfaceC1353580lKO3 != null) {
                interfaceC1353580lKO3.LIZJ(true);
            }
        }
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        if (textWatcher == null) {
            return;
        }
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLJJ;
        if (list != null) {
            list.add(textWatcher);
        }
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0lKI
            public final C1353500lKG LIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) throws Throwable {
                MentionSpan[] mentionSpanArr;
                C1353500lKG c1353500lKG = this.LIZIZ;
                View.OnKeyListener onKeyListener = c1353500lKG.LLJJIJI;
                if (onKeyListener != null) {
                    return onKeyListener.onKey(c1353500lKG, keyEvent.getKeyCode(), keyEvent);
                }
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    int selectionStart = this.LIZ.getSelectionStart();
                    int selectionEnd = this.LIZ.getSelectionEnd();
                    C0FLJ c0fljLJIIJ = this.LIZIZ.LJIIJ(selectionStart, selectionEnd);
                    if (c0fljLJIIJ == null) {
                        this.LIZIZ.LLJI = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    C1353500lKG c1353500lKG2 = this.LIZIZ;
                    boolean z = c1353500lKG2.LLJI;
                    if (!z && selectionStart == selectionEnd && selectionStart == c0fljLJIIJ.LIZ) {
                        return super.sendKeyEvent(keyEvent);
                    }
                    if (!z && selectionStart != c0fljLJIIJ.LIZ) {
                        c1353500lKG2.LLJI = true;
                        c1353500lKG2.LLJIJIL = c0fljLJIIJ;
                        InterfaceC1353580lKO interfaceC1353580lKO = c1353500lKG2.LLJILLL;
                        if (interfaceC1353580lKO != null) {
                            interfaceC1353580lKO.LIZJ(false);
                        }
                        if (Build.VERSION.SDK_INT >= 25) {
                            setSelection(c0fljLJIIJ.LIZ, c0fljLJIIJ.LIZIZ);
                            return true;
                        }
                        setSelection(c0fljLJIIJ.LIZIZ, c0fljLJIIJ.LIZ);
                        return true;
                    }
                    c1353500lKG2.LLJI = false;
                    Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
                    if (editableLLLZZIL != null && (mentionSpanArr = (MentionSpan[]) editableLLLZZIL.getSpans(c0fljLJIIJ.LIZ, c0fljLJIIJ.LIZIZ, MentionSpan.class)) != null && mentionSpanArr.length != 0) {
                        this.LIZIZ.getMentionSpan();
                        C1353500lKG c1353500lKG3 = this.LIZIZ;
                        for (MentionSpan mentionSpan : mentionSpanArr) {
                            InterfaceC1353580lKO interfaceC1353580lKO2 = c1353500lKG3.LLJILLL;
                            if (interfaceC1353580lKO2 != null) {
                                String strLIZJ = mentionSpan.LIZJ();
                                if (strLIZJ == null) {
                                    strLIZJ = "";
                                }
                                interfaceC1353580lKO2.LIZLLL(strLIZJ);
                            }
                        }
                    }
                    InterfaceC1353580lKO interfaceC1353580lKO3 = this.LIZIZ.LLJILLL;
                    if (interfaceC1353580lKO3 != null) {
                        interfaceC1353580lKO3.LIZJ(true);
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
                boolean z;
                int i3 = i2;
                if (((Number) C0A8J.LIZ.getValue()).intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return sendKeyEvent(new KeyEvent(0, 67));
                }
                if (i == 1) {
                    if (i3 == 0) {
                        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
                        if (editableLLLZZIL != null && editableLLLZZIL.length() != 0) {
                            C1353500lKG c1353500lKG = this.LIZIZ;
                            c1353500lKG.getClass();
                            int length = editableLLLZZIL.length();
                            int iMax = Math.max(c1353500lKG.getSelectionStart() - i, 0);
                            int iMin = Math.min(c1353500lKG.getSelectionEnd(), length);
                            C089E c089e = new C089E(editableLLLZZIL.getSpans(0, length, CharacterStyle.class));
                            int i4 = iMax;
                            int i5 = iMin;
                            boolean z2 = false;
                            boolean z3 = false;
                            while (c089e.hasNext()) {
                                CharacterStyle characterStyle = (CharacterStyle) c089e.next();
                                if (!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).getType() != 1) {
                                    int spanStart = editableLLLZZIL.getSpanStart(characterStyle);
                                    int spanEnd = editableLLLZZIL.getSpanEnd(characterStyle);
                                    if (!z2 && spanStart <= iMax && spanEnd > iMax) {
                                        z2 = true;
                                        i4 = spanStart;
                                    }
                                    if (!z3 && spanStart < iMin && spanEnd >= iMin) {
                                        z3 = true;
                                        i5 = spanEnd;
                                    }
                                    if (z2 && z3) {
                                        break;
                                    }
                                }
                            }
                            if (i4 > i5) {
                                int i6 = i5;
                                i5 = i4;
                                i4 = i6;
                            }
                            C0FLJ c0fljLJIIJ = this.LIZIZ.LJIIJ(i4, i5);
                            if (c0fljLJIIJ != null) {
                                MentionSpan[] mentionSpanArr = (MentionSpan[]) editableLLLZZIL.getSpans(c0fljLJIIJ.LIZ, c0fljLJIIJ.LIZIZ, MentionSpan.class);
                                if (mentionSpanArr != null && mentionSpanArr.length != 0) {
                                    this.LIZIZ.getMentionSpan();
                                    C1353500lKG c1353500lKG2 = this.LIZIZ;
                                    for (MentionSpan mentionSpan : mentionSpanArr) {
                                        InterfaceC1353580lKO interfaceC1353580lKO = c1353500lKG2.LLJILLL;
                                        if (interfaceC1353580lKO != null) {
                                            String strLIZJ = mentionSpan.LIZJ();
                                            if (strLIZJ == null) {
                                                strLIZJ = "";
                                            }
                                            interfaceC1353580lKO.LIZLLL(strLIZJ);
                                        }
                                    }
                                    if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                                        return false;
                                    }
                                    return true;
                                }
                                CommentLinkProductSpan[] commentLinkProductSpanArr = (CommentLinkProductSpan[]) editableLLLZZIL.getSpans(c0fljLJIIJ.LIZ, c0fljLJIIJ.LIZIZ, CommentLinkProductSpan.class);
                                if (commentLinkProductSpanArr != null && commentLinkProductSpanArr.length != 0) {
                                    if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                                        return false;
                                    }
                                    return true;
                                }
                            }
                            editableLLLZZIL.delete(i4, i5);
                        }
                        return false;
                    }
                } else if (i < 0) {
                    int i7 = -i3;
                    i3 = -i;
                    i = i7;
                }
                return super.deleteSurroundingText(i, i3);
            }

            {
                this.LIZ = this;
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Throwable {
        int length;
        if (!(parcelable instanceof CommentEditText$MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CommentEditText$MentionSavedState commentEditText$MentionSavedState = (CommentEditText$MentionSavedState) parcelable;
        super.onRestoreInstanceState(commentEditText$MentionSavedState.getSuperState());
        setText(commentEditText$MentionSavedState.text);
        if (C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null)) != null) {
            int i = commentEditText$MentionSavedState.selectionEnd;
            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
            if (editableLLLZZIL != null) {
                length = editableLLLZZIL.length();
            } else {
                length = 0;
            }
            int iMin = Math.min(i, length);
            if (iMin >= 0) {
                setSelection(iMin);
            }
            setTextExtraList(commentEditText$MentionSavedState.structs);
            setEmojiSpanList(commentEditText$MentionSavedState.emojis);
        }
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322 || i == 16908337) {
            Iterator<InterfaceC1349190lDJ> it2 = this.LLJJI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object[] spans;
        CommentLinkProductSpan commentLinkProductSpan;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            int iU3 = C786410Ut5.U3(getLayout(), getLayout().getLineForVertical((int) motionEvent.getY()), (int) motionEvent.getX());
            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
            if (editableLLLZZIL != null && (spans = editableLLLZZIL.getSpans(iU3, iU3, CommentLinkProductSpan.class)) != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3 && (commentLinkProductSpan = (CommentLinkProductSpan) C13LQ.LJJIFFI(spans)) != null) {
                                commentLinkProductSpan.LIZLLL(false);
                            }
                        } else {
                            CommentLinkProductSpan commentLinkProductSpan2 = (CommentLinkProductSpan) C13LQ.LJJIFFI(spans);
                            if (commentLinkProductSpan2 != null) {
                                commentLinkProductSpan2.LIZLLL(false);
                            }
                        }
                    } else {
                        CommentLinkProductSpan commentLinkProductSpan3 = (CommentLinkProductSpan) C13LQ.LJJIFFI(spans);
                        if (commentLinkProductSpan3 != null) {
                            commentLinkProductSpan3.LIZLLL(false);
                        }
                    }
                } else {
                    CommentLinkProductSpan commentLinkProductSpan4 = (CommentLinkProductSpan) C13LQ.LJJIFFI(spans);
                    if (commentLinkProductSpan4 != null) {
                        commentLinkProductSpan4.LIZLLL(true);
                    }
                    CommentLinkProductSpan commentLinkProductSpan5 = (CommentLinkProductSpan) C13LQ.LJJIFFI(spans);
                    if (commentLinkProductSpan5 != null) {
                        commentLinkProductSpan5.LIZJ();
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        if (textWatcher == null) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.LLJJ;
        if (list != null) {
            list.remove(textWatcher);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        if (C1347610lAl.LIZIZ() && inputFilterArr != null) {
            ArrayList arrayList = new ArrayList();
            for (InputFilter inputFilter : inputFilterArr) {
                if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                    arrayList.add(inputFilter);
                }
            }
            InputFilter[] inputFilterArr2 = (InputFilter[]) arrayList.toArray(new InputFilter[0]);
            if (inputFilterArr2 != null && inputFilterArr2.length != 0) {
                inputFilterArr = inputFilterArr2;
            }
        }
        super.setFilters(inputFilterArr);
    }

    public final void setMentionTextColor(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setMentionTextTypeface(int i) {
        this.LLJ = i;
    }

    public final void setOnGroupChatOperateListener(final InterfaceC1353620lKS interfaceC1353620lKS) {
        final AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 265);
        addTextChangedListener(new TextWatcher(awS565S0100000_21, interfaceC1353620lKS) { // from class: X.0lKF
            public final Function0<Boolean> LL;
            public final InterfaceC1353620lKS LLILLJJLI;
            public CommentGroupChatSpan LLILLL;

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Long lValueOf;
                String string;
                TextExtraStruct textExtraStructLIZ;
                TextExtraStruct textExtraStructLIZ2;
                if (editable == null) {
                    return;
                }
                CommentGroupChatSpan commentGroupChatSpan = (CommentGroupChatSpan) C13LQ.LJJIFFI(editable.getSpans(0, editable.length(), CommentGroupChatSpan.class));
                if (commentGroupChatSpan == null && this.LLILLL != null && !this.LL.invoke().booleanValue()) {
                    CommentGroupChatSpan commentGroupChatSpan2 = this.LLILLL;
                    String groupScene = null;
                    if (commentGroupChatSpan2 != null && (textExtraStructLIZ2 = commentGroupChatSpan2.LIZ()) != null) {
                        lValueOf = Long.valueOf(textExtraStructLIZ2.getGroupId());
                    } else {
                        lValueOf = null;
                    }
                    CommentGroupChatSpan commentGroupChatSpan3 = this.LLILLL;
                    if (commentGroupChatSpan3 != null && (textExtraStructLIZ = commentGroupChatSpan3.LIZ()) != null) {
                        groupScene = textExtraStructLIZ.getGroupScene();
                    }
                    InterfaceC1353620lKS interfaceC1353620lKS2 = this.LLILLJJLI;
                    if (lValueOf == null || (string = lValueOf.toString()) == null) {
                        string = "";
                    }
                    interfaceC1353620lKS2.LIZ(string, groupScene);
                }
                this.LLILLL = commentGroupChatSpan;
            }

            {
                this.LL = awS565S0100000_21;
                this.LLILLJJLI = interfaceC1353620lKS;
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CommentGroupChatSpan commentGroupChatSpan;
                if (charSequence instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence;
                    commentGroupChatSpan = (CommentGroupChatSpan) C13LQ.LJJIFFI(spannable.getSpans(0, spannable.length(), CommentGroupChatSpan.class));
                } else {
                    commentGroupChatSpan = null;
                }
                this.LLILLL = commentGroupChatSpan;
            }
        });
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.LLJJIJI = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public final void setOnLinkSpanClickListener(InterfaceC1340320kz0 interfaceC1340320kz0) {
        this.LLJILJILJ = interfaceC1340320kz0;
    }

    public final void setOnMentionSpanDeleteListener(InterfaceC1353580lKO interfaceC1353580lKO) {
        this.LLJILLL = interfaceC1353580lKO;
    }

    public final void setOnPasteListeners(List<InterfaceC1349190lDJ> list) {
        this.LLJJI = list;
    }

    public final void setSkipGroupChatSpanDeleteEvent(boolean z) {
        this.LLJJIII = z;
    }

    public final void setTextWatcherList(List<TextWatcher> list) {
        this.LLJJ = list;
    }

    public final C0FLJ LJIIJ(int i, int i2) {
        List<C0FLJ> list = this.LLJILJIL;
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
        C0FLJ c0flj = this.LLJIJIL;
        if (c0flj != null && c0flj.LIZJ(i, i2)) {
            return;
        }
        C0FLJ c0fljLJIIJ = LJIIJ(i, i2);
        if (c0fljLJIIJ != null && c0fljLJIIJ.LIZIZ == i2) {
            this.LLJI = false;
        }
        List<C0FLJ> list = this.LLJILJIL;
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

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Hep] */
    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) throws Throwable {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLIZ == null) {
            this.LLIZ = new Runnable(this) { // from class: X.0Hep
                public final WeakReference<C1353500lKG> LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CommentEditText$SetSelectionRunnable@4b7e.run");
                    try {
                        C1353500lKG c1353500lKG = this.LL.get();
                        if (c1353500lKG != null) {
                            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
                            c1353500lKG.setSelection(editableLLLZZIL != null ? editableLLLZZIL.length() : 0);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CommentEditText$SetSelectionRunnable@4b7e.run");
                }

                {
                    this.LL = new WeakReference<>(this);
                }
            };
        }
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
        if (editableLLLZZIL != null && editableLLLZZIL.length() != 0) {
            HandlerHook.viewPost(this, this.LLIZ);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1353500lKG(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int iIntValue;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xv;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLJ = 1;
        this.LLJJ = new ArrayList();
        this.LLJJI = new ArrayList();
        setImeOptions(268435456);
        this.LLJILJIL = new ArrayList(6);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLIZLLLIL = iIntValue;
        addTextChangedListener(new TextWatcher() { // from class: X.0Gur
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                if (i5 == 1 && !TextUtils.isEmpty(charSequence) && '@' == String.valueOf(charSequence).charAt(i3)) {
                    this.LL.getClass();
                }
            }
        });
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
        if (C1347610lAl.LIZ().enable == 1) {
            InputFilter[] filters = getFilters();
            filters = filters == null ? new InputFilter[0] : filters;
            InputFilter noConsecutiveNewlineFilter = getNoConsecutiveNewlineFilter();
            int length = filters.length;
            Object[] objArrCopyOf = Arrays.copyOf(filters, length + 1);
            objArrCopyOf[length] = noConsecutiveNewlineFilter;
            setFilters((InputFilter[]) objArrCopyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(long r20, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353500lKG.LJIIIZ(long, java.lang.String, java.lang.String):void");
    }

    public final boolean LJIIIIZZ(int i, String str, String str2, String str3) throws Throwable {
        List listAsList;
        int selectionStart = getSelectionStart();
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
        if (editableLLLZZIL == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.g);
        sbLIZ.append(str);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        MentionSpan mentionSpan = new MentionSpan(this.LLIZLLLIL, i, spannableString.toString(), str2, str3);
        C786410Ut5.p2(spannableString, mentionSpan, 0, spannableString.length(), 33);
        if (this.LLJ != 0) {
            C786410Ut5.p2(spannableString, new StyleSpan(this.LLJ), 0, spannableString.length(), 33);
        }
        MentionSpan[] mentionSpan2 = getMentionSpan();
        if (mentionSpan2 != null && (listAsList = Arrays.asList(mentionSpan2)) != null && listAsList.contains(mentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(editableLLLZZIL)) {
            editableLLLZZIL.insert(0, spannableString);
            editableLLLZZIL.append((CharSequence) " ");
            return true;
        }
        int length = editableLLLZZIL.length();
        if (selectionStart >= 0 && selectionStart <= length) {
            InterfaceC1353580lKO interfaceC1353580lKO = this.LLJILLL;
            if (interfaceC1353580lKO != null) {
                interfaceC1353580lKO.LIZIZ(false);
            }
            if (selectionStart > 0) {
                int i2 = selectionStart - 1;
                if (TextUtils.equals(editableLLLZZIL.subSequence(i2, selectionStart), e3.g)) {
                    InterfaceC1353580lKO interfaceC1353580lKO2 = this.LLJILLL;
                    if (interfaceC1353580lKO2 != null) {
                        interfaceC1353580lKO2.LIZ();
                    }
                    editableLLLZZIL.delete(i2, selectionStart);
                    length--;
                    selectionStart = i2;
                }
            }
            int iMin = Math.min(length, Math.max(0, selectionStart));
            editableLLLZZIL.insert(iMin, spannableString);
            editableLLLZZIL.insert(Math.min(iMin + spannableString.length(), editableLLLZZIL.length()), " ");
            InterfaceC1353580lKO interfaceC1353580lKO3 = this.LLJILLL;
            if (interfaceC1353580lKO3 != null) {
                interfaceC1353580lKO3.LIZIZ(true);
            }
        }
        return true;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        List<C0FLJ> list;
        this.LLJI = false;
        List<C0FLJ> list2 = this.LLJILJIL;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
        if (editableLLLZZIL != null && editableLLLZZIL.length() != 0) {
            MentionSpan[] mentionSpan = getMentionSpan();
            if (mentionSpan != null && mentionSpan.length != 0) {
                C089E c089e = new C089E(mentionSpan);
                while (c089e.hasNext()) {
                    MentionSpan mentionSpan2 = (MentionSpan) c089e.next();
                    int spanStart = editableLLLZZIL.getSpanStart(mentionSpan2);
                    int spanEnd = editableLLLZZIL.getSpanEnd(mentionSpan2);
                    C0FLJ c0flj = new C0FLJ(spanStart, spanEnd);
                    if (!TextUtils.equals(editableLLLZZIL.subSequence(spanStart, spanEnd).toString(), mentionSpan2.LIZIZ())) {
                        editableLLLZZIL.removeSpan(mentionSpan2);
                    } else if (mentionSpan2.getType() == 0 && (list = this.LLJILJIL) != null) {
                        ((ArrayList) list).add(c0flj);
                    }
                }
            }
            CommentLinkProductSpan[] commentLinkProductSpanArr = (CommentLinkProductSpan[]) C1353540lKK.LIZJ(editableLLLZZIL, CommentLinkProductSpan.class);
            if (commentLinkProductSpanArr != null && commentLinkProductSpanArr.length != 0) {
                C089E c089e2 = new C089E(commentLinkProductSpanArr);
                while (c089e2.hasNext()) {
                    CommentLinkProductSpan commentLinkProductSpan = (CommentLinkProductSpan) c089e2.next();
                    int spanStart2 = editableLLLZZIL.getSpanStart(commentLinkProductSpan);
                    int spanEnd2 = editableLLLZZIL.getSpanEnd(commentLinkProductSpan);
                    C0FLJ c0flj2 = new C0FLJ(spanStart2, spanEnd2);
                    if (!TextUtils.equals(editableLLLZZIL.subSequence(spanStart2, spanEnd2).toString(), commentLinkProductSpan.LIZIZ())) {
                        editableLLLZZIL.removeSpan(commentLinkProductSpan);
                    } else {
                        List<C0FLJ> list3 = this.LLJILJIL;
                        if (list3 != null) {
                            ((ArrayList) list3).add(c0flj2);
                        }
                    }
                }
            }
            CommentGroupChatSpan[] commentGroupChatSpanArr = (CommentGroupChatSpan[]) C1353540lKK.LIZJ(editableLLLZZIL, CommentGroupChatSpan.class);
            if (commentGroupChatSpanArr != null && commentGroupChatSpanArr.length != 0) {
                C089E c089e3 = new C089E(commentGroupChatSpanArr);
                while (c089e3.hasNext()) {
                    CommentGroupChatSpan commentGroupChatSpan = (CommentGroupChatSpan) c089e3.next();
                    int spanStart3 = editableLLLZZIL.getSpanStart(commentGroupChatSpan);
                    int spanEnd3 = editableLLLZZIL.getSpanEnd(commentGroupChatSpan);
                    C0FLJ c0flj3 = new C0FLJ(spanStart3, spanEnd3);
                    if (!TextUtils.equals(editableLLLZZIL.subSequence(spanStart3, spanEnd3).toString(), commentGroupChatSpan.LIZJ())) {
                        editableLLLZZIL.removeSpan(commentGroupChatSpan);
                    } else {
                        List<C0FLJ> list4 = this.LLJILJIL;
                        if (list4 != null) {
                            ((ArrayList) list4).add(c0flj3);
                        }
                    }
                }
            }
        }
    }
}
