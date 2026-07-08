package X;

/* JADX INFO: renamed from: X.0j55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267210j55 implements InterfaceC1267260j5A {
    public int LIZ;
    public int LIZIZ = 16;
    public int LIZJ = 16;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeSimulcastFeature{subscribeSimulcastEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subscribeRemoteStreamWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subscribeRemoteStreamHeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A instanceof C1267210j55) {
            C1267210j55 c1267210j55 = (C1267210j55) interfaceC1267260j5A;
            this.LIZ = c1267210j55.LIZ;
            this.LIZIZ = c1267210j55.LIZIZ;
            this.LIZJ = c1267210j55.LIZJ;
        }
    }
}
