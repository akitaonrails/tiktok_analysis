package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145230fuL extends AbstractC21342018fa {
    public final List<Object> LIZ = new ArrayList();
    public final List<Object> LIZIZ = new ArrayList();

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return ((ArrayList) this.LIZIZ).size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return ((ArrayList) this.LIZ).size();
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LIZ);
        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i2, this.LIZIZ);
        if ((objLJJJLZIJ instanceof C1145280fuQ) && (objLJJJLZIJ2 instanceof C1145280fuQ)) {
            return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
        }
        return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LIZ);
        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i2, this.LIZIZ);
        if ((objLJJJLZIJ instanceof C1145280fuQ) && (objLJJJLZIJ2 instanceof C1145280fuQ)) {
            if (((C1145280fuQ) objLJJJLZIJ).LIZ == ((C1145280fuQ) objLJJJLZIJ2).LIZ) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
    }
}
