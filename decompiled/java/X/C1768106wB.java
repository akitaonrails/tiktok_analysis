package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

/* JADX INFO: renamed from: X.06wB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768106wB implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
            case 2:
                onFail$2(this, exceptionResult);
                break;
            case 3:
                onFail$3(this, exceptionResult);
                break;
            case 4:
                onFail$4(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                break;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                break;
            case 2:
                onSuccess$2(this, effectChannelResponse);
                break;
            case 3:
                onSuccess$3(this, effectChannelResponse);
                break;
            case 4:
                onSuccess$4(this, effectChannelResponse);
                break;
        }
    }

    public C1768106wB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(C1768106wB c1768106wB, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768106wB.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFail$1(C1768106wB c1768106wB, ExceptionResult exceptionResult) {
        if (((InterfaceC20236714Gf) c1768106wB.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1768106wB.l0;
            Boolean bool = Boolean.FALSE;
            C189200o6.m2constructorimpl(bool);
            interfaceC20236714Gf.resumeWith(bool);
        }
    }

    public static final void onFail$2(C1768106wB c1768106wB, ExceptionResult exceptionResult) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1768106wB.l0;
        C13BV c13bv = C13BV.INSTANCE;
        C189200o6.m2constructorimpl(c13bv);
        interfaceC20236714Gf.resumeWith(c13bv);
    }

    public static final void onFail$3(C1768106wB c1768106wB, ExceptionResult exceptionResult) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1768106wB.l0;
        C13BV c13bv = C13BV.INSTANCE;
        C189200o6.m2constructorimpl(c13bv);
        interfaceC20236714Gf.resumeWith(c13bv);
    }

    public static final void onFail$4(C1768106wB c1768106wB, ExceptionResult exceptionResult) {
        Exception exception;
        if (!C23118094a.LJIIIIZZ(((InterfaceC1364105Vn) c1768106wB.l0).getContext())) {
            return;
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768106wB.l0;
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        } else {
            exception = null;
        }
        C098200Yq c098200Yq = new C098200Yq(new Throwable("request watermark panel failed", exception));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
    }

    public static final void onSuccess$0(C1768106wB c1768106wB, Object obj) {
        Effect effect;
        List<Effect> allCategoryEffects;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
            effect = (Effect) C13LP.LJJJLZIJ(0, allCategoryEffects);
            if (effect != null) {
                C391040FUw c391040FUw = C391040FUw.LIZ;
                String sdkExtra = effect.getSdkExtra();
                c391040FUw.getClass();
                C391040FUw.LIZLLL(sdkExtra);
                C391040FUw.LJ(effect.getUnzipPath());
            }
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768106wB.l0;
            C189200o6.m2constructorimpl(effect);
            interfaceC1364105Vn.resumeWith(effect);
        }
        effect = null;
        C391040FUw.LIZ.getClass();
        C391040FUw.LIZLLL("");
        C391040FUw.LJ("");
        InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c1768106wB.l0;
        C189200o6.m2constructorimpl(effect);
        interfaceC1364105Vn2.resumeWith(effect);
    }

    public static final void onSuccess$1(C1768106wB c1768106wB, Object obj) {
        List<Effect> allCategoryEffects;
        Effect effect;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null && (effect = (Effect) C13LP.LJJJLZIJ(0, allCategoryEffects)) != null) {
            C391040FUw c391040FUw = C391040FUw.LIZ;
            String sdkExtra = effect.getSdkExtra();
            c391040FUw.getClass();
            C391040FUw.LIZLLL(sdkExtra);
            C391040FUw.LJ(effect.getUnzipPath());
        } else {
            C391040FUw.LIZ.getClass();
            C391040FUw.LIZLLL("");
            C391040FUw.LJ("");
        }
        if (((InterfaceC20236714Gf) c1768106wB.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1768106wB.l0;
            Boolean bool = Boolean.TRUE;
            C189200o6.m2constructorimpl(bool);
            interfaceC20236714Gf.resumeWith(bool);
        }
    }

    public static final void onSuccess$2(C1768106wB c1768106wB, Object obj) {
        List<Effect> allCategoryEffects;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1768106wB.l0;
        if (effectChannelResponse == null || (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) == null) {
            allCategoryEffects = C13BV.INSTANCE;
        }
        C189200o6.m2constructorimpl(allCategoryEffects);
        interfaceC20236714Gf.resumeWith(allCategoryEffects);
    }

    public static final void onSuccess$3(C1768106wB c1768106wB, Object obj) {
        List<Effect> allCategoryEffects;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1768106wB.l0;
        if (effectChannelResponse == null || (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) == null) {
            allCategoryEffects = C13BV.INSTANCE;
        }
        C189200o6.m2constructorimpl(allCategoryEffects);
        interfaceC20236714Gf.resumeWith(allCategoryEffects);
    }

    public static final void onSuccess$4(C1768106wB c1768106wB, Object obj) {
        List<Effect> allCategoryEffects;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        if (C23118094a.LJIIIIZZ(((InterfaceC1364105Vn) c1768106wB.l0).getContext())) {
            if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null && !allCategoryEffects.isEmpty()) {
                InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768106wB.l0;
                C189200o6.m2constructorimpl(allCategoryEffects);
                interfaceC1364105Vn.resumeWith(allCategoryEffects);
            } else {
                InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c1768106wB.l0;
                C098200Yq c098200Yq = new C098200Yq(new Throwable("watermark panel empty"));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }
        }
    }
}
