package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888880zFm extends RecyclerView.ViewHolder {
    public final C20743416Fc LL;
    public final C20743416Fc LLILLJJLI;
    public final C16FV LLILLL;
    public final C20744016Fi LLILZ;

    public C1888880zFm(View view) {
        super(view);
        this.LL = (C20743416Fc) view.findViewById(R.id.f1y);
        this.LLILLJJLI = (C20743416Fc) view.findViewById(R.id.f21);
        C20744016Fi c20744016Fi = (C20744016Fi) view.findViewById(R.id.f24);
        this.LLILZ = c20744016Fi;
        this.LLILLL = (C16FV) view.findViewById(R.id.f1g);
        c20744016Fi.setClickable(false);
        C20743916Fh c20743916Fh = c20744016Fi.LLIZLLLIL;
        if (c20743916Fh != null) {
            c20743916Fh.LJI(R.style.a8l);
        }
        c20744016Fi.LLJ.LJI(R.style.a8l);
    }
}
