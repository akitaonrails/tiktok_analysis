package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0TUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class ViewOnClickListenerC747590TUf extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final boolean LL;
    public InterfaceC747600TUg LLILLJJLI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC747600TUg interfaceC747600TUg = this.LLILLJJLI;
        if (interfaceC747600TUg != null) {
            interfaceC747600TUg.LIZ(getLayoutPosition());
        }
    }

    public ViewOnClickListenerC747590TUf(View view, boolean z) {
        super(view);
        this.LL = z;
        C786410Ut5.I7(this, this.itemView);
    }
}
