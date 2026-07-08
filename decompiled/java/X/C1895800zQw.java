package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.touchpoint.api.model.SharePanelInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS12S3100000_28;
import kotlin.jvm.internal.AwS160S0101000_21;
import kotlin.jvm.internal.AwS2S4000000_11;
import kotlin.jvm.internal.AwS3S4000000_28;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895800zQw {
    public static final C1895800zQw LIZ = new C1895800zQw();
    public static boolean LIZIZ;

    public static final SharePanelInfo LJ() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return (SharePanelInfo) C2178808gE.LIZ().LJ(33);
    }

    public static final Bitmap LJFF() {
        C1895820zQy.LL.getClass();
        return C1895820zQy.LLILZ;
    }

    public static final void LJIILJJIL() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(563));
    }

    public static final void LJIILL() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(564));
    }

    public static final void LIZIZ(View view) {
        C01U6.LIZIZ(new AwS572S0100000_28(view, 769));
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (C621180OYa.LIZIZ.LJIIJJI(aweme.getShareOperationInfo())) {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            if (C2178808gE.LIZ().LJ(37) != null && !LIZIZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LIZLLL(Aweme aweme) {
        if (aweme != null) {
            C01U6.LIZIZ(new AwS160S0101000_21(aweme, 3));
        }
    }

    public static final View LJI(Context context) {
        return (View) C01U6.LJFF(new AwS572S0100000_28(context, 770));
    }

    public static final boolean LJIIJJI(Aweme aweme) {
        return ((Boolean) C01U6.LJ(new C1895780zQu(aweme), Boolean.FALSE)).booleanValue();
    }

    public static final boolean LJIIL(Aweme aweme) {
        return ((Boolean) C01U6.LJ(new AwS572S0100000_28(aweme, 771), Boolean.FALSE)).booleanValue();
    }

    public static final void LIZ(Context context, Aweme aweme) {
        C01U6.LIZIZ(new AwS412S0200000_11(context, aweme, 62));
    }

    public static final void LJIIIZ(String str, String str2, String str3) {
        C01U6.LIZIZ(new AwS3S4000000_28(str, str2, str3, 1));
    }

    public static final void LJIIIIZZ(String str, String str2, String str3, String str4) {
        C01U6.LIZIZ(new C1895840zR0(str, str2, str3, str4));
    }

    public static final void LJIIJ(String str, String str2, String str3, Aweme aweme) {
        C01U6.LIZIZ(new AwS12S3100000_28(str, str2, str3, aweme, 1));
    }

    public static final void LJIILIIL(String str, String str2, String str3, String str4) {
        C01U6.LIZIZ(new AwS2S4000000_11(str, str2, str3, str4, 0));
    }

    public static final void LJII(Aweme aweme, String str, String str2, String str3, String str4) {
        C01U6.LIZIZ(new C1895810zQx(aweme, str3, str, str2, str4));
    }
}
