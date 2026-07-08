package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.0Use, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786140Use implements IFetchEffectChannelListener {
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

    public C786140Use(C23260099m c23260099m, int i) {
        this.$t = i;
        this.l0 = c23260099m;
    }

    public static final void onFail$0(C786140Use c786140Use, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c786140Use.l0;
        C771050UMl c771050UMl = new C771050UMl(exceptionResult, null);
        C189200o6.m2constructorimpl(c771050UMl);
        interfaceC1364105Vn.resumeWith(c771050UMl);
    }

    public static final void onFail$1(C786140Use c786140Use, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c786140Use.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onSuccess$0(C786140Use c786140Use, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c786140Use.l0;
        C771050UMl c771050UMl = new C771050UMl(null, obj);
        C189200o6.m2constructorimpl(c771050UMl);
        interfaceC1364105Vn.resumeWith(c771050UMl);
    }

    public static final void onSuccess$1(C786140Use c786140Use, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c786140Use.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
    }
}
