package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438250HGl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438250HGl(Map<String, String> map, long j) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(this.LL);
        c2344009Gk.LJIIIIZZ("is_source_panel", "1");
        c2344009Gk.LIZLLL(this.LLILLJJLI, "duration");
        C20684815ws.LJIILLIIL("search_card_stay_duration", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
