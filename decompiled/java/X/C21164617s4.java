package X;

import defpackage.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.view.ECommerceCustomSingleAnchorBusiness$photoAnchorShowSecondLineWithDelay$1", f = "ECommerceCustomSingleAnchorBusiness.kt", l = {232}, m = "invokeSuspend")
public final class C21164617s4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21273118Mv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21164617s4(C21273118Mv c21273118Mv, InterfaceC1364105Vn<? super C21164617s4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21273118Mv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21164617s4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceCustomSingleAnchorBusiness@c96.photoAnchorShowSecondLineWithDelay$1");
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
            long j = ((long) t1.LIZIZ().ecSvShouldPhotoModeShowSecondLine.delayShowSubtitle) * 1000;
            if (j < 0) {
                j = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ECommerceCustomSingleAnchorBusiness@c96.photoAnchorShowSecondLineWithDelay$1");
                return objLJFF;
            }
        }
        C21273118Mv c21273118Mv = this.LLILLJJLI;
        if (!c21273118Mv.LLILZ) {
            c21273118Mv.LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceCustomSingleAnchorBusiness@c96.photoAnchorShowSecondLineWithDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
