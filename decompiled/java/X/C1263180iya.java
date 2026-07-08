package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0iya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource$init$3$1", f = "UserCardDataSource.kt", l = {}, m = "invokeSuspend")
public final class C1263180iya extends C09AX implements InterfaceC1631620sYq<C1263210iyd, C1263460iz2, InterfaceC1364105Vn<? super Pair<? extends C1263210iyd, ? extends C1263460iz2>>, Object> {
    public /* synthetic */ C1263210iyd LL;
    public /* synthetic */ C1263460iz2 LLILLJJLI;

    public C1263180iya(InterfaceC1364105Vn<? super C1263180iya> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardDataSource@8e56.init$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(this.LL, this.LLILLJJLI);
        C1C7U.LIZIZ("UserCardDataSource@8e56.init$3$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1263210iyd c1263210iyd, C1263460iz2 c1263460iz2, InterfaceC1364105Vn<? super Pair<? extends C1263210iyd, ? extends C1263460iz2>> interfaceC1364105Vn) {
        C1263180iya c1263180iya = new C1263180iya(interfaceC1364105Vn);
        c1263180iya.LL = c1263210iyd;
        c1263180iya.LLILLJJLI = c1263460iz2;
        return c1263180iya.invokeSuspend(Unit.LIZ);
    }
}
