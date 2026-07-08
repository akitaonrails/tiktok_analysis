package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VWX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VWX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL = "metric_type_default";
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Map<String, Object>> LLILLL;
    public final /* synthetic */ Function0<Map<String, Object>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VWX(String str, C0N3U c0n3u, C0N3V c0n3v) {
        super(0);
        this.LLILLJJLI = str;
        this.LLILLL = c0n3u;
        this.LLILZ = c0n3v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL;
        if (Intrinsics.LJFF(str, "metric_type_default")) {
            C799020VWa.LIZLLL(new C213900s5(((InterfaceC799110VWj) C0VWW.LIZIZ.getValue()).LIZ(this.LLILLJJLI), this.LLILLL, this.LLILZ));
        } else if (Intrinsics.LJFF(str, "metric_type_latency_common")) {
            C799020VWa.LIZLLL(new C213900s5(((InterfaceC799110VWj) C0VWW.LIZJ.getValue()).LIZ(this.LLILLJJLI), this.LLILLL, this.LLILZ));
        } else {
            C799020VWa.LIZLLL(new C213900s5(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        }
        return Unit.LIZ;
    }
}
