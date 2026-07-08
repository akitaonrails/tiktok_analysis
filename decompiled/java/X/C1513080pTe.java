package X;

/* JADX INFO: renamed from: X.0pTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513080pTe extends AbstractC830880Wic {
    public final /* synthetic */ C1513060pTc LIZ;

    public C1513080pTe(C1513060pTc c1513060pTc) {
        this.LIZ = c1513060pTc;
    }

    @Override // X.AbstractC830880Wic
    public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
        if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
            this.LIZ.LIZ = interfaceC830890Wid;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerSceneResult: success ");
            sbLIZ.append(enumC2213771Bkd);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerSceneResult: fail ");
        sbLIZ2.append(enumC2213771Bkd);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
