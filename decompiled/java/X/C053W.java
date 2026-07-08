package X;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.053W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053W {
    public static final C12904053e LJII = new Object() { // from class: X.053e
    };
    public static final C053W LJIIIIZZ = new C053W("null", C12918053s.LJ, C12911053l.LIZ, C12916053q.LIZ);
    public final String LIZ;
    public final C12918053s LIZIZ;
    public final C053Z LIZJ;
    public final InterfaceC12901053b LIZLLL;
    public final String LJ;
    public final C01GW LJFF;
    public final String LJI;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C053W)) {
            return false;
        }
        C053W c053w = (C053W) obj;
        if (!Intrinsics.LJFF(c053w.LIZ, this.LIZ) || !Intrinsics.LJFF(c053w.LIZIZ, this.LIZIZ) || !Intrinsics.LJFF(c053w.LIZJ, this.LIZJ) || !Intrinsics.LJFF(c053w.LIZLLL, this.LIZLLL)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C053W(String str, C12918053s c12918053s, C053Z c053z, InterfaceC12901053b interfaceC12901053b) {
        this(str, c12918053s, c053z, interfaceC12901053b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C053W(java.lang.String r4, X.C12918053s r5, X.C053Z r6, X.InterfaceC12901053b r7, java.lang.String r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.LIZ = r4
            r3.LIZIZ = r5
            r3.LIZJ = r6
            r3.LIZLLL = r7
            r3.LJ = r8
            X.053Q r0 = new X.053Q
            r0.<init>(r3)
            X.01GW r2 = X.C452501pT.LIZIZ(r0)
            r3.LJFF = r2
            X.053e r0 = X.C053W.LJII
            r0.getClass()
            if (r8 == 0) goto L38
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r8)
            r0 = 95
            r1.append(r0)
            java.lang.String r0 = r5.LIZ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L3e
        L38:
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
        L3e:
            r3.LJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C053W.<init>(java.lang.String, X.053s, X.053Z, X.053b, java.lang.String):void");
    }
}
