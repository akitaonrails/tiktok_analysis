package X;

import android.content.Context;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* JADX INFO: renamed from: X.0sZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632070sZZ {
    public static final void LIZ(final String str, final Effect effect, final Map<String, String> map) {
        IAbilityService iAbilityServiceAbilityService;
        final IAVEffectService iAVEffectServiceEffectService;
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload effect, effectId: ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c20012313Rx, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ));
        if (effect != null && effect.getEffectType() == 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("hit cache, effectId: ");
            sbLIZ2.append(str);
            C201955140j.LIZLLL(c20012313Rx, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iAbilityServiceAbilityService = iExternalService.abilityService()) == null || (iAVEffectServiceEffectService = iAbilityServiceAbilityService.effectService()) == null) {
            return;
        }
        C844470XAv.LIZ.getClass();
        iAVEffectServiceEffectService.buildEffectPlatform(C844470XAv.LIZ(), new IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex>() { // from class: X.0sZX
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
            public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
                InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                if (interfaceC1635410sex2 == null) {
                    C20012313Rx c20012313Rx2 = C20012313Rx.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("download error, effectPlatform is null, effectId: ");
                    sbLIZ3.append(str);
                    C201955140j.LIZLLL(c20012313Rx2, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                Effect effect2 = effect;
                if (effect2 != null && interfaceC1635410sex2.LJIIIIZZ(effect2)) {
                    C20012313Rx c20012313Rx3 = C20012313Rx.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("hit cache, effectId: ");
                    sbLIZ4.append(str);
                    C201955140j.LIZLLL(c20012313Rx3, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                final String str2 = str;
                iAVEffectServiceEffectService.fetchEffectResource(str2, true, map, interfaceC1635410sex2, new IEffectDownloadProgressListener() { // from class: X.0sZY
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                    public final void onProgress(Effect effect3, int i, long j) {
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect3) {
                        C20012313Rx c20012313Rx4 = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Download onStart, effectId: ");
                        sbLIZ5.append(str2);
                        C201955140j.LIZLLL(c20012313Rx4, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ5));
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect3) {
                        C20012313Rx c20012313Rx4 = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Download onSuccess, effectId: ");
                        sbLIZ5.append(str2);
                        C201955140j.LIZLLL(c20012313Rx4, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ5));
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect3, ExceptionResult exceptionResult) {
                        C20012313Rx c20012313Rx4 = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Download onFail, effectId: ");
                        sbLIZ5.append(str2);
                        sbLIZ5.append(", e: ");
                        sbLIZ5.append(exceptionResult);
                        C201955140j.LIZLLL(c20012313Rx4, "lazyEffect", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                });
            }
        }, null);
    }

    public static final C19482711Kf LIZIZ(Context context, String str, Effect effect, C11RK c11rk, Map map, boolean z) {
        IAVEffectService iAVEffectServiceEffectService;
        IAbilityService iAbilityServiceAbilityService;
        if (z && (C298000BmA.LIZ() || C297990Bm9.LIZ() || C297980Bm8.LIZ())) {
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[lazyEffect] start fetch effect list, effectId: ");
            sbLIZ.append(str);
            sbLIZ.append(", netLevel:");
            C1661300tKi.LIZ.getClass();
            sbLIZ.append(TTNetInit.getEffectiveConnectionType());
            C201955140j.LIZJ(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ));
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (iAbilityServiceAbilityService = iExternalService.abilityService()) != null) {
                iAVEffectServiceEffectService = iAbilityServiceAbilityService.effectService();
            } else {
                iAVEffectServiceEffectService = null;
            }
            return C11NZ.LJIJJLI(new C1632020sZU(effect, str, iAVEffectServiceEffectService, context, c11rk, map));
        }
        return C11NZ.LJIJJLI(new C1631990sZR(context, effect, c11rk, str, map));
    }
}
