package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GenPageLinkChainKeyRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PageLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.repository.api.SeaShareApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ve9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$openShareDialog$1$ecProduct$shareLinkJob$1", f = "SeaPdpViewModel.kt", l = {4605}, m = "invokeSuspend")
public final class C1750230ve9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Response<SeaShareApi.PDPShareLinkResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ ShareInfo LLILLJJLI;
    public final /* synthetic */ SeaPdpViewModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ PageLinkInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750230ve9(ShareInfo shareInfo, SeaPdpViewModel seaPdpViewModel, int i, PageLinkInfo pageLinkInfo, InterfaceC1364105Vn<? super C1750230ve9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareInfo;
        this.LLILLL = seaPdpViewModel;
        this.LLILZ = i;
        this.LLILZIL = pageLinkInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750230ve9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int value;
        String str;
        String str2;
        Image image;
        List<String> urls;
        Integer num;
        C1C7U.LIZ("SeaPdpViewModel@98e7.openShareDialog$1$ecProduct$shareLinkJob$1");
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
            C1750250veB c1750250veB = SeaShareApi.LIZ;
            ShareInfo shareInfo = this.LLILLJJLI;
            if (shareInfo != null && (num = shareInfo.shareScene) != null) {
                value = num.intValue();
            } else {
                value = EnumC1217070hmD.CREATOR.getValue();
            }
            Integer numLJ = C2286608xc.LJ(value);
            ProductPackStruct productPackStruct = this.LLILLL.LLJIJIL;
            String str3 = null;
            if (productPackStruct != null) {
                str = productPackStruct.productId;
            } else {
                str = null;
            }
            ShareInfo shareInfo2 = this.LLILLJJLI;
            if (shareInfo2 != null && (image = shareInfo2.cover) != null && (urls = image.getUrls()) != null) {
                str2 = (String) C13LP.LJJJLL(urls);
            } else {
                str2 = null;
            }
            ShareInfo shareInfo3 = this.LLILLJJLI;
            if (shareInfo3 != null) {
                str3 = shareInfo3.formattedTargetPrice;
            }
            SeaShareApi.GetPDPShareLinkRequest getPDPShareLinkRequest = new SeaShareApi.GetPDPShareLinkRequest(numLJ, new SeaShareApi.PDPShareLinkProductMeta(str, str2, str3), new GenPageLinkChainKeyRequest(C2286608xc.LJ(this.LLILZ), this.LLILZIL));
            this.LL = 1;
            obj = c1750250veB.LIZ(getPDPShareLinkRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaPdpViewModel@98e7.openShareDialog$1$ecProduct$shareLinkJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.openShareDialog$1$ecProduct$shareLinkJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Response<SeaShareApi.PDPShareLinkResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
