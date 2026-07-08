package X;

import com.bytedance.incentive.taskevent.watchvideo.WatchVideoServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899070zWD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1896810zSZ LL;
    public final /* synthetic */ WatchVideoServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899070zWD(C1896810zSZ c1896810zSZ, WatchVideoServiceImpl watchVideoServiceImpl) {
        super(0);
        this.LL = c1896810zSZ;
        this.LLILLJJLI = watchVideoServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        WatchVideoServiceImpl watchVideoServiceImpl = this.LLILLJJLI;
        watchVideoServiceImpl.LIZIZ = this.LL;
        watchVideoServiceImpl.LIZJ = EnumC586670Mzh.PLAYING;
        if (!((ArrayList) watchVideoServiceImpl.LIZLLL).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLILLJJLI.LIZLLL).iterator();
            while (it2.hasNext()) {
                ((AbstractC1899280zWY) it2.next()).LJIILLIIL(this.LL);
            }
        }
        return Unit.LIZ;
    }
}
