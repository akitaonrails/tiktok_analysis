package X;

import android.app.Activity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.amg.minigameruntime.api.RefreshParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S2410000_34;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1AvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194991AvR extends C09AY implements Function1<IMiniGameRuntimeAPI, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ WeakReference<C1304490k3D> LLILLJJLI;
    public final /* synthetic */ WeakReference<C2195011AvT> LLILLL;
    public final /* synthetic */ WeakReference<Activity> LLILZ;
    public final /* synthetic */ SchemaParserData LLILZIL;
    public final /* synthetic */ MinisMetaResp LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ AtomicBoolean LLIZLLLIL;
    public final /* synthetic */ C2196371Axf LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194991AvR(String str, WeakReference<C1304490k3D> weakReference, WeakReference<C2195011AvT> weakReference2, WeakReference<Activity> weakReference3, SchemaParserData schemaParserData, MinisMetaResp minisMetaResp, String str2, AtomicBoolean atomicBoolean, C2196371Axf c2196371Axf, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = weakReference;
        this.LLILLL = weakReference2;
        this.LLILZ = weakReference3;
        this.LLILZIL = schemaParserData;
        this.LLILZLL = minisMetaResp;
        this.LLIZ = str2;
        this.LLIZLLLIL = atomicBoolean;
        this.LLJ = c2196371Axf;
        this.LLJI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IMiniGameRuntimeAPI iMiniGameRuntimeAPI) {
        C2195011AvT c2195011AvT;
        EnumC1304510k3F enumC1304510k3F;
        WeakReference<Activity> weakReference;
        Activity activity;
        IClientAdapterService iClientAdapterService;
        SurfaceView surfaceView;
        InterfaceC1177504j7 runtimeCallback;
        IMiniGameRuntimeAPI runtime;
        SurfaceView surfaceView2;
        SurfaceHolder holder;
        ViewGroup viewGroup;
        IClientAdapterService lastAdapter;
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI2 = iMiniGameRuntimeAPI;
        ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = C2195161Avi.LIZ;
        String str = this.LL;
        if (str != null && str.length() != 0) {
            synchronized (C2195161Avi.LJI) {
                try {
                    C2195171Avj c2195171Avj = C2195161Avi.LIZ.get(str);
                    if (c2195171Avj != null) {
                        c2195171Avj.LIZJ = Long.MAX_VALUE;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1304490k3D c1304490k3D = this.LLILLJJLI.get();
        if (c1304490k3D != null && (c2195011AvT = this.LLILLL.get()) != null) {
            if (iMiniGameRuntimeAPI2 != null && iMiniGameRuntimeAPI2 != c1304490k3D.getRuntime()) {
                Activity activity2 = this.LLILZ.get();
                if (activity2 != null && (lastAdapter = c1304490k3D.getLastAdapter()) != null) {
                    c1304490k3D.LJFF(iMiniGameRuntimeAPI2, activity2, lastAdapter);
                }
            } else {
                IMiniGameRuntimeAPI iMiniGameRuntimeAPI3 = c1304490k3D.LLILLL;
                if (iMiniGameRuntimeAPI3 != null && (((enumC1304510k3F = c1304490k3D.LLIZ) == EnumC1304510k3F.LAUNCHED || enumC1304510k3F == EnumC1304510k3F.PAUSED) && (weakReference = c1304490k3D.LLILZIL) != null && (activity = weakReference.get()) != null && (iClientAdapterService = c1304490k3D.LLILZLL) != null && (surfaceView = c1304490k3D.LL) != null)) {
                    RefreshParams refreshParams = new RefreshParams();
                    refreshParams.setActivity(activity);
                    refreshParams.setSurfaceView(surfaceView);
                    refreshParams.setClientAdapter(iClientAdapterService);
                    iMiniGameRuntimeAPI3.refresh(refreshParams);
                    int i = C2187451AjH.LIZ;
                }
            }
            if (!c2195011AvT.LJIILL && (runtime = c2195011AvT.LIZ.getRuntime()) != null && (surfaceView2 = c2195011AvT.LJIIJJI) != null && (holder = surfaceView2.getHolder()) != null && (viewGroup = c2195011AvT.LJIILIIL) != null) {
                c2195011AvT.LJIIL();
                Pair pairLIZ = C1304540k3I.LIZ(viewGroup.getContext());
                c2195011AvT.LJIIJJI(runtime, holder, viewGroup, ((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), "reattach");
            }
            if (c2195011AvT.LJFF) {
                c2195011AvT.LJIIIIZZ.removeCallbacks(c2195011AvT.LJII);
                C786410Ut5.LJLIIL(500L, c2195011AvT.LJIIIIZZ, c2195011AvT.LJII);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("completeForegroundHandoff: cacheKey=");
                sbLIZ.append(c2195011AvT.LIZIZ);
                sbLIZ.append(", clearInMs=500");
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (MinisTtmgConfigSettings.LIZ().enableMinisHandbackJsbReregister && (runtimeCallback = c1304490k3D.getRuntimeCallback()) != null) {
                final SchemaParserData schemaParserData = this.LLILZIL;
                final WeakReference<Activity> weakReference2 = this.LLILZ;
                final MinisMetaResp minisMetaResp = this.LLILZLL;
                final String str2 = this.LLIZ;
                final WeakReference<C2195011AvT> weakReference3 = this.LLILLL;
                final AtomicBoolean atomicBoolean = this.LLIZLLLIL;
                final C2196371Axf c2196371Axf = this.LLJ;
                final boolean z = this.LLJI;
                C2194981AvQ c2194981AvQ = c2195011AvT.LIZJ;
                if ((c2194981AvQ instanceof InterfaceC1877250yx1) && c2194981AvQ != null) {
                    WeakReference weakReference4 = new WeakReference(c2194981AvQ);
                    final String str3 = schemaParserData.clientKey;
                    C2195041AvW.LIZ(weakReference2, runtimeCallback, weakReference4, new C09Z1() { // from class: X.1AvJ
                        @Override // X.C09Z1
                        public final String LIZ(String str4, MinisPkg minisPkg) {
                            MinisPkgConfig minisPkgConfig;
                            String str5;
                            MinisMetaResp minisMetaResp2 = minisMetaResp;
                            if (minisMetaResp2 != null && (str5 = minisMetaResp2.packageConfig) != null) {
                                try {
                                    C1227904rF.LIZ.getClass();
                                    minisPkgConfig = (MinisPkgConfig) C1227904rF.LIZIZ(str5, MinisPkgConfig.class);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    int i3 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("parse pkgConfig in JSB handler fail: ");
                                    sbLIZ2.append(e.getMessage());
                                    C1720106oR.LIZ("MiniGameRenderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                                    minisPkgConfig = null;
                                }
                            } else {
                                minisPkgConfig = null;
                            }
                            C2390509Yh c2390509Yh = C2390509Yh.LIZ;
                            Activity activity3 = weakReference2.get();
                            String str6 = str3;
                            SchemaParserData schemaParserData2 = schemaParserData;
                            AwS1S2410000_34 awS1S2410000_34 = new AwS1S2410000_34(str2, str4, schemaParserData2, weakReference3, atomicBoolean, c2196371Axf, z, 0);
                            c2390509Yh.getClass();
                            return C2390509Yh.LJIIIIZZ(str4, minisPkg, true, activity3, str6, schemaParserData2, minisPkgConfig, false, awS1S2410000_34);
                        }
                    }, new AwS560S0100000_16(weakReference3, (WeakReference<C2195011AvT>) 369), true, new AwS578S0100000_34(schemaParserData, 53), null, 128);
                }
            }
        }
        return Unit.LIZ;
    }
}
