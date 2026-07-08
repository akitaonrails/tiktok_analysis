package X;

/* JADX INFO: renamed from: X.0eYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093490eYt {
    public static void LIZ(InterfaceC1093480eYs interfaceC1093480eYs, C796430VMb c796430VMb, C0VMV c0vmv, C1093150eYL c1093150eYL) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action=");
        sbLIZ.append(interfaceC1093480eYs.getClass().getSimpleName());
        sbLIZ.append(", ctx=");
        sbLIZ.append(c796430VMb);
        sbLIZ.append(", runtime=");
        sbLIZ.append(c0vmv);
        sbLIZ.append(", result=");
        sbLIZ.append(c1093150eYL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("execute");
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        C20441214yg.LIZIZ("LiveTTMStrategyLog", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
