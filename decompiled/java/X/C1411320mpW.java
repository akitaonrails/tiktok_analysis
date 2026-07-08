package X;

import com.ss.android.ugc.aweme.component.phone.PhoneNumberVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS23S2000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0mpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.phone.PhoneNumberVM$onDataError$2", f = "PhoneNumberVM.kt", l = {}, m = "invokeSuspend")
public final class C1411320mpW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhoneNumberVM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411320mpW(PhoneNumberVM phoneNumberVM, String str, String str2, InterfaceC1364105Vn<? super C1411320mpW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = phoneNumberVM;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411320mpW(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhoneNumberVM@a690.onDataError$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS23S2000000_26(this.LLILLJJLI, this.LLILLL, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhoneNumberVM@a690.onDataError$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
