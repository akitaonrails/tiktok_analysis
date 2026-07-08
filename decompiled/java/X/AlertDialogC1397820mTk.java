package X;

import Y.ACListenerS155S0100000_21;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public final class AlertDialogC1397820mTk extends AlertDialog {
    public boolean LL;
    public CharSequence LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public InterfaceC1397830mTl LLIZ;
    public TextView LLIZLLLIL;
    public C19PP LLJ;
    public ImageView LLJI;
    public TextView LLJIJIL;
    public View LLJILJIL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C19PP c19pp = this.LLJ;
        if (c19pp == null) {
            c19pp = null;
        }
        c19pp.LIZIZ();
        super.dismiss();
    }

    public AlertDialogC1397820mTk(C19EG c19eg) {
        super(c19eg, 3);
        this.LLILZLL = 100;
    }

    public final void LIZ(int i) {
        if (this.LL) {
            TextView textView = this.LLJIJIL;
            C19PP c19pp = null;
            if (textView == null) {
                textView = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            C19PP c19pp2 = this.LLJ;
            if (c19pp2 != null) {
                c19pp = c19pp2;
            }
            c19pp.setProgress(i);
        }
        this.LLILZIL = i;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.d9i);
        this.LLJILJIL = findViewById(R.id.tqy);
        this.LLIZLLLIL = (TextView) findViewById(R.id.o8v);
        this.LLJ = (C19PP) findViewById(R.id.lno);
        this.LLJI = (ImageView) findViewById(R.id.dav);
        this.LLJIJIL = (TextView) findViewById(R.id.s8j);
        ImageView imageView = this.LLJI;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS155S0100000_21(this, 280));
        this.LL = true;
        setMessage(this.LLILLJJLI);
        boolean z = this.LLILLL;
        int i2 = 0;
        if (this.LL) {
            C19PP c19pp = this.LLJ;
            if (c19pp == null) {
                c19pp = null;
            }
            c19pp.setIndeterminate(z);
            TextView textView = this.LLJIJIL;
            if (textView == null) {
                textView = null;
            }
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView, i);
        }
        this.LLILLL = z;
        int i3 = this.LLILZLL;
        if (this.LL) {
            C19PP c19pp2 = this.LLJ;
            if (c19pp2 == null) {
                c19pp2 = null;
            }
            c19pp2.setMaxProgress(i3);
        }
        this.LLILZLL = i3;
        LIZ(this.LLILZIL);
        setCanceledOnTouchOutside(false);
        boolean z2 = this.LLILZ;
        if (this.LL) {
            ImageView imageView3 = this.LLJI;
            if (imageView3 != null) {
                imageView2 = imageView3;
            }
            if (!z2) {
                i2 = 8;
            }
            C786410Ut5.LJZI(i2, imageView2);
        }
        this.LLILZ = z2;
    }

    @Override // android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.LL) {
            TextView textView = this.LLIZLLLIL;
            TextView textView2 = null;
            if (textView == null) {
                textView = null;
            }
            textView.setText(charSequence);
            TextView textView3 = this.LLIZLLLIL;
            if (textView3 != null) {
                textView2 = textView3;
            }
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView2, i);
        }
        this.LLILLJJLI = charSequence;
    }
}
