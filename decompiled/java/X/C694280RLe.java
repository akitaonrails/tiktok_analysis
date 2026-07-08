package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694280RLe extends C09AY implements Function1<C0RUD, Unit> {
    public final /* synthetic */ C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C694280RLe(C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUD c0rud) {
        C0RUD c0rud2 = c0rud;
        c0rud2.LLJI = R.id.inv;
        c0rud2.LLILLL = this.LL;
        c0rud2.LLJILJILJ = new ComponentStrategy("full_container_vhs_overlay", C0CMJ.HIGH_PRIORITY.getType(), EnumC695670RQn.FIRST_VIDEO_SHOW.getMode(), null, false, false);
        return Unit.LIZ;
    }
}
