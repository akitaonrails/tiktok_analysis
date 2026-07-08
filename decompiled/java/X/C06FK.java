package X;

import com.ss.android.ugc.aweme.im.streak.impl.StreakService;

/* JADX INFO: renamed from: X.06FK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.StreakService", f = "StreakService.kt", l = {472, 498}, m = "getUnlockAnimResInfo")
public final class C06FK extends AbstractC23140094w {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StreakService LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06FK(StreakService streakService, InterfaceC1364105Vn<? super C06FK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = streakService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakService@8411.getUnlockAnimResInfo$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objT = this.LLILZ.T(null, null, this);
        C1C7U.LIZIZ("StreakService@8411.getUnlockAnimResInfo$1");
        return objT;
    }
}
