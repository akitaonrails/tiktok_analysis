package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewsDto;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0D0W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpPreloadManager$preloadReviews$1", f = "PdpPreloadManager.kt", l = {119}, m = "invokeSuspend")
public final class C0D0W extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>>, Object> {
    public int LL;
    public final /* synthetic */ C0D2Y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0W(C0D2Y c0d2y, InterfaceC1364105Vn<? super C0D0W> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0d2y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D0W(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object reviewsDto;
        C1C7U.LIZ("PdpPreloadManager@1b72.preloadReviews$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                reviewsDto = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C332690D2l c332690D2lInvoke = this.LLILLJJLI.LIZLLL.invoke();
            if (c332690D2lInvoke != null) {
                str = c332690D2lInvoke.channelName;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                C331730CzT c331730CzT = this.LLILLJJLI.LIZ;
                this.LL = 1;
                reviewsDto = c331730CzT.LJII(str, CardStruct.IStatusCode.DEFAULT, this);
                if (reviewsDto == objLJFF) {
                    C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadReviews$1");
                    return objLJFF;
                }
            } else {
                reviewsDto = new ReviewsDto(null, null, C13BV.INSTANCE, CardStruct.IStatusCode.DEFAULT, false, C2286608xc.LJ(0));
                C189200o6.m2constructorimpl(reviewsDto);
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(reviewsDto);
        C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadReviews$1");
        return c189200o6M1boximpl;
    }
}
