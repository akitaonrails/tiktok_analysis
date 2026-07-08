package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameMomentQuickCommentBroadcastSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ufl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778150Ufl extends AbstractC777950UfR {
    public final String LJ;
    public final String LJFF;
    public final ImageModel LJI;
    public final C204543151x LJII;
    public final EnumC777930UfP LJIIIIZZ;
    public final EnumC777480Ueg LJIIIZ;
    public final CharSequence LJIIJ;

    @Override // X.AbstractC777950UfR
    public final int LIZ() {
        String str = this.LJFF;
        if (Intrinsics.LJFF(str, "sub_goal_completed") || Intrinsics.LJFF(str, "live_goal_completed")) {
            return -15686971;
        }
        return super.LIZ();
    }

    @Override // X.AbstractC777950UfR
    public final int LIZIZ() {
        if (Intrinsics.LJFF(this.LJ, "game_moment")) {
            return 8;
        }
        return super.LIZIZ();
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

    public C778150Ufl(String str, String str2, CharSequence charSequence, ImageModel imageModel, C204543151x c204543151x) {
        InterfaceC778710Ugf c778360Ug6;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = imageModel;
        this.LJII = c204543151x;
        this.LJIIIIZZ = EnumC777930UfP.PRIORITY_TYPE_P2;
        this.LJIIIZ = EnumC777480Ueg.GAME_INTERACTION;
        this.LJIIJ = charSequence;
        this.LIZIZ = new AbstractC777790UfB() { // from class: X.0UgG
            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CLOSE;

            @Override // X.AbstractC777790UfB
            public final EnumC777770Uf9 LIZ() {
                return this.LIZ;
            }
        };
        if (imageModel == null) {
            c778360Ug6 = new InterfaceC778710Ugf() { // from class: X.0Ufk
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.InterfaceC778710Ugf
                public final C778580UgS getIcon() {
                    String str3 = this.LIZ.LJ;
                    switch (str3.hashCode()) {
                        case -2079956558:
                            if (str3.equals("sub_goal")) {
                                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.c4m), null);
                            }
                            return null;
                        case -158253331:
                            if (str3.equals("game_moment")) {
                                this.LIZ.getClass();
                                int leftIconStyle = LiveGameMomentQuickCommentBroadcastSetting.INSTANCE.getLeftIconStyle();
                                return leftIconStyle != 2 ? (leftIconStyle == 3 || leftIconStyle == 4) ? new C778580UgS(C497740JfY.LJIIJ(R.drawable.c6c), null) : new C778580UgS(C497740JfY.LJIIJ(R.drawable.c6e), null) : new C778580UgS(C497740JfY.LJIIJ(R.drawable.c7j), null);
                            }
                            return null;
                        case -119349189:
                            if (str3.equals("treasure_box")) {
                                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.c4n), null);
                            }
                            return null;
                        case 1400452261:
                            if (str3.equals("goody_bag")) {
                                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.c4l), null);
                            }
                            return null;
                        default:
                            return null;
                    }
                }
            };
        } else {
            c778360Ug6 = new C778360Ug6(this);
        }
        this.LIZ = c778360Ug6;
    }

    public /* synthetic */ C778150Ufl(String str, String str2, CharSequence charSequence, ImageModel imageModel, int i) {
        this(str, str2, charSequence, (i & 8) != 0 ? null : imageModel, (C204543151x) null);
    }
}
