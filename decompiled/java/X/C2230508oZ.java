package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08oZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2230508oZ extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2230508oZ(int i, String str, long j) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Reconcile] clear(noClick) strategy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" reason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" elapsed=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
