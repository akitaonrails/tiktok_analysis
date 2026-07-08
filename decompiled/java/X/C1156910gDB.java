package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gDB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156910gDB extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156910gDB(int i, int i2, int i3, long j) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.syncLayoutHandlerItemCount FULL_REBUILD bodyHandlerCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" totalBodyItems=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" size=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" ts=");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
