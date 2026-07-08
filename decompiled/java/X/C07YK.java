package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07YK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YK extends C09AY implements Function0<String> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07YK(int i, long j, int i2, long j2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = i2;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBySizeAndCount failed with groupId:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", maxSize:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", maxCount:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", eventTtl:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('!');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
