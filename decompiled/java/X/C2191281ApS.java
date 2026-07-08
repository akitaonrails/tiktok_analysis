package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;

/* JADX INFO: renamed from: X.1ApS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl", f = "BaAutoMessageServiceImpl.kt", l = {217}, m = "setWelcomeMessage")
public final class C2191281ApS extends AbstractC23140094w {
    public C484210Iyp LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaAutoMessageServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191281ApS(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC1364105Vn<? super C2191281ApS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = baAutoMessageServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaAutoMessageServiceImpl@649f.setWelcomeMessage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILLIIL = this.LLILLL.LJIILLIIL(null, this);
        C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.setWelcomeMessage$1");
        return objLJIILLIIL;
    }
}
