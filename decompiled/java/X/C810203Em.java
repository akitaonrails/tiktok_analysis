package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C810203Em {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SmartImageView smartImageView, String str) {
        if (smartImageView == null) {
            return;
        }
        if (str != null && str.length() != 0) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            return;
        }
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Integer numValueOf = Integer.valueOf(R.raw.icon_wallet);
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(numValueOf);
        c1331670kl3LIZLLL2.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LIZLLL2);
    }

    public static void LIZIZ(Context context, SmartImageView smartImageView) {
        if (smartImageView == null || context == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            C786410Ut5.G6(smartImageView, layoutParams);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(15));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        smartImageView.setBackground(c384050F3z.LIZ(context));
        smartImageView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
