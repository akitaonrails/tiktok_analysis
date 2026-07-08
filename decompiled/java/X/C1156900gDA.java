package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156900gDA extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156900gDA(String str, long j) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.syncLayoutHandlerItemCount SKIP_MULTI_HANDLER_SYNC reason=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" ts=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
