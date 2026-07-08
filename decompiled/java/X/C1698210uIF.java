package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.0uIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698210uIF implements IFetchEffectChannelListener {
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

    public C1698210uIF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(C1698210uIF c1698210uIF, ExceptionResult exceptionResult) {
        Exception exception;
        MutableLiveData<C1641640sp0<EffectChannelResponse>> mutableLiveData = ((C1656880tDa) c1698210uIF.l0).LLL;
        if (mutableLiveData != null) {
            if (exceptionResult != null) {
                exception = exceptionResult.getException();
            } else {
                exception = null;
            }
            mutableLiveData.setValue(C1641640sp0.LIZ(exception));
        }
        ((C1656880tDa) c1698210uIF.l0).LLL = null;
    }

    public static final void onFail$1(C1698210uIF c1698210uIF, ExceptionResult exceptionResult) {
        ((C1638390sjl) c1698210uIF.l0).LIZ(exceptionResult);
    }

    public static final void onSuccess$0(C1698210uIF c1698210uIF, Object obj) {
        MutableLiveData<C1641640sp0<EffectChannelResponse>> mutableLiveData = ((C1656880tDa) c1698210uIF.l0).LLL;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(C1641640sp0.LIZJ(obj));
        }
    }

    public static final void onSuccess$1(C1698210uIF c1698210uIF, Object obj) {
        ((C1638390sjl) c1698210uIF.l0).LIZJ((EffectChannelResponse) obj);
    }
}
