package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$tryInitViewerIdentity$3$1", f = "BulletinProfileViewModel.kt", l = {}, m = "invokeSuspend")
public final class C605800NpS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinProfileViewModel LL;
    public final /* synthetic */ AbstractC1623806Xk<EnumC617060OIe> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605800NpS(AbstractC1623806Xk abstractC1623806Xk, BulletinProfileViewModel bulletinProfileViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinProfileViewModel;
        this.LLILLJJLI = abstractC1623806Xk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605800NpS(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.tryInitViewerIdentity$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C605820NpU c605820NpU = (C605820NpU) this.LL.LLJLIL.getValue();
        c605820NpU.LIZ.setValue(((C1623606Xi) this.LLILLJJLI).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.tryInitViewerIdentity$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
