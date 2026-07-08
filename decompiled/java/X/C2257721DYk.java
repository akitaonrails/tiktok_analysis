package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.1DYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257721DYk {
    public static final IntRange LJI = new IntRange(917536, 917631);
    public static final Set<Integer> LJII = C13LQ.LJLIIL(new Integer[]{127995, 127996, 127997, 127998, 127999});
    public int LIZJ;
    public int LIZLLL;
    public int LJFF;
    public final Set<Integer> LIZ = C15442062u.LJIIIZ(C15442062u.LJIIIZ(C13LQ.LJLIIL(new Integer[]{65038, 65039, 8419}), LJI), LJII);
    public final List<C2257741DYm> LIZIZ = new ArrayList();
    public C2257741DYm LJ = new C2257741DYm(0);

    /* JADX WARN: Removed duplicated region for block: B:23:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(int r3) {
        /*
            r0 = 127488(0x1f200, float:1.78649E-40)
            r2 = 1
            if (r0 > r3) goto Lb
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r3 >= r0) goto L39
        La:
            return r2
        Lb:
            r0 = 8986(0x231a, float:1.2592E-41)
            if (r0 > r3) goto L2c
            r0 = 9216(0x2400, float:1.2914E-41)
            if (r3 < r0) goto La
            r1 = 9312(0x2460, float:1.3049E-41)
            r0 = 9472(0x2500, float:1.3273E-41)
            if (r1 > r3) goto L2c
            if (r3 < r0) goto La
            r0 = 12288(0x3000, float:1.7219E-41)
            if (r3 < r0) goto La
            r0 = 12800(0x3200, float:1.7937E-41)
            if (r0 > r3) goto L28
            r0 = 13056(0x3300, float:1.8295E-41)
            if (r3 >= r0) goto L39
            return r2
        L28:
            r0 = 12336(0x3030, float:1.7286E-41)
            if (r3 == r0) goto La
        L2c:
            r0 = 169(0xa9, float:2.37E-43)
            if (r3 == r0) goto La
            r0 = 174(0xae, float:2.44E-43)
            if (r3 == r0) goto La
            r0 = 8482(0x2122, float:1.1886E-41)
            if (r3 != r0) goto L39
            return r2
        L39:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257721DYk.LIZIZ(int):boolean");
    }

    public final void LIZ() {
        this.LJFF = 0;
        if (!this.LJ.LIZ.isEmpty()) {
            ((ArrayList) this.LIZIZ).add(this.LJ);
            this.LJ = new C2257741DYm(0);
        }
    }

    public final void LIZJ() {
        this.LJ.LIZ.add(Integer.valueOf(this.LIZLLL));
        this.LIZJ += Character.charCount(this.LIZLLL);
    }
}
