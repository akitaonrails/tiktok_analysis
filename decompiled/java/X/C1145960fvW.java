package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssemViewModel$refresh$1", f = "GiftAnchorPanelRecordPageCenterAssemViewModel.kt", l = {212, 219}, m = "invokeSuspend")
public final class C1145960fvW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public GiftReceiveRecordsResponse.Data LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<C050G> LLILZ;
    public final /* synthetic */ GiftAnchorPanelRecordPageCenterAssemViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1145960fvW(List<? extends C050G> list, GiftAnchorPanelRecordPageCenterAssemViewModel giftAnchorPanelRecordPageCenterAssemViewModel, InterfaceC1364105Vn<? super C1145960fvW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = giftAnchorPanelRecordPageCenterAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1145960fvW(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[Catch: all -> 0x016a, TryCatch #0 {all -> 0x016a, blocks: (B:23:0x009a, B:24:0x009d, B:26:0x00b3, B:28:0x00bd, B:29:0x00c1, B:31:0x00c9, B:32:0x00d0, B:34:0x00d4, B:35:0x00d9, B:50:0x014f, B:51:0x0158, B:52:0x0165, B:36:0x00eb, B:37:0x00f1, B:39:0x00fc, B:43:0x0110, B:45:0x0114, B:47:0x012c, B:48:0x0135, B:49:0x0143, B:18:0x0064, B:19:0x0067, B:10:0x0027, B:12:0x002f, B:13:0x003a, B:14:0x0043), top: B:61:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110 A[Catch: all -> 0x016a, TryCatch #0 {all -> 0x016a, blocks: (B:23:0x009a, B:24:0x009d, B:26:0x00b3, B:28:0x00bd, B:29:0x00c1, B:31:0x00c9, B:32:0x00d0, B:34:0x00d4, B:35:0x00d9, B:50:0x014f, B:51:0x0158, B:52:0x0165, B:36:0x00eb, B:37:0x00f1, B:39:0x00fc, B:43:0x0110, B:45:0x0114, B:47:0x012c, B:48:0x0135, B:49:0x0143, B:18:0x0064, B:19:0x0067, B:10:0x0027, B:12:0x002f, B:13:0x003a, B:14:0x0043), top: B:61:0x000f }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1145960fvW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
