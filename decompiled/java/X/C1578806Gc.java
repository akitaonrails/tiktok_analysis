package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.06Gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.ProviderDelegate", f = "StreakResProviderFactory.kt", l = {284, 294}, m = "unlockAnimResInfo")
public final class C1578806Gc extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public Pair LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1578606Ga LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578806Gc(C1578606Ga c1578606Ga, InterfaceC1364105Vn<? super C1578806Gc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1578606Ga;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProviderDelegate@cfaa.unlockAnimResInfo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZIL.LIZLLL(0, this);
        C1C7U.LIZIZ("ProviderDelegate@cfaa.unlockAnimResInfo$1");
        return objLIZLLL;
    }
}
