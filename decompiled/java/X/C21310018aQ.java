package X;

/* JADX INFO: renamed from: X.18aQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21310018aQ {
    public static InterfaceC21310318aT LIZ;

    public static void LIZ(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onException: ");
        sbLIZ.append(th.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        C806930Vl5.LIZ("ByteBench SladarCenter");
        InterfaceC21310318aT interfaceC21310318aT = LIZ;
        if (interfaceC21310318aT != null) {
            interfaceC21310318aT.onException(th);
        } else {
            C806930Vl5.LJ("ByteBench SladarCenter");
        }
    }
}
