package X;

/* JADX INFO: renamed from: X.0Imn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C476750Imn<T> implements InterfaceC626120Oh8<T>, InterfaceC19474811He<T> {
    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
    }

    @Override // X.InterfaceC626120Oh8
    public void onNext(T t) {
    }

    @Override // X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(T t) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        C20441214yg.LJI("LiveEmptyObserver", th);
    }
}
