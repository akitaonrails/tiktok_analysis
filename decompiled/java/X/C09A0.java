package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09A0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09A0 {
    public static final C11KS LIZ(final C1DFB c1dfb, final Function2 function2) {
        if (c1dfb.get(C09AE.LJJLJ) == null) {
            return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.099u
                public final /* synthetic */ InterfaceC497601wk LL = C817503Hh.LL;

                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At interfaceC2329309At) {
                    InterfaceC497601wk interfaceC497601wk = this.LL;
                    CoroutineContext coroutineContext = c1dfb;
                    Function2 function22 = function2;
                    C099D<T> c099d = new C099D<T>(C23252099e.LIZIZ(interfaceC497601wk, coroutineContext), (C11KT) interfaceC2329309At) { // from class: X.099t
                        public final InterfaceC2329309At<T> LLILZ;

                        @Override // X.C099D
                        public final void LJLJJI(T t) {
                            try {
                                this.LLILZ.onSuccess(t);
                            } catch (Throwable th) {
                                C095J.LIZ(this.LLILLL, th);
                            }
                        }

                        {
                            this.LLILZ = c11kt;
                        }

                        @Override // X.C099D
                        public final void LJLILLLLZI(Throwable th, boolean z) {
                            try {
                                if (this.LLILZ.tryOnError(th)) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                C13SZ.LIZ(th, th2);
                            }
                            C095J.LIZ(this.LLILLL, th);
                        }
                    };
                    interfaceC2329309At.setCancellable(new C23266099s(c099d));
                    C099V.DEFAULT.invoke(function22, c099d, c099d);
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
        sbLIZ.append(c1dfb);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
