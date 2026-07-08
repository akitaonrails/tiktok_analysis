package X;

/* JADX INFO: renamed from: X.13Ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19971813Ci extends C19971113Cb<AbstractC19973513Cz<Object>, InterfaceC19973313Cx<Object>> {
    public C19971913Cj LLIZ;

    @Override // X.C19971113Cb, X.C13D3
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final C19971913Cj build() {
        Object obj = this.LLILLL;
        C19971913Cj c19971913Cj = this.LLIZ;
        if (obj != c19971913Cj.LLILLJJLI) {
            this.LLILLJJLI = new C19972913Ct();
            c19971913Cj = new C19971913Cj(this.LLILLL, LIZJ());
        }
        this.LLIZ = c19971913Cj;
        return c19971913Cj;
    }

    public C19971813Ci(C19971913Cj c19971913Cj) {
        super(c19971913Cj);
        this.LLIZ = c19971913Cj;
    }

    @Override // X.C19971113Cb, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AbstractC19973513Cz)) {
            return false;
        }
        return super.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof InterfaceC19973313Cx)) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // X.C19971113Cb, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof AbstractC19973513Cz)) {
            return null;
        }
        return super.get(obj);
    }

    @Override // X.C19971113Cb, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof AbstractC19973513Cz)) {
            return null;
        }
        return super.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AbstractC19973513Cz)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }
}
