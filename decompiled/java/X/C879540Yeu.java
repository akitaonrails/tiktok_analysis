package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yeu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879540Yeu<T> {
    public final InterfaceC1490905sZ<T> LIZ;
    public final InterfaceC1491305sd LIZIZ;
    public final T LIZJ;
    public final Map<AbstractC1491605sg<?>, C1490405sU<?>> LIZLLL;
    public final Map<AbstractC886530YqB<?, ?>, C882270YjJ<?, ?>> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C879540Yeu)) {
            return false;
        }
        C879540Yeu c879540Yeu = (C879540Yeu) obj;
        return Intrinsics.LJFF(this.LIZ, c879540Yeu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c879540Yeu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c879540Yeu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c879540Yeu.LIZLLL) && Intrinsics.LJFF(this.LJ, c879540Yeu.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        T t = this.LIZJ;
        return ((((iHashCode + (t == null ? 0 : t.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public /* synthetic */ C879540Yeu(InterfaceC1490905sZ interfaceC1490905sZ, InterfaceC1491305sd interfaceC1491305sd, Object obj) {
        this(interfaceC1490905sZ, interfaceC1491305sd, obj, new LinkedHashMap(), new LinkedHashMap());
    }

    public static C879540Yeu LIZ(C879540Yeu c879540Yeu, Map map, Map map2) {
        return new C879540Yeu(c879540Yeu.LIZ, c879540Yeu.LIZIZ, c879540Yeu.LIZJ, map, map2);
    }

    public C879540Yeu(InterfaceC1490905sZ<T> interfaceC1490905sZ, InterfaceC1491305sd interfaceC1491305sd, T t, Map<AbstractC1491605sg<?>, C1490405sU<?>> map, Map<AbstractC886530YqB<?, ?>, C882270YjJ<?, ?>> map2) {
        this.LIZ = interfaceC1490905sZ;
        this.LIZIZ = interfaceC1491305sd;
        this.LIZJ = t;
        this.LIZLLL = map;
        this.LJ = map2;
    }
}
