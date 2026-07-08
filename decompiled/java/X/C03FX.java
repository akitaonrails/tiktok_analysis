package X;

import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03FX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FX extends LinearLayout {
    public C03FX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewInflate = LinearLayout.inflate(context, R.layout.frj, this);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        viewInflate.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.R7((LinearLayout) findViewById(R.id.x7t), new ACListenerS161S0100000_27(context, 198));
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.x7w);
        C786410Ut5.a9(tuxIconView, new ACListenerS129S0200000_27(tuxIconView, context, 58));
    }
}
