package Y;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C09JN;
import X.C0BUN;
import X.C0T6L;
import X.C1159830gHt;
import X.C11RK;
import X.C1388190mED;
import X.C13LP;
import X.C1462570oAB;
import X.C15438062q;
import X.C1629570sVX;
import X.C1635160seY;
import X.C1635850sff;
import X.C1635910sfl;
import X.C1637210shr;
import X.C1639380slM;
import X.C1639650sln;
import X.C1639830sm5;
import X.C1639900smC;
import X.C1640540snE;
import X.C1640560snG;
import X.C1640790snd;
import X.C1640830snh;
import X.C1640890snn;
import X.C1644490stb;
import X.C1644500stc;
import X.C1657830tF7;
import X.C1665620tRg;
import X.C1689650u4R;
import X.C1689710u4X;
import X.C1910890zpH;
import X.C1C7U;
import X.C2188811AlT;
import X.C2281551ESb;
import X.C375780EoK;
import X.EnumC1159860gHw;
import X.EnumC1159880gHy;
import X.EnumC1641340soW;
import X.EnumC1641360soY;
import X.EnumC1641400soc;
import X.EnumC1641460soi;
import X.EnumC1910860zpE;
import X.EnumC2274181Dzs;
import X.InterfaceC1423450n95;
import X.InterfaceC1635920sfm;
import X.InterfaceC1637170shn;
import X.InterfaceC1637200shq;
import X.InterfaceC1640330smt;
import X.InterfaceC1640930snr;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.filter.k;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerRecommendTabViewModel;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oyl.d0;

/* JADX INFO: loaded from: classes26.dex */
public class AfS159S0200000_25 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("TikTokFilterLogicComponent@65e9.observeRepository$1");
        k kVar = (k) afS159S0200000_25.l0;
        Iterator it2 = ((List) obj).iterator();
        while (true) {
            String id = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C1639650sln c1639650sln = ((C1639380slM) next).LIZ;
            if (c1639650sln.LIZIZ == EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS) {
                FilterBean filterBean = kVar.LLL;
                if (filterBean != null) {
                    id = filterBean.getId();
                }
                if (Intrinsics.LJFF(id, c1639650sln.LIZ)) {
                    if (next != null) {
                        ((Function0) afS159S0200000_25.l1).invoke();
                    }
                }
            }
        }
        C1C7U.LIZIZ("TikTokFilterLogicComponent@65e9.observeRepository$1");
    }

    public static final void accept$1(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("RecordStickerLogicComponent@6428.prefetchFirstTrendingSticker$1");
        if (((Boolean) obj).booleanValue()) {
            ((l0) afS159S0200000_25.l0).Ff((Effect) afS159S0200000_25.l1);
        }
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.prefetchFirstTrendingSticker$1");
    }

    public static final void accept$10(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("ToolbarListView@4ad4.setAdapter$1");
        C1657830tF7 c1657830tF7 = (C1657830tF7) obj;
        ((d0) afS159S0200000_25.l0).LIZLLL(c1657830tF7);
        Function0 function0 = (Function0) afS159S0200000_25.l1;
        if (function0 != null) {
            function0.invoke();
        }
        ((d0) afS159S0200000_25.l0).getBatchViewStateListener().LIZLLL(c1657830tF7.LJ, c1657830tF7.LJI);
        C1C7U.LIZIZ("ToolbarListView@4ad4.setAdapter$1");
    }

    public static final void accept$11(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("NearbyBleManager@47fb.init$5");
        Pair pair = (Pair) obj;
        ((C1689650u4R) afS159S0200000_25.l0).LJIIIZ.put(((C1689710u4X) pair.getFirst()).LIZ, (String) pair.getSecond());
        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Connect] current map item count: ");
        sbLIZ.append(((C1689650u4R) afS159S0200000_25.l0).LJIIIZ.size());
        sbLIZ.append(", ");
        sbLIZ.append(((C1689650u4R) afS159S0200000_25.l0).LJIIIZ);
        c1910890zpHLIZ.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) afS159S0200000_25.l1;
        if (function1 != null) {
            function1.invoke(C0T6L.LIZJ(((C1689650u4R) afS159S0200000_25.l0).LJIIIZ));
        }
        C1C7U.LIZIZ("NearbyBleManager@47fb.init$5");
    }

    public static final void accept$12(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("NearbyBleManager@47fb.startBleScan$3");
        HashSet hashSet = new HashSet();
        ArrayList<C1689710u4X> arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (hashSet.add(((C1689710u4X) obj2).LIZ)) {
                arrayList.add(obj2);
            }
        }
        C1689650u4R c1689650u4R = (C1689650u4R) afS159S0200000_25.l0;
        Function1 function1 = (Function1) afS159S0200000_25.l1;
        c1689650u4R.getClass();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C1689710u4X c1689710u4X : arrayList) {
            String str = c1689710u4X.LIZ;
            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BLE scan result: ");
            sbLIZ.append(str);
            sbLIZ.append(", rssi: ");
            sbLIZ.append(c1689710u4X.LIZJ);
            c1910890zpHLIZ.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (c1689650u4R.LJI) {
                try {
                    LinkedList<C1689710u4X> linkedList = c1689650u4R.LJI;
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(linkedList, 10));
                    Iterator<C1689710u4X> it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(it2.next().LIZ);
                    }
                    if (!c1689650u4R.LJIIIZ.containsKey(str) && !arrayList3.contains(str)) {
                        c1689650u4R.LJI.add(c1689710u4X);
                        C1910890zpH c1910890zpHLIZ2 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Add to scanned queue: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", current queue size: ");
                        sbLIZ2.append(c1689650u4R.LJI.size());
                        c1910890zpHLIZ2.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            arrayList2.add(Unit.LIZ);
        }
        if (function1 != null) {
            Set<Map.Entry<String, Long>> setEntrySet = c1689650u4R.LJII.entrySet();
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                arrayList4.add(new Pair(entry.getKey(), Long.valueOf((((Number) entry.getValue()).longValue() + ((long) C0BUN.LIZ())) - System.currentTimeMillis())));
            }
            function1.invoke(C13LP.LLIIII(arrayList4));
        }
        C1C7U.LIZIZ("NearbyBleManager@47fb.startBleScan$3");
    }

    public static final void accept$13(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        InterfaceC1640930snr interfaceC1640930snr;
        C1C7U.LIZ("InfoStickerCollectListView@3604.initObserver$4");
        Effect effect = (Effect) obj;
        if (C1635160seY.LIZIZ(effect) && (interfaceC1640930snr = (InterfaceC1640930snr) afS159S0200000_25.l0) != null) {
            interfaceC1640930snr.LJFF(EnumC1641360soY.FAVORITE.getTag(), false);
        }
        if (C1462570oAB.LJIIJ(effect)) {
            ((C1640790snd) afS159S0200000_25.l1).LJIIJ.invoke();
        } else {
            ((C1640790snd) afS159S0200000_25.l1).LIZLLL.onNext(new Pair<>(effect, Boolean.TRUE));
        }
        C1C7U.LIZIZ("InfoStickerCollectListView@3604.initObserver$4");
    }

    public static final void accept$14(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        AbstractC21674919sB abstractC21674919sB;
        C1C7U.LIZ("FilterView@49bc.provideListView$1");
        if (obj == EnumC1159880gHy.PRE_HIDE) {
            ((RecyclerView) afS159S0200000_25.l0).setItemAnimator(null);
        } else if (obj == EnumC1159880gHy.SHOWN) {
            ((RecyclerView) afS159S0200000_25.l0).setItemAnimator(((C1644490stb) afS159S0200000_25.l1).LJIJJ.LJFF.LIZJ);
            if (C2281551ESb.LIZIZ.LIZIZ()) {
                AbstractC21673719rz itemAnimator = ((RecyclerView) afS159S0200000_25.l0).getItemAnimator();
                if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                    abstractC21674919sB.LLIZ = false;
                }
            }
        }
        C1C7U.LIZIZ("FilterView@49bc.provideListView$1");
    }

    public static final void accept$15(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        AbstractC21674919sB abstractC21674919sB;
        C1C7U.LIZ("StoryFilterView@c02c.provideListView$1");
        if (obj == EnumC1159880gHy.PRE_HIDE) {
            ((RecyclerView) afS159S0200000_25.l0).setItemAnimator(null);
        } else if (obj == EnumC1159880gHy.SHOWN) {
            ((RecyclerView) afS159S0200000_25.l0).setItemAnimator(((C1644500stc) afS159S0200000_25.l1).LJIILLIIL.LJFF.LIZJ);
            if (C2281551ESb.LIZIZ.LIZIZ()) {
                AbstractC21673719rz itemAnimator = ((RecyclerView) afS159S0200000_25.l0).getItemAnimator();
                if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                    abstractC21674919sB.LLIZ = false;
                }
            }
        }
        C1C7U.LIZIZ("StoryFilterView@c02c.provideListView$1");
    }

    public static final void accept$16(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        IEffectCreatorService iEffectCreatorService;
        InterfaceC1637170shn interfaceC1637170shnLIZ;
        C1C7U.LIZ("EffectAMECreateEffectSectionAdapter@9b72.onViewAttachedToWindow$1");
        C1665620tRg c1665620tRg = (C1665620tRg) afS159S0200000_25.l0;
        View view = ((C1637210shr) afS159S0200000_25.l1).itemView;
        c1665620tRg.getClass();
        if (C1388190mED.LIZ(view.getContext()) != null && (iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null)) != null) {
            InterfaceC1637200shq interfaceC1637200shqPreloadService = iEffectCreatorService.preloadService();
            if (interfaceC1637200shqPreloadService != null) {
                interfaceC1637200shqPreloadService.LIZJ();
            }
            InterfaceC1637200shq interfaceC1637200shqPreloadService2 = iEffectCreatorService.preloadService();
            if (interfaceC1637200shqPreloadService2 != null && (interfaceC1637170shnLIZ = interfaceC1637200shqPreloadService2.LIZ()) != null) {
                interfaceC1637170shnLIZ.LIZ(EnumC2274181Dzs.SHOOT_EFFECT_TEMPLATE_TAB);
            }
        }
        C1C7U.LIZIZ("EffectAMECreateEffectSectionAdapter@9b72.onViewAttachedToWindow$1");
    }

    public static final void accept$17(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        int i;
        C1C7U.LIZ("AbstractStickerView@dd31.initSearchViewHideObserver$1");
        C1635910sfl c1635910sfl = (C1635910sfl) obj;
        C1635850sff c1635850sff = null;
        if (c1635910sfl.LIZ) {
            C1635850sff c1635850sff2 = ((AbstractStickerView) afS159S0200000_25.l0).LLJJJJLIIL;
            if (c1635850sff2 != null) {
                c1635850sff = c1635850sff2;
            }
            c1635850sff.Zf(true);
            ((InterfaceC1635920sfm) afS159S0200000_25.l1).LIZJ(c1635910sfl.LIZLLL);
        } else {
            if (c1635910sfl.LIZIZ || (((i = ((AbstractStickerView) afS159S0200000_25.l0).LLIZ.LJI) == 1 || i == 2) && c1635910sfl.LIZJ)) {
                C1635850sff c1635850sff3 = ((AbstractStickerView) afS159S0200000_25.l0).LLJJJJLIIL;
                if (c1635850sff3 != null) {
                    c1635850sff = c1635850sff3;
                }
                c1635850sff.Zf(false);
            }
            ((InterfaceC1635920sfm) afS159S0200000_25.l1).LIZIZ(c1635910sfl.LIZJ);
        }
        ((AbstractStickerView) afS159S0200000_25.l0).LLJLL.onNext(Boolean.valueOf(c1635910sfl.LIZ));
        C1C7U.LIZIZ("AbstractStickerView@dd31.initSearchViewHideObserver$1");
    }

    public static final void accept$18(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("AbstractStickerView@dd31.initTransition$1$1");
        EnumC1159860gHw enumC1159860gHw = (EnumC1159860gHw) obj;
        ((MutableLiveData) afS159S0200000_25.l0).setValue(enumC1159860gHw);
        if (enumC1159860gHw != null) {
            int i = C1159830gHt.LIZ[enumC1159860gHw.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ((AbstractStickerView) afS159S0200000_25.l1).LLILZ.LIZJ.LJIIIZ().LLJJLIIIJLLLLLLLZ();
                }
            } else {
                ((AbstractStickerView) afS159S0200000_25.l1).LLJZ = true;
                if (C2281551ESb.LIZIZ.LJFF().LIZ()) {
                    ((AbstractStickerView) afS159S0200000_25.l1).LJIIIZ().LLZ();
                    View view = ((AbstractStickerView) afS159S0200000_25.l1).LLJZIJLIL;
                    if (view != null) {
                        C375780EoK.LIZIZ(view, false);
                    }
                }
                ((AbstractStickerView) afS159S0200000_25.l1).LLILZ.LIZJ.LJIIIZ().LIZ("end_sticker_anim");
            }
        }
        C1C7U.LIZIZ("AbstractStickerView@dd31.initTransition$1$1");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void accept$2(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        LinkedHashMap linkedHashMap;
        C1C7U.LIZ("BaseInfoStickerStateViewModel@1e08.requestSelectSticker$d$2");
        BaseInfoStickerStateViewModel baseInfoStickerStateViewModel = (BaseInfoStickerStateViewModel) afS159S0200000_25.l0;
        Object obj2 = afS159S0200000_25.l1;
        Map map = (Map) baseInfoStickerStateViewModel.LL.getValue();
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.remove(obj2);
        baseInfoStickerStateViewModel.LL.setValue(linkedHashMap);
        BaseInfoStickerStateViewModel.wQ2(((BaseInfoStickerStateViewModel) afS159S0200000_25.l0).LLILLL, afS159S0200000_25.l1);
        C1C7U.LIZIZ("BaseInfoStickerStateViewModel@1e08.requestSelectSticker$d$2");
    }

    public static final void accept$3(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.download$3");
        if (!((Boolean) obj).booleanValue()) {
            ((C1629570sVX) afS159S0200000_25.l0).LJ = true;
        }
        ((Runnable) afS159S0200000_25.l1).run();
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.download$3");
    }

    public static final void accept$4(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("EffectPlatformFilterBoxDataSource@1936.insertFilters$1");
        ((Function0) afS159S0200000_25.l0).invoke();
        C1639830sm5 c1639830sm5 = (C1639830sm5) afS159S0200000_25.l1;
        c1639830sm5.LIZJ.get().LJJJJI(c1639830sm5.LIZIZ.LIZ.get(), false, false, C1639900smC.LIZ);
        C1C7U.LIZIZ("EffectPlatformFilterBoxDataSource@1936.insertFilters$1");
    }

    public static final void accept$5(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("EffectPlatformFilterBoxDataSource@1936.removeFilters$1");
        C1639830sm5 c1639830sm5 = (C1639830sm5) afS159S0200000_25.l0;
        c1639830sm5.LIZJ.get().LJJJJI(c1639830sm5.LIZIZ.LIZ.get(), false, false, C1639900smC.LIZ);
        ((Function0) afS159S0200000_25.l1).invoke();
        C1C7U.LIZIZ("EffectPlatformFilterBoxDataSource@1936.removeFilters$1");
    }

    public static final void accept$6(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("InfoStickerRecommendTabViewModel@8058.waitForRecommend$1$1");
        List<? extends Effect> list = (List) obj;
        if (list != null && !list.isEmpty()) {
            ((InfoStickerRecommendTabViewModel) afS159S0200000_25.l0).vQ2(list);
        } else {
            ((InfoStickerRecommendTabViewModel) afS159S0200000_25.l0).vQ2((List) afS159S0200000_25.l1);
        }
        C1C7U.LIZIZ("InfoStickerRecommendTabViewModel@8058.waitForRecommend$1$1");
    }

    public static final void accept$7(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        C1C7U.LIZ("InfoStickerRecommendTabViewModel@8058.waitForRecommend$1$2");
        ((InfoStickerRecommendTabViewModel) afS159S0200000_25.l0).vQ2((List) afS159S0200000_25.l1);
        C1C7U.LIZIZ("InfoStickerRecommendTabViewModel@8058.waitForRecommend$1$2");
    }

    public static final void accept$8(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        String str;
        int iIndexOf;
        LiveData<List<Effect>> liveDataHe;
        List<Effect> value;
        C1C7U.LIZ("InfoStickerView@d31b.initRecentListView$2$1");
        Pair pair = (Pair) obj;
        for (Effect effect : (List) pair.getFirst()) {
            InterfaceC1640930snr interfaceC1640930snr = ((C1640830snh) afS159S0200000_25.l0).LIZLLL;
            if (interfaceC1640930snr != null) {
                String effectId = effect.getEffectId();
                String resourceId = effect.getResourceId();
                boolean zLJIILIIL = C1462570oAB.LJIILIIL(effect);
                if (C1635160seY.LIZ(effect)) {
                    str = (String) C13LP.LJJJLL(effect.getFileUrl().getUrlList());
                } else {
                    str = null;
                }
                InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95 = ((C1640540snE) afS159S0200000_25.l1).LJJIJLIJ;
                if (interfaceC1423450n95 != null && (liveDataHe = interfaceC1423450n95.he()) != null && (value = liveDataHe.getValue()) != null) {
                    iIndexOf = value.indexOf(effect);
                } else {
                    iIndexOf = 0;
                }
                interfaceC1640930snr.LIZ(false, true, false, null, "Recent", zLJIILIIL, str, effectId, resourceId, iIndexOf + 1, effect.getTags(), null, false);
            }
        }
        C11RK c11rk = ((C1640830snh) afS159S0200000_25.l0).LJJIJIIJIL;
        EnumC1641460soi enumC1641460soi = EnumC1641460soi.DATA_VISIBLE;
        EnumC1641400soc enumC1641400soc = EnumC1641400soc.MAIN;
        List list = (List) pair.getFirst();
        ((Number) pair.getSecond()).intValue();
        c11rk.onNext(new C1640890snn(enumC1641460soi, enumC1641400soc, list, null, null, null, null, 65496));
        ((C1640830snh) afS159S0200000_25.l0).LJIILLIIL((List) pair.getFirst());
        C1C7U.LIZIZ("InfoStickerView@d31b.initRecentListView$2$1");
    }

    public static final void accept$9(AfS159S0200000_25 afS159S0200000_25, Object obj) {
        int iIndexOf;
        LiveData<List<Effect>> liveDataHe;
        List<Effect> value;
        C1C7U.LIZ("InfoStickerView@d31b.obtainMultiTabPureListView$core$1$1");
        Pair pair = (Pair) obj;
        for (Effect effect : (List) pair.getFirst()) {
            InterfaceC1640930snr interfaceC1640930snr = ((C1640830snh) afS159S0200000_25.l0).LIZLLL;
            if (interfaceC1640930snr != null) {
                String effectId = effect.getEffectId();
                String resourceId = effect.getResourceId();
                InterfaceC1640330smt<Effect> interfaceC1640330smt = ((C1640560snG) afS159S0200000_25.l1).LJJIJL;
                if (interfaceC1640330smt != null && (liveDataHe = interfaceC1640330smt.he()) != null && (value = liveDataHe.getValue()) != null) {
                    iIndexOf = value.indexOf(effect);
                } else {
                    iIndexOf = 0;
                }
                interfaceC1640930snr.LIZ(false, false, false, null, "Others", false, null, effectId, resourceId, iIndexOf + 1, effect.getTags(), null, false);
            }
        }
        C11RK c11rk = ((C1640830snh) afS159S0200000_25.l0).LJJIJIIJIL;
        EnumC1641460soi enumC1641460soi = EnumC1641460soi.DATA_VISIBLE;
        EnumC1641400soc enumC1641400soc = EnumC1641400soc.MAIN;
        List list = (List) pair.getFirst();
        ((Number) pair.getSecond()).intValue();
        c11rk.onNext(new C1640890snn(enumC1641460soi, enumC1641400soc, list, null, null, null, null, 65496));
        C1C7U.LIZIZ("InfoStickerView@d31b.obtainMultiTabPureListView$core$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS159S0200000_25(X.C1639830sm5 r2, kotlin.jvm.internal.AwS569S0100000_25 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 4 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS159S0200000_25.<init>(X.0sm5, kotlin.jvm.internal.AwS569S0100000_25, int):void");
    }

    public AfS159S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
