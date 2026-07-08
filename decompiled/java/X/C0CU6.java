package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CU6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ml.tars.task.ByteNNNativeTask$checkNodeResourceReady$1", f = "ByteNNNativeTask.kt", l = {200}, m = "invokeSuspend")
public final class C0CU6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1513910pUz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CU6(C1513910pUz c1513910pUz, InterfaceC1364105Vn<? super C0CU6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1513910pUz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CU6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ByteNNNativeTask@77bc.checkNodeResourceReady$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1513910pUz c1513910pUz = this.LLILLJJLI;
            this.LL = 1;
            obj = c1513910pUz.LJIILL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ByteNNNativeTask@77bc.checkNodeResourceReady$1");
                return objLJFF;
            }
        }
        C0VSJ c0vsj = new C0VSJ((String) obj);
        if (!c0vsj.exists() || c0vsj.isDirectory()) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("ByteNNNativeTask@77bc.checkNodeResourceReady$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
