package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972020bOy extends RecyclerView.ViewHolder {
    public final InterfaceC971990bOv LL;
    public final View LLILLJJLI;
    public final C15P4 LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;

    public C972020bOy(View view, InterfaceC971990bOv interfaceC971990bOv) {
        super(view);
        this.LL = interfaceC971990bOv;
        this.LLILLJJLI = view.findViewById(R.id.tsc);
        C15P4 c15p4 = (C15P4) view.findViewById(R.id.xng);
        c15p4.LJIILIIL();
        this.LLILLL = c15p4;
        this.LLILZ = view.findViewById(R.id.xnh);
        this.LLILZIL = view.findViewById(R.id.xni);
        this.LLILZLL = view.findViewById(R.id.xnf);
    }
}
