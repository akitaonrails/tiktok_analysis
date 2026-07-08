package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.view.hub.ProfileNaviHubFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.110W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C110W extends DialogC1389100mFg {
    public final C110X LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.LLJILJILJ) {
            C19423210ys.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "avatar_hub");
            c2344009Gk.LJIIIIZZ("exit_method", "tap");
            C20684815ws.LJIILLIIL("cancel_more_option_avatar_profile", c2344009Gk.LIZ);
        }
        super.dismiss();
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.eh8);
        C786410Ut5.h9((TuxTextView) findViewById(R.id.s45), new ACListenerS163S0100000_29(this, 1));
        C786410Ut5.h9((TuxTextView) findViewById(R.id.s46), new ACListenerS163S0100000_29(this, 138));
        C786410Ut5.h9((TuxTextView) findViewById(R.id.s47), new ACListenerS163S0100000_29(this, 139));
    }

    public C110W(C19EG c19eg, ProfileNaviHubFragment profileNaviHubFragment) {
        super(c19eg, R.style.af_);
        this.LLJILJIL = profileNaviHubFragment;
        this.LLJILJILJ = true;
    }
}
