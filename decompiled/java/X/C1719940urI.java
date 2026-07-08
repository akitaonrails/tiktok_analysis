package X;

import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.foundation.hybrid.Image;
import com.ss.android.ugc.aweme.foundation.hybrid.ImageInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719940urI {
    public static final void LIZLLL(int i, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(LSPassThroughRecordSizeConfig.DEFAULT);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(view, 57));
        valueAnimatorOfInt.start();
    }

    public static final void LIZIZ(C1722300uv6 c1722300uv6, String str, Function0 function0) {
        String string;
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(". ");
            string = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            string = C1717770unn.LIZJ().getApplicationContext().getString(2131832568);
        }
        c1722300uv6.LJI = C1717770unn.LIZJ().getApplicationContext().getString(2131832569);
        c1722300uv6.LJIIIIZZ = string;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_error_robot;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJIIIZ = new AwS605S0100000_26(function0, (Function0<Unit>) 815);
        c1722300uv6.LJIIL = C878203bw.LIZ;
    }

    public static final Uri LIZJ(Uri uri, String str, String str2) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        boolean z = false;
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            if (!Intrinsics.LJFF(str3, str)) {
                builderBuildUpon.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
            } else {
                builderBuildUpon.appendQueryParameter(str, str2);
                z = true;
            }
        }
        if (!z) {
            builderBuildUpon.appendQueryParameter(str, str2);
        }
        return builderBuildUpon.build();
    }

    public static final void LIZ(TuxNavBar tuxNavBar, Context context, Image image, boolean z) {
        int iLIZIZ;
        ImageView imageView = new ImageView(context);
        new LinearLayout.LayoutParams(-2, -2);
        Integer num = image.width;
        int iLIZIZ2 = 0;
        if (num != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
        } else {
            iLIZIZ = 0;
        }
        Integer num2 = image.height;
        if (num2 != null) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ2);
        if (z) {
            ImageInfo imageInfo = image.dark;
            if (imageInfo != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(imageInfo.imageUrl);
                c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
                c1331670kl3LJIIIZ.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        } else {
            ImageInfo imageInfo2 = image.light;
            if (imageInfo2 != null) {
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(imageInfo2.imageUrl);
                c1331670kl3LJIIIZ2.LJJ = EnumC1338240kve.FIT_XY;
                c1331670kl3LJIIIZ2.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
            }
        }
        layoutParams.gravity = 17;
        C786410Ut5.c6(imageView, layoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        LinearLayout linearLayout = (LinearLayout) tuxNavBar.findViewById(R.id.p1k);
        C786410Ut5.LJJJJJL(linearLayout);
        linearLayout.addView(imageView);
    }
}
