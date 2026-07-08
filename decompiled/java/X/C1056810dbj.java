package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.api.SplashAdApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056810dbj extends C09AY implements Function0<SplashAdApi> {
    public C1056810dbj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.ies.ugc.aweme.commercialize.splash.api.SplashAdApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SplashAdApi invoke() {
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0D80.LIZ);
        if (interfaceC2661011fLIZ != null) {
            return interfaceC2661011fLIZ.create(SplashAdApi.class);
        }
        return null;
    }
}
