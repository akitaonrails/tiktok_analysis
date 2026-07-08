package X;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$sendInitialGiftData$1$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
public final class C1128490fTL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GiftPanelLeafViewModel LL;
    public final /* synthetic */ RunnableC781530UlD LLILLJJLI;
    public final /* synthetic */ GridLayoutManager LLILLL;
    public final /* synthetic */ C1128710fTh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128490fTL(GiftPanelLeafViewModel giftPanelLeafViewModel, RunnableC781530UlD runnableC781530UlD, GridLayoutManager gridLayoutManager, C1128710fTh c1128710fTh, InterfaceC1364105Vn<? super C1128490fTL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = giftPanelLeafViewModel;
        this.LLILLJJLI = runnableC781530UlD;
        this.LLILLL = gridLayoutManager;
        this.LLILZ = c1128710fTh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1128490fTL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        C1C7U.LIZ("GiftPanelLeafV2@f893.sendInitialGiftData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        GiftPanelLeafViewModel giftPanelLeafViewModel = this.LL;
        RunnableC781530UlD runnableC781530UlD = this.LLILLJJLI;
        GridLayoutManager gridLayoutManager = this.LLILLL;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = this.LLILZ.LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null) {
            value = mutableLiveData.getValue();
        } else {
            value = null;
        }
        C1128710fTh c1128710fTh = this.LLILZ;
        List<Long> list = c1128710fTh.LLJJJJLIIL;
        Map<Long, C1130160fW2> map = c1128710fTh.LLJLL;
        List<Long> list2 = c1128710fTh.LLJL;
        List<Long> list3 = c1128710fTh.LLJLIL;
        C1128600fTW c1128600fTW = c1128710fTh.LLLLILI;
        boolean z = c1128710fTh.LLLLLLLLLL;
        String str = c1128710fTh.LLZLLLL;
        boolean z2 = true;
        C19719612Di.LJJIIJ(giftPanelLeafViewModel.LLIZLLLIL, AnonymousClass0207.get$arr$(104), true);
        C19719612Di.LJJIIJ(giftPanelLeafViewModel.LLJ, AnonymousClass0207.get$arr$(105), true);
        giftPanelLeafViewModel.LLJIJIL.clear();
        giftPanelLeafViewModel.LLJILJIL.clear();
        ((LinkedHashMap) giftPanelLeafViewModel.LLJILJILJ).clear();
        ((LinkedHashMap) giftPanelLeafViewModel.LLIZ).clear();
        giftPanelLeafViewModel.LLJILLL.clear();
        giftPanelLeafViewModel.LLJJIII.clear();
        giftPanelLeafViewModel.LLJJ.clear();
        giftPanelLeafViewModel.LLJJIJI.clear();
        giftPanelLeafViewModel.LLJJIJIIJIL.clear();
        giftPanelLeafViewModel.LLJI.clear();
        giftPanelLeafViewModel.LLJJI.clear();
        if (!z) {
            Pair<Integer, Integer> pairWQ2 = giftPanelLeafViewModel.wQ2(runnableC781530UlD, gridLayoutManager, value);
            C1130300fWG c1130300fWG = C1130220fW8.LIZ;
            if (pairWQ2.getFirst().intValue() != 1) {
                z2 = false;
            }
            c1130300fWG.LIZ = z2;
            giftPanelLeafViewModel.AQ2(runnableC781530UlD, gridLayoutManager, value, list, map, list2, list3, c1128600fTW, str);
        }
        giftPanelLeafViewModel.CQ2(runnableC781530UlD, gridLayoutManager, value);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.sendInitialGiftData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
