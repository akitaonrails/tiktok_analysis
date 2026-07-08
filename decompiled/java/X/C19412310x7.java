package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10x7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19412310x7 extends AbstractC960470b6L<C093400Wu> {
    public final TextView LL;

    public C19412310x7(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_title);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        this.LL.setText(((C093400Wu) obj).LIZ);
    }
}
