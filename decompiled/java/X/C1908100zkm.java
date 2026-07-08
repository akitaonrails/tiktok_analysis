package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0zkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908100zkm extends RecyclerView.ViewHolder {
    public final C424620Gku LL;
    public final TextView LLILLJJLI;
    public final View LLILLL;
    public final C1908730zln LLILZ;
    public List<? extends User> LLILZIL;

    public C1908100zkm(View view) {
        super(view);
        this.LL = (C424620Gku) view.findViewById(R.id.ljf);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.zym);
        this.LLILLL = view.findViewById(R.id.pen);
        this.LLILZ = (C1908730zln) view.findViewById(R.id.peo);
    }
}
