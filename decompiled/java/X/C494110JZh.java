package X;

import android.app.Activity;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494110JZh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LiveSubOnlyConfig LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C494220JZs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494110JZh(LiveSubOnlyConfig liveSubOnlyConfig, C19EG c19eg, C494220JZs c494220JZs) {
        super(0);
        this.LL = liveSubOnlyConfig;
        this.LLILLJJLI = c19eg;
        this.LLILLL = c494220JZs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        User owner;
        User owner2;
        LiveSubOnlyConfig liveSubOnlyConfig = this.LL;
        if (Intrinsics.LJFF(liveSubOnlyConfig != null ? liveSubOnlyConfig.disabledReason : null, "violation")) {
            Activity activity = this.LLILLJJLI;
            LiveSubOnlyConfig liveSubOnlyConfig2 = this.LL;
            C766270U4b.LJIIL(R.drawable.eqq, activity, liveSubOnlyConfig2 != null ? liveSubOnlyConfig2.disabledToast : null);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII("anchor", "user_type");
            c474500IjALIZ.LJJII("subscription", "scene_type");
            c474500IjALIZ.LJJII("ban", "violation_type");
            Room room = this.LLILLL.LIZIZ;
            if (room != null && (owner2 = room.getOwner()) != null) {
                objValueOf = Long.valueOf(owner2.getId());
            }
            c474500IjALIZ.LJJII(objValueOf, "violation_anchor_id");
            c474500IjALIZ.LIZ();
        } else {
            LiveSubOnlyConfig liveSubOnlyConfig3 = this.LL;
            C766270U4b.LJIIJJI(liveSubOnlyConfig3 != null ? liveSubOnlyConfig3.disabledToast : null);
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscriber_only_live_ban_toast");
            Room room2 = this.LLILLL.LIZIZ;
            c474500IjALIZ2.LJJII((room2 == null || (owner = room2.getOwner()) == null) ? null : Long.valueOf(owner.getId()), "anchor_id");
            LiveSubOnlyConfig liveSubOnlyConfig4 = this.LL;
            c474500IjALIZ2.LJJII(liveSubOnlyConfig4 != null ? liveSubOnlyConfig4.disabledReason : null, "toast_type");
            c474500IjALIZ2.LIZ();
        }
        return Unit.LIZ;
    }
}
