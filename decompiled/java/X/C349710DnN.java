package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C349710DnN {
    public final InterfaceC349700DnM LIZ;

    public C349710DnN(InterfaceC349700DnM interfaceC349700DnM) {
        this.LIZ = interfaceC349700DnM;
    }

    public final void LIZ(Function0<String> function0) {
        function0.invoke();
        InterfaceC349700DnM interfaceC349700DnM = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 12304);
        sbLIZ.append(interfaceC349700DnM.LJIIIIZZ());
        sbLIZ.append("】(");
        sbLIZ.append(interfaceC349700DnM.LIZ());
        sbLIZ.append(',');
        sbLIZ.append(interfaceC349700DnM.LIZJ());
        sbLIZ.append(")#");
        sbLIZ.append(interfaceC349700DnM.getDurationMs());
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
