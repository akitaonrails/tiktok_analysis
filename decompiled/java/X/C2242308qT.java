package X;

import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinSubscriberUnSubscribeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinSubscriberUnSubscribeAssem$buildView$legalStr$1", f = "BulletinSubscriberUnSubscribeAssem.kt", l = {}, m = "invokeSuspend")
public final class C2242308qT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinSubscriberUnSubscribeAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2242308qT(BulletinSubscriberUnSubscribeAssem bulletinSubscriberUnSubscribeAssem, InterfaceC1364105Vn<? super C2242308qT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinSubscriberUnSubscribeAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2242308qT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BulletinSubscriberUnSubscribeAssem@22a3.buildView$legalStr$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C472201se c472201se = C472201se.LIZ;
        C0OLV c0olvHh2 = this.LL.Hh2();
        if (c0olvHh2 == null || (str = c0olvHh2.LL) == null) {
            str = "";
        }
        c472201se.getClass();
        C472201se.LIZ().storeBoolean(str, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinSubscriberUnSubscribeAssem@22a3.buildView$legalStr$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
