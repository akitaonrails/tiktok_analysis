package X;

import kotlin.Unit;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.1DF6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C1DF6 extends C2217421BqW implements InterfaceC1631620sYq<JobSupport, C1DEF<?>, Object, Unit> {
    public static final C1DF6 LL = new C1DF6();

    public C1DF6() {
        super(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(JobSupport jobSupport, C1DEF<?> c1def, Object obj) {
        final JobSupport jobSupport2 = jobSupport;
        final C1DEF<?> c1def2 = c1def;
        while (true) {
            Object objLJJJJZI = jobSupport2.LJJJJZI();
            if (!(objLJJJJZI instanceof C13WP)) {
                if (!(objLJJJJZI instanceof CompletedExceptionally)) {
                    objLJJJJZI = C1DFI.LIZ(objLJJJJZI);
                }
                c1def2.LIZIZ(objLJJJJZI);
            } else if (jobSupport2.LJJZZI(objLJJJJZI) >= 0) {
                c1def2.LIZ(jobSupport2.LJII(new C1DF1(c1def2) { // from class: X.1DF8
                    public final C1DEF<?> LLILZIL;

                    @Override // X.C1DFU
                    public final void LJII(Throwable th) {
                        Object objLJJJJZI2 = this.LLILZLL.LJJJJZI();
                        if (!(objLJJJJZI2 instanceof CompletedExceptionally)) {
                            objLJJJJZI2 = C1DFI.LIZ(objLJJJJZI2);
                        }
                        this.LLILZIL.LJ(this.LLILZLL, objLJJJJZI2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        LJII(th);
                        return Unit.LIZ;
                    }

                    {
                        this.LLILZIL = c1def2;
                    }
                }));
                break;
            }
        }
        return Unit.LIZ;
    }
}
