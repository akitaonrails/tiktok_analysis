package X;

/* JADX INFO: renamed from: X.0j52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267180j52 implements InterfaceC1267260j5A {
    public EnumC1268000j6M LIZ = EnumC1268000j6M.DEFAULT;
    public EnumC1268010j6N LIZIZ = EnumC1268010j6N.DEFAULT;
    public int LIZJ = -1;
    public float LIZLLL = 1.0f;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHLiveFeature{currentScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", role=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", anchorLevel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", gameShortLongRatio=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        EnumC1268000j6M enumC1268000j6M;
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1267180j52) && (enumC1268000j6M = ((C1267180j52) interfaceC1267260j5A).LIZ) != EnumC1268000j6M.DEFAULT && enumC1268000j6M != this.LIZ) {
            return enumC1268000j6M;
        }
        return null;
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1267180j52)) {
            C1267180j52 c1267180j52 = (C1267180j52) interfaceC1267260j5A;
            this.LIZ = c1267180j52.LIZ;
            this.LIZIZ = c1267180j52.LIZIZ;
            this.LIZJ = c1267180j52.LIZJ;
            this.LIZLLL = c1267180j52.LIZLLL;
        }
    }
}
