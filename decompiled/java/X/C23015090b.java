package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.utils.ListenableFutureExtensionKt$asDeferred$3", f = "ListenableFutureExtension.kt", l = {45}, m = "invokeSuspend")
public final class C23015090b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C05XL<Object> LLILLL;
    public final /* synthetic */ ListenableFuture<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23015090b(long j, C05XL<Object> c05xl, ListenableFuture<Object> listenableFuture, InterfaceC1364105Vn<? super C23015090b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c05xl;
        this.LLILZ = listenableFuture;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23015090b(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenableFutureExtensionKt@7c04.asDeferred$3");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ListenableFutureExtensionKt@7c04.asDeferred$3");
                return objLJFF;
            }
        }
        if (!this.LLILLL.isCompleted()) {
            this.LLILZ.cancel(true);
            this.LLILLL.LJJJJJ(new TimeoutException());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListenableFutureExtensionKt@7c04.asDeferred$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
