package X;

import Y.ACListenerS118S0200000_15;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0b9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962530b9f extends C0J8P<C961410b7r, C962540b9g> {
    public final DataChannel LIZIZ;

    public C962530b9f(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961410b7r c961410b7r) {
        C962540b9g c962540b9g = (C962540b9g) viewHolder;
        C961410b7r c961410b7r2 = c961410b7r;
        C786410Ut5.LLJJIJIL((LiveIconView) c962540b9g.LLILLL.getValue(), 8);
        ((TextView) c962540b9g.LL.getValue()).setText(c961410b7r2.LJ);
        C786410Ut5.g8((LiveIconView) c962540b9g.LLILLJJLI.getValue(), new ACListenerS118S0200000_15(this, c961410b7r2, 39));
        C960940b76.LIZIZ(c962540b9g, c961410b7r2);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C962540b9g(C786410Ut5.Td(layoutInflater, R.layout.gsk, viewGroup, false));
    }
}
