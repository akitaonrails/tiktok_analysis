package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0TlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756090TlH extends RecyclerView.ViewHolder {
    public final View LL;

    public C756090TlH(View view) {
        super(view);
        this.LL = view;
    }

    public final void I5(String str) {
        if (str != null && str.length() > 0) {
            ((TextView) this.LL.findViewById(R.id.hij)).setText(C786410Ut5.j4(" (%s)", Arrays.copyOf(new Object[]{str}, 1)));
        } else {
            ((TextView) this.LL.findViewById(R.id.hij)).setText((CharSequence) null);
        }
    }
}
