package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice.SessionListTopNoticeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1890410zIF implements InterfaceC1887820zE4, InterfaceC1635506an {
    public final /* synthetic */ SessionListTopNoticeViewModel LL;

    public C1890410zIF(SessionListTopNoticeViewModel sessionListTopNoticeViewModel) {
        this.LL = sessionListTopNoticeViewModel;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1887820zE4) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, SessionListTopNoticeViewModel.class, "onPermissionUpdateSheetProcessed", "onPermissionUpdateSheetProcessed(Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC1887820zE4
    public final void LIZ(String str) {
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel = this.LL;
        sessionListTopNoticeViewModel.DQ2(2, str, "inbox", null);
        sessionListTopNoticeViewModel.AQ2();
    }
}
