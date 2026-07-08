package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OVT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVT {
    public static final /* synthetic */ int LJIIJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Pair<String, String> LJFF;
    public final Integer LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final Integer LJIIIZ;

    public C0OVT() {
        this(null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OVT)) {
            return false;
        }
        C0OVT c0ovt = (C0OVT) obj;
        return Intrinsics.LJFF(this.LIZ, c0ovt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ovt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ovt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ovt.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ovt.LJ) && Intrinsics.LJFF(this.LJFF, c0ovt.LJFF) && Intrinsics.LJFF(this.LJI, c0ovt.LJI) && Intrinsics.LJFF(this.LJII, c0ovt.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0ovt.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0ovt.LJIIIZ);
    }

    public /* synthetic */ C0OVT(Pair pair, int i) {
        this(null, null, null, null, null, (i & 32) != 0 ? null : pair, null, null, null, null);
    }

    public static C0OVT LIZ(C0OVT c0ovt, Integer num) {
        String str = c0ovt.LIZ;
        String str2 = c0ovt.LIZIZ;
        String str3 = c0ovt.LIZJ;
        String str4 = c0ovt.LIZLLL;
        String str5 = c0ovt.LJ;
        Pair<String, String> pair = c0ovt.LJFF;
        String str6 = c0ovt.LJII;
        String str7 = c0ovt.LJIIIIZZ;
        Integer num2 = c0ovt.LJIIIZ;
        c0ovt.getClass();
        return new C0OVT(str, str2, str3, str4, str5, pair, num, str6, str7, num2);
    }

    public C0OVT(String str, String str2, String str3, String str4, String str5, Pair<String, String> pair, Integer num, String str6, String str7, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = pair;
        this.LJI = num;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = num2;
    }
}
