package X;

import Y.ACListenerS118S0200000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0bgZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982930bgZ extends C0J8P<C982910bgX, C983400bhK> {
    public final InterfaceC983770bhv LIZIZ;

    public C982930bgZ(C981340be0 c981340be0) {
        this.LIZIZ = c981340be0;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX) {
        LJIIIIZZ((C983400bhK) viewHolder, c982910bgX);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C983400bhK(C786410Ut5.Td(layoutInflater, R.layout.h54, viewGroup, false));
    }

    public final void LJIIIIZZ(C983400bhK c983400bhK, C982910bgX c982910bgX) {
        if (c982910bgX.LJ) {
            C786410Ut5.K7((ViewGroup) c983400bhK.LL.getValue(), new ACListenerS118S0200000_15(this, c982910bgX, 69));
        }
        ((View) c983400bhK.LL.getValue()).setSelected(c982910bgX.LJFF);
        ImageView imageView = (ImageView) c983400bhK.LLILLJJLI.getValue();
        C1121670fIL.LJIILIIL(imageView, c982910bgX.LIZIZ, imageView.getWidth(), imageView.getHeight(), R.drawable.el_);
        ((TextView) c983400bhK.LLILLL.getValue()).setText(c982910bgX.LIZJ);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX, List list) {
        C983400bhK c983400bhK = (C983400bhK) viewHolder;
        C982910bgX c982910bgX2 = c982910bgX;
        if (list.size() <= 0) {
            LIZJ(c983400bhK, c982910bgX2);
        } else {
            LJIIIIZZ(c983400bhK, c982910bgX2);
        }
    }
}
