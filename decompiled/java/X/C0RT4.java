package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RT4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RT4 extends C09AY implements Function0<ICLACaptionService> {
    public C0RT4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.ICLACaptionService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICLACaptionService invoke() {
        return ServiceManager.get().getService(ICLACaptionService.class);
    }
}
