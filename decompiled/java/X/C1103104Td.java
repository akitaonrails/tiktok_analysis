package X;

import com.ss.android.ugc.aweme.ad.subpage.CommerceLandPageService;
import com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1103104Td extends C09AY implements Function0<ICommerceLandPageService> {
    public C1103104Td() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceLandPageService invoke() {
        ?? LIZ = C04TD.LIZ(ICommerceLandPageService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.LJLZ == null) {
            synchronized (ICommerceLandPageService.class) {
                if (C04TD.LJLZ == null) {
                    C04TD.LJLZ = new CommerceLandPageService();
                }
            }
        }
        return C04TD.LJLZ;
    }
}
