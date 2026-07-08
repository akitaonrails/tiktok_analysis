package X;

import com.ss.android.ugc.aweme.account.api.AccountLookupDeviceResponse;
import com.ss.android.ugc.aweme.account.login.auth.Failed3PServiceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.Failed3PServiceViewModel$callAccountLookUpAPI$1", f = "Failed3PServiceViewModel.kt", l = {126}, m = "invokeSuspend")
public final class C2207208ko extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Failed3PServiceViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2207208ko(int i, String str, String str2, Failed3PServiceViewModel failed3PServiceViewModel, InterfaceC1364105Vn<? super C2207208ko> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = failed3PServiceViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2207208ko(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Failed3PServiceViewModel@8e10.callAccountLookUpAPI$1");
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
            C2207408kq c2207408kq = C2207408kq.LIZ;
            int i2 = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            obj = c2207408kq.LIZ(i2, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Failed3PServiceViewModel@8e10.callAccountLookUpAPI$1");
                return objLJFF;
            }
        }
        this.LLILZIL.LL.postValue((AccountLookupDeviceResponse) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Failed3PServiceViewModel@8e10.callAccountLookUpAPI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
