package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0amQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948120amQ extends C09AY implements Function1<C948130amR, C948130amR> {
    public final /* synthetic */ List<C948400ams> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C948120amQ(int i, List list, int i2, int i3, int i4) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C948130amR invoke(C948130amR c948130amR) {
        boolean z;
        C948130amR c948130amR2 = c948130amR;
        C948300ami c948300ami = c948130amR2.LIZ;
        List<C948400ams> list = this.LL;
        int i = this.LLILLJJLI;
        if (this.LLILLL == 3) {
            z = true;
        } else {
            z = false;
        }
        return C948130amR.LIZ(c948130amR2, C948300ami.LIZ(c948300ami, list, i, z, this.LLILZ, false, true, 16), this.LLILZIL, 4);
    }
}
