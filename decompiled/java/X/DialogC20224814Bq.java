package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14Bq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class DialogC20224814Bq extends DialogC19728412Gs {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public C20224914Br LL;

    public DialogC20224814Bq(Context context) {
        super(context, R.style.a_f);
    }

    public static DialogC20224814Bq LJJLIIIJLLLLLLLZ(Context context) {
        C20224914Br c20224914Br = new C20224914Br();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://support.tiktok.com/");
        sbLIZ.append(C2273291DyR.LIZ());
        sbLIZ.append("/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok");
        c20224914Br.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        DialogC20224814Bq dialogC20224814Bq = new DialogC20224814Bq(context);
        dialogC20224814Bq.LL = c20224914Br;
        return dialogC20224814Bq;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getWindow() != null) {
            if (C2077408Bw.LIZIZ(getContext())) {
                getWindow().clearFlags(1024);
            }
            getWindow().requestFeature(1);
        }
        try {
            setContentView(R.layout.zs);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(-1, -1);
        }
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        this.LL.getClass();
        if (!TextUtils.isEmpty(null)) {
            this.LL.getClass();
            textView.setText((CharSequence) null);
        } else {
            textView.setText(2131827212);
        }
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 229), findViewById(R.id.bn2));
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        C786410Ut5.te(webView, new WebViewClient());
        C786410Ut5.ue(webView, this.LL.LIZ);
    }
}
