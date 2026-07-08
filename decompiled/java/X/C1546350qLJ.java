package X;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadTrigger;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0qLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.perf.lynxpreload.PdpLynxPreloadSparkManager$triggerTemplatePreDecode$1$1", f = "PdpLynxPreloadSparkManager.kt", l = {102}, m = "invokeSuspend")
public final class C1546350qLJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreloadTrigger LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ PreloadSchema LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546350qLJ(int i, PreloadSchema preloadSchema, PreloadTrigger preloadTrigger, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = preloadTrigger;
        this.LLILLL = i;
        this.LLILZ = preloadSchema;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1546350qLJ(this.LLILLL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int iIntValue;
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("PdpLynxPreloadSparkManager@fd56.triggerTemplatePreDecode$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.delayMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PdpLynxPreloadSparkManager@fd56.triggerTemplatePreDecode$1$1");
                return objLJFF;
            }
        }
        C1546400qLO c1546400qLO = C1546400qLO.LIZ;
        final int i2 = this.LLILLL;
        String str2 = this.LLILZ.geckoChannel;
        c1546400qLO.getClass();
        if (str2 != null) {
            if (!a0.LJJJIL(str2)) {
                str = str2;
            } else {
                str = null;
            }
            if (str != null) {
                ConcurrentHashMap<String, Integer> concurrentHashMap = C1546400qLO.LIZIZ;
                Integer num = concurrentHashMap.get(str2);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue >= 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("skip gecko update, channel=");
                    sbLIZ.append(str);
                    sbLIZ.append(", preloadScene=");
                    sbLIZ.append(i2);
                    sbLIZ.append(", trialCount=");
                    sbLIZ.append(iIntValue);
                    C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    concurrentHashMap.put(str, Integer.valueOf(iIntValue + 1));
                    AbstractC1552040qUU abstractC1552040qUU = new AbstractC1552040qUU() { // from class: X.0qLR
                        @Override // X.AbstractC1552040qUU
                        public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko onLocalNewestVersion, channelName=");
                            sbLIZ2.append(localPackageModel.getChannel());
                            C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                            String channel = localPackageModel.getChannel();
                            if (channel != null) {
                                C1546400qLO.LIZIZ(C1546400qLO.LIZ, 2, i2, channel, null, null, 496);
                            }
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJ(UpdatePackage updatePackage, Throwable th) {
                            String channel;
                            String message;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko onActivateFail, channel=");
                            String message2 = null;
                            if (updatePackage != null) {
                                channel = updatePackage.getChannel();
                            } else {
                                channel = null;
                            }
                            sbLIZ2.append(channel);
                            sbLIZ2.append(" message=");
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ2.append(message);
                            C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                            C1546400qLO c1546400qLO2 = C1546400qLO.LIZ;
                            int i3 = i2;
                            if (th != null) {
                                message2 = th.getMessage();
                            }
                            C1546400qLO.LIZIZ(c1546400qLO2, 0, i3, null, null, message2, 248);
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJII(Throwable th, Map map) {
                            String message;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko onCheckServerVersionFail, message=");
                            String message2 = null;
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ2.append(message);
                            C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                            C1546400qLO c1546400qLO2 = C1546400qLO.LIZ;
                            int i3 = i2;
                            if (th != null) {
                                message2 = th.getMessage();
                            }
                            C1546400qLO.LIZIZ(c1546400qLO2, 0, i3, null, null, message2, 248);
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                            String channel;
                            String message;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko onDownloadFail, channel=");
                            String message2 = null;
                            if (updatePackage != null) {
                                channel = updatePackage.getChannel();
                            } else {
                                channel = null;
                            }
                            sbLIZ2.append(channel);
                            sbLIZ2.append(" message=");
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ2.append(message);
                            C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                            C1546400qLO c1546400qLO2 = C1546400qLO.LIZ;
                            int i3 = i2;
                            if (th != null) {
                                message2 = th.getMessage();
                            }
                            C1546400qLO.LIZIZ(c1546400qLO2, 0, i3, null, null, message2, 248);
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                            String channel;
                            String message;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko onUpdateFailed, channel=");
                            String message2 = null;
                            if (updatePackage != null) {
                                channel = updatePackage.getChannel();
                            } else {
                                channel = null;
                            }
                            sbLIZ2.append(channel);
                            sbLIZ2.append(" message=");
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ2.append(message);
                            C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                            C1546400qLO c1546400qLO2 = C1546400qLO.LIZ;
                            int i3 = i2;
                            if (th != null) {
                                message2 = th.getMessage();
                            }
                            C1546400qLO.LIZIZ(c1546400qLO2, 0, i3, null, null, message2, 248);
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJIL(long j2, UpdatePackage updatePackage) {
                            String channel;
                            String channel2;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko onUpdateSuccess, channelName=");
                            if (updatePackage != null) {
                                channel = updatePackage.getChannel();
                            } else {
                                channel = null;
                            }
                            sbLIZ2.append(channel);
                            C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                            if (updatePackage != null && (channel2 = updatePackage.getChannel()) != null) {
                                C1546400qLO.LIZIZ(C1546400qLO.LIZ, 1, i2, channel2, null, null, 496);
                            }
                        }

                        @Override // X.AbstractC1552040qUU
                        public final void LJI(int i3, Throwable th, Map map) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("gecko onCheckRequestIntercept, message=");
                            sbLIZ2.append(th.getMessage());
                            C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                            C1546400qLO.LIZIZ(C1546400qLO.LIZ, 0, i2, null, Integer.valueOf(i3), th.getMessage(), 120);
                        }
                    };
                    OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                    optionCheckUpdateParams.setEnableDownloadAutoRetry(true);
                    optionCheckUpdateParams.setChannelUpdatePriority(3);
                    optionCheckUpdateParams.setLazyUpdate(true);
                    optionCheckUpdateParams.setListener(abstractC1552040qUU);
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IHybridDependencyService.class.getName();
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                    }
                    IHybridDependencyService iHybridDependencyService = (IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
                    C1551950qUL c1551950qULInitGeckoXMultiClient = iHybridDependencyService.initGeckoXMultiClient();
                    String accessKey = iHybridDependencyService.getAccessKey();
                    try {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("gecko update START, channel=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", accesskey=");
                        sbLIZ2.append(accessKey);
                        C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                        if (c1551950qULInitGeckoXMultiClient != null) {
                            c1551950qULInitGeckoXMultiClient.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str)))), optionCheckUpdateParams);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1326490kch.LIZLLL(Log.getStackTraceString(th));
                    }
                }
            }
        }
        C1546400qLO c1546400qLO2 = C1546400qLO.LIZ;
        PreloadSchema preloadSchema = this.LLILZ;
        c1546400qLO2.getClass();
        if (C703302op.LIZ(preloadSchema.url) && !((ConcurrentHashMap) C1546400qLO.LIZJ.getValue()).containsKey(preloadSchema.url)) {
            String str3 = preloadSchema.id;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("pdp_predecode_");
            sbLIZ3.append(str3);
            C1508250pLr.LIZIZ("pdp_lynx_predecode", C2188811AlT.LIZIZ(sbLIZ3), new AwS567S0100000_23(preloadSchema, 226));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpLynxPreloadSparkManager@fd56.triggerTemplatePreDecode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
