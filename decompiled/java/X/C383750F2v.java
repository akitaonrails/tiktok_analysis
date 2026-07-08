package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0F2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383750F2v extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final C383710F2r LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;

    public C383750F2v(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.txt_res_0x7f0a8efa);
        C383710F2r c383710F2r = (C383710F2r) view.findViewById(R.id.kfu);
        c383710F2r.setCornerRadius(C390810FTz.LIZ(4));
        Integer numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), view.getContext());
        if (numLIZJ != null) {
            c383710F2r.setBGColor(numLIZJ.intValue());
        }
        this.LLILLJJLI = c383710F2r;
        this.LLILLL = view.findViewById(R.id.uml);
        this.LLILZ = view.findViewById(R.id.unselected_mask);
    }
}
