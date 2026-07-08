package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693300uAK extends C09AY implements Function2<InterfaceC1567440qtK, C1692270u8f<? extends Object>, Object> {
    public C1693300uAK() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1567440qtK interfaceC1567440qtK, C1692270u8f<? extends Object> c1692270u8f) {
        EnumC1693540uAi enumC1693540uAi;
        Object objLIZ;
        InterfaceC1567440qtK interfaceC1567440qtK2 = interfaceC1567440qtK;
        C1692270u8f<? extends Object> c1692270u8f2 = c1692270u8f;
        T t = c1692270u8f2.LIZ;
        if (t instanceof C1693480uAc) {
            enumC1693540uAi = EnumC1693540uAi.LL;
        } else if (t instanceof C1693450uAZ) {
            enumC1693540uAi = EnumC1693540uAi.LLILLJJLI;
        } else if (t instanceof C1556420qbY) {
            enumC1693540uAi = EnumC1693540uAi.LLILLL;
        } else if (t instanceof C1556450qbb) {
            enumC1693540uAi = EnumC1693540uAi.LLILZ;
        } else if (t instanceof C1693030u9t) {
            enumC1693540uAi = EnumC1693540uAi.LLILZIL;
        } else if (t instanceof C1693020u9s) {
            enumC1693540uAi = EnumC1693540uAi.LLILZLL;
        } else if (t instanceof C1556440qba) {
            enumC1693540uAi = EnumC1693540uAi.LLIZ;
        } else {
            throw new UnsupportedOperationException();
        }
        switch (enumC1693540uAi.ordinal()) {
            case 0:
                objLIZ = C1693270uAH.LIZ(c1692270u8f2.LIZ, C1693270uAH.LJII, interfaceC1567440qtK2);
                break;
            case 1:
                objLIZ = C1693270uAH.LIZ(c1692270u8f2.LIZ, C1693270uAH.LJIIIIZZ, interfaceC1567440qtK2);
                break;
            case 2:
                objLIZ = C1693270uAH.LIZ(c1692270u8f2.LIZ, C1693270uAH.LIZLLL, interfaceC1567440qtK2);
                break;
            case 3:
                objLIZ = C1693270uAH.LIZ(c1692270u8f2.LIZ, C1693270uAH.LJ, interfaceC1567440qtK2);
                break;
            case 4:
                objLIZ = C1693270uAH.LIZ(c1692270u8f2.LIZ, C1693270uAH.LJFF, interfaceC1567440qtK2);
                break;
            case 5:
                objLIZ = C1693270uAH.LIZ(c1692270u8f2.LIZ, C1693270uAH.LJI, interfaceC1567440qtK2);
                break;
            case 6:
                objLIZ = ((C1556440qba) c1692270u8f2.LIZ).LIZ;
                break;
            default:
                throw new C1954807lC();
        }
        return C1697810uHb.LJ(enumC1693540uAi, objLIZ, Integer.valueOf(c1692270u8f2.LIZIZ), Integer.valueOf(c1692270u8f2.LIZJ), c1692270u8f2.LIZLLL);
    }
}
