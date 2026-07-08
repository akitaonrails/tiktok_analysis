package X;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1697750uHV extends C1697760uHW {
    public C1697750uHV(InputConnection inputConnection, AwS604S0100000_25 awS604S0100000_25) {
        super(inputConnection, awS604S0100000_25);
    }

    @Override // X.C1697720uHS, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnection inputConnection = this.LIZIZ;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
