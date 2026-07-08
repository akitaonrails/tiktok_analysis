package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.0sZS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632000sZS<T> implements InterfaceC1478005qU {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Effect LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ C11PR<C1661140tKS> LIZLLL;
    public final /* synthetic */ Map<String, String> LJ;

    public C1632000sZS(Context context, Effect effect, C11RK c11rk, String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = effect;
        this.LIZJ = context;
        this.LIZLLL = c11rk;
        this.LJ = map;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1661050tKJ> c09aj) {
        C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectListFetchObservable$1");
        IAVEffectService iAVEffectServiceEffectService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService();
        if (TextUtils.isEmpty(this.LIZ)) {
            LIZ(this.LIZLLL, c09aj, null);
            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectListFetchObservable$1");
            return;
        }
        Effect effect = this.LIZIZ;
        if (effect == null) {
            EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(this.LIZ);
            if (effectListResponseLIZ != null) {
                LIZ(this.LIZLLL, c09aj, (Effect) C13LP.LJJJLL(effectListResponseLIZ.getData()));
                C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectListFetchObservable$1");
                return;
            }
            Context context = this.LIZJ;
            final String str = this.LIZ;
            final Map<String, String> map = this.LJ;
            final C11PR<C1661140tKS> c11pr = this.LIZLLL;
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            iAVEffectServiceEffectService.buildEffectPlatform(context, new IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex>() { // from class: X.0sZT
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
                    InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                    if (interfaceC1635410sex2 != null) {
                        String str2 = str;
                        interfaceC1635410sex2.LJFF(Collections.singletonList(str2), false, map, new C1698200uIE(c11pr, c19482611Ke, 1));
                    }
                }
            }, null);
        } else {
            LIZ(this.LIZLLL, c09aj, effect);
        }
        C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectListFetchObservable$1");
    }

    public static final void LIZ(C11PR<C1661140tKS> c11pr, C09AJ<C1661050tKJ> c09aj, Effect effect) {
        c11pr.onNext(new C1661140tKS(-101, -104, effect, 0L, null, 24));
        c09aj.onNext(new C1661050tKJ(null, null, null, null, effect, -105, null, null, 207));
        c09aj.onComplete();
    }
}
