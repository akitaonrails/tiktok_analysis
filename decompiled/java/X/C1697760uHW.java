package X;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1697760uHW extends C1697720uHS {
    @Override // X.C1697720uHS, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.LIZIZ;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    @Override // X.C1697720uHS
    public final void LIZIZ(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    public C1697760uHW(InputConnection inputConnection, AwS604S0100000_25 awS604S0100000_25) {
        super(inputConnection, awS604S0100000_25);
    }

    @Override // X.C1697720uHS, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.LIZIZ;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }
}
