package X;

/* JADX INFO: renamed from: X.13iK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20085013iK {
    public static final C1679840toc LIZ = new InterfaceC20086513iZ() { // from class: X.0toc
        @Override // X.InterfaceC20086513iZ
        public final /* synthetic */ Object LLFII(long j, long j2, InterfaceC1364105Vn interfaceC1364105Vn) {
            return C1670040tYo.LIZ();
        }

        @Override // X.InterfaceC20086513iZ
        public final /* synthetic */ Object LLILII(long j, InterfaceC1364105Vn interfaceC1364105Vn) {
            return C1670040tYo.LIZIZ();
        }

        @Override // X.InterfaceC20086513iZ
        public final long LJJJLZIJ(int i, long j) {
            return 0L;
        }

        @Override // X.InterfaceC20086513iZ
        public final long LJJLI(int i, long j, long j2) {
            return 0L;
        }
    };

    public static final void LIZ(C20084713iH c20084713iH, C20053713dH c20053713dH) {
        long jLJ = C1692940u9k.LJ(c20053713dH.LLJLLIL.LIZIZ);
        int iRound = Math.round(Float.intBitsToFloat((int) (jLJ >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jLJ & 4294967295L)));
        c20084713iH.layout(iRound, iRound2, c20084713iH.getMeasuredWidth() + iRound, c20084713iH.getMeasuredHeight() + iRound2);
    }
}
