package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import com.bytedance.android.livesdk.gift.model.GiftRecord;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel$refresh$1$3", f = "GiftAnchorPanelRecordPageCenterAssemViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1145930fvT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GiftReceiveRecordsResponse.Data LL;
    public final /* synthetic */ LinkedList<C050G> LLILLJJLI;
    public final /* synthetic */ GiftAnchorPanelRecordPageCenterAssemViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145930fvT(GiftReceiveRecordsResponse.Data data, LinkedList<C050G> linkedList, GiftAnchorPanelRecordPageCenterAssemViewModel giftAnchorPanelRecordPageCenterAssemViewModel, InterfaceC1364105Vn<? super C1145930fvT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = data;
        this.LLILLJJLI = linkedList;
        this.LLILLL = giftAnchorPanelRecordPageCenterAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1145930fvT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        C1C7U.LIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.refresh$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.showTotalDiamonds) {
            this.LLILLJJLI.add(new C050H(true, C497740JfY.LJIJI(2131856134)));
            this.LLILLJJLI.add(new C050F(this.LL.totalDiamonds));
            this.LLILLJJLI.add(new C050H(false, C497740JfY.LJIJI(2131856130)));
        }
        if (!this.LL.giftRecords.isEmpty()) {
            this.LLILLL.LLJILJIL.clear();
            this.LLILLL.LLJILJILJ.clear();
            GiftReceiveRecordsResponse.Data data = this.LL;
            List<GiftRecord> list = data.giftRecords;
            GiftAnchorPanelRecordPageCenterAssemViewModel giftAnchorPanelRecordPageCenterAssemViewModel = this.LLILLL;
            LinkedList<C050G> linkedList = this.LLILLJJLI;
            for (GiftRecord giftRecord : list) {
                GiftRecord.Message message = giftRecord.message;
                if (message != null) {
                    j = message.createdOnTimestamp;
                } else {
                    j = 0;
                }
                if (j > giftAnchorPanelRecordPageCenterAssemViewModel.LLJJ) {
                    if (message != null) {
                        j2 = message.createdOnTimestamp;
                    } else {
                        j2 = 0;
                    }
                    giftAnchorPanelRecordPageCenterAssemViewModel.LLJJ = j2;
                }
                if (message != null) {
                    Boolean.valueOf(giftAnchorPanelRecordPageCenterAssemViewModel.LLJILJILJ.add(C2286608xc.LJFF(message.msgId)));
                }
                GiftRecord.Message message2 = giftRecord.message;
                if (message2 != null) {
                    long j3 = message2.groupId;
                    if (j3 > 0) {
                        giftAnchorPanelRecordPageCenterAssemViewModel.LLJILJIL.add(C2286608xc.LJFF(j3));
                    }
                }
                linkedList.add(giftAnchorPanelRecordPageCenterAssemViewModel.BQ2(giftRecord, data.showTotalDiamonds));
            }
            this.LLILLL.LLJILLL = this.LL.refTimestamp;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.refresh$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
