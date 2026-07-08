package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.0oGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466760oGw implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    public static final void onFail$1(C1466760oGw c1466760oGw, ExceptionResult exceptionResult) {
    }

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

    public C1466760oGw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(C1466760oGw c1466760oGw, ExceptionResult exceptionResult) {
        C1460830o7N c1460830o7N = C1460830o7N.LIZ;
        InterfaceC1460950o7Z interfaceC1460950o7Z = (InterfaceC1460950o7Z) c1466760oGw.l0;
        c1460830o7N.getClass();
        C1633850scR.LIZ(C0CHQ.LIZ, null).Dg("photo_editing_effects", new C1466760oGw(interfaceC1460950o7Z, 1));
    }

    public static final void onSuccess$0(C1466760oGw c1466760oGw, Object obj) {
        C1460830o7N c1460830o7N = C1460830o7N.LIZ;
        InterfaceC1460950o7Z interfaceC1460950o7Z = (InterfaceC1460950o7Z) c1466760oGw.l0;
        c1460830o7N.getClass();
        if (!C1460830o7N.LIZIZ((EffectChannelResponse) obj, interfaceC1460950o7Z)) {
            C1633850scR.LIZ(C0CHQ.LIZ, null).Dg("photo_editing_effects", new C1466760oGw((InterfaceC1460950o7Z) c1466760oGw.l0, 1));
        }
    }

    public static final void onSuccess$1(C1466760oGw c1466760oGw, Object obj) {
        C1460830o7N c1460830o7N = C1460830o7N.LIZ;
        InterfaceC1460950o7Z interfaceC1460950o7Z = (InterfaceC1460950o7Z) c1466760oGw.l0;
        c1460830o7N.getClass();
        C1460830o7N.LIZIZ((EffectChannelResponse) obj, interfaceC1460950o7Z);
    }
}
