package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03A9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03A9 extends RecyclerView.ViewHolder {
    public final View LL;
    public Object LLILLJJLI;
    public final C16F5 LLILLL;

    public C03A9(View view) {
        super(view);
        this.LL = view;
        this.LLILLL = (C16F5) view.findViewById(R.id.eu1);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC786000UsQ(this, 3));
    }
}
