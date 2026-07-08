package X;

import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RER, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RER extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ BaseCellTriggerComponent<? extends C03H5> LL;
    public final /* synthetic */ C0REQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RER(BaseCellTriggerComponent<? extends C03H5> baseCellTriggerComponent, C0REQ c0req) {
        super(1);
        this.LL = baseCellTriggerComponent;
        this.LLILLJJLI = c0req;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJ = this.LL;
        c0rta2.LLILZIL = C694070RKj.LIZ;
        C0REQ c0req = this.LLILLJJLI;
        c0rta2.LLJI = c0req.LIZLLL;
        c0rta2.LLJILJIL = c0req.LJ;
        for (Map.Entry<String, Object> entry : c0req.LIZJ.entrySet()) {
            c0rta2.LJFF(entry.getValue(), entry.getKey());
        }
        return Unit.LIZ;
    }
}
