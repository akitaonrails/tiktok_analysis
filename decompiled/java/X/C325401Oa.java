package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoUserOtherResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.user.vm.TakoUserCardVM$fetchUserOther$1", f = "TakoUserCardVM.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT, 27}, m = "invokeSuspend")
public final class C325401Oa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<User, Integer, Unit> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C325401Oa(String str, Function2<? super User, ? super Integer, Unit> function2, int i, InterfaceC1364105Vn<? super C325401Oa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function2;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325401Oa(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoUserCardVM@6900.fetchUserOther$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoUserCardVM@6900.fetchUserOther$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            if (str == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TakoUserCardVM@6900.fetchUserOther$1");
                return unit2;
            }
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            this.LL = 1;
            obj = c1863980ybc.LJIILLIIL(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoUserCardVM@6900.fetchUserOther$1");
                return objLJFF;
            }
        }
        User user = ((TakoUserOtherResponse) obj).getUser();
        if (user != null) {
            Function2<User, Integer, Unit> function2 = this.LLILLL;
            int i2 = this.LLILZ;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C01OZ c01oz = new C01OZ(function2, user, i2, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c01oz) == objLJFF) {
                C1C7U.LIZIZ("TakoUserCardVM@6900.fetchUserOther$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoUserCardVM@6900.fetchUserOther$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
