package X;

import Y.ACListenerS166S0100000_32;
import Y.ARunnableS132S0100000_32;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import mf.a;

/* JADX INFO: renamed from: X.19Kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21521919Kn {
    public final String LIZ;
    public final WeakReference<View> LIZIZ;
    public final Context LIZJ;
    public C21522119Kp LIZLLL;
    public PopupWindow LJ;
    public EnumC21522219Kq LJFF = EnumC21522219Kq.BLUE;
    public long LJI = 6000;
    public final ViewTreeObserverOnScrollChangedListenerC21522019Ko LJII = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.19Ko
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            PopupWindow popupWindow;
            C21521919Kn c21521919Kn = this.LL;
            if (C807660VmG.LIZ(C21521919Kn.class)) {
                return;
            }
            try {
                if (c21521919Kn.LIZIZ.get() == null || (popupWindow = c21521919Kn.LJ) == null || !popupWindow.isShowing()) {
                    return;
                }
                if (popupWindow.isAboveAnchor()) {
                    C21522119Kp c21522119Kp = c21521919Kn.LIZLLL;
                    if (c21522119Kp != null) {
                        C786410Ut5.LJZI(4, c21522119Kp.LL);
                        C786410Ut5.LJZI(0, c21522119Kp.LLILLJJLI);
                        return;
                    }
                    return;
                }
                C21522119Kp c21522119Kp2 = c21521919Kn.LIZLLL;
                if (c21522119Kp2 != null) {
                    C786410Ut5.LJZI(0, c21522119Kp2.LL);
                    C786410Ut5.LJZI(4, c21522119Kp2.LLILLJJLI);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    };

    public final void LIZ() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            LIZJ();
            PopupWindow popupWindow = this.LJ;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZIZ() {
        ViewTreeObserver viewTreeObserver;
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (this.LIZIZ.get() != null) {
                C21522119Kp c21522119Kp = new C21522119Kp(this.LIZJ);
                this.LIZLLL = c21522119Kp;
                View viewFindViewById = c21522119Kp.findViewById(R.id.e95);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) viewFindViewById).setText(this.LIZ);
                if (this.LJFF == EnumC21522219Kq.BLUE) {
                    c21522119Kp.getBodyFrame().setBackgroundResource(2130970462);
                    c21522119Kp.getBottomArrow().setImageResource(2130970463);
                    c21522119Kp.getTopArrow().setImageResource(2130970464);
                    c21522119Kp.getXOut().setImageResource(2130970465);
                } else {
                    c21522119Kp.getBodyFrame().setBackgroundResource(2130970458);
                    c21522119Kp.getBottomArrow().setImageResource(2130970459);
                    c21522119Kp.getTopArrow().setImageResource(2130970460);
                    c21522119Kp.getXOut().setImageResource(2130970461);
                }
                View decorView = ((Activity) this.LIZJ).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                if (!C807660VmG.LIZ(this)) {
                    try {
                        LIZJ();
                        View view = this.LIZIZ.get();
                        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                            ViewTreeObserverOnScrollChangedListenerC21522019Ko viewTreeObserverOnScrollChangedListenerC21522019Ko = this.LJII;
                            viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21522019Ko);
                            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21522019Ko, ViewTreeObserver.OnScrollChangedListener.class);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c21522119Kp.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(c21522119Kp, c21522119Kp.getMeasuredWidth(), c21522119Kp.getMeasuredHeight());
                this.LJ = popupWindow;
                popupWindow.showAsDropDown(this.LIZIZ.get());
                C787990Uvd.LIZ.getClass();
                C994003uc.LIZ();
                if (!C807660VmG.LIZ(this)) {
                    try {
                        PopupWindow popupWindow2 = this.LJ;
                        if (popupWindow2 != null && popupWindow2.isShowing()) {
                            if (popupWindow2.isAboveAnchor()) {
                                C21522119Kp c21522119Kp2 = this.LIZLLL;
                                if (c21522119Kp2 != null) {
                                    C786410Ut5.LJZI(4, c21522119Kp2.LL);
                                    C786410Ut5.LJZI(0, c21522119Kp2.LLILLJJLI);
                                }
                            } else {
                                C21522119Kp c21522119Kp3 = this.LIZLLL;
                                if (c21522119Kp3 != null) {
                                    C786410Ut5.LJZI(0, c21522119Kp3.LL);
                                    C786410Ut5.LJZI(4, c21522119Kp3.LLILLJJLI);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                if (this.LJI > 0) {
                    HandlerHook.viewPostDelay(c21522119Kp, new ARunnableS132S0100000_32(this, 106), this.LJI);
                }
                popupWindow.setTouchable(true);
                View.OnClickListener aCListenerS166S0100000_32 = new ACListenerS166S0100000_32(this, 132);
                if (C1848410yCV.LIZ) {
                    aCListenerS166S0100000_32 = new f(aCListenerS166S0100000_32);
                }
                a aVar = new a(aCListenerS166S0100000_32);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c21522119Kp);
                }
                c21522119Kp.setOnClickListener(aVar);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public final void LIZJ() {
        ViewTreeObserver viewTreeObserver;
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            View view = this.LIZIZ.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnScrollChangedListenerC21522019Ko viewTreeObserverOnScrollChangedListenerC21522019Ko = this.LJII;
            viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21522019Ko);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21522019Ko, ViewTreeObserver.OnScrollChangedListener.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.19Ko] */
    public C21521919Kn(View view, String str) {
        this.LIZ = str;
        this.LIZIZ = new WeakReference<>(view);
        this.LIZJ = view.getContext();
    }
}
