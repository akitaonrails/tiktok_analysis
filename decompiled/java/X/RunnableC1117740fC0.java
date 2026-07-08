package X;

import android.widget.ImageView;

/* JADX INFO: renamed from: X.0fC0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class RunnableC1117740fC0 implements Runnable {
    public final /* synthetic */ C1117710fBx LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CharSequence LLILLL;
    public final /* synthetic */ int LLILZ;

    public RunnableC1117740fC0(C1117710fBx c1117710fBx, String str, CharSequence charSequence, int i) {
        this.LL = c1117710fBx;
        this.LLILLJJLI = str;
        this.LLILLL = charSequence;
        this.LLILZ = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("UserLevelPanel@7018.showGameplayHint$1");
        try {
            this.LL.LLL = false;
            InterfaceC1106030et7.B8.LIZJ(this.LLILLJJLI);
            this.LL.LLILLJJLI.setText(this.LLILLL);
            ImageView imageView = this.LL.LLJJJ;
            C1117830fC9.LJ(this.LLILZ, imageView);
            imageView.requestLayout();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserLevelPanel@7018.showGameplayHint$1");
    }
}
