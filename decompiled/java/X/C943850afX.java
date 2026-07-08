package X;

import Y.ARunnableS16S0210000_15;

/* JADX INFO: renamed from: X.0afX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943850afX {
    public static boolean LIZ;
    public static ARunnableS16S0210000_15 LIZIZ;

    public static void LIZ(InterfaceC1103130eoR interfaceC1103130eoR, Runnable runnable, EnumC943760afO enumC943760afO, boolean z) {
        if (interfaceC1103130eoR != null && !enumC943760afO.getVisibility()) {
            enumC943760afO.setVisibility(true);
            ARunnableS16S0210000_15 aRunnableS16S0210000_15 = new ARunnableS16S0210000_15(runnable, z, interfaceC1103130eoR, 3);
            if (LIZ) {
                LIZIZ = aRunnableS16S0210000_15;
            } else {
                aRunnableS16S0210000_15.run();
            }
        }
    }
}
