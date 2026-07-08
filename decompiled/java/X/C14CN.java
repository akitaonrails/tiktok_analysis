package X;

import Y.ACListenerS164S0100000_30;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.TextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14CN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CN extends DialogC19728412Gs {
    public C14CO LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public TextView LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public TextView LLJ;

    public C14CN(ActivityC2186501Ahk activityC2186501Ahk) {
        super(activityC2186501Ahk);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bml);
        setCanceledOnTouchOutside(false);
        this.LLILZLL = (TextView) findViewById(R.id.k5o);
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            C786410Ut5.LLIL(this.LLILZLL, 8);
        } else {
            C786410Ut5.LLIL(this.LLILZLL, 0);
            this.LLILZLL.setText(this.LLILLJJLI);
        }
        this.LLIZ = (TextView) findViewById(R.id.k5m);
        if (TextUtils.isEmpty(this.LLILLL)) {
            C786410Ut5.LLIL(this.LLIZ, 8);
        } else {
            this.LLIZ.setText(this.LLILLL);
            C786410Ut5.LLIL(this.LLIZ, 0);
        }
        TextView textView = (TextView) findViewById(R.id.k5l);
        this.LLIZLLLIL = textView;
        textView.setText(this.LLILZ);
        TextView textView2 = (TextView) findViewById(R.id.k5n);
        this.LLJ = textView2;
        textView2.setText(this.LLILZIL);
        C786410Ut5.T7(this.LLIZLLLIL, new ACListenerS164S0100000_30(this, 44));
        C786410Ut5.T7(this.LLJ, new ACListenerS164S0100000_30(this, 45));
    }

    public static void LJJLIIIJLLLLLLLZ(ActivityC2186501Ahk activityC2186501Ahk, String str, String str2, String str3, String str4, C14CO c14co) {
        C14CN c14cn = new C14CN(activityC2186501Ahk);
        c14cn.LLILLJJLI = str;
        c14cn.LLILLL = str2;
        c14cn.LLILZ = str4;
        c14cn.LLILZIL = str3;
        c14cn.LL = c14co;
        Window window = c14cn.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        c14cn.show();
        C785410UrT.LIZIZ(c14cn);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(c14cn);
        C816490W1f.LIZ(c14cn);
    }
}
