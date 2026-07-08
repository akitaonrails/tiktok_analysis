package X;

import Y.ACListenerS118S0200000_15;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0b7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961000b7C extends C0J8P<C960600b6Y, C961610b8B> {
    public final RecyclerView LIZIZ;
    public final Function1<Integer, Unit> LIZJ;

    public C961000b7C(RunnableC781530UlD runnableC781530UlD, AwS594S0100000_15 awS594S0100000_15) {
        this.LIZIZ = runnableC781530UlD;
        this.LIZJ = awS594S0100000_15;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C960600b6Y c960600b6Y) {
        int i;
        C961610b8B c961610b8B = (C961610b8B) viewHolder;
        C960600b6Y c960600b6Y2 = c960600b6Y;
        ((TextView) c961610b8B.LLILLJJLI.getValue()).setText(c960600b6Y2.LJ);
        ImageView imageView = (ImageView) c961610b8B.LL.getValue();
        if (c960600b6Y2.LJFF) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZI(i, imageView);
        if (c960600b6Y2.LJI) {
            C786410Ut5.LLJJIJIL((LiveIconView) c961610b8B.LLILLL.getValue(), 0);
            C786410Ut5.g8((LiveIconView) c961610b8B.LLILLL.getValue(), new ACListenerS118S0200000_15(this, c961610b8B, 38));
        } else {
            C786410Ut5.LLJJIJIL((LiveIconView) c961610b8B.LLILLL.getValue(), 8);
        }
        C960940b76.LIZIZ(c961610b8B, c960600b6Y2);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C961610b8B(C786410Ut5.Td(layoutInflater, R.layout.gq8, viewGroup, false));
    }
}
