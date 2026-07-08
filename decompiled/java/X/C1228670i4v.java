package X;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS25S2200000_19;
import njp.a;

/* JADX INFO: renamed from: X.0i4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.openplatform.CreatePublicGroupPreCheckHelper$showGroupListFullDialog$1", f = "CreatePublicGroupPreCheckHelper.kt", l = {}, m = "invokeSuspend")
public final class C1228670i4v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1228470i4b LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228670i4v(C1228470i4b c1228470i4b, String str, String str2, InterfaceC1364105Vn<? super C1228670i4v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1228470i4b;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228670i4v(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatePublicGroupPreCheckHelper@7239.showGroupListFullDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Dialog[] dialogArr = {null};
        C1397580mTM c1397580mTM = new C1397580mTM(C459080HzO.LJ());
        c1397580mTM.LJI(C459080HzO.LJ().getString(2131831851));
        c1397580mTM.LIZIZ(C459080HzO.LJ().getString(2131831849));
        C985403tE.LIZ(c1397580mTM, new AwS25S2200000_19(this.LL, dialogArr, this.LLILLJJLI, this.LLILLL, 5));
        c1397580mTM.LJII = false;
        dialogArr[0] = new C1397510mTF(c1397580mTM).LJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatePublicGroupPreCheckHelper@7239.showGroupListFullDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
