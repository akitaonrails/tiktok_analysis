package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554580qYa extends C09AY implements Function0<C1554540qYW> {
    public C1554580qYa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0qYW] */
    @Override // kotlin.jvm.functions.Function0
    public final C1554540qYW invoke() {
        return new InterfaceC738300Sxg() { // from class: X.0qYW
            @Override // X.InterfaceC738300Sxg
            public final Class<Object> LIZ(Class<?> cls) {
                return C1554530qYV.LIZIZ(cls);
            }

            @Override // X.InterfaceC738300Sxg
            public final Class<?>[] LIZIZ(Class<?> cls) {
                Class<?>[] clsArrLIZ = C1554530qYV.LIZ(cls.getCanonicalName());
                Class<?>[] clsArr = null;
                if (clsArrLIZ != null) {
                    clsArr = new Class[clsArrLIZ.length];
                    for (int i = 0; i < clsArrLIZ.length; i++) {
                        clsArr[i] = clsArrLIZ[i];
                    }
                }
                if (!(clsArr instanceof Class[]) || clsArr == null) {
                    return new Class[0];
                }
                return clsArr;
            }
        };
    }
}
