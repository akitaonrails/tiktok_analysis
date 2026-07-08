package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1DoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267041DoM extends C2267051DoN {
    public final InterfaceC1690500u5o LJFF;
    public EnumC1671200tag LJII;
    public long LJI = C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final List<Object> LJIIIIZZ = new ArrayList();
    public boolean LJIIIZ = true;
    public final Set<C2267081DoQ> LJIIJ = new LinkedHashSet();

    public C2267041DoM(InterfaceC1690500u5o interfaceC1690500u5o) {
        this.LJFF = interfaceC1690500u5o;
    }

    @Override // X.C2267051DoN
    public final int LIZIZ(Object obj) {
        if (obj instanceof C1668650tWZ) {
            return this.LJFF.LJLLJ(((C1668650tWZ) obj).LL);
        }
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }
}
