package X;

import android.app.Activity;
import android.view.View;

/* JADX INFO: renamed from: X.06Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1576506Ff {
    public static final C1576506Ff LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static long LIZLLL;
    public static final C054G LJ;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1576506Ff.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1576506Ff c1576506Ff = new C1576506Ff();
        LIZIZ = c1576506Ff;
        C1598406Nq c1598406Nq = c1576506Ff.LIZ;
        if (c1598406Nq == null) {
            synchronized (c1576506Ff) {
                c1598406Nq = c1576506Ff.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1576506Ff.LIZ = c1598406Nq;
                }
            }
        }
        LJ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    public static void LIZ(Activity activity, C06G9 c06g9, String str, C06ET c06et, C1576706Fh c1576706Fh) {
        C1576606Fg.LIZJ("start to open panel", c06g9, str, c1576706Fh);
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = activity.getWindow().getDecorView();
        }
        C339360DSc.LIZ(currentFocus);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - LIZLLL;
        if (1 <= j && j < 751) {
            C1576606Fg.LIZJ("block by click too fast", c06g9, str, c1576706Fh);
        } else {
            LIZLLL = jCurrentTimeMillis;
            C23250099c.LIZLLL(LJ, null, null, new C1576406Fe(c06g9, str, c06et, c1576706Fh, activity, null), 3);
        }
    }
}
