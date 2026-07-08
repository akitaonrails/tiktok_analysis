package X;

import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0e0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$onAuthSynced$1", f = "AuthCardListScopeAbility.kt", l = {189, 190, 192, 193}, m = "invokeSuspend")
public final class C1072360e0o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AuthCardListScopeAbility LLILLJJLI;
    public final /* synthetic */ EnumC1070410dxf LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072360e0o(AuthCardListScopeAbility authCardListScopeAbility, EnumC1070410dxf enumC1070410dxf, boolean z, boolean z2, InterfaceC1364105Vn<? super C1072360e0o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = authCardListScopeAbility;
        this.LLILLL = enumC1070410dxf;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072360e0o(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Object objLJFF;
        Object objLJFF2;
        C1C7U.LIZ("AuthCardListScopeAbility@fdb1.onAuthSynced$1");
        Object objLJFF3 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC1262510ixV abstractC1262510ixV = this.LLILLJJLI.getConfig().listConfig.LJ;
            if (!(abstractC1262510ixV instanceof C1262470ixR) && !Intrinsics.LJFF(abstractC1262510ixV, C1262420ixM.LJII)) {
                if (!(abstractC1262510ixV instanceof C1262330ixD) && !(abstractC1262510ixV instanceof C1262530ixX)) {
                    if (abstractC1262510ixV instanceof C1261850iwR) {
                        AuthCardListScopeAbility authCardListScopeAbility = this.LLILLJJLI;
                        boolean z = this.LLILZ;
                        boolean z2 = this.LLILZIL;
                        EnumC1070410dxf enumC1070410dxf = this.LLILLL;
                        this.LL = 2;
                        if (authCardListScopeAbility.LJI(z, z2, enumC1070410dxf, this) == objLJFF3) {
                            C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.onAuthSynced$1");
                            return objLJFF3;
                        }
                    } else if (!(abstractC1262510ixV instanceof C1260240itq) && !(abstractC1262510ixV instanceof C1260220ito)) {
                        if (abstractC1262510ixV instanceof C1262430ixN) {
                            AuthCardListScopeAbility authCardListScopeAbility2 = this.LLILLJJLI;
                            boolean z3 = this.LLILZ;
                            EnumC1070410dxf enumC1070410dxf2 = this.LLILLL;
                            this.LL = 4;
                            if (!z3) {
                                authCardListScopeAbility2.getClass();
                                objLJFF2 = Unit.LIZ;
                            } else {
                                authCardListScopeAbility2.LLIZ.invoke();
                                objLJFF2 = authCardListScopeAbility2.LJFF(enumC1070410dxf2, this, true);
                                if (objLJFF2 != C099R.LJFF()) {
                                    objLJFF2 = Unit.LIZ;
                                }
                            }
                            if (objLJFF2 == objLJFF3) {
                                C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.onAuthSynced$1");
                                return objLJFF3;
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        AuthCardListScopeAbility authCardListScopeAbility3 = this.LLILLJJLI;
                        EnumC1070410dxf enumC1070410dxf3 = this.LLILLL;
                        boolean z4 = this.LLILZ;
                        this.LL = 3;
                        Integer numRemove = authCardListScopeAbility3.LLJJ.remove(enumC1070410dxf3);
                        if (numRemove != null) {
                            iIntValue = numRemove.intValue();
                        } else {
                            Iterator<InterfaceC1262230ix3> it2 = C1263430iyz.LIZ(authCardListScopeAbility3.LLILLL).iterator();
                            iIntValue = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    InterfaceC1262230ix3 next = it2.next();
                                    if ((next instanceof C1261770iwJ) && ((C1261770iwJ) next).LL == enumC1070410dxf3) {
                                        break;
                                    }
                                    iIntValue++;
                                } else {
                                    iIntValue = -1;
                                    break;
                                }
                            }
                        }
                        if (z4 && iIntValue >= 0 && iIntValue <= authCardListScopeAbility3.LLILLL.size()) {
                            objLJFF = authCardListScopeAbility3.LIZIZ(iIntValue, enumC1070410dxf3, this);
                            if (objLJFF != C099R.LJFF()) {
                                objLJFF = Unit.LIZ;
                            }
                        } else {
                            objLJFF = authCardListScopeAbility3.LJFF(enumC1070410dxf3, this, z4);
                            if (objLJFF != C099R.LJFF()) {
                                objLJFF = Unit.LIZ;
                            }
                        }
                        if (objLJFF == objLJFF3) {
                            C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.onAuthSynced$1");
                            return objLJFF3;
                        }
                    }
                } else {
                    AuthCardListScopeAbility authCardListScopeAbility4 = this.LLILLJJLI;
                    EnumC1070410dxf enumC1070410dxf4 = this.LLILLL;
                    boolean z5 = this.LLILZ;
                    this.LL = 1;
                    if (authCardListScopeAbility4.LJFF(enumC1070410dxf4, this, z5) == objLJFF3) {
                        C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.onAuthSynced$1");
                        return objLJFF3;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.onAuthSynced$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
