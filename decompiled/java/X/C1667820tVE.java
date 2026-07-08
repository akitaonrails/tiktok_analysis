package X;

import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi;
import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse;
import com.ss.android.ugc.aweme.account.passwordless.leaked.HasPasskeyPageViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0tVE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.leaked.HasPasskeyPageViewModel$onClickRemovePassword$1", f = "HasPasskeyPageViewModel.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1667820tVE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ HasPasskeyPageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667820tVE(HasPasskeyPageViewModel hasPasskeyPageViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = hasPasskeyPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1667820tVE(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HasPasskeyPageViewModel@b731.onClickRemovePassword$1");
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
            RemovePasswordApi removePasswordApi = RemovePasswordApi.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = removePasswordApi.LIZ("leaked_credential_popup", str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HasPasskeyPageViewModel@b731.onClickRemovePassword$1");
                return objLJFF;
            }
        }
        RemovePasswordApiResponse removePasswordApiResponse = (RemovePasswordApiResponse) obj;
        if (!Intrinsics.LJFF(removePasswordApiResponse.message, "success")) {
            C1669720tYI c1669720tYI = C1669720tYI.LIZ;
            String str2 = this.LLILLL.LLILLL;
            c1669720tYI.getClass();
            C1669720tYI.LIZJ(0, str2);
            if (removePasswordApiResponse.data != null) {
                this.LLILLL.LL.setValue(C1667810tVD.LIZ);
            }
        } else {
            C1669720tYI c1669720tYI2 = C1669720tYI.LIZ;
            String str3 = this.LLILLL.LLILLL;
            c1669720tYI2.getClass();
            C1669720tYI.LIZJ(1, str3);
            this.LLILLL.LL.setValue(C1667840tVG.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HasPasskeyPageViewModel@b731.onClickRemovePassword$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
