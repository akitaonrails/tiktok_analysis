package X;

import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.threads.ThreadNative;

/* JADX INFO: renamed from: X.0uP6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702460uP6 implements InterfaceC2185511Ag9 {
    @Override // X.InterfaceC2185511Ag9
    public final void LIZ(String str) {
        ThreadNative.nativeResumeThreadByName(str);
    }

    @Override // X.InterfaceC2185511Ag9
    public final void LIZIZ(int i) {
        JatoXL.resetPriority(i);
    }

    @Override // X.InterfaceC2185511Ag9
    public final void LIZJ(String str) {
        ThreadNative.nativeSuspendThreadByName(str);
    }

    @Override // X.InterfaceC2185511Ag9
    public final void bindBigCore(int i) {
        CpusetManager.bindBigCore(i);
    }

    @Override // X.InterfaceC2185511Ag9
    public final void bindLittleCore(int i) {
        CpusetManager.bindLittleCore(i);
    }

    @Override // X.InterfaceC2185511Ag9
    public final void resetCoreBind(int i) {
        CpusetManager.resetCoreBind(i);
    }

    @Override // X.InterfaceC2185511Ag9
    public final void LIZLLL(int i, int i2) {
        JatoXL.setPriority(i, i2);
    }
}
