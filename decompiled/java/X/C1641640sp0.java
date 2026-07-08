package X;

/* JADX INFO: renamed from: X.0sp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641640sp0<M> {
    public M LIZ;
    public EnumC1641550sor LIZIZ;
    public Throwable LIZJ;

    public static <M> C1641640sp0<M> LIZIZ() {
        C1641640sp0<M> c1641640sp0 = new C1641640sp0<>();
        c1641640sp0.LIZIZ = EnumC1641550sor.LOADING;
        return c1641640sp0;
    }

    public static <T extends Throwable, M> C1641640sp0<M> LIZ(T t) {
        C1641640sp0<M> c1641640sp0 = new C1641640sp0<>();
        c1641640sp0.LIZIZ = EnumC1641550sor.ERROR;
        c1641640sp0.LIZJ = t;
        return c1641640sp0;
    }

    public static <M> C1641640sp0<M> LIZJ(M m) {
        C1641640sp0<M> c1641640sp0 = new C1641640sp0<>();
        c1641640sp0.LIZIZ = EnumC1641550sor.SUCCESS;
        c1641640sp0.LIZ = m;
        return c1641640sp0;
    }

    public static <M> C1641640sp0<M> LIZLLL(EnumC1641550sor enumC1641550sor, M m) {
        C1641640sp0<M> c1641640sp0 = new C1641640sp0<>();
        c1641640sp0.LIZIZ = enumC1641550sor;
        c1641640sp0.LIZ = m;
        return c1641640sp0;
    }
}
