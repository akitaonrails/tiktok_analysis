package X;

import Y.ACListenerS131S0200000_29;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.118d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194513118d extends AnonymousClass1194<String, C194513118d>.a {
    public final TextView LL;

    public C194513118d(C194512118c c194512118c, View view) {
        super(c194512118c, view);
        this.LL = (TextView) view.findViewById(R.id.jpp);
        C786410Ut5.Q7((ImageView) view.findViewById(R.id.jpe), new ACListenerS131S0200000_29(c194512118c, this, 69));
    }
}
