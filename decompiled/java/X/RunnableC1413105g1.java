package X;

import android.view.View;

/* JADX INFO: renamed from: X.05g1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1413105g1 implements Runnable {
    public final /* synthetic */ View LL;

    public RunnableC1413105g1(View view) {
        this.LL = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("IMStickerApi$Companion@3a49.inst$2");
        try {
            if (this.LL.getParent() != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
                c1389890mGx.LJIIIZ(2131831924);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMStickerApi$Companion@3a49.inst$2");
    }
}
