package X;

/* JADX INFO: renamed from: X.0khc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329540khc implements InterfaceC1330230kij {
    @Override // X.InterfaceC1330230kij
    public final double LIZ(EnumC1330650kjP enumC1330650kjP) {
        int i = C1330630kjN.LIZ[enumC1330650kjP.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                C1328570kg3.LJIJI("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", enumC1330650kjP);
                return 0.0d;
            }
            return 1.0d;
        }
        return EnumC1330650kjP.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
    }
}
