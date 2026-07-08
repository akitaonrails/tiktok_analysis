package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10iD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC19319910iD extends DialogC19728412Gs {
    public C19320010iE LL;

    public DialogC19319910iD(Context context) {
        super(context, R.style.aft);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().addFlags(67108864);
        setContentView(R.layout.f7i);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        ((TextView) findViewById(R.id.title)).setText(2131822990);
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 98), findViewById(R.id.bn2));
        C786410Ut5.ue((WebView) findViewById(R.id.webview), this.LL.LIZ);
    }
}
