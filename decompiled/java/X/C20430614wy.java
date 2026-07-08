package X;

import Y.ACListenerS118S0200000_15;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS11S0202000_31;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multilive.model.BannerContentMultiGuest;
import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.14wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20430614wy extends AbstractC960470b6L<InRoomMultiGuestBanner> {
    public final Function2<String, String, Unit> LL;
    public final Function1<Integer, Unit> LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    public final TextView L5() {
        return (TextView) this.LLILZIL.getValue();
    }

    public static final int N5(String str) {
        try {
            if (str.length() > 0 && str.charAt(0) == '#') {
                str = str.substring(0, 7);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return ColorProtector.parseColor(str);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int iN5;
        InRoomMultiGuestBanner inRoomMultiGuestBanner = (InRoomMultiGuestBanner) obj;
        int iLJIIZILJ = C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(16.0f)) * 2);
        int iMin = Math.min((int) (((double) iLJIIZILJ) * 0.3d), (int) C497740JfY.LIZIZ(98.0f));
        int i2 = iLJIIZILJ - iMin;
        BannerContentMultiGuest bannerContentMultiGuest = inRoomMultiGuestBanner.content;
        if (bannerContentMultiGuest != null) {
            String str = bannerContentMultiGuest.leftColor;
            String str2 = bannerContentMultiGuest.rightColor;
            if (str.length() > 0 && str2.length() > 0) {
                Drawable background = ((View) this.LLILLL.getValue()).getBackground();
                if (background != null && (background instanceof GradientDrawable)) {
                    ((GradientDrawable) background).setColors(new int[]{N5(str), N5(str2)});
                }
            } else if (str.length() > 0 || str2.length() > 0) {
                if (str.length() <= 0) {
                    str = str2;
                }
                Drawable background2 = ((View) this.LLILLL.getValue()).getBackground();
                if (background2 != null && (background2 instanceof GradientDrawable)) {
                    ((GradientDrawable) background2).setColor(N5(str));
                }
            }
            ((TextView) this.LLILZ.getValue()).setWidth(i2);
            L5().setWidth(i2);
            if (bannerContentMultiGuest.textColor.length() > 0) {
                iN5 = N5(bannerContentMultiGuest.textColor);
            } else {
                iN5 = -16777216;
            }
            ((TextView) this.LLILZ.getValue()).setTextColor(iN5);
            C786410Ut5.S4(1.0f, L5());
            L5().setTextColor(iN5);
            C786410Ut5.S4(0.75f, L5());
            ((TextView) this.LLILZ.getValue()).setText(bannerContentMultiGuest.title);
            L5().setText(bannerContentMultiGuest.subTitle);
            HandlerHook.viewPost((View) this.LLILLL.getValue(), new ARunnableS11S0202000_31(this, bannerContentMultiGuest, iMin, iLJIIZILJ, 0));
        }
        C786410Ut5.K7((ViewGroup) this.LLILLL.getValue(), new ACListenerS118S0200000_15(this, inRoomMultiGuestBanner, 12));
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 18), (View) this.LLIZLLLIL.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20430614wy(View view, Function2<? super String, ? super String, Unit> function2, Function1<? super Integer, Unit> function1) {
        super(view);
        this.LL = function2;
        this.LLILLJJLI = function1;
        this.LLILLL = C292401Bi.LIZ(new AwS575S0100000_31(view, 80));
        this.LLILZ = C292401Bi.LIZ(new AwS575S0100000_31(view, 82));
        this.LLILZIL = C292401Bi.LIZ(new AwS575S0100000_31(view, 83));
        this.LLILZLL = C292401Bi.LIZ(new AwS575S0100000_31(view, 81));
        this.LLIZ = C292401Bi.LIZ(new AwS575S0100000_31(view, 78));
        this.LLIZLLLIL = C292401Bi.LIZ(new AwS575S0100000_31(view, 79));
        this.LLJ = C292401Bi.LIZ(AFwS221S0000000_31.get$arr$(52));
        this.LLJI = C292401Bi.LIZ(AFwS221S0000000_31.get$arr$(51));
    }
}
