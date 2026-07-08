package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198130hHf extends C09AY implements Function1<C1198080hHa, C1198080hHa> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198130hHf(String str, int i, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1198080hHa invoke(C1198080hHa c1198080hHa) {
        return C1198080hHa.LIZ(c1198080hHa, null, new C1198120hHe(), this.LL, Integer.valueOf(this.LLILLJJLI), this.LLILLL, 1);
    }
}
