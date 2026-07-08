package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zEK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887980zEK extends AbstractC960470b6L<C1868240yiU> {
    public final TextView LL;

    public C1887980zEK(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_sort_title);
        view.findViewById(R.id.lva);
    }

    @Override // X.AbstractC960470b6L
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public final void I5(C1868240yiU c1868240yiU, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i + 1);
        sbLIZ.append('.');
        C2188811AlT.LIZIZ(sbLIZ);
        String strValueOf = String.valueOf(c1868240yiU.LIZ.LIZIZ);
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(strValueOf);
        }
    }
}
