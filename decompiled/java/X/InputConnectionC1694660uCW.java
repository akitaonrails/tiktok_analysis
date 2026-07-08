package X;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0uCW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@InterfaceC1294060jmO
public final class InputConnectionC1694660uCW implements InputConnection {
    public final InterfaceC1694670uCX LIZ;
    public final boolean LIZIZ;
    public int LIZJ;
    public C1686970u07 LIZLLL;
    public int LJ;
    public boolean LJFF;
    public final List<InterfaceC1694390uC5> LJI = new ArrayList();
    public boolean LJII = true;

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public final boolean LIZJ() {
        int i = this.LIZJ - 1;
        this.LIZJ = i;
        if (i == 0 && (!this.LJI.isEmpty())) {
            this.LIZ.LIZIZ(new ArrayList(this.LJI));
            ((ArrayList) this.LJI).clear();
        }
        return this.LIZJ > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.LJII;
        if (!z) {
            return z;
        }
        this.LIZJ++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        ((ArrayList) this.LJI).clear();
        this.LIZJ = 0;
        this.LJII = false;
        this.LIZ.LIZLLL(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.LJII;
        if (!z) {
            return z;
        }
        LIZIZ(new C1694340uC0());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return LIZJ();
    }

    public final void LIZIZ(InterfaceC1694390uC5 interfaceC1694390uC5) {
        this.LIZJ++;
        try {
            ((ArrayList) this.LJI).add(interfaceC1694390uC5);
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ();
            throw th;
        }
    }

    public final void LIZLLL(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.LJII;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.LJII;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.LJII;
        if (z) {
            return this.LIZIZ;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C1686970u07 c1686970u07 = this.LIZLLL;
        return TextUtils.getCapsMode(c1686970u07.LIZ.LLILLJJLI, C1692280u8g.LJI(c1686970u07.LIZIZ), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C1692280u8g.LIZJ(this.LIZLLL.LIZIZ)) {
            return null;
        }
        return C1692920u9i.LIZ(this.LIZLLL).LLILLJJLI;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.LJII;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    LIZIZ(new C1694320uBy(0, this.LIZLLL.LIZ.LLILLJJLI.length()));
                    return false;
                case R.id.cut:
                    LIZLLL(277);
                    return false;
                case R.id.copy:
                    LIZLLL(278);
                    return false;
                case R.id.paste:
                    LIZLLL(279);
                    return false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r4) {
        /*
            r3 = this;
            boolean r2 = r3.LJII
            if (r2 == 0) goto L10
            r2 = 1
            if (r4 == 0) goto La
            switch(r4) {
                case 2: goto L11;
                case 3: goto L13;
                case 4: goto L15;
                case 5: goto L17;
                case 6: goto L19;
                case 7: goto L1b;
                default: goto La;
            }
        La:
            r1 = 1
        Lb:
            X.0uCX r0 = r3.LIZ
            r0.LIZJ(r1)
        L10:
            return r2
        L11:
            r1 = 2
            goto Lb
        L13:
            r1 = 3
            goto Lb
        L15:
            r1 = 4
            goto Lb
        L17:
            r1 = 6
            goto Lb
        L19:
            r1 = 7
            goto Lb
        L1b:
            r1 = 5
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.InputConnectionC1694660uCW.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = this.LJII;
        if (z6) {
            boolean z7 = false;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                if ((i & 16) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i & 8) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i & 4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i2 >= 34 && (i & 32) != 0) {
                    z7 = true;
                }
                if (!z4 && !z5 && !z3 && !z7) {
                    if (i2 >= 34) {
                        z4 = true;
                        z5 = true;
                        z3 = true;
                        z7 = true;
                    } else {
                        z7 = false;
                        z4 = true;
                        z5 = true;
                        z3 = true;
                    }
                }
            } else {
                z3 = false;
                z7 = false;
                z4 = true;
                z5 = true;
            }
            this.LIZ.LIZ(z, z2, z4, z5, z3, z7);
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.LJII;
        if (z) {
            this.LIZ.J3(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.LJII;
        if (z) {
            LIZIZ(new C1694270uBt(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZIZ(new C1694400uC6(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZIZ(new C1694410uC7(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.LJFF = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.LJ = i2;
        }
        return C1695900uEW.LIZ(this.LIZLLL);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return C1692920u9i.LIZIZ(this.LIZLLL, i).LLILLJJLI;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C1692920u9i.LIZJ(this.LIZLLL, i).LLILLJJLI;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.LJII;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZIZ(new C1694310uBx(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.LJII;
        if (z) {
            LIZIZ(new C1694280uBu(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.LJII;
        if (z) {
            LIZIZ(new C1694320uBy(i, i2));
            return true;
        }
        return z;
    }

    public InputConnectionC1694660uCW(C1686970u07 c1686970u07, C1694850uCp c1694850uCp, boolean z) {
        this.LIZ = c1694850uCp;
        this.LIZIZ = z;
        this.LIZLLL = c1686970u07;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.LJII;
        if (z) {
            return false;
        }
        return z;
    }
}
