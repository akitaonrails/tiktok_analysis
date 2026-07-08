package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010980cPo extends LinearLayout {
    public final TextView LL;

    public C1010980cPo(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0);
        C01GW c01gw = C07AC.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            i = R.layout.esz;
        } else if (((Number) c01gw.getValue()).intValue() == 2) {
            i = R.layout.esy;
        } else {
            i = R.layout.esx;
        }
        LinearLayout.inflate(context, i, this);
        this.LL = (TextView) findViewById(R.id.yxn);
    }
}
