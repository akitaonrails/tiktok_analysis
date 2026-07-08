package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0w4C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.review.lynx.ReviewAssemVM$fetchReviewData$2", f = "ReviewAssemVM.kt", l = {132}, m = "invokeSuspend")
public final class C1766380w4C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReviewAssemVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1766380w4C(ReviewAssemVM reviewAssemVM, InterfaceC1364105Vn<? super C1766380w4C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reviewAssemVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1766380w4C(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJIIJJI;
        C0X52 c0x52;
        Response response;
        Object objLIZJ = obj;
        C1C7U.LIZ("ReviewAssemVM@4f4a.fetchReviewData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(249));
                ReviewAssemVM reviewAssemVM = this.LLILLJJLI;
                String str = reviewAssemVM.LLILZLL;
                String str2 = reviewAssemVM.LL;
                String str3 = reviewAssemVM.LLILZIL;
                Boolean boolValueOf = Boolean.valueOf(((Boolean) this.LLILLJJLI.LLJI.getValue()).booleanValue());
                ReviewAssemVM reviewAssemVM2 = this.LLILLJJLI;
                Integer num = reviewAssemVM2.LLILLL;
                String str4 = reviewAssemVM2.LLILLJJLI;
                if (str4 != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(str4);
                } else {
                    numLJIIJJI = null;
                }
                ReviewApi.ReviewRequest reviewRequest = new ReviewApi.ReviewRequest(str, str2, 10, 1, true, null, str3, true, null, boolValueOf, num, numLJIIJJI, this.LLILLJJLI.LLILZ, null);
                ReviewAssemVM reviewAssemVM3 = this.LLILLJJLI;
                String str5 = reviewAssemVM3.LLJILJILJ;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("REQUEST_TYPE", "FIRST_REQ"), new Pair("REQUEST_SCENE", reviewAssemVM3.LLJILJILJ));
                C1760730vv5 c1760730vv5 = new C1760730vv5(reviewRequest, null);
                this.LL = 1;
                objLIZJ = C2381909Uz.LIZJ(str5, mapLJIIIIZZ, this, c1760730vv5);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("ReviewAssemVM@4f4a.fetchReviewData$2");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) objLIZJ;
            if (c0x52 != null) {
                response = (Response) c0x52.LIZIZ;
            } else {
                response = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ReviewAssemVM reviewAssemVM4 = this.LLILLJJLI;
            C1555790qaX c1555790qaX = new C1555790qaX(e);
            reviewAssemVM4.getClass();
            reviewAssemVM4.setState(new AwS605S0100000_26(c1555790qaX, 807));
            C1AF0.LJ(e);
        }
        if (response != null) {
            Response response2 = (Response) c0x52.LIZIZ;
            Map map = (Map) response2.data;
            if (map != null && response2.isCodeOK()) {
                this.LLILLJJLI.LLIZLLLIL = C1741890vQh.LJIIIIZZ(map);
                ReviewAssemVM reviewAssemVM5 = this.LLILLJJLI;
                reviewAssemVM5.setState(new AwS605S0100000_26(new C1556050qax(new C1766490w4N("success", reviewAssemVM5.LLIZLLLIL)), 807));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ReviewAssemVM@4f4a.fetchReviewData$2");
                return unit;
            }
            throw new C04IS(null, "data is null");
        }
        throw new RuntimeException("Network Error");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
