package X;

import X.InterfaceC111300bX;

/* JADX INFO: renamed from: X.062P, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C062P<T extends InterfaceC111300bX> {
    public T LIZ;
    public String LIZIZ;
    public C19719912Dl LIZJ;

    public final C443120HZe<String, T, C13IQ<? extends T>> LIZ() {
        String str = this.LIZIZ;
        T t = this.LIZ;
        T t2 = t != null ? t : null;
        C19719912Dl c19719912DlLIZ = this.LIZJ;
        if (c19719912DlLIZ == null) {
            if (t == null) {
                t = null;
            }
            c19719912DlLIZ = C13LE.LIZ(t.getClass());
        }
        return new C443120HZe<>(str, t2, c19719912DlLIZ);
    }
}
