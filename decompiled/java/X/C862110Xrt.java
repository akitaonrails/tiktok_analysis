package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.sdk.customitem.contacts.RemoveSyncedMLBBItemComponent$updateLoading$1", f = "RemoveSyncedMLBBItemComponent.kt", l = {}, m = "invokeSuspend")
public final class C862110Xrt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C191891105h LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862110Xrt(int i, C191891105h c191891105h, InterfaceC1364105Vn<? super C862110Xrt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c191891105h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862110Xrt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoveSyncedMLBBItemComponent@4943.updateLoading$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                this.LLILLJJLI.LLIZ = true;
            }
        } else {
            this.LLILLJJLI.LLIZ = false;
        }
        this.LLILLJJLI.LJIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RemoveSyncedMLBBItemComponent@4943.updateLoading$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
