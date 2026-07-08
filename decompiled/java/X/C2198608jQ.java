package X;

import com.ss.android.ugc.aweme.dynamic.card.IMDynamicCardOpenServiceImpl;
import com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2198608jQ extends C09AY implements Function0<IIMDynamicCardOpenService> {
    public C2198608jQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.dynamic.card.api.event.IIMDynamicCardOpenService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMDynamicCardOpenService invoke() {
        ?? LIZ = C04TD.LIZ(IIMDynamicCardOpenService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.LLLZIIL == null) {
            synchronized (IIMDynamicCardOpenService.class) {
                if (C04TD.LLLZIIL == null) {
                    C04TD.LLLZIIL = new IMDynamicCardOpenServiceImpl.Service();
                }
            }
        }
        return C04TD.LLLZIIL;
    }
}
