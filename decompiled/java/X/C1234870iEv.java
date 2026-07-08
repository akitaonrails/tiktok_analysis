package X;

import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysUserData;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0iEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel$getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1$1", f = "AvailableWaysViewModel.kt", l = {85}, m = "invokeSuspend")
public final class C1234870iEv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ Map<String, AvailableWaysViewModel.AvailableWays> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234870iEv(String str, C118300cf c118300cf, Map<String, AvailableWaysViewModel.AvailableWays> map, String str2, C118300cf c118300cf2, InterfaceC1364105Vn<? super C1234870iEv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c118300cf;
        this.LLILZ = map;
        this.LLILZIL = str2;
        this.LLILZLL = c118300cf2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234870iEv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AvailableWaysViewModel@9c.getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = twoStepAuthApi.LIZJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AvailableWaysViewModel@9c.getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1$1");
                return objLJFF;
            }
        }
        AvailableWaysResponse availableWaysResponse = (AvailableWaysResponse) obj;
        AvailableWaysUserData availableWaysUserData = availableWaysResponse.data;
        if (u.LJIJI("success", availableWaysResponse.message, true) && availableWaysUserData != null) {
            boolean zLJFF = Intrinsics.LJFF(availableWaysUserData.safe, true);
            Boolean bool = availableWaysUserData.has_mobile;
            Boolean bool2 = Boolean.TRUE;
            AvailableWaysViewModel.AvailableWays availableWays = new AvailableWaysViewModel.AvailableWays(Intrinsics.LJFF(bool, bool2), availableWaysUserData.mobile, Intrinsics.LJFF(availableWaysUserData.has_pwd, bool2), zLJFF);
            C118300cf c118300cf = this.LLILLL;
            if (!availableWays.hasMobile || availableWays.mobile == null) {
                i2 = 0;
            }
            c118300cf.element = i2;
            this.LLILZLL.element = availableWays.safe ? 1 : 0;
            this.LLILZ.put(this.LLILZIL, availableWays);
        } else {
            C118300cf c118300cf2 = this.LLILLL;
            if (c118300cf2.element != 2) {
                c118300cf2.element = 0;
            }
            this.LLILZ.put(this.LLILZIL, new AvailableWaysViewModel.AvailableWays(false, null, true, false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AvailableWaysViewModel@9c.getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
