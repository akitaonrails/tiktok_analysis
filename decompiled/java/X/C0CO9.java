package X;

import Y.ARunnableS84S0000000_4;
import Y.AfS140S0200000_4;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0CO9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0CO9 implements InterfaceC2194071Atx {
    public static volatile C0COC LLILLJJLI;
    public C310720CFy LL;

    public abstract void LIZJ(IESSettingsProxy iESSettingsProxy);

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0COC] */
    public static C0CO9 LIZIZ() {
        if (LLILLJJLI == null) {
            synchronized (C0CO9.class) {
                try {
                    if (LLILLJJLI == null) {
                        LLILLJJLI = new C0CO9() { // from class: X.0COC
                            @Override // X.C0CO9
                            public final void LIZJ(IESSettingsProxy iESSettingsProxy) {
                                Fragment fragmentLIZLLL;
                                Activity activityLJFF = C2214201BlK.LJFF();
                                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                                if (abstractC1387200mCcLIZIZ != null) {
                                    fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL();
                                } else {
                                    fragmentLIZLLL = null;
                                }
                                ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LIZJ(activityLJFF, fragmentLIZLLL);
                                if (C0CCS.LIZJ) {
                                    C786410Ut5.LJLIIL(16L, C2113808Pw.LIZIZ.LL, new ARunnableS84S0000000_4(11));
                                } else if (((Boolean) C309600CBq.LIZ.getValue()).booleanValue()) {
                                    C786410Ut5.LJLIIL(16L, C2113808Pw.LIZIZ.LL, new ARunnableS84S0000000_4(11));
                                } else {
                                    C19308310gL.LJII.LJFF();
                                }
                            }
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLJJLI;
    }

    public C0CO9() {
        new Gson();
    }

    @Override // X.InterfaceC2194071Atx
    public final void LIZ(final IESSettingsProxy iESSettingsProxy) {
        boolean z = true;
        if (((Boolean) C309600CBq.LIZ.getValue()).booleanValue()) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                z = false;
            }
            C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0CO8
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ c09aj) {
                    C0CO9 c0co9 = this.LIZ;
                    IESSettingsProxy iESSettingsProxy2 = iESSettingsProxy;
                    c0co9.getClass();
                    C1C7U.LIZ("AbstractCommonSettingsWatcher@42b8.change$1L");
                    c0co9.LIZLLL(iESSettingsProxy2);
                    c09aj.onNext(iESSettingsProxy2);
                    c09aj.onComplete();
                    C1C7U.LIZIZ("AbstractCommonSettingsWatcher@42b8.change$1L");
                }
            });
            ExecutorService executorServiceLJFF = C823050WQl.LJFF();
            C11RO c11ro = C11S5.LIZ;
            C11NZ c11nzLJL = c19482711KfLJIJJLI.LJL(new C19501611Rm(executorServiceLJFF));
            if (z) {
                c11nzLJL = c11nzLJL.LJJJLZIJ(C1701940uOG.LIZIZ());
            }
            c11nzLJL.LJJLL(new AfS140S0200000_4(this, iESSettingsProxy, 2), new C09JN() { // from class: X.0COA
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AbstractCommonSettingsWatcher@42b8.change$3L");
                    C1C7U.LIZIZ("AbstractCommonSettingsWatcher@42b8.change$3L");
                }
            });
            return;
        }
        LIZLLL(iESSettingsProxy);
        C0COB c0cobLIZ = C0COB.LIZ();
        c0cobLIZ.getClass();
        synchronized (C0COB.class) {
            try {
                c0cobLIZ.LIZ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZJ(iESSettingsProxy);
    }

    public final void LIZLLL(final IESSettingsProxy iESSettingsProxy) {
        final SharedPreferences.Editor editorEdit = SharePrefCache.inst().getSharePref().edit();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "im_optimize_imconvert", false, false)) {
            AbstractC19486711Lt.LJIIL(new Callable() { // from class: X.0CNm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C0CO9 c0co9 = this.LL;
                    SharedPreferences.Editor editor = editorEdit;
                    IESSettingsProxy iESSettingsProxy2 = iESSettingsProxy;
                    c0co9.getClass();
                    C1C7U.LIZ("AbstractCommonSettingsWatcher@42b8.transferValue$1L");
                    c0co9.LL = ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJ(editor, iESSettingsProxy2);
                    C1C7U.LIZIZ("AbstractCommonSettingsWatcher@42b8.transferValue$1L");
                    return null;
                }
            }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
        } else {
            this.LL = ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJ(editorEdit, iESSettingsProxy);
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().updateServerSettings(iESSettingsProxy);
    }
}
