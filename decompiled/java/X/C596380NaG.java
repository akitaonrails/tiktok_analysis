package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinBoardAutoShareDataManager$updateAutoShareIsChecked$2", f = "BulletinBoardAutoShareDataManager.kt", l = {}, m = "invokeSuspend")
public final class C596380NaG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596380NaG(boolean z, InterfaceC1364105Vn<? super C596380NaG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596380NaG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardAutoShareDataManager@f5bc.updateAutoShareIsChecked$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C604750Nnl c604750Nnl = C604750Nnl.LIZ;
        boolean z = this.LL;
        c604750Nnl.getClass();
        C604750Nnl.LIZLLL(z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.updateAutoShareIsChecked$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
