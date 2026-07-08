package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$buildSwitchItem$1$1$1", f = "LinkPrivacyNoticeController.kt", l = {}, m = "invokeSuspend")
public final class C450201p6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C127A LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450201p6(C127A c127a, boolean z, InterfaceC1364105Vn<? super C450201p6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c127a;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450201p6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILJJIL(!this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
