package X;

import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.notice.FollowNoticeHelper$preload$1", f = "FollowNoticeHelper.kt", l = {}, m = "invokeSuspend")
public final class C1588710rRd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC1588650rRX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588710rRd(EnumC1588650rRX enumC1588650rRX, InterfaceC1364105Vn<? super C1588710rRd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC1588650rRX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1588710rRd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowNoticeHelper@dbf7.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1588700rRc.LIZ.getClass();
        C1588700rRc.LIZJ = null;
        C1588750rRh c1588750rRh = C1588750rRh.LIZ;
        EnumC1588720rRe enumC1588720rRe = EnumC1588720rRe.RED_DOT;
        EnumC1588650rRX enumC1588650rRX = this.LL;
        c1588750rRh.getClass();
        FollowFeedList followFeedListLIZ = C1588750rRh.LIZ(enumC1588720rRe, enumC1588650rRX);
        if (followFeedListLIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowNoticeHelper@dbf7.preload$1");
            return unit;
        }
        C1588700rRc.LIZJ = followFeedListLIZ;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FollowNoticeHelper@dbf7.preload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
