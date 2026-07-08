package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.aweme.im.common.setting.StreakMilestoneUnlockAnimationElement;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.06Pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1603306Pn {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1603706Pr());
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final ConcurrentHashMap<String, C1603806Ps> LIZLLL = new ConcurrentHashMap<>();

    public static List LJ(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            StreakLevelData streakLevelData = (StreakLevelData) it2.next();
            StreakLevelResConfig streakLevelResConfig = streakLevelData.normalResource;
            if (streakLevelResConfig != null) {
                LJFF(linkedHashMap, streakLevelResConfig);
            }
            StreakLevelResConfig streakLevelResConfig2 = streakLevelData.darkResource;
            if (streakLevelResConfig2 != null) {
                LJFF(linkedHashMap, streakLevelResConfig2);
            }
        }
        C1603606Pq.LIZ.getClass();
        for (StreakMilestoneUnlockAnimationElement streakMilestoneUnlockAnimationElement : C1603606Pq.LIZ().elementList) {
            String str = streakMilestoneUnlockAnimationElement.channel;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(streakMilestoneUnlockAnimationElement.path);
            sbLIZ.append("/config.json");
            linkedHashMap.put(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        return C2097808Js.LJIL(linkedHashMap);
    }

    public final String LIZLLL(StreakResData streakResData) {
        String str = streakResData.channel;
        String str2 = streakResData.bundle;
        ConcurrentHashMap<String, C1603806Ps> concurrentHashMap = this.LIZLLL;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        C1603806Ps c1603806Ps = concurrentHashMap.get(str);
        if (c1603806Ps == null) {
            C1590906Kt.LIZ("StreakMilestoneGeckoResHelper, getBundlePath, resStatus == null, return null");
            return null;
        }
        boolean z = true;
        if (c1603806Ps.LIZJ != 1) {
            C1590906Kt.LIZ("StreakMilestoneGeckoResHelper, getBundlePath, res fetch fail, return null");
            return null;
        }
        String strLJJJLL = c1603806Ps.LIZIZ;
        if (strLJJJLL == null) {
            strLJJJLL = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String str4 = File.separator;
        if (u.LJIIZILJ(strLJJJLL, str4, false) && u.LJJIIJZLJL(str2, str4, false)) {
            strLJJJLL = a0.LJJJLL(str4, strLJJJLL);
        }
        if (u.LJIIZILJ(strLJJJLL, str4, false) || u.LJJIIJZLJL(str2, str4, false)) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJJLL);
        if (z) {
            str3 = str4;
        }
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJI(List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            C1603806Ps c1603806Ps = this.LIZLLL.get(it2.next());
            if (c1603806Ps == null || c1603806Ps.LIZJ != 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[PHI: r1
      0x0011: PHI (r1v16 java.lang.String) = (r1v0 java.lang.String), (r1v17 java.lang.String) binds: [B:7:0x000b, B:9:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[PHI: r1
      0x0020: PHI (r1v14 java.lang.String) = (r1v2 java.lang.String), (r1v15 java.lang.String) binds: [B:16:0x001e, B:14:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0024 A[PHI: r1
      0x0024: PHI (r1v13 java.lang.String) = (r1v2 java.lang.String), (r1v14 java.lang.String) binds: [B:16:0x001e, B:18:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033 A[PHI: r1
      0x0033: PHI (r1v11 java.lang.String) = (r1v4 java.lang.String), (r1v12 java.lang.String) binds: [B:25:0x0031, B:23:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037 A[PHI: r1
      0x0037: PHI (r1v10 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:25:0x0031, B:27:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046 A[PHI: r1
      0x0046: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:34:0x0044, B:32:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[PHI: r1
      0x000d: PHI (r1v17 java.lang.String) = (r1v0 java.lang.String), (r1v18 java.lang.String) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.util.Map<java.lang.String, java.lang.String> r3, com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig r4) {
        /*
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData r0 = r4.streakIconActive
            java.lang.String r2 = ""
            if (r0 == 0) goto La
            java.lang.String r1 = r0.channel
            if (r1 != 0) goto Ld
        La:
            r1 = r2
            if (r0 == 0) goto L11
        Ld:
            java.lang.String r0 = r0.bundle
            if (r0 != 0) goto L12
        L11:
            r0 = r2
        L12:
            r3.put(r1, r0)
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData r0 = r4.streakIconGrey
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.channel
            if (r1 != 0) goto L20
        L1d:
            r1 = r2
            if (r0 == 0) goto L24
        L20:
            java.lang.String r0 = r0.bundle
            if (r0 != 0) goto L25
        L24:
            r0 = r2
        L25:
            r3.put(r1, r0)
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData r0 = r4.streakFireLottieUnlock
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.channel
            if (r1 != 0) goto L33
        L30:
            r1 = r2
            if (r0 == 0) goto L37
        L33:
            java.lang.String r0 = r0.bundle
            if (r0 != 0) goto L38
        L37:
            r0 = r2
        L38:
            r3.put(r1, r0)
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData r0 = r4.streakFireLottieContinue
            if (r0 == 0) goto L43
            java.lang.String r1 = r0.channel
            if (r1 != 0) goto L46
        L43:
            r1 = r2
            if (r0 == 0) goto L4b
        L46:
            java.lang.String r0 = r0.bundle
            if (r0 == 0) goto L4b
            r2 = r0
        L4b:
            r3.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603306Pn.LJFF(java.util.Map, com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig):void");
    }

    public final void LIZ(List<Pair<String, String>> list, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1603406Po(list, z, this, System.currentTimeMillis(), null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r6 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r6 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603306Pn.LIZIZ(com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf, boolean):void");
    }

    public final C1533910q1F LIZJ(String str, String str2, String str3, Function1<? super C1533790q13, Unit> function1) {
        Forest forest = (Forest) this.LIZ.getValue();
        if (forest == null) {
            return null;
        }
        if (str3 == null) {
            str3 = "";
        }
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.disableBuiltin = true;
        requestParams.resourceScene = EnumC1533980q1M.OTHER;
        requestParams.enableRequestReuse = true;
        requestParams.enableCDNCache = Boolean.TRUE;
        requestParams.channel = str;
        requestParams.bundle = str2;
        return forest.fetchResourceAsync(str3, requestParams, new AwS581S0100000_2((Function1) function1, (Function1<Object, String>) 640));
    }
}
