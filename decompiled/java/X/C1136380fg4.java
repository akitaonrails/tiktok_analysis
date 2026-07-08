package X;

import Y.AfS0S0110100_12;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.CrossScreenSeiInfo;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectCrossScreenStickerSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenDurationSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136380fg4 {
    public static final C1136380fg4 LIZ = new C1136380fg4();
    public static final ConcurrentHashSet<Long> LIZIZ = new ConcurrentHashSet<>();
    public static final ConcurrentHashSet<Long> LIZJ = new ConcurrentHashSet<>();
    public static final Map<Long, InterfaceC420801kM> LIZLLL = new ConcurrentHashMap();
    public static final Map<Long, C1133660fbg> LJ = new ConcurrentHashMap();
    public static final Map<Long, Long> LJFF = new ConcurrentHashMap();

    public static void LIZ() {
        Iterator it2 = ((ConcurrentHashMap) LIZLLL).values().iterator();
        while (it2.hasNext()) {
            C500260Jjc.LJJLIIIJLJLI((InterfaceC420801kM) it2.next());
        }
        LIZIZ.clear();
        LIZJ.clear();
        ((ConcurrentHashMap) LIZLLL).clear();
        ((ConcurrentHashMap) LJ).clear();
        ((ConcurrentHashMap) LJFF).clear();
        C20441214yg.LJIIIZ("CROSS_SEI", "clear CrossScreenRenderHelper");
    }

    public static Long LIZIZ(Map map) {
        int iNextInt = C19994513Lb.LIZIZ((System.currentTimeMillis() & 65535) ^ ((65535 & UserService.getInstance().user().getCurrentUserId()) << 16)).nextInt(100);
        int iIntValue = 0;
        Long l = null;
        for (Map.Entry entry : map.entrySet()) {
            iIntValue += ((Number) entry.getValue()).intValue();
            l = (Long) entry.getKey();
            if (iNextInt < iIntValue) {
                break;
            }
        }
        return l;
    }

    public static List LJ(String str) {
        long fallbackDuration;
        long jLIZ = C158B.LIZ();
        try {
            CrossScreenSeiInfo crossScreenSeiInfo = (CrossScreenSeiInfo) C19748512Ol.LIZIZ.LJII(C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "live_cross_screen_gift_sei")), CrossScreenSeiInfo.class);
            long j = crossScreenSeiInfo.crossScreenId;
            ConcurrentHashSet<Long> concurrentHashSet = LIZIZ;
            if (concurrentHashSet.contains(Long.valueOf(j))) {
                return C13BV.INSTANCE;
            }
            concurrentHashSet.add(Long.valueOf(j));
            C1136370fg3.LIZ.getClass();
            C1136370fg3.LJFF(crossScreenSeiInfo, jLIZ);
            if (LIZJ.contains(Long.valueOf(j))) {
                return C13BV.INSTANCE;
            }
            String str2 = "im_not_arrived";
            Long lValueOf = Long.valueOf(j);
            Map<Long, InterfaceC420801kM> map = LIZLLL;
            if (((ConcurrentHashMap) map).containsKey(lValueOf)) {
                str2 = "im_pending";
                C500260Jjc.LJJLIIIJLJLI((InterfaceC420801kM) ((ConcurrentHashMap) map).get(Long.valueOf(j)));
                ((ConcurrentHashMap) map).remove(Long.valueOf(j));
            }
            Long lValueOf2 = Long.valueOf(j);
            Map<Long, Long> map2 = LJFF;
            if (((ConcurrentHashMap) map2).containsKey(lValueOf2)) {
                ((ConcurrentHashMap) map2).remove(Long.valueOf(j));
            }
            Gift giftFindGiftById = GiftManager.inst().findGiftById(crossScreenSeiInfo.giftId);
            if (giftFindGiftById != null) {
                fallbackDuration = giftFindGiftById.duration;
            } else {
                fallbackDuration = LiveGiftCrossScreenDurationSetting.INSTANCE.getFallbackDuration(crossScreenSeiInfo.giftId);
            }
            int i = crossScreenSeiInfo.price;
            if (i == 0) {
                if (giftFindGiftById == null) {
                    i = 0;
                } else {
                    i = giftFindGiftById.diamondCount;
                }
            }
            long j2 = crossScreenSeiInfo.duration;
            if (j2 != 0) {
                fallbackDuration = j2;
            }
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            User user = new User();
            user.setId(crossScreenSeiInfo.giftSenderUid);
            C1136540fgK c1136540fgK = new C1136540fgK();
            c1136540fgK.LIZIZ = crossScreenSeiInfo.giftId;
            c1136540fgK.LJIILJJIL = jLIZ;
            c1136540fgK.LIZJ = user;
            GiftMessage giftMessage = new GiftMessage();
            giftMessage.giftId = crossScreenSeiInfo.giftId;
            giftMessage.toUser = userLJIJJLI;
            giftMessage.fromUser = user;
            GiftMessage.InteractiveGiftInfo interactiveGiftInfo = new GiftMessage.InteractiveGiftInfo();
            interactiveGiftInfo.crossScreenRole = 2L;
            interactiveGiftInfo.uniqId = j;
            interactiveGiftInfo.toUserTeamId = crossScreenSeiInfo.teamId;
            giftMessage.interactiveGiftInfo = interactiveGiftInfo;
            if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
                giftMessage.mGift = new Gift();
                GiftEffect giftEffect = new GiftEffect();
                GiftEffectSpecs giftEffectSpecs = new GiftEffectSpecs();
                GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec = new GiftEffectCrossScreenStickerSpec();
                giftEffectCrossScreenStickerSpec.reactionAssetIds = new LinkedHashMap(crossScreenSeiInfo.reactionEffectIds);
                giftEffectSpecs.crossScreenSticker = giftEffectCrossScreenStickerSpec;
                giftEffect.specs = giftEffectSpecs;
                giftMessage.giftEffect = giftEffect;
            } else {
                Gift gift = new Gift();
                Gift.CrossScreenEffectInfo crossScreenEffectInfo = new Gift.CrossScreenEffectInfo();
                crossScreenEffectInfo.reactionEffectIds = new LinkedHashMap(crossScreenSeiInfo.reactionEffectIds);
                gift.crossScreenEffectInfo = crossScreenEffectInfo;
                giftMessage.mGift = gift;
            }
            c1136540fgK.LIZLLL = giftMessage;
            c1136540fgK.LJIIJ = "sei";
            c1136540fgK.LJIIJJI = str2;
            ArrayList arrayList = new ArrayList();
            int i2 = crossScreenSeiInfo.repeatCount;
            for (int i3 = 0; i3 < i2; i3++) {
                C1136560fgM c1136560fgM = new C1136560fgM();
                c1136560fgM.LJIIL = crossScreenSeiInfo.giftId;
                c1136560fgM.LJI = i;
                c1136560fgM.LJJ = fallbackDuration;
                c1136560fgM.LJJI = true;
                c1136560fgM.LJII = "";
                c1136560fgM.LJJIIJZLJL = 2L;
                c1136560fgM.LJJIIZ = j;
                c1136560fgM.LJJIJIIJIL = crossScreenSeiInfo.teamId;
                c1136560fgM.LJJIJIIJI = crossScreenSeiInfo.reactionEffectIds;
                C1136460fgC.LIZ.getClass();
                c1136560fgM.LJJIFFI = new C1136470fgD(c1136540fgK);
                arrayList.add(c1136560fgM);
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            C1AF0.LJFF(new RuntimeException() { // from class: X.0fiA
                public static final int $stable = 8;
            }, "SEI parse exception");
            return C13BV.INSTANCE;
        }
    }

    public static boolean LIZLLL(C1136560fgM c1136560fgM, DataChannel dataChannel) {
        boolean z;
        int size;
        Boolean boolValueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        Map<Long, Integer> map;
        long j = c1136560fgM.LJJIIJZLJL;
        boolean z5 = false;
        if (j == 1) {
            if (dataChannel == null) {
                size = 0;
            } else {
                Map mapLJ = (Map) dataChannel.gg0(C749260TaG.class);
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                List<User> listM30 = C1128450fTH.LIZ.M30();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MG statusMap ");
                sbLIZ.append(mapLJ);
                C20441214yg.LJIIIZ("CROSS_SEI", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sb = new StringBuilder("MG userList ");
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listM30, 10));
                Iterator<User> it2 = listM30.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().getId()));
                }
                sb.append(arrayList);
                C20441214yg.LJIIIZ("CROSS_SEI", sb.toString());
                ArrayList arrayList2 = new ArrayList();
                for (User user : listM30) {
                    User user2 = user;
                    if (user2.getId() != UserService.getInstance().user().getCurrentUserId()) {
                        C938460aWq c938460aWq = (C938460aWq) mapLJ.get(Long.valueOf(user2.getId()));
                        if (c938460aWq != null) {
                            boolValueOf = Boolean.valueOf(c938460aWq.LIZ);
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJIFFI(boolValueOf)) {
                            arrayList2.add(user);
                        }
                    }
                }
                size = arrayList2.size();
            }
            EnumC919050a1X enumC919050a1XLJIIJ = C1128450fTH.LJIIJ();
            if (enumC919050a1XLJIIJ == EnumC919050a1X.NORMAL_VIDEO) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (enumC919050a1XLJIIJ != EnumC919050a1X.LINK_MIC_GUEST && enumC919050a1XLJIIJ != EnumC919050a1X.LINE_UP) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (LiveGiftCrossScreenSetting.INSTANCE.shouldCheckCameraForAction() && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 || (z4 && size == 0)) {
                z5 = true;
            }
            c1136560fgM.LJJIJIIJIL = C1128450fTH.LJIILIIL();
            c1136560fgM.LJJIIJ = z5;
            if (z5) {
                map = c1136560fgM.LJJIIZI;
            } else {
                map = c1136560fgM.LJJIJ;
            }
            LIZ.getClass();
            Long lLIZIZ = LIZIZ(map);
            if (lLIZIZ != null) {
                long jLongValue = lLIZIZ.longValue();
                c1136560fgM.LJFF = jLongValue;
                c1136560fgM.LIZJ().LJIILL(jLongValue, z5);
            }
        } else if (j == 2) {
            long j2 = c1136560fgM.LJJIJIIJIL;
            if (j2 != 0 && j2 == C1128450fTH.LJIILIIL()) {
                z = false;
            } else {
                z = true;
            }
            if (C1128450fTH.LIZJ.co0() && !z) {
                return false;
            }
            Long lLIZIZ2 = LIZIZ(c1136560fgM.LJJIJIIJI);
            if (lLIZIZ2 != null) {
                long jLongValue2 = lLIZIZ2.longValue();
                c1136560fgM.LJFF = jLongValue2;
                c1136560fgM.LIZJ().LJIILL(jLongValue2, false);
            }
            return true;
        }
        return true;
    }

    public static void LIZJ(GiftMessage.InteractiveGiftInfo interactiveGiftInfo, boolean z, Runnable runnable) {
        long jLongValue;
        if (interactiveGiftInfo == null) {
            return;
        }
        long j = interactiveGiftInfo.uniqId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Receive IM ");
        sbLIZ.append(j);
        C1138230fj3.LIZJ("CROSS_SEI", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (((ConcurrentHashMap) LIZLLL).containsKey(Long.valueOf(j))) {
                C1138230fj3.LIZ("CROSS_SEI", "Receive IM is currently Pending, Increasing Play Count.");
                Map<Long, Long> map = LJFF;
                Long lValueOf = Long.valueOf(j);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
                Long l = (Long) concurrentHashMap.get(Long.valueOf(j));
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                concurrentHashMap.put(lValueOf, Long.valueOf(jLongValue + 1));
            }
        }
        if (!LIZIZ.contains(Long.valueOf(j))) {
            Long lValueOf2 = Long.valueOf(j);
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZLLL;
            if (!concurrentHashMap2.containsKey(lValueOf2)) {
                ConcurrentHashSet<Long> concurrentHashSet = LIZJ;
                if (!concurrentHashSet.contains(Long.valueOf(j))) {
                    long j2 = interactiveGiftInfo.crossScreenDelay;
                    if (j2 != 0) {
                        concurrentHashMap2.put(Long.valueOf(j), C11NZ.LJLJJLL(j2, TimeUnit.MILLISECONDS).LJJLJLI(new AfS0S0110100_12(j, runnable, z, 1)));
                        return;
                    } else {
                        concurrentHashSet.add(Long.valueOf(j));
                        runnable.run();
                        return;
                    }
                }
            }
        }
        C20441214yg.LJIIIZ("CROSS_SEI", "drop reaction IM");
    }
}
