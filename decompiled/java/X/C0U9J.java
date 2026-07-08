package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U9J, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9J extends RecyclerView.ViewHolder {
    public final View LL;

    public C0U9J(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.uke);
        this.LL = viewFindViewById;
        if (C768880UEc.LIZ() && viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.drawable.eew);
        }
    }
}
