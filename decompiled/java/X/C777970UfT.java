package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777970UfT extends AbstractC777950UfR {
    public final String LJ;
    public final EnumC777930UfP LJFF;
    public final EnumC777480Ueg LJI;
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

    public C777970UfT(String str, CharSequence charSequence) {
        EnumC777930UfP enumC777930UfP;
        this.LJ = str;
        if (Intrinsics.LJFF(str, "success")) {
            enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P2;
        } else {
            enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P3;
        }
        this.LJFF = enumC777930UfP;
        this.LJI = EnumC777480Ueg.HIGHLIGHT;
        this.LJII = charSequence;
        if (Intrinsics.LJFF(str, "success")) {
            this.LIZ = new AbstractC777790UfB() { // from class: X.0UfU
                public final EnumC777770Uf9 LIZ = EnumC777770Uf9.TICK;

                @Override // X.AbstractC777790UfB
                public final EnumC777770Uf9 LIZ() {
                    return this.LIZ;
                }
            };
            this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UfV
                public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

                @Override // X.AbstractC777790UfB
                public final EnumC777770Uf9 LIZ() {
                    return this.LIZ;
                }
            };
            this.LIZJ = C497740JfY.LJIJI(2131841695);
        }
    }
}
