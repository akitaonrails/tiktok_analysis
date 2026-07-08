package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$onAuthStateUpdate$1", f = "FriendsEmptyPageMainSectionVM.kt", l = {311}, m = "invokeSuspend")
public final class C1387805bw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387805bw(FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = friendsEmptyPageMainSectionVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1387805bw(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageMainSectionVM@1270.onAuthStateUpdate$1");
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
            if (this.LLILLJJLI) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.onAuthStateUpdate$1");
                return unit;
            }
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("_FriendsEmpty", "onAuthStateUpdate");
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.LLILLL;
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(friendsEmptyPageMainSectionVM, 692);
            this.LL = 1;
            if (friendsEmptyPageMainSectionVM.zQ2(this, awS581S0100000_2, true) == objLJFF) {
                C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.onAuthStateUpdate$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.onAuthStateUpdate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
