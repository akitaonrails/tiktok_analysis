package X;

/* JADX INFO: renamed from: X.1A6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174141A6y {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final C1807840x94 LIZ;
    public volatile C1466080oFq LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2174141A6y.class, "gestureManager", "getGestureManager()Lcom/ss/android/ugc/aweme/im/creative/edit/api/gesture/IMEditGestureManager;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC1643840ssY LIZ() {
        C1466080oFq c1466080oFq = this.LIZIZ;
        if (c1466080oFq == null) {
            synchronized (this) {
                c1466080oFq = this.LIZIZ;
                if (c1466080oFq == null) {
                    C1466080oFq c1466080oFq2 = new C1466080oFq(this.LIZ.LIZIZ());
                    this.LIZIZ = c1466080oFq2;
                    return c1466080oFq2;
                }
            }
        }
        return c1466080oFq;
    }

    public C2174141A6y(C1807840x94 c1807840x94) {
        this.LIZ = c1807840x94;
    }
}
