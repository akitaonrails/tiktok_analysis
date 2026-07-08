package X;

import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.099E, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C099E extends C2217421BqW implements InterfaceC1631620sYq<JobSupport, Object, Object, Object> {
    public static final C099E LL = new C099E();

    public C099E() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) throws Throwable {
        jobSupport.getClass();
        if (!(obj2 instanceof CompletedExceptionally)) {
            return obj2;
        }
        throw ((CompletedExceptionally) obj2).cause;
    }
}
