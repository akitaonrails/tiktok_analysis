package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581060Mqe implements IFetchEffectListener {
    public final int $t;
    public Object l0;

    public static final void onStart$0(C581060Mqe c581060Mqe, Effect effect) {
    }

    public static final void onStart$2(C581060Mqe c581060Mqe, Effect effect) {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C581060Mqe(Object obj, Function1<? super Effect, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
    }

    public static final void onStart$1(C581060Mqe c581060Mqe, Effect effect) {
        String effectId;
        C20186113yd c20186113yd = C20186113yd.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Network download started for effectId: ");
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        sbLIZ.append(effectId);
        C201955140j.LIZJ(c20186113yd, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onSuccess$0(C581060Mqe c581060Mqe, Object obj) {
        String effectId;
        Effect effect = (Effect) obj;
        C0MPQ c0mpq = C0MPQ.LIZ;
        C0MPQ.LJFF = effect;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c581060Mqe.l0;
        if (interfaceC1631620sYq != null) {
            if (effect != null) {
                effectId = effect.getEffectId();
            } else {
                effectId = null;
            }
            interfaceC1631620sYq.invoke(effectId, effect, null);
        }
    }

    public static final void onSuccess$1(C581060Mqe c581060Mqe, Object obj) {
        String unzipPath;
        String id;
        Boolean boolValueOf;
        String effectId;
        Effect effect = (Effect) obj;
        if (effect != null) {
            C20186113yd c20186113yd = C20186113yd.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Network download success for effectId: ");
            sbLIZ.append(effect.getEffectId());
            C201955140j.LIZJ(c20186113yd, C2188811AlT.LIZIZ(sbLIZ));
            C0MPQ.LIZJ.put(effect.getEffectId(), effect);
            C0MPQ.LIZ.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Saving effect to Keva and memory cache for effectId: ");
            sbLIZ2.append(effect.getEffectId());
            C201955140j.LIZJ(c20186113yd, C2188811AlT.LIZIZ(sbLIZ2));
            ((Keva) C0MPQ.LIZLLL.getValue()).storeString(effect.getEffectId(), GsonProtectorUtils.toJson(C0MPQ.LJ, effect));
            C0MPQ.LIZJ.put(effect.getEffectId(), effect);
        }
        C20186113yd c20186113yd2 = C20186113yd.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onSuccess cacheEffect path ");
        if (effect != null) {
            unzipPath = effect.getUnzipPath();
        } else {
            unzipPath = null;
        }
        sbLIZ3.append(unzipPath);
        sbLIZ3.append(" id");
        if (effect != null) {
            id = effect.getId();
        } else {
            id = null;
        }
        sbLIZ3.append(id);
        sbLIZ3.append(" isdwld ");
        if (effect != null) {
            boolValueOf = Boolean.valueOf(effect.isDownloaded());
        } else {
            boolValueOf = null;
        }
        sbLIZ3.append(boolValueOf);
        C201955140j.LIZJ(c20186113yd2, C2188811AlT.LIZIZ(sbLIZ3));
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c581060Mqe.l0;
        if (interfaceC1631620sYq != null) {
            if (effect != null) {
                effectId = effect.getEffectId();
            } else {
                effectId = null;
            }
            interfaceC1631620sYq.invoke(effectId, effect, null);
        }
    }

    public static final void onSuccess$2(C581060Mqe c581060Mqe, Object obj) {
        ((Function1) c581060Mqe.l0).invoke(obj);
    }

    public static final void onFail$0(C581060Mqe c581060Mqe, Effect effect, ExceptionResult exceptionResult) {
        String effectId;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c581060Mqe.l0;
        if (interfaceC1631620sYq != null) {
            if (effect != null) {
                effectId = effect.getEffectId();
            } else {
                effectId = null;
            }
            interfaceC1631620sYq.invoke(effectId, null, exceptionResult.getException());
        }
    }

    public static final void onFail$1(C581060Mqe c581060Mqe, Effect effect, ExceptionResult exceptionResult) {
        String effectId;
        String effectId2;
        C20186113yd c20186113yd = C20186113yd.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Network download failed for effectId: ");
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        sbLIZ.append(effectId);
        C201955140j.LJIIJ(c20186113yd, C2188811AlT.LIZIZ(sbLIZ), exceptionResult.getException());
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c581060Mqe.l0;
        if (interfaceC1631620sYq != null) {
            if (effect != null) {
                effectId2 = effect.getEffectId();
            } else {
                effectId2 = null;
            }
            interfaceC1631620sYq.invoke(effectId2, null, exceptionResult.getException());
        }
    }

    public static final void onFail$2(C581060Mqe c581060Mqe, Effect effect, ExceptionResult exceptionResult) {
        ((Function1) c581060Mqe.l0).invoke(null);
    }
}
