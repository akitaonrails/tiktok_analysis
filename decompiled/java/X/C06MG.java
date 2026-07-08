package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.06MG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.matchedfriends.ui.MatchedFriendsFollowBanner$tryShow$9", f = "MatchedFriendsFollowBanner.kt", l = {}, m = "invokeSuspend")
public final class C06MG extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1699706l9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06MG(C1699706l9 c1699706l9, InterfaceC1364105Vn<? super C06MG> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1699706l9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06MG(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchedFriendsFollowBanner@98fd.tryShow$9");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1699706l9 c1699706l9 = this.LL;
        c1699706l9.LL.LIZ(c1699706l9);
        C1C7U.LIZIZ("MatchedFriendsFollowBanner@98fd.tryShow$9");
        return false;
    }
}
