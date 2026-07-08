package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.api.StickerPropApi;

/* JADX INFO: renamed from: X.0Cer, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318950Cer {
    public static final StickerPropApi LIZ = (StickerPropApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(Api.LIZ).create(StickerPropApi.class);
}
