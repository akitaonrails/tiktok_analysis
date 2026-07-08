package X;

import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1391080mIs extends C19GU {
    public final View LLILZLL;
    public final View LLIZ;
    public boolean LLIZLLLIL;
    public final C1391050mIp LLJ;
    public final boolean LLJI;
    public Observer<C20590315hd> LLJIJIL;

    public static void LJJZ(C19GU c19gu, C0WZX c0wzx) throws Throwable {
        Object obj;
        DialogC19728412Gs dialogC19728412Gs = c19gu;
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", dialogC19728412Gs, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            dialogC19728412Gs = (DialogC19728412Gs) obj;
        }
        super.show();
        c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LLIZLLLIL = false;
        C1378370lyN.LIZ.getClass();
        C1378370lyN.LIZ();
        Observer<C20590315hd> observer = this.LLJIJIL;
        if (observer != null) {
            C20589915hZ.LIZLLL(observer);
        }
        this.LLJIJIL = null;
        super.onDetachedFromWindow();
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.LLJ.LIZIZ(getContext(), this.LLIZ, new AwS600S0100000_21(this, 371), new AwS565S0100000_21(this, 1520));
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJJ(this);
        try {
            C1389610mGV.LIZIZ(this);
            LJJZ(this, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW7YxQEyXpM4aXm6hapsvrpDMcgqA3roRW9o+nsmbe+BsyyPTV", null));
            HandlerHook.viewPost(this.LLILZLL, new ARunnableS121S0100000_21(this, 143));
        } catch (WindowManager.BadTokenException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJZZI() {
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.LLIZLLLIL != z) {
            if (z) {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZIZ(this);
            } else {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZ();
            }
            this.LLIZLLLIL = z;
        }
    }

    public DialogC1391080mIs(C1397510mTF c1397510mTF, View view, RadiusLayout radiusLayout) {
        C19EG c19eg;
        super(c1397510mTF.LLILLJJLI, R.style.ji);
        this.LLILZLL = view;
        this.LLIZ = radiusLayout;
        C1391050mIp c1391050mIp = new C1391050mIp();
        this.LLJ = c1391050mIp;
        this.LLJI = c1397510mTF.LLIZLLLIL.LJIILJJIL;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        setContentView(view);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(android.R.color.transparent);
            window2.addFlags(2);
            Activity activityLIZ = C1388190mED.LIZ(c1397510mTF.LLILLJJLI);
            if (activityLIZ instanceof C19EG) {
                c19eg = (C19EG) activityLIZ;
            } else {
                c19eg = null;
            }
            if (c19eg == null) {
                window2.getAttributes().height = -2;
            } else {
                TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(c19eg, this);
                tuxImmersionBarLJFF.LJIIJJI();
                tuxImmersionBarLJFF.LIZLLL();
                window2.getAttributes().height = -1;
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.dimAmount = C1397600mTO.LJJII;
            attributes.gravity = 1;
            attributes.width = -1;
            view.setFitsSystemWindows(true);
            window2.setSoftInputMode(16);
            c1391050mIp.LIZIZ = true;
        }
        C20591715hr c20591715hr = C20591715hr.LIZ;
        if ((!c20591715hr.isPad() && !c20591715hr.LIZ()) || !c20591715hr.LJ(EnumC1390870mIX.DIALOG)) {
            return;
        }
        C20590915hj c20590915hj = C20589915hZ.LIZ;
        C20590015ha c20590015ha = new C20590015ha(view);
        c20590015ha.LIZIZ = EnumC20591315hn.HORIZONTAL;
        this.LLJIJIL = C20589915hZ.LIZ(new InterfaceC1593800rZq() { // from class: X.0mIv
            @Override // X.InterfaceC1593800rZq
            public final void LIZ(C20590315hd c20590315hd) {
                DialogC1391080mIs dialogC1391080mIs = this.LIZ;
                dialogC1391080mIs.getClass();
                int iLIZIZ = C20591715hr.LIZ.LIZIZ().LIZIZ(c20590315hd.LIZLLL);
                View view2 = dialogC1391080mIs.LLILZLL;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iLIZIZ;
                    C786410Ut5.W5(view2, layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }, c20590015ha, true);
    }
}
