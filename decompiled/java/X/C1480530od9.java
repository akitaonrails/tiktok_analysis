package X;

/* JADX INFO: renamed from: X.0od9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480530od9 {
    public static final boolean LIZ(C1479510obV c1479510obV, InterfaceC1480710odR interfaceC1480710odR) {
        if (interfaceC1480710odR.LJIIIZ() != c1479510obV.LJIILIIL) {
            return false;
        }
        if (c1479510obV.LJJJZ == interfaceC1480710odR.getVideoWidth() && c1479510obV.LJJL == interfaceC1480710odR.getVideoHeight()) {
            return true;
        }
        int iIntValue = ((Number) C1474810oTv.LLLLJI.getValue()).intValue();
        int iIntValue2 = ((Number) C1474810oTv.LLLLL.getValue()).intValue();
        if (Math.abs(c1479510obV.LJJJZ - interfaceC1480710odR.getVideoWidth()) < iIntValue || Math.abs(c1479510obV.LJJL - interfaceC1480710odR.getVideoHeight()) < iIntValue2) {
            return false;
        }
        return true;
    }
}
