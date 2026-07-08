package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0PCW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCW {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(RecyclerView recyclerView, InterfaceC648350Pbt interfaceC648350Pbt) {
        RecyclerView.ViewHolder viewHolder;
        boolean z;
        View view;
        InterfaceC648350Pbt interfaceC648350Pbt2;
        InterfaceC648350Pbt interfaceC648350Pbt3;
        View view2;
        InterfaceC648350Pbt interfaceC648350Pbt4 = null;
        if ((interfaceC648350Pbt instanceof RecyclerView.ViewHolder) && (viewHolder = (RecyclerView.ViewHolder) interfaceC648350Pbt) != null) {
            int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(bindingAdapterPosition - 1);
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(bindingAdapterPosition + 1);
            if (viewHolderFindViewHolderForAdapterPosition != 0 && (view2 = viewHolderFindViewHolderForAdapterPosition.itemView) != null && view2.getTop() == viewHolder.itemView.getTop()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                InterfaceC648350Pbt[] interfaceC648350PbtArr = new InterfaceC648350Pbt[2];
                interfaceC648350PbtArr[0] = interfaceC648350Pbt;
                if ((viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt) && (interfaceC648350Pbt3 = (InterfaceC648350Pbt) viewHolderFindViewHolderForAdapterPosition) != null && interfaceC648350Pbt3.N1() && interfaceC648350Pbt3.l2()) {
                    interfaceC648350Pbt4 = interfaceC648350Pbt3;
                }
                interfaceC648350PbtArr[1] = interfaceC648350Pbt4;
                return C13LQ.LJIJI(interfaceC648350PbtArr);
            }
            if (viewHolderFindViewHolderForAdapterPosition2 != 0 && (view = viewHolderFindViewHolderForAdapterPosition2.itemView) != null && view.getTop() == viewHolder.itemView.getTop()) {
                InterfaceC648350Pbt[] interfaceC648350PbtArr2 = new InterfaceC648350Pbt[2];
                interfaceC648350PbtArr2[0] = interfaceC648350Pbt;
                if ((viewHolderFindViewHolderForAdapterPosition2 instanceof InterfaceC648350Pbt) && (interfaceC648350Pbt2 = (InterfaceC648350Pbt) viewHolderFindViewHolderForAdapterPosition2) != null && interfaceC648350Pbt2.N1() && interfaceC648350Pbt2.l2()) {
                    interfaceC648350Pbt4 = interfaceC648350Pbt2;
                }
                interfaceC648350PbtArr2[1] = interfaceC648350Pbt4;
                return C13LQ.LJIJI(interfaceC648350PbtArr2);
            }
            return C1697810uHb.LJIIL(interfaceC648350Pbt);
        }
        return Collections.singletonList(interfaceC648350Pbt);
    }
}
