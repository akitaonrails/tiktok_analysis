package X;

import Y.ARunnableS3S0401000_17;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectPrefabSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueMockFailSettings;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS212S0300000_3;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS22S0401000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS44S0301000_17;
import kotlin.jvm.internal.AwS4S0501000_17;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136400fg6 extends AbstractC1135650fet {
    public final LinkedList<InterfaceC1136020ffU> LJII = new LinkedList<>();

    @Override // X.AbstractC1135650fet
    public final String LIZLLL() {
        return "StickerGiftEffectPreDownloader";
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Override // X.AbstractC1135650fet
    public final void LJIIJJI() {
        C1136560fgM c1136560fgMLIZLLL;
        if (this.LIZLLL || this.LJII.isEmpty()) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        ?? r2 = this.LJII.get(0);
        c259800zU.element = r2;
        InterfaceC1136020ffU interfaceC1136020ffU = (InterfaceC1136020ffU) r2;
        C1136460fgC.LIZ.getClass();
        C1136560fgM c1136560fgMLJ = C1136390fg5.LJ(interfaceC1136020ffU, new C1136470fgD(C1136460fgC.LIZIZ(interfaceC1136020ffU)));
        if (c1136560fgMLJ != null && LJIILJJIL((InterfaceC1136020ffU) c259800zU.element, c1136560fgMLJ)) {
            C1133910fc5.LJ("StickerGiftEffectPreDownloader", "resource already downloaded, dequeue directly and skip hot room check");
            this.LJII.remove(0);
            LJIIZILJ(LJ(), (InterfaceC1136020ffU) c259800zU.element, c1136560fgMLJ, "dequeue_skip_download");
            return;
        }
        C013C c013c = new C013C();
        EnumC1133020fae giftType = GiftManager.inst().getGiftType(Integer.valueOf(C1135870ffF.LJII((InterfaceC1136020ffU) c259800zU.element)));
        InterfaceC1133090fal interfaceC1133090falLIZ = C1132970faZ.LIZ(giftType);
        if (interfaceC1133090falLIZ == null || (c1136560fgMLIZLLL = interfaceC1133090falLIZ.LIZLLL()) == null || c1136560fgMLIZLLL.LJIIL != ((InterfaceC1136020ffU) c259800zU.element).getGiftId()) {
            int iLIZIZ = C1135870ffF.LIZIZ((InterfaceC1136020ffU) c259800zU.element);
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
            if (interfaceC1135620feq != null) {
                interfaceC1135620feq.LIZ(giftType, new AwS4S0501000_17(c118300cf2, (C118300cf) c259800zU, (C259800zU<InterfaceC1136020ffU>) this, (C1136400fg6) iLIZIZ, (int) c118300cf, (C118300cf) c013c, (C013C) 3));
            }
        }
        if (c013c.element) {
            C1133910fc5.LIZIZ("StickerGiftEffectPreDownloader", "queue size reach max limit, delay download");
            this.LIZ.removeCallbacks(this.LJI);
            C786410Ut5.LJLIIL(GiftDownloadEffectBeforeMsgEnqueueSettings.INSTANCE.getHotRoomDownloadLoopCheckDelay(), this.LIZ, this.LJI);
            return;
        }
        c259800zU.element = this.LJII.remove(0);
        this.LIZLLL = true;
        int iLJ = LJ();
        InterfaceC1136020ffU interfaceC1136020ffU2 = (InterfaceC1136020ffU) c259800zU.element;
        if (LJIIIZ(iLJ)) {
            LJIILL(iLJ, interfaceC1136020ffU2);
            return;
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() || !LJIILIIL(interfaceC1136020ffU2)) {
            LJIIIIZZ(new AwS418S0200000_17(this, interfaceC1136020ffU2, 111));
            return;
        }
        GiftDownloadEffectBeforeMsgEnqueueMockFailSettings giftDownloadEffectBeforeMsgEnqueueMockFailSettings = GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE;
        if (giftDownloadEffectBeforeMsgEnqueueMockFailSettings.mockCreateEffectFail()) {
            LJIILLIIL(iLJ, interfaceC1136020ffU2, null, "mock create effect fail");
            return;
        }
        if (c1136560fgMLJ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create StickerEffectMessage fail ,messageId:");
            sbLIZ.append(interfaceC1136020ffU2.getMessageId());
            LJIILLIIL(iLJ, interfaceC1136020ffU2, null, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        c1136560fgMLJ.LJIJ = 1001;
        if (LJIIIZ(iLJ)) {
            LJIILL(iLJ, interfaceC1136020ffU2);
            return;
        }
        c1136560fgMLJ.LIZJ().LIZLLL();
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(c1136560fgMLJ.LJFF);
        if (giftDownloadEffectBeforeMsgEnqueueMockFailSettings.mockAssetModelFail()) {
            c1136560fgMLJ.LIZJ().LIZIZ(false, null, false, true, false);
            LJIILLIIL(iLJ, interfaceC1136020ffU2, c1136560fgMLJ, "mock sync asset model fail");
            return;
        }
        ARunnableS3S0401000_17 aRunnableS3S0401000_17 = new ARunnableS3S0401000_17(iLJ, assetsModelLIZLLL, this, interfaceC1136020ffU2, c1136560fgMLJ, 1);
        Set setLIZJ = C1136050ffX.LIZJ(interfaceC1136020ffU2, c1136560fgMLJ);
        if (setLIZJ.isEmpty()) {
            aRunnableS3S0401000_17.run();
        } else {
            C1136050ffX.LIZLLL(setLIZJ, new AwS561S0100000_17(aRunnableS3S0401000_17, 609), new AwS22S0401000_17(iLJ, assetsModelLIZLLL, this, interfaceC1136020ffU2, c1136560fgMLJ, 2));
        }
    }

    @Override // X.InterfaceC1135330feN
    public final void LIZ() {
        this.LJII.clear();
        this.LIZ.removeCallbacksAndMessages(null);
        this.LIZLLL = false;
    }

    public static boolean LJIILIIL(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (C1133210fax.LIZ(interfaceC1136020ffU, GiftManager.inst().getGiftType(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU)))) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1135330feN
    public final boolean LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (!C1135870ffF.LJIILJJIL(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU)))) {
            return false;
        }
        C1136380fg4.LIZ.getClass();
        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII();
        if ((interactiveGiftInfoLJJIII != null && interactiveGiftInfoLJJIII.crossScreenRole == 2) || !LJIILIIL(interfaceC1136020ffU)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1135650fet
    public final void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        int size;
        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII;
        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII2;
        C1136460fgC.LIZ.getClass();
        C1136560fgM c1136560fgMLJ = C1136390fg5.LJ(interfaceC1136020ffU, new C1136470fgD(C1136460fgC.LIZIZ(interfaceC1136020ffU)));
        if (c1136560fgMLJ != null && LJIILJJIL(interfaceC1136020ffU, c1136560fgMLJ)) {
            C1133910fc5.LJ("StickerGiftEffectPreDownloader", "sticker resource already downloaded, dispatch directly and skip hot room check");
            c1136560fgMLJ.LJIJ = 1002;
            c1136560fgMLJ.LJIJI = "";
            InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
            if (interfaceC1135620feq != null) {
                interfaceC1135620feq.LIZJ(interfaceC1136020ffU, c1136560fgMLJ, null);
                return;
            }
            return;
        }
        LinkedList<InterfaceC1136020ffU> linkedList = this.LJII;
        if (linkedList == null) {
            return;
        }
        if (LiveGiftCrossScreenSetting.INSTANCE.shouldInsertByPriority()) {
            C1136380fg4.LIZ.getClass();
            Iterator<InterfaceC1136020ffU> it2 = linkedList.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC1136020ffU next = it2.next();
                    int iLIZJ = C1135870ffF.LIZJ(interfaceC1136020ffU);
                    int iLIZJ2 = C1135870ffF.LIZJ(next);
                    GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII3 = next.LJJIII();
                    if (interactiveGiftInfoLJJIII3 == null || interactiveGiftInfoLJJIII3.crossScreenRole == 0 || (interactiveGiftInfoLJJIII2 = interfaceC1136020ffU.LJJIII()) == null || interactiveGiftInfoLJJIII2.crossScreenRole == 0) {
                        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII4 = next.LJJIII();
                        if ((interactiveGiftInfoLJJIII4 == null || interactiveGiftInfoLJJIII4.crossScreenRole == 0) && ((interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII()) == null || interactiveGiftInfoLJJIII.crossScreenRole == 0)) {
                            if (iLIZJ == iLIZJ2) {
                                if (C1135270feH.LIZIZ(interfaceC1136020ffU) == C1135270feH.LIZIZ(next)) {
                                    break;
                                }
                            } else if (iLIZJ > iLIZJ2) {
                                break;
                            }
                        } else {
                            GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII5 = interfaceC1136020ffU.LJJIII();
                            if (interactiveGiftInfoLJJIII5 != null && interactiveGiftInfoLJJIII5.crossScreenRole != 0) {
                                break;
                            }
                        }
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0) {
                size = numValueOf.intValue();
            } else {
                size = linkedList.size();
            }
            ListProtector.add(linkedList, size, interfaceC1136020ffU);
            return;
        }
        if (interfaceC1136020ffU.LJIIJJI()) {
            ListProtector.add(linkedList, 0, interfaceC1136020ffU);
        } else {
            linkedList.add(interfaceC1136020ffU);
        }
    }

    public static boolean LJIILJJIL(InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM) {
        if (!C1136050ffX.LIZJ(interfaceC1136020ffU, c1136560fgM).isEmpty()) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Long.valueOf(c1136560fgM.LJFF), null);
        Iterator<Long> it2 = c1136560fgM.LIZLLL().iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), 2);
        }
        if (linkedHashMap.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!C1138640fji.LJII((Integer) entry.getValue(), (Long) entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC1135650fet
    public final void LJFF(DataChannel dataChannel, C1135590fen c1135590fen) {
        super.LJFF(dataChannel, c1135590fen);
        this.LJII.clear();
    }

    public final void LJIILL(int i, InterfaceC1136020ffU interfaceC1136020ffU) {
        if (LJI(i)) {
            AbstractC1135650fet.LJII(this, "drop msg due to invalid room");
        } else {
            C1133910fc5.LIZIZ("StickerGiftEffectPreDownloader", "drop msg due to clear screen mode");
        }
        InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZLLL(interfaceC1136020ffU);
        }
        this.LIZLLL = false;
        LJIIJ();
    }

    public final void LJIIL(int i, InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM) {
        AssetBundle.PrefabBundle prefabBundleLJIILIIL;
        List<Long> list;
        Object c098200Yq;
        GiftEffect giftEffectLJIJI;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        List<Long> list2;
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        c1136560fgM.LIZJ().LJIILJJIL();
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockDownloadAlgorithmFail()) {
            c1136560fgM.LIZJ().LJ(false, false, false);
            LJIILLIIL(i, interfaceC1136020ffU, c1136560fgM, "mock download algorithm fail");
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(c1136560fgM.LJFF));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII != null && (giftEffectLJIJI = interfaceC1136230ffpLJJII.LJIJI()) != null && (giftEffectSpecs = giftEffectLJIJI.specs) != null && (giftEffectPrefabSpec = giftEffectSpecs.prefab) != null && (list2 = giftEffectPrefabSpec.prefabAssetIds) != null) {
                Iterator<Long> it2 = list2.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.put(Long.valueOf(it2.next().longValue()), null);
                }
            }
        } else {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII2 != null && (prefabBundleLJIILIIL = interfaceC1136230ffpLJJII2.LJIILIIL()) != null && (list = prefabBundleLJIILIIL.prefabEffectIds) != null) {
                Iterator<Long> it3 = list.iterator();
                while (it3.hasNext()) {
                    linkedHashMap.put(Long.valueOf(it3.next().longValue()), 2);
                }
            }
        }
        AwS44S0301000_17 awS44S0301000_17 = new AwS44S0301000_17(i, this, interfaceC1136020ffU, c1136560fgM, 3);
        AwS44S0301000_17 awS44S0301000_172 = new AwS44S0301000_17(i, this, interfaceC1136020ffU, c1136560fgM, 4);
        if (linkedHashSet.isEmpty() && linkedHashMap.isEmpty()) {
            awS44S0301000_17.invoke(Boolean.FALSE);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            linkedHashMap2.put(Long.valueOf(((Number) it4.next()).longValue()), null);
        }
        linkedHashMap2.putAll(linkedHashMap);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            final long jLongValue = ((Number) entry.getKey()).longValue();
            final Integer num = (Integer) entry.getValue();
            final AwS212S0300000_3 awS212S0300000_3 = new AwS212S0300000_3(atomicInteger, linkedHashMap2, awS44S0301000_17, 12);
            final AwS226S0300000_17 awS226S0300000_17 = new AwS226S0300000_17(atomicInteger, linkedHashMap2, awS44S0301000_172, 19);
            try {
                C1141900foy.LIZ.getClass();
                if (C1141900foy.LIZ(jLongValue, num)) {
                    C1141900foy.LIZJ(jLongValue, num);
                    C176600m4.LIZJ(new AwS547S0100000_3(awS212S0300000_3, 157));
                } else {
                    C1141900foy.LIZIZ(jLongValue, num, new IFetchResourceListener() { // from class: X.0fgh
                        public final /* synthetic */ boolean LIZ = true;

                        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                        public final void onFailure(Exception exc) {
                            C176600m4.LIZJ(new AwS418S0200000_17(exc, (Function1) awS226S0300000_17, 112));
                        }

                        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                        public final void onSuccess(long j) {
                            if (this.LIZ) {
                                C1141900foy c1141900foy = C1141900foy.LIZ;
                                long j2 = jLongValue;
                                Integer num2 = num;
                                c1141900foy.getClass();
                                C1141900foy.LIZJ(j2, num2);
                            }
                            C176600m4.LIZJ(new AwS561S0100000_17(awS212S0300000_3, (Function1<? super Boolean, Unit>) 604));
                        }
                    });
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1136500fgG.LIZLLL(jLongValue, thM5exceptionOrNullimpl);
                C176600m4.LIZJ(new AwS418S0200000_17(thM5exceptionOrNullimpl, awS226S0300000_17, 113));
            }
        }
    }

    public final void LJIILLIIL(int i, InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM, String str) {
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepareFail, giftId:");
        sbLIZ.append(interfaceC1136020ffU.getGiftId());
        sbLIZ.append(", messageId:");
        sbLIZ.append(interfaceC1136020ffU.getMessageId());
        sbLIZ.append(", failMsg:");
        sbLIZ.append(str);
        AbstractC1135650fet.LJII(this, C2188811AlT.LIZIZ(sbLIZ));
        if (c1136560fgM != null) {
            c1136560fgM.LJIJ = 1003;
            c1136560fgM.LJIJI = str;
        }
        InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZJ(interfaceC1136020ffU, c1136560fgM, null);
        }
        this.LIZLLL = false;
        LJIIJ();
    }

    public final void LJIIZILJ(int i, InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM, String str) {
        if (LJIIIZ(i)) {
            LJIILL(i, interfaceC1136020ffU);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepareSuccess, source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c1136560fgM.LJIJ = 1002;
        c1136560fgM.LJIJI = "";
        InterfaceC1135620feq interfaceC1135620feq = this.LJFF;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZJ(interfaceC1136020ffU, c1136560fgM, null);
        }
        this.LIZLLL = false;
        LJIIJ();
    }
}
