package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [OUT] */
/* JADX INFO: renamed from: X.0EhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.EPLaunchTask$runAsync$1", f = "EPLaunchTask.kt", l = {56}, m = "invokeSuspend")
public final class C371440EhK<OUT> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super OUT>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AbstractC371450EhL<OUT> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371440EhK(AbstractC371450EhL<OUT> abstractC371450EhL, InterfaceC1364105Vn<? super C371440EhK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC371450EhL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C371440EhK(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super OUT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPLaunchTask@6db8.runAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            System.currentTimeMillis();
            String simpleName = this.LLILLL.getClass().getSimpleName();
            AbstractC371450EhL<OUT> abstractC371450EhL = this.LLILLL;
            this.LL = simpleName;
            this.LLILLJJLI = 1;
            obj = abstractC371450EhL.LIZJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EPLaunchTask@6db8.runAsync$1");
                return objLJFF;
            }
        }
        System.currentTimeMillis();
        this.LLILLL.LIZJ.LJJLIIIJILLIZJL(Unit.LIZ);
        C1C7U.LIZIZ("EPLaunchTask@6db8.runAsync$1");
        return obj;
    }
}
