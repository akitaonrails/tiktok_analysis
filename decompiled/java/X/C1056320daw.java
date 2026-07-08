package X;

import Y.AgS204S0200000_16;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0daw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$subscribeGlobalAuthState$1$1", f = "FindFriendsPageVM.kt", l = {203}, m = "invokeSuspend")
public final class C1056320daw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1070340dxY LLILLJJLI;
    public final /* synthetic */ FindFriendsPageVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056320daw(EnumC1070340dxY enumC1070340dxY, FindFriendsPageVM findFriendsPageVM, InterfaceC1364105Vn<? super C1056320daw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1070340dxY;
        this.LLILLL = findFriendsPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056320daw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.subscribeGlobalAuthState$1$1");
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
            AgS204S0200000_16 agS204S0200000_16 = new AgS204S0200000_16(this.LLILLL, this.LLILLJJLI, 0);
            this.LL = 1;
            if (c01s9LJI.collect(agS204S0200000_16, this) == objLJFF) {
                C1C7U.LIZIZ("FindFriendsPageVM@4a7b.subscribeGlobalAuthState$1$1");
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
