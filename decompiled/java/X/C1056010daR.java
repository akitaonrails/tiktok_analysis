package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0daR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$syncContact$2", f = "FindFriendsPageVM.kt", l = {271}, m = "invokeSuspend")
public final class C1056010daR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FindFriendsPageVM LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<C1074840e4o> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056010daR(FindFriendsPageVM findFriendsPageVM, AnonymousClass0957<C1074840e4o> anonymousClass0957, String str, InterfaceC1364105Vn<? super C1056010daR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findFriendsPageVM;
        this.LLILLL = anonymousClass0957;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056010daR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.syncContact$2");
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
            FindFriendsPageVM findFriendsPageVM = this.LLILLJJLI;
            AnonymousClass0957<C1074840e4o> anonymousClass0957 = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            if (findFriendsPageVM.vQ2(str, this, anonymousClass0957) == objLJFF) {
                C1C7U.LIZIZ("FindFriendsPageVM@4a7b.syncContact$2");
                return objLJFF;
            }
        }
        if (Intrinsics.LJFF(this.LLILZ, "click")) {
            FindFriendsPageVM findFriendsPageVM2 = this.LLILLJJLI;
            C23250099c.LIZLLL(findFriendsPageVM2.getAssemVMScope(), C2108208Ns.LIZ, null, new C1056180dai(findFriendsPageVM2, EnumC1070410dxf.CONTACT, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.syncContact$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
