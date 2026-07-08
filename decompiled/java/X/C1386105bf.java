package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.common.toolbar.ExpandableScrollableToolbarLayoutKt$ExpandableScrollableToolbarLayout$2", f = "ExpandableScrollableToolbarLayout.kt", l = {150}, m = "invokeSuspend")
public final class C1386105bf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<C1676880tjq<Boolean>> LLILLJJLI;
    public final /* synthetic */ C1689390u41 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386105bf(C259800zU<C1676880tjq<Boolean>> c259800zU, C1689390u41 c1689390u41, InterfaceC1364105Vn<? super C1386105bf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c1689390u41;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1386105bf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout$2");
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
            if (this.LLILLJJLI.element.LIZ().booleanValue() == this.LLILLJJLI.element.LIZIZ().booleanValue()) {
                C1689390u41 c1689390u41 = this.LLILLL;
                this.LL = 1;
                if (c1689390u41.LJIIIIZZ(0, this) == objLJFF) {
                    C1C7U.LIZIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
