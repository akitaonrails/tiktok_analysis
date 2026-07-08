package X;

import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC989803tw extends DialogC19728412Gs {
    public final String LL;
    public boolean LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public C1295960jpS LLILZIL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        C1295960jpS c1295960jpS = this.LLILZIL;
        if (c1295960jpS != null) {
            c1295960jpS.pauseAnimation();
        }
    }

    public DialogC989803tw(C19EG c19eg, String str) {
        super(new C1361400lX0(c19eg, C987503tZ.LIZ(c19eg, true)));
        this.LL = str;
        setCanceledOnTouchOutside(false);
        boolean z = this.LLILLJJLI;
        this.LLILLJJLI = z;
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setDimAmount(0.5f);
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.0f);
            }
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R.layout.ano);
        this.LLILLL = (LinearLayout) findViewById(R.id.o9n);
        this.LLILZ = (TuxTextView) findViewById(R.id.message_tv);
        this.LLILZIL = (C1295960jpS) findViewById(R.id.nr8);
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.uj, getContext());
            c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZIZ(12));
            linearLayout.setBackground(c384050F3z.LIZ(getContext()));
        }
    }
}
