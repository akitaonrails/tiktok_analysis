package X;

/* JADX INFO: renamed from: X.0oie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class RunnableC1483940oie implements Runnable {
    public final /* synthetic */ C1483920oic LL;

    public final void LIZ() {
        C1483920oic c1483920oic = this.LL;
        c1483920oic.LIZ.setSurface(c1483920oic.LIZIZ.getSurface());
        this.LL.LIZ.resume();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResumeCommand: setSurface:");
        sbLIZ.append(this.LL.LIZIZ.getSurface());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PlayWithSurfaceTask$ResumeCommand@7155.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayWithSurfaceTask$ResumeCommand@7155.run");
    }

    public RunnableC1483940oie(C1483920oic c1483920oic) {
        this.LL = c1483920oic;
    }
}
