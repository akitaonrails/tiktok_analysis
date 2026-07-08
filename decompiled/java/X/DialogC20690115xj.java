package X;

import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class DialogC20690115xj extends AbstractDialogC972150bPB {
    public final Uri LLJI;
    public final int LLJIJIL;
    public final Function2<? super Uri, ? super Integer, Unit> LLJILJIL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g_6;
    }

    public final void LJL() {
        if (isShowing()) {
            dismiss();
            C785410UrT.LIZ(this);
        }
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C0GUM) findViewById(R.id.pmg)).e0((int) C497740JfY.LIZIZ(8.0f), 0, (int) C497740JfY.LIZIZ(8.0f), 0);
        ((C16FS) findViewById(R.id.pmf)).setText(C497740JfY.LJIJI(2131842027));
        ((TextView) findViewById(R.id.pmj)).setText(C497740JfY.LJIJI(2131842028));
        int i = this.LLJIJIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C786410Ut5.h8((C16FS) findViewById(R.id.pmf), new ACListenerS165S0100000_31(this, 161));
                }
            } else {
                C786410Ut5.h8((C16FS) findViewById(R.id.pmf), new ACListenerS165S0100000_31(this, 160));
            }
        } else {
            C786410Ut5.h8((C16FS) findViewById(R.id.pmf), new ACListenerS165S0100000_31(this, 159));
        }
        C786410Ut5.m8((C16FV) findViewById(R.id.pmh), new ACListenerS165S0100000_31(this, 162));
    }

    public DialogC20690115xj(Context context, Uri uri, int i, C0USD c0usd) {
        super(context);
        this.LLJI = uri;
        this.LLJIJIL = i;
        this.LLJILJIL = c0usd;
    }
}
