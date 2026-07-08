package X;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import java.util.concurrent.ConcurrentHashMap;
import jv6.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13zZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20191913zZ {
    public static final C20191913zZ LIZ = new C20191913zZ();
    public static final ConcurrentHashMap<String, FutureC20192013za> LIZIZ = new ConcurrentHashMap<>();
    public static final Keva LIZJ = Keva.getRepo("df_im_repo");
    public static final C20192213zc LIZLLL = C20192213zc.LIZ;
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public static FutureC20192013za LIZIZ() {
        FutureC20192013za futureC20192013zaPutIfAbsent;
        ConcurrentHashMap<String, FutureC20192013za> concurrentHashMap = LIZIZ;
        FutureC20192013za futureC20192013za = concurrentHashMap.get("com.ss.android.ugc.aweme.df_im_bootfinish");
        if (futureC20192013za == null && (futureC20192013zaPutIfAbsent = concurrentHashMap.putIfAbsent("com.ss.android.ugc.aweme.df_im_bootfinish", (futureC20192013za = new FutureC20192013za("com.ss.android.ugc.aweme.df_im_bootfinish")))) != null) {
            futureC20192013za = futureC20192013zaPutIfAbsent;
        }
        FutureC20192013za futureC20192013za2 = futureC20192013za;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null ? iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_im_bootfinish") : false) {
            futureC20192013za2.LLILLL.set(4);
            return futureC20192013za2;
        }
        synchronized (futureC20192013za2) {
            try {
                if (futureC20192013za2.LLILLL.get() == 4 || futureC20192013za2.LLILLL.get() == 2) {
                    return futureC20192013za2;
                }
                futureC20192013za2.LLILLJJLI.acquire();
                futureC20192013za2.LLILLL.set(2);
                LIZLLL.getClass();
                C20192213zc.LIZ("com.ss.android.ugc.aweme.df_im_bootfinish").LIZIZ = SystemClock.elapsedRealtime();
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_im_bootfinish";
                c844020X9c.LIZIZ = true;
                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                anonymousClass1403.LIZ = false;
                anonymousClass1403.LIZIZ();
                anonymousClass1403.LIZJ = false;
                anonymousClass1403.LIZLLL = false;
                anonymousClass1403.LJFF = false;
                c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13zb
                    public final /* synthetic */ String LIZ = "com.ss.android.ugc.aweme.df_im_bootfinish";

                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        C20191913zZ c20191913zZ = C20191913zZ.LIZ;
                        String str2 = this.LIZ;
                        c20191913zZ.getClass();
                        if (Intrinsics.LJFF(str2, "com.ss.android.ugc.aweme.df_im_bootfinish")) {
                            GScope gScope = GScope.LL;
                            C1554610qYd.LIZIZ(gScope, FakeMsgProtocol.class, true);
                            C1554610qYd.LIZIZ(gScope, IContactSelectorHeaderFactory.class, true);
                            C1554610qYd.LIZIZ(gScope, IContactSelectorTemplateFactory.class, true);
                        }
                        C20191913zZ.LIZ(0, this.LIZ);
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z) {
                        C20191913zZ c20191913zZ = C20191913zZ.LIZ;
                        String str2 = this.LIZ;
                        c20191913zZ.getClass();
                        C20191913zZ.LIZ(i, str2);
                    }
                };
                C202068144s c202068144s = new C202068144s(c844020X9c);
                IPluginService iPluginService2 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                if (iPluginService2 != null) {
                    iPluginService2.LJJI(c202068144s);
                }
                return futureC20192013za2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(int i, String str) {
        FutureC20192013za futureC20192013zaPutIfAbsent;
        if (i == 0) {
            C844470XAv.LIZ.getClass();
            a.install(C844470XAv.LIZ());
            C786410Ut5.LJJZZIII(LJ, new Runnable() { // from class: X.08Q8
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    Activity activityLIZIZ;
                    Activity activityLIZ;
                    C1C7U.LIZ("IMAabPlugin@7e68.onInstallFinish$1");
                    try {
                        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                            a.LIZLLL(activityLIZ);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("IMAabPlugin@7e68.onInstallFinish$1");
                }
            });
        }
        ConcurrentHashMap<String, FutureC20192013za> concurrentHashMap = LIZIZ;
        FutureC20192013za futureC20192013za = concurrentHashMap.get(str);
        if (futureC20192013za == null && (futureC20192013zaPutIfAbsent = concurrentHashMap.putIfAbsent(str, (futureC20192013za = new FutureC20192013za(str)))) != null) {
            futureC20192013za = futureC20192013zaPutIfAbsent;
        }
        FutureC20192013za futureC20192013za2 = futureC20192013za;
        LIZLLL.getClass();
        C20192213zc.LIZ(str).LIZ = SystemClock.elapsedRealtime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try_times_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva keva = LIZJ;
        int i2 = keva.getInt(strLIZIZ, 0) + 1;
        if (i == 0) {
            futureC20192013za2.LLILLL.set(4);
        } else {
            futureC20192013za2.LLILLL.set(3);
        }
        futureC20192013za2.LLILLJJLI.release();
        keva.storeInt(strLIZIZ, i2);
        C20192313zd c20192313zdLIZ = C20192213zc.LIZ(str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("package_name", str);
        c2344009Gk.LIZJ(i, "prepare_result");
        c2344009Gk.LIZLLL(c20192313zdLIZ.LIZ - c20192313zdLIZ.LIZIZ, "prepare_till_end");
        c2344009Gk.LIZJ(i2, "try_times");
        if (i == 0) {
            if (c20192313zdLIZ.LIZ >= c20192313zdLIZ.LIZJ && c20192313zdLIZ.LIZJ > 0) {
                c2344009Gk.LJFF("first_access_till_success", String.valueOf(c20192313zdLIZ.LIZ - c20192313zdLIZ.LIZJ));
                c2344009Gk.LIZJ(c20192313zdLIZ.LIZLLL, "access_type");
            } else {
                c2344009Gk.LJFF("first_access_till_success", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LIZJ(1, "access_type");
            }
        }
        C20684815ws.LJIILLIIL("prf_im_aab_plugin", c2344009Gk.LIZ);
    }
}
