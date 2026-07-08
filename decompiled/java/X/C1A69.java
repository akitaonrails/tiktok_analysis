package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1A69, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A69 extends C09AY implements Function2<Integer, String, Unit> {
    public final /* synthetic */ C1ACA LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C2344009Gk LLILLL;
    public final /* synthetic */ LivePreviewPlayerVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A69(C1ACA c1aca, long j, C2344009Gk c2344009Gk, LivePreviewPlayerVM livePreviewPlayerVM) {
        super(2);
        this.LL = c1aca;
        this.LLILLJJLI = j;
        this.LLILLL = c2344009Gk;
        this.LLILZ = livePreviewPlayerVM;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        int iIntValue = num.intValue();
        this.LL.LJJLIIIJJIZ = new Pair<>(Long.valueOf(this.LLILLJJLI), Boolean.TRUE);
        this.LLILLL.LIZJ(iIntValue, "guest_cnt");
        this.LLILLL.LJFF("multi_layout_key", str);
        this.LLILZ.EQ2(this.LLILLL);
        return Unit.LIZ;
    }
}
