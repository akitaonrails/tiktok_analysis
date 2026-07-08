package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCacheGlobalGift;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$handleGiftListFailure$1", f = "GiftPanelLeafV2.kt", l = {1763}, m = "invokeSuspend")
public final class C1128990fU9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1128710fTh LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128990fU9(C1128710fTh c1128710fTh, int i, String str, InterfaceC1364105Vn<? super C1128990fU9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1128710fTh;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1128990fU9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        C1C7U.LIZ("GiftPanelLeafV2@f893.handleGiftListFailure$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C1128590fTV.LJI > 0 && LiveGiftCacheGlobalGift.INSTANCE.getValue()) {
                C1128710fTh c1128710fTh = this.LLILLJJLI;
                this.LL = 1;
                if (c1128710fTh.LJZI(this) == objLJFF) {
                    C1C7U.LIZIZ("GiftPanelLeafV2@f893.handleGiftListFailure$1");
                    return objLJFF;
                }
            } else {
                GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = this.LLILLJJLI.LJJLIIIIJ();
                if (giftPanelLeafViewModelLJJLIIIIJ == null || (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) == null || (value = mutableLiveData.getValue()) == null || value.isEmpty()) {
                    this.LLILLJJLI.LJZ(this.LLILLL, this.LLILZ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.handleGiftListFailure$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
