package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.setting.LiveTipsInFeedFreqControlSetting;
import com.bytedance.android.live.setting.TipsInFeedFreqConfig;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113410f51 extends C1113380f4y {
    public final TipsInFeedFreqConfig LJIIL;
    public WeakReference<C1111990f2j<? extends InterfaceC1112060f2q>> LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final C2091508Hh<Long, Map<String, Integer>> LJIJJ;
    public final HashMap<String, Integer> LJIJJLI;
    public String LJIL;
    public final C2091508Hh<Long, List<String>> LJJ;
    public final C2091508Hh<Long, Boolean> LJJI;
    public final C2091508Hh<Long, Boolean> LJJIFFI;

    public final void LJIIJ() {
        int iYy2 = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2();
        TipsInFeedFreqConfig tipsInFeedFreqConfig = this.LJIIL;
        int i = tipsInFeedFreqConfig.acuThreshold;
        this.LJIILJJIL = tipsInFeedFreqConfig.windowSize;
        this.LJIILLIIL = tipsInFeedFreqConfig.perTipIdWindowInterval;
        this.LJIILL = iYy2 > i ? tipsInFeedFreqConfig.highHeatQuota : tipsInFeedFreqConfig.lowHeatQuota;
    }

    public C1113410f51() {
        TipsInFeedFreqConfig tipsInFeedFreqConfig = LiveTipsInFeedFreqControlSetting.config;
        this.LJIIL = tipsInFeedFreqConfig;
        this.LJIILJJIL = 8;
        this.LJIILL = 1;
        this.LJIILLIIL = 16;
        this.LJIIZILJ = tipsInFeedFreqConfig.perTipIdSessionLimit;
        this.LJIJ = tipsInFeedFreqConfig.perTagIdSessionLimit;
        this.LJIJI = tipsInFeedFreqConfig.perTagIdWindowInterval;
        this.LJIJJ = new C2091508Hh<>(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LJIJJLI = new HashMap<>();
        this.LJIL = "";
        this.LJJ = new C2091508Hh<>(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LJJI = new C2091508Hh<>(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LJJIFFI = new C2091508Hh<>(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    public static List LJIIIZ(AbstractC1110800f0o abstractC1110800f0o) {
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
        if (publicAreaMessageCommonLLIIII != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && (list = creatorSuccessInfo.tags) != null) {
            ArrayList arrayList = new ArrayList();
            for (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem : list) {
                if (!C1113510f5B.LJIJJ.contains(Integer.valueOf(tagItem.tagType))) {
                    arrayList.add(tagItem);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.C1113380f4y, X.AbstractC1113400f50
    public final void LIZJ(AbstractC1110790f0n abstractC1110790f0n, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        topic.LIZ = true;
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        long jLLJJIII = abstractC1110790f0n.LLJJIII();
        long j = abstractC1110790f0n.LIZ;
        C1113480f58 c1113480f58 = new C1113480f58();
        c1113480f58.LIZ = topic.tagType;
        iPublicScreenService.ke0(jLLJJIII, j, c1113480f58);
    }

    public final void LJIIL(long j, String str) {
        if (j != 0) {
            int iIntValue = 0;
            if (str != null && str.length() != 0) {
                C2091508Hh<Long, Map<String, Integer>> c2091508Hh = this.LJIJJ;
                Long lValueOf = Long.valueOf(j);
                Map<String, Integer> linkedHashMap = c2091508Hh.get(lValueOf);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    c2091508Hh.put(lValueOf, linkedHashMap);
                }
                Map<String, Integer> map = linkedHashMap;
                Integer num = map.get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                map.put(str, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    public final void LJIILIIL(long j, List<String> list) {
        Map<String, Integer> map;
        if (j == 0 || list.isEmpty() || (map = this.LJIJJ.get(Long.valueOf(j))) == null) {
            return;
        }
        for (String str : list) {
            Integer num = map.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue <= 1) {
                    map.remove(str);
                } else {
                    map.put(str, Integer.valueOf(iIntValue - 1));
                }
            }
        }
        if (map.isEmpty()) {
            this.LJIJJ.remove(Long.valueOf(j));
        }
    }

    public static int LJIILJJIL(long j, List list, boolean z) {
        AbstractC1110800f0o abstractC1110800f0o;
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((next instanceof AbstractC1110800f0o) && (abstractC1110800f0o = (AbstractC1110800f0o) next) != null && abstractC1110800f0o.getMessageId() == j) {
                if (i >= 0) {
                    if (z) {
                        return i - 1;
                    }
                    return i;
                }
            } else {
                i++;
            }
        }
        return list.size() - 1;
    }

    public final boolean LJFF(long j, List list, boolean z) {
        AbstractC1110800f0o abstractC1110800f0o;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        try {
            if (list.isEmpty()) {
                if (this.LJIILL > 0) {
                    return true;
                }
                return false;
            }
            int iLJIILJJIL = LJIILJJIL(j, list, z);
            int iMax = Math.max(0, (iLJIILJJIL - this.LJIILJJIL) + 2);
            int i = 0;
            if (iMax <= iLJIILJJIL) {
                while (true) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(iLJIILJJIL, list);
                    if ((objLJJJLZIJ instanceof AbstractC1110800f0o) && (abstractC1110800f0o = (AbstractC1110800f0o) objLJJJLZIJ) != null && ((abstractC1110800f0o instanceof C226800uA) || (!LJIIIZ(abstractC1110800f0o).isEmpty()) || ((publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII()) != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && creatorSuccessInfo.topic != null))) {
                        i++;
                    }
                    if (iLJIILJJIL == iMax) {
                        break;
                    }
                    iLJIILJJIL--;
                }
            }
            if (i + 1 <= this.LJIILL) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    public final boolean LJI(long j, String str, List list) {
        int size;
        AbstractC1110800f0o abstractC1110800f0o;
        String str2;
        AbstractC1110800f0o abstractC1110800f0o2;
        try {
            if (!list.isEmpty() && str.length() != 0) {
                Iterator it2 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (!(next instanceof AbstractC1110800f0o) || (abstractC1110800f0o2 = (AbstractC1110800f0o) next) == null || abstractC1110800f0o2.getMessageId() != j) {
                        i++;
                    } else if (i >= 0) {
                        size = i - 1;
                    }
                }
                size = list.size() - 1;
                int iMax = Math.max(0, (size - this.LJIJI) + 1);
                if (iMax <= size) {
                    while (true) {
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(size, list);
                        if ((objLJJJLZIJ instanceof AbstractC1110800f0o) && (abstractC1110800f0o = (AbstractC1110800f0o) objLJJJLZIJ) != null) {
                            List listLJIIIZ = LJIIIZ(abstractC1110800f0o);
                            if (!(listLJIIIZ instanceof Collection) || !listLJIIIZ.isEmpty()) {
                                Iterator it3 = listLJIIIZ.iterator();
                                while (it3.hasNext()) {
                                    Text text = ((PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) it3.next()).tagText;
                                    if (text != null) {
                                        str2 = text.key;
                                    } else {
                                        str2 = null;
                                    }
                                    if (Intrinsics.LJFF(str2, str)) {
                                        return true;
                                    }
                                }
                            }
                        }
                        if (size == iMax) {
                            break;
                        }
                        size--;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final boolean LJIIJJI(long j, List list, boolean z) {
        int size;
        AbstractC1110800f0o abstractC1110800f0o;
        boolean z2;
        boolean z3;
        boolean zContainsKey;
        boolean zContainsKey2;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        C226800uA c226800uA;
        InteractionHubGoalMessage interactionHubGoalMessage;
        AbstractC1110800f0o abstractC1110800f0o2;
        try {
            if (list.isEmpty()) {
                return false;
            }
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!(next instanceof AbstractC1110800f0o) || (abstractC1110800f0o2 = (AbstractC1110800f0o) next) == null || abstractC1110800f0o2.getMessageId() != j) {
                    i++;
                } else if (i >= 0) {
                    size = i - 1;
                }
            }
            size = list.size() - 1;
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(Math.min(list.size() - 1, size), list);
            if (!(objLJJJLZIJ instanceof AbstractC1110800f0o) || (abstractC1110800f0o = (AbstractC1110800f0o) objLJJJLZIJ) == null) {
                return false;
            }
            if ((abstractC1110800f0o instanceof C226800uA) && (c226800uA = (C226800uA) abstractC1110800f0o) != null && (interactionHubGoalMessage = (InteractionHubGoalMessage) c226800uA.LJIL) != null && interactionHubGoalMessage.hasNewGift) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((abstractC1110800f0o instanceof C226800uA) && !z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            long messageId = abstractC1110800f0o.getMessageId();
            if (this.LJJIFFI.containsKey(Long.valueOf(messageId))) {
                zContainsKey = this.LJJ.containsKey(Long.valueOf(messageId));
                zContainsKey2 = this.LJJI.containsKey(Long.valueOf(messageId));
            } else {
                if (!LJIIIZ(abstractC1110800f0o).isEmpty()) {
                    zContainsKey = true;
                } else {
                    zContainsKey = false;
                }
                PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o.LLIIII();
                if (publicAreaMessageCommonLLIIII == null || (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) == null || creatorSuccessInfo.topic == null) {
                    zContainsKey2 = false;
                } else {
                    zContainsKey2 = true;
                }
            }
            if (z2) {
                zContainsKey = true;
            }
            if (!z3 && ((!zContainsKey && !zContainsKey2) || z)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final boolean LJ(long j, long j2, String str, List list) {
        int iIntValue;
        Integer num;
        if (j == 0 || str == null || str.length() == 0) {
            return true;
        }
        Map<String, Integer> map = this.LJIJJ.get(Long.valueOf(j));
        if (map != null && (num = map.get(str)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue >= this.LJIJ) {
            return false;
        }
        if (iIntValue == 0) {
            return true;
        }
        return !LJI(j2, str, list);
    }

    public final String LJIIIIZZ(long j, long j2, String str, List list) {
        Integer num;
        LJIIJ();
        if (!LJFF(j2, list, true)) {
            return "GlobalFrequencyControl";
        }
        if (j != 0) {
            int iIntValue = 0;
            if (str != null && str.length() != 0) {
                Map<String, Integer> map = this.LJIJJ.get(Long.valueOf(j));
                if (map != null && (num = map.get(str)) != null) {
                    iIntValue = num.intValue();
                }
                if (iIntValue >= this.LJIJ) {
                    return "TagSessionLimit";
                }
                if (iIntValue > 0 && LJI(j2, str, list)) {
                    return "TagWindowInterval";
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public final boolean LJII(long j, String str, List list, boolean z, boolean z2) {
        int iIntValue;
        if (str.length() == 0) {
            if (z) {
                this.LJII = true;
            }
            return false;
        }
        LJIIJ();
        if (LJIIJJI(j, list, false)) {
            if (z) {
                this.LJ = true;
            }
            return false;
        }
        if (!LJFF(j, list, z2)) {
            if (z) {
                this.LIZIZ = true;
            }
            return false;
        }
        Integer num = this.LJIJJLI.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue >= this.LJIIZILJ) {
            if (z) {
                this.LJFF = true;
            }
            return false;
        }
        try {
            if (!list.isEmpty()) {
                int iLJIILJJIL = LJIILJJIL(j, list, z2);
                int iMax = Math.max(0, (iLJIILJJIL - this.LJIILLIIL) + 1);
                if (iMax <= iLJIILJJIL) {
                    while (true) {
                        if (!(C13LP.LJJJLZIJ(iLJIILJJIL, list) instanceof C226800uA) || !Intrinsics.LJFF(((C226800uA) C13LP.LJJJLZIJ(iLJIILJJIL, list)).LLJLIL(), str)) {
                            if (iLJIILJJIL == iMax) {
                                break;
                            }
                            iLJIILJJIL--;
                        } else {
                            if (z) {
                                this.LJI = true;
                            }
                            return false;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return true;
    }
}
