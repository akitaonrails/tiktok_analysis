package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563790qnR extends C09AY implements Function1<C0RUS, Unit> {
    public C1563790qnR() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        C13IQ c13iqLJIIL;
        C0RUS c0rus2 = c0rus;
        IBulletinBoardService iBulletinBoardService = (IBulletinBoardService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardService.class, false, false, false, 14, null);
        if (iBulletinBoardService != null) {
            c13iqLJIIL = iBulletinBoardService.LJIIL();
        } else {
            c13iqLJIIL = null;
        }
        c0rus2.LL = c13iqLJIIL;
        return Unit.LIZ;
    }
}
