package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessViewModel;
import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi;
import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApiResponse;
import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0tmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessViewModel$removePassword$1", f = "GoPasswordlessViewModel.kt", l = {169}, m = "invokeSuspend")
public final class C1678370tmF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GoPasswordlessViewModel LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678370tmF(GoPasswordlessViewModel goPasswordlessViewModel, Activity activity, InterfaceC1364105Vn<? super C1678370tmF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = goPasswordlessViewModel;
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1678370tmF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, X.0zEa] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, X.0zEa] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GoPasswordlessViewModel@2ac0.removePassword$1");
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
            obj = RemovePasswordApi.LIZ.LIZ(null, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GoPasswordlessViewModel@2ac0.removePassword$1");
                return objLJFF;
            }
        }
        RemovePasswordApiResponse removePasswordApiResponse = (RemovePasswordApiResponse) obj;
        if (!Intrinsics.LJFF(removePasswordApiResponse.message, "success")) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = EnumC1888140zEa.BASE_PAGE;
            RemovePasswordData removePasswordData = removePasswordApiResponse.data;
            if (removePasswordData != null && removePasswordData.errorCode == 2031) {
                c259800zU.element = EnumC1888140zEa.SHOW_ERROR_2SV_DIALOG;
            }
            this.LLILLJJLI.setState(new AwS604S0100000_25(c259800zU, (C259800zU<EnumC1888140zEa>) 73));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GoPasswordlessViewModel@2ac0.removePassword$1");
            return unit;
        }
        C2204961BRm.LJIILIIL(this.LLILLL, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFf9huRJl0Kdrg4wlX4C9sImXak/mSRH4e/UHZ9R1lBIzREmd", null));
        C1678420tmK.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        C20684815ws.LJIILLIIL("remove_password_success_show", c2344009Gk.LIZ);
        this.LLILLJJLI.setState(AFwS266S0000000_25.get$arr$(82));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GoPasswordlessViewModel@2ac0.removePassword$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
