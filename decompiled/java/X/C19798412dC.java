package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12dC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19798412dC implements InterfaceC19797112cz {
    public final String LL;
    public final ArrayList<InterfaceC19797112cz> LLILLJJLI;

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        return this;
    }

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        return null;
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<InterfaceC19797112cz> arrayList = this.LLILLJJLI;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19798412dC)) {
            return false;
        }
        C19798412dC c19798412dC = (C19798412dC) obj;
        String str = this.LL;
        if (str != null) {
            if (!str.equals(c19798412dC.LL)) {
                return false;
            }
        } else if (c19798412dC.LL != null) {
            return false;
        }
        ArrayList<InterfaceC19797112cz> arrayList = this.LLILLJJLI;
        ArrayList<InterfaceC19797112cz> arrayList2 = c19798412dC.LLILLJJLI;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        if (arrayList2 == null) {
            return true;
        }
        return false;
    }

    public C19798412dC(String str, List<InterfaceC19797112cz> list) {
        this.LL = str;
        ArrayList<InterfaceC19797112cz> arrayList = new ArrayList<>();
        this.LLILLJJLI = arrayList;
        arrayList.addAll(list);
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
