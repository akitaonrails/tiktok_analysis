package X;

import com.ss.android.ugc.aweme.explore.et.ExploreStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1615500s8q implements C0T2Y, InterfaceC1635506an {
    public final /* synthetic */ ExploreStayTimeFragmentComponent LL;

    public C1615500s8q(ExploreStayTimeFragmentComponent exploreStayTimeFragmentComponent) {
        this.LL = exploreStayTimeFragmentComponent;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0T2Y) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, ExploreStayTimeFragmentComponent.class, "onGlobalAwemeChanged", "onGlobalAwemeChanged(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0T2Y
    public final void Y3(Aweme aweme) {
        this.LL.getClass();
        if (aweme != null) {
            String aid = aweme.getAid();
            C15TA.LIZ.getClass();
            if (!Intrinsics.LJFF(aid, C15TA.LJIILLIIL)) {
                C15TA.LJJIL = true;
            }
        }
    }
}
