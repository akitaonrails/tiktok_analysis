package X;

import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722840SXa extends C09AY implements Function0<IEarphonePlayerControlService> {
    public C722840SXa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IEarphonePlayerControlService invoke() {
        return ServiceManager.get().getService(IEarphonePlayerControlService.class);
    }
}
