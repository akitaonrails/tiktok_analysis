package X;

import android.os.Looper;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.guide.model.AnchorRoomInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.UserBaseData;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveCoinUgPointsGiftSettings;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveIncentiveTaskUpdateConcurrentFixSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134410fct extends AbstractC1134420fcu<TaskInfo, C1134410fct> {
    public static final /* synthetic */ int LJII = 0;
    public final String LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final C1132300fZU LJIIIZ() {
        T t = this.LIZ;
        long j = ((TaskInfo) t).rewardAmount;
        return new C1132300fZU(((TaskInfo) t).rewardType, ((TaskInfo) t).preRewardType == 2, j, ((TaskInfo) t).rewardGiftId, ((TaskInfo) t).preRewardAmount);
    }

    @Override // X.AbstractC1134420fcu
    public final void LIZIZ() {
        super.LIZIZ();
        C500260Jjc.LJJLIIIJILLIZJL(new AwS561S0100000_17(this, 670));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIJJI() {
        switch (C1134450fcx.LIZ[LIZJ().ordinal()]) {
            case 1:
                C20441214yg.LJIIL("BaseIncentiveTask", "task status is unknown, should be avoided");
                return C158B.LIZJ() <= ((TaskInfo) this.LIZ).taskCompleteEndTime;
            case 2:
            case 3:
                return C158B.LIZJ() <= ((TaskInfo) this.LIZ).taskCompleteEndTime;
            case 4:
            case 5:
            case 6:
            case 7:
                return C158B.LIZJ() <= ((TaskInfo) this.LIZ).taskRewardEndTime;
            case 8:
                return false;
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[TaskId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append("\nTaskType=");
        sbLIZ.append(((TaskInfo) this.LIZ).taskType);
        sbLIZ.append("\nStatus=");
        sbLIZ.append(LIZJ());
        sbLIZ.append("\nSubTasks=");
        sbLIZ.append(this.LJ.size());
        sbLIZ.append("\n]");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1134420fcu
    public final String LIZLLL() {
        return this.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1134410fct(TaskInfo taskInfo) {
        super(taskInfo);
        this.LJI = ((TaskInfo) this.LIZ).taskId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJII(C1134410fct c1134410fct) {
        if (!c1134410fct.LJ.isEmpty()) {
            List<S> list = c1134410fct.LJ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!LJII((C1134410fct) it2.next())) {
                        return false;
                    }
                }
            }
            return true;
        }
        int i = C1134450fcx.LIZ[c1134410fct.LIZJ().ordinal()];
        if ((i == 1 || i == 2 || i == 3) && C158B.LIZJ() <= ((TaskInfo) c1134410fct.LIZ).taskCompleteEndTime) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(C1134410fct c1134410fct) {
        if (!c1134410fct.LJ.isEmpty()) {
            List<S> list = c1134410fct.LJ;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (LJIIIIZZ((C1134410fct) it2.next())) {
                    return true;
                }
            }
            return false;
        }
        return c1134410fct.LJIIJJI();
    }

    @Override // X.AbstractC1134420fcu
    public final EnumC1134460fcy LJFF(TaskInfo taskInfo) {
        EnumC1134460fcy enumC1134460fcyLIZIZ = C1134430fcv.LIZIZ(taskInfo.taskStatus);
        if (enumC1134460fcyLIZIZ == null) {
            return EnumC1134460fcy.TASK_UNKNOWN;
        }
        return enumC1134460fcyLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1134420fcu
    public final void LJI(EnumC1134460fcy enumC1134460fcy) {
        if (((TaskInfo) this.LIZ).taskType == 1 && enumC1134460fcy.compareTo(LIZJ()) < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("illegal, curStatus = ");
            sbLIZ.append(LIZJ());
            sbLIZ.append(", newStatus = ");
            sbLIZ.append(enumC1134460fcy);
            C20441214yg.LIZIZ("BaseIncentiveTask", C2188811AlT.LIZIZ(sbLIZ));
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1124750fNJ(this, null), 3);
            return;
        }
        LJIILIIL(((TaskInfo) this.LIZ).taskStatus, enumC1134460fcy);
        ((TaskInfo) this.LIZ).taskStatus = C1134430fcv.LIZJ(enumC1134460fcy);
        super.LJI(enumC1134460fcy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TaskInfo LJIIJ(long j) {
        UserBaseData userBaseData;
        if (j <= 0) {
            return null;
        }
        long jLIZJ = C158B.LIZJ();
        TaskInfo taskInfo = (TaskInfo) this.LIZ;
        if (taskInfo.taskType == 107 && jLIZJ >= taskInfo.taskStartTime && jLIZJ <= taskInfo.taskCompleteEndTime && taskInfo.taskStatus == 2) {
            for (TaskInfo taskInfo2 : taskInfo.subTasks) {
                AnchorRoomInfo anchorRoomInfo = taskInfo2.anchorRoomInfo;
                if (anchorRoomInfo != null && (userBaseData = anchorRoomInfo.anchor) != null && userBaseData.id == j && taskInfo2.taskStatus == 2) {
                    for (TaskInfo taskInfo3 : taskInfo2.subTasks) {
                        if (taskInfo3.taskStatus == 2 && jLIZJ >= taskInfo3.taskStartTime && jLIZJ <= taskInfo3.taskCompleteEndTime) {
                            for (TaskInfo taskInfo4 : taskInfo3.subTasks) {
                                if (taskInfo4.taskStatus == 2 && taskInfo4.targetType == 1) {
                                    return taskInfo4;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(EnumC1134460fcy enumC1134460fcy) {
        LJIILIIL(((TaskInfo) this.LIZ).taskStatus, enumC1134460fcy);
        this.LIZJ = enumC1134460fcy;
        ((TaskInfo) this.LIZ).taskStatus = C1134430fcv.LIZJ(enumC1134460fcy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIILJJIL(TaskInfo taskInfo) {
        Object next;
        Object next2;
        if (LiveIncentiveTaskUpdateConcurrentFixSetting.INSTANCE.isEnable()) {
            this.LIZ = taskInfo;
            ArrayList<TaskInfo> arrayList = new ArrayList(((TaskInfo) this.LIZ).subTasks);
            if (arrayList.isEmpty()) {
                LJI(LJFF(this.LIZ));
                return;
            }
            List<S> list = this.LJ;
            ArrayList<C1134410fct> arrayList2 = new ArrayList();
            for (Object obj : list) {
                C1134410fct c1134410fct = (C1134410fct) obj;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(((TaskInfo) it2.next()).taskId, c1134410fct.LJI)) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj);
            }
            for (C1134410fct c1134410fct2 : arrayList2) {
                C470360IcU.LIZ(new AwS561S0100000_17(c1134410fct2, 674));
                c1134410fct2.LJ();
            }
            for (TaskInfo taskInfo2 : arrayList) {
                Iterator it3 = this.LJ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(((C1134410fct) next2).LJI, taskInfo2.taskId)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C1134410fct c1134410fct3 = (C1134410fct) next2;
                if (c1134410fct3 != null) {
                    c1134410fct3.LJIILJJIL(taskInfo2);
                    LJIIL(LJFF(this.LIZ));
                    C470360IcU.LIZ(new AwS561S0100000_17(c1134410fct3, 675));
                } else {
                    C1134410fct c1134410fctLIZ = C1134430fcv.LIZ(taskInfo2);
                    if (c1134410fctLIZ != null) {
                        C470360IcU.LIZ(new AwS561S0100000_17(c1134410fctLIZ, 676));
                        this.LJ.add(c1134410fctLIZ);
                        c1134410fctLIZ.LJFF = this;
                    }
                }
            }
            return;
        }
        this.LIZ = taskInfo;
        if (taskInfo.subTasks.isEmpty()) {
            LJI(LJFF(this.LIZ));
            return;
        }
        List<S> list2 = this.LJ;
        ArrayList<C1134410fct> arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C1134410fct c1134410fct4 = (C1134410fct) obj2;
            List<TaskInfo> list3 = ((TaskInfo) this.LIZ).subTasks;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<TaskInfo> it4 = list3.iterator();
                while (it4.hasNext()) {
                    if (Intrinsics.LJFF(it4.next().taskId, c1134410fct4.LJI)) {
                        break;
                    }
                }
            }
            arrayList3.add(obj2);
        }
        for (C1134410fct c1134410fct5 : arrayList3) {
            C470360IcU.LIZ(new AwS561S0100000_17(c1134410fct5, 671));
            c1134410fct5.LJ();
        }
        for (TaskInfo taskInfo3 : ((TaskInfo) this.LIZ).subTasks) {
            Iterator it5 = this.LJ.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next = it5.next();
                    if (Intrinsics.LJFF(((C1134410fct) next).LJI, taskInfo3.taskId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1134410fct c1134410fct6 = (C1134410fct) next;
            if (c1134410fct6 != null) {
                c1134410fct6.LJIILJJIL(taskInfo3);
                LJIIL(LJFF(this.LIZ));
                C470360IcU.LIZ(new AwS561S0100000_17(c1134410fct6, 672));
            } else {
                C1134410fct c1134410fctLIZ2 = C1134430fcv.LIZ(taskInfo3);
                if (c1134410fctLIZ2 != null) {
                    C470360IcU.LIZ(new AwS561S0100000_17(c1134410fctLIZ2, 673));
                    this.LJ.add(c1134410fctLIZ2);
                    c1134410fctLIZ2.LJFF = this;
                }
            }
        }
    }

    public static void LJIILIIL(int i, EnumC1134460fcy enumC1134460fcy) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin() && i == 3) {
            if (enumC1134460fcy == EnumC1134460fcy.TASK_EXIT || enumC1134460fcy == EnumC1134460fcy.TASK_REWARDED) {
                C786410Ut5.LJLIIL(((long) LiveCoinUgPointsGiftSettings.INSTANCE.getDelayTimeSeconds()) * 1000, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0fcw
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BaseIncentiveTask@25a1.syncUgBalance$1");
                        try {
                            ((IRevenueStrategyService) C1161920gLG.LIZJ(IRevenueStrategyService.class)).Wy0();
                            C1143980fsK.LJIILL();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BaseIncentiveTask@25a1.syncUgBalance$1");
                    }
                });
            }
        }
    }
}
