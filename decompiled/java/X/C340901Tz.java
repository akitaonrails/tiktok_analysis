package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM$fetchUserOther$1$1$1", f = "NimbleVM.kt", l = {}, m = "invokeSuspend")
public final class C340901Tz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<User, Integer, Unit> LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C340901Tz(Function2<? super User, ? super Integer, Unit> function2, User user, int i, InterfaceC1364105Vn<? super C340901Tz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = user;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C340901Tz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NimbleVM@82c8.fetchUserOther$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI, C2286608xc.LJ(this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NimbleVM@82c8.fetchUserOther$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
