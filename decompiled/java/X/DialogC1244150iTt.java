package X;

import Y.ACListenerS154S0100000_19;
import Y.ARunnableS25S0110000_6;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class DialogC1244150iTt extends DialogC19728412Gs {
    public InterfaceC1244160iTu LL;
    public boolean LLILLJJLI;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94hmuHMfffRCxvHpU23Iim6Sa8/w6egF4MQ==", null);
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
        View viewFindViewById = findViewById(R.id.tqy);
        if (viewFindViewById != null) {
            HandlerHook.viewPost(viewFindViewById, new ARunnableS25S0110000_6(viewFindViewById, 5));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
        if (!this.LLILLJJLI) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("page_name", "notification_setting_page");
            c2344009Gk.LJIIIIZZ("button_name", "background");
            c2344009Gk.LJIIIIZZ("exp_name", "email_notification_phase2");
            C20684815ws.LJIILLIIL("click_email_bind_popup_page", c2344009Gk.LIZ);
        }
        this.LLILLJJLI = false;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(C12ES.LJIIJ(getContext()), -2);
        }
    }

    public DialogC1244150iTt(Context context) {
        super(context, R.style.aed);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.5f;
            }
            if (window != null) {
                window.addFlags(2);
                window.setAttributes(attributes);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f6h);
        setCanceledOnTouchOutside(true);
        C786410Ut5.h9((TuxTextView) findViewById(R.id.z8b), new ACListenerS154S0100000_19(this, 231));
        C786410Ut5.h9((TuxTextView) findViewById(R.id.zbp), new ACListenerS154S0100000_19(this, 232));
    }
}
