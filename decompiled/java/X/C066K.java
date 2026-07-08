package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.066K, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C066K {
    public static final C066K LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C066K.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C066K c066k = new C066K();
        LIZIZ = c066k;
        C1598406Nq c1598406Nq = c066k.LIZ;
        if (c1598406Nq == null) {
            synchronized (c066k) {
                c1598406Nq = c066k.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c066k.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    public static String LIZ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }
}
