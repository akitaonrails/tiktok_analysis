package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: renamed from: X.0GUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416320GUc {
    public static int LIZ;

    public static int LIZ(Context context, C14J2 c14j2, TuxIconView tuxIconView) {
        int paddingLeft;
        int paddingRight;
        if (context == null) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        }
        int i = 0;
        if (c14j2 != null) {
            paddingLeft = c14j2.getPaddingLeft();
            paddingRight = c14j2.getPaddingRight();
        } else {
            paddingLeft = 0;
            paddingRight = 0;
        }
        int i2 = paddingLeft + paddingRight;
        if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
            i = tuxIconView.getLayoutParams().width;
        }
        return (((C497820Jfg.LIZIZ(context) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - i2) - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
    }
}
