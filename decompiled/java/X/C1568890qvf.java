package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget$showTooltip$1", f = "ECProductBeforeLiveWidget.kt", l = {330}, m = "invokeSuspend")
public final class C1568890qvf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C180N LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C180T LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568890qvf(C180N c180n, String str, C180T c180t, InterfaceC1364105Vn<? super C1568890qvf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c180n;
        this.LLILLL = str;
        this.LLILZ = c180t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568890qvf(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECProductBeforeLiveWidget@6602.showTooltip$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.showTooltip$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLILLJJLI.LJFF("GUIDE_EC_CREATOR_LIVE_TASK", this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.showTooltip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
