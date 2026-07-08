package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390990mIj extends RecyclerView.ViewHolder {
    public final View LL;
    public final C1390950mIf LLILLJJLI;

    public C1390990mIj(View view) {
        super(view);
        this.LL = view;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.npd);
        C1390950mIf c1390950mIf = new C1390950mIf(C1388190mED.LIZIZ(recyclerView.getContext()));
        this.LLILLJJLI = c1390950mIf;
        recyclerView.setAdapter(c1390950mIf);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
    }
}
