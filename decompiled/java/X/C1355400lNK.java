package X;

import Y.AComparatorS518S0100000_21;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.ui.HashTagSpan;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355400lNK extends C0I7D {
    public InterfaceC1355390lNJ LLIZ;
    public InterfaceC1355420lNM LLIZLLLIL;
    public final C01GW LLJ;

    private final int getHashTagColor() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    public final List<String> getTagSpan() throws Throwable {
        Editable editableB = C2204961BRm.b(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
        HashTagSpan[] hashTagSpanArrLJIIIIZZ = editableB != null ? LJIIIIZZ(editableB) : new HashTagSpan[0];
        ArrayList arrayList = new ArrayList();
        for (HashTagSpan hashTagSpan : hashTagSpanArrLJIIIIZZ) {
            String str = hashTagSpan.tagText;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final InterfaceC1355420lNM getAddHashTagListener() {
        return this.LLIZLLLIL;
    }

    public final InterfaceC1355390lNJ getHashTagListener() {
        return this.LLIZ;
    }

    public static HashTagSpan[] LJIIIIZZ(Editable editable) {
        if (editable.length() == 0) {
            return new HashTagSpan[0];
        }
        HashTagSpan[] hashTagSpanArr = (HashTagSpan[]) editable.getSpans(0, editable.length(), HashTagSpan.class);
        Arrays.sort(hashTagSpanArr, new AComparatorS518S0100000_21(editable, 5));
        return hashTagSpanArr;
    }

    public final void LJIIIZ(String str) throws Throwable {
        String string;
        int iLJJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new HashTagSpan(getHashTagColor(), str, 0), 0, strLIZIZ.length(), 33);
        C786410Ut5.p2(spannableString, new C444920HcY(102, false), 0, strLIZIZ.length(), 33);
        Editable editableB = C2204961BRm.b(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
        if (editableB != null && (string = editableB.toString()) != null && (iLJJJ = a0.LJJJ(string, strLIZIZ, 0, false, 6)) >= 0) {
            C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).replace(iLJJJ, strLIZIZ.length() + iLJJJ, "");
            C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).insert(iLJJJ, spannableString);
            setSelection(C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).length());
        }
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection, this) { // from class: X.0lNI
            public final C1355400lNK LIZ;
            public boolean LIZIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) throws Throwable {
                HashTagSpan[] hashTagSpanArr;
                int selectionStart = this.LIZ.getSelectionStart();
                int selectionEnd = this.LIZ.getSelectionEnd();
                if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
                    C0FLJ c0fljLIZIZ = LIZIZ(selectionStart, selectionEnd);
                    if (c0fljLIZIZ == null) {
                        this.LIZIZ = false;
                        return super.sendKeyEvent(keyEvent);
                    }
                    if (!this.LIZIZ) {
                        if (selectionStart == selectionEnd && selectionStart == c0fljLIZIZ.LIZ) {
                            return super.sendKeyEvent(keyEvent);
                        }
                        int i = c0fljLIZIZ.LIZ;
                        if (selectionStart != i) {
                            this.LIZIZ = true;
                            if (Build.VERSION.SDK_INT >= 25) {
                                setSelection(i, c0fljLIZIZ.LIZIZ);
                                return true;
                            }
                            setSelection(c0fljLIZIZ.LIZIZ, i);
                            return true;
                        }
                    }
                    this.LIZIZ = false;
                    Editable editableB = C2204961BRm.b(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
                    if (editableB != null && (hashTagSpanArr = (HashTagSpan[]) editableB.getSpans(c0fljLIZIZ.LIZ, c0fljLIZIZ.LIZIZ, HashTagSpan.class)) != null) {
                        int length = hashTagSpanArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            HashTagSpan hashTagSpan = hashTagSpanArr[i2];
                            if (hashTagSpan.tagType != 0) {
                                InterfaceC1355390lNJ hashTagListener = this.LIZJ.getHashTagListener();
                                if (hashTagListener != null) {
                                    String str = hashTagSpan.tagText;
                                    if (str == null) {
                                        str = "";
                                    }
                                    hashTagListener.LIZ(str);
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    return super.sendKeyEvent(keyEvent);
                }
                C0FLJ c0fljLIZIZ2 = LIZIZ(selectionStart, selectionEnd);
                if (c0fljLIZIZ2 != null && c0fljLIZIZ2.LIZIZ == selectionEnd) {
                    this.LIZIZ = false;
                }
                return super.sendKeyEvent(keyEvent);
            }

            public final C0FLJ LIZIZ(int i, int i2) throws Throwable {
                int spanStart;
                int spanEnd;
                Editable editableB = C2204961BRm.b(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
                if (editableB != null) {
                    this.LIZJ.getClass();
                    HashTagSpan[] hashTagSpanArrLJIIIIZZ = C1355400lNK.LJIIIIZZ(editableB);
                    if (hashTagSpanArrLJIIIIZZ != null) {
                        for (HashTagSpan hashTagSpan : hashTagSpanArrLJIIIIZZ) {
                            Editable editableB2 = C2204961BRm.b(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
                            if (editableB2 != null) {
                                spanStart = editableB2.getSpanStart(hashTagSpan);
                            } else {
                                spanStart = 0;
                            }
                            Editable editableB3 = C2204961BRm.b(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
                            if (editableB3 != null) {
                                spanEnd = editableB3.getSpanEnd(hashTagSpan);
                            } else {
                                spanEnd = 0;
                            }
                            if (new C0FLJ(spanStart, spanEnd).LIZ(i, i2)) {
                                return new C0FLJ(spanStart, spanEnd);
                            }
                        }
                    }
                }
                return null;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) throws Throwable {
                HashTagSpan[] hashTagSpanArr;
                int selectionStart = this.LIZ.getSelectionStart();
                int selectionEnd = this.LIZ.getSelectionEnd();
                C0FLJ c0fljLIZIZ = LIZIZ(selectionStart, selectionEnd);
                boolean zCommitText = true;
                if (c0fljLIZIZ != null && selectionStart != selectionEnd && selectionStart != c0fljLIZIZ.LIZ) {
                    Editable editableB = C2204961BRm.b(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
                    if (editableB != null && (hashTagSpanArr = (HashTagSpan[]) editableB.getSpans(c0fljLIZIZ.LIZ, c0fljLIZIZ.LIZIZ, HashTagSpan.class)) != null) {
                        int length = hashTagSpanArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            HashTagSpan hashTagSpan = hashTagSpanArr[i2];
                            if (hashTagSpan.tagType != 0) {
                                InterfaceC1355390lNJ hashTagListener = this.LIZJ.getHashTagListener();
                                if (hashTagListener != null) {
                                    String str = hashTagSpan.tagText;
                                    if (str == null) {
                                        str = "";
                                    }
                                    hashTagListener.LIZ(str);
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                    Editable editableB2 = C2204961BRm.b(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
                    if (editableB2 != null) {
                        editableB2.delete(c0fljLIZIZ.LIZ, c0fljLIZIZ.LIZIZ);
                        if (charSequence != null) {
                            editableB2.insert(c0fljLIZIZ.LIZ, new SpannableString(charSequence));
                            this.LIZ.setSelection(c0fljLIZIZ.LIZ + charSequence.length());
                        }
                    }
                    return true;
                }
                try {
                    zCommitText = super.commitText(charSequence, i);
                    return zCommitText;
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return zCommitText;
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) throws Throwable {
                HashTagSpan[] hashTagSpanArr;
                if (i == 1) {
                    if (i2 == 0) {
                        Editable editableB = C2204961BRm.b(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
                        if (editableB != null && editableB.length() != 0) {
                            int length = editableB.length();
                            int iMax = Math.max(this.LIZ.getSelectionStart() - i, 0);
                            int iMin = Math.min(this.LIZ.getSelectionEnd(), length);
                            C089E c089e = new C089E(editableB.getSpans(0, length, CharacterStyle.class));
                            int i3 = iMax;
                            int i4 = iMin;
                            boolean z = false;
                            boolean z2 = false;
                            while (c089e.hasNext()) {
                                Object next = c089e.next();
                                if (!(next instanceof HashTagSpan)) {
                                    int spanStart = editableB.getSpanStart(next);
                                    int spanEnd = editableB.getSpanEnd(next);
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
                            C0FLJ c0fljLIZIZ = LIZIZ(i3, i4);
                            if (c0fljLIZIZ != null && (hashTagSpanArr = (HashTagSpan[]) editableB.getSpans(c0fljLIZIZ.LIZ, c0fljLIZIZ.LIZIZ, HashTagSpan.class)) != null) {
                                int length2 = hashTagSpanArr.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length2) {
                                        break;
                                    }
                                    HashTagSpan hashTagSpan = hashTagSpanArr[i6];
                                    if (hashTagSpan.tagType != 0) {
                                        InterfaceC1355390lNJ hashTagListener = this.LIZJ.getHashTagListener();
                                        if (hashTagListener != null) {
                                            String str = hashTagSpan.tagText;
                                            if (str == null) {
                                                str = "";
                                            }
                                            hashTagListener.LIZ(str);
                                        }
                                    } else {
                                        i6++;
                                    }
                                }
                                if (hashTagSpanArr.length != 0) {
                                    if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
                            editableB.delete(i3, i4);
                        }
                        return false;
                    }
                } else if (i < 0) {
                    return super.deleteSurroundingText(-i2, -i);
                }
                return super.deleteSurroundingText(i, i2);
            }

            {
                this.LIZ = this;
            }
        };
    }

    public final void setAddHashTagListener(InterfaceC1355420lNM interfaceC1355420lNM) {
        this.LLIZLLLIL = interfaceC1355420lNM;
    }

    public final void setHashTagListener(InterfaceC1355390lNJ interfaceC1355390lNJ) {
        this.LLIZ = interfaceC1355390lNJ;
    }

    public C1355400lNK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
        setVerticalScrollBarEnabled(true);
        setMovementMethod(ScrollingMovementMethod.getInstance());
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
        this.LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 11));
    }

    public final void LJIIJ(Boolean bool, String str) {
        int length;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).insert(C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).length(), " ");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('#');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Editable editableB = C2204961BRm.b(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null));
        if (editableB != null) {
            length = editableB.length();
        } else {
            length = 0;
        }
        if (length + strLIZIZ.length() >= 400) {
            InterfaceC1355420lNM interfaceC1355420lNM = this.LLIZLLLIL;
            if (interfaceC1355420lNM != null) {
                interfaceC1355420lNM.LIZ(strLIZIZ, false);
                return;
            }
            return;
        }
        InterfaceC1355420lNM interfaceC1355420lNM2 = this.LLIZLLLIL;
        if (interfaceC1355420lNM2 != null) {
            interfaceC1355420lNM2.LIZ(strLIZIZ, true);
        }
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new HashTagSpan(getHashTagColor(), str, 1), 0, strLIZIZ.length(), 33);
        C786410Ut5.p2(spannableString, new C444920HcY(102, false), 0, strLIZIZ.length(), 33);
        C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).insert(C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).length(), spannableString);
        setSelection(C2204961BRm.a(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHepkb7DBaZ3nciGAjEBj+8CKjxXd2cgYeS2tuKV2I9jfJckz6XGypjFg==", null)).length());
    }
}
