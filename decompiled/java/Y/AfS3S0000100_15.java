package Y;

import X.C01EX;
import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C472820IgS;
import X.C915780ZwG;
import X.C916430ZxJ;
import X.C924990aB7;
import X.C925320aBe;
import X.C927160aEc;
import X.C927170aEd;
import X.C945370ahz;
import X.C953770avX;
import X.C963140bAe;
import X.C974540bT2;
import X.C982790bgL;
import X.InterfaceC915550Zvt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.LinkMicMatchAutoShowMatchDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multihost.biz.reservation.MultiCoHostNudgeCountUpEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLinkMicMatchConfigSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AfS3S0000100_15 implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
        }
    }

    public AfS3S0000100_15(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("IndividualMatchInviterCoordinator@dd3e.cancelOrphanBattle$1");
        C974540bT2.LIZ.LJJLJLI(afS3S0000100_15.j0);
        C1C7U.LIZIZ("IndividualMatchInviterCoordinator@dd3e.cancelOrphanBattle$1");
    }

    public static final void accept$1(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("IndividualMatchInviterCoordinator@dd3e.cancelOrphanBattle$2");
        C974540bT2.LIZ.LJJLJ(afS3S0000100_15.j0, (Throwable) obj);
        C1C7U.LIZIZ("IndividualMatchInviterCoordinator@dd3e.cancelOrphanBattle$2");
    }

    public static final void accept$10(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanMultiMatchBattle$1");
        C974540bT2.LIZ.LJJLJLI(afS3S0000100_15.j0);
        C1C7U.LIZIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanMultiMatchBattle$1");
    }

    public static final void accept$11(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanMultiMatchBattle$2");
        C974540bT2.LIZ.LJJLJ(afS3S0000100_15.j0, (Throwable) obj);
        C1C7U.LIZIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanMultiMatchBattle$2");
    }

    public static final void accept$12(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanTwoMatchBattle$1");
        C974540bT2.LIZ.LJJLJLI(afS3S0000100_15.j0);
        C1C7U.LIZIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanTwoMatchBattle$1");
    }

    public static final void accept$13(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanTwoMatchBattle$2");
        C974540bT2.LIZ.LJJLJ(afS3S0000100_15.j0, (Throwable) obj);
        C1C7U.LIZIZ("CombinedMatchInviterCoordinator@b8ec.cancelOrphanTwoMatchBattle$2");
    }

    public static final void accept$14(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("TwoMatchInviterCoordinator@7aa7.cancelOrphanBattle$1");
        C974540bT2.LIZ.LJJLJLI(afS3S0000100_15.j0);
        C1C7U.LIZIZ("TwoMatchInviterCoordinator@7aa7.cancelOrphanBattle$1");
    }

    public static final void accept$15(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("TwoMatchInviterCoordinator@7aa7.cancelOrphanBattle$2");
        C974540bT2.LIZ.LJJLJ(afS3S0000100_15.j0, (Throwable) obj);
        C1C7U.LIZIZ("TwoMatchInviterCoordinator@7aa7.cancelOrphanBattle$2");
    }

    public static final void accept$16(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("VoiceChatWatchPresenter@8e7f.getListByTypeWithAppLog$2");
        C01EX.LIZIZ((Throwable) obj, "list_by_type", null, C963140bAe.LIZIZ() - afS3S0000100_15.j0);
        C1C7U.LIZIZ("VoiceChatWatchPresenter@8e7f.getListByTypeWithAppLog$2");
    }

    public static final void accept$17(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CatchBeansPlayingCoordinatorAnchor@ec60.observeGameEvent$1$2");
        new C982790bgL().LJJJJL(0, System.currentTimeMillis() - afS3S0000100_15.j0, "");
        C20441214yg.LIZIZ("CatchBeansPlayingCoordinatorAnchor", " spwan bomb successfully");
        C1C7U.LIZIZ("CatchBeansPlayingCoordinatorAnchor@ec60.observeGameEvent$1$2");
    }

    public static final void accept$18(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CatchBeansPlayingCoordinatorAnchor@ec60.observeGameEvent$1$3");
        new C982790bgL().LJJJJL(-1, System.currentTimeMillis() - afS3S0000100_15.j0, "process combo failed");
        C1C7U.LIZIZ("CatchBeansPlayingCoordinatorAnchor@ec60.observeGameEvent$1$3");
    }

    public static final void accept$2(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        C1C7U.LIZ("CoHostNudgeReservationHelper@a063.startCountUp$2");
        long jLongValue = ((Number) obj).longValue() + 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountUp, value = ");
        sbLIZ.append(jLongValue);
        C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ));
        long j = afS3S0000100_15.j0;
        if (j > 0) {
            C916430ZxJ.LIZIZ.put(Long.valueOf(j), Long.valueOf(jLongValue));
            if (jLongValue < 300) {
                DataChannel dataChannel3 = C916430ZxJ.LJ;
                if (dataChannel3 != null) {
                    dataChannel3.LC0(MultiCoHostNudgeCountUpEvent.class, new C915780ZwG(j));
                }
            } else if (300 <= jLongValue && jLongValue < 3600) {
                if (jLongValue % ((long) 60) == 0 && (dataChannel2 = C916430ZxJ.LJ) != null) {
                    dataChannel2.LC0(MultiCoHostNudgeCountUpEvent.class, new C915780ZwG(j));
                }
            } else if (jLongValue == 3600) {
                DataChannel dataChannel4 = C916430ZxJ.LJ;
                if (dataChannel4 != null) {
                    dataChannel4.LC0(MultiCoHostNudgeCountUpEvent.class, new C915780ZwG(j));
                }
            } else if (jLongValue == 7200 && (dataChannel = C916430ZxJ.LJ) != null) {
                dataChannel.LC0(MultiCoHostNudgeCountUpEvent.class, new C915780ZwG(j));
            }
        }
        C1C7U.LIZIZ("CoHostNudgeReservationHelper@a063.startCountUp$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0ayC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$3(Y.AfS3S0000100_15 r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0000100_15.accept$3(Y.AfS3S0000100_15, java.lang.Object):void");
    }

    public static final void accept$4(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("MultiGuestV3GuestPresenter@ae69.getListByTypeWithAppLog$2");
        C01EX.LIZIZ((Throwable) obj, "list_by_type", null, C963140bAe.LIZIZ() - afS3S0000100_15.j0);
        C1C7U.LIZIZ("MultiGuestV3GuestPresenter@ae69.getListByTypeWithAppLog$2");
    }

    public static final void accept$5(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CloudDraftItemManager@9865.templateToDraftItem$1$5");
        C953770avX c953770avX = (C953770avX) obj;
        List<InterfaceC915550Zvt> list = CloudDraftItemManager.LJ.get(Long.valueOf(afS3S0000100_15.j0));
        if (list != null) {
            Iterator<InterfaceC915550Zvt> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(c953770avX);
            }
        }
        List<InterfaceC915550Zvt> list2 = CloudDraftItemManager.LJ.get(Long.valueOf(afS3S0000100_15.j0));
        if (list2 != null) {
            list2.clear();
        }
        CloudDraftItemManager.LJFF.put(Long.valueOf(afS3S0000100_15.j0), c953770avX);
        C1C7U.LIZIZ("CloudDraftItemManager@9865.templateToDraftItem$1$5");
    }

    public static final void accept$6(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("CloudDraftItemManager@9865.templateToDraftItem$1$6");
        Throwable th = (Throwable) obj;
        List<InterfaceC915550Zvt> list = CloudDraftItemManager.LJ.get(Long.valueOf(afS3S0000100_15.j0));
        if (list != null) {
            Iterator<InterfaceC915550Zvt> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(th);
            }
        }
        CloudDraftItemManager.LJ.remove(Long.valueOf(afS3S0000100_15.j0));
        C1C7U.LIZIZ("CloudDraftItemManager@9865.templateToDraftItem$1$6");
    }

    public static final void accept$7(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviterCoordinator@5026.cancelOrphanBattle$1");
        C974540bT2.LIZ.LJJLJLI(afS3S0000100_15.j0);
        C1C7U.LIZIZ("TeamMatchInviterCoordinator@5026.cancelOrphanBattle$1");
    }

    public static final void accept$8(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviterCoordinator@5026.cancelOrphanBattle$2");
        C974540bT2.LIZ.LJJLJ(afS3S0000100_15.j0, (Throwable) obj);
        C1C7U.LIZIZ("TeamMatchInviterCoordinator@5026.cancelOrphanBattle$2");
    }

    public static final void accept$9(AfS3S0000100_15 afS3S0000100_15, Object obj) {
        DataChannel dataChannel;
        C1C7U.LIZ("MultiGuestLinkMicMatchHelper@1d3e.startCountDown$1");
        DataChannel dataChannel2 = C927170aEd.LIZ;
        C927170aEd.LIZJ((int) ((Long) obj).longValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("countdown: ");
        sbLIZ.append(C927170aEd.LIZLLL);
        C472820IgS.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C927170aEd.LIZLLL == ((int) afS3S0000100_15.j0)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("【startCountDown】currentTimeSec == ");
            sbLIZ2.append(afS3S0000100_15.j0);
            sbLIZ2.append(", isShowMatchDialog = ");
            sbLIZ2.append(C927170aEd.LJ);
            sbLIZ2.append(", isShowAutoDialog = ");
            sbLIZ2.append(false);
            C472820IgS.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (!C927170aEd.LJ) {
                DataChannel dataChannel3 = C927170aEd.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("isNeedShowAutoDialog: autoDialogShowTimes = ");
                sbLIZ3.append(0);
                sbLIZ3.append(" , configTimes = ");
                MultiGuestLinkMicMatchConfigSettings multiGuestLinkMicMatchConfigSettings = MultiGuestLinkMicMatchConfigSettings.INSTANCE;
                sbLIZ3.append(multiGuestLinkMicMatchConfigSettings.getAudiencePanelShowFrequency());
                C472820IgS.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                if (multiGuestLinkMicMatchConfigSettings.getAudiencePanelShowFrequency() > 0 && !C924990aB7.LIZ(dataChannel3)) {
                    C925320aBe.LIZ.getClass();
                    if (!C925320aBe.LIZJ(dataChannel3) && (dataChannel = C927170aEd.LIZ) != null) {
                        dataChannel.LC0(LinkMicMatchAutoShowMatchDialogEvent.class, new C927160aEc(0, C945370ahz.LIZIZ));
                    }
                }
            }
        }
        C1C7U.LIZIZ("MultiGuestLinkMicMatchHelper@1d3e.startCountDown$1");
    }
}
