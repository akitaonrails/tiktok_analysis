package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import njp.a;

/* JADX INFO: renamed from: X.0mF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.view.MentionPanelViewDelegate$registerObserver$1$1$1$2$1$1", f = "MentionPanelViewDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1388740mF6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1388820mFE LL;
    public final /* synthetic */ List<C1388670mEz> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388740mF6(C1388820mFE c1388820mFE, List<C1388670mEz> list, InterfaceC1364105Vn<? super C1388740mF6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1388820mFE;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1388740mF6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionPanelViewDelegate@dcd0.registerObserver$1$1$1$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C897520ZIw c897520ZIw = this.LL.LJIIJJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJIIIIZZ(C0O26.LIZIZ(this.LLILLJJLI, AFwS259S0000000_21.get$arr$(189)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionPanelViewDelegate@dcd0.registerObserver$1$1$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
