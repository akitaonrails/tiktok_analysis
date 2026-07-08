package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899470ZQj extends C09AY implements Function1<C899460ZQi, C899460ZQi> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C899470ZQj(String str, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C899460ZQi invoke(C899460ZQi c899460ZQi) {
        C419910GdJ c419910GdJLIZJ = c899460ZQi.LL.LIZJ();
        c419910GdJLIZJ.LIZ = this.LLILLJJLI;
        return new C899460ZQi(c419910GdJLIZJ, this.LL);
    }
}
