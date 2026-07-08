package X;

/* JADX INFO: renamed from: X.0j41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266550j41 implements InterfaceC1267260j5A {
    public float LIZ;
    public float LIZIZ;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public C1266550j41() {
        Float f = C1101250elP.LIZ;
        this.LIZ = f.floatValue();
        this.LIZIZ = f.floatValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHDeviceFeature{deviceScore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", recordScore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1266550j41)) {
            C1266550j41 c1266550j41 = (C1266550j41) interfaceC1267260j5A;
            this.LIZ = c1266550j41.LIZ;
            this.LIZIZ = c1266550j41.LIZIZ;
        }
    }
}
