package X;

import X.InterfaceC871370YGh;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Y0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867170Y0d<E, M extends InterfaceC871370YGh<E>> {
    public final Function0<M> LIZ;
    public final CopyOnWriteArraySet<C867180Y0e<M>> LIZIZ = new CopyOnWriteArraySet<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C867170Y0d(Function0<? extends M> function0) {
        this.LIZ = function0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ(M m) {
        for (C867180Y0e<M> c867180Y0e : this.LIZIZ) {
            c867180Y0e.LIZIZ = c867180Y0e.LIZ.invoke((M) m);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Y0c] */
    public final C867160Y0c LIZIZ(InterfaceC1741206rq interfaceC1741206rq) {
        AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(interfaceC1741206rq, (InterfaceC1741206rq<Object>) 230);
        final C867180Y0e<M> c867180Y0e = new C867180Y0e<>(awS593S0100000_14);
        this.LIZIZ.add(c867180Y0e);
        M mInvoke = this.LIZ.invoke();
        if (mInvoke != null) {
            c867180Y0e.LIZIZ = (InterfaceC866920Xze) awS593S0100000_14.invoke(mInvoke);
        }
        return new InterfaceC866920Xze() { // from class: X.0Y0c
            @Override // X.InterfaceC866920Xze
            public final void unsubscribe() {
                InterfaceC866920Xze interfaceC866920Xze = c867180Y0e.LIZIZ;
                if (interfaceC866920Xze != null) {
                    interfaceC866920Xze.unsubscribe();
                }
                this.LIZIZ.remove(c867180Y0e);
            }
        };
    }
}
