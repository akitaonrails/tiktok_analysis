package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565240MEw {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final boolean LIZLLL;
    public final EnumC565210MEt LJ;
    public final Function0<Unit> LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C565240MEw() {
        float f = 0.0f;
        this(f, f, false, null, 63);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C565240MEw(float f, float f2, boolean z, EnumC565210MEt enumC565210MEt, int i) {
        AFwS194S0000000_8 aFwS194S0000000_8;
        EnumC565210MEt enumC565210MEt2 = enumC565210MEt;
        boolean z2 = z;
        float f3 = f2;
        float f4 = (i & 1) != 0 ? 1.0f : f;
        f3 = (i & 4) != 0 ? 0.0f : f3;
        z2 = (i & 8) != 0 ? false : z2;
        enumC565210MEt2 = (i & 16) != 0 ? EnumC565210MEt.NONE : enumC565210MEt2;
        if ((i & 32) != 0) {
            aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(276);
        } else {
            aFwS194S0000000_8 = null;
        }
        this(f4, 0.0f, f3, z2, enumC565210MEt2, aFwS194S0000000_8);
    }

    public C565240MEw(float f, float f2, float f3, boolean z, EnumC565210MEt enumC565210MEt, Function0<Unit> function0) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = z;
        this.LJ = enumC565210MEt;
        this.LJFF = function0;
    }
}
