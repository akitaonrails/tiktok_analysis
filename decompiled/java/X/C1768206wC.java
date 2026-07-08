package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.06wC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768206wC implements IFetchEffectListener {
    public final int $t;
    public Object l0;

    public static final void onStart$0(C1768206wC c1768206wC, Effect effect) {
    }

    public static final void onStart$1(C1768206wC c1768206wC, Effect effect) {
    }

    public static final void onStart$2(C1768206wC c1768206wC, Effect effect) {
    }

    public static final void onStart$3(C1768206wC c1768206wC, Effect effect) {
    }

    public static final void onStart$4(C1768206wC c1768206wC, Effect effect) {
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
        }
    }

    public C1768206wC(C23260099m c23260099m, int i) {
        this.$t = i;
        this.l0 = c23260099m;
    }

    public static final void onSuccess$0(C1768206wC c1768206wC, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onSuccess$1(C1768206wC c1768206wC, Object obj) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePoster, on fetch effect success: response = ");
        sbLIZ.append(obj);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
    }

    public static final void onSuccess$2(C1768206wC c1768206wC, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C443120HZe c443120HZe = new C443120HZe(obj, 0, null);
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC1364105Vn.resumeWith(c443120HZe);
    }

    public static final void onSuccess$3(C1768206wC c1768206wC, Object obj) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePoster, on fetch effect success: response = ");
        sbLIZ.append(obj);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
    }

    public static final void onSuccess$4(C1768206wC c1768206wC, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void onFail$0(C1768206wC c1768206wC, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C189200o6.m2constructorimpl(exceptionResult);
        interfaceC1364105Vn.resumeWith(exceptionResult);
    }

    public static final void onFail$1(C1768206wC c1768206wC, Effect effect, ExceptionResult exceptionResult) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePoster, on fetch effect fail, e = ");
        sbLIZ.append(exceptionResult);
        sbLIZ.append(' ');
        C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFail$2(C1768206wC c1768206wC, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C443120HZe c443120HZe = new C443120HZe(null, Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg());
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC1364105Vn.resumeWith(c443120HZe);
    }

    public static final void onFail$3(C1768206wC c1768206wC, Effect effect, ExceptionResult exceptionResult) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePoster, on fetch effect fail, e = ");
        sbLIZ.append(exceptionResult);
        sbLIZ.append(' ');
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFail$4(C1768206wC c1768206wC, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768206wC.l0;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }
}
