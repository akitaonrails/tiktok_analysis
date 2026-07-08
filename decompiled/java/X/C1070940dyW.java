package X;

import Y.AgS297S0100000_16;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS225S0300000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$newAuthFlow$1", f = "AuthCardListScopeAbility.kt", l = {440}, m = "invokeSuspend")
public final class C1070940dyW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AuthCardListScopeAbility LLILLL;
    public final /* synthetic */ EnumC1070410dxf LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070940dyW(AuthCardListScopeAbility authCardListScopeAbility, EnumC1070410dxf enumC1070410dxf, Function0<Unit> function0, InterfaceC1364105Vn<? super C1070940dyW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = authCardListScopeAbility;
        this.LLILZ = enumC1070410dxf;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070940dyW c1070940dyW = new C1070940dyW(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1070940dyW.LLILLJJLI = obj;
        return c1070940dyW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthCardListScopeAbility@fdb1.newAuthFlow$1");
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
            C095D c095dLIZ = ((C1071200dyw) C1070250dxP.LIZ(C1385040m98.LIZIZ(C1262490ixT.LIZIZ(this.LLILLL.getConfig())), new AwS225S0300000_16((InterfaceC497601wk) this.LLILLJJLI, this.LLILLL, this.LLILZ, 13))).LIZ();
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILZIL, 21);
            this.LL = 1;
            if (c095dLIZ.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.newAuthFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.newAuthFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
