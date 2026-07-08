package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.12Yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773712Yd implements IFetchEffectListener {
    public final int $t;
    public Object l0;

    public static final void onStart$0(C19773712Yd c19773712Yd, Effect effect) {
    }

    public static final void onStart$1(C19773712Yd c19773712Yd, Effect effect) {
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

    public C19773712Yd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onSuccess$0(C19773712Yd c19773712Yd, Object obj) {
        Effect effect = (Effect) obj;
        C119T c119t = (C119T) c19773712Yd.l0;
        if (c119t != null) {
            c119t.onSuccess(effect);
        }
    }

    public static final void onSuccess$1(C19773712Yd c19773712Yd, Object obj) {
        Effect effect = (Effect) obj;
        C119U c119u = (C119U) c19773712Yd.l0;
        if (c119u != null) {
            c119u.onSuccess(effect);
        }
    }

    public static final void onFail$0(C19773712Yd c19773712Yd, Effect effect, ExceptionResult exceptionResult) {
        C119T c119t = (C119T) c19773712Yd.l0;
        if (c119t != null) {
            c119t.LIZ(effect);
        }
    }

    public static final void onFail$1(C19773712Yd c19773712Yd, Effect effect, ExceptionResult exceptionResult) {
        C119U c119u = (C119U) c19773712Yd.l0;
        if (c119u != null) {
            c119u.LIZ(effect);
        }
    }
}
