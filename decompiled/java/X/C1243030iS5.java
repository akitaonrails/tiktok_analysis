package X;

import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;
import com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.SentInvitePageViewModel$resendInvite$1$1", f = "SentInvitePageViewModel.kt", l = {93}, m = "invokeSuspend")
public final class C1243030iS5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SentInvitePageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243030iS5(String str, SentInvitePageViewModel sentInvitePageViewModel, InterfaceC1364105Vn<? super C1243030iS5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = sentInvitePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243030iS5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        k kVarLJJIIZ;
        Integer numValueOf;
        C1C7U.LIZ("SentInvitePageViewModel@7b52.resendInvite$1$1");
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
            ManageOrgPermissionsApi manageOrgPermissionsApi = ManageOrgPermissionsApi.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = manageOrgPermissionsApi.LJI(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SentInvitePageViewModel@7b52.resendInvite$1$1");
                return objLJFF;
            }
        }
        ManageOrgPermissionsApi.DefaultResponse defaultResponse = (ManageOrgPermissionsApi.DefaultResponse) obj;
        this.LLILLL.LLIZLLLIL.setValue(false);
        if (!Intrinsics.LJFF(defaultResponse.message, "success")) {
            k kVar = defaultResponse.data;
            if ((kVar instanceof n) && (nVar = (n) kVar) != null && (kVarLJJIIZ = nVar.LJJIIZ("error_code")) != null && (numValueOf = Integer.valueOf(kVarLJJIIZ.LJIIJJI())) != null && (8030 == numValueOf.intValue() || 8501 == numValueOf.intValue())) {
                this.LLILLL.LL.setValue(C1243080iSA.LIZ);
            } else {
                this.LLILLL.bu(ManageOrgPermissionsApi.LIZLLL(defaultResponse.data));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SentInvitePageViewModel@7b52.resendInvite$1$1");
            return unit;
        }
        SentInvitePageViewModel sentInvitePageViewModel = this.LLILLL;
        sentInvitePageViewModel.bu(C786410Ut5.j4(sentInvitePageViewModel.getApplication().getString(2131839022), Arrays.copyOf(new Object[]{this.LLILLL.LLJILJIL}, 1)));
        this.LLILLL.vQ2();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SentInvitePageViewModel@7b52.resendInvite$1$1");
        return unit2;
    }
}
