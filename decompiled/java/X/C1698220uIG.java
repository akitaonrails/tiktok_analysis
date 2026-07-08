package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.model.SlideSlipLoadingController;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698220uIG implements IFetchEffectListener {
    public final int $t;
    public Object l0;

    public static final void onFail$0(C1698220uIG c1698220uIG, Effect effect, ExceptionResult exceptionResult) {
    }

    public static final void onStart$0(C1698220uIG c1698220uIG, Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, effect, exceptionResult);
                break;
            case 1:
                onFail$1(this, effect, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        switch (this.$t) {
            case 0:
                onStart$0(this, effect);
                break;
            case 1:
                onStart$1(this, effect);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effect);
                break;
            case 1:
                onSuccess$1(this, effect);
                break;
        }
    }

    public C1698220uIG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onStart$1(C1698220uIG c1698220uIG, Effect effect) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect, preload onStart: ");
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        C1628270sTR.LIZIZ("SlideSlipLoadingController", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onSuccess$0(C1698220uIG c1698220uIG, Object obj) {
        Effect effect = (Effect) obj;
        if (effect != null) {
            C1631480sYc c1631480sYc = (C1631480sYc) c1698220uIG.l0;
            c1631480sYc.LLJILLL = effect;
            c1631480sYc.W1(c1631480sYc.LLJILJILJ, effect);
            c1631480sYc.getShortVideoContext().creativeModel.mecReportModel.LIZ = "child_effect_cta";
            c1631480sYc.getShortVideoContext().enterFrom = "child_effect_cta";
            if (c1631480sYc.getShortVideoContext().shootMode == 16 && !C2176808fu.LIZ()) {
                c1631480sYc.H2(effect);
            } else {
                c1631480sYc.m3(effect);
            }
        }
    }

    public static final void onSuccess$1(C1698220uIG c1698220uIG, Object obj) {
        String name;
        Effect effect = (Effect) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect, preload on Success ");
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        C1628270sTR.LIZIZ("SlideSlipLoadingController", C2188811AlT.LIZIZ(sbLIZ));
        ((SlideSlipLoadingController) c1698220uIG.l0).LLJILJIL.onNext(Unit.LIZ);
    }

    public static final void onFail$1(C1698220uIG c1698220uIG, Effect effect, ExceptionResult exceptionResult) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect, preload onFail: ");
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append("  ");
        sbLIZ.append(exceptionResult.getMsg());
        C1628270sTR.LIZIZ("SlideSlipLoadingController", C2188811AlT.LIZIZ(sbLIZ));
    }
}
