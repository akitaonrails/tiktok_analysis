package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.05aH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1377505aH extends C09AY implements InterfaceC1631620sYq<C1378605aS, C1378605aS, Float, Boolean> {
    public final /* synthetic */ C1378505aR LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377505aH(long j, C1378505aR c1378505aR, InterfaceC497601wk interfaceC497601wk) {
        super(3);
        this.LL = c1378505aR;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = j;
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(C1378605aS c1378605aS, C1378605aS c1378605aS2, Float f) {
        boolean z;
        long j = c1378605aS.LIZ;
        long j2 = c1378605aS2.LIZ;
        float fFloatValue = f.floatValue();
        Pair pairLJI = C1679750toT.LJI(this.LL.LIZ.LIZLLL().floatValue() * fFloatValue, this.LLILLL, C1378605aS.LJI(C1378605aS.LJII(fFloatValue, C1378605aS.LJFF(C1378605aS.LJI(this.LL.LIZIZ.LIZLLL().LIZ, j2), j)), j));
        long j3 = ((C1378605aS) pairLJI.getFirst()).LIZ;
        C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C1377605aI(this.LL, ((Number) pairLJI.getSecond()).floatValue(), j3, null), 3);
        boolean z2 = true;
        if (fFloatValue == 1.0f) {
            if (this.LL.LIZ.LIZLLL().floatValue() > 1.0f) {
                return Boolean.TRUE;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            int i = (int) (j2 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i);
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (this.LL.LIZIZ.LIZLLL().LIZ >> 32));
            if (Math.abs(fIntBitsToFloat) > Math.abs(Float.intBitsToFloat(i))) {
                z = true;
            } else {
                z = false;
            }
            if (fIntBitsToFloat == 0.0f || (fIntBitsToFloat * fIntBitsToFloat3 >= 0.0f && Math.abs(fIntBitsToFloat3) >= Math.abs(fIntBitsToFloat) * 0.5f)) {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    return Boolean.FALSE;
                }
            } else if (fIntBitsToFloat2 > 0.0f) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
