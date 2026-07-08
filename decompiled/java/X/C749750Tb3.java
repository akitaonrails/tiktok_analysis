package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Tb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C749750Tb3 extends FrameLayout {
    public C749750Tb3(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.h79, this, true);
        findViewById(R.id.nmf);
    }

    public final void LIZIZ(int i) {
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.nmc);
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
            liveIconView.setIcon(i);
        }
    }

    public final void LIZJ(String str) {
        TextView textView = (TextView) findViewById(R.id.nme);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void LIZLLL(String str) {
        C16F5 c16f5 = (C16F5) findViewById(R.id.nmg);
        c16f5.setText(str);
        C786410Ut5.LLJJJJ(c16f5, 0);
    }

    public final void LIZ(String str, Function0 function0) {
        C16FS c16fs = (C16FS) findViewById(R.id.nmb);
        C500260Jjc.LLFFF(c16fs);
        c16fs.setText(str);
        C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(function0, 484));
    }
}
