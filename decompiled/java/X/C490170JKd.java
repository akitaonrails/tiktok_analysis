package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.vm.SubManagementPageVM;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveShowSuperFanTextInSubManagerPage;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0JKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490170JKd extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ SubManagementPageVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490170JKd(SubManagementPageVM subManagementPageVM) {
        super(1);
        this.LL = subManagementPageVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws JSONException {
        boolean z;
        int i;
        if (bool.booleanValue() && C494680Jac.LJJI()) {
            if (LiveShowSuperFanTextInSubManagerPage.INSTANCE.enable() && ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pY1(User.subSplitStatus)) {
                z = true;
            } else {
                z = false;
            }
            C494680Jac.LJIJI(false);
            if (z) {
                i = 2131856596;
            } else {
                i = 2131844454;
            }
            C766270U4b.LIZLLL(i);
        }
        this.LL.xQ2();
        return Unit.LIZ;
    }
}
