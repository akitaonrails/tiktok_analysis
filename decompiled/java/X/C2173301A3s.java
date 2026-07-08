package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173301A3s {
    public static final void LIZ(C450720Hlu c450720Hlu) {
        final C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        final InterfaceC1340660kzY interfaceC1340660kzY = c0p0tLIZIZ.LJIILL().LJJI;
        c0p0tLIZIZ.LJIILL().LJJI = new InterfaceC1340660kzY() { // from class: X.1A3t
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                InterfaceC1340660kzY interfaceC1340660kzY2 = interfaceC1340660kzY;
                if (interfaceC1340660kzY2 != null) {
                    interfaceC1340660kzY2.LIZ(abstractC1391670mJp);
                }
                if (Intrinsics.LJFF(C2173341A3w.LIZ, c0p0tLIZIZ)) {
                    C2173341A3w.LIZ = null;
                }
            }
        };
        final InterfaceC1391650mJn interfaceC1391650mJn = c0p0tLIZIZ.LJIILL().LJJIFFI;
        c0p0tLIZIZ.LJIILL().LJJIFFI = new InterfaceC1391650mJn() { // from class: X.1A3u
            @Override // X.InterfaceC1391650mJn
            public final void onShow() {
                InterfaceC1391650mJn interfaceC1391650mJn2 = interfaceC1391650mJn;
                if (interfaceC1391650mJn2 != null) {
                    interfaceC1391650mJn2.onShow();
                }
                C2173341A3w.LIZ = c0p0tLIZIZ;
            }
        };
        if (C2173341A3w.LIZ == null) {
            c0p0tLIZIZ.show();
        }
    }
}
