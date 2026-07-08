package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemv.MultiColTemplateScene$initTabsAndViewPager$5$onPageSelected$1", f = "MultiColTemplateScene.kt", l = {749}, m = "invokeSuspend")
public final class C1424600nAw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1424590nAv LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424600nAw(C1424590nAv c1424590nAv, int i, InterfaceC1364105Vn<? super C1424600nAw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1424590nAv;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1424600nAw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiColTemplateScene@5338.initTabsAndViewPager$5$onPageSelected$1");
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
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("MultiColTemplateScene@5338.initTabsAndViewPager$5$onPageSelected$1");
                return objLJFF;
            }
        }
        C1424850nBL c1424850nBLLJJIJL = this.LLILLJJLI.LLLLLJLJLL().LJJIJL(this.LLILLL);
        if (c1424850nBLLJJIJL != null) {
            c1424850nBLLJJIJL.LJII(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiColTemplateScene@5338.initTabsAndViewPager$5$onPageSelected$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
