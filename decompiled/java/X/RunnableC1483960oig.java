package X;

/* JADX INFO: renamed from: X.0oig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class RunnableC1483960oig implements Runnable {
    public final /* synthetic */ C1483970oih LL;

    public final void LIZ() {
        C786410Ut5.j4("PreRenderTask do prerender. aid:%s", new Object[]{this.LL.LLILLL.getKey()});
        EnumC1482800ogo.INS.setPreRenderingItem(this.LL.LLILLL);
        C1483970oih c1483970oih = this.LL;
        c1483970oih.LL.LJJJLZIJ(C1479540obY.LIZ(c1483970oih.LLILLL, c1483970oih.LLILLJJLI.getSurface()));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PreRenderTask$PlayCommand@8a2c.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreRenderTask$PlayCommand@8a2c.run");
    }

    public RunnableC1483960oig(C1483970oih c1483970oih) {
        this.LL = c1483970oih;
    }
}
