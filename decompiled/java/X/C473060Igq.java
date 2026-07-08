package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Igq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.LiveShareLinkManager$updateShareInfoToLive$1$1$1", f = "LiveShareLinkManager.kt", l = {}, m = "invokeSuspend")
public final class C473060Igq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Pair<Long, InterfaceC473070Igr> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ C1378280lyE LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C473060Igq(Pair<Long, ? extends InterfaceC473070Igr> pair, long j, User user, C1378280lyE c1378280lyE, InterfaceC1364105Vn<? super C473060Igq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pair;
        this.LLILLJJLI = j;
        this.LLILLL = user;
        this.LLILZ = c1378280lyE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C473060Igq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveShareLinkManager@7817.updateShareInfoToLive$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getSecond().LIZ(this.LLILLL);
        this.LLILZ.LIZIZ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveShareLinkManager@7817.updateShareInfoToLive$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
