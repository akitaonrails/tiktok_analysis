package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.setting.StreakMilestoneUnlockAnimationConfig;
import com.ss.android.ugc.aweme.im.common.setting.StreakMilestoneUnlockAnimationElement;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS0S7911100_2;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1603206Pm implements C06GZ {
    public volatile StreakMilestoneConf LIZIZ;
    public final C1603306Pn LIZ = new C1603306Pn();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    @Override // X.C06GZ
    public final String LJII() {
        return "milestone";
    }

    @Override // X.C06GZ
    public final StreakResDebugInfo LIZ() {
        List<StreakLevelData> levelDataList;
        StreakLevelData streakLevelData;
        StreakLevelResConfig streakLevelResConfig;
        Boolean boolValueOf;
        ConcurrentHashMap<String, C1603806Ps> concurrentHashMap = this.LIZ.LIZLLL;
        ArrayList<String> arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry<String, C1603806Ps> entry : concurrentHashMap.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(entry.getValue().LIZ);
            sbLIZ.append(": ");
            int i = entry.getValue().LIZJ;
            sbLIZ.append(i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "LOADING" : "FAIL" : "SUCCESS");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            sb.append("  ");
            sb.append(str);
        }
        String string = sb.toString();
        List<String> listLJIIIZ = LJIIIZ();
        boolean zBooleanValue = false;
        boolean zLJI = listLJIIIZ != null ? this.LIZ.LJI(listLJIIIZ) : false;
        StreakMilestoneConf streakMilestoneConf = this.LIZIZ;
        if (streakMilestoneConf != null && (levelDataList = streakMilestoneConf.getLevelDataList()) != null && (streakLevelData = (StreakLevelData) C13LP.LJJJLL(levelDataList)) != null && (streakLevelResConfig = streakLevelData.darkResource) != null && (boolValueOf = Boolean.valueOf(streakLevelResConfig.isAnimationUnlockKeepLastFrame)) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        }
        return new StreakResDebugInfo("Milestone", string, zLJI, zBooleanValue);
    }

    @Override // X.C06GZ
    public final void LIZIZ() {
        boolean z = C1590906Kt.LIZ;
        LJIIIIZZ();
        this.LIZ.LIZIZ(this.LIZIZ, false);
    }

    public final void LJIIIIZZ() {
        if (this.LIZJ.compareAndSet(false, true)) {
            StreakMilestoneConf streakMilestoneConfLIZIZ = C1664306fR.LIZ.LIZIZ();
            if (streakMilestoneConfLIZIZ == null) {
                C1590906Kt.LIZ("StreakMilestoneResProvider, checkResStatus, streak milestone config is null");
                return;
            }
            C1590906Kt.LIZ("StreakMilestoneResProvider, checkResStatus, found valid streak milestone config");
            synchronized (this) {
                try {
                    this.LIZIZ = streakMilestoneConfLIZIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1603306Pn c1603306Pn = this.LIZ;
            if (c1603306Pn.LIZIZ.compareAndSet(false, true)) {
                C1590906Kt.LIZ("StreakMilestoneGeckoResHelper, fetchResFromLocal");
                List<StreakLevelData> levelDataList = streakMilestoneConfLIZIZ.getLevelDataList();
                if (levelDataList != null) {
                    List listLJJJJLI = C13LP.LJJJJLI(levelDataList);
                    if ((!((ArrayList) listLJJJJLI).isEmpty()) && listLJJJJLI != null) {
                        c1603306Pn.LIZ(C1603306Pn.LJ(listLJJJJLI), true);
                        return;
                    }
                }
                C1590906Kt.LIZIZ("StreakMilestoneGeckoResHelper, checkResStatus, skip, levelDataList is null");
            }
        }
    }

    public final List<String> LJIIIZ() {
        StreakResData streakResData;
        String str;
        StreakResData streakResData2;
        String str2;
        StreakResData streakResData3;
        String str3;
        StreakResData streakResData4;
        String str4;
        StreakMilestoneConf streakMilestoneConf = this.LIZIZ;
        if (streakMilestoneConf == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<StreakLevelData> levelDataList = streakMilestoneConf.getLevelDataList();
        if (levelDataList != null) {
            for (StreakLevelData streakLevelData : levelDataList) {
                if (streakLevelData != null) {
                    StreakLevelResConfig streakLevelResConfig = streakLevelData.normalResource;
                    if (streakLevelResConfig != null && (streakResData4 = streakLevelResConfig.streakIconActive) != null && (str4 = streakResData4.channel) != null) {
                        linkedHashSet.add(str4);
                    }
                    StreakLevelResConfig streakLevelResConfig2 = streakLevelData.normalResource;
                    if (streakLevelResConfig2 != null && (streakResData3 = streakLevelResConfig2.streakIconGrey) != null && (str3 = streakResData3.channel) != null) {
                        linkedHashSet.add(str3);
                    }
                    StreakLevelResConfig streakLevelResConfig3 = streakLevelData.darkResource;
                    if (streakLevelResConfig3 != null && (streakResData2 = streakLevelResConfig3.streakIconActive) != null && (str2 = streakResData2.channel) != null) {
                        linkedHashSet.add(str2);
                    }
                    StreakLevelResConfig streakLevelResConfig4 = streakLevelData.darkResource;
                    if (streakLevelResConfig4 != null && (streakResData = streakLevelResConfig4.streakIconGrey) != null && (str = streakResData.channel) != null) {
                        linkedHashSet.add(str);
                    }
                }
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    @Override // X.C06GZ
    public final void LJIIJ() {
        C1590906Kt.LIZ("StreakMilestoneResProvider, onLogin");
        LJIIIIZZ();
    }

    @Override // X.C06GZ
    public final void onColdStartFinish() {
        C1590906Kt.LIZ("StreakMilestoneResProvider, onColdStartFinish");
        LJIIIIZZ();
        this.LIZ.LIZIZ(this.LIZIZ, false);
        this.LIZ.LIZIZ(this.LIZIZ, true);
    }

    @Override // X.C06GZ
    public final int isAvailable() {
        List<String> listLJIIIZ = LJIIIZ();
        if (listLJIIIZ == null) {
            return 2;
        }
        return this.LIZ.LJI(listLJIIIZ) ? 0 : 5;
    }

    public final StreakLevelResConfig LJIIJJI(int i) {
        Context contextLIZ;
        List<StreakLevelData> levelDataList;
        StreakLevelData next;
        Integer num;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (contextLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            C0I0B.LJFF.LIZJ();
            contextLIZ = C894660Z7w.LIZ();
        }
        boolean zLIZIZ = C960203pA.LIZIZ(contextLIZ);
        StreakMilestoneConf streakMilestoneConf = this.LIZIZ;
        if (streakMilestoneConf == null || (levelDataList = streakMilestoneConf.getLevelDataList()) == null) {
            return null;
        }
        Iterator<StreakLevelData> it2 = levelDataList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                StreakLevelData streakLevelData = next;
                if (streakLevelData != null && (num = streakLevelData.level) != null && num.intValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        StreakLevelData streakLevelData2 = next;
        if (streakLevelData2 == null) {
            return null;
        }
        if (zLIZIZ) {
            return streakLevelData2.darkResource;
        }
        return streakLevelData2.normalResource;
    }

    @Override // X.C06GZ
    public final Pair<Integer, String> LIZLLL(int i, boolean z) {
        StreakResData streakResData;
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        StreakLevelResConfig streakLevelResConfigLJIIJJI = LJIIJJI(i);
        if (streakLevelResConfigLJIIJJI == null) {
            return new Pair<>(4, null);
        }
        if (z) {
            streakResData = streakLevelResConfigLJIIJJI.streakFireLottieContinue;
            if (streakResData == null) {
                return new Pair<>(3, null);
            }
        } else {
            streakResData = streakLevelResConfigLJIIJJI.streakFireLottieUnlock;
            if (streakResData == null) {
                return new Pair<>(3, null);
            }
        }
        IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
        if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
            interfaceC1664506fTLIZJ.LIZ("streak_milestone_preload", "streak_milestone_preload");
        }
        String strLIZLLL = this.LIZ.LIZLLL(streakResData);
        if (strLIZLLL != null && strLIZLLL.length() > 0) {
            return new Pair<>(0, strLIZLLL);
        }
        return new Pair<>(1, null);
    }

    @Override // X.C06GZ
    public final Pair<Integer, Uri> LJ(int i, EnumC1578706Gb enumC1578706Gb) {
        StreakResData streakResData;
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        StreakLevelResConfig streakLevelResConfigLJIIJJI = LJIIJJI(i);
        if (streakLevelResConfigLJIIJJI == null) {
            return new Pair<>(4, null);
        }
        int i2 = C1579006Ge.LIZ[enumC1578706Gb.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                streakResData = streakLevelResConfigLJIIJJI.streakIconGrey;
            }
            return new Pair<>(3, null);
        }
        streakResData = streakLevelResConfigLJIIJJI.streakIconActive;
        if (streakResData != null) {
            IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
            if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
                interfaceC1664506fTLIZJ.LIZ("streak_milestone_preload", "streak_milestone_preload");
            }
            String strLIZLLL = this.LIZ.LIZLLL(streakResData);
            if (strLIZLLL != null && strLIZLLL.length() > 0) {
                return new Pair<>(0, Uri.fromFile(new C0VSJ(strLIZLLL)));
            }
            return new Pair<>(1, null);
        }
        return new Pair<>(3, null);
    }

    @Override // X.C06GZ
    public final Object LJFF(int i, C1578806Gc c1578806Gc) {
        StreakMilestoneUnlockAnimationElement next;
        C1533910q1F c1533910q1FLIZJ;
        C1603606Pq.LIZ.getClass();
        StreakMilestoneUnlockAnimationConfig streakMilestoneUnlockAnimationConfigLIZ = C1603606Pq.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1578806Gc));
        c2252611DEt.LJIJJ();
        Iterator<StreakMilestoneUnlockAnimationElement> it2 = streakMilestoneUnlockAnimationConfigLIZ.elementList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.levelArray.contains(C2286608xc.LJ(i))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        StreakMilestoneUnlockAnimationElement streakMilestoneUnlockAnimationElement = next;
        if (streakMilestoneUnlockAnimationElement == null) {
            C1590906Kt.LIZIZ("unlockAnimResInfoV2 FAIL_LEVEL_NOT_FOUND");
            Pair pair = new Pair(C2286608xc.LJ(4), null);
            C189200o6.m2constructorimpl(pair);
            c2252611DEt.resumeWith(pair);
        } else {
            String str = streakMilestoneUnlockAnimationElement.channel;
            String str2 = streakMilestoneUnlockAnimationElement.path;
            Map<String, String> map = streakMilestoneUnlockAnimationElement.numData;
            if (!Intrinsics.LJFF(str, "") && !Intrinsics.LJFF(str2, "")) {
                boolean z = !map.isEmpty();
                String str3 = map.get(String.valueOf(i));
                if (z && str3 == null) {
                    C1590906Kt.LIZIZ("unlockAnimResInfoV2 FAIL_NO_MATCHED_NUM_DATA");
                    Pair pair2 = new Pair(C2286608xc.LJ(7), null);
                    C189200o6.m2constructorimpl(pair2);
                    c2252611DEt.resumeWith(pair2);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    String str4 = File.separator;
                    sbLIZ.append(str4);
                    sbLIZ.append("config.json");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(str4);
                    sbLIZ2.append("output.mp4");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    sbLIZ3.append(str4);
                    sbLIZ3.append(str3);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    String str5 = streakMilestoneUnlockAnimationConfigLIZ.cdnPrefix;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str5);
                    sbLIZ4.append(str4);
                    sbLIZ4.append(str);
                    sbLIZ4.append(str4);
                    sbLIZ4.append(strLIZIZ);
                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str5);
                    sbLIZ5.append(str4);
                    sbLIZ5.append(str);
                    sbLIZ5.append(str4);
                    sbLIZ5.append(strLIZIZ2);
                    String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(str5);
                    sbLIZ6.append(str4);
                    sbLIZ6.append(str);
                    sbLIZ6.append(str4);
                    sbLIZ6.append(strLIZIZ3);
                    String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ6);
                    Object obj = new Object();
                    C259800zU c259800zU = new C259800zU();
                    C259800zU c259800zU2 = new C259800zU();
                    C259800zU c259800zU3 = new C259800zU();
                    C259800zU c259800zU4 = new C259800zU();
                    C259800zU c259800zU5 = new C259800zU();
                    C259800zU c259800zU6 = new C259800zU();
                    C118300cf c118300cf = new C118300cf();
                    C1533910q1F c1533910q1FLIZJ2 = this.LIZ.LIZJ(str, strLIZIZ, strLIZIZ4, new AwS0S7911100_2(obj, c259800zU4, c259800zU, c118300cf, z, c259800zU2, c259800zU3, c2252611DEt, i, c259800zU5, c259800zU6, this, jCurrentTimeMillis, str, strLIZIZ, strLIZIZ2, strLIZIZ3, strLIZIZ4, strLIZIZ5, strLIZIZ6, 0));
                    C1533910q1F c1533910q1FLIZJ3 = this.LIZ.LIZJ(str, strLIZIZ2, strLIZIZ5, new AwS0S7911100_2(obj, c259800zU5, c259800zU2, c118300cf, z, c259800zU, c259800zU3, c2252611DEt, i, c259800zU4, c259800zU6, this, jCurrentTimeMillis, str, strLIZIZ, strLIZIZ2, strLIZIZ3, strLIZIZ4, strLIZIZ5, strLIZIZ6, 1));
                    if (z) {
                        c1533910q1FLIZJ = this.LIZ.LIZJ(str, strLIZIZ3, strLIZIZ6, new AwS0S7911100_2(obj, c259800zU6, c259800zU3, c118300cf, z, c259800zU, c259800zU2, c2252611DEt, i, c259800zU4, c259800zU5, this, jCurrentTimeMillis, str, strLIZIZ, strLIZIZ2, strLIZIZ3, strLIZIZ4, strLIZIZ5, strLIZIZ6, 2));
                    } else {
                        c1533910q1FLIZJ = null;
                    }
                    AwS211S0300000_2 awS211S0300000_2 = new AwS211S0300000_2(c1533910q1FLIZJ2, c1533910q1FLIZJ3, c1533910q1FLIZJ, 28);
                    c2252611DEt = c2252611DEt;
                    c2252611DEt.LJJII(awS211S0300000_2);
                }
            } else {
                C1590906Kt.LIZIZ("unlockAnimResInfoV2 FAIL_INTERNAL_ERROR");
                Pair pair3 = new Pair(C2286608xc.LJ(3), null);
                C189200o6.m2constructorimpl(pair3);
                c2252611DEt.resumeWith(pair3);
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1578806Gc);
        }
        return objLJIJ;
    }

    @Override // X.C06GZ
    public final Pair<Integer, Drawable> LJI(int i, EnumC1578706Gb enumC1578706Gb) {
        Object c098200Yq;
        Integer num;
        Context contextLIZ;
        if (C1603906Pt.LIZIZ().enableTuxSmallIcon) {
            int iIndexOf = C1603906Pt.LIZIZ().tuxSmallIconLevelList.indexOf(Integer.valueOf(i));
            int i2 = C1579006Ge.LIZ[enumC1578706Gb.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    num = C052900Hf.LIZIZ.get(Integer.valueOf(iIndexOf));
                }
            } else {
                num = C052900Hf.LIZ.get(Integer.valueOf(iIndexOf));
            }
            if (num != null) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) == null) {
                    C0I0B.LJFF.LIZJ();
                    contextLIZ = C894660Z7w.LIZ();
                }
                return new Pair<>(0, new TuxIconDrawable(contextLIZ, num.intValue()));
            }
        }
        Pair<Integer, Uri> pairLJ = LJ(i, enumC1578706Gb);
        if (pairLJ.getFirst().intValue() != 0) {
            return new Pair<>(pairLJ.getFirst(), null);
        }
        Uri second = pairLJ.getSecond();
        if (second == null) {
            return new Pair<>(3, null);
        }
        try {
            c098200Yq = Drawable.createFromStream(C09NT.LJ(C894660Z7w.LIZ().getContentResolver(), second), null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
            return new Pair<>(0, c098200Yq);
        }
        return new Pair<>(3, null);
    }

    @Override // X.C06GZ
    public final Pair<Integer, Integer> LIZJ(int i, EnumC1578706Gb enumC1578706Gb, Context context) {
        String str;
        Object c098200Yq;
        Integer numLIZJ;
        StreakLevelResConfig streakLevelResConfigLJIIJJI = LJIIJJI(i);
        if (streakLevelResConfigLJIIJJI == null) {
            return new Pair<>(4, 0);
        }
        int i2 = C1579006Ge.LIZ[enumC1578706Gb.ordinal()];
        Object obj = null;
        if (i2 != 1) {
            if (i2 != 2) {
                str = null;
            } else {
                if (((Boolean) C100900Zr.LIZ.getValue()).booleanValue() && context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context)) != null) {
                    return new Pair<>(0, Integer.valueOf(numLIZJ.intValue()));
                }
                str = streakLevelResConfigLJIIJJI.streakFontColorGrey;
            }
        } else {
            str = streakLevelResConfigLJIIJJI.streakFontColorActive;
        }
        if (str == null) {
            return new Pair<>(3, 0);
        }
        try {
            c098200Yq = new Pair(0, Integer.valueOf(Color.parseColor(str)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Pair<Integer, Integer> pair = (Pair) obj;
        if (pair == null) {
            return new Pair<>(3, 0);
        }
        return pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[PHI: r1 r13
      0x0066: PHI (r1v3 X.0q15) = (r1v1 X.0q15), (r1v1 X.0q15), (r1v2 X.0q15), (r1v2 X.0q15), (r1v20 X.0q15), (r1v20 X.0q15) binds: [B:43:0x0063, B:40:0x005d, B:30:0x0044, B:27:0x003e, B:17:0x0025, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r13v7 java.util.List<java.lang.String>) = 
      (r13v1 java.util.List<java.lang.String>)
      (r13v2 java.util.List<java.lang.String>)
      (r13v4 java.util.List<java.lang.String>)
      (r13v5 java.util.List<java.lang.String>)
      (r13v12 java.util.List<java.lang.String>)
      (r13v13 java.util.List<java.lang.String>)
     binds: [B:43:0x0063, B:40:0x005d, B:30:0x0044, B:27:0x003e, B:17:0x0025, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[PHI: r1 r2 r13
      0x006b: PHI (r1v4 X.0q15) = (r1v0 X.0q15), (r1v19 X.0q15) binds: [B:46:0x0068, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r2v10 X.0q0b) = (r2v6 X.0q0b), (r2v26 X.0q0b) binds: [B:46:0x0068, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x006b: PHI (r13v8 java.util.List<java.lang.String>) = (r13v0 java.util.List<java.lang.String>), (r13v11 java.util.List<java.lang.String>) binds: [B:46:0x0068, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(X.C259800zU r18, X.C259800zU r19, X.C259800zU r20, long r21, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603206Pm.LJIILIIL(X.00zU, X.00zU, X.00zU, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIL(boolean z, C118300cf c118300cf, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, InterfaceC20236714Gf interfaceC20236714Gf, int i, C259800zU c259800zU4, C259800zU c259800zU5, C259800zU c259800zU6, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (z) {
            if (c118300cf.element < 3) {
                return;
            }
        } else if (c118300cf.element < 2) {
            return;
        }
        CharSequence charSequence3 = (CharSequence) c259800zU.element;
        if (charSequence3 == null || charSequence3.length() == 0 || (charSequence = (CharSequence) c259800zU2.element) == null || charSequence.length() == 0 || (z && ((charSequence2 = (CharSequence) c259800zU3.element) == null || charSequence2.length() == 0))) {
            C1590906Kt.LIZIZ("unlockAnimResInfoV2 FAIL_RES_NOT_AVAILABLE");
            Pair pair = new Pair(1, null);
            C189200o6.m2constructorimpl(pair);
            interfaceC20236714Gf.resumeWith(pair);
            LJIILIIL(c259800zU4, c259800zU5, c259800zU6, j, str, str2, str3, str4, str5, str6, str7, false);
            return;
        }
        C1590906Kt.LIZ("unlockAnimResInfoV2 checkAndResponse success");
        LJIILIIL(c259800zU4, c259800zU5, c259800zU6, j, str, str2, str3, str4, str5, str6, str7, true);
        String str8 = (String) c259800zU.element;
        String str9 = (String) c259800zU2.element;
        String str10 = (String) c259800zU3.element;
        C1603606Pq.LIZ.getClass();
        Pair pair2 = new Pair(0, new C1602706Ph(i, true, true, str8, str9, str10, null, C1603606Pq.LIZ().fakeMilestoneLevelArray.contains(Integer.valueOf(i)), 264));
        C189200o6.m2constructorimpl(pair2);
        interfaceC20236714Gf.resumeWith(pair2);
    }
}
