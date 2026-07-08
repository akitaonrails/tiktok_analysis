package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0z9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885120z9i extends RecyclerView.ViewHolder {
    public final View LL;
    public final ViewGroup LLILLJJLI;
    public final InterfaceC1885140z9k LLILLL;
    public final ImageView LLILZ;
    public final TextView LLILZIL;
    public final ImageView LLILZLL;
    public final TextView LLIZ;
    public final TextView LLIZLLLIL;
    public final LiveIconView LLJ;
    public final View LLJI;
    public final TuxIconView LLJIJIL;
    public final View LLJILJIL;

    public C1885120z9i(C1885150z9l c1885150z9l, View view) {
        C1885110z9h c1885110z9h;
        InterfaceC1885100z9g interfaceC1885100z9gLIZ;
        C687540Qy0 c687540Qy0F51;
        super(view);
        this.LL = view;
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.video_view_container);
        C1885220z9s c1885220z9s = c1885150z9l.LLILZIL;
        C687540Qy0 c687540Qy0 = null;
        if (c1885220z9s != null && (interfaceC1885100z9gLIZ = (c1885110z9h = c1885220z9s.LIZIZ).LIZ(c1885220z9s.LIZ)) != null && (c687540Qy0F51 = interfaceC1885100z9gLIZ.F51(c1885110z9h.LIZ.getContext())) != null) {
            ((ArrayList) c1885220z9s.LIZJ).add(c687540Qy0F51);
            c687540Qy0 = c687540Qy0F51;
        }
        this.LLILLL = c687540Qy0;
        this.LLILZ = (ImageView) view.findViewById(R.id.isc);
        this.LLILZIL = (TextView) view.findViewById(R.id.zgf);
        this.LLILZLL = (ImageView) view.findViewById(R.id.l8e);
        this.LLIZ = (TextView) view.findViewById(R.id.z9o);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.ztw);
        this.LLJ = (LiveIconView) view.findViewById(R.id.jvr);
        this.LLJI = view.findViewById(R.id.irg);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.jum);
        this.LLJILJIL = view.findViewById(R.id.ir8);
    }
}
