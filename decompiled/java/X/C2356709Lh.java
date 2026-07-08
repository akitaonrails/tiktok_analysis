package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2356709Lh extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ C0L7R LL;
    public final /* synthetic */ VideoSegment LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<Pair<Boolean, String>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2356709Lh(C0L7R c0l7r, VideoSegment videoSegment, long j, C23260099m c23260099m) {
        super(2);
        this.LL = c0l7r;
        this.LLILLJJLI = videoSegment;
        this.LLILLL = j;
        this.LLILZ = c23260099m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        boolean zBooleanValue = bool.booleanValue();
        C0L7R c0l7r = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compress single video,input:");
        sbLIZ.append(this.LLILLJJLI.LJFF(false));
        sbLIZ.append(",result:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(",cost:");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c0l7r.getClass();
        C0L7R.LJJII(strLIZIZ);
        C2243608qg.LIZ(new Pair(Boolean.valueOf(zBooleanValue), str), this.LLILZ);
        return Unit.LIZ;
    }
}
