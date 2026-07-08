package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.provider.Settings;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.adminsetting.LiveCommentFlagFilterFragmentSheet;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786040UsU implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public static final void onCheckedChanged$0(C786040UsU c786040UsU, CompoundButton compoundButton, boolean z) {
        String str;
        long id;
        CommentSwitchSettings commentSwitchSettings = (CommentSwitchSettings) c786040UsU.l0;
        if (commentSwitchSettings != null) {
            LiveCommentFlagFilterFragmentSheet liveCommentFlagFilterFragmentSheet = (LiveCommentFlagFilterFragmentSheet) c786040UsU.l1;
            Long l = (Long) c786040UsU.l2;
            commentSwitchSettings.chatCommunityFlagged = C750850Tcp.LIZIZ(z);
            liveCommentFlagFilterFragmentSheet.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_community_flag_capsule_page");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            if (((Boolean) liveCommentFlagFilterFragmentSheet.LLLFF.getValue()).booleanValue()) {
                str = "anchor";
            } else {
                str = "admin";
            }
            c474500IjALIZ.LJJII(str, "admin_type");
            Room room = (Room) liveCommentFlagFilterFragmentSheet.LLLF.getValue();
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
            c474500IjALIZ.LJJII(Integer.valueOf(liveCommentFlagFilterFragmentSheet.LLL ? 1 : 0), "live_room_first_time_see");
            c474500IjALIZ.LJJII(l, "trigger");
            c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "community_flag_filter_status");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void onCheckedChanged$1(C786040UsU c786040UsU, CompoundButton compoundButton, boolean z) {
        Function1<? super C747370TTj, Unit> function1 = ((C747320TTe) c786040UsU.l0).LL.LLJJJ;
        if (function1 != null) {
            function1.invoke((C747370TTj) c786040UsU.l1);
        }
        Context context = ((C127K) c786040UsU.l2).getContext();
        if (context != null && Settings.Secure.getInt(context.getContentResolver(), "touch_exploration_enabled", 0) != 0) {
            HandlerHook.viewPostDelay((C127K) c786040UsU.l2, new ARunnableS112S0100000_12((C747320TTe) c786040UsU.l0, 151), 500L);
        } else {
            ((C747320TTe) c786040UsU.l0).LL.dismiss();
        }
    }

    public C786040UsU(C747320TTe c747320TTe, C747370TTj c747370TTj, C127K c127k, int i) {
        this.$t = i;
        this.l0 = c747320TTe;
        this.l1 = c747370TTj;
        this.l2 = c127k;
    }

    public C786040UsU(CommentSwitchSettings commentSwitchSettings, LiveCommentFlagFilterFragmentSheet liveCommentFlagFilterFragmentSheet, Long l, long[] jArr, int i) {
        this.$t = i;
        this.l0 = commentSwitchSettings;
        this.l1 = liveCommentFlagFilterFragmentSheet;
        this.l2 = l;
    }
}
