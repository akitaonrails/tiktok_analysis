package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.smbstate.SmbStateServiceFactory$createSmbStateService$1$1$qualificationFetcher$1", f = "SmbStateServiceFactory.kt", l = {95}, m = "invokeSuspend")
public final class C1122180fJA extends C09AX implements Function2<C1889207ac, InterfaceC1364105Vn<? super C1889207ac>, Object> {
    public int LL;
    public final /* synthetic */ PcsApi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122180fJA(PcsApi pcsApi, InterfaceC1364105Vn<? super C1122180fJA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsApi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1122180fJA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmbStateServiceFactory@cbcb.createSmbStateService$1$1$qualificationFetcher$1");
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
            C1122160fJ8 c1122160fJ8 = C1122160fJ8.LIZ;
            PcsApi pcsApi = this.LLILLJJLI;
            this.LL = 1;
            obj = c1122160fJ8.LIZ(pcsApi, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SmbStateServiceFactory@cbcb.createSmbStateService$1$1$qualificationFetcher$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SmbStateServiceFactory@cbcb.createSmbStateService$1$1$qualificationFetcher$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1889207ac c1889207ac, InterfaceC1364105Vn<? super C1889207ac> interfaceC1364105Vn) {
        return ((a) create(c1889207ac, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
