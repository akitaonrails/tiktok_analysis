package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.13MB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13MB implements C13MA<EffectChannelResponse> {
    public final /* synthetic */ C13OY LIZ;
    public final /* synthetic */ C13MA<EffectChannelResponse> LIZIZ;

    @Override // X.C13MA
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        ((C194402113w) this.LIZ.LJI.getValue()).LIZ = effectChannelResponse2;
        C13MA<EffectChannelResponse> c13ma = this.LIZIZ;
        if (c13ma != null) {
            c13ma.onSuccess(effectChannelResponse2);
        }
    }

    @Override // X.C13MA
    public final void preProcess(EffectChannelResponse effectChannelResponse) {
        C13MA<EffectChannelResponse> c13ma = this.LIZIZ;
        if (c13ma != null) {
            c13ma.preProcess(effectChannelResponse);
        }
    }

    public C13MB(C13OY c13oy, C13MA<EffectChannelResponse> c13ma) {
        this.LIZ = c13oy;
        this.LIZIZ = c13ma;
    }

    @Override // X.C13MA
    public final void onFail(EffectChannelResponse effectChannelResponse, C1662010tLr c1662010tLr) {
        C13MA<EffectChannelResponse> c13ma = this.LIZIZ;
        if (c13ma != null) {
            c13ma.onFail(effectChannelResponse, c1662010tLr);
        }
    }
}
