package X;

import androidx.compose.runtime.s;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13DO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DO<T> {
    public final AbstractC19973513Cz<T> LIZ;
    public final boolean LIZIZ;
    public final C13FF<T> LIZJ;
    public final boolean LJFF;
    public final T LJI;
    public final C05P0<T> LIZLLL = null;
    public final Function1<InterfaceC1670270tZB, T> LJ = null;
    public boolean LJII = true;

    public final T LIZ() {
        if (this.LIZIZ) {
            return null;
        }
        C05P0<T> c05p0 = this.LIZLLL;
        if (c05p0 != null) {
            return c05p0.getValue();
        }
        T t = this.LJI;
        if (t != null) {
            return t;
        }
        s.LIZLLL("Unexpected form of a provided value");
        throw new C2197108jB();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13DO(AbstractC19973513Cz abstractC19973513Cz, Object obj, boolean z, C13FF c13ff, boolean z2) {
        this.LIZ = abstractC19973513Cz;
        this.LIZIZ = z;
        this.LIZJ = c13ff;
        this.LJFF = z2;
        this.LJI = obj;
    }
}
