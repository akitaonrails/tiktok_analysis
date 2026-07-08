package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.api.SplashAdApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056790dbh extends C09AY implements Function0<SplashAdApi> {
    public C1056790dbh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.ies.ugc.aweme.commercialize.splash.api.SplashAdApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SplashAdApi invoke() {
        C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(C0D80.LIZ);
        c1499850p8J.LIZJ = true;
        return c1499850p8J.build().retrofit.LIZ(SplashAdApi.class);
    }
}
