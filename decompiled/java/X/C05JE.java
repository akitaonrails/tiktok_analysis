package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05JE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.LiveShareLinkManager$getSocialRelationButton$1$1", f = "LiveShareLinkManager.kt", l = {}, m = "invokeSuspend")
public final class C05JE extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C05JF LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05JE(C05JF c05jf, InterfaceC1364105Vn<? super C05JE> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c05jf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05JE(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveShareLinkManager@7817.getSocialRelationButton$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(false, true);
        C1C7U.LIZIZ("LiveShareLinkManager@7817.getSocialRelationButton$1$1");
        return false;
    }
}
