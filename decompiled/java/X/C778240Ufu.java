package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ufu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778240Ufu extends AbstractC777950UfR {
    public final String LJ;
    public final EnumC777930UfP LJFF = EnumC777930UfP.PRIORITY_TYPE_P1;
    public final EnumC777480Ueg LJI = EnumC777480Ueg.PUSH_STREAM;
    public final CharSequence LJII;

    @Override // X.AbstractC777950UfR
    public final EnumC777930UfP LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC777950UfR
    public final CharSequence LIZLLL() {
        return this.LJII;
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777480Ueg LJ() {
        return this.LJI;
    }

    public C778240Ufu(String str) {
        String strLJIJI;
        this.LJ = str;
        if (Intrinsics.LJFF(str, "error")) {
            strLJIJI = C497740JfY.LJIJI(2131843646);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843638);
        }
        this.LJII = strLJIJI;
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UgO
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        this.LIZ = new AbstractC777790UfB() { // from class: X.0UgP
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CIRCLE_WARNING_RED;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        this.LIZLLL = str;
    }
}
