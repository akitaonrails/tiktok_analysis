package X;

import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ProgressDialogC1397770mTf extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final boolean LL;
    public boolean LLILLJJLI;
    public CharSequence LLILLL;
    public Drawable LLILZ;
    public String LLILZIL;
    public long LLILZLL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 157);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aRunnableS121S0100000_21.run();
        } else {
            C810560Vqw.LIZJ(aRunnableS121S0100000_21);
        }
    }

    public ProgressDialogC1397770mTf(Context context) {
        super(context, 3);
        this.LL = true;
    }

    public static /* synthetic */ void LIZ(ProgressDialogC1397770mTf progressDialogC1397770mTf) {
        progressDialogC1397770mTf.getClass();
        C1C7U.LIZ("AwemeProgressDialog@d6c.dismiss$1L");
        try {
            C19PO c19po = (C19PO) progressDialogC1397770mTf.findViewById(R.id.lno);
            if (c19po != null) {
                c19po.LIZIZ();
            }
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("AwemeProgressDialog@d6c.dismiss$1L");
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View viewFindViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.d2w);
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
            if (this.LLILLJJLI && (viewFindViewById = findViewById(R.id.tqy)) != null) {
                viewFindViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C800330VaR.LIZIZ(getContext(), R.drawable.ak7)}));
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
            C19PO c19po = (C19PO) findViewById(R.id.lno);
            if (c19po != null) {
                c19po.setIndeterminate(z);
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
        C19PO c19po = (C19PO) findViewById(R.id.lno);
        if (c19po != null) {
            c19po.setProgress(i);
        }
    }

    public static ProgressDialogC1397770mTf LIZIZ(Context context, String str) {
        ProgressDialogC1397770mTf progressDialogC1397770mTf = new ProgressDialogC1397770mTf(context);
        progressDialogC1397770mTf.setCancelable(false);
        progressDialogC1397770mTf.setIndeterminate(false);
        progressDialogC1397770mTf.setMax(100);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && !activityLIZ.isFinishing()) {
            progressDialogC1397770mTf.show();
            C785410UrT.LIZIZ(progressDialogC1397770mTf);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(progressDialogC1397770mTf);
            C816490W1f.LIZ(progressDialogC1397770mTf);
        }
        progressDialogC1397770mTf.setMessage(str);
        View viewFindViewById = progressDialogC1397770mTf.findViewById(R.id.s8j);
        if (viewFindViewById != null) {
            if (progressDialogC1397770mTf.LL) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            } else {
                C786410Ut5.LJLLLLLL(4, viewFindViewById);
                return progressDialogC1397770mTf;
            }
        }
        return progressDialogC1397770mTf;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (jCurrentTimeMillis - this.LLILZLL) / 1000);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C794240VDq.LIZJ("ug_save_video_click_back", jSONObject);
            return false;
        }
        return false;
    }
}
