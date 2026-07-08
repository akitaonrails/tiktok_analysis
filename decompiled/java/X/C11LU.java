package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11LU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LU<T> extends AbstractC19484711Kz<T> {
    public final InterfaceC19473011Gm<? extends T> LL;
    public final long LLILLJJLI;
    public final TimeUnit LLILLL;
    public final C11RO LLILZ;
    public final boolean LLILZIL = false;

    @Override // X.AbstractC19484711Kz
    public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
        C19484811La c19484811La = new C19484811La();
        interfaceC19474811He.onSubscribe(c19484811La);
        this.LL.LIZ(new C11LV(this, c19484811La, interfaceC19474811He));
    }

    public C11LU(InterfaceC19473011Gm interfaceC19473011Gm, long j, TimeUnit timeUnit, C11RO c11ro) {
        this.LL = interfaceC19473011Gm;
        this.LLILLJJLI = j;
        this.LLILLL = timeUnit;
        this.LLILZ = c11ro;
    }
}
