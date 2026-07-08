package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: renamed from: X.0j3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266230j3V implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<String> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
        }
    }

    public C1266230j3V(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1266230j3V c1266230j3V, C09AJ c09aj) {
        C1C7U.LIZ("RxShakeController@30fe.createObservable$1");
        ((C1232090iAR) c1266230j3V.l0).LIZ = new C1232110iAT((C19482611Ke) c09aj);
        C1C7U.LIZIZ("RxShakeController@30fe.createObservable$1");
    }

    public static final void subscribe$1(C1266230j3V c1266230j3V, C09AJ c09aj) {
        C1C7U.LIZ("StoryIMService@b095.shouldDisplayQuickDMObservable$1");
        C1336205Ku.LIZ(false).getImUserService().LJ(((Aweme) c1266230j3V.l0).getAuthor(), true, new AwS385S0200000_19((C19482611Ke) c09aj, (Aweme) c1266230j3V.l0, 32));
        C1C7U.LIZIZ("StoryIMService@b095.shouldDisplayQuickDMObservable$1");
    }

    public static final void subscribe$2(C1266230j3V c1266230j3V, C09AJ c09aj) {
        C1C7U.LIZ("FriendsDetailBottomBarQuickDMAssem@abc8.shouldDisplayQuickDMObservable$1");
        C1336205Ku.LIZ(false).getImUserService().LJ(((Aweme) c1266230j3V.l0).getAuthor(), false, new AwS385S0200000_19((C19482611Ke) c09aj, (Aweme) c1266230j3V.l0, 113));
        C1C7U.LIZIZ("FriendsDetailBottomBarQuickDMAssem@abc8.shouldDisplayQuickDMObservable$1");
    }
}
