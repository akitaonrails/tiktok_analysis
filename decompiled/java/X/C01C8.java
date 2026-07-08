package X;

import android.view.View;

/* JADX INFO: renamed from: X.01C8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C8 implements View.OnClickListener {
    public final View.OnClickListener LL;
    public long LLILLJJLI;

    public C01C8(View.OnClickListener onClickListener) {
        this.LL = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLILLJJLI > 300) {
            View.OnClickListener onClickListener = this.LL;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            this.LLILLJJLI = jCurrentTimeMillis;
        }
    }
}
