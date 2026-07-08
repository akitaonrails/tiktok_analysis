package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778410UgB extends AbstractC777950UfR {
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

    public C778410UgB(String str) {
        EnumC777930UfP enumC777930UfP;
        String strLJIJI;
        this.LJ = str;
        if (Intrinsics.LJFF(str, "lost")) {
            enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P1;
        } else {
            enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P3;
        }
        this.LJFF = enumC777930UfP;
        this.LJI = EnumC777480Ueg.AUDIO_FOCUS;
        if (Intrinsics.LJFF(str, "lost")) {
            C1124870fNV.LIZJ().getClass();
            strLJIJI = C1124870fNV.LIZIZ("pm_mt_ls_microphoneConflict_modal_body");
            if (strLJIJI == null || strLJIJI.length() == 0) {
                strLJIJI = C497740JfY.LJIJI(2131842973);
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843080);
        }
        this.LJII = strLJIJI;
        if (Intrinsics.LJFF(str, "lost")) {
            this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UgL
                public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

                @Override // X.AbstractC777790UfB
                public final EnumC777770Uf9 LIZ() {
                    return this.LIZ;
                }
            };
            this.LIZ = new AbstractC777790UfB() { // from class: X.0UgM
                public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CIRCLE_WARNING_RED;

                @Override // X.AbstractC777790UfB
                public final EnumC777770Uf9 LIZ() {
                    return this.LIZ;
                }
            };
        }
        this.LIZLLL = str;
    }
}
