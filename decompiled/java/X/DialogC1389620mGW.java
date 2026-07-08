package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: renamed from: X.0mGW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1389620mGW extends DialogC19728412Gs {
    public boolean LL;
    public TuxIconView LLILLJJLI;
    public C1390130mHL LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public InterfaceC1389630mGX LLILZLL;
    public final View LLIZ;
    public final ARunnableS121S0100000_21 LLIZLLLIL;
    public boolean LLJ;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (C1389890mGx.LJFF < 4) {
            super.cancel();
            return;
        }
        this.LLJ = true;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS112S0100000_12(this, 270));
        C786410Ut5.LJLIIL(300L, bPEAHandler, new ARunnableS112S0100000_12(this, 271));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (C1389890mGx.LJFF < 4) {
            super.dismiss();
        } else {
            if (this.LLJ) {
                LJJZZI();
                return;
            }
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS112S0100000_12(this, 272));
            C786410Ut5.LJLIIL(300L, bPEAHandler, new ARunnableS112S0100000_12(this, 273));
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW+pFQCz/9M4OWjqlBps0sZo4kglxFdH2hGMqmhizRsvbxpQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        this.LLJ = false;
        if (C1389890mGx.LJFF >= 4) {
            LJJLIIIJLLLLLLLZ(true);
        }
        C1390130mHL c1390130mHL = this.LLILLL;
        if (c1390130mHL != null) {
            C786410Ut5.LLZ(c1390130mHL, 0);
        }
    }

    public final void LJJZ() {
        try {
            super.cancel();
        } catch (Exception e) {
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

    public DialogC1389620mGW(Context context) {
        super(C1388190mED.LJ(C1388190mED.LIZJ(context, true), context));
        this.LLIZ = C786410Ut5.Sd(R.layout.gt, C786410Ut5.ne(getContext()), null);
        this.LLIZLLLIL = new ARunnableS121S0100000_21(this, 101);
    }

    public final void LJJLIIIJLLLLLLLZ(boolean z) {
        float f;
        float f2;
        float f3;
        C19746312Np c19746312Np;
        View view = this.LLIZ;
        if (view == null) {
            return;
        }
        float f4 = 0.8f;
        if (z) {
            f3 = 1.0f;
            f2 = 1.0f;
            f = 0.0f;
        } else {
            f = 1.0f;
            f2 = 0.0f;
            f3 = 0.8f;
            f4 = 1.0f;
        }
        if (C07XO.LIZ) {
            c19746312Np = new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 75L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(f, f2))));
        } else {
            c19746312Np = new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(1218.47f), new C1342130l1v(55.85f)), C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(f, f2)), new C19746412Nq("scaleX", new C0HIW(f4, f3)), new C19746412Nq("scaleY", new C0HIX(f4, f3))));
        }
        try {
            new C21647019ng(view.getContext(), view, c19746312Np, false).LJI(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJLIIJ(boolean z) {
        this.LL = z;
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(C1389610mGV.LIZ());
                return;
            }
            return;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.clearFlags(2);
        }
        Window window4 = getWindow();
        if (window4 == null) {
            return;
        }
        window4.setDimAmount(0.0f);
    }

    public final void LJJLJ(int i) {
        this.LLILZ = getContext().getResources().getString(i);
        C1390130mHL c1390130mHL = this.LLILLL;
        if (c1390130mHL != null) {
            c1390130mHL.setMessage(i);
        }
    }

    public final void LJJLJLI(String str) {
        this.LLILZ = str;
        C1390130mHL c1390130mHL = this.LLILLL;
        if (c1390130mHL != null) {
            c1390130mHL.setMessage(str);
        }
    }

    public final void LJJLL(boolean z) {
        this.LLILZIL = z;
        if (z) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            C1390130mHL c1390130mHL = this.LLILLL;
            if (c1390130mHL != null) {
                c1390130mHL.setAccessibilityClickActionRunnable(this.LLIZLLLIL);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        C1390130mHL c1390130mHL2 = this.LLILLL;
        if (c1390130mHL2 == null) {
            return;
        }
        c1390130mHL2.setAccessibilityClickActionRunnable(null);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.TuxLoadingDialogHUD, R.attr.y7, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxLoadingDialogHUD_tux_loadingDialogHUD_clickActionLabel);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxLoadingDialogHUD_tux_loadingDialogHUD_closeIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxLoadingDialogHUD_tux_loadingDialogHUD_closeIconColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        setCanceledOnTouchOutside(false);
        LJJLIIJ(this.LL);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window3 = getWindow();
        if (window3 != null && (attributes = window3.getAttributes()) != null) {
            attributes.y = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-17));
        }
        setContentView(this.LLIZ);
        C1390130mHL c1390130mHL = (C1390130mHL) findViewById(R.id.z0s);
        this.LLILLL = c1390130mHL;
        if (c1390130mHL != null) {
            c1390130mHL.setAccessibilityClickActionLabel(strXd);
        }
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.e28);
        LJJLJLI(this.LLILZ);
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(resourceId);
            tuxIconView.setTintColor(color);
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 125));
        }
        LJJLL(this.LLILZIL);
        if (C1389890mGx.LJFF >= 4 && (window = getWindow()) != null) {
            window.setWindowAnimations(-1);
        }
    }
}
