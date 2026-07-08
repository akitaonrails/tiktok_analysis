package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.116N, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116N extends C09AY implements Function0<StickerPropApi> {
    public C116N() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.prop.api.StickerPropApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final StickerPropApi invoke() {
        return ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(StickerPropApi.class);
    }
}
