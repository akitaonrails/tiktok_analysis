package X;

import com.ss.android.ugc.aweme.socialgame.impl.service.SocialGameService;

/* JADX INFO: renamed from: X.06lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialgame.impl.service.SocialGameService", f = "SocialGameService.kt", l = {115}, m = "checkIfUserEnableEasterEggForShare")
public final class C1701406lQ extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SocialGameService LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701406lQ(SocialGameService socialGameService, InterfaceC1364105Vn<? super C1701406lQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = socialGameService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialGameService@3009.checkIfUserEnableEasterEggForShare$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(null, 0, null, this);
        C1C7U.LIZIZ("SocialGameService@3009.checkIfUserEnableEasterEggForShare$1");
        return objLJII;
    }
}
