package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20031113Zd<T> implements InterfaceC20032213Zo<T> {
    public final T LIZ;
    public final ArrayList<T> LIZIZ = new ArrayList<>();
    public T LIZJ;

    @Override // X.InterfaceC20032213Zo
    public final /* synthetic */ void LJIIIZ() {
    }

    public abstract void LJIIJJI();

    @Override // X.InterfaceC20032213Zo
    public final void LJFF() {
        this.LIZJ = (T) C1947907k5.LIZ(this.LIZIZ);
    }

    @Override // X.InterfaceC20032213Zo
    public final void clear() {
        this.LIZIZ.clear();
        this.LIZJ = this.LIZ;
        LJIIJJI();
    }

    @Override // X.InterfaceC20032213Zo
    public final T LIZ() {
        return this.LIZJ;
    }

    public AbstractC20031113Zd(T t) {
        this.LIZ = t;
        this.LIZJ = t;
    }

    @Override // X.InterfaceC20032213Zo
    public final void LJIIIIZZ(T t) {
        this.LIZIZ.add(this.LIZJ);
        this.LIZJ = t;
    }

    @Override // X.InterfaceC20032213Zo
    public final void LIZIZ(Object obj, Function2 function2) {
        function2.invoke(this.LIZJ, obj);
    }
}
