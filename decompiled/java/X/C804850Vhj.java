package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vhj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DBSource$clearDBUserFeeds$2", f = "FriendsV3DBSource.kt", l = {198}, m = "invokeSuspend")
public final class C804850Vhj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C804850Vhj(String str, InterfaceC1364105Vn<? super C804850Vhj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C804850Vhj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3DBSource@5913.clearDBUserFeeds$2");
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
            C806500VkO c806500VkO = C806500VkO.LIZ;
            c806500VkO.getClass();
            C0VM7 c0vm7 = (C0VM7) C806500VkO.LIZLLL.getValue();
            C804840Vhi c804840Vhi = new C804840Vhi(this.LLILLJJLI, null);
            this.LL = 1;
            obj = c806500VkO.LIZIZ(c0vm7, c804840Vhi, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FriendsV3DBSource@5913.clearDBUserFeeds$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FriendsV3DBSource@5913.clearDBUserFeeds$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
