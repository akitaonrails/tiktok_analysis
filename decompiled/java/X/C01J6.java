package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01J6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestWidget$onCreate$2$1", f = "CountDownForAllV2GuestWidget.kt", l = {}, m = "invokeSuspend")
public final class C01J6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CountdownForAllContent LL;
    public final /* synthetic */ CountDownForAllV2GuestWidget LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ User LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01J6(User user, CountDownForAllV2GuestWidget countDownForAllV2GuestWidget, String str, InterfaceC1364105Vn interfaceC1364105Vn, CountdownForAllContent countdownForAllContent) {
        super(2, interfaceC1364105Vn);
        this.LL = countdownForAllContent;
        this.LLILLJJLI = countDownForAllV2GuestWidget;
        this.LLILLL = str;
        this.LLILZ = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        CountdownForAllContent countdownForAllContent = this.LL;
        return new C01J6(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, countdownForAllContent);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CountDownForAllV2GuestWidget@fd.onCreate$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CountdownForAllContent countdownForAllContent = this.LL;
        if (countdownForAllContent != null) {
            CountDownForAllV2GuestWidget countDownForAllV2GuestWidget = this.LLILLJJLI;
            String str = this.LLILLL;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(countDownForAllV2GuestWidget), C0PEM.LIZJ, null, new C01J7(this.LLILZ, countDownForAllV2GuestWidget, str, null, countdownForAllContent), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CountDownForAllV2GuestWidget@fd.onCreate$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
