package X;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class InputConnectionC1694650uCV implements InputConnection {
    public final InterfaceC1694680uCY LIZ;
    public final boolean LIZIZ;
    public final C1691930u87 LIZJ;
    public final C1692140u8S LIZLLL;
    public final InterfaceC1374305Zl LJ;
    public int LJFF;
    public C1686970u07 LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public final List<InterfaceC1694390uC5> LJIIIZ = new ArrayList();
    public boolean LJIIJ = true;

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public final boolean LIZJ() {
        int i = this.LJFF - 1;
        this.LJFF = i;
        if (i == 0 && (!this.LJIIIZ.isEmpty())) {
            this.LIZ.LIZIZ(new ArrayList(this.LJIIIZ));
            ((ArrayList) this.LJIIIZ).clear();
        }
        return this.LJFF > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.LJIIJ;
        if (!z) {
            return z;
        }
        this.LJFF++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        ((ArrayList) this.LJIIIZ).clear();
        this.LJFF = 0;
        this.LJIIJ = false;
        this.LIZ.LIZLLL(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.LJIIJ;
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
        this.LJFF++;
        try {
            ((ArrayList) this.LJIIIZ).add(interfaceC1694390uC5);
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
        boolean z = this.LJIIJ;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.LJIIJ;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.LJIIJ;
        if (z) {
            return this.LIZIZ;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C1686970u07 c1686970u07 = this.LJI;
        return TextUtils.getCapsMode(c1686970u07.LIZ.LLILLJJLI, C1692280u8g.LJI(c1686970u07.LIZIZ), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C1692280u8g.LIZJ(this.LJI.LIZIZ)) {
            return null;
        }
        return C1692920u9i.LIZ(this.LJI).LLILLJJLI;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.LJIIJ;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    LIZIZ(new C1694320uBy(0, this.LJI.LIZ.LLILLJJLI.length()));
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
            boolean r2 = r3.LJIIJ
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
            X.0uCY r0 = r3.LIZ
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
        throw new UnsupportedOperationException("Method not decompiled: X.InputConnectionC1694650uCV.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = this.LJIIJ;
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
        boolean z = this.LJIIJ;
        if (z) {
            this.LIZ.J3(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.LJIIJ;
        if (z) {
            LIZIZ(new C1694270uBt(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.LJIIJ;
        if (z) {
            LIZIZ(new C1694400uC6(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.LJIIJ;
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
        this.LJIIIIZZ = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.LJII = i2;
        }
        return C1695910uEX.LIZ(this.LJI);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return C1692920u9i.LIZIZ(this.LJI, i).LLILLJJLI;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C1692920u9i.LIZJ(this.LJI, i).LLILLJJLI;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.LJIIJ;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C1692220u8a c1692220u8a;
        C1692220u8a c1692220u8a2;
        C1692150u8T c1692150u8T;
        C1683230tu5 c1683230tu5;
        if (Build.VERSION.SDK_INT >= 34) {
            C1691930u87 c1691930u87 = this.LIZJ;
            final C1692140u8S c1692140u8S = this.LIZLLL;
            if (c1691930u87 != null && (c1692220u8a = c1691930u87.LJIIIZ) != null) {
                C1691980u8C c1691980u8CLIZLLL = c1691930u87.LIZLLL();
                if (c1691980u8CLIZLLL != null && (c1692150u8T = c1691980u8CLIZLLL.LIZ) != null && (c1683230tu5 = c1692150u8T.LIZ) != null) {
                    c1692220u8a2 = c1683230tu5.LIZ;
                } else {
                    c1692220u8a2 = null;
                }
                if (Intrinsics.LJFF(c1692220u8a, c1692220u8a2)) {
                    if (previewableHandwritingGesture instanceof SelectGesture) {
                        SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                        if (c1692140u8S != null) {
                            C1683130ttv c1683130ttvLIZLLL = C1681300tqy.LIZLLL(selectGesture.getSelectionArea());
                            int iLIZJ = C1694640uCU.LIZJ(selectGesture.getGranularity());
                            InterfaceC1694730uCd.LIZ.getClass();
                            c1692140u8S.LJIJI(C1694610uCR.LJFF(c1691930u87, c1683130ttvLIZLLL, iLIZJ));
                        }
                    } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                        DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                        if (c1692140u8S != null) {
                            C1683130ttv c1683130ttvLIZLLL2 = C1681300tqy.LIZLLL(deleteGesture.getDeletionArea());
                            int iLIZJ2 = C1694640uCU.LIZJ(deleteGesture.getGranularity());
                            InterfaceC1694730uCd.LIZ.getClass();
                            c1692140u8S.LJIILLIIL(C1694610uCR.LJFF(c1691930u87, c1683130ttvLIZLLL2, iLIZJ2));
                        }
                    } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                        SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                        if (c1692140u8S != null) {
                            C1683130ttv c1683130ttvLIZLLL3 = C1681300tqy.LIZLLL(selectRangeGesture.getSelectionStartArea());
                            C1683130ttv c1683130ttvLIZLLL4 = C1681300tqy.LIZLLL(selectRangeGesture.getSelectionEndArea());
                            int iLIZJ3 = C1694640uCU.LIZJ(selectRangeGesture.getGranularity());
                            InterfaceC1694730uCd.LIZ.getClass();
                            c1692140u8S.LJIJI(C1694610uCR.LIZIZ(c1691930u87, c1683130ttvLIZLLL3, c1683130ttvLIZLLL4, iLIZJ3));
                        }
                    } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                        DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                        if (c1692140u8S != null) {
                            C1683130ttv c1683130ttvLIZLLL5 = C1681300tqy.LIZLLL(deleteRangeGesture.getDeletionStartArea());
                            C1683130ttv c1683130ttvLIZLLL6 = C1681300tqy.LIZLLL(deleteRangeGesture.getDeletionEndArea());
                            int iLIZJ4 = C1694640uCU.LIZJ(deleteRangeGesture.getGranularity());
                            InterfaceC1694730uCd.LIZ.getClass();
                            c1692140u8S.LJIILLIIL(C1694610uCR.LIZIZ(c1691930u87, c1683130ttvLIZLLL5, c1683130ttvLIZLLL6, iLIZJ4));
                        }
                    } else {
                        return false;
                    }
                    if (cancellationSignal != null) {
                        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: X.0u96
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                C1692140u8S c1692140u8S2 = c1692140u8S;
                                if (c1692140u8S2 != null) {
                                    C1691930u87 c1691930u872 = c1692140u8S2.LIZLLL;
                                    if (c1691930u872 != null) {
                                        c1691930u872.LJFF(C1692280u8g.LIZIZ);
                                    }
                                    C1691930u87 c1691930u873 = c1692140u8S2.LIZLLL;
                                    if (c1691930u873 != null) {
                                        c1691930u873.LJI(C1692280u8g.LIZIZ);
                                    }
                                }
                            }
                        });
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.LJIIJ;
        if (z) {
            LIZIZ(new C1694310uBx(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.LJIIJ;
        if (z) {
            LIZIZ(new C1694280uBu(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.LJIIJ;
        if (z) {
            LIZIZ(new C1694320uBy(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.LJIIJ;
        if (z) {
            return false;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0327  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r13, java.util.concurrent.Executor r14, final java.util.function.IntConsumer r15) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.InputConnectionC1694650uCV.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    public InputConnectionC1694650uCV(C1686970u07 c1686970u07, C1694840uCo c1694840uCo, boolean z, C1691930u87 c1691930u87, C1692140u8S c1692140u8S, InterfaceC1374305Zl interfaceC1374305Zl) {
        this.LIZ = c1694840uCo;
        this.LIZIZ = z;
        this.LIZJ = c1691930u87;
        this.LIZLLL = c1692140u8S;
        this.LJ = interfaceC1374305Zl;
        this.LJI = c1686970u07;
    }
}
