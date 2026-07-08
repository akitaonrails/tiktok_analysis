package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0ILI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ILI implements InterfaceC1364105Vn<LiveEventModule> {
    public final /* synthetic */ LiveNewAudienceEndFragment LL;

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return C0PEM.LIZJ;
    }

    public C0ILI(LiveNewAudienceEndFragment liveNewAudienceEndFragment) {
        this.LL = liveNewAudienceEndFragment;
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        Room room;
        if ((obj instanceof LiveEventModule) && (room = this.LL.LLILZ) != null && room.getOwner() != null) {
            LiveEventModule liveEventModule = (LiveEventModule) obj;
            this.LL.LLLILZJ.LJ(String.valueOf(UserService.getInstance().user().getCurrentUserId()), String.valueOf(this.LL.LLILZ.getOwner().getId()), false, liveEventModule, this.LL);
            C786410Ut5.LJJZZIII(this.LL.LLILLL, new ARunnableS76S0200000_7(liveEventModule, this, 7));
            return;
        }
        C786410Ut5.LJJZZIII(this.LL.LLILLL, new ARunnableS107S0100000_7(this, 30));
    }
}
