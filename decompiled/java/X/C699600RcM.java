package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699600RcM extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C699600RcM(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpNodeExposureDetector --- aid: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", component: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", start detect");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
