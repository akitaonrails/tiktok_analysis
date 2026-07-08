package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156890gD9 extends C09AY implements Function0<String> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156890gD9(boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.newChunkData isAllComponentsReady=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" isLoadMoreChunk=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
