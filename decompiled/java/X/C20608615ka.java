package X;

import com.bytedance.ies.ugc.appcontext.IAppContextService;

/* JADX INFO: renamed from: X.15ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20608615ka {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile AbstractC21507919Fd LIZ;
    public volatile C2213981Bky LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20608615ka.class, "initializer", "getInitializer()Lcom/ss/android/ugc/aweme/RouterInitializer;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C20608615ka.class, "appContext", "getAppContext()Lcom/bytedance/ies/ugc/appcontext/IAppContextService;", 0);
        c09r3.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final IAppContextService LIZ() {
        C2213981Bky c2213981Bky = this.LIZIZ;
        if (c2213981Bky == null) {
            synchronized (this) {
                c2213981Bky = this.LIZIZ;
                if (c2213981Bky == null) {
                    C2213981Bky c2213981Bky2 = C20606315kD.LIZ;
                    this.LIZIZ = c2213981Bky2;
                    return c2213981Bky2;
                }
            }
        }
        return c2213981Bky;
    }

    public final AbstractC21507919Fd LIZIZ() {
        AbstractC21507919Fd abstractC21507919Fd = this.LIZ;
        if (abstractC21507919Fd == null) {
            synchronized (this) {
                abstractC21507919Fd = this.LIZ;
                if (abstractC21507919Fd == null) {
                    AbstractC21507919Fd abstractC21507919Fd2 = (AbstractC21507919Fd) C19322010iY.LIZ.getValue();
                    this.LIZ = abstractC21507919Fd2;
                    return abstractC21507919Fd2;
                }
            }
        }
        return abstractC21507919Fd;
    }
}
