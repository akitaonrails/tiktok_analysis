package X;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472650IgB {
    public static final CharSequence LIZ(TuxTextView tuxTextView, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                LIZJ(tuxTextView, R.attr.eze);
                return C497740JfY.LJIJI(2131854292);
            }
            C158B.LIZJ();
            LIZJ(tuxTextView, R.attr.eyp);
            return C497740JfY.LJIJI(2131854286);
        }
        LIZJ(tuxTextView, R.attr.eze);
        return C497740JfY.LJIJI(2131854290);
    }

    public static final CharSequence LIZIZ(TuxTextView tuxTextView, GuestApplyInfo guestApplyInfo) {
        if (guestApplyInfo == null) {
            return null;
        }
        int i = guestApplyInfo.applyStatus;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            long jLIZJ = C158B.LIZJ();
            long j = guestApplyInfo.permitTime;
            if (jLIZJ < guestApplyInfo.permitExpireTime && j <= jLIZJ) {
                LIZJ(tuxTextView, R.attr.eyp);
                return C497740JfY.LJIJI(2131854286);
            }
            LIZJ(tuxTextView, R.attr.eze);
            return C497740JfY.LJIJI(2131854292);
        }
        LIZJ(tuxTextView, R.attr.eze);
        return C497740JfY.LJIJI(2131854290);
    }

    public static void LIZJ(TuxTextView tuxTextView, int i) {
        int iLIZLLL;
        int iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(2.0f);
        Integer numLIZJ = C1308910kAL.LIZJ(i, tuxTextView.getContext());
        if (numLIZJ != null) {
            iLIZLLL = numLIZJ.intValue();
        } else {
            iLIZLLL = C497740JfY.LIZLLL(i, tuxTextView.getContext());
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(iLIZLLL);
        gradientDrawable.setSize(iLIZIZ, iLIZIZ);
        gradientDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
        tuxTextView.setCompoundDrawablePadding(iLIZIZ2);
        tuxTextView.setCompoundDrawablesRelative(gradientDrawable, null, null, null);
    }
}
