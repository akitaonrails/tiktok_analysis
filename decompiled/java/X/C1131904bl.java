package X;

import com.ss.android.ugc.aweme.follow.widget.FollowWidgetServiceImpl;
import com.ss.android.ugc.aweme.live.assem.IFollowWidgetService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1131904bl extends C09AY implements Function1<C0RUS, Unit> {
    public C1131904bl() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        IFollowWidgetService iFollowWidgetService;
        C0RUS c0rus2 = c0rus;
        Object objLIZ = C04TD.LIZ(IFollowWidgetService.class, false);
        if (objLIZ != null) {
            iFollowWidgetService = (IFollowWidgetService) objLIZ;
        } else {
            if (C04TD.D0 == null) {
                synchronized (IFollowWidgetService.class) {
                    if (C04TD.D0 == null) {
                        C04TD.D0 = new FollowWidgetServiceImpl();
                    }
                }
            }
            iFollowWidgetService = C04TD.D0;
        }
        c0rus2.LL = iFollowWidgetService.LIZ();
        return Unit.LIZ;
    }
}
