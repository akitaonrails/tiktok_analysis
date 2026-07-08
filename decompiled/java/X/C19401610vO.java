package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19401610vO extends RecyclerView.ViewHolder {
    public final C424560Gko LL;
    public final RoundedFrameLayout LLILLJJLI;
    public final View LLILLL;
    public final float LLILZ;

    public C19401610vO(View view) {
        super(view);
        this.LL = (C424560Gko) view.findViewById(R.id.s3g);
        this.LLILLJJLI = (RoundedFrameLayout) view.findViewById(R.id.s3i);
        this.LLILLL = view.findViewById(R.id.s3h);
        this.LLILZ = 22.0f * view.getContext().getResources().getDisplayMetrics().density;
    }
}
