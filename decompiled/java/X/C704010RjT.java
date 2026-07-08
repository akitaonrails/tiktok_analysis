package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.ab.UnifyTagStyleExpData;
import java.util.List;

/* JADX INFO: renamed from: X.0RjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704010RjT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C427870Gq9 c427870Gq9) {
        int i;
        UnifyTagStyleExpData unifyTagStyleExpDataLIZ = C704020RjU.LIZ();
        if (unifyTagStyleExpDataLIZ != null) {
            i = unifyTagStyleExpDataLIZ.avatarSizeDp;
        } else {
            i = 15;
        }
        if (c427870Gq9 != null) {
            ViewGroup.LayoutParams layoutParams = c427870Gq9.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) C339190DRl.LIZ(i);
                layoutParams.width = (int) C339190DRl.LIZ(i);
            }
            if (c427870Gq9 != null) {
                C786410Ut5.c6(c427870Gq9, layoutParams);
            }
        }
    }

    public static void LIZIZ(View view) {
        int iLIZIZ = C704020RjU.LIZIZ();
        if (view != null) {
            C1744700vVE.LJIIIIZZ((int) C339190DRl.LIZ(iLIZIZ), view);
        }
    }

    public static void LIZJ(TuxIconView tuxIconView) {
        int i;
        UnifyTagStyleExpData unifyTagStyleExpDataLIZ = C704020RjU.LIZ();
        if (unifyTagStyleExpDataLIZ != null) {
            i = unifyTagStyleExpDataLIZ.iconSizeDp;
        } else {
            i = 12;
        }
        if (tuxIconView != null) {
            tuxIconView.setIconWidth((int) C339190DRl.LIZ(i));
            tuxIconView.setIconHeight((int) C339190DRl.LIZ(i));
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) C339190DRl.LIZ(i);
                layoutParams.width = (int) C339190DRl.LIZ(i);
            }
            if (tuxIconView != null) {
                C786410Ut5.M6(tuxIconView, layoutParams);
            }
        }
    }

    public static void LIZLLL(TuxTextView tuxTextView) {
        String str;
        int iIntValue;
        if (tuxTextView != null) {
            UnifyTagStyleExpData unifyTagStyleExpDataLIZ = C704020RjU.LIZ();
            if (unifyTagStyleExpDataLIZ == null || (str = unifyTagStyleExpDataLIZ.textFontProtocol) == null) {
                str = "tux://font?token=P3_SEMIBOLD&from=feed_bottom_tag_style";
            }
            Integer numLIZIZ = C2248361CzK.LIZIZ(str);
            if (numLIZIZ != null) {
                iIntValue = numLIZIZ.intValue();
            } else {
                iIntValue = 72;
            }
            tuxTextView.setTuxFont(iIntValue);
        }
    }

    public static boolean LJ(String str) {
        List<String> list;
        UnifyTagStyleExpData unifyTagStyleExpDataLIZ = C704020RjU.LIZ();
        if (unifyTagStyleExpDataLIZ != null && unifyTagStyleExpDataLIZ.enableWeakenTag) {
            UnifyTagStyleExpData unifyTagStyleExpDataLIZ2 = C704020RjU.LIZ();
            if (unifyTagStyleExpDataLIZ2 != null && (list = unifyTagStyleExpDataLIZ2.scenes) != null && C13LP.LJJJJ(str, list)) {
                return true;
            }
            UnifyTagStyleExpData unifyTagStyleExpDataLIZ3 = C704020RjU.LIZ();
            if (unifyTagStyleExpDataLIZ3 != null && unifyTagStyleExpDataLIZ3.enableAllScene) {
                return true;
            }
            return false;
        }
        return false;
    }
}
