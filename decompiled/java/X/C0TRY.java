package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TRY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TRY extends RecyclerView.ViewHolder {
    public final C127K LL;

    public C0TRY(View view) {
        super(view);
        C127K c127k = (C127K) view.findViewById(R.id.yj1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, c127k.getContext());
        if (numLIZJ != null) {
            view.findViewById(R.id.yj1).setBackgroundColor(numLIZJ.intValue());
        }
        this.LL = c127k;
    }
}
