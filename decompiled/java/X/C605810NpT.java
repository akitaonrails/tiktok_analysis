package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$tryInitViewerIdentity$5", f = "BulletinProfileViewModel.kt", l = {}, m = "invokeSuspend")
public final class C605810NpT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1623806Xk<EnumC617060OIe> LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C605810NpT(AbstractC1623806Xk<? extends EnumC617060OIe> abstractC1623806Xk, BulletinProfileViewModel bulletinProfileViewModel, InterfaceC1364105Vn<? super C605810NpT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = bulletinProfileViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605810NpT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.tryInitViewerIdentity$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL instanceof C1623606Xi) {
            C605820NpU c605820NpU = (C605820NpU) this.LLILLJJLI.LLJLIL.getValue();
            c605820NpU.LIZ.setValue(((C1623606Xi) this.LL).LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.tryInitViewerIdentity$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
