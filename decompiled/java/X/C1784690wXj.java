package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784690wXj extends C09AY implements Function1<C1784660wXg, C1784660wXg> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1784660wXg LLILLL;
    public final /* synthetic */ C1781540wSe LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784690wXj(long j, String str, C1784660wXg c1784660wXg, C1781540wSe c1781540wSe) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = c1784660wXg;
        this.LLILZ = c1781540wSe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1784660wXg invoke(C1784660wXg c1784660wXg) {
        boolean z;
        boolean z2;
        C1784660wXg c1784660wXg2 = c1784660wXg;
        long j = this.LL;
        String str = this.LLILLJJLI;
        if (j != 0 && this.LLILLL.LLJILJIL.contains(Long.valueOf(j))) {
            z = true;
        } else {
            z = false;
        }
        C1781540wSe c1781540wSe = this.LLILZ;
        if (c1781540wSe != null && c1781540wSe.LJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        return C1784660wXg.LIZ(c1784660wXg2, null, null, j, str, 0, false, false, 0L, false, null, null, null, false, false, z, false, false, false, z2, false, false, false, 3915763);
    }
}
