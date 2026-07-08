package X;

import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelItemMetaData;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelMetaData;
import com.bytedance.android.livesdk.guide.model.AnchorRoomInfo;
import com.bytedance.android.livesdk.guide.model.FirstRechargeMeta;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoExtra;
import com.bytedance.android.livesdk.guide.model.UserBaseData;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveRevenueFirstRechargeExpansionOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fTU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128580fTU {
    public static final long LIZ() {
        GiftPanelMetaData giftPanelMetaData;
        GiftPanelItemMetaData giftPanelItemMetaData;
        Long l;
        C1126800fQc.LIZ.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.GIFT_PANEL_TP.getType());
        if (c1123320fL0LIZIZ == null || (giftPanelMetaData = (GiftPanelMetaData) c1123320fL0LIZIZ.LIZLLL) == null || (giftPanelItemMetaData = giftPanelMetaData.item) == null || (l = giftPanelItemMetaData.giftId) == null || l.longValue() <= 0) {
            return 6890L;
        }
        return l.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.0fRM] */
    public static final void LIZIZ(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList) {
        Gift giftFindGiftById;
        FirstRechargeMeta firstRechargeMeta;
        Object c098200Yq;
        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
        iRevenueStrategyService.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.GIFT_PANEL_TP.getType());
        if (c1123320fL0LIZIZ != null) {
            long jLIZ = LIZ();
            Gift giftFindGiftById2 = GiftService.LLILLJJLI.findGiftById(jLIZ);
            if (giftFindGiftById2 == null) {
                InterfaceC1133710fbl.LIZ.getClass();
                C1120710fGn.LIZ();
                giftFindGiftById2 = C1133940fc8.LJFF();
                if (giftFindGiftById2 != null) {
                    giftFindGiftById2.id = jLIZ;
                } else {
                    return;
                }
            }
            linkedList.addFirst(new C1127220fRI(giftFindGiftById2, (GiftPanelMetaData) c1123320fL0LIZIZ.LIZLLL, new InterfaceC1126960fQs() { // from class: X.0fRM
                @Override // X.InterfaceC1126960fQs
                public final void LIZ() {
                    if (C1126800fQc.LIZ.KE0().LJI(107) != null) {
                        C0JT6<Long> c0jt6 = C1143820fs4.LIZIZ;
                        Long lLIZ = c0jt6.LIZ();
                        if (lLIZ == null || lLIZ.longValue() <= 0) {
                            c0jt6.LIZJ(Long.valueOf(C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                        }
                    }
                }
            }));
            return;
        }
        InterfaceC1133710fbl.LIZ.getClass();
        if (((C1133940fc8) C1120710fGn.LIZ()).LJIIJ()) {
            C1120710fGn.LIZ();
            Gift giftLJFF = C1133940fc8.LJFF();
            if (giftLJFF != null) {
                if (((C1133940fc8) C1120710fGn.LIZ()).LIZIZ()) {
                    linkedList.addFirst(new C293101Bp(giftLJFF));
                    return;
                }
                if (LiveRevenueFirstRechargeExpansionOptSetting.INSTANCE.isGroupV1()) {
                    iRevenueStrategyService.KE0().getClass();
                    Iterator<C1134410fct> it2 = TaskManagerV2.LIZIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1134410fct next = it2.next();
                        TaskInfoExtra taskInfoExtra = ((TaskInfo) next.LIZ).extra;
                        if (taskInfoExtra != null && (firstRechargeMeta = taskInfoExtra.firstRecharge) != null && firstRechargeMeta.isMoveGiftEntrance) {
                            if (next != null) {
                                try {
                                    if (linkedList.size() <= 4) {
                                        linkedList.addLast(new C293301Br(giftLJFF));
                                    } else {
                                        linkedList.add(4, new C293301Br(giftLJFF));
                                    }
                                    c098200Yq = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                C189200o6.m1boximpl(c098200Yq);
                                return;
                            }
                        }
                    }
                }
                linkedList.addFirst(new C293301Br(giftLJFF));
                return;
            }
            return;
        }
        C1134410fct c1134410fctLJI = iRevenueStrategyService.KE0().LJI(106);
        if (c1134410fctLJI != null && c1134410fctLJI.LJIIJJI() && (giftFindGiftById = GiftService.LLILLJJLI.findGiftById(6890L)) != null) {
            linkedList.addFirst(new C293301Br(giftFindGiftById));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LIZJ(Long l) {
        UserBaseData userBaseData;
        C1134410fct c1134410fctLJI = C1126800fQc.LIZ.KE0().LJI(107);
        if (!(c1134410fctLJI instanceof C1134410fct)) {
            c1134410fctLJI = null;
        }
        if (c1134410fctLJI == null || l == null) {
            return 0;
        }
        long jLongValue = l.longValue();
        if (jLongValue <= 0) {
            return 0;
        }
        long jLIZJ = C158B.LIZJ();
        TaskInfo taskInfo = (TaskInfo) c1134410fctLJI.LIZ;
        if (taskInfo.taskType != 107 || jLIZJ < taskInfo.taskStartTime || jLIZJ > taskInfo.taskCompleteEndTime || taskInfo.taskStatus != 2) {
            return 0;
        }
        for (TaskInfo taskInfo2 : taskInfo.subTasks) {
            AnchorRoomInfo anchorRoomInfo = taskInfo2.anchorRoomInfo;
            if (anchorRoomInfo != null && (userBaseData = anchorRoomInfo.anchor) != null && userBaseData.id == jLongValue && taskInfo2.taskStatus == 2) {
                return 1;
            }
        }
        return 0;
    }
}
