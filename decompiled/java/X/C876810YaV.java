package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876810YaV extends C09AY implements Function0<IIMMsgUtilService> {
    public C876810YaV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.utils.IIMMsgUtilService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMMsgUtilService invoke() {
        return ServiceManager.get().getService(IIMMsgUtilService.class);
    }
}
