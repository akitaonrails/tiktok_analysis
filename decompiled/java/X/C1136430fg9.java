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
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS212S0300000_3;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136430fg9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Collection collection, final InterfaceC1138480fjS interfaceC1138480fjS) {
        C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
        Map mapLJ = C2097608Jq.LJ();
        c1138360fjGLIZLLL.getClass();
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1138630fjh.LIZIZ(((Number) it2.next()).longValue(), 0, mapLJ, null, false, atomicInteger, null, 152));
        }
        AbstractC19484711Kz.LJJIL(arrayList, new InterfaceC1487280oo2() { // from class: X.00Db
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return 0;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<Object>() { // from class: X.0fjR
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                InterfaceC1138480fjS interfaceC1138480fjS2 = interfaceC1138480fjS;
                if (interfaceC1138480fjS2 != null) {
                    interfaceC1138480fjS2.onFailed(th);
                }
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(Object obj) {
                if (atomicInteger.get() > 0) {
                    InterfaceC1138480fjS interfaceC1138480fjS2 = interfaceC1138480fjS;
                    if (interfaceC1138480fjS2 != null) {
                        interfaceC1138480fjS2.LIZ();
                        return;
                    }
                    return;
                }
                onError(new Throwable("all task failed"));
            }
        });
    }

    public static Set LIZLLL(GiftMessage giftMessage, C1135280feI c1135280feI) {
        boolean z;
        GiftRandomEffectInfo giftRandomEffectInfo;
        List<Long> list;
        GiftEffectStreamSpec giftEffectStreamSpec;
        AssetBundle.PrefabBundle prefabBundle;
        List<Long> list2;
        List<AssetsModel> list3;
        Gift gift;
        List<GiftColorInfo> list4;
        Gift.CrossScreenEffectInfo crossScreenEffectInfo;
        GiftEffectSerialSpec giftEffectSerialSpec;
        List<Long> list5;
        GiftEffectStreamSpec giftEffectStreamSpec2;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        GiftEffectLynxSpec giftEffectLynxSpec;
        List<Long> list6;
        GiftEffectCrossScreenStickerSpec giftEffectCrossScreenStickerSpec;
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (c1135280feI != null) {
                long j = c1135280feI.LJFF;
                if (j > 0) {
                    linkedHashSet.add(Long.valueOf(j));
                }
            }
            GiftEffect giftEffect = giftMessage.giftEffect;
            if (giftEffect != null) {
                Iterator<AssetsModel> it2 = giftEffect.assets.iterator();
                while (it2.hasNext()) {
                    long j2 = it2.next().id;
                    if (j2 > 0) {
                        linkedHashSet.add(Long.valueOf(j2));
                    }
                }
                GiftEffectSpecs giftEffectSpecs = giftEffect.specs;
                if (giftEffectSpecs != null && (giftEffectCrossScreenStickerSpec = giftEffectSpecs.crossScreenSticker) != null) {
                    linkedHashSet.addAll(giftEffectCrossScreenStickerSpec.singleActionAssetIds.keySet());
                    linkedHashSet.addAll(giftEffectCrossScreenStickerSpec.actionAssetIds.keySet());
                    linkedHashSet.addAll(giftEffectCrossScreenStickerSpec.reactionAssetIds.keySet());
                }
                GiftEffectSpecs giftEffectSpecs2 = giftEffect.specs;
                if (giftEffectSpecs2 != null && (giftEffectLynxSpec = giftEffectSpecs2.lynx) != null && (list6 = giftEffectLynxSpec.assetIds) != null) {
                    Iterator<Long> it3 = list6.iterator();
                    while (it3.hasNext()) {
                        long jLongValue = it3.next().longValue();
                        if (jLongValue > 0) {
                            linkedHashSet.add(Long.valueOf(jLongValue));
                        }
                    }
                }
                GiftEffectSpecs giftEffectSpecs3 = giftEffect.specs;
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
                GiftEffectSpecs giftEffectSpecs4 = giftEffect.specs;
                if (giftEffectSpecs4 != null && (giftEffectStreamSpec2 = giftEffectSpecs4.streamEffectSpec) != null) {
                    long j4 = giftEffectStreamSpec2.basicAssetId;
                    if (j4 > 0) {
                        linkedHashSet.add(Long.valueOf(j4));
                    }
                    Iterator<Long> it5 = giftEffectStreamSpec2.extraAssetIds.iterator();
                    while (it5.hasNext()) {
                        long jLongValue3 = it5.next().longValue();
                        if (jLongValue3 > 0) {
                            linkedHashSet.add(Long.valueOf(jLongValue3));
                        }
                    }
                }
                GiftEffectSpecs giftEffectSpecs5 = giftEffect.specs;
                if (giftEffectSpecs5 != null && (giftEffectSerialSpec = giftEffectSpecs5.serialSpec) != null && (list5 = giftEffectSerialSpec.serialAssetIds) != null) {
                    Iterator<Long> it6 = list5.iterator();
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
        if (c1135280feI != null) {
            long j5 = c1135280feI.LJFF;
            if (j5 > 0) {
                linkedHashSet2.add(Long.valueOf(j5));
            }
        }
        Gift gift2 = giftMessage.mGift;
        if (gift2 != null && (crossScreenEffectInfo = gift2.crossScreenEffectInfo) != null) {
            linkedHashSet2.addAll(crossScreenEffectInfo.singleActionEffectIds.keySet());
            linkedHashSet2.addAll(crossScreenEffectInfo.actionEffectIds.keySet());
            linkedHashSet2.addAll(crossScreenEffectInfo.reactionEffectIds.keySet());
        }
        Gift gift3 = giftMessage.mGift;
        if (gift3 != null && (list4 = gift3.colorInfos) != null && (!list4.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Long.valueOf(C1135270feH.LIZJ(giftMessage)).longValue() <= 0 && ((c1135280feI == null || Long.valueOf(c1135280feI.LJFF) == null) && (gift = giftMessage.mGift) != null)) {
                linkedHashSet2.add(Long.valueOf(gift.primaryEffectId));
            }
        } else {
            Gift gift4 = giftMessage.mGift;
            if (gift4 != null && gift4.isRandomGift && (giftRandomEffectInfo = gift4.randomEffectInfo) != null && (list = giftRandomEffectInfo.effectIds) != null && (!list.isEmpty())) {
                Iterator<Long> it7 = list.iterator();
                while (it7.hasNext()) {
                    linkedHashSet2.add(Long.valueOf(it7.next().longValue()));
                }
            }
        }
        Iterator<Long> it8 = C1136040ffW.LIZIZ(giftMessage).iterator();
        while (it8.hasNext()) {
            linkedHashSet2.add(Long.valueOf(it8.next().longValue()));
        }
        AssetBundle assetBundle = giftMessage.assetBundle;
        if (assetBundle != null && (list3 = assetBundle.assets) != null) {
            Iterator<AssetsModel> it9 = list3.iterator();
            while (it9.hasNext()) {
                linkedHashSet2.add(Long.valueOf(it9.next().id));
            }
        }
        AssetBundle assetBundle2 = giftMessage.assetBundle;
        if (assetBundle2 != null && (prefabBundle = assetBundle2.prefabBundle) != null && (list2 = prefabBundle.prefabEffectIds) != null) {
            linkedHashSet2.addAll(list2);
        }
        AssetBundle assetBundle3 = giftMessage.assetBundle;
        if (assetBundle3 != null && (giftEffectStreamSpec = assetBundle3.streamEffectSpec) != null) {
            linkedHashSet2.add(Long.valueOf(giftEffectStreamSpec.basicAssetId));
            linkedHashSet2.addAll(giftEffectStreamSpec.extraAssetIds);
        }
        return linkedHashSet2;
    }

    public static Set LJ(GiftMessage giftMessage, C1135280feI c1135280feI) {
        Set setLIZLLL = LIZLLL(giftMessage, c1135280feI);
        if (setLIZLLL.isEmpty()) {
            return C08CX.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = setLIZLLL.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            if (jLongValue > 0 && C1138640fji.LIZLLL(jLongValue) == null) {
                linkedHashSet.add(Long.valueOf(jLongValue));
            }
        }
        return linkedHashSet;
    }

    public static void LJFF(Collection collection, Function0 function0, Function0 function02) {
        if (!collection.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (C1138640fji.LIZLLL(((Number) it2.next()).longValue()) == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(collection);
                    C1133450fbL.LIZ(arrayList, new AwS561S0100000_17(function0, (Function0<Unit>) 22), new AwS561S0100000_17(function02, (Function0<Unit>) 23));
                    return;
                }
            }
        }
        function0.invoke();
    }

    public static void LIZJ(Collection collection, Map map, Function1 function1, Function1 function12) {
        if (collection.isEmpty() && map.isEmpty()) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(Long.valueOf(((Number) it2.next()).longValue()), null);
        }
        linkedHashMap.putAll(map);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LIZIZ(((Number) entry.getKey()).longValue(), (Integer) entry.getValue(), new AwS212S0300000_3(atomicInteger, (AtomicInteger) linkedHashMap, (Map<Long, Integer>) function1, (Function1<? super Boolean, Unit>) 0), new AwS212S0300000_3(atomicInteger, (AtomicInteger) linkedHashMap, (Map<Long, Integer>) function12, (Function1<? super Boolean, Unit>) 1), true);
        }
    }

    public static void LIZIZ(final long j, final Integer num, final Function1 function1, final Function1 function12, final boolean z) {
        Object c098200Yq;
        try {
            C1141900foy.LIZ.getClass();
            if (C1141900foy.LIZ(j, num)) {
                if (z) {
                    C1141900foy.LIZJ(j, num);
                }
                C176600m4.LIZJ(new AwS546S0100000_2(function1, (Function1<? super Boolean, Unit>) 24));
            } else {
                C1141900foy.LIZIZ(j, num, new IFetchResourceListener() { // from class: X.0foz
                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    public final void onFailure(Exception exc) {
                        C176600m4.LIZJ(new AwS418S0200000_17(exc, (Function1) function12, 0));
                    }

                    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                    public final void onSuccess(long j2) {
                        if (z) {
                            C1141900foy c1141900foy = C1141900foy.LIZ;
                            long j3 = j;
                            Integer num2 = num;
                            c1141900foy.getClass();
                            C1141900foy.LIZJ(j3, num2);
                        }
                        C176600m4.LIZJ(new AwS561S0100000_17(function1, (Function1<? super Boolean, Unit>) 21));
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
            C1136500fgG.LIZLLL(j, thM5exceptionOrNullimpl);
            C176600m4.LIZJ(new AwS418S0200000_17(thM5exceptionOrNullimpl, function12, 1));
        }
    }
}
