package X;

import Y.ACListenerS148S0100000_13;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.user.UserStore;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0XRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class DialogC848780XRk extends DialogInterfaceC21560019Ze {
    public static boolean LLJ;
    public static DialogC848780XRk LLJI;
    public final Activity LLIZ;
    public final boolean LLIZLLLIL;

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1rRolYszAemaGcprbD0HpKkU53PE", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "androidx/appcompat/app/AlertDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "androidx/appcompat/app/AlertDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
            super.show();
            c0wst.LIZ(300000, "androidx/appcompat/app/AlertDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        LLJ = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
        LLJ = false;
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        LLJ = false;
        LLJI = null;
    }

    @Override // X.DialogInterfaceC21560019Ze, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = null;
        View viewSd = C786410Ut5.Sd(R.layout.xo, getLayoutInflater(), null);
        if (viewSd != null) {
            C786410Ut5.T7((TextView) viewSd.findViewById(R.id.tv_turn_on), new ACListenerS148S0100000_13(this, 49));
            C786410Ut5.T7((TextView) viewSd.findViewById(R.id.zzh), new ACListenerS148S0100000_13(this, 50));
            TextView textView = (TextView) viewSd.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) viewSd.findViewById(R.id.zf0);
            TextView textView3 = (TextView) viewSd.findViewById(R.id.zzh);
            textView.setText(this.LLIZ.getString(2131835630));
            Activity activity = this.LLIZ;
            Object[] objArr = new Object[1];
            UserStore.LIZ.getClass();
            String str = "";
            String string = UserStore.LIZLLL.getString("mandatory_2sv_nudge_period", "");
            if (string != null) {
                str = string;
            }
            objArr[0] = str;
            textView2.setText(activity.getString(2131835626, objArr));
            if (this.LLIZLLLIL) {
                textView2.setText(this.LLIZ.getString(2131835627));
                textView3.setText(this.LLIZ.getString(2131835628));
            }
        }
        setContentView(viewSd);
        UserStore userStore = UserStore.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        userStore.getClass();
        UserStore.LJ.putLong("last_show_hpas_dialog_time", jCurrentTimeMillis).apply();
        setCanceledOnTouchOutside(false);
        setCancelable(!this.LLIZLLLIL);
        C0XGR c0xgr = new C0XGR();
        try {
            stringExtra = this.LLIZ.getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c0xgr.LIZJ("enter_from", stringExtra);
        if (this.LLIZLLLIL) {
            C20684815ws.LJIILLIIL("show_twosv_mandatory_popup", c0xgr.LIZ);
        } else {
            C20684815ws.LJIILLIIL("show_twosv_nudge_popup", c0xgr.LIZ);
        }
    }

    public DialogC848780XRk(C19EG c19eg, boolean z) {
        super(c19eg, R.style.a_a);
        this.LLIZ = c19eg;
        this.LLIZLLLIL = z;
    }
}
