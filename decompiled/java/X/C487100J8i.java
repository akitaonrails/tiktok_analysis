package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.lynxcard.refactor.FeedLynxInsertCardRefactor$deleteCard$1", f = "FeedLynxInsertCardRefactor.kt", l = {200}, m = "invokeSuspend")
public final class C487100J8i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C207187165p LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487100J8i(Aweme aweme, C207187165p c207187165p, InterfaceC1364105Vn<? super C487100J8i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = c207187165p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C487100J8i(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedLynxInsertCardRefactor@c2b.deleteCard$1");
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
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("FeedLynxInsertCardRefactor@c2b.deleteCard$1");
                return objLJFF;
            }
        }
        C1440005kM.LIZ(new C1210880hcE(this.LLILLL.LL.LJIIIZ, "FUNCTION_FROM_DEFAULT", "lynx_card_load_error", this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxInsertCardRefactor@c2b.deleteCard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
