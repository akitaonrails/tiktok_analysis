package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;

/* JADX INFO: renamed from: X.1ApX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl", f = "BaAutoMessageServiceImpl.kt", l = {272, 274}, m = "getAutoReplyMessages")
public final class C2191331ApX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaAutoMessageServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191331ApX(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC1364105Vn<? super C2191331ApX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = baAutoMessageServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaAutoMessageServiceImpl@649f.getAutoReplyMessages$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(this);
        C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.getAutoReplyMessages$1");
        return objLJI;
    }
}
