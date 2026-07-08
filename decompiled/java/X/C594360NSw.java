package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceCard;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget$openHighlightAutoPostGuidance$1", f = "ECProductBeforeLiveWidget.kt", l = {203}, m = "invokeSuspend")
public final class C594360NSw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C180N LLILLJJLI;
    public final /* synthetic */ ECGuidanceCard LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594360NSw(C180N c180n, ECGuidanceCard eCGuidanceCard, InterfaceC1364105Vn<? super C594360NSw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c180n;
        this.LLILLL = eCGuidanceCard;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594360NSw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECProductBeforeLiveWidget@6602.openHighlightAutoPostGuidance$1");
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
            if (AnonymousClass0958.LIZIZ(1500L, this) == objLJFF) {
                C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.openHighlightAutoPostGuidance$1");
                return objLJFF;
            }
        }
        C618530ONv.LIZ(this.LLILLJJLI.LJJIFFI(), this.LLILLL, C2097608Jq.LJIIJ(new Pair("room_id", CardStruct.IStatusCode.DEFAULT), new Pair("author_id", C180N.LJJ()), new Pair("previous_page", "live_take_page"), new Pair("is_first_show", C2286608xc.LJ(1))), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECProductBeforeLiveWidget@6602.openHighlightAutoPostGuidance$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
