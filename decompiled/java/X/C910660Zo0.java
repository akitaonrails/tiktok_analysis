package X;

import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadReactionHandler;

/* JADX INFO: renamed from: X.0Zo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadReactionHandler", f = "UnreadHandler.kt", l = {148, 158, 165}, m = "getData")
public final class C910660Zo0 extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ UnreadReactionHandler LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910660Zo0(UnreadReactionHandler unreadReactionHandler, InterfaceC1364105Vn<? super C910660Zo0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = unreadReactionHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnreadReactionHandler@cf7c.getData$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objKQ1 = this.LLILZIL.kQ1(null, this);
        C1C7U.LIZIZ("UnreadReactionHandler@cf7c.getData$1");
        return objKQ1;
    }
}
