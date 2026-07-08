package X;

import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolGroupsAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DNL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem$onCreateView$tabBar$1$1$onTabReselected$$inlined$subscribeToAbility$default$2", f = "FindSchoolFriendsPageContainerAssem.kt", l = {1739}, m = "invokeSuspend")
public final class C0DNL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ FindSchoolFriendsPageContainerAssem LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DNL(int i, FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = findSchoolFriendsPageContainerAssem;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DNL(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$tabBar$1$1$onTabReselected$$inlined$subscribeToAbility$default$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            i = 0;
        }
        while (true) {
            if (i >= this.LLILLL) {
                break;
            }
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), SchoolGroupsAbility.class, null);
            if (interfaceC494301wDLIZ != null) {
                ((SchoolGroupsAbility) interfaceC494301wDLIZ).LLZL(false);
                break;
            }
            i++;
            if (i < this.LLILLL) {
                long j = this.LLILZIL;
                this.LL = i;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$tabBar$1$1$onTabReselected$$inlined$subscribeToAbility$default$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$tabBar$1$1$onTabReselected$$inlined$subscribeToAbility$default$2");
        return unit;
    }
}
