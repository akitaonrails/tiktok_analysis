package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193061AsK {
    public static final ConcurrentHashSet<Integer> LJFF = new ConcurrentHashSet<>();
    public static final ConcurrentHashSet<Integer> LJI = new ConcurrentHashSet<>();
    public static final ConcurrentHashSet<Integer> LJII = new ConcurrentHashSet<>();
    public static final ConcurrentHashSet<Integer> LJIIIIZZ = new ConcurrentHashSet<>();
    public final C19720512Dr LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2193061AsK)) {
            return false;
        }
        C2193061AsK c2193061AsK = (C2193061AsK) obj;
        return Intrinsics.LJFF(this.LIZ, c2193061AsK.LIZ) && this.LIZIZ == c2193061AsK.LIZIZ && this.LIZJ == c2193061AsK.LIZJ && this.LIZLLL == c2193061AsK.LIZLLL && this.LJ == c2193061AsK.LJ;
    }

    public C2193061AsK(C19720512Dr c19720512Dr) {
        boolean zContains = LJFF.contains(Integer.valueOf(c19720512Dr.hashCode()));
        boolean zContains2 = LJI.contains(Integer.valueOf(c19720512Dr.hashCode()));
        boolean zContains3 = LJII.contains(Integer.valueOf(c19720512Dr.hashCode()));
        boolean zContains4 = LJIIIIZZ.contains(Integer.valueOf(c19720512Dr.hashCode()));
        this.LIZ = c19720512Dr;
        this.LIZIZ = zContains;
        this.LIZJ = zContains2;
        this.LIZLLL = zContains3;
        this.LJ = zContains4;
    }
}
