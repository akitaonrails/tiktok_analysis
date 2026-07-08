package X;

import Y.AObjectS59S0000000_6;
import com.ss.android.ugc.aweme.data.TypingRecommendationCacheData;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0Hoq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452540Hoq extends AbstractC2202061BGi<C452500Hom> implements InterfaceC452360HoY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C2202081BGk LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452540Hoq.class, "data", "getData()Lknit/Loadable;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC2202061BGi
    public final C2202081BGk<C452500Hom> getData() {
        C2202081BGk<C452500Hom> c2202081BGk = this.LIZ;
        if (c2202081BGk == null) {
            synchronized (this) {
                c2202081BGk = this.LIZ;
                if (c2202081BGk == null) {
                    C2202081BGk<C452500Hom> c2202081BGk2 = new C2202081BGk<>(new AObjectS59S0000000_6(this, 5));
                    this.LIZ = c2202081BGk2;
                    return c2202081BGk2;
                }
            }
        }
        return c2202081BGk;
    }

    public final Object LJIILJJIL(String str) {
        C452500Hom userScopeObject = getUserScopeObject();
        if (userScopeObject != null) {
            return userScopeObject.LIZ(str);
        }
        C098200Yq c098200Yq = new C098200Yq(new NoSuchElementException());
        C189200o6.m2constructorimpl(c098200Yq);
        return c098200Yq;
    }

    public final void LJIILL(String str, TypingRecommendationCacheData typingRecommendationCacheData) {
        C452500Hom userScopeObject = getUserScopeObject();
        if (userScopeObject != null) {
            userScopeObject.LIZJ(str, typingRecommendationCacheData);
        }
    }
}
