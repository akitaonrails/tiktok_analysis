package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887970zEJ extends AbstractC960470b6L<C1868290yiZ> {
    public final TextView LL;

    public C1887970zEJ(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_title);
    }

    public final void L5(C1868290yiZ c1868290yiZ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1868290yiZ.LIZ);
        sbLIZ.append(": ");
        sbLIZ.append(c1868290yiZ.LIZIZ);
        this.LL.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C1868290yiZ) obj);
    }
}
