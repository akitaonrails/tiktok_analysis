package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436920nUo implements InterfaceC626120Oh8<Long> {
    public final /* synthetic */ C1436780nUa LL;
    public final /* synthetic */ Function1<Long, Unit> LLILLJJLI;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LL.LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LL.LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Long l) {
        this.LLILLJJLI.invoke(Long.valueOf(l.longValue()));
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LL.LIZ = interfaceC420801kM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1436920nUo(C1436780nUa c1436780nUa, Function1<? super Long, Unit> function1) {
        this.LL = c1436780nUa;
        this.LLILLJJLI = function1;
    }
}
