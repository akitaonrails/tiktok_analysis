package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel$preloadVideos$1", f = "PaidContentCustomAnchorViewModel.kt", l = {189}, m = "invokeSuspend")
public final class C05DX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaidContentCustomAnchorViewModel LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DX(PaidContentCustomAnchorViewModel paidContentCustomAnchorViewModel, Aweme aweme, Long l, InterfaceC1364105Vn<? super C05DX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = paidContentCustomAnchorViewModel;
        this.LLILLL = aweme;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        C1C7U.LIZ("PaidContentCustomAnchorViewModel@b005.preloadVideos$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                IPaidContentService iPaidContentService = (IPaidContentService) this.LLILLJJLI.LLJI.getValue();
                Aweme aweme = this.LLILLL;
                boolean z = aweme.isPaidContent;
                String aid = aweme.getAid();
                if (aid != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(aid);
                } else {
                    lLJIILIIL = null;
                }
                long jLongValue = this.LLILZ.longValue();
                this.LL = 1;
                if (iPaidContentService.LJIIIZ(z, lLJIILIIL, jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("PaidContentCustomAnchorViewModel@b005.preloadVideos$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaidContentCustomAnchorViewModel@b005.preloadVideos$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
