package X;

import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ljv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1369410ljv extends DialogC1389100mFg {
    public final Activity LLJILJIL;

    public DialogC1369410ljv(Activity activity) {
        super(activity, R.style.adn);
        this.LLJILJIL = activity;
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.co4);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.adc;
            }
        }
        C197039127h c197039127h = (C197039127h) findViewById(R.id.cv7);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS155S0100000_21(this, 285));
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.okt);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 286));
        }
    }
}
