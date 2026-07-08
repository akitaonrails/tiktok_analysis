package X;

import Y.AgS204S0200000_16;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM$subscribeAuthState$1$1", f = "FriendsEmptyPageRootVM.kt", l = {108}, m = "invokeSuspend")
public final class C1072230e0b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1070340dxY LLILLJJLI;
    public final /* synthetic */ FriendsEmptyPageRootVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072230e0b(EnumC1070340dxY enumC1070340dxY, FriendsEmptyPageRootVM friendsEmptyPageRootVM, InterfaceC1364105Vn<? super C1072230e0b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1070340dxY;
        this.LLILLL = friendsEmptyPageRootVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072230e0b(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageRootVM@299e.subscribeAuthState$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01S9<C1071570dzX> c01s9LJI = C1071540dzU.LIZIZ.LJI(this.LLILLJJLI);
            AgS204S0200000_16 agS204S0200000_16 = new AgS204S0200000_16(this.LLILLJJLI, this.LLILLL, 3);
            this.LL = 1;
            if (c01s9LJI.collect(agS204S0200000_16, this) == objLJFF) {
                C1C7U.LIZIZ("FriendsEmptyPageRootVM@299e.subscribeAuthState$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
