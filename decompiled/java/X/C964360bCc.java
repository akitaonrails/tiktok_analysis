package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964360bCc extends AbstractC21342018fa {
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
        if ((objLJJJLZIJ instanceof C963810bBj) && (objLJJJLZIJ2 instanceof C963810bBj)) {
            C963810bBj c963810bBj = (C963810bBj) objLJJJLZIJ;
            C963810bBj c963810bBj2 = (C963810bBj) objLJJJLZIJ2;
            if (c963810bBj.LIZ == c963810bBj2.LIZ && c963810bBj.LIZIZ == c963810bBj2.LIZIZ) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LIZ);
        Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(i2, this.LIZIZ);
        if ((objLJJJLZIJ instanceof C963810bBj) && (objLJJJLZIJ2 instanceof C963810bBj)) {
            if (((C963810bBj) objLJJJLZIJ).LIZ == ((C963810bBj) objLJJJLZIJ2).LIZ) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(objLJJJLZIJ, objLJJJLZIJ2);
    }
}
