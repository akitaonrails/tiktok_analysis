package X;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J7N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7N extends C09AY implements Function1<SlimRoom, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C0J7Q LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J7N(long j, C0J7Q c0j7q, long j2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c0j7q;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SlimRoom slimRoom) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf = String.valueOf(this.LL);
        this.LLILLJJLI.LIZ(strValueOf, Long.valueOf(this.LLILLL), jCurrentTimeMillis, slimRoom);
        return Unit.LIZ;
    }
}
