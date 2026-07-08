package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799910VZl {
    public Context LIZ;
    public final Map<C0CO3, List<InterfaceC800130Va7>> LIZIZ = new HashMap();

    public final boolean LIZIZ(C0CO3 c0co3) {
        return !((Collection) ((HashMap) this.LIZIZ).get(c0co3)).isEmpty();
    }

    public final InterfaceC800130Va7 LIZJ(C0CO3 c0co3) {
        synchronized (this.LIZIZ) {
            try {
                if (!((Collection) ((HashMap) this.LIZIZ).get(c0co3)).isEmpty()) {
                    return (InterfaceC800130Va7) ((List) ((HashMap) this.LIZIZ).get(c0co3)).get(0);
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(C0CO3 c0co3, InterfaceC800130Va7 interfaceC800130Va7) {
        synchronized (this.LIZIZ) {
            try {
                ((List) ((HashMap) this.LIZIZ).get(c0co3)).add(interfaceC800130Va7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(InterfaceC800130Va7 interfaceC800130Va7, boolean z) {
        synchronized (interfaceC800130Va7) {
            try {
                if (((List) ((HashMap) this.LIZIZ).get(interfaceC800130Va7.type())).contains(interfaceC800130Va7)) {
                    C799900VZk.LIZ.getClass();
                    boolean z2 = true;
                    for (C800150Va9 c800150Va9 : C799900VZk.LJII.values()) {
                        EnumC800210VaF enumC800210VaFLIZIZ = c800150Va9.LIZLLL.LIZIZ(interfaceC800130Va7);
                        if (enumC800210VaFLIZIZ != null) {
                            int i = C800190VaD.LIZ[enumC800210VaFLIZIZ.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        c800150Va9.LJ(interfaceC800130Va7);
                                    }
                                } else {
                                    c800150Va9.LIZJ(interfaceC800130Va7);
                                }
                                z2 = false;
                            } else {
                                c800150Va9.LIZLLL(interfaceC800130Va7);
                            }
                        }
                    }
                    if (z2) {
                        C799900VZk c799900VZk = C799900VZk.LIZ;
                        c799900VZk.getClass();
                        InterfaceC799860VZg interfaceC799860VZg = C799900VZk.LJI;
                        if (interfaceC799860VZg != null) {
                            interfaceC799860VZg.LIZIZ(interfaceC800130Va7);
                        }
                        Context context = this.LIZ;
                        if (context == null) {
                            context = null;
                        }
                        interfaceC800130Va7.LJI(context, z);
                        c799900VZk.getClass();
                        InterfaceC799860VZg interfaceC799860VZg2 = C799900VZk.LJI;
                        if (interfaceC799860VZg2 != null) {
                            interfaceC799860VZg2.LIZ(interfaceC800130Va7);
                        }
                    }
                    synchronized (this.LIZIZ) {
                        try {
                            ((List) ((HashMap) this.LIZIZ).get(interfaceC800130Va7.type())).remove(interfaceC800130Va7);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
