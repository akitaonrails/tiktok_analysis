package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1131004bc extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1131004bc(int i, int i2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" [chunk_trace_route] inFlightParse below zero, seq=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" remain=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
