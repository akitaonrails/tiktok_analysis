package X;

import com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutFragment$onEvent$1", f = "GiftCardCheckoutFragment.kt", l = {242}, m = "invokeSuspend")
public final class C1712380uf6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GiftCardCheckoutFragment LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1712380uf6(GiftCardCheckoutFragment giftCardCheckoutFragment, String str, String str2, InterfaceC1364105Vn<? super C1712380uf6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = giftCardCheckoutFragment;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1712380uf6 c1712380uf6 = new C1712380uf6(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1712380uf6.LLILLJJLI = obj;
        return c1712380uf6;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712380uf6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
