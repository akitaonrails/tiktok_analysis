package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.ies.android.base.runtime.depend.IALogDepend;
import com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import com.bytedance.ies.android.base.runtime.depend.IUserDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Blj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214451Blj extends C09AY implements Function0<C2214461Blk> {
    public C2214451Blj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C2214461Blk invoke() {
        C2214461Blk c2214461Blk = new C2214461Blk();
        c2214461Blk.LIZIZ = new IAppLogDepend() { // from class: X.0do9
            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final String getCategory(boolean z) {
                return z ? "event_v3" : "event_v1";
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final ExecutorService getLogThreadPool() {
                return C20684815ws.LJFF();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final void appendCommonParams(StringBuilder sb, boolean z) {
                AppLog.appendCommonParams(sb, z);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final void onEventV3Bundle(String str, Bundle bundle) {
                C20684815ws.LJIILL(str, bundle);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final void onEventV3Json(String str, JSONObject jSONObject) {
                C20684815ws.LJIJ(str, jSONObject);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final void onEventV3Map(String str, Map<String, String> map) {
                C20684815ws.LJIILLIIL(str, map);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final void putCommonParams(Map<String, String> map, boolean z) {
                C0XDN.LIZJ(map, z);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
            public final void onEventV1(Context context, String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
                if (TextUtils.isEmpty(str2)) {
                    C20684815ws.LJIIJ(j, str, str3, str4, jSONObject);
                } else {
                    C20684815ws.LJIILJJIL(str2, str, str3, str4, jSONObject, j);
                }
            }
        };
        c2214461Blk.LJI = new IAdThirdTrackerDepend() { // from class: X.0c4x
            @Override // com.bytedance.ies.android.base.runtime.depend.IAdThirdTrackerDepend
            public final void track(String str, List<String> list, Long l, String str2, JSONObject jSONObject) {
                C2201701BEy.LIZ.getClass();
                C2201701BEy.LIZIZ(str, list, l, str2, jSONObject);
            }
        };
        c2214461Blk.LIZLLL = new IThreadPoolExecutorDepend() { // from class: X.1Blm
            @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
            public final ExecutorService getCPUThreadExecutor() {
                return C823050WQl.LIZJ();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
            public final ExecutorService getIOThreadExecutor() {
                return C823050WQl.LIZLLL();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
            public final ExecutorService getNormalThreadExecutor() {
                return C823050WQl.LIZJ();
            }
        };
        c2214461Blk.LIZJ = new IMonitorDepend() { // from class: X.0XJ7
            @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
            public final void monitorCommonLog(String str, JSONObject jSONObject) {
                C794240VDq.LIZJ(str, jSONObject);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
            public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
                C1AF0.LJI(th, str, map);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
            public final void monitorStatusRate(String str, int i, JSONObject jSONObject) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI(str, i, jSONObject);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
            public final void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIIZ(str, i, jSONObject, jSONObject2);
            }
        };
        c2214461Blk.LIZ = new IHostContextDepend() { // from class: X.10cr
            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final boolean isTeenMode() {
                return false;
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final int getAppId() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJIIJ;
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getAppName() {
                C844470XAv.LIZ.getClass();
                String str = C844470XAv.LJ;
                if (str == null) {
                    return null;
                }
                return str;
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getChannel() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LJIILL;
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getCurrentTelcomCarrier() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("An operation is not implemented: ");
                sbLIZ.append("Not yet implemented");
                throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getPPEChannel() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("An operation is not implemented: ");
                sbLIZ.append("Not yet implemented");
                throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getPackageName() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ().getPackageName();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getSkinName() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("An operation is not implemented: ");
                sbLIZ.append("Not yet implemented");
                throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getSkinType() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("An operation is not implemented: ");
                sbLIZ.append("Not yet implemented");
                throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getUpdateVersion() {
                C844470XAv.LIZ.getClass();
                return String.valueOf(C844470XAv.LIZLLL());
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getUserAgent() {
                return C1489110oqz.LIZ("other");
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final long getVersionCode() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZIZ();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getVersionName() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZJ();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final boolean isMiniAppEnable() {
                IMiniAppService iMiniAppServiceLIZIZ = C988700bps.LIZ.LIZIZ();
                C844470XAv.LIZ.getClass();
                return iMiniAppServiceLIZIZ.checkMiniAppEnable(C844470XAv.LIZ());
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final boolean isPPEEnable() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("An operation is not implemented: ");
                sbLIZ.append("Not yet implemented");
                throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final Application getApplication() {
                return C1BWL.LIZ();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final Context getApplicationContext() {
                return C786410Ut5.M3(getApplication());
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getBoeChannel() {
                LocalTestApi localTestApiLIZ = C19273110af.LIZ();
                return String.valueOf(localTestApiLIZ != null ? localTestApiLIZ.getBoeLane() : null);
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getDeviceId() {
                return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getLanguage() {
                return C838600Wv4.LIZ().toString();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final String getRegion() {
                return C2222691Bz1.LIZIZ();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final boolean isBoeEnable() {
                LocalTestApi localTestApiLIZ = C19273110af.LIZ();
                return localTestApiLIZ != null && localTestApiLIZ.enableBoe();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
            public final boolean isDebuggable() {
                return false;
            }
        };
        c2214461Blk.LJII = new IHostRouterDepend() { // from class: X.15L3
            @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
            public final boolean isHostScheme(String str) {
                return Intrinsics.LJFF(str, "aweme");
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostRouterDepend
            public final boolean openHostScheme(String str) {
                return C19724912Fj.LIZLLL().LJII(str);
            }
        };
        c2214461Blk.LJFF = new IHostStyleUIDepend() { // from class: X.1A6A
            @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
            public final View getContainerLoadingView(Context context) {
                return null;
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
            public final Boolean showToast(Context context, String str) {
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x001a, B:11:0x004b, B:10:0x0036), top: B:19:0x0001 }] */
            @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.app.Dialog showDialog(com.bytedance.ies.android.base.runtime.depend.DialogBuilder r6) {
                /*
                    r5 = this;
                    r3 = 0
                    android.app.Activity r0 = X.C2214201BlK.LJFF()     // Catch: java.lang.Throwable -> L4f
                    if (r0 == 0) goto L36
                    X.19al r4 = new X.19al     // Catch: java.lang.Throwable -> L4f
                    r4.<init>(r0)     // Catch: java.lang.Throwable -> L4f
                    java.lang.String r0 = r6.title     // Catch: java.lang.Throwable -> L4f
                    r4.LIZIZ = r0     // Catch: java.lang.Throwable -> L4f
                    java.lang.String r0 = r6.message     // Catch: java.lang.Throwable -> L4f
                    r4.LIZJ = r0     // Catch: java.lang.Throwable -> L4f
                    java.lang.String r1 = r6.positiveBtnText     // Catch: java.lang.Throwable -> L4f
                    if (r1 != 0) goto L1a
                    java.lang.String r1 = "OK"
                L1a:
                    android.content.DialogInterface$OnClickListener r0 = r6.positiveClickListener     // Catch: java.lang.Throwable -> L4f
                    r2 = 0
                    r4.LJIIJJI(r0, r1, r2)     // Catch: java.lang.Throwable -> L4f
                    java.lang.String r1 = r6.negativeBtnText     // Catch: java.lang.Throwable -> L4f
                    android.content.DialogInterface$OnClickListener r0 = r6.negativeClickListener     // Catch: java.lang.Throwable -> L4f
                    r4.LJIIIIZZ(r0, r1, r2)     // Catch: java.lang.Throwable -> L4f
                    boolean r0 = r6.cancelOnTouchOutside     // Catch: java.lang.Throwable -> L4f
                    r4.LJII = r0     // Catch: java.lang.Throwable -> L4f
                    X.19ah r0 = new X.19ah     // Catch: java.lang.Throwable -> L4f
                    r0.<init>(r4)     // Catch: java.lang.Throwable -> L4f
                    android.app.Dialog r1 = r0.LJ()     // Catch: java.lang.Throwable -> L4f
                    if (r1 != 0) goto L4b
                L36:
                    X.0iBy r2 = new X.0iBy     // Catch: java.lang.Throwable -> L4f
                    android.content.Context r0 = r6.context     // Catch: java.lang.Throwable -> L4f
                    r2.<init>(r0)     // Catch: java.lang.Throwable -> L4f
                    java.lang.String r0 = r6.message     // Catch: java.lang.Throwable -> L4f
                    r2.LIZJ(r0)     // Catch: java.lang.Throwable -> L4f
                    r0 = 5000(0x1388, double:2.4703E-320)
                    r2.LIZ(r0)     // Catch: java.lang.Throwable -> L4f
                    r2.LIZLLL()     // Catch: java.lang.Throwable -> L4f
                    r1 = r3
                L4b:
                    X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4f
                    goto L5b
                L4f:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.00Yq r1 = new X.00Yq
                    r1.<init>(r0)
                    X.C189200o6.m2constructorimpl(r1)
                L5b:
                    boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                    if (r0 != 0) goto L62
                    r3 = r1
                L62:
                    android.app.Dialog r3 = (android.app.Dialog) r3
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1A6A.showDialog(com.bytedance.ies.android.base.runtime.depend.DialogBuilder):android.app.Dialog");
            }
        };
        c2214461Blk.LJ = new INetworkDepend() { // from class: X.0XIS
            public static C443120HZe LIZ(C846340XIa c846340XIa) throws IOException {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(new C0XI4(c846340XIa.LIZ).LJFF(), linkedHashMap);
                return new C443120HZe(pairLIZJ.first, pairLIZJ.second, linkedHashMap);
            }

            public static List LIZIZ(C846340XIa c846340XIa) {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap<String, String> linkedHashMap = c846340XIa.LIZIZ;
                if (linkedHashMap != null) {
                    for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                        arrayList.add(new C080U(entry.getKey(), entry.getValue()));
                    }
                }
                return arrayList;
            }

            public static void LIZJ(InputStream inputStream, WeakReference weakReference) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                    }
                }
                if (weakReference != null) {
                    try {
                        C0X9S c0x9s = (C0X9S) weakReference.get();
                        if (c0x9s != null && !c0x9s.isCanceled()) {
                            c0x9s.cancel();
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1AF0.LJ(th2);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #2 {all -> 0x017e, blocks: (B:3:0x0020, B:5:0x005c, B:7:0x0062, B:8:0x0073, B:17:0x0089, B:23:0x00c0, B:24:0x00c9, B:26:0x00cf, B:28:0x00d5, B:29:0x00d9, B:31:0x00e1, B:32:0x00e5, B:34:0x00eb, B:37:0x00f8, B:38:0x00fc, B:40:0x0100, B:42:0x0130, B:44:0x016a, B:19:0x00a0, B:21:0x00aa), top: B:49:0x0020, inners: #3 }] */
            /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.ref.WeakReference] */
            @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0XIW requestForStream(X.C0XIY r24, X.C846340XIa r25) {
                /*
                    Method dump skipped, instruction units count: 395
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XIS.requestForStream(X.0XIY, X.0XIa):X.0XIW");
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #0 {all -> 0x0172, blocks: (B:3:0x0027, B:5:0x0065, B:7:0x006b, B:8:0x007b, B:17:0x0092, B:25:0x00c4, B:26:0x00c8, B:28:0x00ce, B:30:0x00d8, B:31:0x00dc, B:33:0x00e2, B:36:0x00ef, B:37:0x00f3, B:39:0x00f7, B:41:0x0124, B:43:0x015b, B:20:0x00a6, B:23:0x00b3), top: B:50:0x0027, inners: #1, #2 }] */
            /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0ozz, java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r5v2, types: [T, X.0ozZ, java.lang.Throwable] */
            @Override // com.bytedance.ies.android.base.runtime.depend.INetworkDepend
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0N4Z requestForString(X.C0XIY r20, X.C846340XIa r21) {
                /*
                    Method dump skipped, instruction units count: 394
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XIS.requestForString(X.0XIY, X.0XIa):X.0N4Z");
            }
        };
        c2214461Blk.LJIIIIZZ = new IUserDepend() { // from class: X.1AFC
            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final void login(Context context, C1AFD c1afd) {
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final void logout(Context context) {
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final String getAvatarURL() {
                AccountUserService accountUserServiceLJIIJ;
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                    return null;
                }
                return accountUserServiceLJIIJ.getAvatarUrl();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final String getNickname() {
                AccountUserService accountUserServiceLJIIJ;
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                    return null;
                }
                return accountUserServiceLJIIJ.getNickName();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final String getSecUid() {
                AccountUserService accountUserServiceLJIIJ;
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                    return null;
                }
                return accountUserServiceLJIIJ.getCurUser().getSecUid();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final String getUniqueID() {
                AccountUserService accountUserServiceLJIIJ;
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                    return null;
                }
                return accountUserServiceLJIIJ.getCurUser().getUniqueId();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final String getUserId() {
                AccountUserService accountUserServiceLJIIJ;
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                    return null;
                }
                return accountUserServiceLJIIJ.getCurUser().getUid();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final boolean hasBoundPhone() {
                AccountUserService accountUserServiceLJIIJ;
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                    return false;
                }
                return accountUserServiceLJIIJ.getCurUser().isPhoneBinded();
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IUserDepend
            public final boolean hasLogin() {
                AccountUserService accountUserServiceLJIIJ;
                IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                    return false;
                }
                return accountUserServiceLJIIJ.isLogin();
            }
        };
        c2214461Blk.LJIIJ = new InterfaceC988610bpj() { // from class: X.0cEe
            @Override // X.InterfaceC988610bpj
            public final Gson getGson() {
                return C7740030o.LIZ().getGson();
            }
        };
        c2214461Blk.LJIIIZ = new IALogDepend() { // from class: X.1Bly
            @Override // com.bytedance.ies.android.base.runtime.depend.IALogDepend
            public final void d(String str, String str2) {
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IALogDepend
            public final void e(String str, String str2, Throwable th) {
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IALogDepend
            public final void i(String str, String str2) {
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IALogDepend
            public final void v(String str, String str2) {
            }

            @Override // com.bytedance.ies.android.base.runtime.depend.IALogDepend
            public final void w(String str, String str2, Throwable th) {
            }
        };
        return c2214461Blk;
    }
}
