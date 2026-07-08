package X;

import com.ss.android.ugc.aweme.photo.PhotoStrategyImplService;
import com.ss.android.ugc.aweme.photo.PhotoStrategyService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04W2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04W2 extends C09AY implements Function0<PhotoStrategyService> {
    public C04W2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.photo.PhotoStrategyService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PhotoStrategyService invoke() {
        ?? LIZ = C04TD.LIZ(PhotoStrategyService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.b3 == null) {
            synchronized (PhotoStrategyService.class) {
                if (C04TD.b3 == null) {
                    C04TD.b3 = new PhotoStrategyImplService();
                }
            }
        }
        return C04TD.b3;
    }
}
