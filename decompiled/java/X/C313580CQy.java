package X;

import android.content.ContentResolver;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.data.HybridABApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import defpackage.c2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0CQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313580CQy implements C0CSC {
    public final C0C4W LIZ = C312840COc.LIZIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1423705hj());
    public final Keva LIZJ = Keva.getRepo("hybrid_sdk_keva_repo");
    public final INetworkStateService LIZLLL = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
    public int LJ;
    public boolean LJFF;
    public InterfaceC313560CQw LJI;

    @Override // X.C0CSC
    public final void LIZ(EnumC325100Com enumC325100Com) {
        boolean zLJI = MethodIDManager.LJI(196621);
        if (enumC325100Com == EnumC325100Com.STRONG) {
            this.LJ++;
            LIZIZ(true, c2.LIZ().disableRetryWhenNetworkChange);
        }
        if (this.LJ >= c2.LIZ().maxTimesWhenNetworkChange) {
            this.LJFF = false;
            this.LIZLLL.removeNetworkChangeObserver(this);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZIZ(final boolean z, boolean z2) {
        long jElapsedRealtime;
        final String strLLIIIL;
        boolean zLJI = MethodIDManager.LJI(137934);
        ArrayList arrayList = new ArrayList();
        C312840COc.LIZ.getClass();
        if (C312840COc.LIZIZ()) {
            arrayList.add("ttk_app_new_install_launch");
        }
        arrayList.add("ttk_app_dau_launch");
        final String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C0CR3.LIZ.getClass();
        long j = C1150504el.LIZ().LJJIII;
        if (j > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        } else {
            jElapsedRealtime = -1;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
        c2344009Gk.LIZJ(!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0, "is_did_ready");
        c2344009Gk.LIZJ(C0CR3.LIZJ, "is_in_nuj_process");
        c2344009Gk.LIZJ(C312840COc.LIZIZ() ? 1 : 0, "is_cold_start_first_launch");
        c2344009Gk.LJIIIIZZ("feature_name", strLJJLIIIJ);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_from_network_change");
        c2344009Gk.LIZJ(C2214201BlK.LJIIJJI ? 1 : 0, "is_app_background");
        c2344009Gk.LIZJ(C0CR3.LJIIIIZZ.getNetworkStatus().ordinal(), "network_status");
        C0CR3.LIZ("hybrid_ab_api_req_send", c2344009Gk.LIZ);
        InterfaceC313560CQw interfaceC313560CQw = this.LJI;
        if (interfaceC313560CQw != null) {
            interfaceC313560CQw.LIZIZ();
        }
        C0CR3.LJIIIZ = false;
        C313570CQx.LIZ.getClass();
        C313570CQx.LIZIZ = false;
        C844470XAv.LIZ.getClass();
        ContentResolver contentResolver = C844470XAv.LIZ().getContentResolver();
        if (TextUtils.equals("android_id", "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                strLLIIIL = "";
            } else {
                if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                    C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6pd56A9CvdzP899QYgd8BeFPrt", null));
                }
                strLLIIIL = C20123713oZ.LIZ;
            }
        } else {
            strLLIIIL = C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6pd56A9CvdzP899QYgd8BeFPrt", null));
        }
        final int i = this.LIZJ.getInt("key_request_times", 0);
        this.LIZJ.storeInt("key_request_times", i + 1);
        ((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIIJ();
        C11NZ c11nzLJJJLZIJ = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0CO4
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<HybridABApi.HybridABBody> c09aj) {
                List listLIZIZ;
                C1C7U.LIZ("HybridABService@7908.realRequestServerAllocation$1");
                try {
                    listLIZIZ = C0C4S.LIZIZ();
                    if (listLIZIZ == null) {
                        listLIZIZ = C13BV.INSTANCE;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C0CR3 c0cr3 = C0CR3.LIZ;
                    String str = strLJJLIIIJ;
                    String string = th.toString();
                    c0cr3.getClass();
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    C312840COc.LIZ.getClass();
                    c2344009Gk2.LIZJ(C312840COc.LIZIZ() ? 1 : 0, "is_cold_start_first_launch");
                    c2344009Gk2.LJIIIIZZ("feature_name", str);
                    c2344009Gk2.LJIIIIZZ("error_message", string);
                    C0CR3.LIZ("hybrid_ab_collect_vid_error", c2344009Gk2.LIZ);
                    listLIZIZ = C13BV.INSTANCE;
                }
                C313580CQy c313580CQy = this;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listLIZIZ) {
                    String str2 = (String) obj;
                    c313580CQy.getClass();
                    if (str2 != null && C2095008Iq.LJIIJJI(str2) != null) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() < listLIZIZ.size()) {
                    List listLJLI = C13LP.LJLI(listLIZIZ, C13LP.LLIIJI(arrayList2));
                    C0CR3 c0cr32 = C0CR3.LIZ;
                    String str3 = strLJJLIIIJ;
                    String strLJJLIIIJ2 = C13LP.LJJLIIIJ(listLJLI, ",", null, null, 0, null, null, 62);
                    c0cr32.getClass();
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    C312840COc.LIZ.getClass();
                    c2344009Gk3.LIZJ(C312840COc.LIZIZ() ? 1 : 0, "is_cold_start_first_launch");
                    c2344009Gk3.LJIIIIZZ("feature_name", str3);
                    c2344009Gk3.LJIIIIZZ("error_vids", strLJJLIIIJ2);
                    C0CR3.LIZ("hybrid_ab_vid_error", c2344009Gk3.LIZ);
                }
                c09aj.onNext(new HybridABApi.HybridABBody(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62)));
                c09aj.onComplete();
                C1C7U.LIZIZ("HybridABService@7908.realRequestServerAllocation$1");
            }
        }).LJJJ(new InterfaceC1487280oo2() { // from class: X.0CO5
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                boolean z3;
                HybridABApi.HybridABBody hybridABBody = (HybridABApi.HybridABBody) obj;
                HybridABApi hybridABApi = (HybridABApi) this.LL.LIZIZ.getValue();
                String str = strLJJLIIIJ;
                if (i == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C312840COc.LIZ.getClass();
                return hybridABApi.getHybridExperimentsByPost(str, z3, C312840COc.LIZIZ(), strLLIIIL, hybridABBody);
            }
        }, false).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ());
        if (!z2 && (c2.LIZ().enableRetry || C312840COc.LIZIZ())) {
            c11nzLJJJLZIJ = c11nzLJJJLZIJ.LJJLIIIJLJLI(new C0DJC(c2.LIZ().maxRetryTimes, c2.LIZ().retryIntervalMs));
        }
        c11nzLJJJLZIJ.LJJLL(new C09JN() { // from class: X.0CQv
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str;
                C1C7U.LIZ("HybridABService@7908.requestServerAllocation$2");
                HybridABApi.HybridExperimentResponse hybridExperimentResponse = (HybridABApi.HybridExperimentResponse) obj;
                C0CR3 c0cr3 = C0CR3.LIZ;
                HybridABApi.HybridABExtra hybridABExtra = hybridExperimentResponse.extra;
                if (hybridABExtra != null) {
                    str = hybridABExtra.logId;
                } else {
                    str = null;
                }
                c0cr3.getClass();
                C0CR3.LJII = str;
                this.LL.LIZ.LIZ(hybridExperimentResponse.configMap, hybridExperimentResponse.closedExperiment);
                C0CR3.LIZLLL(jElapsedRealtime2, hybridExperimentResponse.statusCode, strLJJLIIIJ, "", z);
                C0CR3.LJIIIZ = true;
                C313570CQx.LIZ.getClass();
                C313570CQx.LIZIZ = true;
                InterfaceC313560CQw interfaceC313560CQw2 = this.LL.LJI;
                if (interfaceC313560CQw2 != null) {
                    interfaceC313560CQw2.LIZ();
                }
                C313580CQy c313580CQy = this.LL;
                c313580CQy.getClass();
                c313580CQy.LJFF = false;
                c313580CQy.LIZLLL.removeNetworkChangeObserver(c313580CQy);
                C1C7U.LIZIZ("HybridABService@7908.requestServerAllocation$2");
            }
        }, new C09JN() { // from class: X.0CR0
            /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00fd A[PHI: r0 r3 r5
              0x00fd: PHI (r0v20 java.lang.String) = (r0v18 java.lang.String), (r0v22 java.lang.String) binds: [B:56:0x00e2, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]
              0x00fd: PHI (r3v5 com.ss.android.ugc.aweme.base.api.BaseResponse) = (r3v3 com.ss.android.ugc.aweme.base.api.BaseResponse), (r3v6 com.ss.android.ugc.aweme.base.api.BaseResponse) binds: [B:56:0x00e2, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]
              0x00fd: PHI (r5v8 int) = (r5v6 int), (r5v9 int) binds: [B:56:0x00e2, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 300
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0CR0.accept(java.lang.Object):void");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
