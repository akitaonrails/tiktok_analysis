package X;

import com.ss.android.ugc.aweme.nimblecard.tako.vm.Extra;
import com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM;
import com.ss.android.ugc.aweme.nimblecard.tako.vm.UserOtherResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01U3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM$fetchUserOther$1", f = "NimbleVM.kt", l = {27, 30}, m = "invokeSuspend")
public final class C01U3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ NimbleVM LLILLL;
    public final /* synthetic */ Function2<User, Integer, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01U3(String str, NimbleVM nimbleVM, Function2<? super User, ? super Integer, Unit> function2, int i, InterfaceC1364105Vn<? super C01U3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = nimbleVM;
        this.LLILZ = function2;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01U3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("NimbleVM@82c8.fetchUserOther$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NimbleVM@82c8.fetchUserOther$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str2 = this.LLILLJJLI;
            if (str2 == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("NimbleVM@82c8.fetchUserOther$1");
                return unit2;
            }
            C358401aI c358401aI = this.LLILLL.LL;
            this.LL = 1;
            obj = c358401aI.LIZ(str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NimbleVM@82c8.fetchUserOther$1");
                return objLJFF;
            }
        }
        UserOtherResponse userOtherResponse = (UserOtherResponse) obj;
        User user = userOtherResponse.getUser();
        if (user != null) {
            String str3 = this.LLILLJJLI;
            Function2<User, Integer, Unit> function2 = this.LLILZ;
            int i2 = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchUserOther ");
            sbLIZ.append(str3);
            sbLIZ.append(" fetched: isBlock = ");
            sbLIZ.append(user.isBlock);
            sbLIZ.append(" logid ");
            Extra extra = userOtherResponse.extra;
            if (extra != null) {
                str = extra.logid;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C340901Tz c340901Tz = new C340901Tz(function2, user, i2, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c340901Tz) == objLJFF) {
                C1C7U.LIZIZ("NimbleVM@82c8.fetchUserOther$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NimbleVM@82c8.fetchUserOther$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
