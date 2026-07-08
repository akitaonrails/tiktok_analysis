package X;

import com.ss.android.ugc.aweme.account.login.v2.network.CheckNicknameResponse;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment$showNewBlueVDialog$1", f = "ProfileEditNicknameFragment.kt", l = {662, 663}, m = "invokeSuspend")
public final class C1231980iAG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileEditNicknameFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231980iAG(ProfileEditNicknameFragment profileEditNicknameFragment, InterfaceC1364105Vn<? super C1231980iAG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileEditNicknameFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1231980iAG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1232200iAc c1232200iAc = C1232200iAc.LIZ;
            String strNS = this.LLILLJJLI.nS();
            this.LL = 1;
            obj = c1232200iAc.LIZ(1, strNS, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1231970iAF c1231970iAF = new C1231970iAF(this.LLILLJJLI, (CheckNicknameResponse) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1231970iAF) == objLJFF) {
            C1C7U.LIZIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
