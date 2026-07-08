package X;

import com.bytedance.ies.nle.editor_jni.VecDouble;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.PostPublishClarityScoreScheduler$submit$2$scores$1", f = "PostPublishClarityScoreScheduler.kt", l = {206}, m = "invokeSuspend")
public final class C859260XnI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VecDouble>, Object> {
    public int LL;
    public final /* synthetic */ C2216011BoF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859260XnI(C2216011BoF c2216011BoF, InterfaceC1364105Vn<? super C859260XnI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2216011BoF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859260XnI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PostPublishClarityScoreScheduler@617a.submit$2$scores$1");
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
            C099F c099f = this.LLILLJJLI.LJIIL;
            this.LL = 1;
            obj = c099f.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$2$scores$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$2$scores$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VecDouble> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
