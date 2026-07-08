package X;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kGA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1312520kGA {
    public final String LIZ;
    public final Method LIZIZ;
    public final Integer LIZJ;

    public abstract Object LIZ(C1311730kEt c1311730kEt);

    public AbstractC1312520kGA(InterfaceC1312540kGC interfaceC1312540kGC, Method method) {
        this.LIZ = interfaceC1312540kGC.name();
        if (!"__default_type__".equals(interfaceC1312540kGC.customType())) {
            interfaceC1312540kGC.customType();
        }
        this.LIZIZ = method;
        this.LIZJ = null;
    }

    public AbstractC1312520kGA(InterfaceC1312530kGB interfaceC1312530kGB, Method method, int i) {
        this.LIZ = interfaceC1312530kGB.names()[i];
        if (!"__default_type__".equals(interfaceC1312530kGB.customType())) {
            interfaceC1312530kGB.customType();
        }
        this.LIZIZ = method;
        this.LIZJ = Integer.valueOf(i);
    }
}
