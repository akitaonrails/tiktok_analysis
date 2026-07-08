package X;

/* JADX INFO: renamed from: X.0uyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1724310uyL extends AbstractC1064500do8 {
    public abstract String LJI();

    @Override // X.InterfaceC1063690dmp
    public String getName() {
        String strLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getName:");
        sbLIZ.append(strLJI);
        C2188811AlT.LIZIZ(sbLIZ);
        return strLJI;
    }

    @Override // X.InterfaceC1063690dmp
    public void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle:");
        sbLIZ.append(LJI());
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
