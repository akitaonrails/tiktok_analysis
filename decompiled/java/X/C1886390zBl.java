package X;

import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredential;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApi;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApiResponse;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsData;
import com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementViewModel$getPasskeyManagementData$1$2", f = "PasskeyManagementViewModel.kt", l = {106}, m = "invokeSuspend")
public final class C1886390zBl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PasskeyManagementViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886390zBl(PasskeyManagementViewModel passkeyManagementViewModel, InterfaceC1364105Vn<? super C1886390zBl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = passkeyManagementViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1886390zBl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C1887220zD6> listWQ2;
        List<PasskeyCredential> list;
        C1C7U.LIZ("PasskeyManagementViewModel@e9dc.getPasskeyManagementData$1$2");
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
            PasskeyCredentialsApi passkeyCredentialsApi = PasskeyCredentialsApi.LIZ;
            this.LL = 1;
            obj = passkeyCredentialsApi.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PasskeyManagementViewModel@e9dc.getPasskeyManagementData$1$2");
                return objLJFF;
            }
        }
        PasskeyCredentialsApiResponse passkeyCredentialsApiResponse = (PasskeyCredentialsApiResponse) obj;
        if (!Intrinsics.LJFF(passkeyCredentialsApiResponse.message, "success")) {
            this.LLILLJJLI.setState(AFwS271S0000000_28.get$arr$(323));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PasskeyManagementViewModel@e9dc.getPasskeyManagementData$1$2");
            return unit;
        }
        PasskeyCredentialsData passkeyCredentialsData = passkeyCredentialsApiResponse.data;
        if (passkeyCredentialsData != null && (list = passkeyCredentialsData.credentials) != null) {
            listWQ2 = this.LLILLJJLI.wQ2(list);
        } else {
            listWQ2 = C13BV.INSTANCE;
        }
        this.LLILLJJLI.setState(new AwS607S0100000_28(listWQ2, (List<C1887220zD6>) 255));
        if (this.LLILLJJLI.LLILLL) {
            C1886490zBv.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
            c2344009Gk.LJIIIIZZ("enter_method", "click");
            C20684815ws.LJIILLIIL("set_passkey_show", c2344009Gk.LIZ);
            this.LLILLJJLI.LLILLL = false;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PasskeyManagementViewModel@e9dc.getPasskeyManagementData$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
