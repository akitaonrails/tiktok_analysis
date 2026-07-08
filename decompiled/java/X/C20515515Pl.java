package X;

import Y.ARunnableS131S0100000_31;
import Y.ATListenerS350S0200000_31;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15Pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20515515Pl extends C214906198m {
    public static WeakReference<View> LLJI;
    public static WeakReference<C20515515Pl> LLJIJIL;
    public final Context LL;
    public final View LLILLJJLI;
    public final C1057450dcl LLILLL;
    public View LLILZ;
    public BottomSheetBehavior<LinearLayout> LLILZIL;
    public int LLILZLL;
    public boolean LLIZ = true;
    public Integer LLIZLLLIL;
    public Observer<C20590315hd> LLJ;

    public final void LJJIIJ() {
        if (this.LLJ != null) {
            return;
        }
        C20591715hr c20591715hr = C20591715hr.LIZ;
        if ((c20591715hr.isPad() || c20591715hr.LIZ()) && c20591715hr.LJ(EnumC1390870mIX.NOTICE)) {
            C20590915hj c20590915hj = C20589915hZ.LIZ;
            C20590015ha c20590015ha = new C20590015ha(this.LLILLJJLI);
            c20590015ha.LIZIZ = EnumC20591315hn.HORIZONTAL;
            this.LLJ = C20589915hZ.LIZ(new InterfaceC1593800rZq() { // from class: X.15Pm
                @Override // X.InterfaceC1593800rZq
                public final void LIZ(C20590315hd c20590315hd) {
                    if (!this.LIZ.isShowing()) {
                        return;
                    }
                    this.LIZ.update(C20591715hr.LIZ.LIZIZ().LIZJ(c20590315hd.LIZLLL), -2);
                }
            }, c20590015ha, false);
        }
    }

    public final void LJJIIJZLJL() {
        try {
            Observer<C20590315hd> observer = this.LLJ;
            if (observer != null) {
                C20589915hZ.LIZLLL(observer);
            }
            this.LLJ = null;
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        View view = this.LLILZ;
        if (view == null) {
            view = null;
        }
        ((C20516215Ps) view.findViewById(R.id.pd0)).LIZ(false);
        C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS131S0100000_31(this, 165));
    }

    public C20515515Pl(Context context, View view, C1057450dcl c1057450dcl) {
        Activity activity;
        Activity activity2;
        int iLIZJ;
        this.LL = context;
        this.LLILLJJLI = view;
        this.LLILLL = c1057450dcl;
        C20591715hr c20591715hr = C20591715hr.LIZ;
        if ((!c20591715hr.isPad() && !c20591715hr.LIZ()) || !c20591715hr.LJ(EnumC1390870mIX.NOTICE)) {
            iLIZJ = -1;
        } else {
            Activity activityLIZ = C1388190mED.LIZ(context);
            C20590915hj c20590915hj = C20589915hZ.LIZ;
            boolean z = activityLIZ instanceof Context;
            if (z) {
                activity = activityLIZ;
            } else {
                activity = null;
            }
            C20590015ha c20590015ha = new C20590015ha(activity);
            c20590015ha.LIZIZ = EnumC20591315hn.HORIZONTAL;
            C20589915hZ.LIZJ(c20590015ha);
            if (z) {
                activity2 = activityLIZ;
            } else {
                activity2 = null;
            }
            C20590015ha c20590015ha2 = new C20590015ha(activity2);
            c20590015ha2.LIZIZ = EnumC20591315hn.VERTICAL;
            C20589915hZ.LIZJ(c20590015ha2);
            iLIZJ = c20591715hr.LIZIZ().LIZJ(C20589915hZ.LIZIZ(activityLIZ));
        }
        setWidth(iLIZJ);
        setHeight(-2);
        setClippingEnabled(false);
        View viewSd = C786410Ut5.Sd(R.layout.g7, C786410Ut5.ne(context), null);
        this.LLILZ = viewSd;
        setContentView(viewSd == null ? null : viewSd);
        View view2 = this.LLILZ;
        C20516215Ps c20516215Ps = (C20516215Ps) (view2 == null ? null : view2).findViewById(R.id.pd0);
        c20516215Ps.setDismiss(new AwS575S0100000_31(this, 1497));
        c20516215Ps.LIZIZ(this.LLILLL);
        BottomSheetBehavior<LinearLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(c20516215Ps);
        this.LLILZIL = bottomSheetBehaviorFrom;
        (bottomSheetBehaviorFrom == null ? null : bottomSheetBehaviorFrom).addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.155t
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view3, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view3) {
                if (i == 5) {
                    C20515515Pl c20515515Pl = this.LIZ;
                    c20515515Pl.LLILZLL = 1;
                    c20515515Pl.LJJIIJZLJL();
                }
            }
        });
        View view3 = this.LLILZ;
        C786410Ut5.x3((view3 != null ? view3 : null).getViewTreeObserver(), new C16HN(this, 6));
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.15Pk
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C20515515Pl c20515515Pl = this.LL;
                Function1<? super Integer, Unit> function1 = c20515515Pl.LLILLL.LJIILJJIL;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(c20515515Pl.LLILZLL));
                }
            }
        });
        setTouchInterceptor(new ATListenerS350S0200000_31(this, c20516215Ps, 1));
    }
}
