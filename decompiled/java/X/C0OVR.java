package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OVR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel$clearTextDraft$1", f = "BulletinEditViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0OVR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinEditViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OVR(BulletinEditViewModel bulletinEditViewModel, String str, InterfaceC1364105Vn<? super C0OVR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEditViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OVR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEditViewModel@4330.clearTextDraft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C0OKS) this.LL.LL.getValue().getOperator()).LLLJIL(this.LL.LLILLJJLI, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEditViewModel@4330.clearTextDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
