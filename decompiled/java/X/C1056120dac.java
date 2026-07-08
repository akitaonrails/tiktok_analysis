package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0dac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.lego.EmailUploadRequest$request$1", f = "EmailUploadRequest.kt", l = {39}, m = "invokeSuspend")
public final class C1056120dac extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1056120dac(InterfaceC1364105Vn<? super C1056120dac> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056120dac(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmailUploadRequest@d365.request$1");
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
            InterfaceC1056100daa interfaceC1056100daaLJIIIZ = C1071540dzU.LIZIZ.LJIIIZ();
            int value = EnumC1056090daZ.CONTACT_BOOK_SYNCING.getValue();
            this.LL = 1;
            if (interfaceC1056100daaLJIIIZ.LIZ(value, this) == objLJFF) {
                C1C7U.LIZIZ("EmailUploadRequest@d365.request$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmailUploadRequest@d365.request$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1056120dac(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
