package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0dhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1060480dhe {
    public static final void LIZ(final C1059860dge c1059860dge, C1060530dhj c1060530dhj, String str) {
        Map mapLJIIZILJ;
        EnumC1059790dgX enumC1059790dgX = EnumC1059790dgX.WEB;
        C1061110dif c1061110dif = new C1061110dif();
        Map mapLIZIZ = C1062300dka.LIZIZ(enumC1059790dgX, str);
        if (mapLIZIZ != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(mapLIZIZ)) != null) {
            for (final Map.Entry entry : mapLJIIZILJ.entrySet()) {
                ((C1061100die) c1061110dif.LIZ.getValue()).LIZ.put((String) entry.getKey(), new InterfaceC1061810djn() { // from class: X.0djj
                    @Override // X.InterfaceC1061810djn
                    public final InterfaceC1063690dmp LIZ() throws IllegalAccessException, InstantiationException {
                        InterfaceC1063690dmp interfaceC1063690dmpNewInstance = entry.getValue().newInstance();
                        interfaceC1063690dmpNewInstance.LIZ(c1059860dge);
                        return interfaceC1063690dmpNewInstance;
                    }
                });
            }
        }
        C1061730djf c1061730djf = (C1061730djf) C1062300dka.LIZJ(C1061730djf.class);
        if (c1061730djf != null) {
            c1061730djf.LIZJ(c1060530dhj, c1061110dif);
        }
    }
}
