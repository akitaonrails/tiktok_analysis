package X;

import android.content.res.Resources;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueGiftModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0feG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135260feG {
    public static final /* synthetic */ int LIZ = 0;

    public static GiftMessage LIZ(GiftMessage giftMessage) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        GiftMessage giftMessage2 = new GiftMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        CommonMessageData commonMessageData2 = giftMessage.baseMessage;
        commonMessageData.roomId = commonMessageData2.roomId;
        commonMessageData.messageId = jCurrentTimeMillis;
        commonMessageData.createTime = jCurrentTimeMillis;
        commonMessageData.displayText = commonMessageData2.displayText;
        giftMessage2.baseMessage = commonMessageData;
        giftMessage2.LL = giftMessage.LL;
        giftMessage2.fromUser = giftMessage.fromUser;
        giftMessage2.toUser = giftMessage.toUser;
        giftMessage2.giftId = giftMessage.giftId;
        giftMessage2.fanTicketCount = giftMessage.fanTicketCount;
        giftMessage2.isFirstSendGift = giftMessage.isFirstSendGift;
        giftMessage2.displayTextForAudience = giftMessage.displayTextForAudience;
        giftMessage2.repeatEnd = giftMessage.repeatEnd;
        giftMessage2.repeatCount = giftMessage.repeatCount;
        giftMessage2.comboCount = giftMessage.comboCount;
        giftMessage2.groupCount = giftMessage.groupCount;
        giftMessage2.groupId = giftMessage.groupId;
        giftMessage2.LLILLJJLI = giftMessage.LLILLJJLI;
        giftMessage2.toMemberIdInt = giftMessage.toMemberIdInt;
        giftMessage2.toMemberNickname = giftMessage.toMemberNickname;
        giftMessage2.LLILLL = giftMessage.LLILLL;
        Gift gift = giftMessage.mGift;
        try {
            C1515210pX5.LIZLLL().getClass();
            C0IMD c0imdLJI = C1515210pX5.LJI(Gift.class);
            if (c0imdLJI != null) {
                C1515210pX5.LIZLLL().getClass();
                InterfaceC1132110fZB interfaceC1132110fZBLJII = C1515210pX5.LJII(Gift.class);
                if (interfaceC1132110fZBLJII != null) {
                    C1496690p3D c1496690p3D = new C1496690p3D();
                    interfaceC1132110fZBLJII.LIZ(new C1142350fph(c1496690p3D), gift);
                    C1516680pZS c1516680pZS = new C1516680pZS();
                    c1516680pZS.LJIIL(new C1506330pIl(c1496690p3D.LJZL()));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(gift.type);
                    sbLIZ.append(", ");
                    sbLIZ.append(gift.name);
                    C20441214yg.LIZIZ("deepCopyGift", C2188811AlT.LIZIZ(sbLIZ));
                    gift = (Gift) c0imdLJI.LIZJ(c1516680pZS);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("deepCopyGift", e);
        }
        giftMessage2.mGift = gift;
        giftMessage2.mTrayInfo = giftMessage.mTrayInfo;
        giftMessage2.orderId = giftMessage.orderId;
        giftMessage2.mLogId = giftMessage.mLogId;
        giftMessage2.LLIZLLLIL = giftMessage.LLIZLLLIL;
        giftMessage2.giftMonitorInfo = giftMessage.giftMonitorInfo;
        giftMessage2.incomeTaskgifts = giftMessage.incomeTaskgifts;
        giftMessage2.priority = giftMessage.priority;
        giftMessage2.sendType = giftMessage.sendType;
        giftMessage2.publicAreaCommon = giftMessage.publicAreaCommon;
        giftMessage2.trayDisplayText = giftMessage.trayDisplayText;
        giftMessage2.bannedDisplayEffects = giftMessage.bannedDisplayEffects;
        giftMessage2.colorId = giftMessage.colorId;
        giftMessage2.giftsInBox = giftMessage.giftsInBox;
        giftMessage2.LLJ = giftMessage.LLJ;
        giftMessage2.userIdentity = giftMessage.userIdentity;
        giftMessage2.matchInfo = giftMessage.matchInfo;
        giftMessage2.linkmicGiftExpressionStrategy = giftMessage.linkmicGiftExpressionStrategy;
        giftMessage2.flyingMicResources = giftMessage.flyingMicResources;
        giftMessage2.flyingMicResourcesV2 = giftMessage.flyingMicResourcesV2;
        giftMessage2.multiGenerateMessage = giftMessage.multiGenerateMessage;
        giftMessage2.disableGiftTracking = giftMessage.disableGiftTracking;
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            giftMessage2.giftEffect = giftMessage.giftEffect;
        } else {
            giftMessage2.asset = giftMessage.asset;
        }
        giftMessage2.version = giftMessage.version;
        giftMessage2.sponsorshipInfo = giftMessage.sponsorshipInfo;
        giftMessage2.lynxExtra = giftMessage.lynxExtra;
        giftMessage2.msgFilter = giftMessage.msgFilter;
        giftMessage2.interactiveGiftInfo = giftMessage.interactiveGiftInfo;
        giftMessage2.LLILZ = giftMessage.LLILZ;
        return giftMessage2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ffi] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.bytedance.android.livesdk.gift.receiving.model.GiftQueueGiftModel] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0ffi] */
    public static final C1135280feI LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU, User user) {
        long jLIZIZ;
        long jLIZIZ2;
        User userLJIJ;
        boolean zLJIIL;
        GiftEffect giftEffectLJIJI;
        Map<String, String> map;
        String strLJFF;
        long id = 0;
        List<LynxGiftExtra> listLJIL = null;
        if (!interfaceC1136020ffU.LJJI().LJIJJ && (interfaceC1136020ffU.getMessageId() == 0 || interfaceC1136020ffU.LJIILL() == null)) {
            return null;
        }
        ?? LJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
        if (!interfaceC1136020ffU.LJJI().LJIJJ && LJIIIIZZ == 0) {
            return null;
        }
        if (interfaceC1136020ffU.LJJI().LJIJJ) {
            jLIZIZ = interfaceC1136020ffU.getGiftId();
        } else {
            jLIZIZ = C1135270feH.LIZIZ(interfaceC1136020ffU);
        }
        boolean z = false;
        String strLJFF2 = C1138640fji.LJFF(jLIZIZ, false);
        if (interfaceC1136020ffU.LJJI().LJIJJ) {
            jLIZIZ2 = interfaceC1136020ffU.getGiftId();
        } else {
            jLIZIZ2 = C1135270feH.LIZIZ(interfaceC1136020ffU);
        }
        C1138640fji.LJ(jLIZIZ2, null);
        if (!interfaceC1136020ffU.LJJI().LJIJJ) {
            if (interfaceC1136020ffU.LIZJ() == null || C1135870ffF.LJIJI(interfaceC1136020ffU) <= 0 || (user != null && C1135870ffF.LJIJI(interfaceC1136020ffU) == user.getId())) {
                if (LJIIIIZZ != 0) {
                    LJIIIIZZ.LJ();
                }
            } else {
                Resources resourcesLJIILJJIL = C497740JfY.LJIILJJIL();
                Object[] objArr = new Object[1];
                InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
                if (interfaceC1136800fgkLIZJ == null || (strLJFF = interfaceC1136800fgkLIZJ.LJFF()) == null) {
                    strLJFF = "";
                }
                objArr[0] = strLJFF;
                resourcesLJIILJJIL.getString(2131852608, objArr);
            }
        } else {
            LJIIIIZZ = new GiftQueueGiftModel();
            LJIIIIZZ.LJJII(interfaceC1136020ffU.getGiftId());
        }
        if (interfaceC1136020ffU.LIZJ() == null) {
            if (user == null) {
                userLJIJ = null;
            } else {
                userLJIJ = new User();
                userLJIJ.setId(user.getId());
                userLJIJ.setSecUid(user.getSecUid());
                userLJIJ.setDisplayId(user.getUsername());
                userLJIJ.setNickName(user.getUsername());
                userLJIJ.setAvatarThumb(user.getAvatarThumb());
            }
        } else {
            userLJIJ = C1135870ffF.LJIJ(interfaceC1136020ffU.LIZJ());
        }
        C1135280feI c1135280feI = new C1135280feI();
        if (LJIIIIZZ != 0) {
            zLJIIL = LJIIIIZZ.LJIIL();
        } else {
            zLJIIL = false;
        }
        c1135280feI.LIZLLL = zLJIIL;
        c1135280feI.LJ = interfaceC1136020ffU.getMessageId();
        c1135280feI.LJFF = C1135270feH.LIZIZ(interfaceC1136020ffU);
        c1135280feI.LJI = C1135870ffF.LIZJ(interfaceC1136020ffU);
        c1135280feI.LJII = strLJFF2;
        c1135280feI.LJIIIIZZ = interfaceC1136020ffU.LJIIJJI();
        c1135280feI.LJIIIZ = userLJIJ;
        c1135280feI.LJIIJ = C1135870ffF.LJIJI(interfaceC1136020ffU);
        c1135280feI.LJIIJJI = C1135870ffF.LJIJ(interfaceC1136020ffU.LJIILL());
        c1135280feI.LIZ = C1135870ffF.LJII(interfaceC1136020ffU);
        if (LJIIIIZZ != 0) {
            id = LJIIIIZZ.getId();
        }
        c1135280feI.LJIIL = id;
        c1135280feI.LJIILJJIL = interfaceC1136020ffU.LJ();
        c1135280feI.LJIJJ = C1135870ffF.LIZLLL(interfaceC1136020ffU);
        c1135280feI.LJIILL = interfaceC1136020ffU.getLogId();
        c1135280feI.LIZIZ = C1135870ffF.LJ(interfaceC1136020ffU);
        interfaceC1136020ffU.getRepeatCount();
        c1135280feI.LJIILIIL = interfaceC1136020ffU.getRepeatCount();
        InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII != null && interfaceC1136230ffpLJJII.LJJIFFI() != null) {
            z = true;
        }
        c1135280feI.LJIILLIIL = z;
        InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII2 != null) {
            listLJIL = interfaceC1136230ffpLJJII2.LJIL();
        }
        c1135280feI.LJIL = listLJIL;
        c1135280feI.LJIJJLI = C1136040ffW.LIZ(interfaceC1136020ffU);
        InterfaceC1136230ffp interfaceC1136230ffpLJJII3 = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII3 != null && (giftEffectLJIJI = interfaceC1136230ffpLJJII3.LJIJI()) != null && (map = giftEffectLJIJI.eventTrackingParams) != null) {
            c1135280feI.LJIIZILJ.putAll(map);
        }
        return c1135280feI;
    }

    public static final C1135280feI LIZJ(GiftMessage giftMessage, User user) {
        long jLIZJ;
        long jLIZJ2;
        boolean z;
        Map<String, String> map;
        List urls;
        String str;
        String strLIZ;
        if (!giftMessage.LL && (giftMessage.getMessageId() == 0 || giftMessage.fromUser == null)) {
            return null;
        }
        Gift gift = giftMessage.mGift;
        if (!giftMessage.LL) {
            if (gift == null) {
                return null;
            }
            jLIZJ = C1135270feH.LIZJ(giftMessage);
        } else {
            jLIZJ = giftMessage.giftId;
        }
        boolean z2 = false;
        String strLJFF = C1138640fji.LJFF(jLIZJ, false);
        if (giftMessage.LL) {
            jLIZJ2 = giftMessage.giftId;
        } else {
            jLIZJ2 = C1135270feH.LIZJ(giftMessage);
        }
        C1138640fji.LJ(jLIZJ2, null);
        String str2 = "";
        if (!giftMessage.LL) {
            User user2 = giftMessage.toUser;
            if (user2 != null && user2.getId() > 0 && (user == null || giftMessage.toUser.getId() != user.getId())) {
                Resources resourcesLJIILJJIL = C497740JfY.LJIILJJIL();
                Object[] objArr = new Object[1];
                if (C0KVU.LIZ(giftMessage.toUser) == null) {
                    strLIZ = "";
                } else {
                    strLIZ = C0KVU.LIZ(giftMessage.toUser);
                }
                objArr[0] = strLIZ;
                resourcesLJIILJJIL.getString(2131852608, objArr);
            }
        } else {
            gift = new Gift();
            gift.primaryEffectId = giftMessage.giftId;
        }
        User user3 = giftMessage.toUser;
        if (user3 != null) {
            user = user3;
        }
        C1135280feI c1135280feI = new C1135280feI();
        if (gift != null) {
            z = gift.isRandomGift;
        } else {
            z = false;
        }
        c1135280feI.LIZLLL = z;
        c1135280feI.LJ = giftMessage.getMessageId();
        c1135280feI.LJFF = C1135270feH.LIZJ(giftMessage);
        c1135280feI.LJI = gift.diamondCount;
        c1135280feI.LJII = strLJFF;
        c1135280feI.LJIIIIZZ = giftMessage.LLILLJJLI;
        c1135280feI.LJIIIZ = user;
        c1135280feI.LJIIJ = C1133680fbi.LIZIZ(giftMessage);
        c1135280feI.LJIIJJI = giftMessage.fromUser;
        c1135280feI.LIZ = gift.type;
        c1135280feI.LJIIL = gift.id;
        c1135280feI.LJIILJJIL = giftMessage.LLILLL;
        c1135280feI.LJIJJ = gift.duration;
        c1135280feI.LJIILL = giftMessage.mLogId;
        String str3 = gift.name;
        if (str3 == null) {
            str3 = "";
        }
        c1135280feI.LIZIZ = str3;
        ImageModel imageModel = gift.image;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && (str = (String) C13LP.LJJJLZIJ(0, urls)) != null) {
            str2 = str;
        }
        c1135280feI.LIZJ = str2;
        c1135280feI.LJIILIIL = giftMessage.comboCount;
        if (giftMessage.flyingMicResourcesV2 != null) {
            z2 = true;
        }
        c1135280feI.LJIILLIIL = z2;
        c1135280feI.LJIL = giftMessage.lynxExtra;
        c1135280feI.LJIJJLI = C1136040ffW.LIZIZ(giftMessage);
        GiftEffect giftEffect = giftMessage.giftEffect;
        if (giftEffect != null && (map = giftEffect.eventTrackingParams) != null) {
            c1135280feI.LJIIZILJ.putAll(map);
        }
        return c1135280feI;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.livesdk.model.message.GiftMessage LIZLLL(long r9, com.bytedance.android.livesdk.gift.model.SendGiftResult r11, com.bytedance.android.live.base.model.user.User r12, com.bytedance.android.live.base.model.user.User r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135260feG.LIZLLL(long, com.bytedance.android.livesdk.gift.model.SendGiftResult, com.bytedance.android.live.base.model.user.User, com.bytedance.android.live.base.model.user.User, java.lang.String):com.bytedance.android.livesdk.model.message.GiftMessage");
    }
}
