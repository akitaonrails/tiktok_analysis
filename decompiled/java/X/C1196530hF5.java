package X;

import Y.ARunnableS118S0100000_18;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.poi.osp.repo.model.ToastContent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hF5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196530hF5 extends C214906198m {
    public final ToastContent LL;
    public Context LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2458));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2460));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2459));
    public AwS562S0100000_18 LLIZLLLIL;

    public final void LJJIIJ() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 33));
        valueAnimatorOfFloat.start();
        Object value = this.LLILZIL.getValue();
        if (value != null) {
            C21616519il c21616519ilLJIILL = C1619980sG4.LJIILL(value, AbstractC21616419ik.LJIILL, 1.0f);
            c21616519ilLJIILL.LJI(0.8f);
            c21616519ilLJIILL.LJIIIZ();
            C21616519il c21616519ilLJIILL2 = C1619980sG4.LJIILL(value, AbstractC21616419ik.LJIILLIIL, 1.0f);
            c21616519ilLJIILL2.LJI(0.8f);
            c21616519ilLJIILL2.LJIIIZ();
        }
    }

    public final void show() {
        if (this.LLILLJJLI == null) {
            return;
        }
        try {
            showAtLocation(this.LLILLL, 17, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            View view = this.LLILZ;
            if (view != null) {
                view.announceForAccessibility(this.LL.message);
            }
            LJJIIJ();
            C786410Ut5.LJLIIL(this.LL.duration != null ? r0.intValue() : 3000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS118S0100000_18(this, 60));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AwS562S0100000_18 awS562S0100000_18 = this.LLIZLLLIL;
            if (awS562S0100000_18 != null) {
                awS562S0100000_18.invoke();
            }
        }
    }

    public C1196530hF5(ToastContent toastContent) {
        this.LL = toastContent;
        setWidth(-1);
        setHeight(-1);
        setInputMethodMode(1);
        setClippingEnabled(false);
        setTouchable(false);
    }

    public final void LJJIIJZLJL(Object obj) {
        View decorView;
        View rootView;
        View decorView2;
        Window window;
        C444830HcP c444830HcP;
        Integer numLIZJ;
        Drawable drawableLIZ;
        if (obj == null) {
            return;
        }
        Layout layoutLIZJ = null;
        if (obj instanceof View) {
            View view = (View) obj;
            this.LLILLL = view;
            this.LLILLJJLI = view.getContext();
        } else if (obj instanceof Context) {
            Context context = (Context) obj;
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                decorView2 = window.getDecorView();
            } else {
                decorView2 = null;
            }
            this.LLILLL = decorView2;
            this.LLILLJJLI = context;
        } else if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            View view2 = fragment.getView();
            if (view2 != null) {
                rootView = view2.getRootView();
            } else {
                rootView = null;
            }
            this.LLILLL = rootView;
            this.LLILLJJLI = fragment.getContext();
        } else if (obj instanceof Dialog) {
            Dialog dialog = (Dialog) obj;
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                decorView = window2.getDecorView();
            } else {
                decorView = null;
            }
            this.LLILLL = decorView;
            this.LLILLJJLI = dialog.getContext();
        }
        View viewSd = C786410Ut5.Sd(R.layout.dz2, C786410Ut5.ne(this.LLILLJJLI), null);
        this.LLILZ = viewSd;
        setContentView(viewSd);
        View view3 = (View) this.LLILZIL.getValue();
        if (view3 != null) {
            Context context2 = this.LLILLJJLI;
            if (context2 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.uj);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                drawableLIZ = c384050F3z.LIZ(context2);
            } else {
                drawableLIZ = null;
            }
            view3.setBackground(drawableLIZ);
        }
        View view4 = (View) this.LLILZIL.getValue();
        if (view4 != null) {
            view4.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        View view5 = (View) this.LLILZIL.getValue();
        if (view5 != null) {
            C426750GoL.LJIIL(view5, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ2), 16);
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
        Context context3 = this.LLILLJJLI;
        if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context3)) != null) {
            int iIntValue = numLIZJ.intValue();
            c444830HcP = new C444830HcP();
            c444830HcP.LIZIZ.LJ = iLIZIZ3;
            c444830HcP.LJII(52);
            c444830HcP.LJIILJJIL(iIntValue);
            c444830HcP.LJIILIIL(this.LL.message);
            c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_CENTER;
        } else {
            c444830HcP = null;
        }
        C21415018rM c21415018rM = (C21415018rM) this.LLILZLL.getValue();
        if (c21415018rM != null) {
            if (c444830HcP != null) {
                layoutLIZJ = C444830HcP.LIZJ(c444830HcP, 0.0f, true, null, 29);
            }
            c21415018rM.setTextLayout(layoutLIZJ);
        }
        final SmartImageView smartImageView = (SmartImageView) this.LLIZ.getValue();
        if (smartImageView != null) {
            String str = this.LL.icon;
            int i = 0;
            if (str != null && str.length() != 0) {
                C1325420kay.LIZJ(new InterfaceC442640HXi() { // from class: X.0h91
                    @Override // X.InterfaceC442640HXi
                    public final void onResult(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            ToastContent toastContent = this.LIZ.LL;
                            Integer num = toastContent.iconWidth;
                            if (num != null && toastContent.iconHeight != null) {
                                C1180060goW.LJIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(this.LIZ.LL.iconHeight)), smartImageView);
                            }
                            String str2 = this.LIZ.LL.icon;
                            if (str2 == null) {
                                str2 = "";
                            }
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                            c1331670kl3LJIIIZ.LJJ((SmartImageView) this.LIZ.LLIZ.getValue());
                            C786410Ut5.h3(c1331670kl3LJIIIZ);
                            return;
                        }
                        C1322090kVb c1322090kVb = (C1322090kVb) this.LIZ.LLIZ.getValue();
                        if (c1322090kVb == null) {
                            return;
                        }
                        c1322090kVb.setImageDrawable(new AbstractC415370GQl() { // from class: X.0GHT
                            public final Paint LJ;
                            public final C415290GQd LJFF;
                            public final Paint LJI;
                            public final C415290GQd LJII;
                            public final Paint LJIIIIZZ;
                            public final C415290GQd LJIIIZ;

                            {
                                this.LIZJ.LJIIIZ(12.1173f, 1.61133f);
                                this.LIZJ.LJFF(12.2854f, 3.16567f, 13.6018f, 4.37571f, 15.2008f, 4.37571f);
                                this.LIZJ.LJIJI(4.3763f);
                                this.LIZJ.LJII(15.4993f);
                                this.LIZJ.LJIJI(2.14904f);
                                this.LIZJ.LJFF(15.4993f, 1.85237f, 15.2583f, 1.61133f, 14.9616f, 1.61133f);
                                this.LIZJ.LJII(12.1173f);
                                this.LIZJ.LJ();
                                this.LIZJ.LJIIIZ(15.4993f, 6.44311f);
                                this.LIZJ.LJII(15.2008f);
                                this.LIZJ.LJIJI(6.44345f);
                                this.LIZJ.LJFF(14.0371f, 6.44345f, 12.9632f, 6.05891f, 12.0992f, 5.40996f);
                                this.LIZJ.LJIJI(9.71738f);
                                this.LIZJ.LJFF(12.0992f, 11.9062f, 10.3248f, 13.6806f, 8.13603f, 13.6806f);
                                this.LIZJ.LJFF(5.94723f, 13.6806f, 4.17285f, 11.9062f, 4.17285f, 9.71738f);
                                this.LIZJ.LJFF(4.17285f, 7.52858f, 5.94723f, 5.7542f, 8.13603f, 5.7542f);
                                this.LIZJ.LJFF(8.31085f, 5.7542f, 8.48343f, 5.76559f, 8.65297f, 5.78773f);
                                this.LIZJ.LJIJI(7.89302f);
                                this.LIZJ.LJFF(8.62979f, 7.88647f, 8.60642f, 7.88036f, 8.58289f, 7.87468f);
                                this.LIZJ.LJFF(8.44063f, 7.84037f, 8.29117f, 7.82195f, 8.13603f, 7.82195f);
                                this.LIZJ.LJFF(7.08921f, 7.82195f, 6.2406f, 8.67056f, 6.2406f, 9.71738f);
                                this.LIZJ.LJFF(6.2406f, 10.7642f, 7.08921f, 11.6128f, 8.13603f, 11.6128f);
                                this.LIZJ.LJFF(9.18285f, 11.6128f, 10.0315f, 10.7642f, 10.0315f, 9.71738f);
                                this.LIZJ.LJIJI(1.61133f);
                                this.LIZJ.LJII(8.2216f);
                                this.LIZJ.LJFF(4.14238f, 1.61133f, 0.832642f, 4.92106f, 0.832642f, 9.00029f);
                                this.LIZJ.LJFF(0.832642f, 13.0795f, 4.11456f, 16.3614f, 8.16597f, 16.3892f);
                                this.LIZJ.LJFF(12.2174f, 16.3614f, 15.4993f, 13.061f, 15.4993f, 9.00029f);
                                this.LIZJ.LJIJI(6.44311f);
                                this.LIZJ.LJ();
                                this.LIZJ.LJIJ(Path.FillType.EVEN_ODD);
                                this.LIZIZ.setStyle(Paint.Style.FILL);
                                this.LIZIZ.setColor(-328966);
                                this.LIZ.add(this.LIZIZ);
                                Paint paint = new Paint();
                                this.LJ = paint;
                                C415290GQd c415290GQd = new C415290GQd();
                                this.LJFF = c415290GQd;
                                c415290GQd.LJIIIZ(25.6263f, 14.238f);
                                c415290GQd.LJFF(22.8123f, 14.238f, 20.9783f, 12.194f, 20.9783f, 9.072f);
                                c415290GQd.LJFF(20.9783f, 5.936f, 22.7843f, 3.906f, 25.5703f, 3.906f);
                                c415290GQd.LJFF(27.6143f, 3.906f, 28.9863f, 4.746f, 29.6303f, 6.37f);
                                c415290GQd.LJIIIIZZ(28.0903f, 7.014f);
                                c415290GQd.LJFF(27.6563f, 5.908f, 26.8303f, 5.32f, 25.6263f, 5.32f);
                                c415290GQd.LJFF(23.8343f, 5.32f, 22.7423f, 6.706f, 22.7423f, 9.072f);
                                c415290GQd.LJFF(22.7423f, 11.452f, 23.8623f, 12.852f, 25.6403f, 12.852f);
                                c415290GQd.LJFF(27.3063f, 12.852f, 28.2443f, 11.886f, 28.3283f, 10.136f);
                                c415290GQd.LJII(25.4023f);
                                c415290GQd.LJIJI(8.82f);
                                c415290GQd.LJII(29.8823f);
                                c415290GQd.LJIJI(9.842f);
                                c415290GQd.LJFF(29.8823f, 12.614f, 28.1883f, 14.238f, 25.6263f, 14.238f);
                                c415290GQd.LJ();
                                c415290GQd.LJIIIZ(36.0596f, 14.238f);
                                c415290GQd.LJFF(33.2176f, 14.238f, 31.3416f, 12.18f, 31.3416f, 9.072f);
                                c415290GQd.LJFF(31.3416f, 5.964f, 33.2176f, 3.892f, 36.0596f, 3.892f);
                                c415290GQd.LJFF(38.9156f, 3.892f, 40.7916f, 5.964f, 40.7916f, 9.072f);
                                c415290GQd.LJFF(40.7916f, 12.18f, 38.9156f, 14.238f, 36.0596f, 14.238f);
                                c415290GQd.LJ();
                                c415290GQd.LJIIIZ(33.1056f, 9.072f);
                                c415290GQd.LJFF(33.1056f, 11.312f, 34.2816f, 12.824f, 36.0596f, 12.824f);
                                c415290GQd.LJFF(37.8376f, 12.824f, 39.0136f, 11.312f, 39.0136f, 9.072f);
                                c415290GQd.LJFF(39.0136f, 6.832f, 37.8376f, 5.306f, 36.0596f, 5.306f);
                                c415290GQd.LJFF(34.2816f, 5.306f, 33.1056f, 6.832f, 33.1056f, 9.072f);
                                c415290GQd.LJ();
                                c415290GQd.LJIIIZ(46.3922f, 15.68f);
                                c415290GQd.LJIJI(3.892f);
                                c415290GQd.LJII(47.8482f);
                                c415290GQd.LJIJI(15.68f);
                                c415290GQd.LJII(46.3922f);
                                c415290GQd.LJ();
                                c415290GQd.LJIJ(Path.FillType.WINDING);
                                paint.setStyle(Paint.Style.FILL);
                                paint.setColor(-1);
                                this.LIZ.add(paint);
                                Paint paint2 = new Paint();
                                this.LJI = paint2;
                                C415290GQd c415290GQd2 = new C415290GQd();
                                this.LJII = c415290GQd2;
                                c415290GQd2.LJIIIZ(109.635f, 5.18981f);
                                c415290GQd2.LJII(111.23f);
                                c415290GQd2.LJIJI(12.9206f);
                                c415290GQd2.LJII(111.118f);
                                c415290GQd2.LJFF(110.299f, 12.9206f, 109.633f, 12.2568f, 109.633f, 11.4362f);
                                c415290GQd2.LJIJI(5.18981f);
                                c415290GQd2.LJII(109.635f);
                                c415290GQd2.LJ();
                                c415290GQd2.LJIIIZ(96.1763f, 13.056f);
                                c415290GQd2.LJFF(95.1559f, 13.2723f, 94.1569f, 13.1055f, 93.1811f, 12.5606f);
                                c415290GQd2.LJFF(92.2284f, 12.0289f, 91.591f, 11.238f, 91.2723f, 10.1928f);
                                c415290GQd2.LJFF(90.6267f, 8.07935f, 91.951f, 5.72479f, 94.0793f, 5.15348f);
                                c415290GQd2.LJFF(95.1344f, 4.87113f, 96.1466f, 4.99827f, 97.1076f, 5.53655f);
                                c415290GQd2.LJFF(98.7042f, 6.42818f, 99.2854f, 7.80856f, 99.1847f, 9.58852f);
                                c415290GQd2.LJIIIIZZ(92.7534f, 9.57531f);
                                c415290GQd2.LJFF(92.8475f, 10.3002f, 93.2983f, 10.8682f, 93.9307f, 11.2215f);
                                c415290GQd2.LJFF(94.5714f, 11.5798f, 95.1608f, 11.6657f, 95.709f, 11.4956f);
                                c415290GQd2.LJFF(96.315f, 11.3041f, 96.8087f, 10.8104f, 97.2083f, 10.3481f);
                                c415290GQd2.LJIIIIZZ(98.5193f, 11.3024f);
                                c415290GQd2.LJFF(97.9843f, 12.2585f, 97.2562f, 12.8248f, 96.1796f, 13.0543f);
                                c415290GQd2.LJIIIIZZ(96.1763f, 13.056f);
                                c415290GQd2.LJ();
                                c415290GQd2.LJIIIZ(97.3949f, 8.13054f);
                                c415290GQd2.LJFF(97.1934f, 7.5064f, 96.9408f, 7.19928f, 96.3579f, 6.87565f);
                                c415290GQd2.LJFF(94.9759f, 6.1029f, 93.6137f, 6.76007f, 92.9796f, 8.12558f);
                                c415290GQd2.LJIIIIZZ(97.3932f, 8.13219f);
                                c415290GQd2.LJIIIIZZ(97.3949f, 8.13054f);
                                c415290GQd2.LJ();
                                c415290GQd2.LJIIIZ(119.245f, 8.58296f);
                                c415290GQd2.LJFF(119.245f, 7.95386f, 119.007f, 7.45521f, 118.528f, 7.07874f);
                                c415290GQd2.LJFF(118.097f, 6.7386f, 117.559f, 6.56688f, 116.905f, 6.56688f);
                                c415290GQd2.LJFF(115.46f, 6.56688f, 114.534f, 7.69628f, 114.534f, 9.08821f);
                                c415290GQd2.LJFF(114.534f, 10.4801f, 115.516f, 11.5468f, 116.892f, 11.5468f);
                                c415290GQd2.LJFF(117.846f, 11.5468f, 118.358f, 10.9887f, 118.903f, 10.2936f);
                                c415290GQd2.LJIJI(12.2981f);
                                c415290GQd2.LJFF(118.626f, 12.5061f, 118.305f, 12.7323f, 117.98f, 12.8661f);
                                c415290GQd2.LJFF(117.637f, 13.0097f, 117.225f, 13.0807f, 116.752f, 13.0807f);
                                c415290GQd2.LJFF(114.455f, 13.0807f, 112.939f, 11.1769f, 112.939f, 8.97924f);
                                c415290GQd2.LJFF(112.939f, 7.84984f, 113.289f, 6.91693f, 113.996f, 6.18876f);
                                c415290GQd2.LJFF(114.745f, 5.41767f, 115.728f, 5.0346f, 116.931f, 5.0346f);
                                c415290GQd2.LJFF(119.213f, 5.0346f, 120.845f, 6.34397f, 120.845f, 8.7101f);
                                c415290GQd2.LJIJI(12.9222f);
                                c415290GQd2.LJII(120.732f);
                                c415290GQd2.LJFF(119.913f, 12.9222f, 119.248f, 12.2585f, 119.248f, 11.4378f);
                                c415290GQd2.LJIJI(8.58296f);
                                c415290GQd2.LJII(119.245f);
                                c415290GQd2.LJ();
                                c415290GQd2.LJIIIZ(111.134f, 4.27341f);
                                c415290GQd2.LJFF(110.966f, 4.46164f, 110.726f, 4.5475f, 110.432f, 4.5475f);
                                c415290GQd2.LJFF(109.884f, 4.5475f, 109.493f, 4.14297f, 109.493f, 3.59973f);
                                c415290GQd2.LJFF(109.493f, 3.0565f, 109.878f, 2.66682f, 110.432f, 2.66682f);
                                c415290GQd2.LJFF(110.987f, 2.66682f, 111.372f, 3.0631f, 111.372f, 3.59973f);
                                c415290GQd2.LJFF(111.372f, 3.86557f, 111.294f, 4.09178f, 111.133f, 4.27341f);
                                c415290GQd2.LJII(111.134f);
                                c415290GQd2.LJ();
                                c415290GQd2.LJIIIZ(106.627f, 11.9018f);
                                c415290GQd2.LJFF(105.893f, 12.6878f, 104.951f, 13.0807f, 103.808f, 13.0807f);
                                c415290GQd2.LJFF(102.603f, 13.0807f, 101.619f, 12.6646f, 100.871f, 11.8292f);
                                c415290GQd2.LJFF(100.167f, 11.0382f, 99.8171f, 10.0492f, 99.8171f, 8.86861f);
                                c415290GQd2.LJFF(99.8171f, 6.77988f, 101.43f, 5.0346f, 103.55f, 5.0346f);
                                c415290GQd2.LJFF(104.369f, 5.0346f, 105.079f, 5.20632f, 105.798f, 5.60095f);
                                c415290GQd2.LJIJI(7.32972f);
                                c415290GQd2.LJFF(105.221f, 6.94005f, 104.498f, 6.56853f, 103.787f, 6.56853f);
                                c415290GQd2.LJFF(102.299f, 6.56853f, 101.414f, 7.59226f, 101.414f, 9.04363f);
                                c415290GQd2.LJFF(101.414f, 10.495f, 102.352f, 11.5501f, 103.818f, 11.5501f);
                                c415290GQd2.LJFF(104.482f, 11.5501f, 105.028f, 11.3008f, 105.466f, 10.8005f);
                                c415290GQd2.LJFF(105.9f, 10.3018f, 106.126f, 9.57036f, 106.126f, 8.58791f);
                                c415290GQd2.LJIJI(3.2051f);
                                c415290GQd2.LJFF(106.126f, 2.38612f, 106.79f, 1.7207f, 107.611f, 1.7207f);
                                c415290GQd2.LJII(107.721f);
                                c415290GQd2.LJIJI(8.83559f);
                                c415290GQd2.LJFF(107.721f, 10.0888f, 107.36f, 11.1142f, 106.627f, 11.9018f);
                                c415290GQd2.LJ();
                                c415290GQd2.LJIIIZ(89.3438f, 11.9579f);
                                c415290GQd2.LJFF(88.609f, 12.7043f, 87.7289f, 13.0791f, 86.7085f, 13.0791f);
                                c415290GQd2.LJFF(85.8846f, 13.0791f, 85.1828f, 12.9107f, 84.4679f, 12.4946f);
                                c415290GQd2.LJIJI(10.784f);
                                c415290GQd2.LJFF(85.0441f, 11.1736f, 85.7657f, 11.5452f, 86.479f, 11.5452f);
                                c415290GQd2.LJFF(87.9667f, 11.5452f, 88.8517f, 10.5214f, 88.8517f, 9.07005f);
                                c415290GQd2.LJFF(88.8517f, 7.61868f, 87.9353f, 6.56358f, 86.4476f, 6.56358f);
                                c415290GQd2.LJFF(85.7822f, 6.56358f, 85.2439f, 6.803f, 84.8229f, 7.28184f);
                                c415290GQd2.LJFF(84.3721f, 7.8003f, 84.1393f, 8.54333f, 84.1393f, 9.52247f);
                                c415290GQd2.LJIJI(16.2791f);
                                c415290GQd2.LJII(84.027f);
                                c415290GQd2.LJFF(83.208f, 16.2791f, 82.5426f, 15.6153f, 82.5426f, 14.7947f);
                                c415290GQd2.LJIJI(9.26819f);
                                c415290GQd2.LJFF(82.5426f, 6.92353f, 83.9758f, 5.02964f, 86.441f, 5.02964f);
                                c415290GQd2.LJFF(87.6563f, 5.02964f, 88.6453f, 5.44574f, 89.3949f, 6.28123f);
                                c415290GQd2.LJFF(90.1f, 7.06223f, 90.4484f, 8.05128f, 90.4484f, 9.24177f);
                                c415290GQd2.LJFF(90.4484f, 10.3018f, 90.0802f, 11.2067f, 89.3438f, 11.9546f);
                                c415290GQd2.LJIJI(11.9579f);
                                c415290GQd2.LJ();
                                c415290GQd2.LJIJ(Path.FillType.WINDING);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(-1);
                                this.LIZ.add(paint2);
                                Paint paint3 = new Paint();
                                this.LJIIIIZZ = paint3;
                                C415290GQd c415290GQd3 = new C415290GQd();
                                this.LJIIIZ = c415290GQd3;
                                c415290GQd3.LJIIIZ(63.6145f, 7.25707f);
                                c415290GQd3.LJFF(63.1753f, 6.79639f, 62.6155f, 6.56523f, 61.9286f, 6.56523f);
                                c415290GQd3.LJFF(60.4591f, 6.56523f, 59.5807f, 7.63684f, 59.5807f, 9.05519f);
                                c415290GQd3.LJFF(59.5807f, 10.4735f, 60.4806f, 11.5452f, 61.9286f, 11.5452f);
                                c415290GQd3.LJFF(63.3767f, 11.5452f, 64.2766f, 10.4554f, 64.2766f, 9.05519f);
                                c415290GQd3.LJFF(64.2766f, 8.31217f, 64.0537f, 7.71609f, 63.6128f, 7.25542f);
                                c415290GQd3.LJIIIIZZ(63.6145f, 7.25707f);
                                c415290GQd3.LJ();
                                c415290GQd3.LJIIIZ(79.3171f, 7.25707f);
                                c415290GQd3.LJFF(78.8779f, 6.79639f, 78.3181f, 6.56523f, 77.6313f, 6.56523f);
                                c415290GQd3.LJFF(76.1617f, 6.56523f, 75.2833f, 7.63684f, 75.2833f, 9.05519f);
                                c415290GQd3.LJFF(75.2833f, 10.4735f, 76.1832f, 11.5452f, 77.6313f, 11.5452f);
                                c415290GQd3.LJFF(79.0793f, 11.5452f, 79.9792f, 10.4554f, 79.9792f, 9.05519f);
                                c415290GQd3.LJFF(79.9792f, 8.31217f, 79.7563f, 7.71609f, 79.3171f, 7.25542f);
                                c415290GQd3.LJIJI(7.25707f);
                                c415290GQd3.LJ();
                                c415290GQd3.LJIIIZ(80.4696f, 11.9447f);
                                c415290GQd3.LJFF(79.6804f, 12.701f, 78.7326f, 13.0807f, 77.6313f, 13.0807f);
                                c415290GQd3.LJFF(76.5299f, 13.0807f, 75.5987f, 12.701f, 74.8094f, 11.9447f);
                                c415290GQd3.LJFF(74.0185f, 11.1868f, 73.6239f, 10.2209f, 73.6239f, 9.05684f);
                                c415290GQd3.LJFF(73.6239f, 6.78649f, 75.3576f, 5.03295f, 77.6313f, 5.03295f);
                                c415290GQd3.LJFF(78.7227f, 5.03295f, 79.6671f, 5.41437f, 80.4614f, 6.17555f);
                                c415290GQd3.LJFF(81.2572f, 6.93839f, 81.6552f, 7.90268f, 81.6552f, 9.05519f);
                                c415290GQd3.LJFF(81.6552f, 10.2077f, 81.2605f, 11.1852f, 80.4696f, 11.9431f);
                                c415290GQd3.LJIJI(11.9447f);
                                c415290GQd3.LJ();
                                c415290GQd3.LJIIIZ(72.2303f, 7.05067f);
                                c415290GQd3.LJFF(71.9958f, 7.44365f, 71.8142f, 7.72435f, 71.687f, 7.89442f);
                                c415290GQd3.LJFF(71.5467f, 8.07935f, 71.4064f, 8.22796f, 71.2693f, 8.32868f);
                                c415290GQd3.LJFF(72.3789f, 8.68698f, 72.7917f, 9.45643f, 72.7917f, 10.6007f);
                                c415290GQd3.LJIJI(12.9206f);
                                c415290GQd3.LJII(72.6794f);
                                c415290GQd3.LJFF(71.8588f, 12.9206f, 71.195f, 12.2568f, 71.195f, 11.4362f);
                                c415290GQd3.LJIJI(10.7575f);
                                c415290GQd3.LJFF(71.195f, 10.0162f, 70.8631f, 9.51257f, 70.0772f, 9.51257f);
                                c415290GQd3.LJII(68.6274f);
                                c415290GQd3.LJIJI(12.9189f);
                                c415290GQd3.LJII(68.5152f);
                                c415290GQd3.LJFF(67.6945f, 12.9189f, 67.0308f, 12.2552f, 67.0308f, 11.4345f);
                                c415290GQd3.LJIJI(3.2051f);
                                c415290GQd3.LJFF(67.0308f, 2.38612f, 67.6962f, 1.7207f, 68.5152f, 1.7207f);
                                c415290GQd3.LJII(68.6274f);
                                c415290GQd3.LJIJI(7.96542f);
                                c415290GQd3.LJII(69.0997f);
                                c415290GQd3.LJFF(69.6181f, 7.96542f, 69.9583f, 7.78875f, 70.1548f, 7.45356f);
                                c415290GQd3.LJIIIIZZ(71.4955f, 5.19146f);
                                c415290GQd3.LJII(73.3151f);
                                c415290GQd3.LJIIIIZZ(72.2319f, 7.05067f);
                                c415290GQd3.LJII(72.2303f);
                                c415290GQd3.LJ();
                                c415290GQd3.LJIIIZ(64.7687f, 11.9447f);
                                c415290GQd3.LJFF(63.9794f, 12.701f, 63.0316f, 13.0807f, 61.9303f, 13.0807f);
                                c415290GQd3.LJFF(60.829f, 13.0807f, 59.8961f, 12.701f, 59.1085f, 11.9447f);
                                c415290GQd3.LJFF(58.3175f, 11.1868f, 57.9229f, 10.2209f, 57.9229f, 9.05684f);
                                c415290GQd3.LJFF(57.9229f, 6.78649f, 59.6566f, 5.03295f, 61.9303f, 5.03295f);
                                c415290GQd3.LJFF(63.0217f, 5.03295f, 63.9662f, 5.41437f, 64.7604f, 6.17555f);
                                c415290GQd3.LJFF(65.5563f, 6.93839f, 65.9542f, 7.90268f, 65.9542f, 9.05519f);
                                c415290GQd3.LJFF(65.9542f, 10.2077f, 65.5596f, 11.1852f, 64.7687f, 11.9431f);
                                c415290GQd3.LJIJI(11.9447f);
                                c415290GQd3.LJ();
                                c415290GQd3.LJIIIZ(55.499f, 12.9222f);
                                c415290GQd3.LJFF(53.9386f, 12.9222f, 53.1626f, 11.8605f, 53.1626f, 10.3778f);
                                c415290GQd3.LJIJI(4.7506f);
                                c415290GQd3.LJFF(53.1626f, 3.93162f, 53.8264f, 3.2662f, 54.647f, 3.2662f);
                                c415290GQd3.LJII(54.7593f);
                                c415290GQd3.LJIJI(5.18981f);
                                c415290GQd3.LJII(57.4556f);
                                c415290GQd3.LJIJI(6.72374f);
                                c415290GQd3.LJII(54.7576f);
                                c415290GQd3.LJIJI(10.5545f);
                                c415290GQd3.LJFF(54.7576f, 11.2067f, 55.0482f, 11.3883f, 55.6707f, 11.3883f);
                                c415290GQd3.LJII(57.454f);
                                c415290GQd3.LJIJI(12.9206f);
                                c415290GQd3.LJII(55.4973f);
                                c415290GQd3.LJIIIIZZ(55.499f, 12.9222f);
                                c415290GQd3.LJ();
                                c415290GQd3.LJIJ(Path.FillType.WINDING);
                                paint3.setStyle(Paint.Style.FILL);
                                paint3.setColor(-1);
                                this.LIZ.add(paint3);
                            }

                            @Override // X.AbstractC415370GQl
                            public final void LIZ(Canvas canvas) {
                                LIZIZ(121.0f, 18.0f, canvas);
                                canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
                                canvas.drawPath(this.LJFF.LIZ, this.LJ);
                                canvas.drawPath(this.LJII.LIZ, this.LJI);
                                canvas.drawPath(this.LJIIIZ.LIZ, this.LJIIIIZZ);
                            }
                        });
                    }
                }, this.LL.icon);
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, smartImageView);
        }
    }
}
