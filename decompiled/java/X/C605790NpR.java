package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$startDCSync$3$1", f = "BulletinProfileViewModel.kt", l = {}, m = "invokeSuspend")
public final class C605790NpR extends C09AX implements Function2<EnumC617060OIe, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605790NpR(BulletinProfileViewModel bulletinProfileViewModel, InterfaceC1364105Vn<? super C605790NpR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C605790NpR c605790NpR = new C605790NpR(this.LLILLJJLI, interfaceC1364105Vn);
        c605790NpR.LL = obj;
        return c605790NpR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.startDCSync$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C605820NpU) this.LLILLJJLI.LLJLIL.getValue()).LIZ.setValue(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.startDCSync$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC617060OIe enumC617060OIe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(enumC617060OIe, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
