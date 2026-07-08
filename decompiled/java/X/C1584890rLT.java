package X;

import Y.AfS143S0000000_24;
import com.ss.android.ugc.aweme.api.ISocial2TabVisitApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rLT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584890rLT {
    public static final C1584890rLT LIZ = new C1584890rLT();
    public static final ISocial2TabVisitApi LIZIZ;
    public static final C01GW LIZJ;

    static {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0CQT.LIZJ);
        LIZIZ = (ISocial2TabVisitApi) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(ISocial2TabVisitApi.class) : null);
        LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(647));
    }

    public static void LIZ() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((Boolean) LIZJ.getValue()).booleanValue()) {
            InterfaceC1586780rOW interfaceC1586780rOWRedDotLogic = C1595430rcT.LIZIZ.LIZIZ().redDotLogic();
            ArrayList<Integer> arrayListLIZ = interfaceC1586780rOWRedDotLogic.LIZ();
            C1583300rIu.LIZ.getClass();
            LIZIZ.visitSocial2Tab(Integer.valueOf(!C1583300rIu.LIZIZ() ? interfaceC1586780rOWRedDotLogic.LJIL("FRIENDS_FEED") : 0), C08JS.LIZLLL(arrayListLIZ)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0rLR
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("Social2TabVisitApi@3ed1.visit2Tab$1");
                    C1C7U.LIZIZ("Social2TabVisitApi@3ed1.visit2Tab$1");
                }
            }, new C09JN() { // from class: X.0rLS
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("Social2TabVisitApi@3ed1.visit2Tab$2");
                    C1C7U.LIZIZ("Social2TabVisitApi@3ed1.visit2Tab$2");
                }
            });
        }
    }

    public static void LIZIZ(String str) {
        C11NZ<BaseResponse> c11nzVisitSocial2Tab;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        InterfaceC1586780rOW interfaceC1586780rOWRedDotLogic = C1595430rcT.LIZIZ.LIZIZ().redDotLogic();
        if (((Boolean) LIZJ.getValue()).booleanValue()) {
            c11nzVisitSocial2Tab = LIZIZ.visitSocial2Tab(Integer.valueOf(interfaceC1586780rOWRedDotLogic.LJIL(str)), C08JS.LIZLLL(interfaceC1586780rOWRedDotLogic.LJIILLIIL(str)));
        } else {
            c11nzVisitSocial2Tab = LIZIZ.visitSocial2Tab(Integer.valueOf(interfaceC1586780rOWRedDotLogic.LJIL(str)), C08JS.LIZLLL(interfaceC1586780rOWRedDotLogic.LJIILLIIL(str)));
        }
        c11nzVisitSocial2Tab.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS143S0000000_24(0), new AfS143S0000000_24(1));
    }
}
