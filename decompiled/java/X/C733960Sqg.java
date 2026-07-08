package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733960Sqg extends C09AY implements Function0<IScreenshotService> {
    public C733960Sqg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.screenshot.IScreenshotService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IScreenshotService invoke() {
        return ServiceManager.get().getService(IScreenshotService.class);
    }
}
