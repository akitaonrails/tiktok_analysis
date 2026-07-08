package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;

/* JADX INFO: renamed from: X.11cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19542111cx implements InterfaceC19523111Zt<InterfaceC19543911dF> {
    @Override // X.InterfaceC19523111Zt
    public final C11ZA LJIIIIZZ() {
        return new InterfaceC19543911dF() { // from class: X.11d7
            @Override // X.InterfaceC19543911dF
            public final Object LJIILJJIL(String str) {
                boolean z;
                if (TEVideoUtils.nativeCheckAudioFile(str) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
    }
}
