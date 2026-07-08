package X;

import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05n2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1456605n2 {
    public static final C1456605n2 LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public volatile C09U0 LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1456605n2.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C1456605n2();
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1012));
    }

    public final C09U0 LIZ() {
        C09U0 c09u0 = this.LIZ;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LIZ;
                if (c09u0 == null) {
                    C09U0 c09u02 = (C09U0) C1807670x8n.p();
                    this.LIZ = c09u02;
                    return c09u02;
                }
            }
        }
        return c09u0;
    }
}
