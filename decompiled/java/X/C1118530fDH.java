package X;

import com.bytedance.android.livesdk.gift.base.platform.business.effect.shinycard.IShinyCardGiftAPI;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.ShinyCardInteractParams;
import com.bytedance.android.livesdk.gift.model.ShinyCardInteraction;
import com.bytedance.android.livesdk.livesetting.gift.GiftShinyCardInteractionConfigSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118530fDH {
    public static WeakReference<DataChannel> LIZ;
    public static final Map<String, String> LIZIZ = new LinkedHashMap();
    public static long LIZJ;

    public static String LIZIZ(GiftMessage giftMessage) {
        Map<String, String> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str = (String) linkedHashMap.get(LIZ(giftMessage.groupCount, giftMessage.groupId));
        if (str == null) {
            return "";
        }
        return str;
    }

    public static int LIZJ(GiftMessage giftMessage) {
        return Intrinsics.LJFF(LIZ(giftMessage.groupCount, giftMessage.groupId), InterfaceC1094160eZy.d2.LIZ()) ? 1 : 0;
    }

    public static String LIZ(int i, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(Gift gift, AbstractC1126600fQI abstractC1126600fQI) {
        int size;
        if (gift == null) {
            return;
        }
        if (!gift.LJIIIIZZ() && !gift.LJII()) {
            return;
        }
        LinkedList<Integer> linkedListLIZ = InterfaceC1094160eZy.Z1.LIZ();
        if (linkedListLIZ != null) {
            size = linkedListLIZ.size();
        } else {
            size = 0;
        }
        Integer numValueOf = Integer.valueOf(size);
        if (numValueOf.intValue() > 0) {
            int iIntValue = numValueOf.intValue();
            abstractC1126600fQI.LJIL = C497740JfY.LJIIL(2131755985, iIntValue, Integer.valueOf(iIntValue));
        }
    }

    public static void LIZLLL(GiftMessage giftMessage, C1135280feI c1135280feI, int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_collect_gift_effect_result");
        c474500IjALIZ.LJJIIZI(c1135280feI.LJIIZILJ);
        c474500IjALIZ.LJJII(Integer.valueOf(giftMessage.giftVariantId), "card_id");
        c474500IjALIZ.LJJII(LIZIZ(giftMessage), "shiny_card_enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZJ(giftMessage)), "is_new_shiny_user");
        c474500IjALIZ.LJJII("downgrade", "effect_type");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_guide");
        c474500IjALIZ.LJJII("default", "shiny_card_collect_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_msg");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(long j, long j2, String str, int i, long j3, boolean z, int i2) {
        DataChannel dataChannel;
        long j4;
        WeakReference<DataChannel> weakReference = LIZ;
        Boolean boolValueOf = null;
        if (weakReference != null) {
            dataChannel = weakReference.get();
        } else {
            dataChannel = null;
        }
        if (dataChannel == null) {
            C20441214yg.LJ("ShinyCardBubbleHelper", "onUnlockCard error, dataChannel is null");
            return;
        }
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            return;
        }
        LinkedList<Integer> linkedListLIZ = InterfaceC1094160eZy.a2.LIZ();
        if (linkedListLIZ != null) {
            boolValueOf = Boolean.valueOf(linkedListLIZ.contains(Integer.valueOf(i)));
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            return;
        }
        C0JT6<LinkedList<Integer>> c0jt6 = InterfaceC1094160eZy.Z1;
        LinkedList<Integer> linkedListLIZ2 = c0jt6.LIZ();
        if (linkedListLIZ2 == null) {
            linkedListLIZ2 = new LinkedList<>();
        }
        if (C176600m4.LIZIZ(Boolean.valueOf(linkedListLIZ2.contains(Integer.valueOf(i))))) {
            return;
        }
        linkedListLIZ2.add(0, Integer.valueOf(i));
        c0jt6.LIZJ(linkedListLIZ2);
        InterfaceC1094160eZy.b2.LIZJ(String.valueOf(i2));
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        ShinyCardInteractParams shinyCardInteractParams = new ShinyCardInteractParams();
        ShinyCardInteraction shinyCardInteraction = new ShinyCardInteraction();
        shinyCardInteraction.roomId = jLJJLIIIJ;
        shinyCardInteraction.senderId = j;
        shinyCardInteraction.baseGiftId = j2;
        shinyCardInteraction.cardId = i;
        shinyCardInteraction.unlockToken = str;
        shinyCardInteraction.interactTimestampMs = j3;
        shinyCardInteraction.interactionId = UUID.randomUUID().toString();
        shinyCardInteractParams.interactions.add(shinyCardInteraction);
        try {
            InterfaceC1094160eZy.c2.LIZJ(C293501Bt.LIZ().LJIILL(shinyCardInteractParams));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJIILIIL = ((IShinyCardGiftAPI) C480460Ism.LIZLLL(IShinyCardGiftAPI.class)).shinyCardInteract(shinyCardInteractParams).LJIILIIL(new C0UO0());
        GiftShinyCardInteractionConfigSetting giftShinyCardInteractionConfigSetting = GiftShinyCardInteractionConfigSetting.INSTANCE;
        if (giftShinyCardInteractionConfigSetting.getConfig().requestApiRandomDelay > 0) {
            c11nzLJIILIIL = c11nzLJIILIIL.LJJI(new SecureRandom().nextInt(r1), TimeUnit.MILLISECONDS);
        }
        c11nzLJIILIIL.LJJLL(new C09JN() { // from class: X.00MU
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ShinyCardGiftHelper@45f4.syncUnlockedCardIdToServer$3");
                C1C7U.LIZIZ("ShinyCardGiftHelper@45f4.syncUnlockedCardIdToServer$3");
            }
        }, new C09JN() { // from class: X.00Rg
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ShinyCardGiftHelper@45f4.syncUnlockedCardIdToServer$4");
                C20441214yg.LJFF("ShinyCardBubbleHelper", "syncUnlockedCardIdToServer error", (Throwable) obj);
                C1C7U.LIZIZ("ShinyCardGiftHelper@45f4.syncUnlockedCardIdToServer$4");
            }
        });
        if (C158B.LIZ() - LIZJ >= giftShinyCardInteractionConfigSetting.getConfig().bubbleInterval) {
            Gift giftFindGiftById = GiftManager.inst().findGiftById(j2);
            if (giftFindGiftById == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryShowBubble fail, can not find Gift, giftId:");
                sbLIZ.append(j2);
                C20441214yg.LJ("ShinyCardBubbleHelper", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            LIZJ = C158B.LIZ();
            if (z) {
                j4 = 0;
            } else {
                j4 = giftShinyCardInteractionConfigSetting.getConfig().bubbleShowDelay;
            }
            C786410Ut5.LJLIIL(j4, C473410IhP.LIZ(), new RunnableC514601zU(j, dataChannel, giftFindGiftById, 1));
        }
    }
}
