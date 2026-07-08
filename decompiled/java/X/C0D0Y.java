package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0D0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpPreloadManager$preloadRecommendations$4", f = "PdpPreloadManager.kt", l = {190, 197}, m = "invokeSuspend")
public final class C0D0Y extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends List<? extends UcpRecommendationItem>>>, Object> {
    public int LL;
    public final /* synthetic */ C0D2Y LLILLJJLI;
    public final /* synthetic */ C0D3K LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0Y(C0D2Y c0d2y, C0D3K c0d3k, InterfaceC1364105Vn<? super C0D0Y> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0d2y;
        this.LLILLL = c0d3k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D0Y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends List<? extends UcpRecommendationItem>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLJ;
        C1C7U.LIZ("PdpPreloadManager@1b72.preloadRecommendations$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objLJ = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            C332690D2l c332690D2lInvoke = this.LLILLJJLI.LIZLLL.invoke();
            String str2 = "";
            if (c332690D2lInvoke != null) {
                C0D2Y c0d2y = this.LLILLJJLI;
                C331730CzT c331730CzT = c0d2y.LIZ;
                if (c332690D2lInvoke.protocolType != 1) {
                    str2 = c332690D2lInvoke.productId;
                }
                String str3 = c332690D2lInvoke.tiktokSpuId;
                String str4 = c332690D2lInvoke.tiktokShopId;
                Map<String, String> mapInvoke = c0d2y.LJFF.invoke();
                this.LL = 1;
                objLJ = c331730CzT.LJ(str2, str3, str4, mapInvoke, this);
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$4");
                    return objLJFF;
                }
            } else {
                C0D2Y c0d2y2 = this.LLILLJJLI;
                C331730CzT c331730CzT2 = c0d2y2.LIZ;
                C332690D2l c332690D2lInvoke2 = c0d2y2.LIZLLL.invoke();
                if (c332690D2lInvoke2 == null || c332690D2lInvoke2.protocolType != 1) {
                    str2 = this.LLILLL.productId;
                }
                C332690D2l c332690D2lInvoke3 = this.LLILLJJLI.LIZLLL.invoke();
                String str5 = null;
                if (c332690D2lInvoke3 != null) {
                    str = c332690D2lInvoke3.tiktokSpuId;
                } else {
                    str = null;
                }
                C332690D2l c332690D2lInvoke4 = this.LLILLJJLI.LIZLLL.invoke();
                if (c332690D2lInvoke4 != null) {
                    str5 = c332690D2lInvoke4.tiktokShopId;
                }
                Map<String, String> mapInvoke2 = this.LLILLJJLI.LJFF.invoke();
                this.LL = 2;
                objLJ = c331730CzT2.LJ(str2, str, str5, mapInvoke2, this);
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$4");
                    return objLJFF;
                }
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJ);
        C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$4");
        return c189200o6M1boximpl;
    }
}
