package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2356609Lg extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ VideoSegment LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<Pair<Boolean, String>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2356609Lg(VideoSegment videoSegment, long j, C23260099m c23260099m) {
        super(2);
        this.LL = videoSegment;
        this.LLILLJJLI = j;
        this.LLILLL = c23260099m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        boolean zBooleanValue = bool.booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compress single video,input:");
        sbLIZ.append(this.LL.LJFF(false));
        sbLIZ.append(",result:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(",cost:");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLJJLI);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C2243608qg.LIZ(new Pair(Boolean.valueOf(zBooleanValue), str), this.LLILLL);
        return Unit.LIZ;
    }
}
