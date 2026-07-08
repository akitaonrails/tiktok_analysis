package X;

import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718960SIc extends C09AY implements Function1<C718970SId, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C718770SHj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C718960SIc(boolean z, Aweme aweme, C718770SHj c718770SHj) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = aweme;
        this.LLILLL = c718770SHj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C718970SId c718970SId) {
        String aid;
        C718970SId c718970SId2 = c718970SId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryEllipsizeAndCalculateIncrementalInfo onResult ");
        sbLIZ.append(c718970SId2);
        sbLIZ.append(", forTrans: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" aid: ");
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        VideoDescVM videoDescVM = this.LLILLL.LLILLJJLI;
        if (this.LL) {
            videoDescVM.LLJLIL = c718970SId2;
        } else {
            videoDescVM.LLJL = c718970SId2;
        }
        return Unit.LIZ;
    }
}
