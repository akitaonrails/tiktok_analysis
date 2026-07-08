package X;

import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalDetailWebLinkSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.010a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2630010a extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C2632010c LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Room LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2630010a(C238400w2 c238400w2, C2632010c c2632010c, Long l, Room room) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c2632010c;
        this.LLILLL = l;
        this.LLILZ = room;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        User owner;
        LiveMode streamType;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C238400w2 c238400w2 = this.LL;
        if ((jCurrentTimeMillis - c238400w2.element) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= 1) {
            c238400w2.element = System.currentTimeMillis();
            C2632010c c2632010c = this.LLILLJJLI;
            String strValueOf = String.valueOf(this.LLILLL);
            c2632010c.getClass();
            String value = LiveStreamGoalDetailWebLinkSetting.INSTANCE.getValue();
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("goal_id", strValueOf);
                builderBuildUpon.appendQueryParameter("entrance", "stream_goal_im");
                builderBuildUpon.appendQueryParameter("capsule_message_from", "finished_goal");
                value = builderBuildUpon.build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c2632010c.LL.context, value);
            Room room = this.LLILZ;
            if (room == null || (streamType = room.getStreamType()) == null || (str = streamType.logStreamingType) == null) {
                str = "";
            }
            Room room2 = this.LLILZ;
            long id = (room2 == null || (owner = room2.getOwner()) == null) ? 0L : owner.getId();
            Room room3 = this.LLILZ;
            long id2 = room3 != null ? room3.getId() : 0L;
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            String strLJIJI = C497740JfY.LJIJI(2131842024);
            String str2 = strLJIJI != null ? strLJIJI : "";
            Long l = this.LLILLL;
            C238200w0.LIZ(str, id, id2, currentUserId, l != null ? l.longValue() : 0L, "all", "finished_goal", str2);
        }
        return Unit.LIZ;
    }
}
