package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912220ZqW {
    public static final C1331100kk8 LIZIZ(Context context, float f, float f2, float f3, float f4) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C1331100kk8 c1331100kk8LIZIZ = C1331100kk8.LIZIZ(f, f2, f3, f4);
        c1331100kk8LIZIZ.LIZ = EnumC1321320kUM.OVERLAY_COLOR;
        c1331100kk8LIZIZ.LJIIIIZZ(iIntValue);
        return c1331100kk8LIZIZ;
    }

    public static final EnumC912210ZqV LIZ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (z7) {
            return EnumC912210ZqV.NO_PADDING;
        }
        if (z) {
            if (z4) {
                return EnumC912210ZqV.NO_PADDING;
            }
            if (C287620BPc.LIZ()) {
                return EnumC912210ZqV.SPACING_INLINE_NORMAL;
            }
            return EnumC912210ZqV.NEW_INLINE_TO_NORMAL;
        }
        if (z5) {
            if (z2) {
                return EnumC912210ZqV.LAST_IN_SEQ_TO_SELF;
            }
            if (z6) {
                return EnumC912210ZqV.NEW_NORMAL_TO_QUOTED;
            }
            if (z3) {
                return EnumC912210ZqV.EMOJI_VIEW_TO_SELF_MESSAGE;
            }
            return EnumC912210ZqV.NORMAL_TO_NORMAL;
        }
        if (z4) {
            if (C287620BPc.LIZ()) {
                return EnumC912210ZqV.SPACING_INLINE_NORMAL;
            }
            return EnumC912210ZqV.NORMAL_TO_INLINE;
        }
        if (C287620BPc.LIZ()) {
            return EnumC912210ZqV.SPACING_DIFFERENT_USER;
        }
        return EnumC912210ZqV.NEW_LAST_IN_SEQ_TO_NORMAL;
    }
}
