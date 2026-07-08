package X;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;

/* JADX INFO: renamed from: X.0Pbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648300Pbo {
    public static InterfaceC648720PcU LIZ(InterfaceC648310Pbp interfaceC648310Pbp) {
        Taco tacoLIZ = C0PCE.LIZ(interfaceC648310Pbp.d5(), false);
        if (tacoLIZ == null) {
            return null;
        }
        return (InterfaceC648720PcU) ((SparseArray) tacoLIZ.LLIZLLLIL.getValue()).get(interfaceC648310Pbp.y1());
    }

    public static void LIZLLL(InterfaceC648310Pbp interfaceC648310Pbp) {
        InterfaceC648720PcU interfaceC648720PcULLL = interfaceC648310Pbp.LLL();
        if (interfaceC648310Pbp.K4() && interfaceC648720PcULLL != null) {
            interfaceC648720PcULLL.LJFF();
        } else {
            C655580PnY.LIZJ(interfaceC648310Pbp);
        }
    }

    public static void LIZJ(InterfaceC648310Pbp interfaceC648310Pbp, View view) {
        if (!interfaceC648310Pbp.K4()) {
            return;
        }
        if (view.isAttachedToWindow()) {
            Taco tacoLIZ = C0PCE.LIZ(view, false);
            if (tacoLIZ != null) {
                if (((SparseArray) tacoLIZ.LLIZLLLIL.getValue()).get(interfaceC648310Pbp.y1()) == null) {
                    InterfaceC648720PcU interfaceC648720PcUN5 = interfaceC648310Pbp.n5();
                    int iY1 = interfaceC648310Pbp.y1();
                    interfaceC648720PcUN5.LIZIZ(tacoLIZ.LIZJ());
                    ((SparseArray) tacoLIZ.LLIZLLLIL.getValue()).put(iY1, interfaceC648720PcUN5);
                    return;
                }
                return;
            }
            return;
        }
        view.addOnAttachStateChangeListener(new C0R47(view, view, interfaceC648310Pbp, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(InterfaceC648310Pbp interfaceC648310Pbp, long j) {
        RecyclerView.ViewHolder viewHolder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play group card: ");
        Integer numValueOf = null;
        if ((interfaceC648310Pbp instanceof RecyclerView.ViewHolder) && (viewHolder = (RecyclerView.ViewHolder) interfaceC648310Pbp) != null) {
            numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C0BE5.LIZ && C0P8F.LIZ()) {
            return;
        }
        InterfaceC648720PcU interfaceC648720PcULLL = interfaceC648310Pbp.LLL();
        if (interfaceC648310Pbp.K4() && interfaceC648720PcULLL != null) {
            interfaceC648720PcULLL.LJ();
        } else {
            C655580PnY.LIZLLL(interfaceC648310Pbp, j);
        }
    }

    public static void LIZIZ(InterfaceC648310Pbp interfaceC648310Pbp, Aweme aweme, C0PBW c0pbw) {
        InterfaceC648720PcU interfaceC648720PcULLL = interfaceC648310Pbp.LLL();
        if (interfaceC648720PcULLL != null) {
            interfaceC648720PcULLL.LJJLL(aweme, c0pbw);
        }
    }
}
