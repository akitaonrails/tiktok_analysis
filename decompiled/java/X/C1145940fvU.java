package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import com.bytedance.android.livesdk.gift.model.GiftRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel$loadMore$1$uiData$1", f = "GiftAnchorPanelRecordPageCenterAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1145940fvU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1146080fvi>>, Object> {
    public final /* synthetic */ GiftReceiveRecordsResponse.Data LL;
    public final /* synthetic */ GiftAnchorPanelRecordPageCenterAssemViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145940fvU(GiftReceiveRecordsResponse.Data data, GiftAnchorPanelRecordPageCenterAssemViewModel giftAnchorPanelRecordPageCenterAssemViewModel, InterfaceC1364105Vn<? super C1145940fvU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = data;
        this.LLILLJJLI = giftAnchorPanelRecordPageCenterAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1145940fvU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.loadMore$1$uiData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        GiftReceiveRecordsResponse.Data data = this.LL;
        List<GiftRecord> list = data.giftRecords;
        GiftAnchorPanelRecordPageCenterAssemViewModel giftAnchorPanelRecordPageCenterAssemViewModel = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<GiftRecord> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(giftAnchorPanelRecordPageCenterAssemViewModel.BQ2(it2.next(), data.showTotalDiamonds));
        }
        C1C7U.LIZIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.loadMore$1$uiData$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1146080fvi>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
