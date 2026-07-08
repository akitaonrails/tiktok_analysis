package X;

import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ProgressDialogC1397780mTg extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final boolean LL;
    public boolean LLILLJJLI;
    public CharSequence LLILLL;
    public Drawable LLILZ;
    public String LLILZIL;
    public long LLILZLL;
    public final BPEAHandler LLIZ;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 121);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aRunnableS121S0100000_21.run();
        } else {
            C786410Ut5.LJJZZIII(this.LLIZ, aRunnableS121S0100000_21);
        }
    }

    public ProgressDialogC1397780mTg(Context context) {
        super(context, 3);
        this.LL = true;
        this.LLIZ = new BPEAHandler(Looper.getMainLooper());
    }

    public static /* synthetic */ void LIZ(ProgressDialogC1397780mTg progressDialogC1397780mTg) {
        progressDialogC1397780mTg.getClass();
        C1C7U.LIZ("CancellableProgressDialog@6c8d.dismiss$1L");
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("CancellableProgressDialog@6c8d.dismiss$1L");
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.biy);
        this.LLILLJJLI = true;
        setMessage(this.LLILLL);
        setIndeterminate(false);
        String str = this.LLILZIL;
        if (this.LLILLJJLI && (textView = (TextView) findViewById(R.id.xym)) != null && !C2093608Ic.LJ(str)) {
            textView.setText(str);
            C12ES.LJIILL(0, textView);
        }
        this.LLILZIL = str;
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            if (this.LLILLJJLI) {
                findViewById(R.id.tqy);
            }
            this.LLILZ = drawable;
        }
        setOnKeyListener(this);
        this.LLILZLL = System.currentTimeMillis();
    }

    @Override // android.app.ProgressDialog
    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.LLILLJJLI) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.lno);
            if (progressBar != null) {
                progressBar.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.s8j);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView, i);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        int i;
        super.setMessage(charSequence);
        if (this.LLILLJJLI && (textView = (TextView) findViewById(R.id.o8v)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLIL(textView, i);
        }
        this.LLILLL = charSequence;
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        super.setProgress(i);
        TextView textView = (TextView) findViewById(R.id.s8j);
        if (textView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append("%");
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.lno);
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    public static ProgressDialogC1397780mTg LIZIZ(Context context, String str) {
        ProgressDialogC1397780mTg progressDialogC1397780mTg = new ProgressDialogC1397780mTg(context);
        progressDialogC1397780mTg.setCancelable(false);
        progressDialogC1397780mTg.setIndeterminate(false);
        progressDialogC1397780mTg.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            progressDialogC1397780mTg.show();
            C785410UrT.LIZIZ(progressDialogC1397780mTg);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(progressDialogC1397780mTg);
            C816490W1f.LIZ(progressDialogC1397780mTg);
        }
        progressDialogC1397780mTg.setMessage(str);
        View viewFindViewById = progressDialogC1397780mTg.findViewById(R.id.s8j);
        if (viewFindViewById != null) {
            if (progressDialogC1397780mTg.LL) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            } else {
                C786410Ut5.LJLLLLLL(4, viewFindViewById);
                return progressDialogC1397780mTg;
            }
        }
        return progressDialogC1397780mTg;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                new JSONObject().put("time", (jCurrentTimeMillis - this.LLILZLL) / 1000);
                return false;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
