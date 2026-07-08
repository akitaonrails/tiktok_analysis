package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1094404Pu extends C09AY implements Function0<C143000ge> {
    public C1094404Pu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.00ge] */
    @Override // kotlin.jvm.functions.Function0
    public final C143000ge invoke() {
        return new ICollabEventTrackingService() { // from class: X.00ge
            @Override // com.ss.android.ugc.aweme.service.ICollabEventTrackingService
            public final void reportClickInviteCollab(String str, boolean z) {
                Object c098200Yq;
                C241200wU.LIZ.getClass();
                try {
                    C0N4J.LIZ("click_invite_collab", new C020D(str, z, 0));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }

            @Override // com.ss.android.ugc.aweme.service.ICollabEventTrackingService
            public final void reportShowInviteCollab(String str, boolean z) {
                Object c098200Yq;
                C241200wU.LIZ.getClass();
                try {
                    C0N4J.LIZ("show_invite_collab", new C020D(str, z, 1));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }

            @Override // com.ss.android.ugc.aweme.service.ICollabEventTrackingService
            public final void reportCollabAnchor(String str, String str2, String str3, String str4, boolean z) {
                Object c098200Yq;
                Object c098200Yq2;
                if (z) {
                    C241200wU.LIZ.getClass();
                    try {
                        C0N4J.LIZ("collab_anchor_show", new C120000cw(str, str3, str2, str4));
                        c098200Yq2 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                    return;
                }
                C241200wU.LIZ.getClass();
                try {
                    C0N4J.LIZ("collab_anchor_click", new C119900cv(str, str3, str2, str4));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }

            @Override // com.ss.android.ugc.aweme.service.ICollabEventTrackingService
            public final void reportCollabAuthorizeEntrance(String str, String str2, String str3, String str4, String str5, String str6) {
                C241200wU.LIZ.getClass();
                C241200wU.LIZJ(str, str2, str3, str4, str5, str6);
            }

            @Override // com.ss.android.ugc.aweme.service.ICollabEventTrackingService
            public final void reportCollabAuthorizePopup(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                C241200wU.LIZ.getClass();
                C241200wU.LIZLLL(str, str2, str3, str4, str5, str6, str7);
            }
        };
    }
}
