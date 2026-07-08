package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229600uc extends C09AY implements Function1<C2880019q, C2880019q> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229600uc(int i, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2880019q invoke(C2880019q c2880019q) {
        return C2880019q.LIZ(c2880019q, null, 0, null, null, new Pair(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI)), 31);
    }
}
