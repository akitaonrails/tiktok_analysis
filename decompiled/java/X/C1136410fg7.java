package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS3S0401000_17;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectPrefabSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueMockFailSettings;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS22S0401000_17;
import kotlin.jvm.internal.AwS44S0301000_17;
import kotlin.jvm.internal.AwS4S0501000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136410fg7 extends AbstractC1135610fep {
    public final LinkedList<GiftMessage> LJFF = new LinkedList<>();

    @Override // X.AbstractC1135610fep
    public final String LIZLLL() {
        return "StickerGiftEffectPreDownloader";
    }

    @Override // X.InterfaceC1132200fZK
    public final void LIZ() {
        this.LJFF.clear();
        this.LIZ.removeCallbacksAndMessages(null);
        this.LIZJ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Override // X.AbstractC1135610fep
    public final void LJIIIZ() {
        C1136560fgM c1136560fgMLIZLLL;
        if (this.LIZJ || this.LJFF.isEmpty()) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = this.LJFF.get(0);
        C013C c013c = new C013C();
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        Gift gift = ((GiftMessage) c259800zU.element).mGift;
        EnumC1133020fae giftType = interfaceC1128210fStInst.getGiftType(gift != null ? Integer.valueOf(gift.type) : null);
        InterfaceC1133090fal interfaceC1133090falLIZ = C1132970faZ.LIZ(giftType);
        if (interfaceC1133090falLIZ == null || (c1136560fgMLIZLLL = interfaceC1133090falLIZ.LIZLLL()) == null || c1136560fgMLIZLLL.LJIIL != ((GiftMessage) c259800zU.element).giftId) {
            int iLIZ = C1133680fbi.LIZ((GiftMessage) c259800zU.element);
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            InterfaceC1135600feo interfaceC1135600feo = this.LJ;
            if (interfaceC1135600feo != null) {
                interfaceC1135600feo.LIZ(giftType, new AwS4S0501000_17(c118300cf2, (C118300cf) c259800zU, (C259800zU<GiftMessage>) this, (C1136410fg7) iLIZ, (int) c118300cf, (C118300cf) c013c, (C013C) 1));
            }
        }
        if (c013c.element) {
            C20441214yg.LJIIIZ("StickerGiftEffectPreDownloader", "queue size reach max limit, delay download");
            C786410Ut5.LJLIIL(GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomDownloadLoopCheckDelay(), this.LIZ, new ARunnableS117S0100000_17(this, 7));
            return;
        }
        c259800zU.element = this.LJFF.remove(0);
        this.LIZJ = true;
        InterfaceC1135600feo interfaceC1135600feo2 = this.LJ;
        int iHashCode = interfaceC1135600feo2 != null ? interfaceC1135600feo2.hashCode() : 0;
        GiftMessage giftMessage = (GiftMessage) c259800zU.element;
        if (LJIIIIZZ(iHashCode)) {
            LJIIL(iHashCode, giftMessage);
            return;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() || !LJIIJJI(giftMessage)) {
            LJII(giftMessage);
            return;
        }
        GiftDownloadEffectBeforeMsgEnqueueMockFailSettings giftDownloadEffectBeforeMsgEnqueueMockFailSettings = GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE;
        if (giftDownloadEffectBeforeMsgEnqueueMockFailSettings.mockCreateEffectFail()) {
            LJIILIIL(iHashCode, giftMessage, null, "mock create effect fail");
            return;
        }
        C1136460fgC.LIZ.getClass();
        C1136560fgM c1136560fgMLJFF = C1136390fg5.LJFF(giftMessage, new C1136470fgD(C1136460fgC.LIZJ(giftMessage)));
        if (c1136560fgMLJFF == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create StickerEffectMessage fail ,messageId:");
            sbLIZ.append(giftMessage.getMessageId());
            LJIILIIL(iHashCode, giftMessage, null, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        c1136560fgMLJFF.LJIJ = 1001;
        if (LJIIIIZZ(iHashCode)) {
            LJIIL(iHashCode, giftMessage);
            return;
        }
        c1136560fgMLJFF.LIZJ().LIZLLL();
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1136560fgMLJFF.LJFF);
        if (giftDownloadEffectBeforeMsgEnqueueMockFailSettings.mockAssetModelFail()) {
            c1136560fgMLJFF.LIZJ().LIZIZ(false, null, false, true, false);
            LJIILIIL(iHashCode, giftMessage, c1136560fgMLJFF, "mock sync asset model fail");
            return;
        }
        ARunnableS3S0401000_17 aRunnableS3S0401000_17 = new ARunnableS3S0401000_17(iHashCode, assetsModelLIZLLL, this, giftMessage, c1136560fgMLJFF, 0);
        Set setLJ = C1136430fg9.LJ(giftMessage, c1136560fgMLJFF);
        if (setLJ.isEmpty()) {
            aRunnableS3S0401000_17.run();
        } else {
            C1136430fg9.LJFF(setLJ, new AwS561S0100000_17(aRunnableS3S0401000_17, 24), new AwS22S0401000_17(iHashCode, assetsModelLIZLLL, this, giftMessage, c1136560fgMLJFF, 0));
        }
    }

    public static boolean LJIIJJI(GiftMessage giftMessage) {
        Integer numValueOf;
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        Gift gift = giftMessage.mGift;
        if (gift != null) {
            numValueOf = Integer.valueOf(gift.type);
        } else {
            numValueOf = null;
        }
        if (C1133210fax.LIZIZ(giftMessage, interfaceC1128210fStInst.getGiftType(numValueOf)) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1132200fZK
    public final boolean LIZIZ(GiftMessage giftMessage) {
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        Gift gift = giftMessage.mGift;
        c1133690fbj.getClass();
        if (!C1133690fbj.LJII(gift)) {
            return false;
        }
        C1136380fg4.LIZ.getClass();
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo = giftMessage.interactiveGiftInfo;
        if ((interactiveGiftInfo != null && interactiveGiftInfo.crossScreenRole == 2) || !LJIIJJI(giftMessage)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r9.crossScreenRole != 0) goto L46;
     */
    @Override // X.AbstractC1135610fep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage r13) {
        /*
            r12 = this;
            java.util.LinkedList<com.bytedance.android.livesdk.model.message.GiftMessage> r5 = r12.LJFF
            if (r5 == 0) goto La0
            if (r13 == 0) goto La0
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting.INSTANCE
            boolean r0 = r0.shouldInsertByPriority()
            r1 = 0
            if (r0 == 0) goto L95
            X.0fg4 r0 = X.C1136380fg4.LIZ
            r0.getClass()
            java.util.Iterator r11 = r5.iterator()
            r10 = 0
        L19:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r6 = r11.next()
            com.bytedance.android.livesdk.model.message.GiftMessage r6 = (com.bytedance.android.livesdk.model.message.GiftMessage) r6
            com.bytedance.android.livesdk.model.Gift r0 = r13.mGift
            if (r0 == 0) goto L4c
            int r4 = r0.diamondCount
        L2b:
            com.bytedance.android.livesdk.model.Gift r0 = r6.mGift
            if (r0 == 0) goto L4a
            int r3 = r0.diamondCount
        L31:
            com.bytedance.android.livesdk.model.message.GiftMessage$InteractiveGiftInfo r9 = r6.interactiveGiftInfo
            r7 = 0
            if (r9 == 0) goto L58
            long r0 = r9.crossScreenRole
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L50
            com.bytedance.android.livesdk.model.message.GiftMessage$InteractiveGiftInfo r0 = r13.interactiveGiftInfo
            if (r0 == 0) goto L50
            long r0 = r0.crossScreenRole
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L50
        L47:
            int r10 = r10 + 1
            goto L19
        L4a:
            r3 = 0
            goto L31
        L4c:
            r4 = 0
            goto L2b
        L4e:
            r10 = -1
            goto L70
        L50:
            if (r9 == 0) goto L58
            long r0 = r9.crossScreenRole
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L8a
        L58:
            com.bytedance.android.livesdk.model.message.GiftMessage$InteractiveGiftInfo r0 = r13.interactiveGiftInfo
            if (r0 == 0) goto L62
            long r1 = r0.crossScreenRole
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L8a
        L62:
            if (r4 != r3) goto L87
            long r3 = X.C1135270feH.LIZJ(r13)
            long r1 = X.C1135270feH.LIZJ(r6)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L47
        L70:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            int r0 = r1.intValue()
            if (r0 < 0) goto L82
            int r0 = r1.intValue()
        L7e:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r5, r0, r13)
            return
        L82:
            int r0 = r5.size()
            goto L7e
        L87:
            if (r4 <= r3) goto L47
            goto L70
        L8a:
            com.bytedance.android.livesdk.model.message.GiftMessage$InteractiveGiftInfo r0 = r13.interactiveGiftInfo
            if (r0 == 0) goto L47
            long r1 = r0.crossScreenRole
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L47
            goto L70
        L95:
            boolean r0 = r13.LLILLJJLI
            if (r0 == 0) goto L9d
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r5, r1, r13)
            return
        L9d:
            r5.add(r13)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136410fg7.LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage):void");
    }

    @Override // X.AbstractC1135610fep
    public final void LJ(DataChannel dataChannel, C1135580fem c1135580fem) {
        super.LJ(dataChannel, c1135580fem);
        this.LJFF.clear();
    }

    public final void LJIIL(int i, GiftMessage giftMessage) {
        if (LJFF(i)) {
            C20441214yg.LJFF("StickerGiftEffectPreDownloader", "drop msg due to invalid room", null);
        } else {
            C20441214yg.LJIIIZ("StickerGiftEffectPreDownloader", "drop msg due to clear screen mode");
        }
        InterfaceC1135600feo interfaceC1135600feo = this.LJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LJ(giftMessage);
        }
        this.LIZJ = false;
        LJIIIZ();
    }

    public final void LJIIJ(int i, GiftMessage giftMessage, C1136560fgM c1136560fgM) {
        AssetBundle.PrefabBundle prefabBundle;
        List<Long> list;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        List<Long> list2;
        if (LJIIIIZZ(i)) {
            LJIIL(i, giftMessage);
            return;
        }
        c1136560fgM.LIZJ().LJIILJJIL();
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockDownloadAlgorithmFail()) {
            c1136560fgM.LIZJ().LJ(false, false, false);
            LJIILIIL(i, giftMessage, c1136560fgM, "mock download algorithm fail");
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(c1136560fgM.LJFF));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            GiftEffect giftEffect = giftMessage.giftEffect;
            if (giftEffect != null && (giftEffectSpecs = giftEffect.specs) != null && (giftEffectPrefabSpec = giftEffectSpecs.prefab) != null && (list2 = giftEffectPrefabSpec.prefabAssetIds) != null) {
                Iterator<Long> it2 = list2.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.put(Long.valueOf(it2.next().longValue()), null);
                }
            }
        } else {
            AssetBundle assetBundle = giftMessage.assetBundle;
            if (assetBundle != null && (prefabBundle = assetBundle.prefabBundle) != null && (list = prefabBundle.prefabEffectIds) != null) {
                Iterator<Long> it3 = list.iterator();
                while (it3.hasNext()) {
                    linkedHashMap.put(Long.valueOf(it3.next().longValue()), 2);
                }
            }
        }
        C1136430fg9.LIZJ(linkedHashSet, linkedHashMap, new AwS44S0301000_17(i, this, giftMessage, c1136560fgM, 0), new AwS44S0301000_17(i, this, giftMessage, c1136560fgM, 1));
    }

    public final void LJIILIIL(int i, GiftMessage giftMessage, C1136560fgM c1136560fgM, String str) {
        if (LJIIIIZZ(i)) {
            LJIIL(i, giftMessage);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepareFail, giftId:");
        sbLIZ.append(giftMessage.giftId);
        sbLIZ.append(", messageId:");
        sbLIZ.append(giftMessage.getMessageId());
        sbLIZ.append(", failMsg:");
        sbLIZ.append(str);
        C20441214yg.LJFF("StickerGiftEffectPreDownloader", C2188811AlT.LIZIZ(sbLIZ), null);
        if (c1136560fgM != null) {
            c1136560fgM.LJIJ = 1003;
            c1136560fgM.LJIJI = str;
        }
        InterfaceC1135600feo interfaceC1135600feo = this.LJ;
        if (interfaceC1135600feo != null) {
            interfaceC1135600feo.LIZJ(giftMessage, c1136560fgM, null);
        }
        this.LIZJ = false;
        LJIIIZ();
    }
}
