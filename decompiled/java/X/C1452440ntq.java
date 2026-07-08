package X;

import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0ntq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452440ntq {
    public static final boolean LIZ(InterfaceC1452170ntP interfaceC1452170ntP) {
        VEEditor.VEState state = interfaceC1452170ntP.getState();
        if (state == null) {
            state = VEEditor.VEState.ERROR;
        }
        int value = state.getValue();
        if (value > VEEditor.VEState.INITIALIZED.getValue() && value < VEEditor.VEState.STOPPED.getValue()) {
            return true;
        }
        return false;
    }
}
