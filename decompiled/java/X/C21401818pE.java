package X;

import android.content.res.TypedArray;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.e;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.18pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21401818pE {
    public final EditText LIZ;
    public final C21401018p6 LIZIZ;

    public C21401818pE(EditText editText) {
        this.LIZ = editText;
        this.LIZIZ = new C21401018p6(editText);
    }

    public final KeyListener LIZ(final KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            this.LIZIZ.LIZ.getClass();
            if (!(keyListener instanceof C21402518pL)) {
                if (keyListener == null) {
                    return null;
                }
                if (keyListener instanceof NumberKeyListener) {
                    return keyListener;
                }
                return new KeyListener(keyListener) { // from class: X.18pL
                    public final KeyListener LL;
                    public final C21402618pM LLILLJJLI;

                    @Override // android.text.method.KeyListener
                    public final int getInputType() {
                        return this.LL.getInputType();
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.18pM] */
                    {
                        ?? r0 = new Object() { // from class: X.18pM
                        };
                        this.LL = keyListener;
                        this.LLILLJJLI = r0;
                    }

                    @Override // android.text.method.KeyListener
                    public final void clearMetaKeyState(View view, Editable editable, int i) {
                        this.LL.clearMetaKeyState(view, editable, i);
                    }

                    @Override // android.text.method.KeyListener
                    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
                        return this.LL.onKeyOther(view, editable, keyEvent);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
                    @Override // android.text.method.KeyListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
                        /*
                            r3 = this;
                            X.18pM r0 = r3.LLILLJJLI
                            r0.getClass()
                            r0 = 67
                            r2 = 0
                            r1 = 1
                            if (r6 == r0) goto L23
                            r0 = 112(0x70, float:1.57E-43)
                            if (r6 != r0) goto L1a
                            boolean r0 = X.C21403318pT.LIZ(r5, r7, r1)
                        L13:
                            if (r0 == 0) goto L1a
                            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
                        L18:
                            r2 = 1
                        L19:
                            return r2
                        L1a:
                            android.text.method.KeyListener r0 = r3.LL
                            boolean r0 = r0.onKeyDown(r4, r5, r6, r7)
                            if (r0 == 0) goto L19
                            goto L18
                        L23:
                            boolean r0 = X.C21403318pT.LIZ(r5, r7, r2)
                            goto L13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21402518pL.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
                    }

                    @Override // android.text.method.KeyListener
                    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
                        return this.LL.onKeyUp(view, editable, i, keyEvent);
                    }
                };
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void LIZLLL(boolean z) {
        C21401418pA c21401418pA = this.LIZIZ.LIZ.LIZIZ;
        if (c21401418pA.LLILZ != z) {
            if (c21401418pA.LLILLL != null) {
                e eVarLIZ = e.LIZ();
                C21401518pB c21401518pB = c21401418pA.LLILLL;
                eVarLIZ.getClass();
                C08IF.LIZLLL(c21401518pB, "initCallback cannot be null");
                ((ReentrantReadWriteLock) eVarLIZ.LIZ).writeLock().lock();
                try {
                    eVarLIZ.LIZIZ.remove(c21401518pB);
                    ((ReentrantReadWriteLock) eVarLIZ.LIZ).writeLock().unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((ReentrantReadWriteLock) eVarLIZ.LIZ).writeLock().unlock();
                    throw th;
                }
            }
            c21401418pA.LLILZ = z;
            if (z) {
                C21401418pA.LIZ(c21401418pA.LL, e.LIZ().LIZJ());
            }
        }
    }

    public final void LIZIZ(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.LIZ.getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_emojiCompatEnabled)) {
                z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
            typedArrayObtainStyledAttributes.recycle();
            LIZLLL(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection LIZJ(final InputConnection inputConnection, final EditorInfo editorInfo) {
        C21401018p6 c21401018p6 = this.LIZIZ;
        if (inputConnection == null) {
            c21401018p6.getClass();
            return null;
        }
        C21400918p5 c21400918p5 = c21401018p6.LIZ;
        c21400918p5.getClass();
        if (inputConnection instanceof C21400718p3) {
            return inputConnection;
        }
        final EditText editText = c21400918p5.LIZ;
        return new InputConnectionWrapper(editText, inputConnection, editorInfo) { // from class: X.18p3
            public final TextView LIZ;
            public final C21400618p2 LIZIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) throws Throwable {
                C21400618p2 c21400618p2 = this.LIZIZ;
                Editable editableLLJJ = C2204961BRm.LLJJ(this.LIZ, new C0WZX("dTF6Tg0zW9KSUFouTxvWKDBqnPCbp91NWL3i1h9WvCaYRvtphqUfGkoaw/r9i1kq4kB6y7U=", new String[]{"01789"}));
                c21400618p2.getClass();
                if (!C21400618p2.LIZ(this, editableLLJJ, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
                    return false;
                }
                return true;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingTextInCodePoints(int i, int i2) throws Throwable {
                C21400618p2 c21400618p2 = this.LIZIZ;
                Editable editableLLJJ = C2204961BRm.LLJJ(this.LIZ, new C0WZX("dTF6Tg0zW9KSUFouTxvWKDBqnPCbp91NWL3i1h9WvCaYRvtphqUfGkoaw/r9i1kq4kB6y7U=", new String[]{"01789"}));
                c21400618p2.getClass();
                if (C21400618p2.LIZ(this, editableLLJJ, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
                    return true;
                }
                return false;
            }

            {
                C21400618p2 c21400618p2 = new C21400618p2();
                super(inputConnection, false);
                this.LIZ = editText;
                this.LIZIZ = c21400618p2;
                if (e.LJ()) {
                    e.LIZ().LJIIJJI(editorInfo);
                }
            }
        };
    }
}
