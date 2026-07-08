package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DBSource$clearDBUserFeeds$2$1", f = "FriendsV3DBSource.kt", l = {199}, m = "invokeSuspend")
public final class C804840Vhi extends C09AX implements Function2<C0VM7, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C804840Vhi(String str, InterfaceC1364105Vn<? super C804840Vhi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C804840Vhi c804840Vhi = new C804840Vhi(this.LLILLL, interfaceC1364105Vn);
        c804840Vhi.LLILLJJLI = obj;
        return c804840Vhi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3DBSource@5913.clearDBUserFeeds$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0VM7 c0vm7 = (C0VM7) this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            if (c0vm7.LIZ(str, this) == objLJFF) {
                C1C7U.LIZIZ("FriendsV3DBSource@5913.clearDBUserFeeds$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3DBSource@5913.clearDBUserFeeds$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0VM7 c0vm7, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0vm7, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
