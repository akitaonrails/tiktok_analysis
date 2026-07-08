package X;

import Y.ACallableS252S0200000_24;
import com.ss.android.ugc.aweme.api.ISocial2TabApi;

/* JADX INFO: renamed from: X.0rOR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586730rOR {
    public static final C1586730rOR LIZ = new C1586730rOR();
    public static final ISocial2TabApi LIZIZ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0CQT.LIZJ);
        LIZIZ = (ISocial2TabApi) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(ISocial2TabApi.class) : null);
    }

    public static C11NZ LIZ(EnumC1586970rOp enumC1586970rOp, EnumC586680Mzi enumC586680Mzi) {
        int i = 1;
        if ((((Number) C296340BjU.LIZ.getValue()).intValue() & 1) == 1) {
            return C11NZ.LJJ(new ACallableS252S0200000_24(enumC1586970rOp, enumC586680Mzi, 3)).LJJIJIIJIL(new C09JN() { // from class: X.0rOS
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("FriendsTabApi@4678.requestRedDot$2");
                    C1589640rT8.LIZIZ.Z1(System.currentTimeMillis());
                    C1C7U.LIZIZ("FriendsTabApi@4678.requestRedDot$2");
                }
            });
        }
        if (enumC1586970rOp != EnumC1586970rOp.COLD_START) {
            i = 0;
        }
        return LIZIZ.requestRedDotEnhanceQuery(i, Integer.valueOf(C1586650rOJ.LIZIZ()), C1586650rOJ.LIZ(enumC1586970rOp, enumC586680Mzi));
    }
}
