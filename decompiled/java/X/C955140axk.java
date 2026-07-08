package X;

/* JADX INFO: renamed from: X.0axk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955140axk implements InterfaceC1280020jPk {
    public final /* synthetic */ String LIZ;

    @Override // X.InterfaceC1280020jPk
    public final void LIZIZ() {
        InterfaceC955150axl interfaceC955150axlLLJJJIL;
        InterfaceC955150axl interfaceC955150axlLLJJJIL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" onLayoutAnimationDidEnd ");
        sbLIZ.append("");
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null && (interfaceC955150axlLLJJJIL2 = interfaceC954180awCLJIIIZ.LLJJJIL()) != null) {
            interfaceC955150axlLLJJJIL2.LJIJJ(this);
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 == null || (interfaceC955150axlLLJJJIL = interfaceC954180awCLJIIIZ2.LLJJJIL()) == null) {
            return;
        }
        interfaceC955150axlLLJJJIL.LJJI();
    }

    @Override // X.InterfaceC1280020jPk
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" onLayoutAnimationWillStart ");
        sbLIZ.append("");
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C955140axk(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1280020jPk
    public final void LIZ(long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" onLayoutAnimationDidOccurError ");
        sbLIZ.append("");
        sbLIZ.append(" code=");
        sbLIZ.append(j);
        sbLIZ.append(" subCode=");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }
}
