package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMemberUtil$fetchUserInfo$2$1", f = "GroupMemberUtil.kt", l = {}, m = "invokeSuspend")
public final class C05QQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<C1462005nu> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QQ(String str, List<C1462005nu> list, InterfaceC1364105Vn<? super C05QQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupMemberUtil@7ee8.fetchUserInfo$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1461005nk c1461005nk = C1461005nk.LIZ;
        C05QT c05qt = C05QT.FETCH_USER_INFO;
        String str = this.LL;
        List<C1462005nu> list = this.LLILLJJLI;
        c1461005nk.getClass();
        C1461005nk.LJIIJ(c05qt, str, list);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchUserInfo$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
