package X;

import com.bytedance.incentive.taskevent.watchvideo.WatchVideoServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899170zWN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ WatchVideoServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899170zWN(WatchVideoServiceImpl watchVideoServiceImpl) {
        super(0);
        this.LL = watchVideoServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZJ = EnumC586670Mzh.PAUSED;
        if (!((ArrayList) r1.LIZLLL).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LL.LIZLLL).iterator();
            while (it2.hasNext()) {
                ((AbstractC1899280zWY) it2.next()).LJIIZILJ();
            }
        }
        return Unit.LIZ;
    }
}
