package X;

import com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.retrofit2.Retrofit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ALC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ALC extends C09AY implements Function0<LiveEventApi> {
    public C1ALC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveEventApi invoke() {
        Retrofit hostRetrofit = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostRetrofit();
        if (hostRetrofit != null) {
            return hostRetrofit.LIZ(LiveEventApi.class);
        }
        return null;
    }
}
