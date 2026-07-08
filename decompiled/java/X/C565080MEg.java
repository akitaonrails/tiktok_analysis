package X;

/* JADX INFO: renamed from: X.0MEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.AILiveService", f = "AILiveService.kt", l = {234}, m = "translateAnchorText")
public final class C565080MEg extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C565060MEe LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C565080MEg(C565060MEe c565060MEe, InterfaceC1364105Vn<? super C565080MEg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c565060MEe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveService@d7b2.translateAnchorText$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objTranslateAnchorText = this.LLILLL.translateAnchorText(null, this);
        C1C7U.LIZIZ("AILiveService@d7b2.translateAnchorText$1");
        return objTranslateAnchorText;
    }
}
