package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalDeleteEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125820fP2 {
    public static final CopyOnWriteArrayList<C1125840fP4> LIZ = new CopyOnWriteArrayList<>();

    public static C1125830fP3 LJFF() {
        C1125830fP3 c1125830fP3 = (C1125830fP3) DataChannelGlobal.LLILZ.gg0(LiveCurrentGoalGlobalData.class);
        return c1125830fP3 == null ? new C1125830fP3(null, 15) : c1125830fP3;
    }

    public static boolean LIZIZ(Long l) {
        Long lValueOf;
        boolean z;
        C1125920fPC c1125920fPCLIZ;
        C1125860fP6 c1125860fP6 = LJFF().LIZ;
        Long lValueOf2 = null;
        if (c1125860fP6 != null && (c1125920fPCLIZ = c1125860fP6.LIZ()) != null) {
            lValueOf = Long.valueOf(c1125920fPCLIZ.LIZ);
        } else {
            lValueOf = null;
        }
        if (!Intrinsics.LJFF(lValueOf, l)) {
            return false;
        }
        C1125860fP6 c1125860fP62 = LJFF().LIZ;
        if (c1125860fP62 != null) {
            lValueOf2 = Long.valueOf(c1125860fP62.LIZ);
        }
        C20337914i1<Set<String>> c20337914i1 = InterfaceC772190UQv.Z3;
        Set<String> setLIZIZ = c20337914i1.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lValueOf2);
        sbLIZ.append('_');
        sbLIZ.append(l);
        boolean zContains = setLIZIZ.contains(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20337914i1<Long> c20337914i12 = InterfaceC772190UQv.a4;
        if (jCurrentTimeMillis - c20337914i12.LIZIZ().longValue() >= 604800000) {
            z = true;
            c20337914i1.LIZIZ().clear();
            c20337914i1.LIZJ();
            c20337914i12.LJFF(Long.valueOf(System.currentTimeMillis()));
            c20337914i12.LIZJ();
        } else {
            z = false;
        }
        if (zContains || z) {
            return false;
        }
        return true;
    }

    public static void LIZJ(boolean z) {
        C1125830fP3 c1125830fP3;
        List<C1125920fPC> listLIZJ;
        C1125830fP3 c1125830fP3LJFF = LJFF();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = c1125830fP3LJFF.LIZLLL.values().iterator();
        while (it2.hasNext()) {
            List<C1125920fPC> listLIZJ2 = ((C1125860fP6) it2.next()).LIZJ();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ2, 10));
            Iterator<C1125920fPC> it3 = listLIZJ2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Long.valueOf(it3.next().LIZ));
            }
            arrayList.addAll(arrayList2);
        }
        C1125860fP6 c1125860fP6 = c1125830fP3LJFF.LIZ;
        if (c1125860fP6 != null && (listLIZJ = c1125860fP6.LIZJ()) != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator<C1125920fPC> it4 = listLIZJ.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Long.valueOf(it4.next().LIZ));
            }
            arrayList.addAll(arrayList3);
        }
        if (z) {
            c1125830fP3 = new C1125830fP3(c1125830fP3LJFF.LIZIZ, 13);
        } else {
            c1125830fP3 = new C1125830fP3(null, 15);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.HQ2(LiveCurrentGoalGlobalData.class, c1125830fP3);
        dataChannelGlobal.FQ2(LiveGoalDeleteEvent.class, arrayList);
    }

    public static void LJIIIIZZ(LiveStreamGoal liveStreamGoal) {
        ArrayList arrayList;
        GiftsInfo giftsInfo;
        ImageModel imageModel;
        GiftsInfo giftsInfo2;
        ImageModel imageModel2;
        if (liveStreamGoal == null) {
            return;
        }
        List<LiveStreamSubGoal> list = liveStreamGoal.subGoals;
        if (list != null) {
            for (LiveStreamSubGoal liveStreamSubGoal : list) {
                if (liveStreamSubGoal.progress == liveStreamSubGoal.target) {
                    DataChannelGlobal.LLILZ.FQ2(LiveGoalDeleteEvent.class, Collections.singletonList(Long.valueOf(liveStreamSubGoal.id)));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(liveStreamGoal.id);
                    sbLIZ.append('_');
                    sbLIZ.append(liveStreamSubGoal.id);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C20337914i1<Set<String>> c20337914i1 = InterfaceC772190UQv.Z3;
                    c20337914i1.LIZIZ().remove(strLIZIZ);
                    c20337914i1.LIZJ();
                }
            }
        }
        C1125830fP3 c1125830fP3LJFF = LJFF();
        int i = liveStreamGoal.type;
        C1125860fP6 c1125860fP6 = c1125830fP3LJFF.LIZLLL.get(Integer.valueOf(i));
        if (c1125860fP6 != null && c1125860fP6.LIZ != liveStreamGoal.id) {
            List<C1125920fPC> listLIZJ = c1125860fP6.LIZJ();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator<C1125920fPC> it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().LIZ));
            }
            DataChannelGlobal.LLILZ.FQ2(LiveGoalDeleteEvent.class, arrayList2);
            HashMap map = new HashMap(c1125830fP3LJFF.LIZLLL);
            map.remove(Integer.valueOf(i));
            GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
            if (giftListResult != null) {
                giftsInfo2 = giftListResult.giftsInfo;
            } else {
                giftsInfo2 = null;
            }
            HashSet hashSet = new HashSet();
            for (C1125860fP6 c1125860fP62 : map.values()) {
                List<GiftPage> giftPageList = GiftManager.inst().getGiftPageList();
                if (giftsInfo2 != null) {
                    imageModel2 = giftsInfo2.liveGoalLabelIcon;
                } else {
                    imageModel2 = null;
                }
                hashSet.addAll(LJI(giftPageList, imageModel2, c1125860fP62.LIZJ()));
            }
            DataChannelGlobal.LLILZ.HQ2(LiveCurrentGoalGlobalData.class, C1125830fP3.LIZ(c1125830fP3LJFF, null, null, hashSet, map, 2));
            C20337914i1<Set<String>> c20337914i12 = InterfaceC772190UQv.Z3;
            c20337914i12.LIZIZ().clear();
            c20337914i12.LIZJ();
        }
        long j = liveStreamGoal.id;
        long j2 = liveStreamGoal.expireTime;
        List<LiveStreamSubGoal> list2 = liveStreamGoal.subGoals;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (LiveStreamSubGoal liveStreamSubGoal2 : list2) {
                arrayList.add(new C1125920fPC(liveStreamSubGoal2.id, liveStreamSubGoal2.progress, liveStreamSubGoal2.target));
            }
        } else {
            arrayList = null;
        }
        C1125860fP6 c1125860fP63 = new C1125860fP6(j, j2, liveStreamGoal.challengeType, arrayList);
        int i2 = liveStreamGoal.type;
        C1125830fP3 c1125830fP3LJFF2 = LJFF();
        HashMap map2 = new HashMap(c1125830fP3LJFF2.LIZLLL);
        map2.put(Integer.valueOf(i2), c1125860fP63);
        GiftListResult giftListResult2 = GiftManager.inst().getGiftListResult();
        if (giftListResult2 != null) {
            giftsInfo = giftListResult2.giftsInfo;
        } else {
            giftsInfo = null;
        }
        HashSet hashSet2 = new HashSet();
        for (C1125860fP6 c1125860fP64 : map2.values()) {
            List<GiftPage> giftPageList2 = GiftManager.inst().getGiftPageList();
            if (giftsInfo != null) {
                imageModel = giftsInfo.liveGoalLabelIcon;
            } else {
                imageModel = null;
            }
            hashSet2.addAll(LJI(giftPageList2, imageModel, c1125860fP64.LIZJ()));
        }
        DataChannelGlobal.LLILZ.HQ2(LiveCurrentGoalGlobalData.class, C1125830fP3.LIZ(c1125830fP3LJFF2, c1125860fP63, null, hashSet2, map2, 2));
    }

    public static long LIZLLL(Long l, C1125830fP3 c1125830fP3) {
        Object next;
        Iterator<T> it2 = c1125830fP3.LIZLLL.values().iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List<C1125920fPC> list = ((C1125860fP6) next).LIZJ;
                if (list != null && !list.isEmpty()) {
                    Iterator<C1125920fPC> it3 = list.iterator();
                    while (it3.hasNext()) {
                        long j = it3.next().LIZ;
                        if (l != null && j == l.longValue()) {
                            break loop0;
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        C1125860fP6 c1125860fP6 = (C1125860fP6) next;
        if (c1125860fP6 != null) {
            return c1125860fP6.LIZIZ;
        }
        return 0L;
    }

    public static C1125920fPC LJ(long j, C1125830fP3 c1125830fP3) {
        C1125920fPC next;
        C1125920fPC c1125920fPC = null;
        for (Map.Entry<Integer, C1125860fP6> entry : c1125830fP3.LIZLLL.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Iterator<C1125920fPC> it2 = entry.getValue().LIZJ().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1125920fPC c1125920fPC2 = next;
            if (c1125920fPC2 != null) {
                if (iIntValue != 3) {
                    return c1125920fPC2;
                }
                if (c1125920fPC == null) {
                    c1125920fPC = c1125920fPC2;
                }
            }
        }
        return c1125920fPC;
    }

    public static boolean LJII(Long l, C1125830fP3 c1125830fP3) {
        boolean z;
        boolean z2;
        if (c1125830fP3 != null) {
            boolean zLJJJJ = C13LP.LJJJJ(l, c1125830fP3.LIZJ);
            if (LIZLLL(l, c1125830fP3) > C158B.LIZJ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l != null && zLJJJJ && z2) {
                return true;
            }
            return false;
        }
        C1125830fP3 c1125830fP3LJFF = LJFF();
        boolean zLJJJJ2 = C13LP.LJJJJ(l, c1125830fP3LJFF.LIZJ);
        if (LIZLLL(l, c1125830fP3LJFF) > C158B.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (l != null && zLJJJJ2 && z) {
            return true;
        }
        return false;
    }

    public static void LJIIIZ(GiftsInfo giftsInfo, List list) {
        String str;
        Text text;
        C1125830fP3 c1125830fP3LJFF = LJFF();
        HashSet hashSet = new HashSet();
        Iterator<T> it2 = c1125830fP3LJFF.LIZLLL.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll(LJI(list, giftsInfo.liveGoalLabelIcon, ((C1125860fP6) it2.next()).LIZJ()));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGoalInfoAfterGiftListFetched ");
        GiftPanelBanner giftPanelBanner = giftsInfo.liveGoalBanner;
        if (giftPanelBanner != null && (text = giftPanelBanner.displayText) != null) {
            str = text.defaultPattern;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("LiveGoalUtils", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal.LLILZ.HQ2(LiveCurrentGoalGlobalData.class, C1125830fP3.LIZ(c1125830fP3LJFF, null, new C1125850fP5(giftsInfo.liveGoalLabelIcon), hashSet, null, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet LJI(java.util.List r11, com.bytedance.android.live.base.model.ImageModel r12, java.util.List r13) {
        /*
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            if (r11 != 0) goto L9
            X.13BV r11 = X.C13BV.INSTANCE
        L9:
            java.util.Iterator r11 = r11.iterator()
        Ld:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r11.next()
            com.bytedance.android.livesdk.gift.model.GiftPage r0 = (com.bytedance.android.livesdk.gift.model.GiftPage) r0
            r10 = 0
            if (r0 == 0) goto L20
            java.util.List<com.bytedance.android.livesdk.model.Gift> r0 = r0.gifts
            if (r0 != 0) goto L22
        L20:
            X.13BV r0 = X.C13BV.INSTANCE
        L22:
            java.util.Iterator r9 = r0.iterator()
        L26:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Ld
            java.lang.Object r4 = r9.next()
            com.bytedance.android.livesdk.model.Gift r4 = (com.bytedance.android.livesdk.model.Gift) r4
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r0 = r4.colorInfos
            r5 = 1
            if (r0 == 0) goto L3d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb2
        L3d:
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r0 = r4.colorInfos
            if (r0 == 0) goto Lb2
            int r0 = r0.size()
            if (r0 <= r5) goto Lb2
            r3 = 1
        L48:
            com.bytedance.android.livesdk.model.GiftRandomEffectInfo r0 = r4.randomEffectInfo
            if (r0 == 0) goto Lb0
            r1 = 1
        L4d:
            com.bytedance.android.live.base.model.ImageModel r0 = r4.leftLogo
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.getUri()
        L55:
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lac
            if (r3 != 0) goto Lac
            r7 = 0
        L5e:
            if (r13 == 0) goto L97
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r13, r0)
            r6.<init>(r0)
            java.util.Iterator r3 = r13.iterator()
        L6f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r3.next()
            X.0fPC r0 = (X.C1125920fPC) r0
            long r0 = r0.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            goto L6f
        L85:
            long r0 = r4.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r6.contains(r0)
            if (r0 != r5) goto L97
            if (r7 == 0) goto L95
            if (r8 == 0) goto L97
        L95:
            r1 = 1
            goto L98
        L97:
            r1 = 0
        L98:
            if (r12 == 0) goto Laa
            r0 = 1
        L9b:
            if (r1 == 0) goto L26
            if (r0 == 0) goto L26
            long r0 = r4.id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.add(r0)
            goto L26
        Laa:
            r0 = 0
            goto L9b
        Lac:
            r7 = 1
            goto L5e
        Lae:
            r0 = r10
            goto L55
        Lb0:
            r1 = 0
            goto L4d
        Lb2:
            r3 = 0
            goto L48
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125820fP2.LJI(java.util.List, com.bytedance.android.live.base.model.ImageModel, java.util.List):java.util.HashSet");
    }

    public static void LIZ(Fragment fragment, Long l, Function0 function0, Function2 function2) {
        if (l == null) {
            return;
        }
        if (C1125810fP1.LIZ()) {
            DataChannelGlobal.LLILZ.zQ2(fragment);
            DataChannelGlobal.LLILZ.BQ2(fragment, fragment, LiveCurrentGoalGlobalData.class, new AwS596S0100000_17(fragment, 280));
        }
        LIZ.add(new C1125840fP4(l.longValue(), function2, function0));
    }
}
