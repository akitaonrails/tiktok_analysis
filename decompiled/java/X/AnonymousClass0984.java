package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0984, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AnonymousClass0984<T> extends C11NZ<T> {
    public abstract void LJLLLLLL(C09JN<? super InterfaceC420801kM> c09jn);

    public final AnonymousClass0983 LJLLLL() {
        return new C11NZ<T>(this) { // from class: X.0983
            public final AnonymousClass0984<? extends T> LL;
            public final int LLILLJJLI;
            public final C09JN<? super InterfaceC420801kM> LLILLL;
            public final AtomicInteger LLILZ;

            {
                AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
                this.LL = this;
                this.LLILLJJLI = 1;
                this.LLILLL = anonymousClass0988;
                this.LLILZ = new AtomicInteger();
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
                this.LL.LIZIZ(interfaceC626120Oh8);
                if (this.LLILZ.incrementAndGet() == this.LLILLJJLI) {
                    this.LL.LJLLLLLL(this.LLILLL);
                }
            }
        };
    }
}
