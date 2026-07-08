package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655770tBn implements InterfaceC1655950tC5 {
    public static final /* synthetic */ int LIZJ = 0;
    public final Function2<String, Boolean, Unit> LIZ;
    public final Set<InterfaceC1655950tC5> LIZIZ = C1664790tQL.LIZJ();

    @Override // X.InterfaceC1655950tC5
    public final boolean LIZIZ() {
        Set<InterfaceC1655950tC5> set = this.LIZIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1655950tC5) it2.next()).LIZIZ()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1655950tC5
    public final boolean LIZJ() {
        Set<InterfaceC1655950tC5> set = this.LIZIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC1655950tC5) it2.next()).LIZJ()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1655950tC5
    public final void destroy() {
        Iterator<T> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1655950tC5) it2.next()).destroy();
        }
    }

    public C1655770tBn(Function2 function2) {
        this.LIZ = function2;
    }

    @Override // X.InterfaceC1655950tC5
    public final boolean LIZ(String str) {
        Set<InterfaceC1655950tC5> set = this.LIZIZ;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it2 = set.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((InterfaceC1655950tC5) it2.next()).LIZ(str)) {
                    z = true;
                    break;
                }
            }
        }
        this.LIZ.invoke(str, Boolean.valueOf(z));
        return z;
    }

    public final void LIZLLL(InterfaceC1655950tC5 interfaceC1655950tC5) {
        if (interfaceC1655950tC5 == null || this.LIZIZ.contains(interfaceC1655950tC5)) {
            return;
        }
        this.LIZIZ.add(interfaceC1655950tC5);
    }
}
