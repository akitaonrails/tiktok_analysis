package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$tryUpdateSectionByUserCard$1", f = "FriendsEmptyPageMainSectionVM.kt", l = {326, 329, 333, 340}, m = "invokeSuspend")
public final class C1073700e2y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1075800e6M LLILLJJLI;
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073700e2y(C1075800e6M c1075800e6M, FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC1364105Vn<? super C1073700e2y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1075800e6M;
        this.LLILLL = friendsEmptyPageMainSectionVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1073700e2y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageMainSectionVM@1270.tryUpdateSectionByUserCard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new UserCard State: ");
            sbLIZ.append(this.LLILLJJLI);
            C1720106oR.LJI("_FriendsEmpty", C2188811AlT.LIZIZ(sbLIZ));
            C1075800e6M c1075800e6M = this.LLILLJJLI;
            AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
            if (abstractC1623806Xk instanceof C491101vh) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.LLILLL;
                AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(660);
                this.LL = 1;
                if (friendsEmptyPageMainSectionVM.zQ2(this, aFwS252S0000000_16, false) == objLJFF) {
                    C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.tryUpdateSectionByUserCard$1");
                    return objLJFF;
                }
            } else if (abstractC1623806Xk instanceof C1623706Xj) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM2 = this.LLILLL;
                AFwS252S0000000_16 aFwS252S0000000_162 = AFwS252S0000000_16.get$arr$(661);
                this.LL = 2;
                if (friendsEmptyPageMainSectionVM2.zQ2(this, aFwS252S0000000_162, false) == objLJFF) {
                    C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.tryUpdateSectionByUserCard$1");
                    return objLJFF;
                }
            } else if (abstractC1623806Xk instanceof C491001vg) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM3 = this.LLILLL;
                AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(friendsEmptyPageMainSectionVM3, 447);
                this.LL = 3;
                if (friendsEmptyPageMainSectionVM3.zQ2(this, awS595S0100000_16, false) == objLJFF) {
                    C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.tryUpdateSectionByUserCard$1");
                    return objLJFF;
                }
            } else if (abstractC1623806Xk instanceof C1623606Xi) {
                if (!(c1075800e6M.LIZJ instanceof C1623606Xi)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.tryUpdateSectionByUserCard$1");
                    return unit;
                }
                int iLIZIZ = c1075800e6M.LIZIZ();
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM4 = this.LLILLL;
                AwS124S0101000_16 awS124S0101000_16 = new AwS124S0101000_16(iLIZIZ, friendsEmptyPageMainSectionVM4, 22);
                this.LL = 4;
                if (friendsEmptyPageMainSectionVM4.zQ2(this, awS124S0101000_16, true) == objLJFF) {
                    C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.tryUpdateSectionByUserCard$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.tryUpdateSectionByUserCard$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
