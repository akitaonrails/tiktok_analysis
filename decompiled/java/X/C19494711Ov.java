package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19494711Ov extends AtomicReference<InterfaceC420801kM> implements C11IY {
    public static final long serialVersionUID = 5638352172918776687L;
    public final C19494411Os<?> LL;

    @Override // X.C11IY
    public final void onComplete() {
        C19494411Os<?> c19494411Os = this.LL;
        c19494411Os.LLJ = false;
        c19494411Os.LIZ();
    }

    public C19494711Ov(C19494411Os<?> c19494411Os) {
        this.LL = c19494411Os;
    }

    @Override // X.C11IY
    public final void onError(Throwable th) {
        C19494411Os<?> c19494411Os = this.LL;
        if (c19494411Os.LLILZ.addThrowable(th)) {
            if (c19494411Os.LLILLL == EnumC19492211Nw.IMMEDIATE) {
                c19494411Os.LLJIJIL = true;
                c19494411Os.LLIZLLLIL.dispose();
                Throwable thTerminate = c19494411Os.LLILZ.terminate();
                if (thTerminate != C11QG.LIZ) {
                    c19494411Os.LL.onError(thTerminate);
                }
                if (c19494411Os.getAndIncrement() == 0) {
                    c19494411Os.LLIZ.clear();
                    return;
                }
                return;
            }
            c19494411Os.LLJ = false;
            c19494411Os.LIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this, interfaceC420801kM);
    }
}
