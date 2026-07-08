package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01zH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C513301zH implements IFetchEffectListener {
    public final int $t;
    public Object l0;

    public static final void onStart$0(C513301zH c513301zH, Effect effect) {
    }

    public static final void onStart$1(C513301zH c513301zH, Effect effect) {
    }

    public static final void onStart$2(C513301zH c513301zH, Effect effect) {
    }

    public static final void onStart$3(C513301zH c513301zH, Effect effect) {
    }

    public static final void onStart$4(C513301zH c513301zH, Effect effect) {
    }

    public static final void onStart$5(C513301zH c513301zH, Effect effect) {
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
            case 2:
                onFail$2(this, effect, exceptionResult);
                break;
            case 3:
                onFail$3(this, effect, exceptionResult);
                break;
            case 4:
                onFail$4(this, effect, exceptionResult);
                break;
            case 5:
                onFail$5(this, effect, exceptionResult);
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
            case 2:
                onStart$2(this, effect);
                break;
            case 3:
                onStart$3(this, effect);
                break;
            case 4:
                onStart$4(this, effect);
                break;
            case 5:
                onStart$5(this, effect);
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
            case 2:
                onSuccess$2(this, effect);
                break;
            case 3:
                onSuccess$3(this, effect);
                break;
            case 4:
                onSuccess$4(this, effect);
                break;
            case 5:
                onSuccess$5(this, effect);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C513301zH(Object obj, InterfaceC20236714Gf<? super Effect> interfaceC20236714Gf) {
        this.$t = interfaceC20236714Gf;
        this.l0 = obj;
    }

    public static final void onSuccess$0(C513301zH c513301zH, Object obj) {
        if (((InterfaceC20236714Gf) c513301zH.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        }
    }

    public static final void onSuccess$1(C513301zH c513301zH, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c513301zH.l0;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void onSuccess$2(C513301zH c513301zH, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c513301zH.l0;
        C189200o6.m2constructorimpl(obj);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
    }

    public static final void onSuccess$3(C513301zH c513301zH, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }

    public static final void onSuccess$4(C513301zH c513301zH, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }

    public static final void onSuccess$5(C513301zH c513301zH, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }

    public static final void onFail$0(C513301zH c513301zH, Effect effect, ExceptionResult exceptionResult) {
        String effectId;
        if (((InterfaceC20236714Gf) c513301zH.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
            Exception exception = exceptionResult.getException();
            if (exception == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Fetch effect failed for ");
                if (effect != null) {
                    effectId = effect.getEffectId();
                } else {
                    effectId = null;
                }
                sbLIZ.append(effectId);
                exception = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
            C098200Yq c098200Yq = new C098200Yq(exception);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
        }
    }

    public static final void onFail$1(C513301zH c513301zH, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c513301zH.l0;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void onFail$2(C513301zH c513301zH, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c513301zH.l0;
        Exception exception = exceptionResult.getException();
        if (exception == null) {
            exception = new RuntimeException("unknown error");
        }
        C098200Yq c098200Yq = new C098200Yq(exception);
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
    }

    public static final void onFail$3(C513301zH c513301zH, Effect effect, ExceptionResult exceptionResult) {
        String effectId;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
        Unit unit = null;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadEffect effect:");
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        sbLIZ.append(effectId);
        sbLIZ.append(' ');
        if (exceptionResult.getException() != null) {
            unit = Unit.LIZ;
        }
        sbLIZ.append(unit);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onFail$4(C513301zH c513301zH, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFail$5(C513301zH c513301zH, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513301zH.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }
}
