package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.ContentResolverExtKt$awaitChange$2$observer$1$onChange$1", f = "ContentResolverExt.kt", l = {29}, m = "invokeSuspend")
public final class C383601eM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C383601eM(Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC20236714Gf<Object> interfaceC20236714Gf, InterfaceC1364105Vn<? super C383601eM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C383601eM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContentResolverExtKt@bc6f.awaitChange$2$observer$1$onChange$1");
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
            Function1<InterfaceC1364105Vn<Object>, Object> function1 = this.LLILLJJLI;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContentResolverExtKt@bc6f.awaitChange$2$observer$1$onChange$1");
                return objLJFF;
            }
        }
        InterfaceC20236714Gf<Object> interfaceC20236714Gf = this.LLILLL;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContentResolverExtKt@bc6f.awaitChange$2$observer$1$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
