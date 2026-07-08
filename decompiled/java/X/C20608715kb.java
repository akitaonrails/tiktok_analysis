package X;

import com.bytedance.ies.ugc.appcontext.IAppContextService;

/* JADX INFO: renamed from: X.15kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20608715kb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile AbstractC20651615rW LIZ;
    public volatile C2213981Bky LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20608715kb.class, "initializer", "getInitializer()Lcom/ss/android/ugc/aweme/PopupManagerInitializer;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C20608715kb.class, "appContext", "getAppContext()Lcom/bytedance/ies/ugc/appcontext/IAppContextService;", 0);
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

    public final AbstractC20651615rW LIZIZ() {
        AbstractC20651615rW abstractC20651615rW = this.LIZ;
        if (abstractC20651615rW == null) {
            synchronized (this) {
                abstractC20651615rW = this.LIZ;
                if (abstractC20651615rW == null) {
                    AbstractC20651615rW abstractC20651615rW2 = (AbstractC20651615rW) C20608815kc.LIZ.getValue();
                    this.LIZ = abstractC20651615rW2;
                    return abstractC20651615rW2;
                }
            }
        }
        return abstractC20651615rW;
    }
}
