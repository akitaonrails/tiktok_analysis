package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.01WU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01WU {
    public static CreatorCaptionEditApi.ICreatorCaptionEditApi LIZ() {
        CreatorCaptionEditApi.ICreatorCaptionEditApi iCreatorCaptionEditApi = CreatorCaptionEditApi.LIZ;
        if (iCreatorCaptionEditApi != null) {
            return iCreatorCaptionEditApi;
        }
        CreatorCaptionEditApi.ICreatorCaptionEditApi iCreatorCaptionEditApi2 = (CreatorCaptionEditApi.ICreatorCaptionEditApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(CreatorCaptionEditApi.ICreatorCaptionEditApi.class);
        CreatorCaptionEditApi.LIZ = iCreatorCaptionEditApi2;
        return iCreatorCaptionEditApi2;
    }
}
