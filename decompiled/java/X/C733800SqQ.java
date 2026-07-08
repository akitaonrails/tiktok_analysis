package X;

import com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService;
import com.ss.android.ugc.aweme.service.unlogindigg.UnLoginDiggService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733800SqQ extends C09AY implements Function0<IUnLoginDiggService> {
    public C733800SqQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IUnLoginDiggService invoke() {
        ?? LIZ = C04TD.LIZ(IUnLoginDiggService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.f118u4 == null) {
            synchronized (IUnLoginDiggService.class) {
                if (C04TD.f118u4 == null) {
                    C04TD.f118u4 = new UnLoginDiggService();
                }
            }
        }
        return C04TD.f118u4;
    }
}
