package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment$subscribeContainerInfo$1", f = "SchoolFriendsBaseFragment.kt", l = {49}, m = "invokeSuspend")
public final class C0H2I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SchoolFriendsBaseFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2I(SchoolFriendsBaseFragment schoolFriendsBaseFragment, InterfaceC1364105Vn<? super C0H2I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolFriendsBaseFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H2I(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951DH0;
        C1C7U.LIZ("SchoolFriendsBaseFragment@94a6.subscribeContainerInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ContainerAbility containerAbility = (ContainerAbility) this.LLILLJJLI.LL.getValue();
            if (containerAbility != null && (anonymousClass0951DH0 = containerAbility.dH0()) != null) {
                AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 105);
                this.LL = 1;
                if (anonymousClass0951DH0.collect(agS287S0100000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("SchoolFriendsBaseFragment@94a6.subscribeContainerInfo$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SchoolFriendsBaseFragment@94a6.subscribeContainerInfo$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
