package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinSubscriberUnSubscribeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinSubscriberUnSubscribeAssem$dismissLoading$1", f = "BulletinSubscriberUnSubscribeAssem.kt", l = {}, m = "invokeSuspend")
public final class C2242208qS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinSubscriberUnSubscribeAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2242208qS(BulletinSubscriberUnSubscribeAssem bulletinSubscriberUnSubscribeAssem, InterfaceC1364105Vn<? super C2242208qS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinSubscriberUnSubscribeAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2242208qS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinSubscriberUnSubscribeAssem@22a3.dismissLoading$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.kp().setLoading(false);
        this.LL.kp().setClickable(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinSubscriberUnSubscribeAssem@22a3.dismissLoading$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
