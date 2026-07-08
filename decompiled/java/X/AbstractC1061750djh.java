package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0djh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1061750djh {
    public abstract EnumC1059790dgX LIZ();

    public final void LIZIZ(String str, InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, C1061110dif c1061110dif) {
        InterfaceC1063690dmp interfaceC1063690dmpLIZ;
        InterfaceC1061810djn interfaceC1061810djn = (InterfaceC1061810djn) ((LinkedHashMap) ((C1061100die) c1061110dif.LIZ.getValue()).LIZ).get(str);
        if (interfaceC1061810djn != null && (interfaceC1063690dmpLIZ = interfaceC1061810djn.LIZ()) != null) {
            interfaceC1063690dmpLIZ.LIZIZ(interfaceC1107590evd, interfaceC1063920dnC, LIZ());
        }
    }
}
