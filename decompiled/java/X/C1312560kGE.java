package X;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0kGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1312560kGE extends AbstractC1312520kGA {
    public final long LIZLLL;

    @Override // X.AbstractC1312520kGA
    public final Object LIZ(C1311730kEt c1311730kEt) {
        String str = this.LIZ;
        long j = this.LIZLLL;
        if (!c1311730kEt.LIZ.isNull(str)) {
            j = c1311730kEt.LIZ.getLong(str);
        }
        return Long.valueOf(j);
    }

    public C1312560kGE(InterfaceC1312540kGC interfaceC1312540kGC, Method method) {
        super(interfaceC1312540kGC, method);
        this.LIZLLL = 0L;
    }

    public C1312560kGE(InterfaceC1312530kGB interfaceC1312530kGB, Method method, int i) {
        super(interfaceC1312530kGB, method, i);
        this.LIZLLL = 0L;
    }
}
