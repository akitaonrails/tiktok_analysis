package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC928320aGU extends AbstractDialogC972150bPB {
    public String LLJI;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g9r;
    }

    public DialogC928320aGU(Context context) {
        super(context);
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TextView textView = (TextView) findViewById(R.id.nx1);
        if (textView != null && (str = this.LLJI) != null) {
            textView.setText(str);
        }
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.crj);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 302));
        }
    }
}
