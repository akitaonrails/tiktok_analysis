package X;

/* JADX INFO: renamed from: X.0WB7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WB7<T> implements InterfaceC812380Vts<T> {
    public static final C0WB9 LIZJ = new C0WB8() { // from class: X.0WB9
    };
    public static final C0WBA LIZLLL = new InterfaceC812380Vts() { // from class: X.0WBA
        @Override // X.InterfaceC812380Vts
        public final Object get() {
            return null;
        }
    };
    public C0WB8<T> LIZ;
    public volatile InterfaceC812380Vts<T> LIZIZ;

    public C0WB7() {
        C0WB9 c0wb9 = LIZJ;
        C0WBA c0wba = LIZLLL;
        this.LIZ = c0wb9;
        this.LIZIZ = c0wba;
    }

    @Override // X.InterfaceC812380Vts
    public final T get() {
        return this.LIZIZ.get();
    }
}
