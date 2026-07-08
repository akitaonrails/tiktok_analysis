package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Iy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483750Iy5 extends C09AY implements Function1<C19323610io, C19323610io> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483750Iy5(String str, String str2, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C19323610io invoke(C19323610io c19323610io) {
        C19323610io c19323610io2 = c19323610io;
        String str = this.LL;
        if (str == null) {
            str = null;
        }
        return C19323610io.LJJIJL(c19323610io2, this.LLILLJJLI, null, false, null, null, false, false, str, this.LLILLL, false, null, false, false, 16764926);
    }
}
