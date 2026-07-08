package X;

import X.InterfaceC663970Q2p;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Q49, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0Q49<T extends InterfaceC663970Q2p> {
    public final C0Q46<T> LIZ;
    public boolean LIZIZ;

    public abstract void LIZ();

    public C0Q49(C0Q46<T> c0q46) {
        this.LIZ = c0q46;
    }

    public final void LIZIZ(C0Q4F c0q4f) {
        C0Q4A<T> c0q4a;
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            C0Q4D.LIZ.add(this);
            LIZ();
        }
        C0Q46<T> c0q46 = this.LIZ;
        HashMap<C0Q4F, C0Q4A<T>> map = c0q46.LIZ;
        synchronized (c0q46) {
            if (!c0q46.LIZIZ.contains(c0q4f)) {
                c0q46.LIZIZ.add(c0q4f);
            }
            c0q4a = new C0Q4A<>(c0q4f, c0q46);
        }
        map.put(c0q4f, c0q4a);
    }
}
