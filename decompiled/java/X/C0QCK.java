package X;

/* JADX INFO: renamed from: X.0QCK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QCK<T> implements InterfaceC1731706qJ<Object, C0QSI<T>> {
    public final Class<T> LL;
    public C0QSI<T> LLILLJJLI;

    public C0QCK(Class<T> cls) {
        this.LL = cls;
    }

    public final C0QSI LIZ(Object obj) {
        InterfaceC1146704e9 interfaceC1146704e9;
        if ((obj instanceof InterfaceC1146704e9) && (interfaceC1146704e9 = (InterfaceC1146704e9) obj) != null) {
            C0QSI<T> c0qsi = this.LLILLJJLI;
            if (c0qsi == null) {
                C0QSI<T> c0qsi2 = new C0QSI<>(this.LL, interfaceC1146704e9.getParentScopes());
                this.LLILLJJLI = c0qsi2;
                return c0qsi2;
            }
            return c0qsi;
        }
        throw new IllegalStateException("by lazyAbility() only work for the classes which annotation with @ParentScope.");
    }

    @Override // X.InterfaceC1731706qJ
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        return LIZ(obj);
    }
}
