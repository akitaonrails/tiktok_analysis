package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.sdk.customitem.contacts.RemoveSyncedMLBBItemComponent$updateEnable$1", f = "RemoveSyncedMLBBItemComponent.kt", l = {}, m = "invokeSuspend")
public final class C862100Xrs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C191891105h LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862100Xrs(C191891105h c191891105h, boolean z, InterfaceC1364105Vn<? super C862100Xrs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c191891105h;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862100Xrs(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoveSyncedMLBBItemComponent@4943.updateEnable$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C191891105h c191891105h = this.LL;
        c191891105h.LLILZLL = this.LLILLJJLI;
        c191891105h.LJIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RemoveSyncedMLBBItemComponent@4943.updateEnable$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
