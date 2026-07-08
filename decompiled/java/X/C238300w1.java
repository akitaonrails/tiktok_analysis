package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00w1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C238300w1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C2632010c LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Room LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238300w1(C238400w2 c238400w2, C2632010c c2632010c, Long l, Room room) {
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
        LiveStreamGoalMessageDialog liveStreamGoalMessageDialog;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C238400w2 c238400w2 = this.LL;
        if ((jCurrentTimeMillis - c238400w2.element) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= 1) {
            c238400w2.element = System.currentTimeMillis();
            C2632010c c2632010c = this.LLILLJJLI;
            Long l = this.LLILLL;
            if (c2632010c.LLILZLL == null) {
                c2632010c.LLILZLL = new LiveStreamGoalMessageDialog();
            }
            LiveStreamGoalMessageDialog liveStreamGoalMessageDialog2 = c2632010c.LLILZLL;
            if (liveStreamGoalMessageDialog2 != null) {
                ArrayList<C238100vz> arrayList = c2632010c.LLIZLLLIL;
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                liveStreamGoalMessageDialog2.LL.clear();
                liveStreamGoalMessageDialog2.LL.addAll(arrayList);
                liveStreamGoalMessageDialog2.LLILLJJLI = currentUser;
                liveStreamGoalMessageDialog2.LLILZ = l;
            }
            FragmentManager fragmentManager = c2632010c.LLILLL;
            if (fragmentManager != null && (liveStreamGoalMessageDialog = c2632010c.LLILZLL) != null) {
                liveStreamGoalMessageDialog.show(fragmentManager, "LiveStreamGoalMessageDialog");
            }
            Room room = this.LLILZ;
            if (room == null || (streamType = room.getStreamType()) == null || (str = streamType.logStreamingType) == null) {
                str = "";
            }
            Room room2 = this.LLILZ;
            long id = (room2 == null || (owner = room2.getOwner()) == null) ? 0L : owner.getId();
            Room room3 = this.LLILZ;
            long id2 = room3 != null ? room3.getId() : 0L;
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            String strLJIJI = C497740JfY.LJIJI(2131842019);
            String str2 = strLJIJI != null ? strLJIJI : "";
            Long l2 = this.LLILLL;
            C238200w0.LIZ(str, id, id2, currentUserId, l2 != null ? l2.longValue() : 0L, "anchor", "ask_top_users", str2);
        }
        return Unit.LIZ;
    }
}
