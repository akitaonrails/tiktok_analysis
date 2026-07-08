package X;

/* JADX INFO: renamed from: X.0ODl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.api.highlight.GetNewReleasedListQuery", f = "GetNewReleasedListQuery.kt", l = {15}, m = "operate")
public final class C615830ODl extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C615810ODj LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615830ODl(C615810ODj c615810ODj, InterfaceC1364105Vn<? super C615830ODl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c615810ODj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetNewReleasedListQuery@b635.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("GetNewReleasedListQuery@b635.operate$1");
        return objLIZIZ;
    }
}
