package X;

import android.os.Build;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.text.mention.MentionSpanData;

/* JADX INFO: renamed from: X.0FLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388640FLq extends InputConnectionWrapper {
    public final C21410318qb LIZ;
    public final /* synthetic */ C0FLB LIZIZ;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            int selectionStart = this.LIZ.getSelectionStart();
            C0FLJ c0fljLJIILJJIL = this.LIZIZ.LJIILJJIL(selectionStart, this.LIZ.getSelectionEnd());
            if (c0fljLJIILJJIL == null) {
                this.LIZIZ.LJIIJJI = false;
                return super.sendKeyEvent(keyEvent);
            }
            C0FLB c0flb = this.LIZIZ;
            if (!c0flb.LJIIJJI && selectionStart != (i = c0fljLJIILJJIL.LIZ)) {
                c0flb.LJIIJJI = true;
                c0flb.LJIIL = c0fljLJIILJJIL;
                if (Build.VERSION.SDK_INT >= 25) {
                    setSelection(i, c0fljLJIILJJIL.LIZIZ);
                    return true;
                }
                setSelection(c0fljLJIILJJIL.LIZIZ, i);
                return true;
            }
            c0flb.LJIIJJI = false;
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
        int[] iArr;
        MentionSpanData[] mentionSpanDataArr;
        if (i == 1) {
            if (i2 == 0) {
                C21410318qb c21410318qbLJIILIIL = this.LIZIZ.LJIILIIL();
                Editable editableLLJILLL = null;
                if (c21410318qbLJIILIIL != null) {
                    editableLLJILLL = C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null));
                }
                if (editableLLJILLL != null && editableLLJILLL.length() != 0) {
                    C21410318qb c21410318qbLJIILIIL2 = this.LIZIZ.LJIILIIL();
                    if (c21410318qbLJIILIIL2 != null) {
                        int length = editableLLJILLL.length();
                        int iMax = Math.max(c21410318qbLJIILIIL2.getSelectionStart() - i, 0);
                        int iMin = Math.min(c21410318qbLJIILIIL2.getSelectionEnd(), length);
                        C089E c089e = new C089E(editableLLJILLL.getSpans(0, length, MentionSpanData.class));
                        int i3 = iMax;
                        int i4 = iMin;
                        boolean z = false;
                        boolean z2 = false;
                        while (c089e.hasNext()) {
                            MentionSpanData mentionSpanData = (MentionSpanData) c089e.next();
                            if (mentionSpanData.type != 1) {
                                int spanStart = editableLLJILLL.getSpanStart(mentionSpanData);
                                int spanEnd = editableLLJILLL.getSpanEnd(mentionSpanData);
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
                        iArr = new int[]{i3, i4};
                    } else {
                        iArr = new int[0];
                    }
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    if (i5 > i6) {
                        i5 = i6;
                        i6 = i5;
                    }
                    C0FLJ c0fljLJIILJJIL = this.LIZIZ.LJIILJJIL(i5, i6);
                    if (c0fljLJIILJJIL != null && (mentionSpanDataArr = (MentionSpanData[]) editableLLJILLL.getSpans(c0fljLJIILJJIL.LIZ, c0fljLJIILJJIL.LIZIZ, MentionSpanData.class)) != null && mentionSpanDataArr.length != 0) {
                        if (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67))) {
                            return true;
                        }
                        return false;
                    }
                    editableLLJILLL.delete(i5, i6);
                }
                return false;
            }
        } else if (i < 0) {
            int i7 = -i2;
            i2 = -i;
            i = i7;
        }
        return super.deleteSurroundingText(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C388640FLq(C0FLB c0flb, InputConnection inputConnection, C21410318qb c21410318qb) {
        super(inputConnection, true);
        this.LIZIZ = c0flb;
        this.LIZ = c21410318qb;
    }
}
