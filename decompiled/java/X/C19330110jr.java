package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19330110jr {
    public static final C19330110jr LIZ = new C19330110jr();

    public static EnumC19330310jt LIZ(EnumC19330210js enumC19330210js) {
        switch (C19330510jv.LIZ[enumC19330210js.ordinal()]) {
            case 1:
                return EnumC19330310jt.DROP_BY_PERMISSION;
            case 2:
                return EnumC19330310jt.DROP_BY_EXPIRATION;
            case 3:
                return EnumC19330310jt.DROP_BY_DUPLICATION;
            case 4:
                return EnumC19330310jt.DROP_BY_FREQUENCY;
            case 5:
                return EnumC19330310jt.DROP_BY_NOTICE_READ;
            case 6:
                return EnumC19330310jt.DROP_BY_USERID_MISMATCH;
            case 7:
                return EnumC19330310jt.DROP_BY_LOCAL_CHECK;
            case 8:
                return EnumC19330310jt.DROP_BY_INNER_PUSH_OPT;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC19330310jt.DROP_BY_BUSINESS;
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (1 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        r3.getTracker().LJJJJLI = "drop_by_strategy_optimize";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C19331210k2.LIZLLL(), "notification_page") != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC19330210js LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r3) {
        /*
            boolean r0 = LJIIIIZZ(r3)
            if (r0 == 0) goto L9
            X.10js r0 = X.EnumC19330210js.BY_PERMISSION
            return r0
        L9:
            boolean r0 = LJ(r3)
            if (r0 == 0) goto L12
            X.10js r0 = X.EnumC19330210js.BY_DUPLICATION
            return r0
        L12:
            boolean r0 = LJI(r3)
            if (r0 == 0) goto L1b
            X.10js r0 = X.EnumC19330210js.BY_FREQUENCY
            return r0
        L1b:
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r0 = r3.getUiTemplate()
            if (r0 != 0) goto L2c
            X.15ts r1 = r3.getTracker()
            java.lang.String r0 = "drop_by_ui_template_null"
            r1.LJJJJLI = r0
            X.10js r0 = X.EnumC19330210js.BY_UITEMPLATENULL
            return r0
        L2c:
            X.10ju r1 = LJIIIZ(r3)
            X.10ju r0 = X.EnumC19330410ju.NONE
            if (r1 == r0) goto L37
            X.10js r0 = X.EnumC19330210js.BY_AVOIDANCE
            return r0
        L37:
            boolean r0 = LJFF(r3)
            if (r0 == 0) goto L40
            X.10js r0 = X.EnumC19330210js.BY_EXPIRATION
            return r0
        L40:
            int r0 = r3.getType()
            X.10jy r0 = X.C20641815pw.LIZ(r0)
            if (r0 == 0) goto L53
            boolean r0 = r0.LJFF(r3)
            if (r0 != 0) goto L53
        L50:
            X.10js r0 = X.EnumC19330210js.BY_BUSINESS
            return r0
        L53:
            boolean r0 = com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize.LIZIZ()
            if (r0 == 0) goto Lb0
            X.01GW r0 = com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize.LJI
            java.lang.Object r1 = r0.getValue()
            int[] r1 = (int[]) r1
            int r0 = r3.getType()
            boolean r0 = X.C13LQ.LJIILJJIL(r0, r1)
            java.lang.String r2 = "notification_page"
            if (r0 == 0) goto L98
            X.10k2 r0 = X.C19331210k2.LIZ
            r0.getClass()
            java.lang.String r1 = X.C19331210k2.LIZLLL()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 != 0) goto L8c
            java.lang.String r0 = "new_followers"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L8c
            java.lang.String r0 = "activity_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L98
        L8c:
            r0 = 1
            if (r0 == 0) goto Lb0
        L8f:
            X.15ts r1 = r3.getTracker()
            java.lang.String r0 = "drop_by_strategy_optimize"
            r1.LJJJJLI = r0
            goto L50
        L98:
            int r1 = r3.getType()
            r0 = 21
            if (r1 != r0) goto Lb0
            X.10k2 r0 = X.C19331210k2.LIZ
            r0.getClass()
            java.lang.String r0 = X.C19331210k2.LIZLLL()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto Lb0
            goto L8f
        Lb0:
            boolean r0 = LJII(r3)
            if (r0 == 0) goto Lb9
            X.10js r0 = X.EnumC19330210js.BY_NOTICE_READ
            return r0
        Lb9:
            boolean r0 = LIZLLL(r3)
            if (r0 == 0) goto Lc2
            X.10js r0 = X.EnumC19330210js.BY_USERID_MISMATCH
            return r0
        Lc2:
            X.10js r0 = X.EnumC19330210js.PASS
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19330110jr.LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):X.10js");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC19330210js LIZJ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r8) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19330110jr.LIZJ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):X.10js");
    }

    public static boolean LIZLLL(InnerPushMessage innerPushMessage) {
        if (C123100dR.LIZ(innerPushMessage.getTargetUserId()) && !Intrinsics.LJFF(innerPushMessage.getTargetUserId(), ((IAccountUserService) C19331310k3.LIZ.getValue()).getCurUserId())) {
            innerPushMessage.getTracker().LJJJJLI = "drop_by_userid_mismatch";
            return true;
        }
        return false;
    }

    public static boolean LJ(InnerPushMessage innerPushMessage) {
        List arrayList;
        List arrayList2;
        String string = C19329210ji.LJ().getString("record_for_displayed_id_list", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = C08JS.LJ(Object[].class, string);
        } else {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), String.valueOf(innerPushMessage.getId()))) {
                    return true;
                }
            }
        }
        String string2 = C19329210ji.LJ().getString("record_for_external_displayed_id_list", "");
        if (!TextUtils.isEmpty(string2)) {
            arrayList2 = C08JS.LJ(Object[].class, string2);
        } else {
            arrayList2 = new ArrayList();
        }
        boolean zContains = arrayList2.contains(String.valueOf(innerPushMessage.getId()));
        if (zContains) {
            innerPushMessage.getTracker().LJJJJLI = "drop_by_duplication";
        }
        return zContains;
    }

    public static boolean LJFF(InnerPushMessage innerPushMessage) {
        InnerPushConfig config = innerPushMessage.getConfig();
        if (config != null) {
            long j = config.ttlSeconds * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j > 0 && System.currentTimeMillis() > j + innerPushMessage.getCreateTime()) {
                innerPushMessage.getTracker().LJJJJLI = "drop_by_expiration";
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r5) {
        /*
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig r0 = r5.getConfig()
            r4 = 0
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy r0 = r0.freqControlStrategy
            if (r0 == 0) goto L48
            java.util.List<com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy> r1 = r0.popupLimitStrategies
        Ld:
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig r0 = r5.getConfig()
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushFreqControlStrategy r0 = r0.freqControlStrategy
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushBanStrategy r4 = r0.banStrategy
        L19:
            r3 = 1
            if (r1 == 0) goto L40
            java.util.Iterator r2 = r1.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy r1 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushPopupLimitStrategy) r1
            X.10jr r0 = X.C19330110jr.LIZ
            r0.getClass()
            boolean r0 = LJIIL(r1)
            if (r0 == 0) goto L20
        L37:
            X.15ts r1 = r5.getTracker()
            java.lang.String r0 = "drop_by_frequency"
            r1.LJJJJLI = r0
            return r3
        L40:
            boolean r0 = LJIIJJI(r4)
            if (r0 != 0) goto L37
            r3 = 0
            return r3
        L48:
            r1 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19330110jr.LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19330110jr.LJII(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r6) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19330110jr.LJIIIIZZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x020b, code lost:
    
        if (r1.LIZLLL(r13) != false) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC19330410ju LJIIIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r14) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19330110jr.LJIIIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):X.10ju");
    }

    public static boolean LJIIJJI(InnerPushBanStrategy innerPushBanStrategy) {
        List<Long> list;
        if (innerPushBanStrategy == null) {
            return false;
        }
        int i = innerPushBanStrategy.banByCancelTimes;
        long jCurrentTimeMillis = System.currentTimeMillis() - (innerPushBanStrategy.banSecondsByCancel * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        InnerPushBanStrategy innerPushBanStrategyLIZIZ = C19329210ji.LIZIZ(innerPushBanStrategy.id);
        if (innerPushBanStrategyLIZIZ != null) {
            list = innerPushBanStrategyLIZIZ.records;
        } else {
            list = null;
        }
        return LJIIJ(i, jCurrentTimeMillis, list);
    }

    public static boolean LJIIL(InnerPushPopupLimitStrategy innerPushPopupLimitStrategy) {
        List<Long> list;
        int i = innerPushPopupLimitStrategy.maxPopupTimes;
        long jCurrentTimeMillis = System.currentTimeMillis() - (innerPushPopupLimitStrategy.periodInSeconds * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        InnerPushPopupLimitStrategy innerPushPopupLimitStrategyLIZLLL = C19329210ji.LIZLLL(innerPushPopupLimitStrategy.id);
        if (innerPushPopupLimitStrategyLIZLLL != null) {
            list = innerPushPopupLimitStrategyLIZLLL.records;
        } else {
            list = null;
        }
        return LJIIJ(i, jCurrentTimeMillis, list);
    }

    public static boolean LJIIJ(int i, long j, List list) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        Iterator it2 = list.iterator();
        int iIndexOf = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            long jLongValue = ((Number) it2.next()).longValue();
            iIndexOf = list.indexOf(Long.valueOf(jLongValue)) + 1;
            if (jLongValue >= j) {
                iIndexOf--;
                break;
            }
        }
        if (i > list.size() - iIndexOf) {
            return false;
        }
        return true;
    }
}
