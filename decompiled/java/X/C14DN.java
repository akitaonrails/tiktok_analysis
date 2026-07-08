package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.14DN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceDownloadHelper", f = "ReplaceDownloadHelper.kt", l = {390, 394}, m = "requestMusic")
public final class C14DN extends AbstractC23140094w {
    public Aweme LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C14DL LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14DN(C14DL c14dl, InterfaceC1364105Vn<? super C14DN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c14dl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceDownloadHelper@3470.requestMusic$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLL.LJIIIZ(null, null, null, this);
        C1C7U.LIZIZ("ReplaceDownloadHelper@3470.requestMusic$1");
        return objLJIIIZ;
    }
}
