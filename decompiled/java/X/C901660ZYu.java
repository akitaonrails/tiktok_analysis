package X;

/* JADX INFO: renamed from: X.0ZYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMVoicePreloader", f = "IMVoicePreloader.kt", l = {106}, m = "processQueue")
public final class C901660ZYu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C901600ZYo LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901660ZYu(C901600ZYo c901600ZYo, InterfaceC1364105Vn<? super C901660ZYu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c901600ZYo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMVoicePreloader@97ac.processQueue$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(this);
        C1C7U.LIZIZ("IMVoicePreloader@97ac.processQueue$1");
        return objLJIIIZ;
    }
}
