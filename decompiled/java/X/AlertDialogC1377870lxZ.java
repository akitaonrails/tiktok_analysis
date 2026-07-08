package X;

import Y.AAListenerS268S0200000_16;
import Y.ACListenerS124S0200000_21;
import Y.ARunnableS121S0100000_21;
import Y.AUListenerS265S0100000_16;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class AlertDialogC1377870lxZ extends AlertDialog implements DialogInterface.OnKeyListener {
    public final boolean LL;
    public boolean LLILLJJLI;
    public CharSequence LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public Drawable LLILZLL;
    public String LLIZ;
    public long LLIZLLLIL;
    public int LLJ;
    public InterfaceC1375480lti LLJI;
    public TextView LLJIJIL;
    public C19PO LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public View LLJJ;
    public C1620050sGB LLJJI;

    public final void LIZIZ() {
        TuxIconView tuxIconView;
        if (!this.LLILLJJLI || (tuxIconView = (TuxIconView) findViewById(R.id.dax)) == null) {
            return;
        }
        C786410Ut5.x5(tuxIconView, 0.0f);
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C786410Ut5.a9(tuxIconView, new ACListenerS124S0200000_21(this, tuxIconView, 107));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 156);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aRunnableS121S0100000_21.run();
        } else {
            C810560Vqw.LIZJ(aRunnableS121S0100000_21);
        }
        C1620050sGB c1620050sGB = this.LLJJI;
        if (c1620050sGB != null) {
            c1620050sGB.LJIIJJI("download_dialog", false, null);
        }
        C1376270luz.LIZ.getClass();
        C1376270luz.LJIILJJIL = false;
    }

    public AlertDialogC1377870lxZ(Context context) {
        super(context, R.style.i_);
        this.LL = true;
        this.LLJ = 100;
    }

    public static /* synthetic */ void LIZ(AlertDialogC1377870lxZ alertDialogC1377870lxZ) {
        alertDialogC1377870lxZ.getClass();
        C1C7U.LIZ("AwemeCancelableProgressDialog@61d7.dismiss$1L");
        if (alertDialogC1377870lxZ.LLJILJIL == null) {
            alertDialogC1377870lxZ.LLJILJIL = (C19PO) alertDialogC1377870lxZ.findViewById(R.id.lno);
        }
        alertDialogC1377870lxZ.LLJILJIL.LIZIZ();
        super.dismiss();
        C1C7U.LIZIZ("AwemeCancelableProgressDialog@61d7.dismiss$1L");
    }

    public final void LIZJ(int i) {
        if (this.LLILLJJLI) {
            TextView textView = this.LLJILLL;
            if (textView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append("%");
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            C19PO c19po = this.LLJILJIL;
            if (c19po != null) {
                c19po.setProgress(i);
            }
        }
        this.LLILZIL = i;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        C19PO c19po;
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.acp);
        this.LLJJ = findViewById(R.id.tqy);
        this.LLJIJIL = (TextView) findViewById(R.id.o8v);
        this.LLJILJIL = (C19PO) findViewById(R.id.lno);
        this.LLJILJILJ = (TextView) findViewById(R.id.xym);
        findViewById(R.id.dax);
        this.LLJILLL = (TextView) findViewById(R.id.s8j);
        this.LLILLJJLI = true;
        C1620050sGB c1620050sGBLIZ = C0SHX.LIZ(getContext(), null);
        this.LLJJI = c1620050sGBLIZ;
        c1620050sGBLIZ.LJIIJJI("download_dialog", true, null);
        C1376270luz.LIZ.getClass();
        C1376270luz.LJIILJJIL = true;
        setMessage(this.LLILLL);
        boolean z = this.LLILZ;
        if (this.LLILLJJLI) {
            C19PO c19po2 = this.LLJILJIL;
            if (c19po2 != null) {
                c19po2.setIndeterminate(z);
            }
            TextView textView = this.LLJILLL;
            if (textView != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                C786410Ut5.LLIL(textView, i);
            }
        }
        this.LLILZ = z;
        int i2 = this.LLJ;
        if (this.LLILLJJLI && (c19po = this.LLJILJIL) != null) {
            c19po.setMaxProgress(i2);
        }
        this.LLJ = i2;
        LIZJ(this.LLILZIL);
        String str = this.LLIZ;
        if (this.LLILLJJLI && this.LLJILJILJ != null && !C2093608Ic.LJ(str)) {
            this.LLJILJILJ.setText(str);
            C12ES.LJIILL(0, this.LLJILJILJ);
        }
        this.LLIZ = str;
        if (this.LLILLJJLI) {
            if (this.LL) {
                TextView textView2 = this.LLJILLL;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
            } else {
                TextView textView3 = this.LLJILLL;
                if (textView3 != null) {
                    C786410Ut5.LLIL(textView3, 4);
                }
            }
        }
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            if (this.LLILLJJLI) {
                this.LLJJ.setBackground(new LayerDrawable(new Drawable[]{drawable, C800330VaR.LIZIZ(getContext(), R.drawable.ak7)}));
            }
            this.LLILZLL = drawable;
        }
        setOnKeyListener(this);
        this.LLIZLLLIL = System.currentTimeMillis();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setBackgroundDrawable(null);
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(getContext(), "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI8Hv/10outkS7C+q67kD7uvJmwzwFrRu0YrbMQjw==", null));
        attributes.width = displayLLILZIL.getWidth();
        attributes.height = displayLLILZIL.getHeight();
        window.setAttributes(attributes);
    }

    @Override // android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        int i;
        if (this.LLILLJJLI && (textView = this.LLJIJIL) != null) {
            textView.setText(charSequence);
            TextView textView2 = this.LLJIJIL;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView2, i);
        }
        this.LLILLL = charSequence;
    }

    public static AlertDialogC1377870lxZ LIZLLL(Context context, String str) {
        C19PO c19po;
        AlertDialogC1377870lxZ alertDialogC1377870lxZ = new AlertDialogC1377870lxZ(context);
        alertDialogC1377870lxZ.setCancelable(false);
        if (alertDialogC1377870lxZ.LLILLJJLI) {
            C19PO c19po2 = alertDialogC1377870lxZ.LLJILJIL;
            if (c19po2 != null) {
                c19po2.setIndeterminate(false);
            }
            TextView textView = alertDialogC1377870lxZ.LLJILLL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 0);
            }
        }
        alertDialogC1377870lxZ.LLILZ = false;
        if (alertDialogC1377870lxZ.LLILLJJLI && (c19po = alertDialogC1377870lxZ.LLJILJIL) != null) {
            c19po.setMaxProgress(100);
        }
        alertDialogC1377870lxZ.LLJ = 100;
        alertDialogC1377870lxZ.setMessage(str);
        if (alertDialogC1377870lxZ.LLILLJJLI && alertDialogC1377870lxZ.LLJILJILJ != null && !C2093608Ic.LJ(null)) {
            alertDialogC1377870lxZ.LLJILJILJ.setText((CharSequence) null);
            C12ES.LJIILL(0, alertDialogC1377870lxZ.LLJILJILJ);
        }
        alertDialogC1377870lxZ.LLIZ = null;
        if (alertDialogC1377870lxZ.LLILLJJLI) {
            if (alertDialogC1377870lxZ.LL) {
                TextView textView2 = alertDialogC1377870lxZ.LLJILLL;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
            } else {
                TextView textView3 = alertDialogC1377870lxZ.LLJILLL;
                if (textView3 != null) {
                    C786410Ut5.LLIL(textView3, 4);
                }
            }
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && C1893760zNe.LIZ(activityLIZ, true) && !activityLIZ.isFinishing()) {
            C1391850mK7.LIZIZ(alertDialogC1377870lxZ, "download_vidoe_cancelable_progress_dialog");
            alertDialogC1377870lxZ.show();
            C785410UrT.LIZIZ(alertDialogC1377870lxZ);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(alertDialogC1377870lxZ);
            C816490W1f.LIZ(alertDialogC1377870lxZ);
        }
        return alertDialogC1377870lxZ;
    }

    public final void LJ(int i, Context context) {
        ValueAnimator valueAnimatorOfInt;
        ObjectAnimator objectAnimatorOfFloat;
        if (this.LLILLJJLI) {
            AnimatorSet animatorSet = new AnimatorSet();
            View viewFindViewById = findViewById(R.id.tqy);
            this.LLJJ = viewFindViewById;
            ObjectAnimator objectAnimatorOfFloat2 = null;
            if (viewFindViewById != null) {
                valueAnimatorOfInt = ValueAnimator.ofInt(viewFindViewById.getWidth(), i);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(this, 62));
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.setTarget(this.LLJJ);
            } else {
                valueAnimatorOfInt = null;
            }
            View viewFindViewById2 = findViewById(R.id.dax);
            if (viewFindViewById2 != null) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById2, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
            } else {
                objectAnimatorOfFloat = null;
            }
            TextView textView = (TextView) findViewById(R.id.o8v);
            this.LLJIJIL = textView;
            if (textView != null) {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(100L);
                objectAnimatorOfFloat2.addListener(new AAListenerS268S0200000_16(context, this, 5));
            }
            animatorSet.play(valueAnimatorOfInt).with(objectAnimatorOfFloat);
            animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
            animatorSet.start();
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (jCurrentTimeMillis - this.LLIZLLLIL) / 1000);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C794240VDq.LIZJ("ug_save_video_click_back", jSONObject);
            return false;
        }
        return false;
    }
}
