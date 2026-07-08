package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0llG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370240llG extends RecyclerView.ViewHolder {
    public final View LL;
    public final View LLILLJJLI;
    public final C1369580lkC LLILLL;

    public C1370240llG(View view) {
        super(view);
        this.LL = view.findViewById(R.id.a3q);
        this.LLILLJJLI = view.findViewById(R.id.f683ci3);
        C1369580lkC c1369580lkC = new C1369580lkC(view.getContext(), null, null, 6);
        this.LLILLL = c1369580lkC;
        ((ViewGroup) view).addView(c1369580lkC, new FrameLayout.LayoutParams(-2, -2, 8388659));
    }
}
