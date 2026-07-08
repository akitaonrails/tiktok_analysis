package X;

import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H4R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem$bindTitleText$1$3$1$1", f = "LiveNotificationItem.kt", l = {}, m = "invokeSuspend")
public final class C0H4R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveNotificationItem LL;
    public final /* synthetic */ CharSequence LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H4R(LiveNotificationItem liveNotificationItem, CharSequence charSequence, InterfaceC1364105Vn<? super C0H4R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveNotificationItem;
        this.LLILLJJLI = charSequence;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H4R(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotificationItem@bfb8.bindTitleText$1$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.I5().setText(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotificationItem@bfb8.bindTitleText$1$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
