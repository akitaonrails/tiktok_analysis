package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.19aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21563419aC extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final C21562219a0 LLILLJJLI;

    public C21563419aC(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.oki);
        this.LL = textView;
        q0.LJIJI(textView, true);
        this.LLILLJJLI = (C21562219a0) linearLayout.findViewById(R.id.okc);
        if (!z) {
            C786410Ut5.LLIL(textView, 8);
        }
    }
}
