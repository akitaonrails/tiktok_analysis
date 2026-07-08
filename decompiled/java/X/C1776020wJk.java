package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.0wJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776020wJk implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                break;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                break;
        }
    }

    public C1776020wJk(C2252611DEt c2252611DEt, int i) {
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    public static final void onFail$0(C1776020wJk c1776020wJk, ExceptionResult exceptionResult) {
        Integer numValueOf;
        String msg;
        Exception exception;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchEffectList onFail, code ");
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", msg ");
        if (exceptionResult != null) {
            msg = exceptionResult.getMsg();
        } else {
            msg = null;
        }
        sbLIZ.append(msg);
        sbLIZ.append(", exception ");
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        } else {
            exception = null;
        }
        sbLIZ.append(exception);
        C1706630uVp.LJFF("DefaultResourceProvider", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776020wJk.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFail$1(C1776020wJk c1776020wJk, ExceptionResult exceptionResult) {
        Integer numValueOf;
        String msg;
        Exception exception;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchEffectListFromCache onFail, code ");
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", msg ");
        if (exceptionResult != null) {
            msg = exceptionResult.getMsg();
        } else {
            msg = null;
        }
        sbLIZ.append(msg);
        sbLIZ.append(", exception ");
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        } else {
            exception = null;
        }
        sbLIZ.append(exception);
        C1706630uVp.LIZJ("DefaultResourceProvider", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776020wJk.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onSuccess$0(C1776020wJk c1776020wJk, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776020wJk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }

    public static final void onSuccess$1(C1776020wJk c1776020wJk, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1776020wJk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }
}
