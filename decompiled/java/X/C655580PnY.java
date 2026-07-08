package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0PnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655580PnY {
    public static String LIZ(InterfaceC648350Pbt interfaceC648350Pbt) {
        if (C650560PfS.LIZ) {
            return interfaceC648350Pbt.toString();
        }
        return "";
    }

    @InterfaceC1294060jmO
    public static View LIZIZ(InterfaceC648350Pbt interfaceC648350Pbt) {
        if (interfaceC648350Pbt instanceof InterfaceC648270Pbl) {
            return ((InterfaceC648270Pbl) interfaceC648350Pbt).LJJIIJ();
        }
        return null;
    }

    public static void LIZJ(InterfaceC648350Pbt interfaceC648350Pbt) {
        if (interfaceC648350Pbt instanceof InterfaceC648270Pbl) {
            ((InterfaceC648270Pbl) interfaceC648350Pbt).LLJJJ();
        } else if (interfaceC648350Pbt instanceof InterfaceC655620Pnc) {
            ((InterfaceC655620Pnc) interfaceC648350Pbt).LLJJJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(InterfaceC648350Pbt interfaceC648350Pbt, long j) {
        RecyclerView.ViewHolder viewHolder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play normal card: ");
        Integer numValueOf = null;
        if ((interfaceC648350Pbt instanceof RecyclerView.ViewHolder) && (viewHolder = (RecyclerView.ViewHolder) interfaceC648350Pbt) != null) {
            numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC648350Pbt instanceof InterfaceC648270Pbl) {
            ((InterfaceC648270Pbl) interfaceC648350Pbt).LLLLLIL();
        } else if (interfaceC648350Pbt instanceof InterfaceC655620Pnc) {
            ((InterfaceC655620Pnc) interfaceC648350Pbt).u4(j);
        }
    }
}
