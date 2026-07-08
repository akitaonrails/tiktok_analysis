package X;

import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337250DJz extends FrameLayout implements InterfaceC337240DJy {
    public C337250DJz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.dlx, this);
    }

    @Override // X.InterfaceC337240DJy
    public final void LIZ(User user, C449940Hke c449940Hke) {
        int i;
        View viewFindViewById = findViewById(R.id.sn8);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        if (C467860IWi.LIZ(getContext())) {
            i = R.attr.a1f;
        } else {
            i = R.attr.a1e;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        viewFindViewById.setBackground(c384050F3z.LIZ(getContext()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('@');
        sbLIZ.append(user.getNickname());
        ((TextView) findViewById(R.id.p9j)).setText(C2188811AlT.LIZIZ(sbLIZ));
        if (((Boolean) C2279851ELn.LIZLLL.getValue()).booleanValue()) {
            View viewFindViewById2 = findViewById(R.id.e29);
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C786410Ut5.I7(new ACListenerS108S0200000_4(viewFindViewById2, c449940Hke, 30), viewFindViewById2);
            return;
        }
        C786410Ut5.LJLLLLLL(8, findViewById(R.id.e29));
    }
}
