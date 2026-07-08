package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedCellAdaptionComponentV2;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RCM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RCM extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ BaseCellContentComponent<? extends C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RCM(BaseCellContentComponent<? extends C03H5> baseCellContentComponent) {
        super(1);
        this.LL = baseCellContentComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        String eventType;
        Class cls;
        C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqLIZ;
        C2189821An6 c2189821An6;
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.view_rootview;
        C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
        if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (C652090Phv.LJ(eventType, "")) {
            c13iqLIZ = C1ER1.LIZIZ.LLFII();
        } else {
            if (C293930Bfb.LIZIZ) {
                cls = FeedCellAdaptionComponentV2.class;
            } else {
                cls = CellAdaptionComponent.class;
            }
            c13iqLIZ = C13LE.LIZ(cls);
        }
        c0rta2.LLILLL = c13iqLIZ;
        return Unit.LIZ;
    }
}
