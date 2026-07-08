package X;

import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2$changeListener$1$onChange$1", f = "InboxFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C891900Yyq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InboxFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891900Yyq(InboxFragmentV2 inboxFragmentV2, InterfaceC1364105Vn<? super C891900Yyq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inboxFragmentV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891900Yyq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxFragmentV2@d7b5.changeListener$1$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isVisible()) {
            C891910Yyr.LIZ(C0ZJN.LIZ());
            this.LL.rS();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.changeListener$1$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
