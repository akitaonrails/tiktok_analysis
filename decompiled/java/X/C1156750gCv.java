package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156750gCv extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156750gCv(long j) {
        super(0);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mynaRenderCallback.onMynaFirstScreenRenderFinish mynaDrawEnd=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
