package X;

import Y.AObjectS299S0200000_30;
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13GA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GA<T> implements InterfaceC1841110y0j<T> {
    public final Function1<C13IQ<?>, C13HG<T>> LIZ;
    public final C1722350uvB<C13G9<T>> LIZIZ = new C1722350uvB<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C13GA(Function1<? super C13IQ<?>, ? extends C13HG<T>> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC1841110y0j
    public final C13HG<T> LIZ(C13IQ<Object> c13iq) {
        C1701640uNm c1701640uNm = (C1701640uNm) this.LIZIZ.get(C09R7.LIZ(c13iq));
        T t = c1701640uNm.reference.get();
        if (t == null) {
            AObjectS299S0200000_30 aObjectS299S0200000_30 = new AObjectS299S0200000_30(this, c13iq, 0);
            synchronized (c1701640uNm) {
                t = c1701640uNm.reference.get();
                if (t == null) {
                    t = (T) aObjectS299S0200000_30.invoke();
                    c1701640uNm.reference = new SoftReference<>(t);
                }
            }
        }
        return t.LIZ;
    }
}
