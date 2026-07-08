package X;

import Y.ARunnableS106S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0HfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446610HfH extends C214906198m {
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public View LLILZ;
    public Context LLILZIL;
    public View LLILZLL;

    public final void show() {
        if (this.LLILZIL == null) {
            return;
        }
        try {
            showAtLocation(this.LLILZLL, 80, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            View view = this.LLILZ;
            if (view != null) {
                view.announceForAccessibility(this.LL);
            }
            LJJIIJ(true);
            C786410Ut5.LJLIIL(this.LLILLL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6(this, 162));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJIIJ(boolean z) {
        LinearLayout linearLayout;
        View view = this.LLILZ;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.boe);
        } else {
            linearLayout = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(linearLayout, 69));
        valueAnimatorOfFloat.start();
        C21616519il c21616519ilLJIILL = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILL, 1.0f);
        c21616519ilLJIILL.LJI(0.8f);
        c21616519ilLJIILL.LJIIIZ();
        C21616519il c21616519ilLJIILL2 = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILLIIL, 1.0f);
        c21616519ilLJIILL2.LJI(0.8f);
        c21616519ilLJIILL2.LJIIIZ();
    }

    public final void LJJIIJZLJL(Object obj) {
        View decorView;
        View rootView;
        View decorView2;
        View decorView3;
        Window window;
        View viewFindViewById;
        C444830HcP c444830HcP;
        C21415018rM c21415018rM;
        View viewFindViewById2;
        boolean z;
        View viewFindViewById3;
        View viewFindViewById4;
        Layout layoutLIZJ;
        View viewFindViewById5;
        Drawable drawableLIZ;
        if (obj == null) {
            return;
        }
        ImageView imageView = null;
        if (obj instanceof View) {
            View view = (View) obj;
            this.LLILZLL = view;
            this.LLILZIL = view.getContext();
        } else if (obj instanceof ContextWrapper) {
            Context context = (Context) obj;
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                decorView3 = window.getDecorView();
            } else {
                decorView3 = null;
            }
            this.LLILZLL = decorView3;
            this.LLILZIL = C1388190mED.LIZ(context);
        } else if (obj instanceof Activity) {
            Window window2 = ((Activity) obj).getWindow();
            if (window2 != null) {
                decorView2 = window2.getDecorView();
            } else {
                decorView2 = null;
            }
            this.LLILZLL = decorView2;
            this.LLILZIL = (Context) obj;
        } else if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            View view2 = fragment.getView();
            if (view2 != null) {
                rootView = view2.getRootView();
            } else {
                rootView = null;
            }
            this.LLILZLL = rootView;
            this.LLILZIL = fragment.getContext();
        } else if (obj instanceof Dialog) {
            Dialog dialog = (Dialog) obj;
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                decorView = window3.getDecorView();
            } else {
                decorView = null;
            }
            this.LLILZLL = decorView;
            this.LLILZIL = dialog.getContext();
        }
        View viewSd = C786410Ut5.Sd(R.layout.bpg, C786410Ut5.ne(this.LLILZIL), null);
        this.LLILZ = viewSd;
        setContentView(viewSd);
        View view3 = this.LLILZ;
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.boe);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            Context context2 = this.LLILZIL;
            if (context2 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.uj);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                drawableLIZ = c384050F3z.LIZ(context2);
            } else {
                drawableLIZ = null;
            }
            viewFindViewById.setBackground(drawableLIZ);
        }
        View view4 = this.LLILZ;
        if (view4 != null && (viewFindViewById5 = view4.findViewById(R.id.boe)) != null) {
            viewFindViewById5.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
        Context context3 = this.LLILZIL;
        if (context3 != null) {
            int iLIZ = C960203pA.LIZ(R.attr.ee, context3);
            c444830HcP = new C444830HcP();
            c444830HcP.LIZIZ.LJ = iLIZIZ;
            c444830HcP.LJII(52);
            c444830HcP.LJIILJJIL(iLIZ);
            c444830HcP.LJIILIIL(this.LL);
            c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_CENTER;
        } else {
            c444830HcP = null;
        }
        View view5 = this.LLILZ;
        if (view5 != null) {
            c21415018rM = (C21415018rM) view5.findViewById(R.id.message_tv);
        } else {
            c21415018rM = null;
        }
        if (c21415018rM != null) {
            if (c444830HcP != null) {
                layoutLIZJ = C444830HcP.LIZJ(c444830HcP, 0.0f, true, null, 29);
            } else {
                layoutLIZJ = null;
            }
            c21415018rM.setTextLayout(layoutLIZJ);
        }
        View view6 = this.LLILZ;
        if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.k1_)) != null) {
            String str = this.LLILLJJLI;
            int i = 0;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                View view7 = this.LLILZ;
                if (view7 != null && (viewFindViewById4 = view7.findViewById(R.id.boe)) != null) {
                    C426750GoL.LJIIL(viewFindViewById4, Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ3), 16);
                }
                i = 8;
            } else {
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                View view8 = this.LLILZ;
                if (view8 != null && (viewFindViewById3 = view8.findViewById(R.id.boe)) != null) {
                    C426750GoL.LJIIL(viewFindViewById3, Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ4), 16);
                }
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                String str2 = this.LLILLJJLI;
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str2);
                View view9 = this.LLILZ;
                if (view9 != null) {
                    imageView = (ImageView) view9.findViewById(R.id.k1_);
                }
                c1331670kl3LIZLLL.LJJI(imageView);
                C786410Ut5.h3(c1331670kl3LIZLLL);
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        }
    }

    public final void LJJIIZ(int i, int i2) {
        TuxIconView tuxIconView;
        try {
            View view = this.LLILZ;
            if (view != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.k1_)) != null) {
                C1744700vVE.LJII(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
                tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C446610HfH(String str, String str2, long j) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        setWidth(-1);
        setHeight(-1);
        setInputMethodMode(1);
        setClippingEnabled(false);
        setTouchable(false);
    }
}
