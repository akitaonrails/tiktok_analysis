package X;

import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.EffectDetailService;

/* JADX INFO: renamed from: X.0Dfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345040Dfq {
    public static final C345040Dfq LIZ = new C345040Dfq();
    public static final EffectDetailService LIZIZ;

    static {
        EffectDetailService.LIZ.getClass();
        LIZIZ = (EffectDetailService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(EffectDetailService.class);
    }
}
