package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC930110aJN extends AbstractDialogC972150bPB {
    public final int LLJI;
    public C16F5 LLJIJIL;
    public ImageView LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g8w;
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJIJIL = (C16F5) findViewById(R.id.tby);
        this.LLJILJIL = (ImageView) findViewById(R.id.tbu);
        this.LLJILJILJ = (C16F5) findViewById(R.id.tbw);
        this.LLJILLL = (C16F5) findViewById(R.id.tbx);
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS150S0100000_15(this, 202));
        }
        int i = this.LLJI;
        if (i != 1) {
            if (i == 2) {
                C16F5 c16f5 = this.LLJIJIL;
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJI(2131841149));
                }
                C16F5 c16f52 = this.LLJILJILJ;
                if (c16f52 != null) {
                    c16f52.setText(C497740JfY.LJIJI(2131841136));
                }
                C16F5 c16f53 = this.LLJILLL;
                if (c16f53 != null) {
                    C439101nJ.LJI(c16f53);
                    return;
                }
                return;
            }
            return;
        }
        C16F5 c16f54 = this.LLJIJIL;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJI(2131841137));
        }
        C16F5 c16f55 = this.LLJILJILJ;
        if (c16f55 != null) {
            c16f55.setText(C497740JfY.LJIJI(2131841134));
        }
        C16F5 c16f56 = this.LLJILLL;
        if (c16f56 != null) {
            c16f56.setText(C497740JfY.LJIJI(2131841135));
        }
        C16F5 c16f57 = this.LLJILLL;
        if (c16f57 == null) {
            return;
        }
        C12ES.LJIILL(0, c16f57);
    }

    public DialogC930110aJN(Context context, int i) {
        super(context);
        this.LLJI = i;
    }
}
