package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;

/* JADX INFO: renamed from: X.0jEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273140jEe extends C1269970j9X {
    public final Handler LLILLL;
    public final AbstractC1273900jFs LLILZ;
    public C1273160jEg LLILZIL;
    public C1273120jEc LLILZLL;

    @Override // X.C1271610jCB
    public final void release() {
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 251));
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixNode_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1273140jEe(Handler handler, AbstractC1273900jFs abstractC1273900jFs) {
        this.LLILLL = handler;
        this.LLILZ = abstractC1273900jFs;
    }
}
