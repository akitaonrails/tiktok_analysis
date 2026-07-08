package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Noa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.tasks.ProfileNetworkLoadTask$execute$5", f = "ProfileNetworkLoadTask.kt", l = {}, m = "invokeSuspend")
public final class C605260Noa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C605350Noj LL;
    public final /* synthetic */ BulletinAccountInfoResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605260Noa(C605350Noj c605350Noj, BulletinAccountInfoResponse bulletinAccountInfoResponse, InterfaceC1364105Vn<? super C605260Noa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c605350Noj;
        this.LLILLJJLI = bulletinAccountInfoResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605260Noa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("ProfileNetworkLoadTask@84eb.execute$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<BulletinAccountInfoResponse, Unit> function1 = this.LL.LJFF;
        if (function1 != null) {
            function1.invoke(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ProfileNetworkLoadTask@84eb.execute$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
