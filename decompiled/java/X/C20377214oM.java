package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20377214oM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<C20359414lU> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C20377014oK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20377214oM(List<C20359414lU> list, int i, long j, C20377014oK c20377014oK) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = c20377014oK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaybookTaskSwitch, playbookStep=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", step=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", taskStateId=");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LJIIIZ("PlaybookDetailHandlerV2", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.LIZIZ.LIZ(this.LLILLJJLI, this.LLILLL, this.LL);
        return Unit.LIZ;
    }
}
