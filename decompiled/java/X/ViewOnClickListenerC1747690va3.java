package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0va3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ViewOnClickListenerC1747690va3 extends RecyclerView.ViewHolder implements View.OnClickListener {
    public InterfaceC1747710va5 LL;

    public ViewOnClickListenerC1747690va3(View view) {
        super(view);
        C786410Ut5.I7(this, this.itemView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1747710va5 interfaceC1747710va5 = this.LL;
        if (interfaceC1747710va5 != null) {
            interfaceC1747710va5.LIZ(getLayoutPosition());
        }
    }
}
