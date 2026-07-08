package X;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sZR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631990sZR<T> implements InterfaceC1478005qU {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Effect LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ C11PR<C1661140tKS> LIZLLL;
    public final /* synthetic */ Map<String, String> LJ;

    public C1631990sZR(Context context, Effect effect, C11RK c11rk, String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = effect;
        this.LIZJ = context;
        this.LIZLLL = c11rk;
        this.LJ = map;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1661050tKJ> c09aj) {
        C1C7U.LIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2");
        if (TextUtils.isEmpty(this.LIZ)) {
            LIZ(this.LIZLLL, c09aj, this.LIZIZ, null, 8);
            C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2");
            return;
        }
        final IAVEffectService iAVEffectServiceEffectService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService();
        Effect effect = this.LIZIZ;
        if (effect == null) {
            EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(this.LIZ);
            if (effectListResponseLIZ != null) {
                LIZJ(this.LIZLLL, iAVEffectServiceEffectService, this.LIZJ, c09aj, this.LIZ, this.LJ, (Effect) C13LP.LJJJLL(effectListResponseLIZ.getData()));
                C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2");
                return;
            }
            final Context context = this.LIZJ;
            final String str = this.LIZ;
            final Map<String, String> map = this.LJ;
            final C11PR<C1661140tKS> c11pr = this.LIZLLL;
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            iAVEffectServiceEffectService.buildEffectPlatform(context, new IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex>() { // from class: X.0sZQ
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
                    InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                    if (interfaceC1635410sex2 != null) {
                        final String str2 = str;
                        final Map<String, String> map2 = map;
                        final C11PR<C1661140tKS> c11pr2 = c11pr;
                        final IAVEffectService iAVEffectService = iAVEffectServiceEffectService;
                        final Context context2 = context;
                        final C09AJ<C1661050tKJ> c09aj2 = c19482611Ke;
                        if (str2 != null) {
                            interfaceC1635410sex2.LIZ(Collections.singletonList(str2), map2, new IFetchEffectListByIdsListener() { // from class: X.0sZP
                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    C1631990sZR.LIZJ(c11pr2, iAVEffectService, context2, c09aj2, str2, map2, null);
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(EffectListResponse effectListResponse) {
                                    Effect effect2;
                                    List<Effect> data;
                                    EffectListResponse effectListResponse2 = effectListResponse;
                                    C1398060mU8.LIZIZ(str2, effectListResponse2);
                                    C11PR<C1661140tKS> c11pr3 = c11pr2;
                                    IAVEffectService iAVEffectService2 = iAVEffectService;
                                    Context context3 = context2;
                                    C09AJ<C1661050tKJ> c09aj3 = c09aj2;
                                    String str3 = str2;
                                    Map<String, String> map3 = map2;
                                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                                        effect2 = (Effect) C13LP.LJJJLL(data);
                                    } else {
                                        effect2 = null;
                                    }
                                    C1631990sZR.LIZJ(c11pr3, iAVEffectService2, context3, c09aj3, str3, map3, effect2);
                                }
                            });
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
            }, null);
        } else {
            LIZJ(this.LIZLLL, iAVEffectServiceEffectService, this.LIZJ, c09aj, this.LIZ, this.LJ, effect);
        }
        C1C7U.LIZIZ("MusicAndEffectDownload__MusicAndEffectDownloadExtensionKt@e9f6.provideEffectDownloadObservable$2");
    }

    public static final void LIZIZ(C11PR<C1661140tKS> c11pr, C09AJ<C1661050tKJ> c09aj, Effect effect, boolean z) {
        if (!z) {
            c11pr.onNext(new C1661140tKS(-106, 100, effect, 0L, null, 24));
        }
        c09aj.onNext(new C1661050tKJ(null, null, null, null, effect, 100, null, null, 207));
        c09aj.onComplete();
    }

    public static void LIZ(C11PR c11pr, C09AJ c09aj, Effect effect, ExceptionResult exceptionResult, int i) {
        ExceptionResult exceptionResult2 = exceptionResult;
        if ((i & 8) != 0) {
            exceptionResult2 = new ExceptionResult(-1);
        }
        if ((i & 16) != 0) {
            c11pr.onNext(new C1661140tKS(-106, -103, effect, 0L, exceptionResult2, 8));
        }
        c09aj.onNext(new C1661050tKJ(null, null, null, null, effect, -103, exceptionResult2, null, 143));
        c09aj.onComplete();
    }

    public static final void LIZJ(final C11PR<C1661140tKS> c11pr, final IAVEffectService iAVEffectService, Context context, final C09AJ<C1661050tKJ> c09aj, final String str, final Map<String, String> map, final Effect effect) {
        c11pr.onNext(new C1661140tKS(-101, -104, effect, 0L, null, 24));
        iAVEffectService.buildEffectPlatform(context, new IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex>() { // from class: X.0sZN
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
            public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
                InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                if (interfaceC1635410sex2 != null) {
                    Effect effect2 = effect;
                    C11PR<C1661140tKS> c11pr2 = c11pr;
                    C09AJ<C1661050tKJ> c09aj2 = c09aj;
                    IAVEffectService iAVEffectService2 = iAVEffectService;
                    String str2 = str;
                    Map<String, String> map2 = map;
                    if ((C0BN6.LIZ() == 2 || C0BN6.LIZ() == 3) && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        if (effect2 != null && effect2.getEffectType() == 1) {
                            C1631990sZR.LIZIZ(c11pr2, c09aj2, effect2, true);
                            return;
                        } else {
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1631920sZK(interfaceC1635410sex2, effect2, c11pr2, c09aj2, iAVEffectService2, str2, map2, null), 3);
                            return;
                        }
                    }
                    if (interfaceC1635410sex2.LJIIIIZZ(effect2) || (effect2 != null && effect2.getEffectType() == 1)) {
                        C1631990sZR.LIZIZ(c11pr2, c09aj2, effect2, true);
                        return;
                    }
                    C1631960sZO c1631960sZO = new C1631960sZO(c11pr2, c09aj2);
                    if (str2 != null) {
                        iAVEffectService2.fetchEffectResource(str2, true, map2, interfaceC1635410sex2, c1631960sZO);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }, null);
    }
}
