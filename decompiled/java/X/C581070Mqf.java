package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581070Mqf implements IFetchEffectListListener {
    public final int $t;
    public Object l0;

    public static final void onFail$1(C581070Mqf c581070Mqf, ExceptionResult exceptionResult) {
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
            case 4:
                onFail$4(this, exceptionResult);
                break;
            case 5:
                onFail$5(this, exceptionResult);
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
            case 4:
                onSuccess$4(this, list);
                break;
            case 5:
                onSuccess$5(this, list);
                break;
        }
    }

    public C581070Mqf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(C581070Mqf c581070Mqf, ExceptionResult exceptionResult) {
        C580680Mq2 c580680Mq2 = (C580680Mq2) c581070Mqf.l0;
        c580680Mq2.LIZJ[0] = false;
        C0FNU.LIZ(c580680Mq2.LIZLLL[0]);
        C1688680u2s.LJIIL(false, 1503);
        if (exceptionResult == null) {
            return;
        }
        exceptionResult.getException();
        ((C580680Mq2) c581070Mqf.l0).LJ.LIZLLL(exceptionResult.getException());
    }

    public static final void onFail$2(C581070Mqf c581070Mqf, ExceptionResult exceptionResult) {
        if (((C09AJ) c581070Mqf.l0).isDisposed()) {
            return;
        }
        ((C09AJ) c581070Mqf.l0).onError(exceptionResult.getException());
    }

    public static final void onFail$3(C581070Mqf c581070Mqf, ExceptionResult exceptionResult) {
        if (((C09AJ) c581070Mqf.l0).isDisposed()) {
            return;
        }
        ((C09AJ) c581070Mqf.l0).onError(exceptionResult.getException());
    }

    public static final void onFail$4(C581070Mqf c581070Mqf, ExceptionResult exceptionResult) {
        String msg;
        Exception exception;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c581070Mqf.l0;
        if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
            msg = "Download Effect Failed";
        }
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        } else {
            exception = null;
        }
        C0MP6.LIZ(new Pair(null, new C0MTS(msg, exception)), interfaceC20236714Gf);
    }

    public static final void onFail$5(C581070Mqf c581070Mqf, ExceptionResult exceptionResult) {
        String msg;
        Exception exception;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c581070Mqf.l0;
        if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
            msg = "Download Effect Failed";
        }
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        } else {
            exception = null;
        }
        C0MP6.LIZ(new Pair(null, new C0MTS(msg, exception)), interfaceC20236714Gf);
    }

    public static final void onSuccess$0(C581070Mqf c581070Mqf, Object obj) {
        List list = (List) obj;
        C580680Mq2 c580680Mq2 = (C580680Mq2) c581070Mqf.l0;
        c580680Mq2.LIZJ[0] = false;
        C0FNU.LIZ(c580680Mq2.LIZLLL[0]);
        C1688680u2s.LJIIL(false, 1503);
        if (list != null && list.size() > 0 && ListProtector.get(list, 0) != null) {
            Effect effect = (Effect) ListProtector.get(list, 0);
            C786410Ut5.LJJIJL(((C580680Mq2) c581070Mqf.l0).LJFF, "first_sticker", effect);
            if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                String strLIZ = C1629700sVk.LIZ((String) ListProtector.get(effect.getMusic(), 0));
                if (!TextUtils.isEmpty(strLIZ)) {
                    C786410Ut5.LJJJI("path", strLIZ, ((C580680Mq2) c581070Mqf.l0).LJFF);
                }
            }
            C580680Mq2 c580680Mq22 = (C580680Mq2) c581070Mqf.l0;
            c580680Mq22.LJ.LJ(c580680Mq22.LJFF);
        }
    }

    public static final void onSuccess$1(C581070Mqf c581070Mqf, Object obj) {
        Object objLJJJLL;
        List list = (List) obj;
        if (list != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
            ((Function1) c581070Mqf.l0).invoke(objLJJJLL);
        }
    }

    public static final void onSuccess$2(C581070Mqf c581070Mqf, Object obj) {
        if (!((C09AJ) c581070Mqf.l0).isDisposed()) {
            C09AJ c09aj = (C09AJ) c581070Mqf.l0;
            if (obj == null) {
                obj = C13BV.INSTANCE;
            }
            c09aj.onNext(obj);
        }
    }

    public static final void onSuccess$3(C581070Mqf c581070Mqf, Object obj) {
        if (!((C09AJ) c581070Mqf.l0).isDisposed()) {
            C09AJ c09aj = (C09AJ) c581070Mqf.l0;
            if (obj == null) {
                obj = C13BV.INSTANCE;
            }
            c09aj.onNext(obj);
        }
    }

    public static final void onSuccess$4(C581070Mqf c581070Mqf, Object obj) {
        Object objLJJJLL;
        List list = (List) obj;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c581070Mqf.l0;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        C0MP6.LIZ(new Pair(objLJJJLL, null), interfaceC20236714Gf);
    }

    public static final void onSuccess$5(C581070Mqf c581070Mqf, Object obj) {
        Object objLJJJLL;
        List list = (List) obj;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c581070Mqf.l0;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        C0MP6.LIZ(new Pair(objLJJJLL, null), interfaceC20236714Gf);
    }
}
