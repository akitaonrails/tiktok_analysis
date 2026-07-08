package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.DistributionStrategy;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftResource;
import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueMessageModel;
import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueUserModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135860ffE {
    public static final /* synthetic */ int LIZ = 0;

    public static GiftQueueMessageModel LIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        GiftQueueMessageModel giftQueueMessageModel = new GiftQueueMessageModel();
        giftQueueMessageModel.LJJIJL(interfaceC1136020ffU.LJFF());
        giftQueueMessageModel.LJJJIL(interfaceC1136020ffU.getMessageId());
        giftQueueMessageModel.LJJJ(interfaceC1136020ffU.getLogId());
        giftQueueMessageModel.LJJIZ(interfaceC1136020ffU.LJ());
        giftQueueMessageModel.LJJJJ(interfaceC1136020ffU.LJIJJ());
        giftQueueMessageModel.LJJJJL(interfaceC1136020ffU.LIZIZ());
        giftQueueMessageModel.LJJJJZI(interfaceC1136020ffU.LJIIJJI());
        giftQueueMessageModel.LJJJJJ(interfaceC1136020ffU.getOrderId());
        giftQueueMessageModel.LJJJJJL(interfaceC1136020ffU.LJIIIZ());
        giftQueueMessageModel.LJJIJIL(interfaceC1136020ffU.getGroupId());
        giftQueueMessageModel.LJII(interfaceC1136020ffU.getRepeatCount());
        giftQueueMessageModel.LJJJJIZL(interfaceC1136020ffU.LJIILJJIL());
        giftQueueMessageModel.LJJIIZ(interfaceC1136020ffU.LJIILL());
        giftQueueMessageModel.LJJJJLL(interfaceC1136020ffU.LIZJ());
        giftQueueMessageModel.LJJIJIIJI(interfaceC1136020ffU.getGiftId());
        giftQueueMessageModel.LJJIIZI(interfaceC1136020ffU.LJIIIIZZ());
        giftQueueMessageModel.LJJIJ(interfaceC1136020ffU.LJIJ());
        giftQueueMessageModel.LIZLLL(interfaceC1136020ffU.LJJII());
        giftQueueMessageModel.LJJIJLIJ(interfaceC1136020ffU.LJJIII());
        giftQueueMessageModel.LJIILIIL(interfaceC1136020ffU.LJIJI());
        giftQueueMessageModel.LJJJJZ(interfaceC1136020ffU.LJJ());
        giftQueueMessageModel.LJJJI(interfaceC1136020ffU.LJIIZILJ());
        giftQueueMessageModel.LJJIIJZLJL(interfaceC1136020ffU.LJIIJ());
        giftQueueMessageModel.LJJIL(interfaceC1136020ffU.LJIILLIIL());
        giftQueueMessageModel.LJJJJLI(interfaceC1136020ffU.LJJIIJ());
        giftQueueMessageModel.LIZ(interfaceC1136020ffU.LJIJJLI());
        giftQueueMessageModel.LJI(interfaceC1136020ffU.getFanTicketCount());
        giftQueueMessageModel.LJJJJI(interfaceC1136020ffU.LJIL());
        giftQueueMessageModel.LJJIJIIJIL(interfaceC1136020ffU.LJIIL());
        giftQueueMessageModel.LJJIFFI().LIZ.LJ(interfaceC1136020ffU);
        giftQueueMessageModel.LJJIFFI().LIZ(interfaceC1136020ffU.getRepeatCount(), interfaceC1136020ffU.getGiftId());
        C1136240ffq c1136240ffqLJJIFFI = giftQueueMessageModel.LJJIFFI();
        C1136240ffq c1136240ffqLJJIFFI2 = interfaceC1136020ffU.LJJIFFI();
        c1136240ffqLJJIFFI.LIZIZ = C158B.LIZ();
        c1136240ffqLJJIFFI.LIZJ = System.currentTimeMillis();
        c1136240ffqLJJIFFI.LIZLLL = c1136240ffqLJJIFFI2.LIZLLL;
        c1136240ffqLJJIFFI.LJ = c1136240ffqLJJIFFI2.LJ;
        c1136240ffqLJJIFFI.LJFF = c1136240ffqLJJIFFI2.LJFF;
        c1136240ffqLJJIFFI.LJI = c1136240ffqLJJIFFI2.LJI;
        c1136240ffqLJJIFFI.LJII = c1136240ffqLJJIFFI2.LJII;
        c1136240ffqLJJIFFI.LJIIIIZZ = c1136240ffqLJJIFFI2.LJIIIIZZ;
        c1136240ffqLJJIFFI.LJIIIZ = c1136240ffqLJJIFFI2.LJIIIZ;
        c1136240ffqLJJIFFI.LJIIJ = c1136240ffqLJJIFFI2.LJIIJ;
        C1135880ffG c1135880ffGLJJI = giftQueueMessageModel.LJJI();
        C1135880ffG c1135880ffGLJJI2 = interfaceC1136020ffU.LJJI();
        c1135880ffGLJJI.LIZIZ = c1135880ffGLJJI2.LIZIZ;
        c1135880ffGLJJI.LIZJ = c1135880ffGLJJI2.LIZJ;
        c1135880ffGLJJI.LJI = c1135880ffGLJJI2.LIZ();
        c1135880ffGLJJI.LJII = c1135880ffGLJJI2.LJII;
        c1135880ffGLJJI.LJIIIIZZ.addAll(c1135880ffGLJJI2.LJIIIIZZ);
        c1135880ffGLJJI.LJIIIZ = c1135880ffGLJJI2.LJIIIZ;
        c1135880ffGLJJI.LJIIJ = c1135880ffGLJJI2.LJIIJ;
        c1135880ffGLJJI.LJIIJJI = c1135880ffGLJJI2.LJIIJJI;
        c1135880ffGLJJI.LJIIL = c1135880ffGLJJI2.LJIIL;
        c1135880ffGLJJI.LJIILIIL = c1135880ffGLJJI2.LJIILIIL;
        c1135880ffGLJJI.LJIILJJIL = c1135880ffGLJJI2.LJIILJJIL;
        c1135880ffGLJJI.LJIILL = c1135880ffGLJJI2.LJIILL;
        c1135880ffGLJJI.LJIILLIIL = c1135880ffGLJJI2.LJIILLIIL;
        c1135880ffGLJJI.LJIIZILJ = c1135880ffGLJJI2.LJIIZILJ;
        ConcurrentHashMap<String, String> concurrentHashMap = c1135880ffGLJJI2.LJIJ;
        if (concurrentHashMap != null && (!concurrentHashMap.isEmpty())) {
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.putAll(concurrentHashMap);
            c1135880ffGLJJI.LJIJ = concurrentHashMap2;
        }
        c1135880ffGLJJI.LJIJI = c1135880ffGLJJI2.LJIJI;
        c1135880ffGLJJI.LJIJJ = c1135880ffGLJJI2.LJIJJ;
        giftQueueMessageModel.LJJI().LJ(giftQueueMessageModel);
        return giftQueueMessageModel;
    }

    public static User LJ(InterfaceC1136800fgk interfaceC1136800fgk) {
        if (interfaceC1136800fgk == null) {
            return null;
        }
        User user = new User();
        user.setId(interfaceC1136800fgk.getId());
        user.setSecUid(interfaceC1136800fgk.getSecUid());
        user.setDisplayId(interfaceC1136800fgk.LJFF());
        user.setNickName(interfaceC1136800fgk.LJFF());
        user.setAvatarThumb(interfaceC1136800fgk.getAvatarThumb());
        user.setBorder(interfaceC1136800fgk.LIZLLL());
        user.enigmaInfo = interfaceC1136800fgk.LIZIZ();
        return user;
    }

    public static List LJFF(List list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AssetsModel assetsModel = (AssetsModel) it2.next();
                C1138630fjh c1138630fjh = C1138630fjh.LIZ;
                AssetsModel assetsModelLJFF = C1138630fjh.LJFF(assetsModel.id);
                if (assetsModelLJFF != null) {
                    arrayList.add(assetsModelLJFF);
                } else {
                    arrayList.add(assetsModel);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static boolean LJII(InterfaceC1136020ffU interfaceC1136020ffU) {
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        if (interfaceC1136020ffU != null) {
            List<GiftMessage.SponsorshipInfo> listLJIJI = interfaceC1136020ffU.LJIJI();
            if ((listLJIJI != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(listLJIJI)) != null && sponsorshipInfo.giftGalleryClickSponsor) || interfaceC1136020ffU.LJIILJJIL()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdk.gift.receiving.model.GiftQueueMessageModel LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage r12, X.C1136200ffm r13) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135860ffE.LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage, X.0ffm):com.bytedance.android.livesdk.gift.receiving.model.GiftQueueMessageModel");
    }

    public static InterfaceC1136800fgk LIZLLL(User user, C1136200ffm c1136200ffm) {
        InterfaceC1136800fgk interfaceC1136800fgkLIZIZ;
        if (user == null) {
            return null;
        }
        if (c1136200ffm != null && (interfaceC1136800fgkLIZIZ = c1136200ffm.LIZIZ(user.getId())) != null) {
            if (!LJI(interfaceC1136800fgkLIZIZ.getAvatarThumb(), user.getAvatarThumb())) {
                interfaceC1136800fgkLIZIZ.LIZJ(user.getAvatarThumb());
            }
            User.EnigmaInfo enigmaInfoLIZIZ = interfaceC1136800fgkLIZIZ.LIZIZ();
            User.EnigmaInfo enigmaInfo = user.enigmaInfo;
            if (enigmaInfoLIZIZ != null ? enigmaInfo == null || enigmaInfoLIZIZ.isEnigmaMaskOn != enigmaInfo.isEnigmaMaskOn : enigmaInfo != null) {
                interfaceC1136800fgkLIZIZ.LJ(enigmaInfo);
            }
            if (!Intrinsics.LJFF(interfaceC1136800fgkLIZIZ.LIZLLL(), user.getBorder())) {
                interfaceC1136800fgkLIZIZ.LIZ(user.getBorder());
            }
            return interfaceC1136800fgkLIZIZ;
        }
        GiftQueueUserModel giftQueueUserModel = new GiftQueueUserModel();
        giftQueueUserModel.LJI(user.getId());
        giftQueueUserModel.LJII(user.getSecUid());
        giftQueueUserModel.LJIIIIZZ(C0KVU.LIZIZ(user.getDisplayId(), user.getNickName()));
        giftQueueUserModel.LIZJ(user.getAvatarThumb());
        giftQueueUserModel.LIZ(user.getBorder());
        giftQueueUserModel.LJ(user.enigmaInfo);
        if (c1136200ffm != null) {
            c1136200ffm.LIZLLL(giftQueueUserModel);
        }
        return giftQueueUserModel;
    }

    public static boolean LJI(ImageModel imageModel, ImageModel imageModel2) {
        List urls;
        if (imageModel == null && imageModel2 == null) {
            return true;
        }
        if (imageModel != null && imageModel2 != null && Intrinsics.LJFF(imageModel.getUri(), imageModel2.getUri()) && (urls = imageModel.getUrls()) != null && urls.containsAll(imageModel2.getUrls())) {
            return true;
        }
        return false;
    }

    public static C1135810ff9 LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU, long j, Room room, boolean z) {
        boolean z2;
        Gift gift;
        int i;
        int i2;
        int i3;
        String strLJFF;
        String strLJ;
        List<GiftColorInfo> listLJII;
        Gift.ColorPickerInfo colorPickerInfoLJIIIZ;
        Long lValueOf;
        String strLIZLLL;
        String strLJJIIJ;
        String strLJIJJ;
        Long lValueOf2;
        ImageModel imageModel = null;
        if (interfaceC1136020ffU == null) {
            return null;
        }
        if (j == UserService.getInstance().user().getCurrentUserId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.isHistoryMessage = interfaceC1136020ffU.LJFF();
        CommonMessageData commonMessageData = new CommonMessageData();
        giftMessage.baseMessage = commonMessageData;
        commonMessageData.messageId = interfaceC1136020ffU.getMessageId();
        giftMessage.baseMessage.createTime = interfaceC1136020ffU.LJJIFFI().LIZIZ;
        giftMessage.mLogId = interfaceC1136020ffU.getLogId();
        giftMessage.LLILLL = interfaceC1136020ffU.LJ();
        giftMessage.LLILZ = interfaceC1136020ffU.LJIJJ();
        giftMessage.LLILZIL = interfaceC1136020ffU.LIZIZ();
        giftMessage.LLILLJJLI = interfaceC1136020ffU.LJIIJJI();
        giftMessage.orderId = interfaceC1136020ffU.getOrderId();
        giftMessage.repeatEnd = interfaceC1136020ffU.LJIIIZ();
        giftMessage.groupId = interfaceC1136020ffU.getGroupId();
        giftMessage.repeatCount = interfaceC1136020ffU.getRepeatCount();
        giftMessage.comboCount = interfaceC1136020ffU.getRepeatCount();
        giftMessage.multiGenerateMessage = interfaceC1136020ffU.LJIILJJIL();
        giftMessage.giftId = interfaceC1136020ffU.getGiftId();
        giftMessage.fromUser = LJ(interfaceC1136020ffU.LJIILL());
        giftMessage.toUser = LJ(interfaceC1136020ffU.LIZJ());
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
        InterfaceC1136850fgp interfaceC1136850fgpLJIJ = interfaceC1136020ffU.LJIJ();
        if (interfaceC1136160ffiLJIIIIZZ == null) {
            gift = null;
        } else {
            gift = new Gift();
            gift.id = interfaceC1136160ffiLJIIIIZZ.getId();
            gift.image = interfaceC1136160ffiLJIIIIZZ.getImage();
            gift.describe = interfaceC1136160ffiLJIIIIZZ.LJ();
            gift.type = interfaceC1136160ffiLJIIIIZZ.getType();
            gift.diamondCount = interfaceC1136160ffiLJIIIIZZ.getDiamondCount();
            gift.name = interfaceC1136160ffiLJIIIIZZ.getName();
            gift.isRandomGift = interfaceC1136160ffiLJIIIIZZ.LJIIL();
            gift.giftSubType = interfaceC1136160ffiLJIIIIZZ.LIZJ();
            gift.giftVerticalScenarios = interfaceC1136160ffiLJIIIIZZ.LJFF();
            gift.schemeInfo = interfaceC1136160ffiLJIIIIZZ.LIZIZ();
            gift.duration = interfaceC1136160ffiLJIIIIZZ.getDuration();
            gift.colorInfos = interfaceC1136160ffiLJIIIIZZ.LJII();
            gift.colorPickerInfo = interfaceC1136160ffiLJIIIIZZ.LJIIIZ();
            gift.randomEffectInfo = interfaceC1136160ffiLJIIIIZZ.LJIIJJI();
            gift.primaryEffectId = interfaceC1136160ffiLJIIIIZZ.LIZ();
            gift.crossScreenEffectInfo = interfaceC1136160ffiLJIIIIZZ.LJIIJ();
            Map<String, GiftResource> mapLIZLLL = interfaceC1136160ffiLJIIIIZZ.LIZLLL();
            if (mapLIZLLL == null) {
                mapLIZLLL = new LinkedHashMap<>();
            }
            gift.giftResources = mapLIZLLL;
            gift.lynxCrossScreenEffectInfo = interfaceC1136160ffiLJIIIIZZ.LJIIIIZZ();
            if (interfaceC1136850fgpLJIJ != null) {
                gift.image = interfaceC1136850fgpLJIJ.getImage();
                gift.type = interfaceC1136850fgpLJIJ.getType();
                gift.diamondCount = interfaceC1136850fgpLJIJ.getDiamondCount();
                gift.name = interfaceC1136850fgpLJIJ.getName();
                gift.giftSubType = interfaceC1136850fgpLJIJ.LIZJ();
                gift.schemeInfo = interfaceC1136850fgpLJIJ.LIZIZ();
                gift.duration = interfaceC1136850fgpLJIJ.getDuration();
                gift.primaryEffectId = interfaceC1136850fgpLJIJ.LIZ();
            }
        }
        giftMessage.mGift = gift;
        InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII != null) {
            AssetsModel assetsModelLJJ = interfaceC1136230ffpLJJII.LJJ();
            giftMessage.asset = assetsModelLJJ;
            if (assetsModelLJJ != null) {
                List<DistributionStrategy> listLJIJJ = interfaceC1136230ffpLJJII.LJIJJ();
                if (listLJIJJ == null) {
                    listLJIJJ = new ArrayList<>();
                }
                assetsModelLJJ.distributionStrategy = listLJIJJ;
            }
            if (C500260Jjc.LJJIJIIJI(interfaceC1136230ffpLJJII.LJIIJ())) {
                AssetBundle assetBundle = new AssetBundle();
                giftMessage.assetBundle = assetBundle;
                List<AssetsModel> listLJIIJ = interfaceC1136230ffpLJJII.LJIIJ();
                if (listLJIIJ == null) {
                    listLJIIJ = new ArrayList<>();
                }
                assetBundle.assets = listLJIIJ;
                AssetBundle assetBundle2 = giftMessage.assetBundle;
                if (assetBundle2 != null) {
                    assetBundle2.prefabBundle = interfaceC1136230ffpLJJII.LJIILIIL();
                }
                AssetBundle assetBundle3 = giftMessage.assetBundle;
                if (assetBundle3 != null) {
                    assetBundle3.streamEffectSpec = interfaceC1136230ffpLJJII.LJIILL();
                }
            }
            giftMessage.isAssetBundleGift = interfaceC1136230ffpLJJII.LJIJJLI();
            giftMessage.colorId = Long.valueOf(interfaceC1136230ffpLJJII.LJIIL());
            giftMessage.lynxExtra = interfaceC1136230ffpLJJII.LJIL();
            giftMessage.flyingMicResources = interfaceC1136230ffpLJJII.LJIILJJIL();
            giftMessage.flyingMicResourcesV2 = interfaceC1136230ffpLJJII.LJJIFFI();
            giftMessage.effectExtra = interfaceC1136230ffpLJJII.LJIJ();
            giftMessage.giftEffect = interfaceC1136230ffpLJJII.LJIJI();
            giftMessage.shinyCardUnlockToken = interfaceC1136230ffpLJJII.LJIILLIIL();
            giftMessage.giftVariantId = interfaceC1136230ffpLJJII.LJIIJJI();
            giftMessage.secondaryEffectInfo = interfaceC1136230ffpLJJII.LJIIZILJ();
        }
        giftMessage.interactiveGiftInfo = interfaceC1136020ffU.LJJIII();
        giftMessage.sponsorshipInfo = interfaceC1136020ffU.LJIJI();
        giftMessage.mTrayInfo = interfaceC1136020ffU.LJJ();
        giftMessage.matchInfo = interfaceC1136020ffU.LJIIZILJ();
        giftMessage.isFirstSendGift = interfaceC1136020ffU.LJIIJ();
        giftMessage.linkmicGiftExpressionStrategy = interfaceC1136020ffU.LJIILLIIL();
        giftMessage.toMemberNickname = interfaceC1136020ffU.LJJIIJ();
        giftMessage.disableGiftTracking = interfaceC1136020ffU.LJIJJLI();
        giftMessage.fanTicketCount = interfaceC1136020ffU.getFanTicketCount();
        giftMessage.LLIZLLLIL = interfaceC1136020ffU.LJIL();
        giftMessage.giftMonitorInfo = interfaceC1136020ffU.LJIIL();
        C1135810ff9 c1135810ff9 = new C1135810ff9(giftMessage);
        c1135810ff9.LIZIZ = interfaceC1136020ffU;
        c1135810ff9.LIZLLL = interfaceC1136020ffU.LJJI().LIZIZ;
        c1135810ff9.LJ = C1133680fbi.LIZ(giftMessage);
        Gift gift2 = giftMessage.mGift;
        if (gift2 != null) {
            i = gift2.diamondCount;
        } else {
            i = 0;
        }
        c1135810ff9.LJFF = i;
        if (gift2 != null) {
            i2 = gift2.type;
        } else {
            i2 = 0;
        }
        c1135810ff9.LJI = i2;
        if (gift2 != null) {
            i3 = gift2.giftSubType;
        } else {
            i3 = 0;
        }
        c1135810ff9.LJII = i3;
        c1135810ff9.LJIIIIZZ = interfaceC1136020ffU.LJJI().LIZJ;
        c1135810ff9.LJIIIZ = interfaceC1136020ffU.LJJI().LIZJ();
        c1135810ff9.LJIIJ = interfaceC1136020ffU.LJJI().LIZ();
        c1135810ff9.LJIIJJI = interfaceC1136020ffU.LJJI().LJII;
        if (z) {
            HashSet<InterfaceC1136020ffU> hashSet = interfaceC1136020ffU.LJJI().LJIIIIZZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hashSet, 10));
            Iterator<InterfaceC1136020ffU> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZIZ(it2.next(), j, room, false));
            }
            c1135810ff9.LJIIL = C13LP.LLIFFJFJJ(C13LP.LJJJJLI(arrayList));
        }
        c1135810ff9.LJIILIIL = interfaceC1136020ffU.LJJIFFI().LJII;
        c1135810ff9.LJIILJJIL = interfaceC1136020ffU.LJJIFFI().LJIIIIZZ;
        c1135810ff9.LJIILL = interfaceC1136020ffU.LJJIFFI().LJIIIZ;
        c1135810ff9.LJIILLIIL = interfaceC1136020ffU.LJJIFFI().LJIIJ;
        c1135810ff9.LJJIFFI.addAll(interfaceC1136020ffU.LJJI().LJ);
        c1135810ff9.LJJII.clear();
        c1135810ff9.LJJII.addAll(interfaceC1136020ffU.LJJI().LIZIZ());
        c1135810ff9.LJJJJZ = interfaceC1136020ffU.getGiftId();
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL = interfaceC1136020ffU.LJIILL();
        String str = "";
        if (interfaceC1136800fgkLJIILL == null || (strLJFF = interfaceC1136800fgkLJIILL.LJFF()) == null) {
            strLJFF = "";
        }
        c1135810ff9.LJJJJL = strLJFF;
        boolean zLJ = interfaceC1136020ffU.LJ();
        c1135810ff9.LJJJLIIL = zLJ;
        c1135810ff9.LJJJJIZL.LIZ = zLJ;
        c1135810ff9.LJJJLL = z2;
        C1135040fdu.LIZ.getClass();
        Gift giftFindGiftById = GiftManager.inst().findGiftById(interfaceC1136020ffU.getGiftId());
        if (giftFindGiftById != null && giftFindGiftById.describe != null) {
            String str2 = giftFindGiftById.describe;
            List<GiftColorInfo> list = giftFindGiftById.colorInfos;
            Gift.ColorPickerInfo colorPickerInfo = giftFindGiftById.colorPickerInfo;
            InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII2 != null) {
                lValueOf2 = Long.valueOf(interfaceC1136230ffpLJJII2.LJIIL());
            } else {
                lValueOf2 = null;
            }
            strLIZLLL = C1135040fdu.LIZLLL(str2, list, colorPickerInfo, lValueOf2);
        } else {
            InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ2 = interfaceC1136020ffU.LJIIIIZZ();
            if (interfaceC1136160ffiLJIIIIZZ2 != null) {
                strLJ = interfaceC1136160ffiLJIIIIZZ2.LJ();
                listLJII = interfaceC1136160ffiLJIIIIZZ2.LJII();
                colorPickerInfoLJIIIZ = interfaceC1136160ffiLJIIIIZZ2.LJIIIZ();
            } else {
                strLJ = null;
                listLJII = null;
                colorPickerInfoLJIIIZ = null;
            }
            InterfaceC1136230ffp interfaceC1136230ffpLJJII3 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII3 != null) {
                lValueOf = Long.valueOf(interfaceC1136230ffpLJJII3.LJIIL());
            } else {
                lValueOf = null;
            }
            strLIZLLL = C1135040fdu.LIZLLL(strLJ, listLJII, colorPickerInfoLJIIIZ, lValueOf);
        }
        boolean zLIZJ = C1135040fdu.LIZJ();
        InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
        long id = 0;
        if (interfaceC1136800fgkLIZJ != null && interfaceC1136800fgkLIZJ.getId() > 0 && (interfaceC1136800fgkLIZJ.getId() != j || zLIZJ)) {
            Object[] objArr = new Object[1];
            String strLJFF2 = interfaceC1136800fgkLIZJ.LJFF();
            if (strLJFF2 != null) {
                str = strLJFF2;
            }
            objArr[0] = str;
            strLIZLLL = C497740JfY.LJIJJ(2131852608, objArr);
        }
        if (C2868019e.LIZIZ(room) && (strLJJIIJ = interfaceC1136020ffU.LJJIIJ()) != null && strLJJIIJ.length() != 0 && (strLJIJJ = C497740JfY.LJIJJ(2131852652, strLJJIIJ)) != null && strLJIJJ.length() != 0) {
            strLIZLLL = strLJIJJ;
        }
        c1135810ff9.LJJJJLL = strLIZLLL;
        c1135810ff9.LJJIII = interfaceC1136020ffU.LJJIFFI().LIZIZ;
        c1135810ff9.LJJIIJ = interfaceC1136020ffU.LJJIFFI().LIZJ;
        c1135810ff9.LJJJJIZL.LJ(interfaceC1136020ffU);
        Gift gift3 = giftMessage.mGift;
        if (gift3 != null) {
            imageModel = gift3.image;
        }
        c1135810ff9.LJJJJLI = imageModel;
        c1135810ff9.LJJJJ.addAll(interfaceC1136020ffU.LJJIFFI().LJIIJJI);
        c1135810ff9.LJJJJI = interfaceC1136020ffU.LJJIFFI().LJFF;
        InterfaceC1136800fgk interfaceC1136800fgkLJIILL2 = interfaceC1136020ffU.LJIILL();
        if (interfaceC1136800fgkLJIILL2 != null) {
            id = interfaceC1136800fgkLJIILL2.getId();
        }
        c1135810ff9.LJJLI = id;
        c1135810ff9.LJJLIIIIJ = C1135870ffF.LJIJI(interfaceC1136020ffU);
        c1135810ff9.LJJLIIIJILLIZJL = interfaceC1136020ffU.getRepeatCount();
        c1135810ff9.LJJLIIIJLLLLLLLZ = interfaceC1136020ffU.LJJI().LJIILL;
        c1135810ff9.LJJLIIJ = interfaceC1136020ffU.LJJI().LJIIZILJ;
        c1135810ff9.LJJLIL = interfaceC1136020ffU.LJJI().LJIJ;
        c1135810ff9.LJJLJ = interfaceC1136020ffU.LJJI().LJIJI;
        c1135810ff9.LJJLL = interfaceC1136020ffU.LJJI().LJIILLIIL;
        c1135810ff9.LJJZ = interfaceC1136020ffU.LJJI().LJIIJJI;
        c1135810ff9.LJJZZI = interfaceC1136020ffU.LJJI().LJIIL;
        c1135810ff9.LJJZZIII = interfaceC1136020ffU.LJJI().LJIILIIL;
        c1135810ff9.LJL = interfaceC1136020ffU.LJJI().LJIILJJIL;
        return c1135810ff9;
    }
}
