package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.lynxcard.SpecialCardHolderDecorator$deleteCard$2", f = "SpecialCardHolderDecorator.kt", l = {95}, m = "invokeSuspend")
public final class C487110J8j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C0T22 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487110J8j(Aweme aweme, C0T22 c0t22, InterfaceC1364105Vn<? super C487110J8j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = c0t22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C487110J8j(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SpecialCardHolderDecorator@9d6b.deleteCard$2");
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
                C1C7U.LIZIZ("SpecialCardHolderDecorator@9d6b.deleteCard$2");
                return objLJFF;
            }
        }
        C1440005kM.LIZ(new C1210880hcE(this.LLILLL.LLILLJJLI.LJIIIZ, "FUNCTION_FROM_DEFAULT", "dispersion_client_default_drop", this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpecialCardHolderDecorator@9d6b.deleteCard$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
