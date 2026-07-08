package X;

/* JADX INFO: renamed from: X.08E7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08E7 {
    public static final <T> void LIZ(C09AJ<T> c09aj, T t) {
        if (!c09aj.isDisposed()) {
            c09aj.onNext(t);
        }
        if (!c09aj.isDisposed()) {
            c09aj.onComplete();
        }
    }
}
