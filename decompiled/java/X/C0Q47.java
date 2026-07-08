package X;

import X.InterfaceC663970Q2p;

/* JADX INFO: renamed from: X.0Q47, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q47<T extends InterfaceC663970Q2p> {
    public final C650960Pg6 LIZ;
    public final C0Q4F LIZIZ;
    public final C0Q46<T> LIZJ;

    public final T LIZ() {
        String string = this.LIZIZ.getSignalBinder().invoke(this.LIZ).toString();
        T t = this.LIZJ.LIZJ.get(string);
        C0Q46<T> c0q46 = this.LIZJ;
        c0q46.LIZJ.put(string, (T) c0q46.LIZ());
        return t == null ? (T) this.LIZJ.LIZ() : t;
    }

    public final T LIZIZ() {
        T t = this.LIZJ.LIZJ.get(this.LIZIZ.getSignalBinder().invoke(this.LIZ).toString());
        return t == null ? (T) this.LIZJ.LIZ() : t;
    }

    public C0Q47(C650960Pg6 c650960Pg6, C0Q4F c0q4f, C0Q46<T> c0q46) {
        this.LIZ = c650960Pg6;
        this.LIZIZ = c0q4f;
        this.LIZJ = c0q46;
    }
}
