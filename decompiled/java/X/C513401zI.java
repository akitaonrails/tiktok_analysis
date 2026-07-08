package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.01zI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C513401zI implements IFetchEffectListListener {
    public final int $t;
    public Object l0;

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
        }
    }

    public C513401zI(C2252611DEt c2252611DEt, int i) {
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    public static final void onFail$0(C513401zI c513401zI, ExceptionResult exceptionResult) {
        if (!((InterfaceC20236714Gf) c513401zI.l0).isActive()) {
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513401zI.l0;
        C13BV c13bv = C13BV.INSTANCE;
        C189200o6.m2constructorimpl(c13bv);
        interfaceC20236714Gf.resumeWith(c13bv);
    }

    public static final void onFail$1(C513401zI c513401zI, ExceptionResult exceptionResult) {
        if (!((InterfaceC20236714Gf) c513401zI.l0).isActive()) {
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513401zI.l0;
        C13BV c13bv = C13BV.INSTANCE;
        C189200o6.m2constructorimpl(c13bv);
        interfaceC20236714Gf.resumeWith(c13bv);
    }

    public static final void onFail$2(C513401zI c513401zI, ExceptionResult exceptionResult) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513401zI.l0;
        C13BV c13bv = C13BV.INSTANCE;
        C189200o6.m2constructorimpl(c13bv);
        interfaceC20236714Gf.resumeWith(c13bv);
    }

    public static final void onSuccess$0(C513401zI c513401zI, Object obj) {
        if (((InterfaceC20236714Gf) c513401zI.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513401zI.l0;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        }
    }

    public static final void onSuccess$1(C513401zI c513401zI, Object obj) {
        if (((InterfaceC20236714Gf) c513401zI.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513401zI.l0;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        }
    }

    public static final void onSuccess$2(C513401zI c513401zI, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c513401zI.l0;
        if (obj == null) {
            obj = C13BV.INSTANCE;
        }
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }
}
