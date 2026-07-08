package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel$loadMore$1", f = "GiftAnchorPanelRecordPageCenterAssemViewModel.kt", l = {374, 389}, m = "invokeSuspend")
public final class C1145970fvX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public GiftReceiveRecordsResponse.Data LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ GiftAnchorPanelRecordPageCenterAssemViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145970fvX(GiftAnchorPanelRecordPageCenterAssemViewModel giftAnchorPanelRecordPageCenterAssemViewModel, InterfaceC1364105Vn<? super C1145970fvX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = giftAnchorPanelRecordPageCenterAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1145970fvX(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2 A[Catch: all -> 0x011f, TryCatch #0 {all -> 0x011f, blocks: (B:39:0x00cb, B:40:0x00ce, B:42:0x00f2, B:44:0x00f9, B:45:0x00fe, B:46:0x010f, B:47:0x0115, B:29:0x0096, B:30:0x0099, B:32:0x00a3, B:34:0x00ab, B:11:0x0027, B:13:0x005e, B:25:0x0083, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:21:0x007b, B:23:0x007f, B:24:0x0082), top: B:52:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #0 {all -> 0x011f, blocks: (B:39:0x00cb, B:40:0x00ce, B:42:0x00f2, B:44:0x00f9, B:45:0x00fe, B:46:0x010f, B:47:0x0115, B:29:0x0096, B:30:0x0099, B:32:0x00a3, B:34:0x00ab, B:11:0x0027, B:13:0x005e, B:25:0x0083, B:16:0x0066, B:17:0x006b, B:19:0x0071, B:21:0x007b, B:23:0x007f, B:24:0x0082), top: B:52:0x000f }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1145970fvX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
