package X;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20586215gy extends LiveEditText {
    public final List<InterfaceC1115310f85> LLJIJIL;

    public void LJIIIIZZ(int i, int i2) {
    }

    public boolean LJIIIZ(KeyEvent keyEvent) {
        return false;
    }

    public C20586215gy(Context context) {
        super(context, null);
        this.LLJIJIL = new ArrayList();
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection) { // from class: X.15gz
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final void closeConnection() {
                try {
                    super.closeConnection();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1CC2.LIZ("CommentEditText NPE", e);
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final Handler getHandler() {
                try {
                    return super.getHandler();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1CC2.LIZ("CommentEditText NPE", e);
                    return null;
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                if (this.LIZ.LJIIIZ(keyEvent)) {
                    return true;
                }
                return super.sendKeyEvent(keyEvent);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                boolean zCommitText = false;
                if (charSequence.equals("\n")) {
                    sendKeyEvent(new KeyEvent(1, 66));
                    return false;
                }
                try {
                    zCommitText = super.commitText(charSequence, i);
                    return zCommitText;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CommentEditText commitText Exception, text:");
                    sbLIZ.append((Object) charSequence);
                    sbLIZ.append("  newCursorPosition:");
                    sbLIZ.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C20441214yg.LIZIZ("CommentEditText_commitText", strLIZIZ);
                    C1CC2.LIZ(strLIZIZ, e);
                    return zCommitText;
                }
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                this.LIZ.LJIIIIZZ(i, i2);
                return super.deleteSurroundingText(i, i2);
            }
        };
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 || i == 16908337) {
            Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1115310f85) it2.next()).LIZ();
            }
        }
        return zOnTextContextMenuItem;
    }

    public C20586215gy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJIJIL = new ArrayList();
    }
}
