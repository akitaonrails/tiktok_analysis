package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakShareInfo;

/* JADX INFO: renamed from: X.06Rb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.ShareStreakUtil", f = "StreakShareUtil.kt", l = {139}, m = "preLoad")
public final class C1607306Rb extends AbstractC23140094w {
    public StreakShareInfo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06RY LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1607306Rb(C06RY c06ry, InterfaceC1364105Vn<? super C1607306Rb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c06ry;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareStreakUtil@bf84.preLoad$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("ShareStreakUtil@bf84.preLoad$1");
        return objLIZIZ;
    }
}
