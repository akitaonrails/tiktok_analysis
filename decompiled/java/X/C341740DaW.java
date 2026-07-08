package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.HandleShareProcessModel$showProgressBar$1", f = "HandleShareProcessModel.kt", l = {}, m = "invokeSuspend")
public final class C341740DaW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C580380MpY LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341740DaW(C580380MpY c580380MpY, Activity activity, InterfaceC1364105Vn<? super C341740DaW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c580380MpY;
        this.LLILLJJLI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C341740DaW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HandleShareProcessModel@e131.showProgressBar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C580380MpY c580380MpY = this.LL;
        if (c580380MpY.LIZ == null) {
            c580380MpY.LIZ = new DialogC1389620mGW(this.LLILLJJLI);
        }
        DialogC1389620mGW dialogC1389620mGW = this.LL.LIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZJ(dialogC1389620mGW);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HandleShareProcessModel@e131.showProgressBar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
