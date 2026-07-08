package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectCrossScreenStickerSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectLynxSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectPrefabSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSerialSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.gift.model.GiftEffectStreamSpec;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ffX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136050ffX {
    public static final /* synthetic */ int LIZ = 0;

    public static Set LIZ(InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI) {
        Set setLIZIZ = LIZIZ(interfaceC1136020ffU, c1135280feI);
        if (setLIZIZ.isEmpty()) {
            return C08CX.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = setLIZIZ.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            C1140890fnL.LIZLLL().getClass();
            if (!C1138630fjh.LJI().LIZIZ(C1138640fji.LIZLLL(jLongValue), null)) {
                linkedHashSet.add(Long.valueOf(jLongValue));
            }
        }
        return linkedHashSet;
    }

    public static Set LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI) {
        boolean z;
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ;
        GiftRandomEffectInfo giftRandomEffectInfoLJIIJJI;
        List<Long> list;
        GiftEffectStreamSpec giftEffectStreamSpecLJIILL;
        AssetBundle.PrefabBundle prefabBundleLJIILIIL;
        List<Long> list2;
        List<AssetsModel> listLJIIJ;
        List<GiftColorInfo> listLJII;
        Gift.CrossScreenEffectInfo crossScreenEffectInfoLJIIJ;
        GiftEffect giftEffectLJIJI;
        GiftEffectSerialSpec giftEffectSerialSpec;
        List<Long> list3;
        GiftEffectStreamSpec giftEffectStreamSpec;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        GiftEffectLynxSpec giftEffectLynxSpec;
        List<Long> list4;
        GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec;
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (c1135280feI != null) {
                long j = c1135280feI.LJFF;
                if (j > 0) {
                    linkedHashSet.add(Long.valueOf(j));
                }
            }
            InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII != null && (giftEffectLJIJI = interfaceC1136230ffpLJJII.LJIJI()) != null) {
                Iterator<AssetsModel> it2 = giftEffectLJIJI.assets.iterator();
                while (it2.hasNext()) {
                    long j2 = it2.next().id;
                    if (j2 > 0) {
                        linkedHashSet.add(Long.valueOf(j2));
                    }
                }
                GiftEffectSpecs giftEffectSpecs = giftEffectLJIJI.specs;
                if (giftEffectSpecs != null && (giftEffectCrossScreenStickerSpec = giftEffectSpecs.crossScreenSticker) != null) {
                    linkedHashSet.addAll(giftEffectCrossScreenStickerSpec.singleActionAssetIds.keySet());
                    linkedHashSet.addAll(giftEffectCrossScreenStickerSpec.actionAssetIds.keySet());
                    linkedHashSet.addAll(giftEffectCrossScreenStickerSpec.reactionAssetIds.keySet());
                }
                GiftEffectSpecs giftEffectSpecs2 = giftEffectLJIJI.specs;
                if (giftEffectSpecs2 != null && (giftEffectLynxSpec = giftEffectSpecs2.lynx) != null && (list4 = giftEffectLynxSpec.assetIds) != null) {
                    Iterator<Long> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        long jLongValue = it3.next().longValue();
                        if (jLongValue > 0) {
                            linkedHashSet.add(Long.valueOf(jLongValue));
                        }
                    }
                }
                GiftEffectSpecs giftEffectSpecs3 = giftEffectLJIJI.specs;
                if (giftEffectSpecs3 != null && (giftEffectPrefabSpec = giftEffectSpecs3.prefab) != null) {
                    long j3 = giftEffectPrefabSpec.templateAssetId;
                    if (j3 > 0) {
                        linkedHashSet.add(Long.valueOf(j3));
                    }
                    Iterator<Long> it4 = giftEffectPrefabSpec.prefabAssetIds.iterator();
                    while (it4.hasNext()) {
                        long jLongValue2 = it4.next().longValue();
                        if (jLongValue2 > 0) {
                            linkedHashSet.add(Long.valueOf(jLongValue2));
                        }
                    }
                }
                GiftEffectSpecs giftEffectSpecs4 = giftEffectLJIJI.specs;
                if (giftEffectSpecs4 != null && (giftEffectStreamSpec = giftEffectSpecs4.streamEffectSpec) != null) {
                    long j4 = giftEffectStreamSpec.basicAssetId;
                    if (j4 > 0) {
                        linkedHashSet.add(Long.valueOf(j4));
                    }
                    Iterator<Long> it5 = giftEffectStreamSpec.extraAssetIds.iterator();
                    while (it5.hasNext()) {
                        long jLongValue3 = it5.next().longValue();
                        if (jLongValue3 > 0) {
                            linkedHashSet.add(Long.valueOf(jLongValue3));
                        }
                    }
                }
                GiftEffectSpecs giftEffectSpecs5 = giftEffectLJIJI.specs;
                if (giftEffectSpecs5 != null && (giftEffectSerialSpec = giftEffectSpecs5.serialSpec) != null && (list3 = giftEffectSerialSpec.serialAssetIds) != null) {
                    Iterator<Long> it6 = list3.iterator();
                    while (it6.hasNext()) {
                        long jLongValue4 = it6.next().longValue();
                        if (jLongValue4 > 0) {
                            linkedHashSet.add(Long.valueOf(jLongValue4));
                        }
                    }
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        long j5 = c1135280feI.LJFF;
        if (j5 > 0) {
            linkedHashSet2.add(Long.valueOf(j5));
        }
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ2 = interfaceC1136020ffU.LJIIIIZZ();
        if (interfaceC1136160ffiLJIIIIZZ2 != null && (crossScreenEffectInfoLJIIJ = interfaceC1136160ffiLJIIIIZZ2.LJIIJ()) != null) {
            linkedHashSet2.addAll(crossScreenEffectInfoLJIIJ.singleActionEffectIds.keySet());
            linkedHashSet2.addAll(crossScreenEffectInfoLJIIJ.actionEffectIds.keySet());
            linkedHashSet2.addAll(crossScreenEffectInfoLJIIJ.reactionEffectIds.keySet());
        }
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ3 = interfaceC1136020ffU.LJIIIIZZ();
        if (interfaceC1136160ffiLJIIIIZZ3 != null && (listLJII = interfaceC1136160ffiLJIIIIZZ3.LJII()) != null && (!listLJII.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Long.valueOf(C1135270feH.LIZIZ(interfaceC1136020ffU)).longValue() <= 0 && Long.valueOf(c1135280feI.LJFF) == null) {
                linkedHashSet2.add(Long.valueOf(C1135870ffF.LJFF(interfaceC1136020ffU)));
            }
        } else {
            InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ4 = interfaceC1136020ffU.LJIIIIZZ();
            if (interfaceC1136160ffiLJIIIIZZ4 != null && interfaceC1136160ffiLJIIIIZZ4.LJIIL() && (interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ()) != null && (giftRandomEffectInfoLJIIJJI = interfaceC1136160ffiLJIIIIZZ.LJIIJJI()) != null && (list = giftRandomEffectInfoLJIIJJI.effectIds) != null && (!list.isEmpty())) {
                Iterator<Long> it7 = list.iterator();
                while (it7.hasNext()) {
                    linkedHashSet2.add(Long.valueOf(it7.next().longValue()));
                }
            }
        }
        Iterator it8 = C1136040ffW.LIZ(interfaceC1136020ffU).iterator();
        while (it8.hasNext()) {
            linkedHashSet2.add(Long.valueOf(((Number) it8.next()).longValue()));
        }
        InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII2 != null && (listLJIIJ = interfaceC1136230ffpLJJII2.LJIIJ()) != null) {
            Iterator<AssetsModel> it9 = listLJIIJ.iterator();
            while (it9.hasNext()) {
                linkedHashSet2.add(Long.valueOf(it9.next().id));
            }
        }
        InterfaceC1136230ffp interfaceC1136230ffpLJJII3 = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII3 != null && (prefabBundleLJIILIIL = interfaceC1136230ffpLJJII3.LJIILIIL()) != null && (list2 = prefabBundleLJIILIIL.prefabEffectIds) != null) {
            linkedHashSet2.addAll(list2);
        }
        InterfaceC1136230ffp interfaceC1136230ffpLJJII4 = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII4 != null && (giftEffectStreamSpecLJIILL = interfaceC1136230ffpLJJII4.LJIILL()) != null) {
            linkedHashSet2.add(Long.valueOf(giftEffectStreamSpecLJIILL.basicAssetId));
            linkedHashSet2.addAll(giftEffectStreamSpecLJIILL.extraAssetIds);
        }
        return linkedHashSet2;
    }

    public static Set LIZJ(InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI) {
        Set setLIZIZ = LIZIZ(interfaceC1136020ffU, c1135280feI);
        if (setLIZIZ.isEmpty()) {
            return C08CX.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = setLIZIZ.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            if (jLongValue > 0 && C1138640fji.LIZLLL(jLongValue) == null) {
                linkedHashSet.add(Long.valueOf(jLongValue));
            }
        }
        return linkedHashSet;
    }

    public static void LIZLLL(Collection collection, Function0 function0, Function0 function02) {
        if (!collection.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (C1138640fji.LIZLLL(((Number) it2.next()).longValue()) == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(collection);
                    C1133450fbL.LIZ(arrayList, new AwS561S0100000_17(function0, (Function0<Unit>) 605), new AwS561S0100000_17(function02, (Function0<Unit>) 606));
                    return;
                }
            }
        }
        function0.invoke();
    }
}
