package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0JxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508800JxO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GetSubPrivilegeDetailResponse.Data LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508800JxO(GetSubPrivilegeDetailResponse.Data data) {
        super(0);
        this.LL = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GetSubPrivilegeDetailResponse.Data.SubscribePermission subscribePermission = this.LL.subscribePermission;
        if (subscribePermission != null && subscribePermission.forbiddenType == 1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_org_account_subscription_block");
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
