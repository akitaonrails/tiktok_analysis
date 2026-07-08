package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634200sd0 extends AbstractC1634180scy<Effect, C1634230sd3> implements InterfaceC1633020sb6 {
    @Override // X.AbstractC1634180scy
    public final Effect LJI(Effect effect, Effect effect2) {
        return effect2 != null ? effect2 : effect;
    }

    public C1634200sd0(Function0<? extends InterfaceC1635390sev> function0) {
        super(function0);
    }

    @Override // X.AbstractC1634180scy
    public final Exception LIZLLL(ExceptionResult exceptionResult) {
        return exceptionResult.getException();
    }

    @Override // X.AbstractC1634180scy
    public final C1634230sd3 LJFF(Effect effect, Effect effect2) {
        return new C1634230sd3(null, null);
    }

    @Override // X.AbstractC1634180scy
    public final C1634230sd3 LJ(Effect effect, Effect effect2, ExceptionResult exceptionResult) {
        return new C1634230sd3(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg());
    }
}
