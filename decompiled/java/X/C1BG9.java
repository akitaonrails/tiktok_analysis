package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;

/* JADX INFO: renamed from: X.1BG9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager", f = "IMContactManager.kt", l = {348, 349, 352, 362}, m = "updateLocalContact")
public final class C1BG9 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public IMUserBaseInfo LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1BG1 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BG9(C1BG1 c1bg1, InterfaceC1364105Vn<? super C1BG9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1bg1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.updateLocalContact$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJIIJZLJL = this.LLILZLL.LJJIIJZLJL(null, null, this);
        C1C7U.LIZIZ("IMContactManager@fb8a.updateLocalContact$1");
        return objLJJIIJZLJL;
    }
}
