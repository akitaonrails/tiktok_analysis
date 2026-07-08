package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361180EEa extends RecyclerView.ViewHolder {
    public final View LL;
    public final C0EJV LLILLJJLI;

    public C361180EEa(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.jt4);
        this.LL = viewFindViewById;
        this.LLILLJJLI = (C0EJV) view.findViewById(R.id.jt3);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1h);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
    }
}
