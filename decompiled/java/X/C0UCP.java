package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UCP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCP extends RecyclerView.ViewHolder {
    public final ImageView LL;
    public final View LLILLJJLI;

    public C0UCP(View view) {
        super(view);
        this.LL = (ImageView) view.findViewById(R.id.kb6);
        View viewFindViewById = view.findViewById(R.id.uke);
        this.LLILLJJLI = viewFindViewById;
        if (C768880UEc.LIZ()) {
            viewFindViewById.setBackgroundResource(R.drawable.eew);
        }
    }
}
