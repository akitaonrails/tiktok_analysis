package X;

/* JADX INFO: renamed from: X.0a3W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920280a3W {
    public static final InterfaceC937900aVw LIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            return interfaceC954180awCLLJLL.LLIIJLIL();
        }
        return null;
    }

    public static final String LIZIZ(EnumC920250a3T enumC920250a3T) {
        int i = C920260a3U.LIZ[enumC920250a3T.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "zoom_status_disable";
                }
                throw new C1954807lC();
            }
            return "zoom_min";
        }
        return "zoom_max";
    }
}
