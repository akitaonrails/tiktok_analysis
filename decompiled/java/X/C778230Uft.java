package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778230Uft extends AbstractC777950UfR {
    public final String LJ;
    public final EnumC777930UfP LJFF = EnumC777930UfP.PRIORITY_TYPE_P0;
    public final EnumC777480Ueg LJI = EnumC777480Ueg.INTERRUPTED;
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

    public C778230Uft(String str) {
        String strLJIJI;
        this.LJ = str;
        if (Intrinsics.LJFF(str, "error")) {
            strLJIJI = C497740JfY.LJIJI(2131841807);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131840704);
        }
        this.LJII = strLJIJI;
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UgN
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        this.LIZ = new AbstractC777790UfB(this) { // from class: X.0UgE
            public final EnumC777770Uf9 LIZ;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }

            {
                EnumC777770Uf9 enumC777770Uf9;
                if (Intrinsics.LJFF(this.LJ, "error")) {
                    enumC777770Uf9 = EnumC777770Uf9.CIRCLE_WARNING_WHITE;
                } else {
                    enumC777770Uf9 = EnumC777770Uf9.NULL;
                }
                this.LIZ = enumC777770Uf9;
            }
        };
        this.LIZLLL = str;
    }
}
