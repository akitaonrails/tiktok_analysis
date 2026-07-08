package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ZT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZT {
    public static void LIZ(C15ZZ c15zz) {
        if (C15ZR.LIZLLL != null) {
            InterfaceC20541015Zg interfaceC20541015Zg = c15zz.LIZJ;
            if (interfaceC20541015Zg != null) {
                interfaceC20541015Zg.LIZ("pnsscreensdk_initializeInstance_twice", new JSONObject(), null);
                return;
            }
            return;
        }
        C15ZR.LIZLLL = new C15ZR(c15zz);
        C15ZR c15zr = C15ZR.LIZLLL;
        if (c15zr != null) {
            long j = c15zz.LIZLLL;
            c15zr.LIZJ = j;
            if (c15zr.LIZIZ == null) {
                C15ZQ c15zq = new C15ZQ(j);
                c15zr.LIZIZ = c15zq;
                c15zq.LJFF = new PthreadTimer("s/timer/Timer");
                c15zq.LIZ = j;
                c15zq.LJ = new C785860UsC(c15zq, 1);
            }
        }
    }
}
