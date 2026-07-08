package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ueh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777490Ueh extends AbstractC777950UfR {
    public final String LJ;
    public final EnumC777930UfP LJFF;
    public final EnumC777480Ueg LJI;
    public final CharSequence LJII;

    @Override // X.AbstractC777950UfR
    public final int LIZIZ() {
        if (Intrinsics.LJFF(this.LJ, "TOAST_MESSAGE_SUGGEST") || Intrinsics.LJFF(this.LJ, "RESULT_NOTIFY") || Intrinsics.LJFF(this.LJ, "USER_REQ_MESSAGE") || Intrinsics.LJFF(this.LJ, "MODERATOR")) {
            return 10;
        }
        return super.LIZIZ();
    }

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

    public C777490Ueh(String str, CharSequence charSequence) {
        EnumC777930UfP enumC777930UfP;
        this.LJ = str;
        if (!Intrinsics.LJFF(str, "TOAST_MESSAGE_SUGGEST") && !Intrinsics.LJFF(str, "RESULT_NOTIFY") && !Intrinsics.LJFF(str, "USER_REQ_MESSAGE") && !Intrinsics.LJFF(str, "MODERATOR")) {
            enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P2;
        } else {
            enumC777930UfP = EnumC777930UfP.PRIORITY_TYPE_P1;
        }
        this.LJFF = enumC777930UfP;
        this.LJI = EnumC777480Ueg.GUESS;
        this.LJII = charSequence;
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Ueu
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        this.LIZ = new AbstractC777520Uek() { // from class: X.0Uel
            public final int LIZ;

            @Override // X.AbstractC777520Uek
            public final int LIZIZ() {
                return R.attr.dtw;
            }

            {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c9j, C497740JfY.LJII());
                this.LIZ = numLIZJ != null ? numLIZJ.intValue() : -1;
            }

            @Override // X.AbstractC777520Uek
            public final int LIZ() {
                return this.LIZ;
            }
        };
    }
}
