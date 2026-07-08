package X;

import com.bytedance.ies.ugc.appcontext.IAppContextService;

/* JADX INFO: renamed from: X.15kC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20606215kC {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile AbstractC308980C9g LIZ;
    public volatile C2213981Bky LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20606215kC.class, "initializer", "getInitializer()Lcom/ss/android/ugc/aweme/PowerListInitializer;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C20606215kC.class, "appContext", "getAppContext()Lcom/bytedance/ies/ugc/appcontext/IAppContextService;", 0);
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

    public final AbstractC308980C9g LIZIZ() {
        AbstractC308980C9g abstractC308980C9g = this.LIZ;
        if (abstractC308980C9g == null) {
            synchronized (this) {
                abstractC308980C9g = this.LIZ;
                if (abstractC308980C9g == null) {
                    AbstractC308980C9g abstractC308980C9g2 = (AbstractC308980C9g) C308960C9e.LIZ.getValue();
                    this.LIZ = abstractC308980C9g2;
                    return abstractC308980C9g2;
                }
            }
        }
        return abstractC308980C9g;
    }
}
