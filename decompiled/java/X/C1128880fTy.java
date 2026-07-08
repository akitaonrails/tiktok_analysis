package X;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.OffsetGridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMusicSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1128880fTy extends C2217421BqW implements Function1<C1129150fUP, Unit> {
    public C1128880fTy(Object obj) {
        super(1, obj, C1128950fU5.class, "applyStateReady", "applyStateReady(Lcom/bytedance/android/livesdk/gift/base/platform/business/giftbasic/domain/model/PanelUiState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1129150fUP c1129150fUP) {
        boolean z;
        GridLayoutManager gridLayoutManager;
        C1100690ekV<AbstractC1124410fMl> c1100690ekV;
        MutableLiveData<Long> mutableLiveData;
        long j;
        MutableLiveData<Integer> mutableLiveData2;
        C1129150fUP c1129150fUP2 = c1129150fUP;
        C1128950fU5 c1128950fU5 = (C1128950fU5) this.receiver;
        c1128950fU5.getClass();
        final C1129140fUO c1129140fUO = new C1129140fUO(c1129150fUP2.LIZIZ, c1129150fUP2.LIZJ, c1129150fUP2.LIZLLL, c1129150fUP2.LJI, c1129150fUP2.LJ, c1129150fUP2.LJII, c1129150fUP2.LJFF, 32);
        if (c1129140fUO.LJ != null) {
            z = true;
        } else {
            z = false;
        }
        c1128950fU5.LJFF = z;
        c1128950fU5.LIZ();
        final C1128710fTh c1128710fTh = c1128950fU5.LIZ;
        C500260Jjc.LLFFF(c1128710fTh.LLJJIII);
        C16FZ c16fz = c1128710fTh.LLJJIJIL;
        if (c16fz != null) {
            C500260Jjc.LJIILIIL(c16fz);
        }
        C1129900fVc c1129900fVc = c1128710fTh.LLJJJ;
        if (c1129900fVc != null) {
            C500260Jjc.LJIILIIL(c1129900fVc);
        }
        RunnableC781530UlD runnableC781530UlD = c1128710fTh.LLJJIII;
        if (runnableC781530UlD != null) {
            HandlerHook.viewRemoveCallbacks(runnableC781530UlD, c1128710fTh.a);
        }
        c1128710fTh.c = 0;
        c1128710fTh.LLLIL.clear();
        c1128710fTh.LLLIL.addAll(c1129140fUO.LIZ);
        c1128710fTh.LLLLILI.LIZIZ(c1128710fTh.LLZLLLL, c1129140fUO.LIZ);
        C157100iv c157100iv = c1129140fUO.LJII;
        if (c157100iv != null) {
            c1128710fTh.LLLLILI.LIZJ = c157100iv;
        }
        C1130100fVw.LIZ.LJFF = c1129140fUO.LIZIZ;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = c1128710fTh.LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData2 = giftPanelLeafViewModelLJJLIIIIJ.LLILLL) != null) {
            mutableLiveData2.setValue(Integer.valueOf(c1129140fUO.LIZIZ));
        }
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ2 = c1128710fTh.LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ2 != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ2.LLILZIL) != null) {
            Gift gift = c1129140fUO.LIZJ;
            if (gift != null) {
                j = gift.id;
            } else {
                j = 0;
            }
            mutableLiveData.setValue(Long.valueOf(j));
        }
        int i = c1129140fUO.LIZIZ;
        c1128710fTh.LLLLLZ = i;
        c1128710fTh.LJLLJ(i);
        c1128710fTh.LLLFF = false;
        if (c1129140fUO.LIZIZ == 16) {
            C1128800fTq c1128800fTq = c1128710fTh.LLJJJJ;
            if (c1128800fTq != null) {
                c1128800fTq.LJI(true);
            }
            c1128710fTh.LL(c1129140fUO.LIZ, false);
            GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = c1128710fTh.LJJLIIIJJIZ();
            if (giftLeafRootViewModelLJJLIIIJJIZ != null && (c1100690ekV = giftLeafRootViewModelLJJLIIIJJIZ.LLILZIL) != null) {
                c1100690ekV.LIZ(new C1124420fMm(c1128710fTh.LLZLLLL));
            }
        } else {
            C1128800fTq c1128800fTq2 = c1128710fTh.LLJJJJ;
            if (c1128800fTq2 != null) {
                c1128800fTq2.LJI(false);
            }
            RunnableC781530UlD runnableC781530UlD2 = c1128710fTh.LLJJIII;
            RecyclerView.LayoutManager layoutManager = null;
            if (runnableC781530UlD2 != null) {
                layoutManager = runnableC781530UlD2.getLayoutManager();
            }
            if ((layoutManager instanceof OffsetGridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                gridLayoutManager.LLIZ = new C1129430fUr(new AwS561S0100000_17(c1128710fTh, 462));
            }
            C1128950fU5 c1128950fU5LJJLIIIJLLLLLLLZ = c1128710fTh.LJJLIIIJLLLLLLLZ();
            if (c1128950fU5LJJLIIIJLLLLLLLZ == null || !C1128810fTr.LIZ(c1128710fTh, c1129140fUO, c1128950fU5LJJLIIIJLLLLLLLZ)) {
                C20441214yg.LJIIIZ("GiftMVI.View", "[NewArch] snapshot render unavailable, fallback to legacy sliceGiftPage");
                c1128710fTh.LL(c1129140fUO.LIZ, false);
            }
            c1128710fTh.LJJZZIII();
            RunnableC781530UlD runnableC781530UlD3 = c1128710fTh.LLJJIII;
            if (runnableC781530UlD3 != null) {
                HandlerHook.viewPost(runnableC781530UlD3, new Runnable(c1128710fTh, c1129140fUO) { // from class: X.00mT
                    public final /* synthetic */ C1129140fUO LL;

                    {
                        this.LL = c1129140fUO;
                    }

                    public final void LIZ() {
                        GiftPage next;
                        IMusicGiftService iMusicGiftService;
                        Map<Long, MusicGiftMood> mapLJ;
                        GiftsInfo giftsInfo;
                        List<GiftPage> list = this.LL.LIZ;
                        if (LiveGiftMusicSetting.INSTANCE.isEnable()) {
                            Iterator<GiftPage> it2 = list.iterator();
                            do {
                                next = null;
                                if (!it2.hasNext()) {
                                    break;
                                } else {
                                    next = it2.next();
                                }
                            } while (next.pageType != 18);
                            GiftPage giftPage = next;
                            if (giftPage == null || (iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class)) == null) {
                                return;
                            }
                            List<? extends Gift> list2 = giftPage.favouriteGifts;
                            if (list2 == null) {
                                list2 = C13BV.INSTANCE;
                            }
                            iMusicGiftService.XL2(list2);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            List list3 = giftPage.favouriteGifts;
                            if (list3 == null) {
                                list3 = C13BV.INSTANCE;
                            }
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                C1128810fTr.LIZIZ(linkedHashMap, (Gift) it3.next());
                            }
                            List list4 = giftPage.gifts;
                            if (list4 == null) {
                                list4 = C13BV.INSTANCE;
                            }
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                C1128810fTr.LIZIZ(linkedHashMap, (Gift) it4.next());
                            }
                            List list5 = giftPage.backfillGifts;
                            if (list5 == null) {
                                list5 = C13BV.INSTANCE;
                            }
                            Iterator it5 = list5.iterator();
                            while (it5.hasNext()) {
                                C1128810fTr.LIZIZ(linkedHashMap, (Gift) it5.next());
                            }
                            List list6 = giftPage.frequentlyUsedGifts;
                            if (list6 == null) {
                                list6 = C13BV.INSTANCE;
                            }
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                C1128810fTr.LIZIZ(linkedHashMap, (Gift) it6.next());
                            }
                            GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
                            if (giftListResult == null || (giftsInfo = giftListResult.giftsInfo) == null || (mapLJ = giftsInfo.musicGiftMoods) == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            iMusicGiftService.f91(C13LP.LLIIII(linkedHashMap.values()), mapLJ);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GiftPanelLeafV2@f893.applyNewArchPanelResult$3");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GiftPanelLeafV2@f893.applyNewArchPanelResult$3");
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
