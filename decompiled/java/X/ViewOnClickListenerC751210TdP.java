package X;

import android.view.View;

/* JADX INFO: renamed from: X.0TdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class ViewOnClickListenerC751210TdP implements View.OnClickListener {
    public final View.OnClickListener LL;
    public long LLILLJJLI;

    public ViewOnClickListenerC751210TdP(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (Math.abs(this.LLILLJJLI - System.currentTimeMillis()) < 1000) {
            return;
        }
        this.LLILLJJLI = System.currentTimeMillis();
        this.LL.onClick(view);
    }
}
