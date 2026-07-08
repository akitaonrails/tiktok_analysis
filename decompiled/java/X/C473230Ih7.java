package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ih7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473230Ih7 extends RecyclerView.ViewHolder {
    public final View LL;
    public final C1324720kZq LLILLJJLI;

    public C473230Ih7(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.qdj);
        this.LL = viewFindViewById;
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.qcl);
        if (C768880UEc.LIZ() || C500260Jjc.LJIL()) {
            viewFindViewById.setBackgroundResource(R.drawable.efa);
        }
    }
}
