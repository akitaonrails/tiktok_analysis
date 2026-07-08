package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493940JYq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C494220JZs LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493940JYq(C494220JZs c494220JZs) {
        super(0);
        this.LL = c494220JZs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        User owner;
        SubscribeInfo subscribeInfo;
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        Room room = this.LL.LIZIZ;
        C766270U4b.LIZLLL((iFansClubService.pY1((room == null || (owner = room.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null) ? null : subscribeInfo.subSplitStatus) || ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pY1(User.subSplitStatus)) ? 2131856634 : 2131844464);
        return Unit.LIZ;
    }
}
