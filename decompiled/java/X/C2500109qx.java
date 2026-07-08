package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.09qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2500109qx implements IFetchEffectListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onStart$0(C2500109qx c2500109qx, Effect effect) {
    }

    public static final void onStart$1(C2500109qx c2500109qx, Effect effect) {
    }

    public static final void onStart$2(C2500109qx c2500109qx, Effect effect) {
    }

    public static final void onStart$3(C2500109qx c2500109qx, Effect effect) {
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
        }
    }

    public static final void onSuccess$0(C2500109qx c2500109qx, Object obj) {
        if (!((C09AJ) c2500109qx.l0).isDisposed()) {
            ((C09AJ) c2500109qx.l0).onNext((Effect) c2500109qx.l1);
        }
    }

    public static final void onSuccess$1(C2500109qx c2500109qx, Object obj) {
        AbstractC2293808ym abstractC2293808ym = (AbstractC2293808ym) c2500109qx.l0;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2500109qx.l1;
        abstractC2293808ym.getClass();
        AbstractC2293808ym.LJI(obj, interfaceC20236714Gf);
    }

    public static final void onSuccess$2(C2500109qx c2500109qx, Object obj) {
        Effect effect = (Effect) obj;
        C013C c013c = (C013C) c2500109qx.l0;
        if (!c013c.element) {
            c013c.element = true;
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500109qx.l1;
            String unzipPath = effect.getUnzipPath();
            C189200o6.m2constructorimpl(unzipPath);
            interfaceC1364105Vn.resumeWith(unzipPath);
            return;
        }
        C805380Via.LIZJ(new Exception("downloadEffect already resumed"), "downloadEffect already resumed");
    }

    public static final void onSuccess$3(C2500109qx c2500109qx, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2500109qx.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }

    public C2500109qx(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFail$0(C2500109qx c2500109qx, Effect effect, ExceptionResult exceptionResult) {
        if (((C09AJ) c2500109qx.l0).isDisposed()) {
            return;
        }
        ((C09AJ) c2500109qx.l0).onError(new Exception("Cannot download head effect"));
    }

    public static final void onFail$1(C2500109qx c2500109qx, Effect effect, ExceptionResult exceptionResult) {
        AbstractC2293808ym abstractC2293808ym = (AbstractC2293808ym) c2500109qx.l0;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2500109qx.l1;
        abstractC2293808ym.getClass();
        AbstractC2293808ym.LJI(null, interfaceC20236714Gf);
    }

    public static final void onFail$2(C2500109qx c2500109qx, Effect effect, ExceptionResult exceptionResult) {
        C013C c013c = (C013C) c2500109qx.l0;
        if (!c013c.element) {
            c013c.element = true;
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500109qx.l1;
            C098200Yq c098200Yq = new C098200Yq(new Throwable("download effect failed", exceptionResult.getException()));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
            return;
        }
        C805380Via.LIZJ(new Exception("downloadEffect already resumed"), "downloadEffect already resumed");
    }

    public static final void onFail$3(C2500109qx c2500109qx, Effect effect, ExceptionResult exceptionResult) {
        ((C2278308wH) c2500109qx.l1).onFail(exceptionResult);
    }
}
