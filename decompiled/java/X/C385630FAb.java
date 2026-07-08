package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385630FAb {
    public static final float LIZ(BaseStickerModel baseStickerModel) {
        int i = C390590FTd.LIZ[baseStickerModel.getHighlightState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 0.3137255f;
                }
                throw new C1954807lC();
            }
            return baseStickerModel.getAlpha();
        }
        return 1.0f;
    }

    public static final boolean LIZIZ(BaseStickerModel baseStickerModel) {
        if (!Intrinsics.LJFF(baseStickerModel.getStickerSource(), "2") && !Intrinsics.LJFF(baseStickerModel.getStickerSource(), "1")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(BaseStickerModel baseStickerModel) {
        if (baseStickerModel.getStartTime() >= 0.0f && baseStickerModel.getEndTime() > 0.0f && baseStickerModel.getStartTime() < baseStickerModel.getEndTime()) {
            return true;
        }
        return false;
    }

    public static final void LJ(BaseStickerModel baseStickerModel, float f) {
        baseStickerModel.setStartTime(0.0f);
        baseStickerModel.setEndTime(f);
    }

    public static void LIZLLL(BaseStickerModel baseStickerModel, float f, float f2) {
        baseStickerModel.setStartTime(f);
        baseStickerModel.setEndTime(Math.min(f + 3000.0f, f2));
    }
}
