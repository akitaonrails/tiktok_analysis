package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import x5h.d;

/* JADX INFO: renamed from: X.0MmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$6$photoIntercept$2", f = "OptimizeTakePhotoProcessor.kt", l = {}, m = "invokeSuspend")
public final class C578470MmT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C578760Mmw LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ d LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C578470MmT(Function0<Unit> function0, C578760Mmw c578760Mmw, String str, d dVar, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C578470MmT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = c578760Mmw;
        this.LLILLL = str;
        this.LLILZ = dVar;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578470MmT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolInvoke;
        C1C7U.LIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$6$photoIntercept$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        Function1<String, Boolean> function1 = this.LLILLJJLI.LIZLLL;
        if (function1 != null) {
            boolInvoke = function1.invoke(this.LLILLL);
        } else {
            boolInvoke = null;
        }
        this.LLILZ.LIZIZ();
        this.LLILZIL.invoke(true);
        C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$6$photoIntercept$2");
        return boolInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
