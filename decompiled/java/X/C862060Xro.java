package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.sdk.customitem.contacts.RemoveSyncedContactsItemComponent$updateEnable$1", f = "RemoveSyncedContactsItemComponent.kt", l = {}, m = "invokeSuspend")
public final class C862060Xro extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C191904105u LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862060Xro(C191904105u c191904105u, boolean z, InterfaceC1364105Vn<? super C862060Xro> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c191904105u;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862060Xro(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoveSyncedContactsItemComponent@d53e.updateEnable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C191904105u c191904105u = this.LL;
        c191904105u.LLILZLL = this.LLILLJJLI;
        c191904105u.LJIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RemoveSyncedContactsItemComponent@d53e.updateEnable$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
