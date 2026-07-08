package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798540VUe implements InterfaceC798580VUi {
    public volatile C798670VUr LIZ;

    @Override // X.InterfaceC798580VUi
    public final InterfaceC798560VUg LIZ(String str) {
        C798670VUr c798670VUr = this.LIZ;
        if (c798670VUr != null) {
            return c798670VUr;
        }
        synchronized (this) {
            try {
                C798670VUr c798670VUr2 = this.LIZ;
                if (c798670VUr2 != null) {
                    return c798670VUr2;
                }
                C798670VUr c798670VUr3 = new C798670VUr(str);
                this.LIZ = c798670VUr3;
                return c798670VUr3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
