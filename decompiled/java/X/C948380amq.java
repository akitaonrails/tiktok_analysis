package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0amq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948380amq extends RecyclerView.ViewHolder {
    public final View LL;
    public final ImageView LLILLJJLI;
    public final C16F5 LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final C16F5 LLILZLL;

    public C948380amq(View view) {
        View viewFindViewById;
        super(view);
        this.LL = view.findViewById(R.id.m9j);
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.m9l);
        this.LLILLL = (C16F5) view.findViewById(R.id.mgq);
        if (!C934890aR5.LIZ()) {
            viewFindViewById = view.findViewById(R.id.nnp);
        } else {
            viewFindViewById = null;
        }
        this.LLILZ = viewFindViewById;
        this.LLILZIL = view.findViewById(R.id.o4o);
        this.LLILZLL = (C16F5) view.findViewById(R.id.o4p);
    }
}
