package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NDU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NDU(List list, C118300cf c118300cf) {
        super(0);
        this.LL = c118300cf;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0NDV.LIZ.getClass();
        C0NDV.LJIIL();
        this.LL.element = C0NDV.LJII().LIZLLL(this.LLILLJJLI);
        if (C797930VRv.LIZ()) {
            C0NDV.LJIIJJI("deleteAllFeedPBRecordExceptAidList", this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
