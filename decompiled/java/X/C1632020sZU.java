package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632020sZU<T> implements InterfaceC1478005qU {
    public final /* synthetic */ Effect LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ IAVEffectService LIZJ;
    public final /* synthetic */ Context LIZLLL;
    public final /* synthetic */ C11PR<C1661140tKS> LJ;
    public final /* synthetic */ Map<String, String> LJFF;

    public C1632020sZU(Effect effect, String str, IAVEffectService iAVEffectService, Context context, C11RK c11rk, Map map) {
        this.LIZ = effect;
        this.LIZIZ = str;
        this.LIZJ = iAVEffectService;
        this.LIZLLL = context;
        this.LJ = c11rk;
        this.LJFF = map;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1661050tKJ> c09aj) {
        C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$1");
        Effect effect = this.LIZ;
        if (effect == null) {
            String str = this.LIZIZ;
            if (str != null && !a0.LJJJIL(str)) {
                EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(this.LIZIZ);
                if (effectListResponseLIZ != null) {
                    LIZ((Effect) C13LP.LJJJLL(effectListResponseLIZ.getData()), c09aj, this.LJ, this.LIZIZ);
                    C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$1");
                    return;
                }
                IAVEffectService iAVEffectService = this.LIZJ;
                if (iAVEffectService != null) {
                    Context context = this.LIZLLL;
                    final String str2 = this.LIZIZ;
                    final Map<String, String> map = this.LJFF;
                    final C11PR<C1661140tKS> c11pr = this.LJ;
                    final Effect effect2 = this.LIZ;
                    final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    iAVEffectService.buildEffectPlatform(context, new IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex>() { // from class: X.0sZW
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
                            InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                            if (interfaceC1635410sex2 != null) {
                                final String str3 = str2;
                                Map<String, String> map2 = map;
                                final C11PR<C1661140tKS> c11pr2 = c11pr;
                                final C09AJ<C1661050tKJ> c09aj2 = c19482611Ke;
                                final Effect effect3 = effect2;
                                interfaceC1635410sex2.LIZ(Collections.singletonList(str3), map2, new IFetchEffectListByIdsListener() { // from class: X.0sZV
                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                                    public final void onFail(ExceptionResult exceptionResult) {
                                        c09aj2.onNext(new C1661050tKJ(null, null, null, null, effect3, -103, exceptionResult, null, 143));
                                        c09aj2.onComplete();
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                    public final void onSuccess(EffectListResponse effectListResponse) {
                                        Effect effect4;
                                        List<Effect> data;
                                        EffectListResponse effectListResponse2 = effectListResponse;
                                        C1398060mU8.LIZIZ(str3, effectListResponse2);
                                        C11PR<C1661140tKS> c11pr3 = c11pr2;
                                        C09AJ<C1661050tKJ> c09aj3 = c09aj2;
                                        String str4 = str3;
                                        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                                            effect4 = (Effect) C13LP.LJJJLL(data);
                                        } else {
                                            effect4 = null;
                                        }
                                        C1632020sZU.LIZ(effect4, c09aj3, c11pr3, str4);
                                    }
                                });
                            }
                        }
                    }, null);
                }
            } else {
                c09aj.onNext(new C1661050tKJ(null, null, null, null, this.LIZ, -103, new ExceptionResult(-1), null, 143));
                c09aj.onComplete();
                C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$1");
                return;
            }
        } else {
            LIZ(effect, c09aj, this.LJ, this.LIZIZ);
        }
        C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$1");
    }

    public static final void LIZ(Effect effect, C09AJ c09aj, C11PR c11pr, String str) {
        if (!((Boolean) C268090Af1.LIZ.getValue()).booleanValue()) {
            c11pr.onNext(new C1661140tKS(-106, 100, effect, 0L, null, 24));
        }
        c09aj.onNext(new C1661050tKJ(null, null, null, null, effect, 100, null, null, 207));
        c09aj.onComplete();
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[lazyEffect]fetch list result, effectId: ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ));
    }
}
