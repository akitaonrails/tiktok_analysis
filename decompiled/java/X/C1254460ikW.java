package X;

import Y.ACListenerS122S0200000_19;
import Y.ACListenerS168S0100000_34;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: X.0ikW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254460ikW extends C1BHW {
    public final C1254520ikc LLILZ;

    @Override // X.C1BHV, X.C1BHQ
    public final void setBackClickListener(View.OnClickListener onClickListener) {
        super.setBackClickListener(new ACListenerS122S0200000_19(this, (ACListenerS168S0100000_34) onClickListener, 69));
    }

    public C1254460ikW(Map map, C1254520ikc c1254520ikc) {
        super(map);
        this.LLILZ = c1254520ikc;
    }
}
