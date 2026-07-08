package X;

import com.ss.android.ugc.aweme.im.common.model.StickerVariant;

/* JADX INFO: renamed from: X.0HSM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HSM {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "mix_studio_enable_animation", false) == 1;
    }

    public static boolean LIZIZ(Integer num) {
        if (LIZ()) {
            StickerVariant.Companion.getClass();
            if (num != null && num.intValue() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }
}
