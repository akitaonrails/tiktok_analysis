package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.ProductApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget$updateProductNumber$1", f = "ECProductBeforeLiveWidget.kt", l = {}, m = "invokeSuspend")
public final class C0NSU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C180N LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSU(long j, C180N c180n, InterfaceC1364105Vn<? super C0NSU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = c180n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NSU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECProductBeforeLiveWidget@6602.updateProductNumber$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NSS.LIZ.getClass();
        C0X9S<BaseResponse<ProductNum>> productsCount = ((ProductApi) C0NSS.LIZ(ProductApi.class)).getProductsCount(CardStruct.IStatusCode.DEFAULT, true);
        final long j = this.LL;
        final C180N c180n = this.LLILLJJLI;
        productsCount.enqueue(new InterfaceC594300NSq<BaseResponse<ProductNum>>() { // from class: X.0O00
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<BaseResponse<ProductNum>> c0x9s, Throwable th) {
                String message;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                String strLJJ = C180N.LJJ();
                EnumC21196517xD enumC21196517xD = EnumC21196517xD.ROOM_OWNER;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                C180R.LIZJ(strLJJ, false, jCurrentTimeMillis, enumC21196517xD, -7, message);
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
            @Override // X.InterfaceC594300NSq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onResponse(X.C0X9S<com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum>> r13, X.C0X52<com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum>> r14) {
                /*
                    r12 = this;
                    long r7 = java.lang.System.currentTimeMillis()
                    long r0 = r1
                    long r7 = r7 - r0
                    r5 = 1
                    if (r14 == 0) goto La0
                    boolean r0 = r14.LIZJ()
                    if (r0 != r5) goto La0
                    r0 = 1
                L11:
                    r11 = 0
                    if (r0 == 0) goto L9b
                    T r0 = r14.LIZIZ
                    com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r0
                    java.lang.Object r0 = r0.getData()
                    com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum) r0
                    if (r0 == 0) goto L99
                    java.lang.Integer r0 = r0.totalNumber
                    if (r0 == 0) goto L99
                    int r6 = r0.intValue()
                    if (r6 == 0) goto L3b
                    X.180N r0 = r3
                    com.bytedance.android.live.slot.IIconSlot$SlotViewModel r0 = r0.LLILZLL
                    if (r0 == 0) goto L3b
                    androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r0.LLILZLL
                    if (r1 == 0) goto L3b
                    java.lang.String r0 = java.lang.String.valueOf(r6)
                    r1.postValue(r0)
                L3b:
                    X.180N r0 = r3
                    X.180O r4 = r0.LJJII()
                    java.lang.String r3 = r4.LIZIZ
                    if (r3 == 0) goto L54
                    X.08Us r0 = X.C2126308Ur.LIZIZ
                    X.054G r2 = X.C2296808zG.LIZ(r0)
                    X.180P r1 = new X.180P
                    r1.<init>(r3, r4, r11)
                    r0 = 3
                    X.C23250099c.LIZLLL(r2, r11, r11, r1, r0)
                L54:
                    X.C0O01.LIZ = r6
                L56:
                    boolean r0 = r14.LIZJ()
                    if (r0 != r5) goto L9e
                    T r0 = r14.LIZIZ
                    com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r0
                    if (r0 == 0) goto L9e
                    java.lang.Object r0 = r0.getData()
                    com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum) r0
                    if (r0 == 0) goto L9e
                    java.lang.Integer r0 = r0.totalNumber
                    if (r0 == 0) goto L9e
                    int r0 = r0.intValue()
                    if (r0 <= 0) goto L9e
                    r6 = 1
                L75:
                    java.lang.String r5 = X.C180N.LJJ()
                    X.17xD r9 = X.EnumC21196517xD.ROOM_OWNER
                    if (r14 == 0) goto L95
                    T r0 = r14.LIZIZ
                    com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r0
                    if (r0 == 0) goto L95
                    int r10 = r0.getCode()
                L87:
                    T r0 = r14.LIZIZ
                    com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r0
                    if (r0 == 0) goto L91
                    java.lang.String r11 = r0.getMessage()
                L91:
                    X.C180R.LIZJ(r5, r6, r7, r9, r10, r11)
                    return
                L95:
                    r10 = 0
                    if (r14 == 0) goto L91
                    goto L87
                L99:
                    r6 = 0
                    goto L3b
                L9b:
                    if (r14 == 0) goto L9e
                    goto L56
                L9e:
                    r6 = 0
                    goto L75
                La0:
                    r0 = 0
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0O00.onResponse(X.0X9S, X.0X52):void");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.updateProductNumber$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
