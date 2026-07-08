package X;

import android.os.Handler;

/* JADX INFO: renamed from: X.0yCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848650yCt {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1848640yCs());
    public static final RunnableC1848610yCp LIZIZ = RunnableC1848610yCp.LL;

    public static final void LIZ() {
        C01GW c01gw = LIZ;
        Handler handler = (Handler) c01gw.getValue();
        RunnableC1848610yCp runnableC1848610yCp = LIZIZ;
        handler.removeCallbacks(runnableC1848610yCp);
        C786410Ut5.LJLIIL(1000L, (Handler) c01gw.getValue(), runnableC1848610yCp);
    }
}
