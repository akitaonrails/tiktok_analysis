package X;

import Y.AfS0S0110200_12;
import android.util.Log;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoalGift;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;

/* JADX INFO: renamed from: X.0Uh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778980Uh6 implements InterfaceC778470UgH<LiveStreamGoalServerMessage> {
    public DataChannel LIZIZ;
    public final C11NJ LIZ = new C11NJ();
    public final C779010Uh9 LIZJ = new C779010Uh9();

    @Override // X.InterfaceC778470UgH
    public final int LIZ() {
        return C001A.STREAM_GOAL_SERVER_MESSAGE.getIntType();
    }

    @Override // X.InterfaceC778470UgH
    public final void onRelease() {
        this.LIZ.dispose();
    }

    @Override // X.InterfaceC778470UgH
    public final void LIZIZ(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }

    public final void LIZJ(int i) {
        String str;
        if (i == 80) {
            str = "sub_goal_80%";
        } else {
            str = "sub_goal_50%";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        String strLJIJJ = C497740JfY.LJIJJ(2131842963, C2188811AlT.LIZIZ(sbLIZ));
        String strLJIJJ2 = C497740JfY.LJIJJ(2131843025, strLJIJJ);
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJII(new C778150Ufl("sub_goal", str, C779060UhE.LIZ(strLJIJJ2, strLJIJJ), (ImageModel) null, 24));
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null) {
            return;
        }
        dataChannel.zW(TipMessageChannel.class, new C778500UgK(C779060UhE.LIZ(strLJIJJ2, strLJIJJ), EnumC778100Ufg.LIVE_TIP_GAMING_SUB_GOAL.ordinal(), new C778610UgV(str, null, null, 6), 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC778470UgH
    public final void onMessage(IMessage iMessage) {
        boolean z;
        LiveStreamSubGoal liveStreamSubGoal;
        List<LiveStreamSubGoal> list;
        LiveStreamSubGoal liveStreamSubGoal2;
        LiveStreamSubGoalGift liveStreamSubGoalGift;
        List<LiveStreamSubGoal> list2;
        LiveStreamSubGoal liveStreamSubGoal3;
        if (iMessage instanceof LiveStreamGoalServerMessage) {
            LiveStreamGoalServerMessage liveStreamGoalServerMessage = (LiveStreamGoalServerMessage) iMessage;
            LiveStreamGoal liveStreamGoal = liveStreamGoalServerMessage.goal;
            boolean z2 = true;
            if (liveStreamGoal != null) {
                if (liveStreamGoal.type == 2) {
                    z = true;
                } else {
                    z = false;
                }
                T t = 0;
                t = 0;
                t = 0;
                t = 0;
                if (z) {
                    if (liveStreamGoal != null && (list2 = liveStreamGoal.subGoals) != null && (liveStreamSubGoal3 = (LiveStreamSubGoal) C13LP.LJJJLZIJ(0, list2)) != null) {
                        long j = liveStreamSubGoal3.target;
                        if (j <= 0) {
                            return;
                        }
                        if (liveStreamSubGoal3.progress != j) {
                            z2 = false;
                        }
                        this.LIZ.LIZ(C11NZ.LJJJJZ(Long.valueOf(liveStreamSubGoal3.progress)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS0S0110200_12((long) Math.ceil(j * 0.8d), (long) Math.ceil(liveStreamSubGoal3.target * 0.5d), this, z2, 0), new C09JN() { // from class: X.0UhC
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("GameSubGoalNotice@d2d3.onMessage$1$2");
                                C20441214yg.LJ("GameSubGoalNotice", Log.getStackTraceString((Throwable) obj));
                                C1C7U.LIZIZ("GameSubGoalNotice@d2d3.onMessage$1$2");
                            }
                        }));
                        return;
                    }
                    return;
                }
                if (liveStreamGoal != null && liveStreamGoal.type == 1 && (liveStreamSubGoal = liveStreamGoalServerMessage.contributeSubgoal) != null) {
                    long j2 = liveStreamSubGoal.target;
                    if (j2 <= 0) {
                        return;
                    }
                    if (liveStreamSubGoal.progress != j2) {
                        z2 = false;
                    }
                    final C259800zU c259800zU = new C259800zU();
                    LiveStreamGoal liveStreamGoal2 = liveStreamGoalServerMessage.goal;
                    if (liveStreamGoal2 != null && (list = liveStreamGoal2.subGoals) != null && (liveStreamSubGoal2 = (LiveStreamSubGoal) C13LP.LJJJLZIJ(0, list)) != null && (liveStreamSubGoalGift = liveStreamSubGoal2.gift) != null) {
                        t = liveStreamSubGoalGift.icon;
                    }
                    c259800zU.element = t;
                    final long jCeil = (long) Math.ceil(liveStreamSubGoal.target * 0.8d);
                    final long jCeil2 = (long) Math.ceil(liveStreamSubGoal.target * 0.5d);
                    final boolean z3 = z2;
                    this.LIZ.LIZ(C11NZ.LJJJJZ(Long.valueOf(liveStreamSubGoal.progress)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0Uh7
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GameSubGoalNotice@d2d3.onMessage$2$1");
                            Long l = (Long) obj;
                            if (z3) {
                                C778980Uh6 c778980Uh6 = this;
                                C779010Uh9 c779010Uh9 = c778980Uh6.LIZJ;
                                DataChannel dataChannel = c778980Uh6.LIZIZ;
                                ImageModel imageModel = c259800zU.element;
                                c779010Uh9.getClass();
                                String strLJIJI = C497740JfY.LJIJI(2131842961);
                                String strLJIJJ = C497740JfY.LJIJJ(2131842959, strLJIJI);
                                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                                    C777840UfG.LJII(new C778150Ufl("live_goal", "live_goal_completed", C779060UhE.LIZ(strLJIJJ, strLJIJI), imageModel, 16));
                                } else if (dataChannel != null) {
                                    dataChannel.zW(TipMessageChannel.class, new C778500UgK(C779060UhE.LIZ(strLJIJJ, strLJIJI), EnumC778100Ufg.LIVE_TIP_GAMING_LIVE_GOAL.ordinal(), new C778610UgV("live_goal_completed", imageModel, -15686971), 8));
                                }
                            } else {
                                long j3 = jCeil;
                                if (l != null && l.longValue() == j3) {
                                    C778980Uh6 c778980Uh62 = this;
                                    C779010Uh9 c779010Uh92 = c778980Uh62.LIZJ;
                                    DataChannel dataChannel2 = c778980Uh62.LIZIZ;
                                    ImageModel imageModel2 = c259800zU.element;
                                    c779010Uh92.getClass();
                                    C779010Uh9.LIZ(dataChannel2, 80, imageModel2);
                                } else {
                                    long j4 = jCeil2;
                                    if (l != null && l.longValue() == j4) {
                                        C778980Uh6 c778980Uh63 = this;
                                        C779010Uh9 c779010Uh93 = c778980Uh63.LIZJ;
                                        DataChannel dataChannel3 = c778980Uh63.LIZIZ;
                                        ImageModel imageModel3 = c259800zU.element;
                                        c779010Uh93.getClass();
                                        C779010Uh9.LIZ(dataChannel3, 50, imageModel3);
                                    }
                                }
                            }
                            C1C7U.LIZIZ("GameSubGoalNotice@d2d3.onMessage$2$1");
                        }
                    }, new C09JN() { // from class: X.0UhD
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GameSubGoalNotice@d2d3.onMessage$2$2");
                            C20441214yg.LJ("GameSubGoalNotice", Log.getStackTraceString((Throwable) obj));
                            C1C7U.LIZIZ("GameSubGoalNotice@d2d3.onMessage$2$2");
                        }
                    }));
                }
            }
        }
    }
}
