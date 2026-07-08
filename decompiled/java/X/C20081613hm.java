package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {186}, m = "invokeSuspend")
public final class C20081613hm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ScrollCaptureCallbackC20081513hl LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20081613hm(ScrollCaptureCallbackC20081513hl scrollCaptureCallbackC20081513hl, Runnable runnable, InterfaceC1364105Vn<? super C20081613hm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = scrollCaptureCallbackC20081513hl;
        this.LLILLL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20081613hm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C20081713hn c20081713hn = this.LLILLJJLI.LJFF;
            this.LL = 1;
            Object objLIZ = c20081713hn.LIZ(0.0f - c20081713hn.LIZJ, this);
            if (objLIZ != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZJ.LIZ();
        this.LLILLL.run();
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
