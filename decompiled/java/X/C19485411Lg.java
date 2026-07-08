package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.11Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19485411Lg<T, R> extends AbstractC19484711Kz<R> {
    public final Iterable<? extends InterfaceC19473011Gm<? extends T>> LL;
    public final InterfaceC1487280oo2<? super Object[], ? extends R> LLILLJJLI;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super R> interfaceC19474811He) throws Throwable {
        InterfaceC19473011Gm[] interfaceC19473011GmArr = new InterfaceC19473011Gm[8];
        try {
            int i = 0;
            for (InterfaceC19473011Gm<? extends T> interfaceC19473011Gm : this.LL) {
                if (interfaceC19473011Gm == null) {
                    C11JT.error(new NullPointerException("One of the sources is null"), interfaceC19474811He);
                    return;
                }
                if (i == interfaceC19473011GmArr.length) {
                    interfaceC19473011GmArr = (InterfaceC19473011Gm[]) Arrays.copyOf(interfaceC19473011GmArr, (i >> 2) + i);
                }
                interfaceC19473011GmArr[i] = interfaceC19473011Gm;
                i++;
            }
            if (i == 0) {
                C11JT.error(new NoSuchElementException(), interfaceC19474811He);
                return;
            }
            if (i == 1) {
                interfaceC19473011GmArr[0].LIZ(new C19481911Jx(interfaceC19474811He, new InterfaceC1487280oo2<T, R>() { // from class: X.11Ll
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Object[]] */
                    @Override // X.InterfaceC1487280oo2
                    public final R apply(T t) {
                        R rApply = this.LL.LLILLJJLI.apply(new Object[]{t});
                        C1701890uOB.LIZ(rApply, "The zipper returned a null value");
                        return rApply;
                    }
                }));
                return;
            }
            C19485611Li c19485611Li = new C19485611Li(interfaceC19474811He, i, this.LLILLJJLI);
            interfaceC19474811He.onSubscribe(c19485611Li);
            for (int i2 = 0; i2 < i && !c19485611Li.isDisposed(); i2++) {
                interfaceC19473011GmArr[i2].LIZ(c19485611Li.LLILLL[i2]);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C11JT.error(th, interfaceC19474811He);
        }
    }

    public C19485411Lg(Iterable<? extends InterfaceC19473011Gm<? extends T>> iterable, InterfaceC1487280oo2<? super Object[], ? extends R> interfaceC1487280oo2) {
        this.LL = iterable;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
