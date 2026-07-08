package X;

import android.view.MotionEvent;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepFunction;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYCepCallbackMode;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.strategy.HostClientAiService$wrapperLivePitayaCore$1;
import com.ss.android.ugc.aweme.ml.api.ISmartHARService;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.pitaya.IPitayaBundle;
import com.tiktok.strategycenter.TTMStrategyCenter;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS648S0100000_34;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.157a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204676157a implements C157V {
    public static final C204676157a LIZ = new C204676157a();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(219));

    @Override // X.C157V
    public final void LJFF() {
    }

    @Override // X.C157V
    public final void LJIL() {
    }

    @Override // X.C157V
    public final InterfaceC1610880s1O LIZLLL() {
        AnonymousClass1455.LIZ.getClass();
        if (!AnonymousClass1455.LJ("HostClientAiService", null)) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
        if (featureCore != null) {
            return featureCore.getCepCore();
        }
        return null;
    }

    @Override // X.C157V
    public final boolean LJI() {
        SmartHARService.Companion.getClass();
        ISmartHARService iSmartHARServiceLIZ = C1511980pRs.LIZ();
        C844470XAv.LIZ.getClass();
        return iSmartHARServiceLIZ.triggerSmartHarPredict(String.valueOf(C844470XAv.LJIIJ), true);
    }

    @Override // X.C157V
    public final void LJII() {
        InterfaceC1513520pUM interfaceC1513520pUM = C1513450pUF.LIZ;
        InterfaceC1513600pUU interfaceC1513600pUU = C1513230pTt.LIZIZ;
        interfaceC1513600pUU.initialize();
        interfaceC1513600pUU.LIZLLL();
    }

    @Override // X.C157V
    public final int LJIIIIZZ() {
        SmartHARService.Companion.getClass();
        return C1511980pRs.LIZ().getLastStatus();
    }

    @Override // X.C157V
    public final InterfaceC1093410eYl LJIIJ() {
        return (InterfaceC1093410eYl) LIZIZ.getValue();
    }

    @Override // X.C157V
    public final boolean LJIIJJI() {
        SmartHARService.Companion.getClass();
        return C1511980pRs.LIZ().enable();
    }

    @Override // X.C157V
    public final void LJIILIIL() {
        InterfaceC1513520pUM interfaceC1513520pUM = C1513450pUF.LIZ;
        C1513230pTt.LIZIZ.shutdown();
    }

    @Override // X.C157V
    public final void LJIILL() {
        InterfaceC1513520pUM interfaceC1513520pUM = C1513450pUF.LIZ;
        C1513230pTt.LIZIZ.LIZLLL();
    }

    @Override // X.C157V
    public final Map<String, Float> LJIIZILJ() {
        SmartHARService.Companion.getClass();
        return C1511980pRs.LIZ().getLastResult();
    }

    @Override // X.C157V
    public final void LJIJJ() {
        SmartHARService.Companion.getClass();
        C1511980pRs.LIZ().checkAndInit();
    }

    @Override // X.C157V
    public final HostClientAiService$wrapperLivePitayaCore$1 LJIJJLI() {
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LJIIJ);
        return new HostClientAiService$wrapperLivePitayaCore$1(PitayaCoreFactory.getCore(strValueOf), FeatureCoreFactory.INSTANCE.getFeatureCore(strValueOf));
    }

    @Override // X.C157V
    public final void LJJ() {
        C157Z c157z = C157Z.LIZ;
        C157Z.LIZIZ = null;
        SmartHARService.Companion.getClass();
        C1511980pRs.LIZ().removePredictListener(c157z);
    }

    @Override // X.C157V
    public final boolean LIZIZ() {
        return C1336210ksN.LIZ();
    }

    @Override // X.C157V
    public final TTMStrategyCenter LJIILLIIL() {
        return TTMStrategyCenter.getInstance();
    }

    @Override // X.C157V
    public final void LIZ(MotionEvent motionEvent) {
        InterfaceC1513520pUM interfaceC1513520pUM = C1513450pUF.LIZ;
        C1513230pTt.LIZIZ.LIZ(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.bytedance.pitaya.api.IPitayaCore] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.157b] */
    @Override // X.C157V
    public final void LIZJ(final C1093360eYg c1093360eYg) throws JSONException {
        C844470XAv.LIZ.getClass();
        String strValueOf = String.valueOf(C844470XAv.LJIIJ);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = PitayaCoreFactory.getCore(strValueOf);
        final IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(strValueOf);
        if (((IPitayaCore) c259800zU.element).isReady()) {
            c1093360eYg.LIZIZ(new HostClientAiService$wrapperLivePitayaCore$1((IPitayaCore) c259800zU.element, featureCore));
            return;
        }
        AnonymousClass1455 anonymousClass1455 = AnonymousClass1455.LIZ;
        ?? r1 = new AnonymousClass1457() { // from class: X.157b
            @Override // X.AnonymousClass1457
            public final void onFailed() {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(c1093360eYg, 783));
            }

            @Override // X.AnonymousClass1457
            public final void onSuccess() {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS275S0300000_31(c1093360eYg, (C157Y) c259800zU, (C259800zU<IPitayaCore>) featureCore, (IFeatureCore) 25));
            }
        };
        anonymousClass1455.getClass();
        AnonymousClass1455.LJ("HostClientAiService#pitayaCore", r1);
    }

    @Override // X.C157V
    public final boolean LJIIL(C20340814iU c20340814iU) {
        if (c20340814iU == null) {
            return false;
        }
        C1513450pUF.LIZ = c20340814iU;
        return C1513450pUF.LIZIZ.LJIIJJI(C1513450pUF.LIZJ);
    }

    @Override // X.C157V
    public final void LJIJ(C157X c157x) {
        C157Z c157z = C157Z.LIZ;
        if (c157x != null) {
            C157Z.LIZIZ = c157x;
            SmartHARService.Companion.getClass();
            C1511980pRs.LIZ().addPredictListener(c157z);
        }
    }

    @Override // X.C157V
    public final void LJ(String str, final AwS613S0100000_34 awS613S0100000_34) {
        PTYCepFunction pTYCepFunction = new PTYCepFunction() { // from class: com.bytedance.android.live.ai.api.cep.LiveCepManager$registerGlobalFunction$function$1
            @Override // com.bytedance.pitaya.api.PTYCepFunction
            public Object apply(JSONArray jSONArray) {
                return awS613S0100000_34.invoke(jSONArray);
            }
        };
        ReentrantReadWriteLock.ReadLock readLock = C1851020yGi.LIZ;
        readLock.lock();
        try {
            if (C1851020yGi.LIZJ != null) {
                InterfaceC1610880s1O interfaceC1610880s1O = C1851020yGi.LIZJ;
                if (interfaceC1610880s1O != null) {
                    interfaceC1610880s1O.LIZJ(str, pTYCepFunction);
                }
            } else {
                C1851020yGi.LJ.put(str, pTYCepFunction);
            }
            readLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1851020yGi.LIZ.unlock();
            throw th;
        }
    }

    @Override // X.C157V
    public final void LJIIIZ(String str, JSONObject jSONObject) {
        InterfaceC1610880s1O interfaceC1610880s1O = C1851020yGi.LIZJ;
        if (interfaceC1610880s1O != null) {
            interfaceC1610880s1O.onEvent(str, jSONObject);
        }
    }

    @Override // X.C157V
    public final void LJIJI(String str, JSONObject jSONObject) {
        AnonymousClass1455 anonymousClass1455 = AnonymousClass1455.LIZ;
        String strJ3 = C786410Ut5.J3(jSONObject);
        anonymousClass1455.getClass();
        IPitayaBundle iPitayaBundleLIZ = AnonymousClass1455.LIZ();
        if (iPitayaBundleLIZ != null) {
            iPitayaBundleLIZ.onAppLogEvent(str, strJ3);
        }
    }

    @Override // X.C157V
    public final void LJIILJJIL(String str, String str2, final AwS613S0100000_34 awS613S0100000_34, final AwS578S0100000_34 awS578S0100000_34, final AwS648S0100000_34 awS648S0100000_34) {
        PTYCepCallback pTYCepCallback = new PTYCepCallback() { // from class: com.bytedance.android.live.ai.api.cep.LiveCepManager$registerCallback$callback$1
            @Override // com.bytedance.pitaya.api.PTYCepCallback
            public void onFinish(boolean z, PTYError pTYError, PTYCepResult pTYCepResult) {
                if (z) {
                    awS613S0100000_34.invoke(new JSONArray((Collection) pTYCepResult.getMatchedEventsSequences()));
                    return;
                }
                if (pTYError == null) {
                    awS578S0100000_34.invoke();
                    return;
                }
                String summary = pTYError.getSummary();
                if (summary == null) {
                    awS648S0100000_34.invoke("Cep Run Error", new JSONArray((Collection) pTYCepResult.getMatchedEventsSequences()));
                } else {
                    awS648S0100000_34.invoke(summary, new JSONArray((Collection) pTYCepResult.getMatchedEventsSequences()));
                }
            }
        };
        ReentrantReadWriteLock.ReadLock readLock = C1851020yGi.LIZ;
        readLock.lock();
        try {
            if (C1851020yGi.LIZJ != null) {
                InterfaceC1610880s1O interfaceC1610880s1O = C1851020yGi.LIZJ;
                if (interfaceC1610880s1O != null) {
                    interfaceC1610880s1O.LIZ(str, str2, pTYCepCallback, PTYCepCallbackMode.SUCCESS_AND_ERROR);
                }
            } else {
                ConcurrentHashMap<String, ConcurrentHashMap<String, PTYCepCallback>> concurrentHashMap = C1851020yGi.LIZLLL;
                if (!concurrentHashMap.containsKey(str)) {
                    synchronized (concurrentHashMap) {
                        try {
                            if (!concurrentHashMap.containsKey(str)) {
                                concurrentHashMap.put(str, new ConcurrentHashMap<>());
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                ConcurrentHashMap<String, PTYCepCallback> concurrentHashMap2 = concurrentHashMap.get(str);
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.put(str2, pTYCepCallback);
                }
            }
            readLock.unlock();
        } catch (Throwable th) {
            C1851020yGi.LIZ.unlock();
            throw th;
        }
    }
}
