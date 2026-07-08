package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0n3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420180n3o extends RecyclerView.ViewHolder {
    public final InterfaceC1420190n3p LL;
    public final ViewGroup LLILLJJLI;
    public final TuxIconView LLILLL;
    public final C1322110kVd LLILZ;
    public final C0HZQ LLILZIL;
    public final FrameLayout LLILZLL;

    public C1420180n3o(FrameLayout frameLayout, InterfaceC1420190n3p interfaceC1420190n3p) {
        super(frameLayout);
        this.LL = interfaceC1420190n3p;
        this.LLILLJJLI = (ViewGroup) frameLayout.findViewById(R.id.kc4);
        this.LLILLL = (TuxIconView) frameLayout.findViewById(R.id.n9h);
        this.LLILZ = (C1322110kVd) frameLayout.findViewById(R.id.kf2);
        this.LLILZIL = (C0HZQ) frameLayout.findViewById(R.id.dqk);
        this.LLILZLL = (FrameLayout) frameLayout.findViewById(R.id.dqp);
    }
}
