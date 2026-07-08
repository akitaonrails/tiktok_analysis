package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import v7.o;

/* JADX INFO: renamed from: X.14dC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308014dC implements IFetchEffectListener {
    public final int $t;
    public Object l0;

    public static final void onStart$0(C20308014dC c20308014dC, Effect effect) {
    }

    public static final void onStart$1(C20308014dC c20308014dC, Effect effect) {
    }

    public static final void onStart$2(C20308014dC c20308014dC, Effect effect) {
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

    public C20308014dC(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onSuccess$0(C20308014dC c20308014dC, Object obj) {
        String unzipPath;
        Effect effect = (Effect) obj;
        IAVEffectService.OnFetchResult onFetchResult = (IAVEffectService.OnFetchResult) c20308014dC.l0;
        if (effect == null || (unzipPath = effect.getUnzipPath()) == null) {
            unzipPath = "";
        }
        onFetchResult.onResult(unzipPath);
    }

    public static final void onSuccess$1(C20308014dC c20308014dC, Object obj) {
        Effect effect = (Effect) obj;
        effect.setEffectId("123456");
        ((IDownloadCallback) c20308014dC.l0).onSuccess(effect);
    }

    public static final void onSuccess$2(C20308014dC c20308014dC, Object obj) {
        Effect effect = (Effect) obj;
        effect.setEffectId("123456");
        ((o) c20308014dC.l0).LIZJ(effect);
    }

    public static final void onFail$0(C20308014dC c20308014dC, Effect effect, ExceptionResult exceptionResult) {
        ((IAVEffectService.OnFetchResult) c20308014dC.l0).onResult("");
    }

    public static final void onFail$1(C20308014dC c20308014dC, Effect effect, ExceptionResult exceptionResult) {
        ((IDownloadCallback) c20308014dC.l0).onFail(-10, "", exceptionResult.getException());
    }

    public static final void onFail$2(C20308014dC c20308014dC, Effect effect, ExceptionResult exceptionResult) {
        Exception exception = exceptionResult.getException();
        if (exception == null) {
            exception = new Exception("download effect failed: unknown exception");
        }
        ((o) c20308014dC.l0).LIZIZ(exception);
    }
}
