package X;

import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.avatarloader.impl.IMAvatarLoaderImpl;

/* JADX INFO: renamed from: X.04TK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TK {
    public static final /* synthetic */ C04TK LIZ = new C04TK();
    public static final IMAvatarLoaderApi LIZIZ;

    static {
        IMAvatarLoaderApi iMAvatarLoaderApi;
        Object objLIZ = C04TD.LIZ(IMAvatarLoaderApi.class, false);
        if (objLIZ != null) {
            iMAvatarLoaderApi = (IMAvatarLoaderApi) objLIZ;
        } else {
            if (C04TD.U0 == null) {
                synchronized (IMAvatarLoaderApi.class) {
                    if (C04TD.U0 == null) {
                        C04TD.U0 = new IMAvatarLoaderImpl.Service();
                    }
                }
            }
            iMAvatarLoaderApi = C04TD.U0;
        }
        LIZIZ = iMAvatarLoaderApi;
    }
}
