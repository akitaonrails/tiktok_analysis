package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0946, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {242}, m = "invokeSuspend")
public final class AnonymousClass0946 extends C09AX implements Function2<C094N<? extends Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C259800zU<Object> LLILZ;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0946(InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, InterfaceC346701Wf interfaceC346701Wf) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c259800zU;
        this.LLILZIL = interfaceC346701Wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0946 anonymousClass0946 = new AnonymousClass0946(interfaceC1364105Vn, this.LLILZ, this.LLILZIL);
        anonymousClass0946.LLILLL = obj;
        return anonymousClass0946;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.09AU] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C259800zU<Object> c259800zU;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ?? r3 = ((C094N) this.LLILLL).LIZ;
            c259800zU = this.LLILZ;
            boolean z = r3 instanceof C094O;
            if (!z) {
                c259800zU.element = r3;
            }
            InterfaceC346701Wf<Object> interfaceC346701Wf = this.LLILZIL;
            if (z) {
                Throwable thLIZ = C094N.LIZ(r3);
                if (thLIZ == null) {
                    Object obj2 = c259800zU.element;
                    if (obj2 != null) {
                        if (obj2 == C09AV.LIZ) {
                            obj2 = null;
                        }
                        this.LLILLL = r3;
                        this.LL = c259800zU;
                        this.LLILLJJLI = 1;
                        if (interfaceC346701Wf.emit(obj2, this) == objLJFF) {
                            return objLJFF;
                        }
                    }
                } else {
                    throw thLIZ;
                }
            }
            return Unit.LIZ;
        }
        c259800zU.element = C09AV.LIZJ;
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094N<? extends Object> c094n, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(new C094N(c094n.LIZ), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
