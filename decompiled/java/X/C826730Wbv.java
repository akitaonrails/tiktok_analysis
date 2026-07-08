package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0Wbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826730Wbv implements InterfaceC826030Wan {
    public final C826740Wbw LIZ = new InterfaceC822930WPz() { // from class: X.0Wbw
        @Override // X.InterfaceC822930WPz
        public final void LIZ() {
        }

        @Override // X.InterfaceC822930WPz
        public final void onAppBackground() {
        }

        @Override // X.InterfaceC822930WPz
        public final void onAppForeground() {
        }

        @Override // X.InterfaceC822930WPz
        public final void LIZIZ() {
            this.LIZ.LIZJ = true;
        }
    };
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;

    @Override // X.InterfaceC826030Wan
    public final boolean LIZ(InterfaceC826050Wap interfaceC826050Wap, String str, int i, String str2, String str3, String str4, C0WZW c0wzw) {
        if (!this.LIZIZ) {
            C822890WPv c822890WPv = C822890WPv.LIZ;
            HashMap<Integer, String> map = C822920WPy.LIZ;
            C822920WPy.LJ(this.LIZ);
            this.LIZIZ = true;
        }
        if (this.LIZJ) {
            interfaceC826050Wap.LIZ(str);
            this.LIZJ = false;
            return true;
        }
        if (!interfaceC826050Wap.pc(str)) {
            return true;
        }
        C822890WPv c822890WPv2 = C822890WPv.LIZ;
        return !C822920WPy.LIZLLL(0L);
    }
}
