package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0X4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842910X4v {
    public static final C842910X4v LIZ = new C842910X4v();
    public static final FutureC842900X4u LIZIZ = new FutureC842900X4u();

    public static boolean LIZ() {
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService == null) {
            return false;
        }
        return iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_wallpaper_main");
    }

    public final void LIZIZ() {
        if (LIZ()) {
            FutureC842900X4u futureC842900X4u = LIZIZ;
            futureC842900X4u.LL = true;
            if (futureC842900X4u.LLILLJJLI) {
                futureC842900X4u.LLILLL.release();
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                FutureC842900X4u futureC842900X4u2 = LIZIZ;
                if (futureC842900X4u2.LL || futureC842900X4u2.LLILLJJLI) {
                    return;
                }
                futureC842900X4u2.LLILLJJLI = true;
                IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                if (iPluginService == null) {
                    futureC842900X4u2.LL = false;
                    futureC842900X4u2.LLILLJJLI = false;
                    futureC842900X4u2.LLILLL.release();
                    return;
                }
                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                anonymousClass1403.LIZ = false;
                anonymousClass1403.LIZIZ();
                anonymousClass1403.LIZJ = false;
                anonymousClass1403.LIZLLL = false;
                anonymousClass1403.LJFF = false;
                AnonymousClass1405 anonymousClass1405 = new AnonymousClass1405(anonymousClass1403);
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_wallpaper_main";
                c844020X9c.LIZIZ = true;
                c844020X9c.LJ = anonymousClass1405;
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.0X4w
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        C842910X4v.LIZ.getClass();
                        FutureC842900X4u futureC842900X4u3 = C842910X4v.LIZIZ;
                        futureC842900X4u3.LL = true;
                        futureC842900X4u3.LLILLJJLI = false;
                        futureC842900X4u3.LLILLL.release();
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z) {
                        boolean z2;
                        C842910X4v.LIZ.getClass();
                        if (i == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        FutureC842900X4u futureC842900X4u3 = C842910X4v.LIZIZ;
                        futureC842900X4u3.LL = z2;
                        futureC842900X4u3.LLILLJJLI = false;
                        futureC842900X4u3.LLILLL.release();
                    }
                };
                iPluginService.LJJI(new C202068144s(c844020X9c));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
