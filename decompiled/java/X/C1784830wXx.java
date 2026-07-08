package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784830wXx extends C09AY implements Function1<C1784660wXg, C1784660wXg> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Set<Long> LLILLJJLI;
    public final /* synthetic */ List<C1781540wSe> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ List<C1781540wSe> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784830wXx(long j, Set<Long> set, List<C1781540wSe> list, String str, boolean z, long j2, List<C1781540wSe> list2, boolean z2, boolean z3) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = set;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = j2;
        this.LLIZ = list2;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1784660wXg invoke(C1784660wXg c1784660wXg) {
        boolean z;
        C1784660wXg c1784660wXg2 = c1784660wXg;
        C1410940mou c1410940mou = C1410940mou.LIZ;
        long j = this.LL;
        if (j != 0 && this.LLILLJJLI.contains(Long.valueOf(j))) {
            z = true;
        } else {
            z = false;
        }
        List<C1781540wSe> list = this.LLILLL;
        long j2 = this.LL;
        String str = this.LLILZ;
        boolean z2 = this.LLILZIL;
        return C1784660wXg.LIZ(c1784660wXg2, c1410940mou, list, j2, str, 0, z2, false, this.LLILZLL, z2, this.LLIZ, null, this.LLILLJJLI, false, false, z, this.LLIZLLLIL, false, false, this.LLJ, false, false, false, 3880016);
    }
}
