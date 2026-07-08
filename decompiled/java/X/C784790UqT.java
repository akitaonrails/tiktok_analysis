package X;

import Y.ACListenerS147S0100000_12;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0UqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784790UqT extends C0J8P<C1105460esC, C784800UqU> {
    public boolean LIZIZ;
    public final DataChannel LIZJ;
    public final InterfaceC784660UqG LIZLLL;
    public boolean LJ;

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C1105460esC c1105460esC) {
        List<String> listLIZ;
        C784800UqU c784800UqU = (C784800UqU) viewHolder;
        C1105460esC c1105460esC2 = c1105460esC;
        ImageModel avatarThumb = c1105460esC2.LIZ.getAvatarThumb();
        if (avatarThumb != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null && listLIZ.size() > 0) {
            ImageView imageViewI5 = c784800UqU.I5();
            ImageModel avatarThumb2 = c1105460esC2.LIZ.getAvatarThumb();
            int width = c784800UqU.I5().getWidth();
            int height = c784800UqU.I5().getHeight();
            if (imageViewI5 != null && avatarThumb2 != null) {
                C0JSS.LJIIIIZZ(imageViewI5, avatarThumb2, width, height, R.drawable.eze, new C521890KdP(this, 10));
            }
        } else {
            c784800UqU.I5().setImageDrawable(c784800UqU.itemView.getContext().getDrawable(R.drawable.eze));
        }
        if (c1105460esC2.LIZIZ > 0 && this.LIZIZ) {
            long j = c1105460esC2.LIZJ;
            if (j == 1) {
                c784800UqU.I5().setBackground(C497740JfY.LJIIJ(R.drawable.e5x));
            } else if (j == 2) {
                c784800UqU.I5().setBackground(C497740JfY.LJIIJ(R.drawable.e5z));
            } else if (j == 3) {
                c784800UqU.I5().setBackground(C497740JfY.LJIIJ(R.drawable.e61));
            }
        } else {
            c784800UqU.I5().setBackground(null);
        }
        C786410Ut5.Q7(c784800UqU.I5(), new ACListenerS147S0100000_12(this, 459));
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C784800UqU c784800UqU = new C784800UqU(viewGroup);
        c784800UqU.I5().setImageDrawable(c784800UqU.itemView.getContext().getDrawable(R.drawable.eze));
        return c784800UqU;
    }

    public C784790UqT(boolean z, DataChannel dataChannel, InterfaceC784660UqG interfaceC784660UqG) {
        this.LIZIZ = z;
        this.LIZJ = dataChannel;
        this.LIZLLL = interfaceC784660UqG;
    }
}
