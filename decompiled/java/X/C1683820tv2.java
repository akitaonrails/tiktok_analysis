package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683820tv2 extends C09AY implements Function2<InterfaceC1567440qtK, C1378605aS, Object> {
    public C1683820tv2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1567440qtK interfaceC1567440qtK, C1378605aS c1378605aS) {
        long j = c1378605aS.LIZ;
        if (C1378605aS.LIZJ(j, 9205357640488583168L)) {
            return Boolean.FALSE;
        }
        return C1697810uHb.LJ(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
