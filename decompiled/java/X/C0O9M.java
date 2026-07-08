package X;

import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O9M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O9M extends C09AY implements Function0<IFavoriteService> {
    public C0O9M() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.favorites.service.IFavoriteService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IFavoriteService invoke() {
        return ServiceManager.get().getService(IFavoriteService.class);
    }
}
