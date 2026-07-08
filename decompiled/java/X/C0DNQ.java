package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem$onViewCreated$11", f = "FindSchoolFriendsPageContainerAssem.kt", l = {804}, m = "invokeSuspend")
public final class C0DNQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FindSchoolFriendsPageContainerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DNQ(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, InterfaceC1364105Vn<? super C0DNQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findSchoolFriendsPageContainerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DNQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindSchoolFriendsPageContainerAssem@2e2e.onViewCreated$11");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(this.LLILLJJLI.LLLLIILL);
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 38);
            this.LL = 1;
            if (anonymousClass0951LIZIZ.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.onViewCreated$11");
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
