package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701780Rfs extends C09AY implements Function0<String> {
    public final /* synthetic */ C701370RfD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701780Rfs(C701370RfD c701370RfD) {
        super(0);
        this.LL = c701370RfD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowMark --- ");
        sbLIZ.append(this.LL.LLILZIL);
        sbLIZ.append(" -- mark.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
