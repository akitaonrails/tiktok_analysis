package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10IE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IE extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10IE(int i, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Freq] onShown strategy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" aid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" sentToday=");
        sbLIZ.append(C10ID.LJII());
        sbLIZ.append(" sentThisWeek=");
        sbLIZ.append(C10ID.LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
