package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Wr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.pipo.googlepay.pushprovisioning.EphemeralKeyProvider$createEphemeralKey$1$2", f = "TokenizeGooglePayFragment.kt", l = {}, m = "invokeSuspend")
public final class C836080Wr0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC834570WoZ LL;
    public final /* synthetic */ Exception LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836080Wr0(InterfaceC834570WoZ interfaceC834570WoZ, Exception exc, InterfaceC1364105Vn<? super C836080Wr0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC834570WoZ;
        this.LLILLJJLI = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C836080Wr0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EphemeralKeyProvider@346d.createEphemeralKey$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC834570WoZ interfaceC834570WoZ = this.LL;
        String message = this.LLILLJJLI.getMessage();
        if (message == null) {
            message = "";
        }
        ((C836600Wrq) interfaceC834570WoZ).LIZIZ(message);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EphemeralKeyProvider@346d.createEphemeralKey$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
