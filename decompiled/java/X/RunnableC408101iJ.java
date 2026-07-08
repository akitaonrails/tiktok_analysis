package X;

import android.view.ViewGroup;

/* JADX INFO: renamed from: X.01iJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC408101iJ implements Runnable {
    public final /* synthetic */ ViewGroup LL;
    public final /* synthetic */ int LLILLJJLI;

    public RunnableC408101iJ(int i, ViewGroup viewGroup) {
        this.LL = viewGroup;
        this.LLILLJJLI = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ChatRoomMentionPanelAssem@6e1d.updatePanelPosition$1$1");
        try {
            if (this.LL.getHeight() == 0) {
                ViewGroup viewGroup = this.LL;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = -1;
                C786410Ut5.W5(viewGroup, layoutParams);
            }
            C426750GoL.LJIIL(this.LL, null, null, null, Integer.valueOf(this.LLILLJJLI), 23);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatRoomMentionPanelAssem@6e1d.updatePanelPosition$1$1");
    }
}
