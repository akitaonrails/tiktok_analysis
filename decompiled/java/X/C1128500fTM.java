package X;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$recordShownGifts$1", f = "GiftPanelLeafV2.kt", l = {}, m = "invokeSuspend")
public final class C1128500fTM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1128710fTh LL;
    public final /* synthetic */ RunnableC781530UlD LLILLJJLI;
    public final /* synthetic */ GridLayoutManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128500fTM(C1128710fTh c1128710fTh, RunnableC781530UlD runnableC781530UlD, GridLayoutManager gridLayoutManager, InterfaceC1364105Vn<? super C1128500fTM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1128710fTh;
        this.LLILLJJLI = runnableC781530UlD;
        this.LLILLL = gridLayoutManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1128500fTM(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        C1C7U.LIZ("GiftPanelLeafV2@f893.recordShownGifts$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = this.LL.LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ != null) {
            RunnableC781530UlD runnableC781530UlD = this.LLILLJJLI;
            GridLayoutManager gridLayoutManager = this.LLILLL;
            GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ2 = this.LL.LJJLIIIIJ();
            if (giftPanelLeafViewModelLJJLIIIIJ2 != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ2.LLILLJJLI) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            giftPanelLeafViewModelLJJLIIIIJ.CQ2(runnableC781530UlD, gridLayoutManager, value);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.recordShownGifts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
