package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew$fetchNewUserData$2", f = "EcSearchSuggestViewModelNew.kt", l = {}, m = "invokeSuspend")
public final class C673220Qau extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcSearchSuggestViewModelNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673220Qau(EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew, InterfaceC1364105Vn<? super C673220Qau> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecSearchSuggestViewModelNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673220Qau(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C673220Qau.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
