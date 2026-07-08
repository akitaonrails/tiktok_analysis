package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0lQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1357600lQs implements InterfaceC1357630lQv {
    public final String LIZ;
    public WeakReference<InterfaceC712540RxE> LIZIZ;

    public void LIZIZ() {
    }

    @Override // X.InterfaceC1357630lQv
    public final InterfaceC712540RxE getHost() {
        WeakReference<InterfaceC712540RxE> weakReference = this.LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C1357600lQs(String str) {
        this.LIZ = str;
    }

    public final void LIZ(InterfaceC712540RxE interfaceC712540RxE) {
        this.LIZIZ = new WeakReference<>(interfaceC712540RxE);
    }
}
