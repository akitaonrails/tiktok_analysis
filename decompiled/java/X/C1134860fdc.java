package X;

import com.bytedance.android.livesdk.guide.model.RewardProcess;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveCoinCashRechargeAnimTimeSettings;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS31S0001000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: renamed from: X.0fdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134860fdc {
    public static final C1134860fdc LIZ = new C1134860fdc();
    public static final C11NJ LIZIZ = new C11NJ();
    public static GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 LIZJ;

    public static final boolean LJIIJJI() {
        try {
            LiveCoinCashRechargeAnimTimeSettings liveCoinCashRechargeAnimTimeSettings = LiveCoinCashRechargeAnimTimeSettings.INSTANCE;
            long resetTimeMills = liveCoinCashRechargeAnimTimeSettings.getResetTimeMills();
            long exitTimeMills = liveCoinCashRechargeAnimTimeSettings.getExitTimeMills() + ((long) 3600000);
            TaskManagerV2.LIZ.getClass();
            Iterator<C1134410fct> it2 = TaskManagerV2.LIZIZ.iterator();
            Object obj = null;
            while (it2.hasNext()) {
                Object obj2 = it2.next().LIZ;
                if (((TaskInfo) obj2).taskType == 40240 || ((TaskInfo) obj2).taskType == 40241) {
                    obj = obj2;
                }
            }
            TaskInfo taskInfo = (TaskInfo) obj;
            if (taskInfo != null) {
                C20337914i1<String> c20337914i1 = C0U53.ce;
                String strLIZIZ = c20337914i1.LIZIZ();
                if (strLIZIZ == null || strLIZIZ.length() == 0) {
                    c20337914i1.LJFF(taskInfo.taskId);
                } else if (!Intrinsics.LJFF(strLIZIZ, taskInfo.taskId)) {
                    c20337914i1.LJFF(taskInfo.taskId);
                    C0U53.be.LJFF(0L);
                    C0U53.ae.LJFF(0L);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C20337914i1<Long> c20337914i12 = C0U53.be;
                Long lLIZIZ = c20337914i12.LIZIZ();
                if (lLIZIZ != null && lLIZIZ.longValue() == 0) {
                    c20337914i12.LJFF(Long.valueOf(jCurrentTimeMillis));
                }
                C20337914i1<Long> c20337914i13 = C0U53.ae;
                Long lLIZIZ2 = c20337914i13.LIZIZ();
                if (jCurrentTimeMillis - c20337914i12.LIZIZ().longValue() < exitTimeMills && jCurrentTimeMillis - lLIZIZ2.longValue() > resetTimeMills) {
                    c20337914i13.LJFF(Long.valueOf(jCurrentTimeMillis));
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJIIIZ("RechargeTaskManager", " showCashRechargePanelAnimation check error ");
        }
        return false;
    }

    static {
        C784440Upu.LIZ().LJ(C1124340fMe.class).LJJLJLI(new C09JN() { // from class: X.0fcV
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RechargeTaskManager@c4b3.<init>$1");
                if (((C1124340fMe) obj).LIZ) {
                    C1134860fdc.LIZ.LJIIIZ();
                }
                C1C7U.LIZIZ("RechargeTaskManager@c4b3.<init>$1");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LJI() {
        TaskInfo taskInfo;
        List<RewardProcess> list;
        RewardProcess rewardProcess;
        C1134410fct c1134410fctLJ = TaskManagerV2.LIZ.LJ();
        if (c1134410fctLJ == null || (taskInfo = (TaskInfo) c1134410fctLJ.LIZ) == null || (list = taskInfo.rewardList) == null || (rewardProcess = (RewardProcess) C13LP.LJJJLL(list)) == null) {
            return 0;
        }
        return (int) rewardProcess.rewardId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r2 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (((com.bytedance.android.livesdk.guide.model.TaskInfo) r2).taskType != 40241) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r3 = X.C1133760fbq.LIZ().iterator();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIIZZ() {
        /*
            java.util.ArrayList r0 = X.C1133760fbq.LIZ()
            java.util.Iterator r3 = r0.iterator()
        L8:
            boolean r0 = r3.hasNext()
            r4 = 1
            if (r0 == 0) goto L1f
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.guide.model.TaskInfo r0 = (com.bytedance.android.livesdk.guide.model.TaskInfo) r0
            int r1 = r0.taskType
            r0 = 40240(0x9d30, float:5.6388E-41)
            if (r1 != r0) goto L8
            if (r2 != 0) goto L3d
        L1f:
            java.util.ArrayList r0 = X.C1133760fbq.LIZ()
            java.util.Iterator r3 = r0.iterator()
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.guide.model.TaskInfo r0 = (com.bytedance.android.livesdk.guide.model.TaskInfo) r0
            int r1 = r0.taskType
            r0 = 40241(0x9d31, float:5.639E-41)
            if (r1 != r0) goto L27
            if (r2 == 0) goto L3e
        L3d:
            return r4
        L3e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134860fdc.LJIIIIZZ():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LIZ() {
        TaskInfo taskInfo;
        if (LJIIIIZZ()) {
            Iterator it2 = C1133760fbq.LIZ().iterator();
            while (it2.hasNext()) {
                int i = ((TaskInfo) it2.next()).taskType;
                if (i == 40240 || i == 40241) {
                    return i;
                }
            }
            return 0;
        }
        if (C1124760fNK.LIZ()) {
            return 107;
        }
        C1134410fct c1134410fctLJ = TaskManagerV2.LIZ.LJ();
        if (c1134410fctLJ == null || (taskInfo = (TaskInfo) c1134410fctLJ.LIZ) == null) {
            return 0;
        }
        return taskInfo.taskType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC1134460fcy LJII() {
        EnumC1134460fcy enumC1134460fcyLIZJ;
        if (!LJIIIIZZ()) {
            C1134410fct c1134410fctLJ = TaskManagerV2.LIZ.LJ();
            if (c1134410fctLJ != null) {
                enumC1134460fcyLIZJ = c1134410fctLJ.LIZJ();
            }
            return EnumC1134460fcy.TASK_UNKNOWN;
        }
        TaskManagerV2.LIZ.getClass();
        for (C1134410fct c1134410fct : TaskManagerV2.LIZIZ) {
            int i = ((TaskInfo) c1134410fct.LIZ).taskType;
            if (i == 40240 || i == 40241) {
                enumC1134460fcyLIZJ = c1134410fct.LIZJ();
                break;
            }
        }
        enumC1134460fcyLIZJ = EnumC1134460fcy.TASK_UNKNOWN;
        if (enumC1134460fcyLIZJ != null) {
            return enumC1134460fcyLIZJ;
        }
        return EnumC1134460fcy.TASK_UNKNOWN;
    }

    public final void LJIIIZ() {
        if (LJIIIIZZ()) {
            return;
        }
        C1143980fsK.LIZ.getClass();
        String str = C1143980fsK.LIZIZ;
        if (str != null && str.length() > 0 && 1 != 0) {
            SparkContext.Companion.getClass();
            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
            if (interfaceC1059280dfiLIZ != null) {
                interfaceC1059280dfiLIZ.close();
            }
            C1143980fsK.LIZIZ = null;
        }
        int iLIZ = LIZ();
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        C1133940fc8.LJIILLIIL(3, new AwS31S0001000_17(iLIZ, 0));
    }

    public final int LIZIZ(int i, int i2) {
        if (i2 <= 0) {
            if (i2 == 0 && i == 0) {
                return LIZ();
            }
            return 0;
        }
        return i2;
    }

    public final int LIZJ(int i, int i2) {
        if (i2 <= 0) {
            if (i2 == 0 && i == 2) {
                return LIZ();
            }
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r7, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.wallet.Diamond> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1134870fdd
            if (r0 == 0) goto L5e
            r5 = r8
            X.0fdd r5 = (X.C1134870fdd) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r3 = r5.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L4e
            if (r0 != r1) goto L93
            int r7 = r5.LL
            X.C155000ia.LIZIZ(r3)
        L25:
            X.0x4E r3 = (X.C1804840x4E) r3
            if (r3 == 0) goto L92
            r0 = 0
            java.util.List r0 = r3.LJIIJJI(r4, r0)
            if (r0 == 0) goto L92
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.wallet.Diamond r0 = (com.bytedance.android.livesdk.wallet.Diamond) r0
            int r0 = r0.count
            if (r0 < r7) goto L39
            r3.add(r1)
            goto L39
        L4e:
            X.C155000ia.LIZIZ(r3)
            X.0x1W r0 = X.EnumC1803160x1W.USE
            r5.LL = r7
            r5.LLILZ = r1
            java.lang.Object r3 = X.C1151360g4E.LJI(r0, r4, r4, r5)
            if (r3 != r2) goto L25
            return r2
        L5e:
            X.0fdd r5 = new X.0fdd
            r5.<init>(r6, r8)
            goto L12
        L64:
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r4 = r3.next()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            r0 = r4
            com.bytedance.android.livesdk.wallet.Diamond r0 = (com.bytedance.android.livesdk.wallet.Diamond) r0
            int r2 = r0.count
            int r2 = r2 - r7
        L7e:
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.bytedance.android.livesdk.wallet.Diamond r0 = (com.bytedance.android.livesdk.wallet.Diamond) r0
            int r0 = r0.count
            int r0 = r0 - r7
            if (r2 <= r0) goto L8c
            r4 = r1
            r2 = r0
        L8c:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L7e
        L92:
            return r4
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134860fdc.LIZLLL(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r9, X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134860fdc.LJ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(int r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1134890fdf
            if (r0 == 0) goto L72
            r5 = r9
            X.0fdf r5 = (X.C1134890fdf) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r6 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L5a
            if (r0 != r6) goto L78
            X.C155000ia.LIZIZ(r1)
        L26:
            X.C1144230fsj.LJ(r2)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveRevenueStrategyRechargePreloadSetting r1 = com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveRevenueStrategyRechargePreloadSetting.INSTANCE
            boolean r0 = r1.isGiftTriggerPreloadGroup()
            if (r0 == 0) goto L3f
            if (r8 != r3) goto L3f
            X.C1144230fsj.LJ(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3f:
            boolean r0 = r1.isGroupV2()
            if (r0 == 0) goto L49
            X.C1144230fsj.LJ(r2)
            goto L29
        L49:
            boolean r0 = r1.isGroupV3()
            if (r0 == 0) goto L61
            r5.LLILLL = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r4) goto L5d
            return r4
        L5a:
            X.C155000ia.LIZIZ(r1)
        L5d:
            X.C1144230fsj.LJ(r2)
            goto L29
        L61:
            boolean r0 = r1.isGroupV4()
            if (r0 == 0) goto L29
            r5.LLILLL = r6
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r4) goto L26
            return r4
        L72:
            X.0fdf r5 = new X.0fdf
            r5.<init>(r7, r9)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134860fdc.LJIIJ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T LJFF(java.lang.String r3, final android.view.ViewGroup r4, final androidx.lifecycle.ViewModelStoreOwner r5) {
        /*
            java.lang.String r0 = "REVENUE_RECHARGE_BANNER"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            r2 = 0
            if (r0 == 0) goto Lf
            X.0x64 r1 = new X.0x64
            r1.<init>(r4, r5)
            goto L2c
        Lf:
            java.lang.String r0 = "FROZEN_COINS"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L2b
            X.0fc8 r1 = X.C1133940fc8.LIZIZ
            boolean r0 = r1.LIZIZ()
            if (r0 == 0) goto L2b
            boolean r0 = r1.LIZJ()
            if (r0 == 0) goto L2b
            X.0x6F r1 = new X.0x6F
            r1.<init>(r4, r5)
            goto L2c
        L2b:
            r1 = r2
        L2c:
            boolean r0 = r1 instanceof java.lang.Object     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L31
            r1 = r2
        L31:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L35
            goto L41
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L41:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L48
            return r1
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134860fdc.LJFF(java.lang.String, android.view.ViewGroup, androidx.lifecycle.ViewModelStoreOwner):java.lang.Object");
    }
}
