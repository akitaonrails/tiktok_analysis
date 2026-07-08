package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogC386800FEo extends DialogC19728412Gs {
    public static final /* synthetic */ int LLILZLL = 0;
    public ViewGroup LL;
    public FrameLayout LLILLJJLI;
    public InterfaceC377040EqM LLILLL;
    public C1295960jpS LLILZ;
    public boolean LLILZIL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        this.LLILZIL = false;
        super.dismiss();
        InterfaceC377040EqM interfaceC377040EqM = this.LLILLL;
        if (interfaceC377040EqM != null) {
            interfaceC377040EqM.LIZIZ();
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C786410Ut5.LJZ(4, frameLayout);
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            HandlerHook.viewPostDelay(viewGroup, new ARunnableS105S0100000_5(this, 16), 3000L);
        }
        if (!this.LLILZIL) {
            C1295960jpS c1295960jpS = this.LLILZ;
            if (c1295960jpS != null) {
                c1295960jpS.playAnimation();
            }
            this.LLILZIL = true;
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMnY8IHbTL2L2iz7eL4tqbotAzk2daqIc8t6Bt", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
        super.show();
        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    public DialogC386800FEo(Context context, boolean z) {
        WindowManager.LayoutParams attributes;
        super(context, R.style.ki);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setGravity(17);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            attributes = window3.getAttributes();
            if (attributes != null) {
                attributes.y = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-34));
            }
        } else {
            attributes = null;
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setAttributes(attributes);
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(R.layout.fvi);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.tqy);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.uj);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        viewGroup.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        this.LL = viewGroup;
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.dav);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.jbe);
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.jbf);
        if (!z) {
            C786410Ut5.LJLZ(0, viewGroup2);
            C786410Ut5.LJLZ(8, viewGroup3);
            this.LLILZ = (C1295960jpS) findViewById(R.id.lj5);
        } else {
            C786410Ut5.LJLZ(8, viewGroup2);
            C786410Ut5.LJLZ(0, viewGroup3);
            this.LLILZ = (C1295960jpS) findViewById(R.id.lj6);
        }
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS140S0100000_5(this, 6));
        }
    }
}
