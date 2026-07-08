package X;

import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.api.RedDot;
import com.bytedance.android.livesdk.chatroom.api.SubMilestoneInfo;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import java.util.List;
import webcast.api.sub.PerksPinPanel;
import webcast.api.sub.SubGoal;
import webcast.api.sub.SubscriberCountInfo;
import webcast.api.sub.Tip;

/* JADX INFO: renamed from: X.0Jyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509770Jyx {
    public final PerksPinPanel LIZ;
    public final Tip LIZIZ;
    public final List<SubscriberCountInfo> LIZJ;
    public final SubGoal LIZLLL;
    public final boolean LJ;
    public final LiveSubOnlyConfig LJFF;
    public final TimerDetail LJI;
    public final boolean LJII;
    public final SubGifInfo LJIIIIZZ;
    public final SubLiveBanner LJIIIZ;
    public final SubMilestoneInfo LJIIJ;
    public final boolean LJIIJJI;
    public final RedDot LJIIL;
    public final boolean LJIILIIL;
    public final List<UpdateTips> LJIILJJIL;

    public C509770Jyx(PerksPinPanel perksPinPanel, Tip tip, List<SubscriberCountInfo> list, SubGoal subGoal, boolean z, LiveSubOnlyConfig liveSubOnlyConfig, TimerDetail timerDetail, boolean z2, SubGifInfo subGifInfo, SubLiveBanner subLiveBanner, SubMilestoneInfo subMilestoneInfo, boolean z3, RedDot redDot, boolean z4, List<UpdateTips> list2) {
        this.LIZ = perksPinPanel;
        this.LIZIZ = tip;
        this.LIZJ = list;
        this.LIZLLL = subGoal;
        this.LJ = z;
        this.LJFF = liveSubOnlyConfig;
        this.LJI = timerDetail;
        this.LJII = z2;
        this.LJIIIIZZ = subGifInfo;
        this.LJIIIZ = subLiveBanner;
        this.LJIIJ = subMilestoneInfo;
        this.LJIIJJI = z3;
        this.LJIIL = redDot;
        this.LJIILIIL = z4;
        this.LJIILJJIL = list2;
    }
}
