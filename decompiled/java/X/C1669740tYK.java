package X;

import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi;
import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse;
import com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0tYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageViewModel$removePassword$1", f = "NoPasskeyPageViewModel.kt", l = {122}, m = "invokeSuspend")
public final class C1669740tYK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NoPasskeyPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669740tYK(NoPasskeyPageViewModel noPasskeyPageViewModel, InterfaceC1364105Vn<? super C1669740tYK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = noPasskeyPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1669740tYK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoPasskeyPageViewModel@8b3c.removePassword$1");
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
            this.LL = 1;
            obj = RemovePasswordApi.LIZ.LIZ("leaked_credential_popup", null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NoPasskeyPageViewModel@8b3c.removePassword$1");
                return objLJFF;
            }
        }
        RemovePasswordApiResponse removePasswordApiResponse = (RemovePasswordApiResponse) obj;
        if (!Intrinsics.LJFF(removePasswordApiResponse.message, "success")) {
            if (removePasswordApiResponse.data != null) {
                this.LLILLJJLI.LL.setValue(C1669770tYN.LIZ);
            }
        } else {
            this.LLILLJJLI.LL.setValue(C1669790tYP.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoPasskeyPageViewModel@8b3c.removePassword$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
