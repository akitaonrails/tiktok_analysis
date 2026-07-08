package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment$subscribeSaveCampusResult$1", f = "SchoolUsersListFragment.kt", l = {357}, m = "invokeSuspend")
public final class C346110DhZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SchoolUsersListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346110DhZ(SchoolUsersListFragment schoolUsersListFragment, InterfaceC1364105Vn<? super C346110DhZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolUsersListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C346110DhZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951XJ1;
        C1C7U.LIZ("SchoolUsersListFragment@8bb9.subscribeSaveCampusResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ContainerAbility containerAbilityRR = this.LLILLJJLI.RR();
            if (containerAbilityRR != null && (anonymousClass0951XJ1 = containerAbilityRR.xJ1()) != null) {
                AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 55);
                this.LL = 1;
                if (anonymousClass0951XJ1.collect(agS285S0100000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("SchoolUsersListFragment@8bb9.subscribeSaveCampusResult$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SchoolUsersListFragment@8bb9.subscribeSaveCampusResult$1");
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
