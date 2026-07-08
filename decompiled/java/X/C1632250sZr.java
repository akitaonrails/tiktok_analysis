package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632250sZr {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(414));
    public volatile AnonymousClass0956 LIZIZ;
    public volatile Effect LIZJ;

    public static Object LIZ(Context context, final String str, final Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        IAbilityService iAbilityServiceAbilityService;
        IAVEffectService iAVEffectServiceEffectService;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (str != null && !a0.LJJJIL(str)) {
            EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(str);
            if (effectListResponseLIZ != null) {
                Object objLJJJLL = C13LP.LJJJLL(effectListResponseLIZ.getData());
                C189200o6.m2constructorimpl(objLJJJLL);
                c2252611DEt.resumeWith(objLJJJLL);
            } else {
                IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService != null && (iAbilityServiceAbilityService = iExternalService.abilityService()) != null && (iAVEffectServiceEffectService = iAbilityServiceAbilityService.effectService()) != null) {
                    iAVEffectServiceEffectService.buildEffectPlatform(context, new IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex>() { // from class: X.0sP9
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
                            InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                            if (interfaceC1635410sex2 != null) {
                                List<String> listSingletonList = Collections.singletonList(str);
                                Map<String, String> map2 = map;
                                final String str2 = str;
                                final InterfaceC20236714Gf<Effect> interfaceC20236714Gf = c2252611DEt;
                                interfaceC1635410sex2.LIZ(listSingletonList, map2, new IFetchEffectListByIdsListener() { // from class: X.0sP8
                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                                    public final void onFail(ExceptionResult exceptionResult) {
                                        String string;
                                        InterfaceC20236714Gf<Effect> interfaceC20236714Gf2 = interfaceC20236714Gf;
                                        if (exceptionResult == null || (string = exceptionResult.toString()) == null) {
                                            string = "download failed";
                                        }
                                        C098200Yq c098200Yq = new C098200Yq(new IllegalStateException(string));
                                        C189200o6.m2constructorimpl(c098200Yq);
                                        interfaceC20236714Gf2.resumeWith(c098200Yq);
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                    public final void onSuccess(EffectListResponse effectListResponse) {
                                        Object objLJJJLL2;
                                        List<Effect> data;
                                        EffectListResponse effectListResponse2 = effectListResponse;
                                        C1398060mU8.LIZIZ(str2, effectListResponse2);
                                        InterfaceC20236714Gf<Effect> interfaceC20236714Gf2 = interfaceC20236714Gf;
                                        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                                            objLJJJLL2 = C13LP.LJJJLL(data);
                                        } else {
                                            objLJJJLL2 = null;
                                        }
                                        C189200o6.m2constructorimpl(objLJJJLL2);
                                        interfaceC20236714Gf2.resumeWith(objLJJJLL2);
                                    }
                                });
                                return;
                            }
                            InterfaceC20236714Gf<Effect> interfaceC20236714Gf2 = c2252611DEt;
                            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("build EffectPlatform failed"));
                            C189200o6.m2constructorimpl(c098200Yq);
                            interfaceC20236714Gf2.resumeWith(c098200Yq);
                        }
                    }, null);
                } else {
                    C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("can not find effectService"));
                    C189200o6.m2constructorimpl(c098200Yq);
                    c2252611DEt.resumeWith(c098200Yq);
                }
            }
        } else {
            C098200Yq c098200Yq2 = new C098200Yq(new IllegalArgumentException("effect id is null"));
            C189200o6.m2constructorimpl(c098200Yq2);
            c2252611DEt.resumeWith(c098200Yq2);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static void LIZIZ(String str, Effect effect, MusicModel musicModel, String str2, ShootExtraData shootExtraData, AbstractC1661070tKL abstractC1661070tKL, InterfaceC1661080tKM interfaceC1661080tKM) {
        interfaceC1661080tKM.LJ(effect);
        C1661180tKW.LIZJ(C1661180tKW.LIZ, abstractC1661070tKL, musicModel, str, false, false);
        shootExtraData.setDownloadMusicInBackground(Boolean.TRUE);
        interfaceC1661080tKM.LIZJ(new C1661050tKJ(str2, null, 100, null, effect, 100, null, null, 202));
    }
}
