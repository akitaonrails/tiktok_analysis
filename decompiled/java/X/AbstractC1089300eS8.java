package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0eS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1089300eS8<T> {
    public final AbstractC1084540eKS<T> LL;
    public final List<InterfaceC1089750eSr<T>> LLILLJJLI = new ArrayList();

    public abstract void LJ();

    public abstract void release();

    public T LIZLLL() {
        return this.LL.LIZIZ;
    }

    public AbstractC1089300eS8(AbstractC1084540eKS<T> abstractC1084540eKS) {
        this.LL = abstractC1084540eKS;
    }

    public final void LJFF(T t) {
        if (t != null) {
            for (InterfaceC1089750eSr<T> interfaceC1089750eSr : this.LLILLJJLI) {
                if (interfaceC1089750eSr != null) {
                    AbstractC1084540eKS<T> abstractC1084540eKS = this.LL;
                    interfaceC1089750eSr.LIZ(abstractC1084540eKS.LIZJ, t, abstractC1084540eKS.LIZ);
                }
            }
        }
    }
}
