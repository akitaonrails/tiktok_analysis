package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0F6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384580F6a extends RecyclerView.ViewHolder {
    public final C0F90 LL;
    public final ImageView LLILLJJLI;
    public final C1295960jpS LLILLL;

    public C384580F6a(View view) {
        super(view);
        C0F90 c0f90 = (C0F90) view.findViewById(R.id.wmb);
        this.LL = c0f90;
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.wmc);
        this.LLILLL = (C1295960jpS) view.findViewById(R.id.ns2);
        c0f90.setTuxFont(102);
    }
}
