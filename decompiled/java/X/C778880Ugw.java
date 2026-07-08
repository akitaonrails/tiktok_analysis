package X;

import com.bytedance.android.livesdk.model.message.PlayTogetherMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ugw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778880Ugw extends AbstractC777950UfR {
    public final String LJ;
    public final String LJFF;
    public final PlayTogetherMessage LJI;
    public final Integer LJII;
    public final EnumC777930UfP LJIIIIZZ = EnumC777930UfP.PRIORITY_TYPE_P3;
    public final EnumC777480Ueg LJIIIZ = EnumC777480Ueg.PLAY_TOGETHER;
    public final CharSequence LJIIJ;

    @Override // X.AbstractC777950UfR
    public final int LIZIZ() {
        Integer num;
        return (!Intrinsics.LJFF(this.LJFF, "revenue_tips") || (num = this.LJII) == null) ? super.LIZIZ() : num.intValue();
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777930UfP LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC777950UfR
    public final CharSequence LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC777950UfR
    public final EnumC777480Ueg LJ() {
        return this.LJIIIZ;
    }

    public C778880Ugw(String str, CharSequence charSequence, String str2, PlayTogetherMessage playTogetherMessage, Integer num) {
        String strLJIJI;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = playTogetherMessage;
        this.LJII = num;
        this.LJIIJ = charSequence;
        this.LIZIZ = new AbstractC777790UfB(this) { // from class: X.0Ugx
            public final EnumC777770Uf9 LIZ;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }

            {
                EnumC777770Uf9 enumC777770Uf9;
                if (Intrinsics.LJFF(this.LJ, "back")) {
                    enumC777770Uf9 = EnumC777770Uf9.BACK;
                } else {
                    enumC777770Uf9 = EnumC777770Uf9.NULL;
                }
                this.LIZ = enumC777770Uf9;
            }
        };
        this.LIZ = new AbstractC778620UgW() { // from class: X.0Ugv
            public final String LIZ = "tiktok_live_game_demand_2";
            public final String LIZIZ = "ttlive_ic_play_together.png";

            @Override // X.AbstractC778620UgW
            public final String LIZ() {
                return this.LIZ;
            }

            @Override // X.AbstractC778620UgW
            public final String LIZIZ() {
                return this.LIZIZ;
            }
        };
        if (Intrinsics.LJFF(str, "pass")) {
            strLJIJI = C497740JfY.LJIJI(2131855146);
        } else {
            strLJIJI = null;
        }
        this.LIZJ = strLJIJI;
    }
}
