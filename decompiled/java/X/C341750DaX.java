package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.HandleShareProcessModel$hideProgressBar$1", f = "HandleShareProcessModel.kt", l = {}, m = "invokeSuspend")
public final class C341750DaX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C580380MpY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341750DaX(C580380MpY c580380MpY, InterfaceC1364105Vn<? super C341750DaX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c580380MpY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C341750DaX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HandleShareProcessModel@e131.hideProgressBar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DialogC1389620mGW dialogC1389620mGW = this.LL.LIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HandleShareProcessModel@e131.hideProgressBar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
