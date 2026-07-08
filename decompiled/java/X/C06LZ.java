package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06LZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06LZ extends C09AY implements Function0<IStreakService> {
    public C06LZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.streak.api.IStreakService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStreakService invoke() {
        return ServiceManager.get().getService(IStreakService.class);
    }
}
