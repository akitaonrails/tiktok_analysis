package X;

/* JADX INFO: renamed from: X.0kM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316170kM3 {
    public static boolean LIZ(C089P c089p, EnumC1316020kLo enumC1316020kLo) {
        if (c089p == null) {
            return false;
        }
        if (enumC1316020kLo == EnumC1316020kLo.AUTO) {
            if (!C1325880kbi.LIZLLL(c089p.LIZIZ()) && !"file".equals(C1325880kbi.LIZ(c089p.LIZIZ()))) {
                return false;
            }
            return true;
        }
        if (enumC1316020kLo != EnumC1316020kLo.RESIZE) {
            return false;
        }
        return true;
    }
}
