package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ViewOnClickListenerC972400bPa extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final C16F5 LL;
    public final C20744016Fi LLILLJJLI;
    public C972380bPY LLILLL;
    public final /* synthetic */ C972390bPZ LLILZ;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C972380bPY c972380bPY = this.LLILLL;
        if (c972380bPY != null) {
            this.LLILZ.LIZLLL.invoke(c972380bPY);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC972400bPa(C972390bPZ c972390bPZ, View view) {
        super(view);
        this.LLILZ = c972390bPZ;
        this.LL = (C16F5) view.findViewById(R.id.zjf);
        this.LLILLJJLI = (C20744016Fi) view.findViewById(R.id.xwe);
        C786410Ut5.I7(this, this.itemView);
    }
}
