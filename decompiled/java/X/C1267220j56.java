package X;

/* JADX INFO: renamed from: X.0j56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267220j56 implements InterfaceC1267260j5A {
    public String LIZ = "default";
    public int LIZIZ = -1;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHEventFeature{, eventType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A instanceof C1267220j56) {
            C1267220j56 c1267220j56 = (C1267220j56) interfaceC1267260j5A;
            this.LIZ = c1267220j56.LIZ;
            this.LIZIZ = c1267220j56.LIZIZ;
        }
    }
}
