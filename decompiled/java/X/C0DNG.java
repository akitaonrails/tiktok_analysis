package X;

import Y.AgS195S0200000_4;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DNG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem$subscribeRefreshStatus$$inlined$subscribeToAbility$default$3", f = "FindSchoolFriendsPageContainerAssem.kt", l = {1785, 1739}, m = "invokeSuspend")
public final class C0DNG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ FindSchoolFriendsPageContainerAssem LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ FindSchoolFriendsPageContainerAssem LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DNG(int i, FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, long j, InterfaceC1364105Vn interfaceC1364105Vn, FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem2) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = findSchoolFriendsPageContainerAssem;
        this.LLILZIL = j;
        this.LLILZLL = findSchoolFriendsPageContainerAssem2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DNG(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("FindSchoolFriendsPageContainerAssem@2e2e.subscribeRefreshStatus$$inlined$subscribeToAbility$default$3");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
        } else {
            C155000ia.LIZIZ(obj);
            i = 0;
        }
        while (i < this.LLILLL) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILZ), SchoolPostAbility.class, null);
            if (interfaceC494301wDLIZ != null) {
                SchoolPostAbility schoolPostAbility = (SchoolPostAbility) interfaceC494301wDLIZ;
                AnonymousClass0951 anonymousClass0951Yi1 = schoolPostAbility.Yi1();
                AgS195S0200000_4 agS195S0200000_4 = new AgS195S0200000_4(this.LLILZLL, schoolPostAbility, 10);
                this.LLILLJJLI = 1;
                if (anonymousClass0951Yi1.collect(agS195S0200000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.subscribeRefreshStatus$$inlined$subscribeToAbility$default$3");
                    return objLJFF;
                }
                throw new C2197108jB();
            }
            i++;
            if (i < this.LLILLL) {
                long j = this.LLILZIL;
                this.LL = i;
                this.LLILLJJLI = 2;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.subscribeRefreshStatus$$inlined$subscribeToAbility$default$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.subscribeRefreshStatus$$inlined$subscribeToAbility$default$3");
        return unit;
    }
}
