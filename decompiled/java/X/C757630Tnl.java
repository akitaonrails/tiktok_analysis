package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0Tnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity$buildEmailAuthDialog$1", f = "FindFriendsPageActivity.kt", l = {133}, m = "invokeSuspend")
public final class C757630Tnl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FindFriendsPageActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757630Tnl(FindFriendsPageActivity findFriendsPageActivity, InterfaceC1364105Vn<? super C757630Tnl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = findFriendsPageActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757630Tnl c757630Tnl = new C757630Tnl(this.LLILLL, interfaceC1364105Vn);
        c757630Tnl.LLILLJJLI = obj;
        return c757630Tnl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZIZ;
        C1C7U.LIZ("FindFriendsPageActivity@67f5.buildEmailAuthDialog$1");
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
            InterfaceC1264610j0t interfaceC1264610j0tLIZ = C1072350e0n.LIZ(this.LLILLL, new AwS595S0100000_16((InterfaceC497601wk) this.LLILLJJLI, 422));
            if (interfaceC1264610j0tLIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("FindFriendsPageActivity@67f5.buildEmailAuthDialog$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindFriendsPageActivity@67f5.buildEmailAuthDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
