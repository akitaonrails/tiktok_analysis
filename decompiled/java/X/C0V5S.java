package X;

import Y.AObserverS217S0100000_13;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS84S0000000_4;
import android.app.Activity;
import android.app.Application;
import com.bytedance.apm.internal.ApmDelegate;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.OrbuInitTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V5S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V5S implements Runnable {
    public static final C0V5S LL = new C0V5S();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ApmInit@d8a5.runnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmInit@d8a5.runnable$1");
    }

    public static void LIZ() {
        C1150504el.LIZ().LIZLLL("method_init_apm_duration", false);
        ApmInit.LL.getClass();
        C793770VBv.LIZLLL = true;
        C01GW c01gw = C0AF7.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 3) {
            C0V36.LIZ = true;
        } else if (((Number) c01gw.getValue()).intValue() == 1) {
            C0V36.LIZLLL = 1;
        } else if (((Number) c01gw.getValue()).intValue() == 2) {
            C0V36.LIZLLL = 2;
        }
        if (((Boolean) C291980BcS.LIZ.getValue()).booleanValue()) {
            C0V36.LIZIZ = true;
        }
        Application applicationLIZ = C1BWL.LIZ();
        C791890V4p c791890V4p = new C791890V4p();
        c791890V4p.LIZIZ = true;
        c791890V4p.LIZ = 50000L;
        C791980V4y c791980V4y = new C791980V4y();
        C2407009bw.LIZ();
        c791980V4y.LJ = true;
        c791980V4y.LJIILL = ((Number) C308220C6i.LIZ.getValue()).floatValue();
        c791980V4y.LJII = ((Boolean) C07GQ.LIZ.getValue()).booleanValue();
        c791980V4y.LJIIIIZZ = ((Boolean) C260300AIa.LIZ.getValue()).booleanValue();
        c791980V4y.LJIIL = InterfaceC281510B1p.LIZ;
        c791980V4y.LJIIJJI = InterfaceC281510B1p.LIZIZ;
        if (C281810B2t.LIZ) {
            c791980V4y.LJI = false;
        }
        if (((Boolean) C0AEG.LIZ.getValue()).booleanValue()) {
            C0V54 c0v54 = new C0V54();
            c0v54.LIZ = false;
            c0v54.LIZJ = false;
            c0v54.LIZLLL = true;
            c0v54.LIZIZ = ((Number) C259230ADx.LIZ.getValue()).longValue();
            c0v54.LJ = new C0V5L() { // from class: X.0V5R
                @Override // X.C0V5L
                public final void LIZ(Activity activity) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onActivityLeaked:");
                    sbLIZ.append(activity.getLocalClassName());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            };
            c791980V4y.LJFF = new C0V53(c0v54);
        }
        if (((Boolean) C0AIW.LIZ.getValue()).booleanValue()) {
            C791380V2q c791380V2q = C791380V2q.LIZ;
            C2407009bw.LIZ();
            if (!C791380V2q.LJFF) {
                C791380V2q.LJFF = true;
                C791390V2r.LJJIII.LJJI = c791380V2q;
                C791380V2q.LIZIZ.add(new InterfaceC791370V2p() { // from class: X.0V5T
                    @Override // X.InterfaceC791370V2p
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC791370V2p
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC791370V2p
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC791370V2p
                    public final void LIZLLL(long j) {
                    }
                });
            }
        }
        C01GW c01gw2 = C0AIY.LIZ;
        if (((Number) c01gw2.getValue()).intValue() > 0) {
            c791980V4y.LJIILIIL = ((Number) c01gw2.getValue()).intValue();
        }
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "apm_frame_listener_anr_opt", true, false)) {
            c791980V4y.LJIIIZ = true;
        }
        c791980V4y.LJIIJ = ((Boolean) C0AIU.LIZ.getValue()).booleanValue();
        ApmDelegate apmDelegate = C788700Uwm.LIZ;
        apmDelegate.LLILLJJLI = c791890V4p;
        apmDelegate.LIZJ(applicationLIZ, new C791950V4v(c791980V4y));
        if (C792400V6o.LIZJ) {
            C0VD9.LIZ().LIZIZ(new ARunnableS84S0000000_4(16));
        }
        if (((Boolean) C310450CEx.LIZJ.getValue()).booleanValue() && C2104108Md.LIZLLL(applicationLIZ)) {
            C823050WQl.LIZLLL().execute(new ARunnableS113S0100000_13(applicationLIZ, 215));
        }
        if (!((Boolean) C0BLM.LIZ.getValue()).booleanValue()) {
            C1BCZ.LIZ(applicationLIZ, new InterfaceC2201061BCm() { // from class: X.0pef
                @Override // X.InterfaceC2201061BCm
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC2201061BCm
                public final void LIZIZ() {
                    if (((Boolean) C0BOI.LIZ.getValue()).booleanValue()) {
                        C1BCA.LJJIFFI(C1519930peh.LIZ);
                    }
                    C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0pee
                        @Override // X.InterfaceC1006670cIr
                        public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                            boolean z;
                            C1602200rnO c1602200rnO3 = c1602200rnO2;
                            boolean z2 = true;
                            if (c1602200rnO3.LIZJ()) {
                                C0XKT.LIZIZ = 3;
                                if (C0XKT.LIZIZ() == 3) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C0XKT.LIZ(3, z);
                                if (z) {
                                    OrbuInitTask orbuInitTask = new OrbuInitTask();
                                    C844470XAv.LIZ.getClass();
                                    orbuInitTask.run(C844470XAv.LIZ());
                                }
                                if (!C0CKZ.LJFF) {
                                    C08AP.LJIIJJI = 0;
                                }
                                C0CKZ.LJFF = true;
                                C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                                return;
                            }
                            if (!c1602200rnO3.LIZIZ()) {
                                return;
                            }
                            C0XKT.LIZIZ = 2;
                            if (C0XKT.LIZIZ() != 2) {
                                z2 = false;
                            }
                            C0XKT.LIZ(2, z2);
                            if (!z2) {
                                return;
                            }
                            OrbuInitTask orbuInitTask2 = new OrbuInitTask();
                            C844470XAv.LIZ.getClass();
                            orbuInitTask2.run(C844470XAv.LIZ());
                        }
                    });
                }
            });
        }
        if (!((Boolean) C0BLK.LIZ.getValue()).booleanValue()) {
            C0VUW.LIZ(applicationLIZ);
        }
        C0VGG.LIZ.getClass();
        if (C2162308dZ.LJI(applicationLIZ)) {
            C2407009bw.LIZ();
            if (Intrinsics.LJFF(C1514430pVp.LIZLLL(), Boolean.TRUE)) {
                AObserverS217S0100000_13 aObserverS217S0100000_13 = new AObserverS217S0100000_13(applicationLIZ, 11);
                IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                C0VGG.LIZIZ = iPluginService != null ? iPluginService.observeInitialLaunchRequestResultForever(aObserverS217S0100000_13) : null;
            } else {
                C0VGG.LIZ(new C0VGD(false, AwemeConfigCenter.LIZIZ(), null, C1697810uHb.LJ("ttlive_", "ec_search_", "rd_ec_request_", "rd_tiktokec_", "click_see_", "multi_anchor_entrance_expand", "video_play_cla_related", "trending_words_click", "search_history", "enter_search_blankpage", "app_router_monitor"), 44), applicationLIZ);
            }
        }
        C1150504el.LIZ().LJI("method_init_apm_duration", false);
    }
}
