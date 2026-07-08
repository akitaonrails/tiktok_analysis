package X;

/* JADX INFO: renamed from: X.0v0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.memory.MemoryTrack", f = "MemoryTrack.kt", l = {51}, m = "getMemoryStatusAsync")
public final class C1725760v0g extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1725770v0h LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725760v0g(C1725770v0h c1725770v0h, InterfaceC1364105Vn<? super C1725760v0g> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1725770v0h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MemoryTrack@a4d4.getMemoryStatusAsync$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("MemoryTrack@a4d4.getMemoryStatusAsync$1");
        return objLIZ;
    }
}
