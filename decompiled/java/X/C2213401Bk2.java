package X;

import android.content.Context;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.psp.PSPSettings;
import com.ss.android.ugc.aweme.pspapi.IPSPInitCEPEngine;
import com.tiktok.strategycenter.feature.IFeatureCenterDataManager;
import com.tiktok.strategycenter.gecko.ITTMGeckoDelegate;
import com.tiktok.strategycenter.gecko.TTMGeckoDelegateManager;
import com.tiktok.strategycenterengine.account.IPSPAccountService;
import com.tiktok.strategycenterengine.coreinterface.TTMTarsDelegate;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import com.tiktok.strategycenterengineimpl.action.IPSPFeatureAction;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl;
import com.tiktok.ttm.TTMCore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213401Bk2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Function2<String, JSONObject, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213401Bk2(Context context, C1163604gs c1163604gs) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = c1163604gs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLIZ;
        KevaImpl.forceInitImpl();
        C2213391Bk1 c2213391Bk1 = TTMTarsDelegate.LIZ;
        TTMTarsDelegate tTMTarsDelegate = (TTMTarsDelegate) PluggableExtentionKt.pluggableSpi$default(TTMTarsDelegate.class, false, false, false, 14, null);
        c2213391Bk1.getClass();
        C2213391Bk1.LIZIZ = tTMTarsDelegate;
        C2213451Bk7 c2213451Bk7 = ITTMGeckoDelegate.LIZ;
        ITTMGeckoDelegate iTTMGeckoDelegate = (ITTMGeckoDelegate) PluggableExtentionKt.pluggableSpi$default(ITTMGeckoDelegate.class, false, false, false, 14, null);
        c2213451Bk7.getClass();
        TTMGeckoDelegateManager.INSTANCE.setInstance$ttm_strategy_center_release(iTTMGeckoDelegate);
        IPSPAccountService iPSPAccountService = (IPSPAccountService) PluggableExtentionKt.pluggableSpi$default(IPSPAccountService.class, false, false, false, 14, null);
        if (iPSPAccountService == null || (strLIZ = iPSPAccountService.LIZ()) == null) {
            strLIZ = CardStruct.IStatusCode.DEFAULT;
        }
        C2213481BkA.LIZ.getClass();
        TTMCore.Config config = C2213481BkA.LJ;
        IPSPFeatureAction iPSPFeatureAction = (IPSPFeatureAction) PluggableExtentionKt.pluggableSpi$default(IPSPFeatureAction.class, false, false, false, 14, null);
        IFeatureCenterDataManager iFeatureCenterDataManager = (IFeatureCenterDataManager) PluggableExtentionKt.pluggableSpi$default(IFeatureCenterDataManager.class, false, false, false, 14, null);
        ITTMEventStream iTTMEventStream = C829800Wgs.LIZ;
        ITTMEventStream iTTMEventStream2 = C829790Wgr.LIZ;
        C2213421Bk4.LJI = strLIZ;
        PSPSettings.LIZ();
        C2213421Bk4.LJ = PSPSettings.LIZ().enableStrategyCenter;
        C2213421Bk4.LJFF = PSPSettings.LIZ().dbFileExpirationTime;
        C2213421Bk4.LIZ = PSPSettings.LIZ().emitApplogEvent & PSPSettings.LIZ().enableStrategyCenter;
        C2213421Bk4.LJIIIIZZ = PSPSettings.LIZ().strategyInfoSampleRate;
        C2213421Bk4.LJIIIZ = PSPSettings.LIZ().centerInfoSampleRate;
        C2213421Bk4.LIZJ = new C1877907Xd(iPSPFeatureAction);
        C2208771BcZ c2208771BcZ = C2208771BcZ.LIZ;
        C2213421Bk4.LIZLLL = new C2213431Bk5(config, iFeatureCenterDataManager, ((Boolean) C280240Ayc.LIZ.getValue()).booleanValue());
        C2213421Bk4.LJII = new C1166780gT6(this.LLILLJJLI);
        try {
            IPSPInitCEPEngine iPSPInitCEPEngine = (IPSPInitCEPEngine) PluggableExtentionKt.pluggableSpi$default(IPSPInitCEPEngine.class, false, false, false, 14, null);
            if (iPSPInitCEPEngine != null) {
                iPSPInitCEPEngine.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Context context = this.LL;
        boolean z = C2213421Bk4.LIZ;
        TTMStrategyCenterManagerImpl.LIZLLL(context);
        if (iPSPAccountService != null) {
            iPSPAccountService.LIZIZ(new C829920Wh4());
        }
        return Unit.LIZ;
    }
}
