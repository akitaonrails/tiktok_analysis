package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0d29, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034750d29 extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023360cjm, X.AbstractC1023380cjo
    public final InterfaceC1007800cKg getProcessor() {
        return C1035030d2b.LIZ(super.getProcessor(), C1035030d2b.LIZIZ(C1035030d2b.LIZ, "profile_ads"));
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1034750d29(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }
}
