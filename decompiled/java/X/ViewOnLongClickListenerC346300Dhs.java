package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Dhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnLongClickListenerC346300Dhs implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC346300Dhs viewOnLongClickListenerC346300Dhs, View view) {
        return ((C339940DUi) viewOnLongClickListenerC346300Dhs.l0).LLILLJJLI.Mj((C339870DUb) viewOnLongClickListenerC346300Dhs.l1);
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC346300Dhs viewOnLongClickListenerC346300Dhs, View view) {
        InterfaceC337190DJt interfaceC337190DJt;
        int bindingAdapterPosition = ((RecyclerView.ViewHolder) viewOnLongClickListenerC346300Dhs.l0).getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (interfaceC337190DJt = ((C337210DJv) viewOnLongClickListenerC346300Dhs.l1).LLILLJJLI) != null) {
            interfaceC337190DJt.LIZ(bindingAdapterPosition);
            Boolean bool = Boolean.TRUE;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return false;
    }

    public ViewOnLongClickListenerC346300Dhs(RecyclerView.ViewHolder viewHolder, C337210DJv c337210DJv, int i) {
        this.$t = i;
        this.l0 = viewHolder;
        this.l1 = c337210DJv;
    }

    public ViewOnLongClickListenerC346300Dhs(C339940DUi c339940DUi, C339870DUb c339870DUb, C339960DUk c339960DUk, int i, int i2) {
        this.$t = i2;
        this.l0 = c339940DUi;
        this.l1 = c339870DUb;
    }
}
