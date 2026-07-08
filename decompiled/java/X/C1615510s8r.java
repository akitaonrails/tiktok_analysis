package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.follow.AwemeChangedComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1615510s8r implements C0T2Y, InterfaceC1635506an {
    public final /* synthetic */ AwemeChangedComponent LL;

    public C1615510s8r(AwemeChangedComponent awemeChangedComponent) {
        this.LL = awemeChangedComponent;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0T2Y) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, AwemeChangedComponent.class, "onGlobalAwemeChanged", "onGlobalAwemeChanged(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0T2Y
    public final void Y3(Aweme aweme) {
        this.LL.bo(aweme);
    }
}
