package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19795912cn implements InterfaceC19797012cy, InterfaceC19797112cz {
    public final String LL;
    public final Map<String, InterfaceC19797112cz> LLILLJJLI = new HashMap();

    public abstract InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list);

    public InterfaceC19797112cz LIZIZ() {
        return this;
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        return Double.valueOf(Double.NaN);
    }

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        return new C19796112cp(((HashMap) this.LLILLJJLI).keySet().iterator());
    }

    public final int hashCode() {
        String str = this.LL;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        return this.LL;
    }

    public AbstractC19795912cn(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC19797012cy
    public final InterfaceC19797112cz LJIIIIZZ(String str) {
        if (((HashMap) this.LLILLJJLI).containsKey(str)) {
            return (InterfaceC19797112cz) ((HashMap) this.LLILLJJLI).get(str);
        }
        return InterfaceC19797112cz.LJIILIIL;
    }

    @Override // X.InterfaceC19797012cy
    public final boolean LJIIIZ(String str) {
        return ((HashMap) this.LLILLJJLI).containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC19795912cn)) {
            return false;
        }
        AbstractC19795912cn abstractC19795912cn = (AbstractC19795912cn) obj;
        String str = this.LL;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC19795912cn.LL);
    }

    @Override // X.InterfaceC19797012cy
    public final void LJIIJJI(String str, InterfaceC19797112cz interfaceC19797112cz) {
        if (interfaceC19797112cz == null) {
            ((HashMap) this.LLILLJJLI).remove(str);
        } else {
            ((HashMap) this.LLILLJJLI).put(str, interfaceC19797112cz);
        }
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        if ("toString".equals(str)) {
            return new C19797512d3(this.LL);
        }
        return C19796712cv.LIZ(this, new C19797512d3(str), c19795712cl, list);
    }
}
