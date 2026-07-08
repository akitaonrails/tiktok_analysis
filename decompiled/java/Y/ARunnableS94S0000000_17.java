package Y;

import X.AbstractC1134420fcu;
import X.AbstractC19994813Le;
import X.AnonymousClass0997;
import X.AnonymousClass0998;
import X.C0PEM;
import X.C1101370elb;
import X.C1102420enI;
import X.C1104090epz;
import X.C1134410fct;
import X.C1134550fd7;
import X.C1134560fd8;
import X.C1134760fdS;
import X.C1134770fdT;
import X.C1134790fdV;
import X.C1161920gLG;
import X.C1300480jwk;
import X.C13LP;
import X.C1C7U;
import X.C1EOY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C470360IcU;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.TaskLoadCompleteEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.guide.model.TaskUtilExtra;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.gift.LiveScoreSystemFluencyDuration;
import com.bytedance.android.livesdk.livesetting.gift.LiveScoreSystemFluencyInterval;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS94S0000000_17 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                GiftManager.lambda$_inst$1();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0() {
        TaskUtilExtra taskUtilExtra;
        TaskUtilExtra taskUtilExtra2;
        TaskUtilExtra taskUtilExtra3;
        TaskUtilExtra taskUtilExtra4;
        if (TaskManagerV2.LIZJ == null) {
            TaskManagerV2.LIZ.getClass();
            TaskInfoResponse.Data data = TaskManagerV2.LIZLLL;
            long jNextLong = 0;
            if (data == null || (taskUtilExtra = data.taskUtilExtra) == null || taskUtilExtra.refreshRequestSeconds <= 0) {
                C20441214yg.LJIIIZ("IncentiveDebug", "[date switch] normal date switch");
                TaskManagerV2.LJIIZILJ();
                DataChannelGlobal.LLILZ.FQ2(TaskLoadCompleteEvent.class, new C1104090epz(true));
                C470360IcU.LIZ(AFwS205S0000000_17.get$arr$(51));
                return;
            }
            if (data != null && (taskUtilExtra2 = data.taskUtilExtra) != null) {
                jNextLong = AbstractC19994813Le.Default.nextLong(1L, taskUtilExtra2.refreshRequestSeconds + 1) * 1000;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[date switch] daily task need refresh, delay ");
            sbLIZ.append(jNextLong);
            sbLIZ.append(" ms");
            C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
            TaskManagerV2.LIZLLL = null;
            TaskManagerV2.LIZIZ.clear();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new AnonymousClass0997(jNextLong, null), 3);
            return;
        }
        C20441214yg.LJIIIZ("IncentiveDebug", "[date switch] has prefetched task");
        TaskInfoResponse.Data data2 = TaskManagerV2.LIZJ;
        if (data2 != null) {
            TaskManagerV2.LIZ.getClass();
            TaskManagerV2.LJJI(data2);
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            TaskManagerV2.LIZ.getClass();
            ArrayList arrayList = (ArrayList) TaskManagerV2.LJIIIIZZ();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((TaskInfo) ((AbstractC1134420fcu) it2.next()).LIZ).taskType == 1) {
                    }
                }
            }
            C20441214yg.LJIIIZ("IncentiveDebug", "[date switch] prefetch watch live task invalid, need refresh");
            TaskManagerV2.LIZ.getClass();
            TaskManagerV2.LIZJ = null;
            TaskManagerV2.LIZLLL = null;
            TaskManagerV2.LIZIZ.clear();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new AnonymousClass0998(null), 3);
            return;
        }
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        TaskInfoResponse.Data data3 = TaskManagerV2.LIZJ;
        Long lValueOf = (data3 == null || (taskUtilExtra4 = data3.taskUtilExtra) == null) ? null : Long.valueOf(taskUtilExtra4.endOfDayTs);
        taskManagerV2.getClass();
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            TaskInfoResponse.Data data4 = TaskManagerV2.LIZLLL;
            if (data4 != null && (taskUtilExtra3 = data4.taskUtilExtra) != null) {
                taskUtilExtra3.endOfDayTs = jLongValue;
            }
            C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
            C1134560fd8.LIZ(jLongValue);
        }
        TaskManagerV2.LJIIZILJ();
        TaskManagerV2.LIZJ = null;
        DataChannelGlobal.LLILZ.FQ2(TaskLoadCompleteEvent.class, new C1104090epz(true));
    }

    public final void LIZ$1() {
        if (C1134760fdS.LLILZIL != this) {
            return;
        }
        Iterator<T> it2 = C1134760fdS.LLILLJJLI.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1134790fdV c1134790fdV = (C1134790fdV) it2.next();
            long j = c1134790fdV.LIZJ;
            long j2 = c1134790fdV.LIZIZ;
            boolean z = j >= j2;
            if (!c1134790fdV.LIZLLL || !z) {
                c1134790fdV.LIZJ = Math.min(j + 1000, j2);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Collection<C1134790fdV> collectionValues = C1134760fdS.LLILLJJLI.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C1134790fdV c1134790fdV2 = (C1134790fdV) obj;
            if (!c1134790fdV2.LIZLLL && jElapsedRealtime >= c1134790fdV2.LJ) {
                long j3 = c1134790fdV2.LIZJ;
                if (j3 < c1134790fdV2.LIZIZ) {
                    long j4 = c1134790fdV2.LJI;
                    if (j4 <= 0 || j3 % j4 != 0 || j3 <= 0) {
                    }
                }
                arrayList.add(obj);
            }
        }
        List<C1134790fdV> listLLIIII = C13LP.LLIIII(arrayList);
        if (!listLLIIII.isEmpty()) {
            for (C1134790fdV c1134790fdV3 : listLLIIII) {
                String str = c1134790fdV3.LIZ;
                TaskManagerV2.LIZ.getClass();
                C1134410fct c1134410fctLIZIZ = C1134760fdS.LIZIZ(str, TaskManagerV2.LIZIZ);
                long j5 = c1134790fdV3.LIZJ;
                boolean z2 = j5 >= c1134790fdV3.LIZIZ;
                int i = c1134790fdV3.LJFF;
                C1134760fdS c1134760fdS = C1134760fdS.LL;
                if (i >= 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkAndHandleCompletedTasks: Max retry reached for taskId=");
                    sbLIZ.append(str);
                    sbLIZ.append(", stop tracking.");
                    C20441214yg.LJIIL("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ));
                    c1134760fdS.LJII(Collections.singletonList(str));
                } else if (c1134410fctLIZIZ != null) {
                    c1134790fdV3.LIZLLL = true;
                    if (z2) {
                        c1134790fdV3.LJFF = i + 1;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1134770fdT(c1134410fctLIZIZ, j5 / 1000, z2, str, c1134790fdV3, null), 3);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkAndHandleCompletedTasks: task not found for taskId=");
                    sbLIZ2.append(str);
                    C20441214yg.LJIIL("TaskWatchLiveDurationTracker", C2188811AlT.LIZIZ(sbLIZ2));
                    c1134760fdS.LJII(Collections.singletonList(str));
                }
            }
        }
        C1134550fd7.LIZ.getClass();
        if (!C1134550fd7.LIZIZ) {
            C1134760fdS.LL.LJI();
        } else if (!C1134760fdS.LLILLJJLI.isEmpty()) {
            C786410Ut5.LJLIIL(1000L, C1134760fdS.LIZLLL(), this);
            C1134760fdS.LLILLL = true;
        } else {
            C20441214yg.LJIIIZ("TaskWatchLiveDurationTracker", "No active tasks, pausing tracker.");
            C1134760fdS.LL.LJI();
        }
    }

    public final void LIZ$2() {
        if (C1101370elb.LJII) {
            C1101370elb.LIZIZ.LJFF.stop();
            C1101370elb.LJII = false;
            C786410Ut5.LJLIIL(((long) LiveScoreSystemFluencyInterval.INSTANCE.getValue()) * 1000, C1101370elb.LJI, this);
            return;
        }
        int value = LiveScoreSystemFluencyDuration.INSTANCE.getValue();
        if (value <= 0) {
            return;
        }
        C1101370elb.LIZIZ.LJFF.start();
        C1101370elb.LJII = true;
        C786410Ut5.LJLIIL(((long) value) * 1000, C1101370elb.LJI, this);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS94S0000000_17(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 0: goto Le;
                case 1: goto Lc;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto Lc;
                default: goto L5;
            }
        L5:
            r1 = r2
            X.1EOY r0 = X.C1EOY.LIZ
        L8:
            r1.<init>()
            return
        Lc:
            r1 = r2
            goto L8
        Le:
            r1 = r2
            java.util.HashMap<java.lang.Long, com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota> r0 = X.C1102420enI.LIZ
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS94S0000000_17.<init>(int):void");
    }

    public static final void run$0(ARunnableS94S0000000_17 aRunnableS94S0000000_17) {
        HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.syncReportRecord$1L");
        C1102420enI.LJIILIIL();
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.syncReportRecord$1L");
    }

    public static final void run$1(ARunnableS94S0000000_17 aRunnableS94S0000000_17) {
        C1C7U.LIZ("LiveEmojiInputDialogFragment@b667.onActivityCreated$2L");
        C1EOY c1eoy = C1EOY.LIZ;
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("panel_comment_open");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
        C1300480jwk c1300480jwkLIZIZ2 = c1eoy.LIZIZ("panel_comment_period");
        if (c1300480jwkLIZIZ2 != null) {
            c1300480jwkLIZIZ2.LIZJ(null);
        }
        C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.onActivityCreated$2L");
    }

    public static final void run$2(ARunnableS94S0000000_17 aRunnableS94S0000000_17) {
        boolean zLIZ;
        C1C7U.LIZ("TaskManagerV2@3e9c.onDateSwitch$1");
        try {
            LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TaskManagerV2@3e9c.onDateSwitch$1");
    }

    public static final void run$3(ARunnableS94S0000000_17 aRunnableS94S0000000_17) {
        C1EOY c1eoy = C1EOY.LIZ;
        C1C7U.LIZ("CommentWidget@f00c.<field>$1$onDismiss$1L");
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("panel_comment_close");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
        C1C7U.LIZIZ("CommentWidget@f00c.<field>$1$onDismiss$1L");
    }

    public static final void run$4(ARunnableS94S0000000_17 aRunnableS94S0000000_17) {
        boolean zLIZ;
        C1C7U.LIZ("TaskWatchLiveDurationTracker@186.createDurationUpdateRunnable$1");
        try {
            aRunnableS94S0000000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TaskWatchLiveDurationTracker@186.createDurationUpdateRunnable$1");
    }

    public static final void run$5(ARunnableS94S0000000_17 aRunnableS94S0000000_17) {
        boolean zLIZ;
        C1C7U.LIZ("OverloadScoreRetriever@35f6.frequencyRunnable$1");
        try {
            aRunnableS94S0000000_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OverloadScoreRetriever@35f6.frequencyRunnable$1");
    }

    public ARunnableS94S0000000_17(long j, int i) {
        this.$t = i;
    }
}
