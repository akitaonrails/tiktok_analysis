package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809620xBw extends AbstractC485930J3v<C1809650xBz, C1809630xBx> {
    public final DataChannel LIZLLL;

    public C1809620xBw(DataChannel dataChannel) {
        super(R.layout.gqu, Boolean.FALSE);
        this.LIZLLL = dataChannel;
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        int i;
        C1809630xBx c1809630xBx = (C1809630xBx) viewHolder;
        ImageView imageView = c1809630xBx.LL;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n_;
        imageView.setImageDrawable(c0hti.LIZ(c1809630xBx.itemView.getContext()));
        TuxTextView tuxTextView = c1809630xBx.LLILLJJLI;
        if (((C1809650xBz) obj).LIZIZ) {
            i = 2131855596;
        } else {
            i = 2131855608;
        }
        tuxTextView.setText(C497740JfY.LJIJI(i));
    }

    @Override // X.AbstractC485930J3v
    public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
        C289801Ai.LIZ(view, viewGroup, this.LIZLLL);
        return new C1809630xBx(view);
    }
}
