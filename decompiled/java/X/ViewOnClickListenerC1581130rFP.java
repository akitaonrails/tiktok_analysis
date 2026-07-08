package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnClickListenerC1581130rFP implements View.OnClickListener {
    public View.OnClickListener LL;
    public final Function1<View, Unit> LLILLJJLI;

    public ViewOnClickListenerC1581130rFP() {
        throw null;
    }

    public ViewOnClickListenerC1581130rFP(C1580160rDq c1580160rDq) {
        this.LL = null;
        this.LLILLJJLI = c1580160rDq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.LL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.LLILLJJLI.invoke(view);
    }
}
