package X;

import Y.ARunnableS130S0100000_30;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: renamed from: X.1Dh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262491Dh1 {
    public RecyclerView LIZ;
    public C21688219uK LIZIZ;
    public InterfaceC2262521Dh4 LIZJ;
    public RecyclerView.ViewHolder LJ;
    public final Set<RecyclerView.ViewHolder> LIZLLL = new LinkedHashSet();
    public C2262511Dh3 LJFF = new C2262511Dh3(0.0f, 0.0f, 127);

    public final void LIZ(RecyclerView.ViewHolder viewHolder) {
        C2262481Dh0 c2262481Dh0;
        BPEAHandler bPEAHandler;
        BPEAHandler bPEAHandler2;
        if (viewHolder.getAdapterPosition() == 0) {
            viewHolder.itemView.setOnTouchListener(null);
            viewHolder.itemView.setTag(R.id.s6b, null);
            this.LIZLLL.remove(viewHolder);
            return;
        }
        if (this.LIZLLL.contains(viewHolder)) {
            Object tag = viewHolder.itemView.getTag(R.id.s6b);
            if ((tag instanceof C2262481Dh0) && (c2262481Dh0 = (C2262481Dh0) tag) != null) {
                View viewLIZIZ = c2262481Dh0.LIZIZ();
                viewLIZIZ.animate().cancel();
                viewLIZIZ.animate().scaleX(1.0f).scaleY(1.0f).setDuration(c2262481Dh0.LIZIZ.LJFF).start();
                c2262481Dh0.LJIIIIZZ = false;
                c2262481Dh0.LJIIIZ = false;
                c2262481Dh0.LJIIJ = false;
                ARunnableS130S0100000_30 aRunnableS130S0100000_30 = c2262481Dh0.LJIILIIL;
                if (aRunnableS130S0100000_30 != null && (bPEAHandler2 = c2262481Dh0.LJIIL) != null) {
                    bPEAHandler2.removeCallbacks(aRunnableS130S0100000_30);
                }
                ARunnableS130S0100000_30 aRunnableS130S0100000_302 = c2262481Dh0.LJIILJJIL;
                if (aRunnableS130S0100000_302 != null && (bPEAHandler = c2262481Dh0.LJIIL) != null) {
                    bPEAHandler.removeCallbacks(aRunnableS130S0100000_302);
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC2262521Dh4 interfaceC2262521Dh4 = this.LIZJ;
        if (interfaceC2262521Dh4 == null) {
            return;
        }
        C2262481Dh0 c2262481Dh02 = new C2262481Dh0(viewHolder, this.LJFF, new AwS649S0100000_35(interfaceC2262521Dh4, 20), new AwS649S0100000_35(interfaceC2262521Dh4, 21), new AwS614S0100000_35(interfaceC2262521Dh4, 167));
        viewHolder.itemView.setTag(R.id.s6b, c2262481Dh02);
        viewHolder.itemView.setOnTouchListener(new ViewOnTouchListenerC2262471Dgz(this, c2262481Dh02));
        this.LIZLLL.add(viewHolder);
        viewHolder.itemView.setOnLongClickListener(null);
    }
}
