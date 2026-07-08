package X;

/* JADX INFO: renamed from: X.0HqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453370HqB implements InterfaceC453410HqF {
    public final /* synthetic */ C453330Hq7 LIZ;
    public final /* synthetic */ C453360HqA LIZIZ;

    public C453370HqB(C453330Hq7 c453330Hq7, C453360HqA c453360HqA) {
        this.LIZ = c453330Hq7;
        this.LIZIZ = c453360HqA;
    }

    @Override // X.InterfaceC453410HqF
    public final void LIZIZ(int i, String str) {
        InterfaceC453410HqF interfaceC453410HqF = this.LIZ.LLILZ;
        if (interfaceC453410HqF != null) {
            String strLIZIZ = C453560HqU.LIZIZ(this.LIZIZ.LIZ);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            interfaceC453410HqF.LIZIZ(i, strLIZIZ);
        }
    }

    @Override // X.InterfaceC453410HqF
    public final void LIZ(int i, String str, boolean z) {
        InterfaceC453410HqF interfaceC453410HqF;
        C453330Hq7 c453330Hq7 = this.LIZ;
        if (c453330Hq7.LLILZLL && (interfaceC453410HqF = c453330Hq7.LLILZ) != null) {
            interfaceC453410HqF.LIZ(i, str, z);
        }
    }
}
