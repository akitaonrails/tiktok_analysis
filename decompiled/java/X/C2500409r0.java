package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v7.o;

/* JADX INFO: renamed from: X.09r0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2500409r0 implements IFetchEffectListListener {
    public final int $t;
    public Object l0;

    public static final void onFail$0(C2500409r0 c2500409r0, ExceptionResult exceptionResult) {
    }

    public static final void onFail$3(C2500409r0 c2500409r0, ExceptionResult exceptionResult) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
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
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, list);
                break;
            case 1:
                onSuccess$1(this, list);
                break;
            case 2:
                onSuccess$2(this, list);
                break;
            case 3:
                onSuccess$3(this, list);
                break;
        }
    }

    public C2500409r0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$1(C2500409r0 c2500409r0, ExceptionResult exceptionResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uniformFetchList fail : ");
        sbLIZ.append(exceptionResult);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        ((o) c2500409r0.l0).LJ(null);
    }

    public static final void onFail$2(C2500409r0 c2500409r0, ExceptionResult exceptionResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uniformFetchList fail : ");
        sbLIZ.append(exceptionResult);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        ((o) c2500409r0.l0).LJ(Unit.LIZ);
    }

    public static final void onSuccess$0(C2500409r0 c2500409r0, Object obj) {
        if (obj != null) {
            ((Function1) c2500409r0.l0).invoke(obj);
        }
    }

    public static final void onSuccess$1(C2500409r0 c2500409r0, Object obj) {
        C201955140j.LJIIL("uniformFetchList onSuccess");
        ((o) c2500409r0.l0).LJ(null);
    }

    public static final void onSuccess$2(C2500409r0 c2500409r0, Object obj) {
        C201955140j.LJIIL("uniformFetchList onSuccess");
        ((o) c2500409r0.l0).LJ(Unit.LIZ);
    }

    public static final void onSuccess$3(C2500409r0 c2500409r0, Object obj) {
        if (obj != null) {
            ((Function1) c2500409r0.l0).invoke(obj);
        }
    }
}
